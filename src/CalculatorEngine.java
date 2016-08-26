import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener{
	Calculator parent; // ссылка на Calculator
	
	char selectedAction = ' '; // +, -, /, или *
	double currentResult =0;  
	
	CalculatorEngine(Calculator parent){    // Конструктор сохраняет ссылку на окно калькулятора

	this.parent = parent;		                           // в переменной класса “parent”

	
	
}
	public void actionPerformed(ActionEvent e){
		
			// Получить источник текущего действия
			JButton clickedButton = (JButton) e.getSource();
			// Получить текущий текст из поля вывода (“дисплея”)
			// калькулятора
			String dispFieldText = parent.displayField.getText();
			double displayValue=0;
			// Получить число из дисплея калькулятора,
			// если он не пустой.
			// Восклицательный знак – это оператор отрицания
			if (!"".equals(dispFieldText)){
			displayValue= Double.parseDouble(dispFieldText);
			}
			Object src = e.getSource();
			// Для каждой кнопки арифметического действия
			// запомнить его: +, -, /, или *, сохранить текущее число
			// в переменной currentResult, и очистить дисплей
			// для ввода нового числа
			if (src == parent.buttonPlus){
				selectedAction='+';
				currentResult=displayValue;
				parent.displayField.setText("");			
			} else if (src == parent.buttonMinus) {
				selectedAction='-';
				currentResult=displayValue;
				parent.displayField.setText("");
			} else if (src == parent.buttonMultipliсation) {
				selectedAction='*';
				currentResult=displayValue;
				parent.displayField.setText("");				
			} else if (src == parent.buttonDivision) {
				selectedAction='÷';
				currentResult=displayValue;
				parent.displayField.setText("");
			} else if (src == parent.buttonEqual) {
				// Совершить арифметическое действие, в зависимости
				// от selectedAction, обновить переменную currentResult
				// и показать результат на дисплее
			   if (selectedAction == '+') {
				   currentResult=currentResult+displayValue;
				// Сконвертировать результат в строку, добавляя его
				// к пустой строке и показать его
				   parent.displayField.setText(""+currentResult);
					   } else  if (selectedAction == '-') {
						   currentResult=currentResult-displayValue;
						   parent.displayField.setText(""+currentResult);
					   } else if (selectedAction == '*') {
						   currentResult=currentResult*displayValue;				
						   parent.displayField.setText(""+currentResult);
					   } else if (selectedAction == '÷') {
						   currentResult=currentResult/displayValue;
						   parent.displayField.setText(""+currentResult);
						   
					   }
			} else {
				// Для всех цифровых кнопок присоединить надпись на
				// кнопке к надписи в дисплее
				String cklickedButtonLabel = clickedButton.getText();
				parent.displayField.setText(dispFieldText+cklickedButtonLabel);
				
			}
			}
			
			
			
		}
