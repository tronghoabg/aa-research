package com.qonversion.flutter.sdk.qonversion_flutter_sdk;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "<init>", "()V", "eventSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "getEventSink", "()Lio/flutter/plugin/common/EventChannel$EventSink;", "setEventSink", "(Lio/flutter/plugin/common/EventChannel$EventSink;)V", "onListen", "", "arguments", "", "events", "onCancel", "qonversion_flutter_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BaseEventStreamHandler implements InterfaceC4272i {

    @Nullable
    private InterfaceC4270g eventSink;

    @Nullable
    public final InterfaceC4270g getEventSink() {
        return this.eventSink;
    }

    @Override // uc.InterfaceC4272i
    public void onCancel(@Nullable Object arguments) {
        this.eventSink = null;
    }

    @Override // uc.InterfaceC4272i
    public void onListen(@Nullable Object obj, @Nullable InterfaceC4270g interfaceC4270g) {
        this.eventSink = interfaceC4270g;
    }

    public final void setEventSink(@Nullable InterfaceC4270g interfaceC4270g) {
        this.eventSink = interfaceC4270g;
    }
}
