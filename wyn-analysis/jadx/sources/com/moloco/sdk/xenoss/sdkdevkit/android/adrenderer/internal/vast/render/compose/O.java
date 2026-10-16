package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import p7.AbstractC3772b;
import z.C4599d;

/* loaded from: classes4.dex */
public final class O implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f31786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p f31787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f31788c;

    public O(boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar, long j8) {
        this.f31786a = z2;
        this.f31787b = pVar;
        this.f31788c = j8;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4599d AnimatedVisibility = (C4599d) obj;
        ((Number) obj3).intValue();
        AbstractC3340k.e(AnimatedVisibility, "$this$AnimatedVisibility");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar = this.f31787b;
        AbstractC3772b.e(this.f31786a, pVar, null, this.f31788c, (C0740o) obj2, 0);
        return C2515C.f34653a;
    }
}
