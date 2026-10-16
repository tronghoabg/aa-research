package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import E.C0427q;
import N.C0740o;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import ef.C2515C;
import ef.C2537u;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2051l implements tf.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z.d f30941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E.F f30942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c f30943c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f30944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f30945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f30946f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f30947g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.ortb.model.D f30948h;

    public C2051l(Z.d dVar, E.F f10, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar, z zVar, long j8, long j10, long j11, com.moloco.sdk.internal.ortb.model.D d3) {
        this.f30941a = dVar;
        this.f30942b = f10;
        this.f30943c = cVar;
        this.f30944d = zVar;
        this.f30945e = j8;
        this.f30946f = j10;
        this.f30947g = j11;
        this.f30948h = d3;
    }

    @Override // tf.c
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        int i5;
        C0427q c0427q = C0427q.f2765a;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        tf.a onClick = (tf.a) obj4;
        tf.l onButtonRendered = (tf.l) obj5;
        boolean zBooleanValue3 = ((Boolean) obj6).booleanValue();
        C2537u c2537u = (C2537u) obj7;
        C2537u c2537u2 = (C2537u) obj8;
        tf.a onTimerFinish = (tf.a) obj9;
        C0740o c0740o = (C0740o) obj10;
        int iIntValue = ((Number) obj11).intValue();
        AbstractC3340k.e(onClick, "onClick");
        AbstractC3340k.e(onButtonRendered, "onButtonRendered");
        AbstractC3340k.e(onTimerFinish, "onTimerFinish");
        if ((iIntValue & 6) == 0) {
            i5 = (c0740o.e(c0427q) ? 4 : 2) | iIntValue;
        } else {
            i5 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i5 |= c0740o.f(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i5 |= c0740o.f(zBooleanValue2) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i5 |= c0740o.e(onClick) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((iIntValue & 24576) == 0) {
            i5 |= c0740o.e(onButtonRendered) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        if ((iIntValue & 196608) == 0) {
            i5 |= c0740o.f(zBooleanValue3) ? 131072 : 65536;
        }
        int i10 = 1572864 & iIntValue;
        int i11 = c2537u.f34686a;
        if (i10 == 0) {
            i5 |= c0740o.c(i11) ? 1048576 : 524288;
        }
        int i12 = 12582912 & iIntValue;
        int i13 = c2537u2.f34686a;
        if (i12 == 0) {
            i5 |= c0740o.c(i13) ? 8388608 : 4194304;
        }
        if ((iIntValue & 100663296) == 0) {
            i5 |= c0740o.e(onTimerFinish) ? 67108864 : 33554432;
        }
        int i14 = i5;
        if ((i14 & 306783379) == 306783378 && c0740o.x()) {
            c0740o.I();
        } else {
            Fe.c.b(zBooleanValue2, com.moloco.sdk.internal.publisher.H.e0(AbstractC3935e.w(c0427q.a(Z.i.f16922a, this.f30941a)), this.f30942b), null, null, null, V.e.b(c0740o, 762064671, new C2050k(this.f30943c, onButtonRendered, zBooleanValue, this.f30944d, zBooleanValue3, i11, i13, onClick, this.f30945e, this.f30946f, this.f30947g, this.f30948h, onTimerFinish)), c0740o, ((i14 >> 6) & 14) | 196608);
        }
        return C2515C.f34653a;
    }
}
