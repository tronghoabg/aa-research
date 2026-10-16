package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.ortb.model.C1890d;

/* loaded from: classes4.dex */
public final /* synthetic */ class J implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f28920b;

    public /* synthetic */ J(V v2, int i5) {
        this.f28919a = i5;
        this.f28920b = v2;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f28919a) {
            case 0:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) this.f28920b.f28965t.f10052d;
                if (eVar != null) {
                    return eVar.getCreativeType();
                }
                return null;
            case 1:
                return (C1890d) this.f28920b.f28965t.f10053e;
            case 2:
                return (D) this.f28920b.f28965t.f10054f;
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) this.f28920b.f28965t.f10052d;
                if (eVar2 != null) {
                    return eVar2.getCreativeType();
                }
                return null;
        }
    }
}
