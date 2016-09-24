package org.yetanotherwebstack.esb.activemq.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsConfiguration;

import javax.jms.ConnectionFactory;

/**
 * A Camel component for ServiceMix which uses the
 * {@link org.apache.activemq.ActiveMQConnectionFactory} service for connecting to the correct
 * broker.
 */
public class ActiveMQComponent extends org.apache.activemq.camel.component.ActiveMQComponent {

    public static final String NAME = "activemq";

    public ActiveMQComponent(CamelContext camelContext, ConnectionFactory connectionFactory) {
        super(camelContext);
        setConfiguration(new JmsConfiguration(connectionFactory));
    }

}
