package com.unity3d.ads.core.domain;

import Ef.K;
import Fe.e;
import ef.C2515C;
import ef.C2530n;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lef/n;", "Lef/C;", "it", "<anonymous>", "(Lef/n;)V"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$1$2", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AndroidAdRefresh$invoke$3$1$1$2 extends AbstractC3471j implements p {
    final /* synthetic */ K $showing;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$1$2(K k, InterfaceC3103c<? super AndroidAdRefresh$invoke$3$1$1$2> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.$showing = k;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new AndroidAdRefresh$invoke$3$1$1$2(this.$showing, interfaceC3103c);
    }

    @Override // tf.p
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((C2530n) obj).f34674a, (InterfaceC3103c<? super C2515C>) obj2);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kf.a aVar = kf.a.f39711a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.U(obj);
        this.$showing.cancel(null);
        return C2515C.f34653a;
    }

    @Nullable
    public final Object invoke(@NotNull Object obj, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
        return ((AndroidAdRefresh$invoke$3$1$1$2) create(new C2530n(obj), interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }
}
