package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1989e0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f30086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1995h0 f30087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1989e0(C1995h0 c1995h0, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30087b = c1995h0;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C1989e0 c1989e0 = new C1989e0(this.f30087b, interfaceC3103c);
        c1989e0.f30086a = ((Boolean) obj).booleanValue();
        return c1989e0;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C1989e0 c1989e0 = (C1989e0) create(bool, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c1989e0.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        boolean z2 = this.f30086a;
        C1995h0 c1995h0 = this.f30087b;
        Boolean boolValueOf = Boolean.valueOf(z2);
        Hf.x0 x0Var = c1995h0.f30190a;
        x0Var.getClass();
        x0Var.k(null, boolValueOf);
        return C2515C.f34653a;
    }
}
