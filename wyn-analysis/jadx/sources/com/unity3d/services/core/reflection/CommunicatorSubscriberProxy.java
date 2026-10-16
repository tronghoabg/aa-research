package com.unity3d.services.core.reflection;

import A7.AbstractC0279p0;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.core.log.Logger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy;", "Lcom/unity3d/services/core/reflection/GenericListenerProxy;", "", "communicatorId", "topic", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;", "messageListener", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;Lcom/unity3d/ads/core/log/Logger;)V", "", PglCryptUtils.KEY_MESSAGE, "Lef/C;", "handleMessage", "(Ljava/lang/Object;)V", "Ljava/lang/Class;", "getProxyClass", "()Ljava/lang/Class;", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/String;", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;", "Lcom/unity3d/ads/core/log/Logger;", "Companion", "CommunicatorMessageListener", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommunicatorSubscriberProxy extends GenericListenerProxy {

    @NotNull
    private static final String GET_COMMUNICATOR_ID = "getCommunicatorId";

    @NotNull
    private static final String MESSAGE_CLASS = "com.applovin.communicator.AppLovinCommunicatorMessage";

    @NotNull
    private static final String ON_MESSAGE_RECEIVED = "onMessageReceived";

    @NotNull
    private static final String SUBSCRIBER_CLASS = "com.applovin.communicator.AppLovinCommunicatorSubscriber";

    @NotNull
    private final String communicatorId;

    @NotNull
    private final Logger logger;

    @NotNull
    private final CommunicatorMessageListener messageListener;

    @NotNull
    private final String topic;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;", "", "Landroid/os/Bundle;", "messageData", "Lef/C;", CommunicatorSubscriberProxy.ON_MESSAGE_RECEIVED, "(Landroid/os/Bundle;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface CommunicatorMessageListener {
        void onMessageReceived(@NotNull Bundle messageData);
    }

    public CommunicatorSubscriberProxy(@NotNull String communicatorId, @NotNull String topic, @NotNull CommunicatorMessageListener messageListener, @NotNull Logger logger) {
        AbstractC3340k.e(communicatorId, "communicatorId");
        AbstractC3340k.e(topic, "topic");
        AbstractC3340k.e(messageListener, "messageListener");
        AbstractC3340k.e(logger, "logger");
        this.communicatorId = communicatorId;
        this.topic = topic;
        this.messageListener = messageListener;
        this.logger = logger;
    }

    private final void handleMessage(Object message) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            int i5 = AppLovinCommunicatorMessage.f20733b;
            Object objInvoke = AppLovinCommunicatorMessage.class.getMethod("getTopic", new Class[0]).invoke(message, new Object[0]);
            if (AbstractC3340k.a(this.topic, objInvoke instanceof String ? (String) objInvoke : null)) {
                Object objInvoke2 = AppLovinCommunicatorMessage.class.getMethod("getMessageData", new Class[0]).invoke(message, new Object[0]);
                if (objInvoke2 instanceof Bundle) {
                    this.messageListener.onMessageReceived((Bundle) objInvoke2);
                }
            }
        } catch (Exception e7) {
            this.logger.trace("Failed to handle proxy communicator message", e7);
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    @NotNull
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return AppLovinCommunicatorSubscriber.class;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    @Nullable
    public Object invoke(@NotNull Object proxy, @NotNull Method m10, @Nullable Object[] args) throws Throwable {
        AbstractC3340k.e(proxy, "proxy");
        AbstractC3340k.e(m10, "m");
        String name = m10.getName();
        if (name != null) {
            boolean z2 = false;
            switch (name.hashCode()) {
                case -1776922004:
                    if (name.equals("toString")) {
                        return AbstractC0279p0.n(new StringBuilder("CommunicatorSubscriber("), this.communicatorId, ')');
                    }
                    break;
                case -1437096151:
                    if (name.equals(ON_MESSAGE_RECEIVED) && args != null && args.length != 0) {
                        handleMessage(args[0]);
                    }
                    return null;
                case -1295482945:
                    if (name.equals("equals")) {
                        if (args != null && args.length == 1 && proxy == args[0]) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                    break;
                case 147696667:
                    if (name.equals("hashCode")) {
                        return Integer.valueOf(System.identityHashCode(proxy));
                    }
                    break;
                case 1974057286:
                    if (name.equals(GET_COMMUNICATOR_ID)) {
                        return this.communicatorId;
                    }
                    break;
            }
        }
        return null;
    }
}
