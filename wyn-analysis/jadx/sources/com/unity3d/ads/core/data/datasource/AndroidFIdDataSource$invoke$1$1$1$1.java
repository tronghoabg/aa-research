package com.unity3d.ads.core.data.datasource;

import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.Nullable;
import tf.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "id", "Lef/C;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AndroidFIdDataSource$invoke$1$1$1$1 extends AbstractC3343n implements l {
    final /* synthetic */ InterfaceC3103c<String> $cont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidFIdDataSource$invoke$1$1$1$1(InterfaceC3103c<? super String> interfaceC3103c) {
        super(1);
        this.$cont = interfaceC3103c;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@Nullable String str) {
        this.$cont.resumeWith(str);
    }
}
