package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1997i0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1999j0 f30196a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1997i0(C1999j0 c1999j0, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30196a = c1999j0;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1997i0(this.f30196a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C1997i0 c1997i0 = (C1997i0) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c1997i0.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        C1999j0 c1999j0 = this.f30196a;
        super/*com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e*/.destroy();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e bannerImpl = c1999j0.getBannerImpl();
        if (bannerImpl != null) {
            bannerImpl.destroy();
        }
        return C2515C.f34653a;
    }
}
