package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2100c;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2069g extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31371a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2069g(2, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2069g) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31371a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Hf.j0 j0Var = VastActivity.f31299e;
            C2100c c2100c = new C2100c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.f30099b);
            this.f31371a = 1;
            if (j0Var.emit(c2100c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
