package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2126x implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f31958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f31959b;

    public C2126x(String str, long j8) {
        this.f31958a = str;
        this.f31959b = j8;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        E.K OutlinedButton = (E.K) obj;
        C0740o c0740o = (C0740o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC3340k.e(OutlinedButton, "$this$OutlinedButton");
        if ((iIntValue & 17) == 16 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.M(-1632168765);
            c0740o.p(false);
            K.I.b(this.f31958a, null, this.f31959b, 0L, null, null, 0L, null, 0L, 0, false, 1, null, null, c0740o, 0, 3072, 57338);
        }
        return C2515C.f34653a;
    }
}
