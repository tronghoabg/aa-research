package com.unity3d.services.core.network.core;

import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import okhttp3.Call;
import org.jetbrains.annotations.Nullable;
import tf.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class OkHttp3Client$execute$2$1 extends AbstractC3343n implements l {
    final /* synthetic */ Call $call;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttp3Client$execute$2$1(Call call) {
        super(1);
        this.$call = call;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@Nullable Throwable th) {
        this.$call.cancel();
    }
}
