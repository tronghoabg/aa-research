package com.moloco.sdk.internal;

import E.F;
import Ef.C0507p0;
import N.C0732k;
import N.C0740o;
import N.P;
import android.content.Intent;
import com.moloco.sdk.internal.ortb.model.C1894h;
import com.moloco.sdk.internal.ortb.model.D;
import com.moloco.sdk.internal.ortb.model.Z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import e0.C2465q;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KFunction;

/* loaded from: classes4.dex */
public final class f implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28519c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28520d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i5) {
        this.f28517a = i5;
        this.f28518b = obj;
        this.f28519c = obj2;
        this.f28520d = obj3;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2465q c2465q;
        switch (this.f28517a) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o.M(-1625076729);
                C1894h c1894h = (C1894h) this.f28518b;
                float f10 = c1894h.f28815c;
                long jB = A6.c.b(f10, f10);
                Z z2 = (Z) this.f28519c;
                long j8 = (z2 == null || (c2465q = z2.f28764d) == null) ? c1894h.f28818f : c2465q.f34382a;
                Z.d dVarB = i.b(c1894h.f28816d, c1894h.f28817e);
                float f11 = c1894h.f28814b;
                F f12 = new F(f11, f11, f11, f11);
                long jE = Fe.b.E(c1894h.f28815c);
                Fe.b.j(jE);
                long jM = Fe.b.M(1095216660480L & jE, L0.j.c(jE) / 2);
                long jC = L0.f.c(jB, 0.4f);
                C2465q c2465q2 = c1894h.f28819g;
                V.d dVarD = ic.d.d(dVarB, f12, j8, jB, jM, i.c(jC, c2465q2 != null ? c2465q2.f34382a : i.f28531b, j8, (Z) this.f28519c, c0740o), (D) this.f28520d, c0740o, 64);
                c0740o.p(false);
                break;
            case 1:
                C0740o c0740o2 = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0740o2.x()) {
                    c0740o2.I();
                } else {
                    StaticAdActivity staticAdActivity = (StaticAdActivity) this.f28518b;
                    Intent intent = staticAdActivity.getIntent();
                    AbstractC3340k.d(intent, "getIntent(...)");
                    int intExtra = intent.getIntExtra("CLOSE_DELAY_SECONDS", 0);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c cVar = StaticAdActivity.f30519b;
                    c0740o2.M(-1212645219);
                    boolean zE = c0740o2.e(cVar);
                    Object objF = c0740o2.F();
                    P p10 = C0732k.f7800a;
                    if (zE || objF == p10) {
                        C0507p0 c0507p0 = new C0507p0(1, cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0, 4);
                        c0740o2.U(c0507p0);
                        objF = c0507p0;
                    }
                    c0740o2.p(false);
                    tf.l lVar = (tf.l) ((KFunction) objF);
                    c0740o2.M(-1212643532);
                    boolean zE2 = c0740o2.e(cVar);
                    Object objF2 = c0740o2.F();
                    if (zE2 || objF2 == p10) {
                        S8.d dVar = new S8.d(0, cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.class, "dismiss", "dismiss()V", 0, 11);
                        c0740o2.U(dVar);
                        objF2 = dVar;
                    }
                    c0740o2.p(false);
                    tf.a aVar = (tf.a) ((KFunction) objF2);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar = StaticAdActivity.f30526i;
                    c0740o2.M(-1212638456);
                    Object objF3 = c0740o2.F();
                    if (objF3 == p10) {
                        objF3 = new com.moloco.sdk.service_locator.h(15);
                        c0740o2.U(objF3);
                    }
                    c0740o2.p(false);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.k.a(staticAdActivity, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g) this.f28519c, intExtra, lVar, aVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f) this.f28520d, vVar, (tf.a) objF3, c0740o2, 12582912);
                }
                break;
            default:
                C0740o c0740o3 = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0740o3.x()) {
                    c0740o3.I();
                } else {
                    G.f((VastActivity) this.f28518b, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q) this.f28519c, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.G) this.f28520d, VastActivity.k, c0740o3, 0);
                }
                break;
        }
        return C2515C.f34653a;
    }
}
