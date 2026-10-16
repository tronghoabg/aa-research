package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import A.X;
import N.C;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import tf.l;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f31677b;

    public /* synthetic */ f(i iVar, int i5) {
        this.f31676a = i5;
        this.f31677b = iVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f31676a) {
            case 0:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj;
                i iVar = this.f31677b;
                iVar.getClass();
                AbstractC3340k.e(error, "error");
                iVar.a(new d(error));
                return C2515C.f34653a;
            default:
                C DisposableEffect = (C) obj;
                AbstractC3340k.e(DisposableEffect, "$this$DisposableEffect");
                return new X(this.f31677b, 2);
        }
    }
}
