package unit4;
import javax.swing.*;
public class Ex2 {
public static void main(String [] args)
{
	Object [] options = {"Ok", "Cancel"};
	JOptionPane.showOptionDialog(null, "Nhan Ok de tiep tuc", " warning", JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options);
}
}
