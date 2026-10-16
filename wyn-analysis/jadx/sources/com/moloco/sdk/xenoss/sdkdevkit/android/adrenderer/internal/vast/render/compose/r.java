package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import E.C0427q;
import N.C0740o;
import com.applovin.shadow.okio.Segment;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class r implements tf.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z.d f31922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E.F f31923b;

    public r(Z.d dVar, E.F f10) {
        this.f31922a = dVar;
        this.f31923b = f10;
    }

    @Override // tf.t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i5;
        C0427q c0427q = (C0427q) obj;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s sVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s) obj2;
        tf.a onDisplayed = (tf.a) obj3;
        tf.a onClick = (tf.a) obj4;
        C0740o c0740o = (C0740o) obj5;
        int iIntValue = ((Number) obj6).intValue();
        AbstractC3340k.e(c0427q, "<this>");
        AbstractC3340k.e(onDisplayed, "onDisplayed");
        AbstractC3340k.e(onClick, "onClick");
        if ((iIntValue & 6) == 0) {
            i5 = (c0740o.e(c0427q) ? 4 : 2) | iIntValue;
        } else {
            i5 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i5 |= c0740o.e(sVar) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i5 |= c0740o.e(onDisplayed) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i5 |= c0740o.e(onClick) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i5 & 9363) == 9362 && c0740o.x()) {
            c0740o.I();
        } else {
            Fe.c.b(sVar != null, com.moloco.sdk.internal.publisher.H.e0(c0427q.a(Z.i.f16922a, this.f31922a), this.f31923b), null, null, null, V.e.b(c0740o, 989733896, new C2120q(sVar, onDisplayed, onClick)), c0740o, 196608);
        }
        return C2515C.f34653a;
    }
}
