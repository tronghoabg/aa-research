package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1985c0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1995h0 f30072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1999j0 f30073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g f30075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1985c0(C1995h0 c1995h0, C1999j0 c1999j0, long j8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30072b = c1995h0;
        this.f30073c = c1999j0;
        this.f30074d = j8;
        this.f30075e = gVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1985c0(this.f30072b, this.f30073c, this.f30074d, this.f30075e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1985c0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30071a;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f30071a = 1;
            if (C1995h0.b(this.f30072b, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        C1999j0 c1999j0 = this.f30073c;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e bannerImpl = c1999j0.getBannerImpl();
        if (bannerImpl != null) {
            bannerImpl.a(this.f30074d, new X2.j(11, this.f30075e, c1999j0));
        }
        return C2515C.f34653a;
    }
}
