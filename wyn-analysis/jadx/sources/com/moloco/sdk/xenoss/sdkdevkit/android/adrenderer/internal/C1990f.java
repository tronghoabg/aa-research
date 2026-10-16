package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1990f extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1992g f30178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g f30180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1990f(C1992g c1992g, long j8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30178b = c1992g;
        this.f30179c = j8;
        this.f30180d = gVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1990f(this.f30178b, this.f30179c, this.f30180d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1990f) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30177a;
        C1992g c1992g = this.f30178b;
        if (i5 == 0) {
            Fe.e.U(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g gVar = c1992g.f30185c;
            this.f30177a = 1;
            Lf.e eVar = Ef.S.f3698a;
            obj = Ef.H.P(Jf.n.f6132a, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.f(gVar, c1992g.f30183a, this.f30179c, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        com.moloco.sdk.internal.A a5 = (com.moloco.sdk.internal.A) obj;
        boolean z2 = a5 instanceof com.moloco.sdk.internal.z;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar2 = this.f30180d;
        if (z2) {
            Hf.x0 x0Var = c1992g.f30186d;
            Boolean bool = Boolean.TRUE;
            x0Var.getClass();
            x0Var.k(null, bool);
            gVar2.a();
        } else {
            if (!(a5 instanceof com.moloco.sdk.internal.y)) {
                throw new E5.Q((byte) 0, 9);
            }
            gVar2.e((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((com.moloco.sdk.internal.y) a5).f29793a);
        }
        return C2515C.f34653a;
    }
}
