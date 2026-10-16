package com.bumptech.glide.load.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ad {

    /* renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.load.a.b.b f2988a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.a.b.k f2989b;

    ad(com.bumptech.glide.load.a.b.k kVar) {
        this.f2989b = kVar;
    }

    public final com.bumptech.glide.load.a.b.b a() {
        if (this.f2988a == null) {
            synchronized (this) {
                if (this.f2988a == null) {
                    this.f2988a = this.f2989b.c();
                }
                if (this.f2988a == null) {
                    this.f2988a = new com.bumptech.glide.load.a.b.c();
                }
            }
        }
        return this.f2988a;
    }
}
