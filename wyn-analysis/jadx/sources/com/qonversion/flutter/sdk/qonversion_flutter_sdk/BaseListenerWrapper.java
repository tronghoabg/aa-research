package com.qonversion.flutter.sdk.qonversion_flutter_sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uc.C4273j;
import uc.InterfaceC4269f;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "eventChannelPostfix", "", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V", "eventChannel", "Lio/flutter/plugin/common/EventChannel;", "eventStreamHandler", "Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;", "getEventStreamHandler", "()Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;", "setEventStreamHandler", "(Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;)V", "register", "", "unregister", "qonversion_flutter_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BaseListenerWrapper {

    @NotNull
    private final InterfaceC4269f binaryMessenger;

    @Nullable
    private C4273j eventChannel;

    @NotNull
    private final String eventChannelPostfix;

    @Nullable
    private BaseEventStreamHandler eventStreamHandler;

    public BaseListenerWrapper(@NotNull InterfaceC4269f binaryMessenger, @NotNull String eventChannelPostfix) {
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        AbstractC3340k.e(eventChannelPostfix, "eventChannelPostfix");
        this.binaryMessenger = binaryMessenger;
        this.eventChannelPostfix = eventChannelPostfix;
    }

    @Nullable
    public final BaseEventStreamHandler getEventStreamHandler() {
        return this.eventStreamHandler;
    }

    public final void register() {
        this.eventStreamHandler = new BaseEventStreamHandler();
        C4273j c4273j = new C4273j(this.binaryMessenger, "qonversion_flutter_" + this.eventChannelPostfix);
        c4273j.a(this.eventStreamHandler);
        this.eventChannel = c4273j;
    }

    public final void setEventStreamHandler(@Nullable BaseEventStreamHandler baseEventStreamHandler) {
        this.eventStreamHandler = baseEventStreamHandler;
    }

    public final void unregister() {
        C4273j c4273j = this.eventChannel;
        if (c4273j != null) {
            c4273j.a(null);
        }
        this.eventStreamHandler = null;
        this.eventChannel = null;
    }
}
