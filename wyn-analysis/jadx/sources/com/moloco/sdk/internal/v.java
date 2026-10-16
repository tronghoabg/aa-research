package com.moloco.sdk.internal;

import E5.Q;
import N.C0740o;
import N.V;
import a.AbstractC1304a;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import z.C4599d;

/* loaded from: classes4.dex */
public final class v implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf.l f29779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f29780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29781c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f29783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f29784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tf.a f29785g;

    public v(tf.l lVar, V v2, String str, String str2, long j8, long j10, tf.a aVar) {
        this.f29779a = lVar;
        this.f29780b = v2;
        this.f29781c = str;
        this.f29782d = str2;
        this.f29783e = j8;
        this.f29784f = j10;
        this.f29785g = aVar;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4599d AnimatedVisibility = (C4599d) obj;
        C0740o c0740o = (C0740o) obj2;
        ((Number) obj3).intValue();
        AbstractC3340k.e(AnimatedVisibility, "$this$AnimatedVisibility");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x xVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x) this.f29780b.getValue();
        if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t) {
            c0740o.M(-388729961);
            AbstractC1304a.h(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32410f, this.f29779a, V.e.b(c0740o, -1938502477, new u(this.f29781c, this.f29782d, this.f29783e, this.f29784f, this.f29785g, 0)), c0740o, 3120, 1);
            c0740o.p(false);
        } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v) {
            c0740o.M(-388168489);
            AbstractC1304a.h(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32410f, this.f29779a, V.e.b(c0740o, -868048676, new u(this.f29781c, this.f29782d, this.f29783e, this.f29784f, this.f29785g, 1)), c0740o, 3120, 1);
            c0740o.p(false);
        } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u) {
            c0740o.M(-387625710);
            c0740o.p(false);
        } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.w) {
            c0740o.M(-387568174);
            c0740o.p(false);
        } else {
            if (xVar != null) {
                c0740o.M(-843825115);
                c0740o.p(false);
                throw new Q((byte) 0, 9);
            }
            c0740o.M(-387533485);
            c0740o.p(false);
        }
        return C2515C.f34653a;
    }
}
