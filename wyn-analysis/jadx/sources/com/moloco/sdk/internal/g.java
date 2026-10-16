package com.moloco.sdk.internal;

import E.F;
import Ef.C0507p0;
import Hf.v0;
import N.C0732k;
import N.C0740o;
import N.P;
import com.moloco.sdk.internal.ortb.model.C1894h;
import com.moloco.sdk.internal.ortb.model.D;
import com.wynauto.wyn.R;
import e0.C2465q;
import ef.C2515C;
import ff.AbstractC2641B;
import h0.AbstractC2765c;
import kotlin.reflect.KFunction;

/* loaded from: classes4.dex */
public final class g implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28521a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28523c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28524d;

    public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y yVar, tf.c cVar, boolean z2) {
        this.f28523c = yVar;
        this.f28524d = cVar;
        this.f28522b = z2;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        V.d dVarB;
        switch (this.f28521a) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o.M(1846302992);
                if (this.f28522b) {
                    dVarB = null;
                } else {
                    C1894h c1894h = (C1894h) this.f28523c;
                    float f10 = c1894h.f28815c;
                    long jB = A6.c.b(f10, f10);
                    Z.d dVarB2 = i.b(c1894h.f28816d, c1894h.f28817e);
                    float f11 = c1894h.f28814b;
                    F f12 = new F(f11, f11, f11, f11);
                    long jE = Fe.b.E(c1894h.f28815c);
                    Fe.b.j(jE);
                    long jM = Fe.b.M(1095216660480L & jE, L0.j.c(jE) / 2);
                    AbstractC2765c abstractC2765cH = AbstractC2641B.H(R.drawable.moloco_close, c0740o);
                    long jC = L0.f.c(jB, 0.45f);
                    C2465q c2465q = c1894h.f28819g;
                    dVarB = Ba.c.b(dVarB2, f12, c1894h.f28818f, jB, jM, Ba.c.c(abstractC2765cH, jC, c2465q != null ? c2465q.f34382a : i.f28531b, c0740o, 4), (D) this.f28524d, c0740o, 64);
                    c0740o = c0740o;
                }
                c0740o.p(false);
                return dVarB;
            default:
                C0740o c0740o2 = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0740o2.x()) {
                    c0740o2.I();
                } else {
                    v0 v0VarL = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y) this.f28523c).l();
                    c0740o2.M(328190741);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y yVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y) this.f28523c;
                    boolean zE = c0740o2.e(yVar);
                    Object objF = c0740o2.F();
                    P p10 = C0732k.f7800a;
                    if (zE || objF == p10) {
                        S8.d dVar = new S8.d(0, yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0, 12);
                        c0740o2.U(dVar);
                        objF = dVar;
                    }
                    c0740o2.p(false);
                    tf.a aVar = (tf.a) ((KFunction) objF);
                    c0740o2.M(328192462);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y yVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y) this.f28523c;
                    boolean zE2 = c0740o2.e(yVar2);
                    Object objF2 = c0740o2.F();
                    if (zE2 || objF2 == p10) {
                        C0507p0 c0507p0 = new C0507p0(1, yVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0, 5);
                        c0740o2.U(c0507p0);
                        objF2 = c0507p0;
                    }
                    c0740o2.p(false);
                    tg.b.b(v0VarL, aVar, (tf.l) ((KFunction) objF2), (tf.c) this.f28524d, this.f28522b, c0740o2, 0);
                }
                return C2515C.f34653a;
        }
    }

    public g(boolean z2, C1894h c1894h, D d3) {
        this.f28522b = z2;
        this.f28523c = c1894h;
        this.f28524d = d3;
    }
}
