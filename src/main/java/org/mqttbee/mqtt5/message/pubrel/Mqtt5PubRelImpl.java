package org.mqttbee.mqtt5.message.pubrel;

import org.mqttbee.annotations.NotNull;
import org.mqttbee.annotations.Nullable;
import org.mqttbee.api.mqtt5.message.Mqtt5PubRel;
import org.mqttbee.api.mqtt5.message.Mqtt5UTF8String;
import org.mqttbee.mqtt5.message.Mqtt5UTF8StringImpl;
import org.mqttbee.mqtt5.message.Mqtt5UserPropertiesImpl;

import java.util.Optional;

/**
 * @author Silvio Giebl
 */
public class Mqtt5PubRelImpl implements Mqtt5PubRel {

    @NotNull
    public static final Mqtt5PubRelReasonCode DEFAULT_REASON_CODE = Mqtt5PubRelReasonCode.SUCCESS;

    private final Mqtt5PubRelReasonCode reasonCode;
    private final Mqtt5UTF8StringImpl reasonString;
    private final Mqtt5UserPropertiesImpl userProperties;

    public Mqtt5PubRelImpl(
            @NotNull final Mqtt5PubRelReasonCode reasonCode, @Nullable final Mqtt5UTF8StringImpl reasonString,
            @NotNull final Mqtt5UserPropertiesImpl userProperties) {
        this.reasonCode = reasonCode;
        this.reasonString = reasonString;
        this.userProperties = userProperties;
    }

    @NotNull
    @Override
    public Mqtt5PubRelReasonCode getReasonCode() {
        return reasonCode;
    }

    @NotNull
    @Override
    public Optional<Mqtt5UTF8String> getReasonString() {
        return Optional.ofNullable(reasonString);
    }

    @Nullable
    public Mqtt5UTF8StringImpl getRawReasonString() {
        return reasonString;
    }

    @NotNull
    @Override
    public Mqtt5UserPropertiesImpl getUserProperties() {
        return userProperties;
    }

}
