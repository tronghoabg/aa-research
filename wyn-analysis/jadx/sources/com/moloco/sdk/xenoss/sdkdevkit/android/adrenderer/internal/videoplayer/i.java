package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import E5.I;
import Ef.E;
import Ef.H;
import Hf.x0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class i extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f32229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f32230b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32230b = jVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new i(this.f32230b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((i) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f32229a;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Fe.e.U(obj);
        do {
            j jVar = this.f32230b;
            I i10 = jVar.f32245p;
            if (i10 != null) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n(i10.m0(), i10.r0());
                x0 x0Var = jVar.f32236f;
                x0Var.getClass();
                x0Var.k(null, nVar);
            }
            this.f32229a = 1;
        } while (H.m(500L, this) != aVar);
        return aVar;
    }
}
