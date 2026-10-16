package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1993g0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1999j0 f30188a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1993g0(C1999j0 c1999j0, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30188a = c1999j0;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1993g0(this.f30188a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1993g0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Bf.i iVar = y0.f32363a;
        C1999j0 c1999j0 = this.f30188a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVarA = y0.a(c1999j0.f30200h.f28864a);
        c1999j0.f30208q = lVarA;
        return lVarA;
    }
}
