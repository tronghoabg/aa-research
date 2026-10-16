package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import N.C0732k;
import N.C0740o;
import ef.C2515C;
import ka.AbstractC3230e0;
import kotlin.reflect.KFunction;

/* loaded from: classes4.dex */
public final class H implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2121s f31743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.u f31744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tf.s f31745c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.t f31746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.u f31747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S f31748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y f31749g;

    public H(C2121s c2121s, tf.u uVar, tf.s sVar, tf.t tVar, tf.u uVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S s10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y yVar) {
        this.f31743a = c2121s;
        this.f31744b = uVar;
        this.f31745c = sVar;
        this.f31746d = tVar;
        this.f31747e = uVar2;
        this.f31748f = s10;
        this.f31749g = yVar;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x xVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x) obj;
        C0740o c0740o = (C0740o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c0740o.e(xVar) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            boolean z2 = xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t;
            Z.i iVar = Z.i.f16922a;
            C2121s c2121s = this.f31743a;
            if (z2) {
                c0740o.M(1864274575);
                com.moloco.sdk.internal.publisher.H.M(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t) xVar).f31656a, c2121s != null ? c2121s.f31925b : null, E.L.a(iVar), c0740o, 384);
                c0740o.p(false);
            } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v) {
                c0740o.M(1864282292);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h hVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v) xVar).f31660a;
                tf.a aVar = c2121s != null ? c2121s.f31924a : null;
                Z.k kVarA = E.L.a(iVar);
                c0740o.M(1864293899);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y yVar = this.f31749g;
                boolean zE = c0740o.e(yVar);
                Object objF = c0740o.F();
                if (zE || objF == C0732k.f7800a) {
                    S8.d dVar = new S8.d(0, yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y.class, "onReplay", "onReplay()V", 0, 19);
                    c0740o.U(dVar);
                    objF = dVar;
                }
                c0740o.p(false);
                AbstractC3230e0.e(hVar, aVar, kVarA, this.f31744b, this.f31745c, this.f31746d, this.f31747e, this.f31748f, (tf.a) ((KFunction) objF), c0740o, 384);
                c0740o.p(false);
            } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u) {
                c0740o.M(1864296834);
                gc.b.d(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u) xVar).f31658a, c2121s != null ? c2121s.f31926c : null, this.f31746d, E.L.a(iVar), c0740o, 3072);
                c0740o.p(false);
            } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.w) {
                c0740o.M(1958901854);
                c0740o.p(false);
            } else {
                if (xVar != null) {
                    c0740o.M(1864273346);
                    c0740o.p(false);
                    throw new E5.Q((byte) 0, 9);
                }
                c0740o.M(1958940170);
                c0740o.p(false);
            }
        }
        return C2515C.f34653a;
    }
}
