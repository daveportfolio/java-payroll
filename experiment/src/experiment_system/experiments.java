package experiment_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.TextField;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class experiments {

	private JFrame frame;
	private JTextField txtEmployeeRefNo;
	private JTextField txtEmployeeName;
	private JTextField txtEmployeeAddress;
	private JTextField txtPostcode;
	private JTextField txtInnerCity;
	private JTextField txtBasicSalary;
	private JTextField txtEmployerName;
	private JTextField txtOverTime;
	private JTextField txtGrossPay;
	private JTextField txtPensionablePay;
	private JTextField txtNetPay;
	private JTextArea rtfPaySlip; 
	

	private JTextField txtPayDate;
	private JTextField txtNiNumber;
	private JTextField txtTax;
	private JTextField txtPension;
	private JTextField txtStudentLoan;
	private JTextField txtNiPayment;
	private JTextField txtTaxablePay;
	private JTextField txtDeductions;
	
	double InnerCity;
	double BasicWage;
	double OverTime;
	double Gross;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					experiments window = new experiments();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public experiments() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
		
		});
		frame.getContentPane().setBackground(SystemColor.scrollbar);
		frame.setBounds(0, 0, 1370, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Ref. No.");
		lblNewLabel.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblNewLabel.setBounds(241, 139, 141, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeName.setBounds(241, 173, 141, 23);
		frame.getContentPane().add(lblEmployeeName);
		
		JLabel lblEmployeeAddress = new JLabel("Employee Address:");
		lblEmployeeAddress.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress.setBounds(241, 207, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress);
		
		JLabel lblPostCode = new JLabel("Post Code:");
		lblPostCode.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblPostCode.setBounds(241, 241, 141, 23);
		frame.getContentPane().add(lblPostCode);
		
		JLabel lblEmployeeAddress_2 = new JLabel("Inner City Weighting:");
		lblEmployeeAddress_2.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_2.setBounds(241, 360, 179, 23);
		frame.getContentPane().add(lblEmployeeAddress_2);
		
		JLabel lblEmployeeAddress_3 = new JLabel("Basic Salary:");
		lblEmployeeAddress_3.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3.setBounds(241, 394, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3);
		
		txtEmployeeRefNo = new JTextField();
		txtEmployeeRefNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtEmployeeRefNo.setBounds(405, 139, 126, 20);
		frame.getContentPane().add(txtEmployeeRefNo);
		txtEmployeeRefNo.setColumns(10);
		
		txtEmployeeName = new JTextField();
		txtEmployeeName.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtEmployeeName.setColumns(10);
		txtEmployeeName.setBounds(405, 173, 126, 20);
		frame.getContentPane().add(txtEmployeeName);
		
		txtEmployeeAddress = new JTextField();
		txtEmployeeAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtEmployeeAddress.setColumns(10);
		txtEmployeeAddress.setBounds(405, 207, 126, 20);
		frame.getContentPane().add(txtEmployeeAddress);
		
		txtPostcode = new JTextField();
		txtPostcode.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPostcode.setColumns(10);
		txtPostcode.setBounds(405, 241, 72, 20);
		frame.getContentPane().add(txtPostcode);
		
		txtInnerCity = new JTextField();
		txtInnerCity.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtInnerCity.setColumns(10);
		txtInnerCity.setBounds(405, 360, 126, 20);
		frame.getContentPane().add(txtInnerCity);
		
		txtBasicSalary = new JTextField();
		txtBasicSalary.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtBasicSalary.setColumns(10);
		txtBasicSalary.setBounds(405, 394, 126, 20);
		frame.getContentPane().add(txtBasicSalary);
		
		JButton btnNewButton = new JButton("Net Wages");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double A00, A30, B40, C50, D60, E70, F80, G90,PensionablePay, TaxablePay;
				double Deduction, Pension, StudentLoan, NiPayment, TotalDeduction, NetPay;
				
				InnerCity = Double.parseDouble(txtInnerCity.getText());
				BasicWage = Double.parseDouble(txtBasicSalary.getText());
				OverTime = Double.parseDouble(txtOverTime.getText());
				Gross = InnerCity + BasicWage + OverTime;
				
				String sGrossPay = String.format("$%.2f",Gross);
			txtGrossPay.setText(sGrossPay);
			
			
			
			
			try {
				
				JComboBox cmbNiCode;
				if (cmbNiCode.getSelectedItem().equals("A000")) {
					A00 = (Gross * 9)/100;
					Deduction = Gross - A00;
					Pension = (Deduction * 12)/100;
					
					StudentLoan = Pension + A00;
					StudentLoan = Gross - StudentLoan;
					StudentLoan = (StudentLoan * 5.9)/100;
					
					NiPayment = StudentLoan + Pension + A00;
					NiPayment = Gross - NiPayment;
					NiPayment = (NiPayment * 4.2)/100;
					
					String TaxPaid = String.format("%.2f", A00);
					txtTax.setText(TaxPaid);
					txtTax.setText("$" + TaxPaid);
					
					String PensionPaid = String.format("%.2f", Pension);
					txtPension.setText(PensionPaid);
					txtPension.setText("$" + PensionPaid);
					
					String StudentLoanPaid = String.format("%.2f", StudentLoan);
					txtStudentLoan.setText(StudentLoanPaid);
					txtStudentLoan.setText("$" + StudentLoanPaid);
					
					String NiPaymentPaid = String.format("%.2f", NiPayment);
					txtNiPayment.setText(NiPaymentPaid);
					txtNiPayment.setText("$" + NiPaymentPaid);
					
					TotalDeduction = A00 + Pension + StudentLoan + NiPayment;
					NetPay = Gross - TotalDeduction;
					
					String TDeduction = String.format("%.2f", TotalDeduction);
					txtDeductions.setText(TDeduction);
					txtDeductions.setText("$" + TDeduction);
					
					String TNetPay = String.format("%.2f", NetPay);
					txtNetPay.setText(TNetPay);
					txtNetPay.setText("$" + TNetPay);
					
					
					String TaxPeriod = cmbTaxPeriod.getSelectedItem().toString();
					TaxablePay = Double.parseDouble(TaxPeriod);
					PensionablePay = TaxablePay * Pension;
					TaxablePay = TaxablePay * A00;
					

					String PensionPayment = String.format("%.2f", PensionablePay);
					txtPensionablePay.setText(PensionPayment);
					txtPensionablePay.setText("$" + PensionPayment);
					

					String TaxablePayPayment = String.format("%.2f", TaxablePay);
					txtTaxablePay.setText(TaxablePayPayment);
					txtTaxablePay.setText("$" + TaxablePayPayment);
					
					
					
					
				}
				
				txtGrossPay.setText("$" + sGrossPay);
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Enter a valid number", "Payroll System", 
						JOptionPane.INFORMATION_MESSAGE);
			}
			
			String sInnerCity = String.format("$%.2f",InnerCity);
			txtInnerCity.setText(sInnerCity);
				
			String sBasicWage = String.format("$%.2f",BasicWage);
			txtBasicSalary.setText(sBasicWage);
			
			String sOverTime = String.format("$%.2f",sOverTime);
			txtOverTime.setText(sOverTime);
			
			
			}
			
		});
		btnNewButton.setBounds(242, 647, 140, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPaySlip = new JButton("Pay Slip");
		btnPaySlip.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPaySlip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rtfPaySlip.append("Oamen's Aviation");
				rtfPaySlip.append("Emp.Ref: " + txtEmployeeRefNo.getText() + "Pay Date: " + txtPayDate.getText() + "\n");
				rtfPaySlip.append("Emp.Name: " + txtEmployeeName.getText() + "Tax Paid: " + txtTax.getText() + "\n");
				rtfPaySlip.append("Inner City: " + txtInnerCity.getText() + "Student Loan: " + txtStudentLoan.getText() + "\n");
				rtfPaySlip.append("Basic Salary: " + txtBasicSalary.getText() + "NI Payment: " + txtNiPayment.getText() + "\n");
				rtfPaySlip.append("Over Time: " + txtOverTime.getText() + "Pensionable Pay: " + txtPensionablePay.getText() + "\n");
				rtfPaySlip.append("Gross Pay: " + txtGrossPay.getText() + "Taxable Pay: " + txtTaxablePay.getText() + "\n");
				rtfPaySlip.append("Pension Paid: " + txtPension.getText() + "Deductions: " + txtDeductions.getText() + "\n");
				JComboBox cmbNiCode;
				rtfPaySlip.append("Net Pay: " + txtNetPay.getText() + "Tax Paid: " + cmbNiCode.getSelectedItem() + "\n");
				
				
				
			}
		});
		btnPaySlip.setBounds(442, 647, 140, 39);
		frame.getContentPane().add(btnPaySlip);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
				
				txtPayDate.setText(null);
				txtEmployeeName.setText(null);
				txtEmployerName.setText(null);
				txtEmployeeAddress.setText(null);
				txtEmployeeRefNo.setText(null);
				txtPostcode.setText(null);
				txtInnerCity.setText(null);
				txtBasicSalary.setText(null);
				txtOverTime.setText(null);
				txtGrossPay.setText(null);
				txtPensionablePay.setText(null);
				txtNetPay.setText(null);
				rtfPaySlip.setText(null);
				
				
				
			}
		});
		btnReset.setBounds(731, 647, 140, 39);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to log-out", "Payroll Systems", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(907, 647, 140, 39);
		frame.getContentPane().add(btnExit);
		
		JTextArea rtfPaySlip = new JTextArea();
		rtfPaySlip.setBounds(1055, 140, 289, 356);
		frame.getContentPane().add(rtfPaySlip);
		
		JLabel lblEmployersName = new JLabel("Employer's Name:");
		lblEmployersName.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployersName.setBounds(241, 105, 141, 23);
		frame.getContentPane().add(lblEmployersName);
		
		txtEmployerName = new JTextField();
		txtEmployerName.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtEmployerName.setColumns(10);
		txtEmployerName.setBounds(405, 105, 126, 20);
		frame.getContentPane().add(txtEmployerName);
		
		JLabel lblEmployeeAddress_3_1 = new JLabel("Over Time:");
		lblEmployeeAddress_3_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1.setBounds(241, 425, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1);
		
		txtOverTime = new JTextField();
		txtOverTime.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtOverTime.setColumns(10);
		txtOverTime.setBounds(405, 425, 126, 20);
		frame.getContentPane().add(txtOverTime);
		
		JLabel lblEmployeeAddress_3_1_1 = new JLabel("Gross  Pay:");
		lblEmployeeAddress_3_1_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1.setBounds(241, 459, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1);
		
		JLabel lblEmployeeAddress_3_1_1_1 = new JLabel("Pensionable Pay:");
		lblEmployeeAddress_3_1_1_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1.setBounds(241, 493, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1);
		
		JLabel lblEmployeeAddress_3_1_1_1_1 = new JLabel("Net Pay:");
		lblEmployeeAddress_3_1_1_1_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1_1.setBounds(241, 527, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1_1);
		
		txtGrossPay = new JTextField();
		txtGrossPay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtGrossPay.setColumns(10);
		txtGrossPay.setBounds(405, 464, 126, 20);
		frame.getContentPane().add(txtGrossPay);
		
		txtPensionablePay = new JTextField();
		txtPensionablePay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPensionablePay.setColumns(10);
		txtPensionablePay.setBounds(405, 495, 126, 20);
		frame.getContentPane().add(txtPensionablePay);
		
		txtNetPay = new JTextField();
		txtNetPay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNetPay.setColumns(10);
		txtNetPay.setBounds(405, 530, 126, 20);
		frame.getContentPane().add(txtNetPay);
		
		JLabel lblEmployeeAddress_3_1_1_1_1_1 = new JLabel("Pay Date:");
		lblEmployeeAddress_3_1_1_1_1_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1_1_1.setBounds(731, 105, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1_1_1);
		
		txtPayDate = new JTextField();
		txtPayDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPayDate.setColumns(10);
		txtPayDate.setBounds(870, 105, 126, 20);
		frame.getContentPane().add(txtPayDate);
		
		JLabel lblEmployeeAddress_3_1_1_1_1_1_1 = new JLabel("Tax Period:");
		lblEmployeeAddress_3_1_1_1_1_1_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1_1_1_1.setBounds(731, 139, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1_1_1_1);
		
		JLabel lblEmployeeAddress_3_1_1_1_1_1_1_1 = new JLabel("Tax Code:");
		lblEmployeeAddress_3_1_1_1_1_1_1_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1_1_1_1_1.setBounds(731, 173, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1_1_1_1_1);
		
		JLabel lblEmployeeAddress_3_1_1_1_1_1_1_2 = new JLabel("NI Code:");
		lblEmployeeAddress_3_1_1_1_1_1_1_2.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1_1_1_1_2.setBounds(731, 207, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1_1_1_1_2);
		
		JLabel lblEmployeeAddress_3_1_1_1_1_1_1_3 = new JLabel("NI Number:");
		lblEmployeeAddress_3_1_1_1_1_1_1_3.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1_1_1_1_3.setBounds(731, 241, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1_1_1_1_3);
		
		JComboBox cmbTaxPeriod = new JComboBox();
		cmbTaxPeriod.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		cmbTaxPeriod.setBounds(870, 141, 126, 22);
		frame.getContentPane().add(cmbTaxPeriod);
		
		JComboBox cmbTaxCode = new JComboBox();
		cmbTaxCode.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "E", "F", "G"}));
		cmbTaxCode.setBounds(870, 175, 126, 22);
		frame.getContentPane().add(cmbTaxCode);
		
		JComboBox cmbNiCode = new JComboBox();
		cmbNiCode.setModel(new DefaultComboBoxModel(new String[] {"A0000", "A3000", "B4000", "C5000", "D6000", "E7000", "F8000", "G9000"}));
		cmbNiCode.setBounds(870, 209, 126, 22);
		frame.getContentPane().add(cmbNiCode);
		
		txtNiNumber = new JTextField();
		txtNiNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNiNumber.setColumns(10);
		txtNiNumber.setBounds(870, 241, 126, 20);
		frame.getContentPane().add(txtNiNumber);
		
		JLabel lblEmployeeAddress_3_1_1_1_1_1_1_3_1 = new JLabel("Tax:");
		lblEmployeeAddress_3_1_1_1_1_1_1_3_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1_1_1_1_3_1.setBounds(731, 360, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1_1_1_1_3_1);
		
		JLabel lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1 = new JLabel("Pension:");
		lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1.setBounds(731, 394, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1);
		
		JLabel lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1 = new JLabel("Student Loan:");
		lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1.setBounds(731, 430, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTax.setColumns(10);
		txtTax.setBounds(870, 360, 126, 20);
		frame.getContentPane().add(txtTax);
		
		txtPension = new JTextField();
		txtPension.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPension.setColumns(10);
		txtPension.setBounds(870, 394, 126, 20);
		frame.getContentPane().add(txtPension);
		
		txtStudentLoan = new JTextField();
		txtStudentLoan.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtStudentLoan.setColumns(10);
		txtStudentLoan.setBounds(870, 430, 126, 20);
		frame.getContentPane().add(txtStudentLoan);
		
		JLabel lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1_1 = new JLabel("NI Payment:");
		lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1_1.setBounds(731, 464, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1_1);
		
		JLabel lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1_1_1 = new JLabel("Taxable Pay:");
		lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1_1_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1_1_1.setBounds(731, 498, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1_1_1);
		
		JLabel lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1_1_1_1 = new JLabel("Deductions:");
		lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1_1_1_1.setFont(new Font("Ink Free", Font.PLAIN, 18));
		lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1_1_1_1.setBounds(731, 532, 141, 23);
		frame.getContentPane().add(lblEmployeeAddress_3_1_1_1_1_1_1_3_1_1_1_1_1_1);
		
		txtNiPayment = new JTextField();
		txtNiPayment.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNiPayment.setColumns(10);
		txtNiPayment.setBounds(870, 464, 126, 20);
		frame.getContentPane().add(txtNiPayment);
		
		txtTaxablePay = new JTextField();
		txtTaxablePay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTaxablePay.setColumns(10);
		txtTaxablePay.setBounds(870, 498, 126, 20);
		frame.getContentPane().add(txtTaxablePay);
		
		txtDeductions = new JTextField();
		txtDeductions.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDeductions.setColumns(10);
		txtDeductions.setBounds(870, 532, 126, 20);
		frame.getContentPane().add(txtDeductions);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 1354, 55);
		frame.getContentPane().add(panel);
		
		JLabel lblPayrollSystem = new JLabel("Payroll System");
		lblPayrollSystem.setFont(new Font("Ink Free", Font.PLAIN, 22));
		panel.add(lblPayrollSystem);
	}
}
