package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import E5.Q;
import Hf.v0;
import N.C0718d;
import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2044e implements tf.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z.k f30866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.l f30867b;

    public C2044e(Z.k kVar, tf.l lVar) {
        this.f30866a = kVar;
        this.f30867b = lVar;
    }

    @Override // tf.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        tf.l onButtonRendered = (tf.l) obj2;
        v0 v0Var = (v0) obj3;
        C0740o c0740o = (C0740o) obj4;
        int iIntValue = ((Number) obj5).intValue();
        AbstractC3340k.e(onButtonRendered, "onButtonRendered");
        if (v0Var != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x xVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x) C0718d.u(v0Var, c0740o, 0).getValue();
            boolean z2 = xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v;
            Z.k kVar = this.f30866a;
            tf.l lVar = this.f30867b;
            if (z2) {
                c0740o.M(-784874969);
                AbstractC3935e.h(onButtonRendered, kVar, lVar, c0740o, (iIntValue >> 3) & 14);
                c0740o.p(false);
            } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t) {
                c0740o.M(-784629945);
                AbstractC3935e.h(onButtonRendered, kVar, lVar, c0740o, (iIntValue >> 3) & 14);
                c0740o.p(false);
            } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u) {
                c0740o.M(-784396608);
                c0740o.p(false);
            } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.w) {
                c0740o.M(-784339072);
                c0740o.p(false);
            } else {
                if (xVar != null) {
                    c0740o.M(-1687888204);
                    c0740o.p(false);
                    throw new Q((byte) 0, 9);
                }
                c0740o.M(-784304352);
                c0740o.p(false);
            }
        }
        return C2515C.f34653a;
    }
}
