package org.mqttbee.api.mqtt5.message;

import org.mqttbee.annotations.DoNotImplement;
import org.mqttbee.annotations.NotNull;
import org.mqttbee.mqtt.MqttBuilderUtil;
import org.mqttbee.mqtt.datatypes.MqttUserPropertyImpl;

/**
 * MQTT User Property according to the MQTT 5 specification.
 * <p>
 * A User Property consists of a name and value UTF-8 encoded String Pair.
 *
 * @author Silvio Giebl
 */
@DoNotImplement
public interface Mqtt5UserProperty {

    /**
     * Creates an User Property of the given name and value.
     *
     * @param name  the name of the User Property.
     * @param value the value of the User Property.
     * @return the created User Property.
     */
    @NotNull
    static Mqtt5UserProperty of(@NotNull final String name, @NotNull final String value) {
        return MqttUserPropertyImpl.of(MqttBuilderUtil.string(name), MqttBuilderUtil.string(value));
    }

    /**
     * Creates an User Property of the given name and value.
     *
     * @param name  the name of the User Property.
     * @param value the value of the User Property.
     * @return the created User Property.
     */
    @NotNull
    static Mqtt5UserProperty of(@NotNull final Mqtt5UTF8String name, @NotNull final Mqtt5UTF8String value) {
        return MqttUserPropertyImpl.of(MqttBuilderUtil.string(name), MqttBuilderUtil.string(value));
    }

    /**
     * @return the name of this User Property.
     */
    @NotNull
    Mqtt5UTF8String getName();

    /**
     * @return the value of this User Property.
     */
    @NotNull
    Mqtt5UTF8String getValue();

}
