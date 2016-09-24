package org.yetanotherwebstack.esb.activemq.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.spi.ComponentResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.ConnectionFactory;

/**
 * A {@link ComponentResolver} for the {@link ActiveMQComponent}
 */
public class ActiveMQComponentResolver implements ComponentResolver {

    Logger LOGGER = LoggerFactory.getLogger(ActiveMQComponentResolver.class);

    private ConnectionFactory connectionFactory;

    public Component resolveComponent(String name, CamelContext camelContext)
            throws Exception {
        if (name.equals(ActiveMQComponent.NAME)) {
            LOGGER.info("Creating an instance of the ActiveMQComponent (" + name + ":)");
            return new ActiveMQComponent(camelContext, connectionFactory);
        }
        return null;
    }


    public ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

}
