package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import ef.C2515C;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C2122t implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31927a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.l f31928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f31929c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31931e;

    public /* synthetic */ C2122t(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar, tf.a aVar, tf.l lVar, boolean z2) {
        this.f31930d = pVar;
        this.f31931e = aVar;
        this.f31928b = lVar;
        this.f31929c = z2;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f31927a) {
            case 0:
                if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) this.f31930d) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l) {
                    ((tf.a) this.f31931e).invoke();
                } else {
                    this.f31928b.invoke(Boolean.valueOf(!this.f31929c));
                }
                break;
            default:
                boolean z2 = this.f31929c;
                this.f31928b.invoke(Boolean.valueOf(!z2));
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar = z2 ? com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32408d : com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32409e;
                N.V v2 = (N.V) this.f31931e;
                v2.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(cVar, ((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) v2.getValue()).f32414b, ((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) v2.getValue()).f32415c));
                ((tf.p) this.f31930d).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) v2.getValue(), z2 ? com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32409e : com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32408d);
                break;
        }
        return C2515C.f34653a;
    }

    public /* synthetic */ C2122t(tf.l lVar, boolean z2, tf.p pVar, N.V v2) {
        this.f31928b = lVar;
        this.f31929c = z2;
        this.f31930d = pVar;
        this.f31931e = v2;
    }
}
