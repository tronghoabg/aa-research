package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1991f0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f30181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1999j0 f30182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1991f0(C1999j0 c1999j0, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30182b = c1999j0;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C1991f0 c1991f0 = new C1991f0(this.f30182b, interfaceC3103c);
        c1991f0.f30181a = ((Boolean) obj).booleanValue();
        return c1991f0;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C1991f0 c1991f0 = (C1991f0) create(bool, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c1991f0.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        boolean z2 = this.f30181a;
        Hf.x0 x0Var = this.f30182b.f30214w;
        Boolean boolValueOf = Boolean.valueOf(z2);
        x0Var.getClass();
        x0Var.k(null, boolValueOf);
        return C2515C.f34653a;
    }
}
