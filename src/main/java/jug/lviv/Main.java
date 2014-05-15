package jug.lviv;


import org.mule.api.MuleContext;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationBuilder;
import org.mule.config.spring.SpringXmlConfigurationBuilder;
import org.mule.context.DefaultMuleContextFactory;

public class Main {

    public static void main(String[] args) throws MuleException {

        String[] congigs = new String[]{ "demoflow.xml", "demoflow_common.xml", "properties-configurator.xml"};


        final ConfigurationBuilder builder = new SpringXmlConfigurationBuilder(congigs);
        final MuleContext context = new DefaultMuleContextFactory().createMuleContext(builder);
        context.start();
    }
}
