package GUI;

import helpers.ExcelHelpers;
import model.Steps;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class App {
    private JPanel panelMain;
    private JTextField txtFilePath;
    private JButton btnRun;
    private JTable tableTestCase;
    private ExcelHelpers excelHelpers;
    private List<Steps> stepsList;


    public App() {
        btnRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filePath = txtFilePath.getText();
                excelHelpers.setExcelFile(filePath,"Sheet1");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App automation test");
        frame.setContentPane(new App().panelMain);
        //quy định thoát chương trình khi đóng cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        //cửa sổ hiển thị ở giua màn hình
        frame.setLocationRelativeTo(null);
        //cho phép hiển thị ra màn hình
        frame.setVisible(true);
    }
}
