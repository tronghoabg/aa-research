package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import ef.C2515C;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final float f31704a = 48;

    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s resource, tf.a onDisplayed, tf.a onClick, Z.k kVar, C0740o c0740o, int i5) {
        Z.k kVar2;
        AbstractC3340k.e(resource, "resource");
        AbstractC3340k.e(onDisplayed, "onDisplayed");
        AbstractC3340k.e(onClick, "onClick");
        c0740o.N(-1900222419);
        if (((i5 | (c0740o.e(resource) ? 4 : 2) | (c0740o.e(onDisplayed) ? 32 : 16) | (c0740o.e(onClick) ? 256 : 128) | 3072) & 1171) == 1170 && c0740o.x()) {
            c0740o.I();
            kVar2 = kVar;
        } else {
            Z.i iVar = Z.i.f16922a;
            C2515C c2515c = C2515C.f34653a;
            c0740o.M(1568423690);
            boolean zE = c0740o.e(onDisplayed);
            Object objF = c0740o.F();
            if (zE || objF == C0732k.f7800a) {
                objF = new A(onDisplayed, null);
                c0740o.U(objF);
            }
            c0740o.p(false);
            C0718d.d(c0740o, c2515c, (tf.p) objF);
            E.x xVar = E.L.f2700a;
            float f10 = f31704a;
            E.M m10 = new E.M(Float.NaN, Float.NaN, f10, f10, true);
            iVar.g(m10);
            if (resource instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q) {
                c0740o.M(1376740493);
                AbstractC2641B.e((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q) resource, m10, c0740o, 0);
                c0740o.p(false);
            } else {
                if (!(resource instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r)) {
                    c0740o.M(1568430034);
                    c0740o.p(false);
                    throw new E5.Q((byte) 0, 9);
                }
                c0740o.M(1376916449);
                tg.b.d((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r) resource, com.moloco.sdk.internal.publisher.H.R(m10, null, onClick, 7), c0740o, 0, 0);
                c0740o.p(false);
            }
            kVar2 = iVar;
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new com.applovin.mediation.adapters.d(resource, onDisplayed, onClick, kVar2, i5, 4);
        }
    }
}
