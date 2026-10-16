package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2108e implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f31873a;

    public C2108e(boolean z2) {
        this.f31873a = z2;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        E.K TextButton = (E.K) obj;
        C0740o c0740o = (C0740o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC3340k.e(TextButton, "$this$TextButton");
        if ((iIntValue & 17) == 16 && c0740o.x()) {
            c0740o.I();
        } else {
            K.I.b(this.f31873a ? "Pause" : "Play", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, null, null, c0740o, 0, 0, 65534);
        }
        return C2515C.f34653a;
    }
}
