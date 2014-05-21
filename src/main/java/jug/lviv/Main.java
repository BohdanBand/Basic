package jug.lviv;


import org.mule.api.MuleContext;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationBuilder;
import org.mule.config.spring.SpringXmlConfigurationBuilder;
import org.mule.context.DefaultMuleContextFactory;

public class Main {

    public static void main(String[] args) throws MuleException {

        String[] configs = new String[]{"demoflow.xml"};

        final ConfigurationBuilder builder = new SpringXmlConfigurationBuilder(configs);
        final MuleContext context = new DefaultMuleContextFactory().createMuleContext(builder);
        context.start();
    }
}
