import java.util.Stack;

class Test {

    public static String evaluate(String expression) {
        char[] tokens = expression.toCharArray();
        String operators = "+-*/";

        Stack<Integer> values = new Stack<Integer>();
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ')
                continue;
            if (Character.isDigit(tokens[i])) {
                StringBuffer valueBuffer = new StringBuffer();
                while (i < tokens.length && Character.isDigit(tokens[i]))
                    valueBuffer.append(tokens[i++]);
                values.push(Integer.parseInt(valueBuffer.toString()));
                i--;
            } else if (tokens[i] == '(') {
                ops.push(tokens[i]);
            } else if (tokens[i] == ')') {
                while (ops.peek() != '(')
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            } else if (operators.indexOf(tokens[i]) != -1) {
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.push(tokens[i]);
            }
        }
        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        return values.pop().toString();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        return true;
    }

    public static int applyOp(char op, int b, int a) {
        switch (op) {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                throw new UnsupportedOperationException("Cannot divide by zero");
            return a / b;
        }
        return 0;
    }

    public double add(String equation1, String equation2) {
        String a = evaluate(equation1);
        String b = evaluate(equation2);
        String c = a + "+" + b;
        double ans = Double.parseDouble(evaluate(c));
        return ans;
    }
}

public class Main {
    public static void main(String args[]) {
        Test ob = new Test();
        System.out.println(ob.add("2*3", "(10/5)*2"));
        System.out.println(ob.add("200+10", "(10-5)*2"));
    }
}