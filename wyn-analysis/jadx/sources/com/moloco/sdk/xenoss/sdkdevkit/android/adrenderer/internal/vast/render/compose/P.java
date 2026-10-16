package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import E.C0427q;
import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class P implements tf.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z.d f31789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E.F f31790b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f31791c;

    public P(Z.d dVar, E.F f10, long j8) {
        this.f31789a = dVar;
        this.f31790b = f10;
        this.f31791c = j8;
    }

    @Override // tf.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i5;
        C0427q c0427q = (C0427q) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p progress = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) obj3;
        C0740o c0740o = (C0740o) obj4;
        int iIntValue = ((Number) obj5).intValue();
        AbstractC3340k.e(progress, "progress");
        if ((iIntValue & 6) == 0) {
            i5 = (c0740o.e(c0427q) ? 4 : 2) | iIntValue;
        } else {
            i5 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i5 |= c0740o.f(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i5 |= c0740o.e(progress) ? 256 : 128;
        }
        if ((i5 & 1171) == 1170 && c0740o.x()) {
            c0740o.I();
        } else {
            boolean z2 = zBooleanValue || ((progress instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n) && ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n) progress).f32074a > 0);
            E.x other = E.L.f2700a;
            AbstractC3340k.e(other, "other");
            Fe.c.b(z2, com.moloco.sdk.internal.publisher.H.e0(c0427q.a(other, this.f31789a), this.f31790b), null, null, null, V.e.b(c0740o, -1435522410, new O(zBooleanValue, progress, this.f31791c)), c0740o, 196608);
        }
        return C2515C.f34653a;
    }
}
