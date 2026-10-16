package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import N.V;
import ef.C2537u;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C2054o implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f30962b;

    public /* synthetic */ C2054o(V v2, int i5) {
        this.f30961a = i5;
        this.f30962b = v2;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f30961a) {
            case 0:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) this.f30962b.getValue();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d dVar = fVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d) fVar : null;
                return Integer.valueOf(dVar != null ? dVar.f31962a : 0);
            case 1:
                return new C2537u(((C2537u) this.f30962b.getValue()).f34686a);
            default:
                Boolean bool = (Boolean) this.f30962b.getValue();
                bool.getClass();
                return bool;
        }
    }
}
