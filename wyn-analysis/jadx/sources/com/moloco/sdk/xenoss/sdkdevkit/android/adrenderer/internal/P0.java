package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.ortb.model.C1908w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.C2013h;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import p7.AbstractC3772b;

/* loaded from: classes4.dex */
public final class P0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public C2013h f30014a;

    /* renamed from: b, reason: collision with root package name */
    public int f30015b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q0 f30017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g f30018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f30019f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(Q0 q02, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30017d = q02;
        this.f30018e = gVar;
        this.f30019f = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        P0 p02 = new P0(this.f30017d, this.f30018e, this.f30019f, interfaceC3103c);
        p02.f30016c = obj;
        return p02;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((P0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Ef.m0] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6, types: [Ef.K, Ef.m0] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Object objP;
        C1908w c1908w;
        com.moloco.sdk.internal.ortb.model.h0 h0Var;
        com.moloco.sdk.internal.ortb.model.F f10;
        Object objAwait;
        C2013h c2013h;
        Q0 q02;
        kf.a aVar = kf.a.f39711a;
        ?? r22 = this.f30015b;
        C2515C c2515c = C2515C.f34653a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar = this.f30018e;
        Q0 q03 = this.f30017d;
        try {
            if (r22 == 0) {
                Fe.e.U(obj);
                Ef.E e7 = (Ef.E) this.f30016c;
                if (q03.f30030g instanceof com.moloco.sdk.internal.z) {
                    gVar.a();
                    return c2515c;
                }
                Ef.L lH = Ef.H.h(e7, null, new O0(this.f30019f, q03, null), 3);
                C1906u c1906u = q03.f30025b;
                Ef.L lH2 = Ef.H.h(e7, null, new M0(this.f30019f, (c1906u == null || (c1908w = c1906u.f28867d) == null || (h0Var = c1908w.f28872a) == null || (f10 = h0Var.f28828i) == null) ? null : AbstractC3772b.a(f10), this.f30017d, null), 3);
                this.f30016c = lH2;
                this.f30015b = 1;
                objP = lH.p(this);
                r22 = lH2;
                if (objP == aVar) {
                }
                return aVar;
            }
            if (r22 != 1) {
                if (r22 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2013h = this.f30014a;
                Q0 q04 = (Q0) this.f30016c;
                Fe.e.U(obj);
                q02 = q04;
                objAwait = obj;
                c2013h.getClass();
                com.moloco.sdk.internal.z zVar = new com.moloco.sdk.internal.z(new C2013h((z0) objAwait));
                q02.getClass();
                q02.f30030g = zVar;
                Hf.x0 x0Var = q03.f30028e;
                Boolean bool = Boolean.TRUE;
                x0Var.getClass();
                x0Var.k(null, bool);
                gVar.a();
                return c2515c;
            }
            Ef.K k = (Ef.K) this.f30016c;
            Fe.e.U(obj);
            objP = obj;
            r22 = k;
            com.moloco.sdk.internal.A a5 = (com.moloco.sdk.internal.A) objP;
            if (a5 == null) {
                gVar.w(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f30089b);
                return c2515c;
            }
            if (a5 instanceof com.moloco.sdk.internal.y) {
                gVar.e((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((com.moloco.sdk.internal.y) a5).f29793a);
                r22.cancel(null);
                return c2515c;
            }
            if (!(a5 instanceof com.moloco.sdk.internal.z)) {
                throw new E5.Q((byte) 0, 9);
            }
            C2013h c2013h2 = (C2013h) ((com.moloco.sdk.internal.z) a5).f29794a;
            this.f30016c = q03;
            this.f30014a = c2013h2;
            this.f30015b = 2;
            objAwait = r22.await(this);
            if (objAwait != aVar) {
                c2013h = c2013h2;
                q02 = q03;
                c2013h.getClass();
                com.moloco.sdk.internal.z zVar2 = new com.moloco.sdk.internal.z(new C2013h((z0) objAwait));
                q02.getClass();
                q02.f30030g = zVar2;
                Hf.x0 x0Var2 = q03.f30028e;
                Boolean bool2 = Boolean.TRUE;
                x0Var2.getClass();
                x0Var2.k(null, bool2);
                gVar.a();
                return c2515c;
            }
            return aVar;
        } catch (Ef.L0 unused) {
            r22.cancel(null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f30092e;
            com.moloco.sdk.internal.y yVar = new com.moloco.sdk.internal.y(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30105e);
            q03.getClass();
            q03.f30030g = yVar;
            gVar.w(aVar2);
            return c2515c;
        }
    }
}
