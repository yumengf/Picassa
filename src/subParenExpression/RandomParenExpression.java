package subParenExpression;

import java.util.ArrayList;
import java.util.Random;

import Expressions.Expression;
import Expressions.ExpressionFactory;
import Expressions.ParenExpression;
import Parsers.VariableData;

import model.RGBColor;

public class RandomParenExpression extends ParenExpression {
	
	public RandomParenExpression(ArrayList<Expression> operands) {
		super (operands, "random");
	}
	@Override
	public RGBColor evaluate(VariableData parameterObject) {
		// TODO Auto-generated method stub
		Random r = new Random();
		return new RGBColor(r.nextDouble()*2 - 1,r.nextDouble()*2 - 1,r.nextDouble()*2 - 1);
	}

	@Override
	public ParenExpression create(ArrayList<Expression> operands) {
		// TODO Auto-generated method stub
		return new RandomParenExpression(operands);
	}
	
	public static ExpressionFactory getFactory() {
		// TODO Auto-generated method stub
		return new ExpressionFactory(new RandomParenExpression(null));
	}

}
