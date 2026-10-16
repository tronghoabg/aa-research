package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$3 extends AbstractC3343n implements l {
    final /* synthetic */ QonversionError $error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$3(QonversionError qonversionError) {
        super(1);
        this.$error = qonversionError;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((QonversionRemoteConfigCallback) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@NotNull QonversionRemoteConfigCallback fireToCallbacks) {
        AbstractC3340k.e(fireToCallbacks, "$this$fireToCallbacks");
        fireToCallbacks.onError(this.$error);
    }
}
