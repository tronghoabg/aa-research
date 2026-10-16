package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1982b implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.publisher.i0 f30054b;

    public /* synthetic */ C1982b(com.moloco.sdk.internal.publisher.i0 i0Var, int i5) {
        this.f30053a = i5;
        this.f30054b = i0Var;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj;
        switch (this.f30053a) {
            case 0:
                AbstractC3340k.e(error, "error");
                this.f30054b.e(error);
                break;
            default:
                this.f30054b.e(error);
                break;
        }
        return C2515C.f34653a;
    }
}
