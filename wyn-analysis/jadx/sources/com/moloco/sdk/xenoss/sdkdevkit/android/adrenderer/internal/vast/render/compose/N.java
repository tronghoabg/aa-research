package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import E.C0427q;
import N.C0718d;
import N.C0732k;
import N.C0740o;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.UnityAdsConstants;
import e0.InterfaceC2442E;
import ef.C2515C;
import h0.AbstractC2765c;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class N implements tf.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z.d f31777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E.F f31778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2765c f31779c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2765c f31780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f31781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f31782f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f31783g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2442E f31784h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f31785i;

    public N(Z.d dVar, E.F f10, AbstractC2765c abstractC2765c, AbstractC2765c abstractC2765c2, long j8, long j10, long j11, InterfaceC2442E interfaceC2442E, long j12) {
        this.f31777a = dVar;
        this.f31778b = f10;
        this.f31779c = abstractC2765c;
        this.f31780d = abstractC2765c2;
        this.f31781e = j8;
        this.f31782f = j10;
        this.f31783g = j11;
        this.f31784h = interfaceC2442E;
        this.f31785i = j12;
    }

    @Override // tf.u
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        int i5;
        C0427q c0427q = C0427q.f2765a;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        tf.p onButtonReplaced = (tf.p) obj4;
        tf.l onMuteChange = (tf.l) obj5;
        C0740o c0740o = (C0740o) obj6;
        int iIntValue = ((Number) obj7).intValue();
        AbstractC3340k.e(onButtonReplaced, "onButtonReplaced");
        AbstractC3340k.e(onMuteChange, "onMuteChange");
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
            i5 |= c0740o.e(onButtonReplaced) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((iIntValue & 24576) == 0) {
            i5 |= c0740o.e(onMuteChange) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        int i10 = i5;
        if ((i10 & 74899) == 74898 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.M(-1304236247);
            Object objF = c0740o.F();
            if (objF == C0732k.f7800a) {
                objF = C0718d.G(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32408d, new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), N.P.f7730f);
                c0740o.U(objF);
            }
            c0740o.p(false);
            Fe.c.b(zBooleanValue, com.moloco.sdk.internal.publisher.H.e0(AbstractC3935e.w(c0427q.a(Z.i.f16922a, this.f31777a)), this.f31778b), null, null, null, V.e.b(c0740o, -2071462974, new M(zBooleanValue2, this.f31779c, this.f31780d, (N.V) objF, onButtonReplaced, onMuteChange, zBooleanValue, this.f31781e, this.f31782f, this.f31783g, this.f31784h, this.f31785i)), c0740o, ((i10 >> 3) & 14) | 196608);
        }
        return C2515C.f34653a;
    }
}
