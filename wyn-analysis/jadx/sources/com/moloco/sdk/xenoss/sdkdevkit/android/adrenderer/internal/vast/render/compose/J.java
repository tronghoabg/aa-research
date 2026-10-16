package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import N.C0740o;
import a.AbstractC1304a;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import z.C4599d;

/* loaded from: classes4.dex */
public final class J implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf.l f31754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N.V f31755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f31756c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f31757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.a f31758e;

    public J(tf.l lVar, N.V v2, String str, long j8, tf.a aVar) {
        this.f31754a = lVar;
        this.f31755b = v2;
        this.f31756c = str;
        this.f31757d = j8;
        this.f31758e = aVar;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4599d AnimatedVisibility = (C4599d) obj;
        C0740o c0740o = (C0740o) obj2;
        ((Number) obj3).intValue();
        AbstractC3340k.e(AnimatedVisibility, "$this$AnimatedVisibility");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x xVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x) this.f31755b.getValue();
        boolean z2 = xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t;
        tf.a aVar = this.f31758e;
        long j8 = this.f31757d;
        String str = this.f31756c;
        if (z2) {
            c0740o.M(1204129171);
            AbstractC1304a.h(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32410f, this.f31754a, V.e.b(c0740o, -832302220, new I(str, j8, aVar, 0)), c0740o, 3120, 1);
            c0740o.p(false);
        } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v) {
            c0740o.M(1204720403);
            AbstractC1304a.h(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32410f, this.f31754a, V.e.b(c0740o, 1517460509, new I(str, j8, aVar, 1)), c0740o, 3120, 1);
            c0740o.p(false);
        } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u) {
            c0740o.M(1205293903);
            c0740o.p(false);
        } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.w) {
            c0740o.M(1205379308);
            c0740o.p(false);
        } else {
            if (xVar != null) {
                c0740o.M(-1485179161);
                c0740o.p(false);
                throw new E5.Q((byte) 0, 9);
            }
            c0740o.M(1205414059);
            c0740o.p(false);
        }
        return C2515C.f34653a;
    }
}
