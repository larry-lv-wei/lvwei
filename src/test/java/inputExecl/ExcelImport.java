package inputExecl;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

import java.util.ArrayList;

import java.util.Date;

import java.util.HashMap;

import java.util.List;

import java.util.Map;




/**
 * @Description : TODO导入excel
 * @date : Mar 31, 2018 5:17:14 PM
 */


public class ExcelImport {

    public static void main(String args[]){
        ExcelImport  excelImport = new ExcelImport();

        try {
            excelImport.importExcelAction();

        } catch (Exception e) {
            // TODO Auto-generated catch block

            e.printStackTrace();

        }

    }

    //导入Excel数据

    public void importExcelAction() throws Exception {

        //文件路径

        String filePath ="C:/Users/daojia/Desktop/test.xlsx";

        XSSFWorkbook wookbook = new XSSFWorkbook(new FileInputStream(filePath));

        XSSFSheet sheet = wookbook.getSheet("Sheet1");

        //获取到Excel文件中的所有行数

        int rows = sheet.getPhysicalNumberOfRows();

        //遍历行

        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();

        for (int i = 1; i < rows; i++) {
            // 读取左上端单元格

            XSSFRow row = sheet.getRow(i);

            // 行不为空

            if (row != null) {
                Map<String,Object> map = new HashMap<String,Object>();

                //获取到Excel文件中的所有的列

                int cells = row.getPhysicalNumberOfCells();

                //姓名

                XSSFCell nameCell =row.getCell(1);

                String name = getValue(nameCell);

                //性别

                XSSFCell sexCell =row.getCell(2);

                String sex = getValue(sexCell);

                //年龄

                XSSFCell ageCell =row.getCell(3);

                String age = getValue(ageCell);

                //出生年月

                XSSFCell birthCell =row.getCell(4);

               // String birth = DateBuilder.convertDateToString(birthCell.getDateCellValue(), "yyyy-MM-dd");

                map.put("name", name);

                map.put("sex", sex);

                map.put("age", age);

               // map.put("birth", birth);

                list.add(map);

            }

        }

       // System.out.println("list = "+JSON.toJSONString(list));

    }

    private String getValue(XSSFCell xSSFCell){
        if(null == xSSFCell){
            return "";

        }

        if (xSSFCell.getCellType() == xSSFCell.CELL_TYPE_BOOLEAN) {

            // 返回布尔类型的值

            return String.valueOf(xSSFCell.getBooleanCellValue());

        } else if (xSSFCell.getCellType() == xSSFCell.CELL_TYPE_NUMERIC) {

            // 返回数值类型的值

            return String.valueOf(xSSFCell.getNumericCellValue());

        } else {

            // 返回字符串类型的值

            return String.valueOf(xSSFCell.getStringCellValue());

        }

    }}