package subParenExpression;

import java.util.ArrayList;

import Expressions.Expression;
import Expressions.ExpressionFactory;
import Expressions.ParenExpression;
import Parsers.VariableData;

import model.RGBColor;


public class NegParenExpression extends ParenExpression{

	public NegParenExpression(ArrayList<Expression> operands) {
		super(operands, "neg", "!");
		// TODO Auto-generated constructor stub
	}

	public RGBColor evaluate(VariableData parameterObject) {
		// TODO Auto-generated method stub
		RGBColor one = myOperands.get(0).evaluate(parameterObject);
		return new RGBColor(-one.getRed(), -one.getGreen(), -one.getBlue()); 
	}

	@Override
	public ParenExpression create(ArrayList<Expression> operands) {
		// TODO Auto-generated method stub
		return new NegParenExpression(operands);
	}
	

	
	public static ExpressionFactory getFactory() {
		// TODO Auto-generated method stub
		return new ExpressionFactory(new NegParenExpression(null));
	}
	
	
}
