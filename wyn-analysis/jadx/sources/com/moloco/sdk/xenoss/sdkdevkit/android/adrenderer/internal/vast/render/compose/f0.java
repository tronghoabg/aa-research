package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class f0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o f31878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f31879b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o oVar, boolean z2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31878a = oVar;
        this.f31879b = z2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new f0(this.f31878a, this.f31879b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        f0Var.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j jVar = this.f31878a.f32261a;
        boolean z2 = this.f31879b;
        jVar.f32243n = z2;
        E5.I i5 = jVar.f32245p;
        if (i5 != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j.b(i5, z2);
        }
        return C2515C.f34653a;
    }
}
