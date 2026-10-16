package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import E.C0427q;
import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2109f implements tf.s {

    /* renamed from: a, reason: collision with root package name */
    public static final C2109f f31877a = new C2109f();

    @Override // tf.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i5;
        C0427q c0427q = (C0427q) obj;
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = bool.booleanValue();
        tf.a onClick = (tf.a) obj3;
        C0740o c0740o = (C0740o) obj4;
        int iIntValue = ((Number) obj5).intValue();
        AbstractC3340k.e(onClick, "onClick");
        if ((iIntValue & 6) == 0) {
            i5 = (c0740o.e(c0427q) ? 4 : 2) | iIntValue;
        } else {
            i5 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i5 |= c0740o.f(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i5 |= c0740o.e(onClick) ? 256 : 128;
        }
        if ((i5 & 1171) == 1170 && c0740o.x()) {
            c0740o.I();
        } else {
            Fe.g.c(bool, com.moloco.sdk.internal.publisher.H.f0(c0427q.a(Z.i.f16922a, Z.a.f16907h), 4), null, V.e.b(c0740o, 170935244, new com.moloco.sdk.internal.publisher.nativead.ui.a(onClick, 1)), c0740o, ((i5 >> 3) & 14) | 3072, 4);
        }
        return C2515C.f34653a;
    }
}
