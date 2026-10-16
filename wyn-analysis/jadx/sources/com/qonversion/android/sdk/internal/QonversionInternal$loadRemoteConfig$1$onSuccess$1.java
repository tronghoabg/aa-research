package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import tf.a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class QonversionInternal$loadRemoteConfig$1$onSuccess$1 extends AbstractC3343n implements a {
    final /* synthetic */ QonversionRemoteConfigCallback $callback;
    final /* synthetic */ QRemoteConfig $remoteConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QonversionInternal$loadRemoteConfig$1$onSuccess$1(QonversionRemoteConfigCallback qonversionRemoteConfigCallback, QRemoteConfig qRemoteConfig) {
        super(0);
        this.$callback = qonversionRemoteConfigCallback;
        this.$remoteConfig = qRemoteConfig;
    }

    @Override // tf.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m206invoke();
        return C2515C.f34653a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m206invoke() {
        this.$callback.onSuccess(this.$remoteConfig);
    }
}
