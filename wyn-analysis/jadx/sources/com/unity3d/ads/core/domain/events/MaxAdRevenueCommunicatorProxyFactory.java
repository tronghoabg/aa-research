package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.reflection.CommunicatorSubscriberProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/events/MaxAdRevenueCommunicatorProxyFactory;", "", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/ads/core/log/Logger;)V", "create", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy;", "communicatorId", "", "topic", "messageListener", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MaxAdRevenueCommunicatorProxyFactory {

    @NotNull
    private final Logger logger;

    public MaxAdRevenueCommunicatorProxyFactory(@NotNull Logger logger) {
        AbstractC3340k.e(logger, "logger");
        this.logger = logger;
    }

    @NotNull
    public final CommunicatorSubscriberProxy create(@NotNull String communicatorId, @NotNull String topic, @NotNull CommunicatorSubscriberProxy.CommunicatorMessageListener messageListener) {
        AbstractC3340k.e(communicatorId, "communicatorId");
        AbstractC3340k.e(topic, "topic");
        AbstractC3340k.e(messageListener, "messageListener");
        return new CommunicatorSubscriberProxy(communicatorId, topic, messageListener, this.logger);
    }
}
