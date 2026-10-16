package com.moloco.sdk.internal.publisher;

import Hf.v0;
import Hf.x0;
import com.moloco.sdk.internal.ortb.model.C1890d;

/* renamed from: com.moloco.sdk.internal.publisher.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1917f implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1918g f29017b;

    public /* synthetic */ C1917f(C1918g c1918g, int i5) {
        this.f29016a = i5;
        this.f29017b = c1918g;
    }

    @Override // tf.a
    public final Object invoke() {
        v0 v0VarK;
        switch (this.f29016a) {
            case 0:
                return (C1890d) this.f29017b.f29019a.f29064h.f1940c;
            case 1:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) this.f29017b.f29019a.f29064h.f1939b;
                if (oVar == null || (v0VarK = oVar.k()) == null) {
                    return null;
                }
                return (Boolean) ((x0) v0VarK).getValue();
            default:
                return this.f29017b.f29019a.c();
        }
    }
}
