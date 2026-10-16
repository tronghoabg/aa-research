package com.bumptech.glide.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements f, d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2835a;

    /* renamed from: b, reason: collision with root package name */
    private final f f2836b;

    /* renamed from: c, reason: collision with root package name */
    private volatile d f2837c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f2838d;

    /* renamed from: e, reason: collision with root package name */
    private e f2839e;

    /* renamed from: f, reason: collision with root package name */
    private e f2840f;

    public b(Object obj, f fVar) {
        e eVar = e.CLEARED;
        this.f2839e = eVar;
        this.f2840f = eVar;
        this.f2835a = obj;
        this.f2836b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.e.f] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.bumptech.glide.e.f
    public final f a() {
        ?? A;
        synchronized (this.f2835a) {
            f fVar = this.f2836b;
            this = this;
            if (fVar != null) {
                A = fVar.a();
            }
        }
        return A;
    }

    @Override // com.bumptech.glide.e.d
    public final void b() {
        synchronized (this.f2835a) {
            e eVar = this.f2839e;
            e eVar2 = e.RUNNING;
            if (eVar != eVar2) {
                this.f2839e = eVar2;
                this.f2837c.b();
            }
        }
    }

    @Override // com.bumptech.glide.e.d
    public final void c() {
        synchronized (this.f2835a) {
            e eVar = e.CLEARED;
            this.f2839e = eVar;
            this.f2837c.c();
            if (this.f2840f != eVar) {
                this.f2840f = eVar;
                this.f2838d.c();
            }
        }
    }

    @Override // com.bumptech.glide.e.f
    public final void d(d dVar) {
        synchronized (this.f2835a) {
            if (dVar.equals(this.f2838d)) {
                this.f2840f = e.FAILED;
                f fVar = this.f2836b;
                if (fVar != null) {
                    fVar.d(this);
                }
                return;
            }
            this.f2839e = e.FAILED;
            e eVar = this.f2840f;
            e eVar2 = e.RUNNING;
            if (eVar != eVar2) {
                this.f2840f = eVar2;
                this.f2838d.b();
            }
        }
    }

    @Override // com.bumptech.glide.e.f
    public final void e(d dVar) {
        synchronized (this.f2835a) {
            if (dVar.equals(this.f2837c)) {
                this.f2839e = e.SUCCESS;
            } else if (dVar.equals(this.f2838d)) {
                this.f2840f = e.SUCCESS;
            }
            f fVar = this.f2836b;
            if (fVar != null) {
                fVar.e(this);
            }
        }
    }

    @Override // com.bumptech.glide.e.d
    public final void f() {
        synchronized (this.f2835a) {
            e eVar = this.f2839e;
            e eVar2 = e.RUNNING;
            if (eVar == eVar2) {
                this.f2839e = e.PAUSED;
                this.f2837c.f();
            }
            if (this.f2840f == eVar2) {
                this.f2840f = e.PAUSED;
                this.f2838d.f();
            }
        }
    }

    public final void g(d dVar, d dVar2) {
        this.f2837c = dVar;
        this.f2838d = dVar2;
    }

    @Override // com.bumptech.glide.e.f
    public final boolean h(d dVar) {
        boolean z;
        synchronized (this.f2835a) {
            f fVar = this.f2836b;
            z = false;
            if ((fVar == null || fVar.h(this)) && dVar.equals(this.f2837c)) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.e.f
    public final boolean i(d dVar) {
        boolean z;
        boolean zEquals;
        synchronized (this.f2835a) {
            f fVar = this.f2836b;
            z = false;
            if (fVar == null || fVar.i(this)) {
                e eVar = this.f2839e;
                e eVar2 = e.FAILED;
                if (eVar == eVar2) {
                    if (dVar.equals(this.f2838d)) {
                        e eVar3 = this.f2840f;
                        if (eVar3 != e.SUCCESS) {
                            if (eVar3 == eVar2) {
                                z = true;
                            }
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                    } else {
                        zEquals = false;
                    }
                }
                zEquals = dVar.equals(this.f2837c);
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.e.f
    public final boolean j(d dVar) {
        boolean z;
        synchronized (this.f2835a) {
            f fVar = this.f2836b;
            z = true;
            if (fVar != null && !fVar.j(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.e.f, com.bumptech.glide.e.d
    public final boolean k() {
        boolean z;
        synchronized (this.f2835a) {
            z = true;
            if (!this.f2837c.k() && !this.f2838d.k()) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.e.d
    public final boolean l() {
        boolean z;
        synchronized (this.f2835a) {
            e eVar = this.f2839e;
            e eVar2 = e.CLEARED;
            z = false;
            if (eVar == eVar2 && this.f2840f == eVar2) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.e.d
    public final boolean m() {
        boolean z;
        synchronized (this.f2835a) {
            e eVar = this.f2839e;
            e eVar2 = e.SUCCESS;
            z = true;
            if (eVar != eVar2 && this.f2840f != eVar2) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.e.d
    public final boolean n(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            if (this.f2837c.n(bVar.f2837c) && this.f2838d.n(bVar.f2838d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.e.d
    public final boolean o() {
        boolean z;
        synchronized (this.f2835a) {
            e eVar = this.f2839e;
            e eVar2 = e.RUNNING;
            z = true;
            if (eVar != eVar2 && this.f2840f != eVar2) {
                z = false;
            }
        }
        return z;
    }
}
