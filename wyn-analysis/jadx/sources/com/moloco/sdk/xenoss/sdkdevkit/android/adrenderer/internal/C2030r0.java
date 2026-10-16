package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2030r0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f30499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2030r0(s0 s0Var, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30499a = s0Var;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2030r0(this.f30499a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2030r0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Bf.i iVar = y0.f32363a;
        s0 s0Var = this.f30499a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVarA = y0.a(s0Var.f30504c.f28864a);
        s0Var.f30508g = lVarA;
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AggregatedFullscreenAd", "Native ad resolved creativeType: " + lVarA, false, 4, null);
        return lVarA;
    }
}
