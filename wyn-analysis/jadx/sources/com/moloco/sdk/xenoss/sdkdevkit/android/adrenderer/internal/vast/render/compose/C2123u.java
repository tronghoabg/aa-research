package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import E.C0427q;
import N.C0732k;
import N.C0740o;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2123u implements tf.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf.s f31951a;

    public C2123u(tf.s sVar) {
        this.f31951a = sVar;
    }

    @Override // tf.u
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        int i5;
        C0427q c0427q = C0427q.f2765a;
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = bool.booleanValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p progress = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) obj3;
        tf.l onShouldPlay = (tf.l) obj4;
        tf.a onShouldReplay = (tf.a) obj5;
        C0740o c0740o = (C0740o) obj6;
        int iIntValue = ((Number) obj7).intValue();
        AbstractC3340k.e(progress, "progress");
        AbstractC3340k.e(onShouldPlay, "onShouldPlay");
        AbstractC3340k.e(onShouldReplay, "onShouldReplay");
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
        if ((iIntValue & 3072) == 0) {
            i5 |= c0740o.e(onShouldPlay) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((iIntValue & 24576) == 0) {
            i5 |= c0740o.e(onShouldReplay) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        if ((74899 & i5) == 74898 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.M(263769922);
            boolean zE = c0740o.e(progress) | c0740o.e(onShouldReplay) | c0740o.e(onShouldPlay) | c0740o.f(zBooleanValue);
            Object objF = c0740o.F();
            if (zE || objF == C0732k.f7800a) {
                objF = new C2122t(progress, onShouldReplay, onShouldPlay, zBooleanValue);
                c0740o.U(objF);
            }
            c0740o.p(false);
            this.f31951a.invoke(c0427q, bool, (tf.a) objF, c0740o, Integer.valueOf(i5 & 126));
        }
        return C2515C.f34653a;
    }
}
