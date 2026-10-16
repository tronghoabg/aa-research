package com.airbnb.lottie.a.b;

import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class x extends f {

    /* renamed from: d, reason: collision with root package name */
    private final Object f1930d;

    public x(com.airbnb.lottie.h.c cVar, Object obj) {
        super(Collections.EMPTY_LIST);
        this.f1877c = cVar;
        this.f1930d = obj;
    }

    @Override // com.airbnb.lottie.a.b.f
    final float a() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.a.b.f
    public final Object f() {
        com.airbnb.lottie.h.c cVar = this.f1877c;
        Object obj = this.f1930d;
        float f2 = this.f1876b;
        return cVar.b(0.0f, 0.0f, obj, obj, f2, f2, f2);
    }

    @Override // com.airbnb.lottie.a.b.f
    final Object g(com.airbnb.lottie.h.a aVar, float f2) {
        return f();
    }

    @Override // com.airbnb.lottie.a.b.f
    public final void j() {
        if (this.f1877c != null) {
            super.j();
        }
    }

    @Override // com.airbnb.lottie.a.b.f
    public final void l(float f2) {
        this.f1876b = f2;
    }

    public x(com.airbnb.lottie.h.c cVar) {
        this(cVar, null);
    }
}
