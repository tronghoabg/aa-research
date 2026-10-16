package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import E.AbstractC0419i;
import E.C0412b;
import N.C0718d;
import N.C0732k;
import N.C0740o;
import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import h0.AbstractC2765c;
import ka.AbstractC3230e0;
import r0.InterfaceC3909n;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import u0.InterfaceC4193p0;
import x0.C4435e;

/* loaded from: classes4.dex */
public final class N implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f30837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f30838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tf.a f30839c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f30841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f30842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f30843g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f30844h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f30845i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC2765c f30846j;

    public N(float f10, String str, tf.a aVar, boolean z2, boolean z10, String str2, long j8, long j10, long j11, AbstractC2765c abstractC2765c) {
        this.f30837a = f10;
        this.f30838b = str;
        this.f30839c = aVar;
        this.f30840d = z2;
        this.f30841e = z10;
        this.f30842f = str2;
        this.f30843g = j8;
        this.f30844h = j10;
        this.f30845i = j11;
        this.f30846j = abstractC2765c;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C0740o c0740o = (C0740o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0740o.x()) {
            c0740o.I();
        } else {
            E.x xVar = E.L.f2700a;
            float f10 = 10;
            float f11 = 6;
            Z.k kVarG = new E.M(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f30837a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.NaN, 5).g(new E.E(f10, f11, f10, f11));
            M.e eVarA = M.s.a(c0740o, 6, 6);
            c0740o.M(1151230561);
            Object objF = c0740o.F();
            if (objF == C0732k.f7800a) {
                objF = new D.i();
                c0740o.U(objF);
            }
            c0740o.p(false);
            C4435e c4435e = new C4435e(0);
            String str = this.f30838b;
            Z.k kVarQ = com.moloco.sdk.internal.publisher.H.Q(kVarG, (D.i) objF, eVarA, false, str, c4435e, this.f30839c, 4);
            C0412b c0412b = AbstractC0419i.f2745c;
            c0740o.M(693286680);
            InterfaceC3909n interfaceC3909nA = E.J.a(c0412b, c0740o);
            c0740o.M(-1323940314);
            L0.b bVar = (L0.b) c0740o.j(u0.M.f46143e);
            L0.i iVar = (L0.i) c0740o.j(u0.M.k);
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(u0.M.f46152o);
            InterfaceC4055c.g9.getClass();
            C4056d c4056d = C4054b.f45453b;
            V.d dVarY = S3.f.y(kVarQ);
            c0740o.O();
            if (c0740o.f7843O) {
                c0740o.k(c4056d);
            } else {
                c0740o.X();
            }
            c0740o.f7867x = false;
            C0718d.M(c0740o, interfaceC3909nA, C4054b.f45456e);
            C0718d.M(c0740o, bVar, C4054b.f45455d);
            C0718d.M(c0740o, iVar, C4054b.f45457f);
            wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
            c0740o.M(-678309503);
            String str2 = this.f30842f;
            long j8 = this.f30843g;
            V.d dVarB = V.e.b(c0740o, -618324232, new M(str2, j8, this.f30844h));
            V.d dVarB2 = V.e.b(c0740o, 367056260, new L(this.f30845i, this.f30846j, str, j8));
            boolean z2 = this.f30840d;
            boolean z10 = this.f30841e;
            if (z2) {
                c0740o.M(774006835);
                dVarB.invoke(c0740o, 6);
                if (z10) {
                    AbstractC3230e0.b(c0740o, E.L.f(4));
                    dVarB2.invoke(c0740o, 6);
                }
                c0740o.p(false);
            } else {
                c0740o.M(774193331);
                c0740o.M(717711159);
                if (z10) {
                    dVarB2.invoke(c0740o, 6);
                    AbstractC3230e0.b(c0740o, E.L.f(4));
                }
                c0740o.p(false);
                dVarB.invoke(c0740o, 6);
                c0740o.p(false);
            }
            wg.b.e(c0740o, false, false, true, false);
            c0740o.p(false);
        }
        return C2515C.f34653a;
    }
}
