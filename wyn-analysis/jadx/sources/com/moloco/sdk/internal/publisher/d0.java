package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.ortb.model.C1890d;

/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f29013b;

    public /* synthetic */ d0(l0 l0Var, int i5) {
        this.f29012a = i5;
        this.f29013b = l0Var;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f29012a) {
            case 0:
                return this.f29013b.c();
            case 1:
                return (C1890d) this.f29013b.f29064h.f1940c;
            case 2:
                return (D) this.f29013b.f29064h.f1941d;
            default:
                return this.f29013b.c();
        }
    }
}
