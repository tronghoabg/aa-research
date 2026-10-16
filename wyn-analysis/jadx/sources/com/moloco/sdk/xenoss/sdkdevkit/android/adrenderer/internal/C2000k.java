package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.widget.FrameLayout;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2000k extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2002l f30217b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2000k(C2002l c2002l, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30217b = c2002l;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2000k c2000k = new C2000k(this.f30217b, interfaceC3103c);
        c2000k.f30216a = obj;
        return c2000k;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2000k c2000k = (C2000k) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2000k.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Ef.E e7 = (Ef.E) this.f30216a;
        C2002l c2002l = this.f30217b;
        Ef.H.D(e7, null, new C1996i(c2002l, null), 3);
        Ef.H.D(e7, null, new C1998j(c2002l, null), 3);
        c2002l.f30223l.getClass();
        FrameLayout frameLayoutA = ae.b.a(c2002l.f30219g, c2002l.f30221i);
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) c2002l.getWatermark()).b(frameLayoutA);
        c2002l.setAdView(frameLayoutA);
        return C2515C.f34653a;
    }
}
