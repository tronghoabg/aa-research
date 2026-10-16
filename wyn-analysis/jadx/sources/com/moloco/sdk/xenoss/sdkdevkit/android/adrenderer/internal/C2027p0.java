package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2027p0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f30483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f30484b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2027p0(s0 s0Var, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30484b = s0Var;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2027p0 c2027p0 = new C2027p0(this.f30484b, interfaceC3103c);
        c2027p0.f30483a = ((Boolean) obj).booleanValue();
        return c2027p0;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C2027p0 c2027p0 = (C2027p0) create(bool, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2027p0.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        boolean z2 = this.f30483a;
        s0 s0Var = this.f30484b;
        Boolean boolValueOf = Boolean.valueOf(z2);
        Hf.x0 x0Var = s0Var.f30515o;
        x0Var.getClass();
        x0Var.k(null, boolValueOf);
        return C2515C.f34653a;
    }
}
