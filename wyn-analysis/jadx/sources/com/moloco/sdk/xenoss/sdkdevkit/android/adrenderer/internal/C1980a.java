package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1980a implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.publisher.i0 f30051b;

    public /* synthetic */ C1980a(com.moloco.sdk.internal.publisher.i0 i0Var, int i5) {
        this.f30050a = i5;
        this.f30051b = i0Var;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f30050a) {
            case 0:
                this.f30051b.b();
                break;
            case 1:
                this.f30051b.a();
                break;
            default:
                this.f30051b.a();
                break;
        }
        return C2515C.f34653a;
    }
}
