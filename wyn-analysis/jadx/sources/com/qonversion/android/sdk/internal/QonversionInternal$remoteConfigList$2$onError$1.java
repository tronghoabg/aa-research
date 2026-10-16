package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import tf.a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class QonversionInternal$remoteConfigList$2$onError$1 extends AbstractC3343n implements a {
    final /* synthetic */ QonversionRemoteConfigListCallback $callback;
    final /* synthetic */ QonversionError $error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QonversionInternal$remoteConfigList$2$onError$1(QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback, QonversionError qonversionError) {
        super(0);
        this.$callback = qonversionRemoteConfigListCallback;
        this.$error = qonversionError;
    }

    @Override // tf.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m220invoke();
        return C2515C.f34653a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m220invoke() {
        this.$callback.onError(this.$error);
    }
}
