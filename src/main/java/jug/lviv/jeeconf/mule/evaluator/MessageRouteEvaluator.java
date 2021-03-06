package jug.lviv.jeeconf.mule.evaluator;


import jug.lviv.jeeconf.mule.transformer.ParseRequestTransformer;
import org.mule.api.MuleMessage;
import org.mule.api.expression.ExpressionEvaluator;
import org.mule.api.transport.PropertyScope;

public class MessageRouteEvaluator implements ExpressionEvaluator {

    public static final String MESSAGE_ROUTE_EVALUATOR = "MessageRouteEvaluator";
    public static final String FILE = "file";

    @Override
    public Object evaluate(String s, MuleMessage muleMessage) {
        boolean result = false;
        try {
            String saveTo = muleMessage.getProperty(ParseRequestTransformer.SAVE_TO, PropertyScope.SESSION);
            if (FILE.equalsIgnoreCase(saveTo)) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public String getName() {
        return MESSAGE_ROUTE_EVALUATOR;
    }
}
