package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import z.C4599d;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2120q implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s f31919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.a f31920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tf.a f31921c;

    public C2120q(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s sVar, tf.a aVar, tf.a aVar2) {
        this.f31919a = sVar;
        this.f31920b = aVar;
        this.f31921c = aVar2;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4599d AnimatedVisibility = (C4599d) obj;
        C0740o c0740o = (C0740o) obj2;
        ((Number) obj3).intValue();
        AbstractC3340k.e(AnimatedVisibility, "$this$AnimatedVisibility");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s sVar = this.f31919a;
        if (sVar != null) {
            B.a(sVar, this.f31920b, this.f31921c, null, c0740o, 0);
        }
        return C2515C.f34653a;
    }
}
