package com.bumptech.glide.load.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private com.bumptech.glide.load.o f3154a;

    /* renamed from: b, reason: collision with root package name */
    private com.bumptech.glide.load.v f3155b;

    /* renamed from: c, reason: collision with root package name */
    private av f3156c;

    final void a() {
        this.f3154a = null;
        this.f3155b = null;
        this.f3156c = null;
    }

    final void b(com.bumptech.glide.load.o oVar, com.bumptech.glide.load.v vVar, av avVar) {
        this.f3154a = oVar;
        this.f3155b = vVar;
        this.f3156c = avVar;
    }

    final boolean c() {
        return this.f3156c != null;
    }

    final void d(ad adVar, com.bumptech.glide.load.s sVar) {
        try {
            adVar.a().b(this.f3154a, new j(this.f3155b, this.f3156c, sVar));
        } finally {
            this.f3156c.f();
        }
    }
}
