package com.bumptech.glide.load.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ao implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3029a;

    /* renamed from: b, reason: collision with root package name */
    private final aw f3030b;

    /* renamed from: c, reason: collision with root package name */
    private final an f3031c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.o f3032d;

    /* renamed from: e, reason: collision with root package name */
    private int f3033e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3034f;

    ao(aw awVar, boolean z, com.bumptech.glide.load.o oVar, an anVar) {
        com.bumptech.glide.g.p.f(awVar);
        this.f3030b = awVar;
        this.f3029a = z;
        this.f3032d = oVar;
        com.bumptech.glide.g.p.f(anVar);
        this.f3031c = anVar;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final int a() {
        return this.f3030b.a();
    }

    @Override // com.bumptech.glide.load.a.aw
    public final Class b() {
        return this.f3030b.b();
    }

    @Override // com.bumptech.glide.load.a.aw
    public final Object c() {
        return this.f3030b.c();
    }

    final synchronized void d() {
        if (this.f3034f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f3033e++;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final synchronized void e() {
        if (this.f3033e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f3034f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f3034f = true;
        this.f3030b.e();
    }

    final void f() {
        int i2;
        synchronized (this) {
            int i3 = this.f3033e;
            if (i3 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i2 = i3 - 1;
            this.f3033e = i2;
        }
        if (i2 == 0) {
            this.f3031c.c(this.f3032d, this);
        }
    }

    final boolean g() {
        return this.f3029a;
    }

    public final synchronized String toString() {
        aw awVar;
        com.bumptech.glide.load.o oVar;
        awVar = this.f3030b;
        oVar = this.f3032d;
        return "EngineResource{isMemoryCacheable=" + this.f3029a + ", listener=" + this.f3031c.toString() + ", key=" + String.valueOf(oVar) + ", acquired=" + this.f3033e + ", isRecycled=" + this.f3034f + ", resource=" + awVar.toString() + "}";
    }
}
