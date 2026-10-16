package com.bumptech.glide.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l implements f, d {

    /* renamed from: a, reason: collision with root package name */
    private final f f2871a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2872b;

    /* renamed from: c, reason: collision with root package name */
    private volatile d f2873c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f2874d;

    /* renamed from: e, reason: collision with root package name */
    private e f2875e;

    /* renamed from: f, reason: collision with root package name */
    private e f2876f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2877g;

    public l(Object obj, f fVar) {
        e eVar = e.CLEARED;
        this.f2875e = eVar;
        this.f2876f = eVar;
        this.f2872b = obj;
        this.f2871a = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.e.f] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.bumptech.glide.e.f
    public final f a() {
        ?? A;
        synchronized (this.f2872b) {
            f fVar = this.f2871a;
            this = this;
            if (fVar != null) {
                A = fVar.a();
            }
        }
        return A;
    }

    @Override // com.bumptech.glide.e.d
    public final void b() {
        synchronized (this.f2872b) {
            this.f2877g = true;
            try {
                if (this.f2875e != e.SUCCESS) {
                    e eVar = this.f2876f;
                    e eVar2 = e.RUNNING;
                    if (eVar != eVar2) {
                        this.f2876f = eVar2;
                        this.f2874d.b();
                    }
                }
                if (this.f2877g) {
                    e eVar3 = this.f2875e;
                    e eVar4 = e.RUNNING;
                    if (eVar3 != eVar4) {
                        this.f2875e = eVar4;
                        this.f2873c.b();
                    }
                }
            } finally {
                this.f2877g = false;
            }
        }
    }

    @Override // com.bumptech.glide.e.d
    public final void c() {
        synchronized (this.f2872b) {
            this.f2877g = false;
            e eVar = e.CLEARED;
            this.f2875e = eVar;
            this.f2876f = eVar;
            this.f2874d.c();
            this.f2873c.c();
        }
    }

    @Override // com.bumptech.glide.e.f
    public final void d(d dVar) {
        synchronized (this.f2872b) {
            if (!dVar.equals(this.f2873c)) {
                this.f2876f = e.FAILED;
                return;
            }
            this.f2875e = e.FAILED;
            f fVar = this.f2871a;
            if (fVar != null) {
                fVar.d(this);
            }
        }
    }

    @Override // com.bumptech.glide.e.f
    public final void e(d dVar) {
        synchronized (this.f2872b) {
            if (dVar.equals(this.f2874d)) {
                this.f2876f = e.SUCCESS;
                return;
            }
            this.f2875e = e.SUCCESS;
            f fVar = this.f2871a;
            if (fVar != null) {
                fVar.e(this);
            }
            if (!this.f2876f.a()) {
                this.f2874d.c();
            }
        }
    }

    @Override // com.bumptech.glide.e.d
    public final void f() {
        synchronized (this.f2872b) {
            if (!this.f2876f.a()) {
                this.f2876f = e.PAUSED;
                this.f2874d.f();
            }
            if (!this.f2875e.a()) {
                this.f2875e = e.PAUSED;
                this.f2873c.f();
            }
        }
    }

    public final void g(d dVar, d dVar2) {
        this.f2873c = dVar;
        this.f2874d = dVar2;
    }

    @Override // com.bumptech.glide.e.f
    public final boolean h(d dVar) {
        boolean z;
        synchronized (this.f2872b) {
            f fVar = this.f2871a;
            z = false;
            if ((fVar == null || fVar.h(this)) && dVar.equals(this.f2873c) && this.f2875e != e.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.e.f
    public final boolean i(d dVar) {
        boolean z;
        synchronized (this.f2872b) {
            f fVar = this.f2871a;
            z = false;
            if ((fVar == null || fVar.i(this)) && dVar.equals(this.f2873c) && !k()) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.e.f
    public final boolean j(d dVar) {
        boolean z;
        synchronized (this.f2872b) {
            f fVar = this.f2871a;
            z = false;
            if ((fVar == null || fVar.j(this)) && (dVar.equals(this.f2873c) || this.f2875e != e.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.e.f, com.bumptech.glide.e.d
    public final boolean k() {
        boolean z;
        synchronized (this.f2872b) {
            z = true;
            if (!this.f2874d.k() && !this.f2873c.k()) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.e.d
    public final boolean l() {
        boolean z;
        synchronized (this.f2872b) {
            z = this.f2875e == e.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.e.d
    public final boolean m() {
        boolean z;
        synchronized (this.f2872b) {
            z = this.f2875e == e.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.e.d
    public final boolean n(d dVar) {
        if (dVar instanceof l) {
            l lVar = (l) dVar;
            if (this.f2873c != null ? this.f2873c.n(lVar.f2873c) : lVar.f2873c == null) {
                if (this.f2874d == null) {
                    if (lVar.f2874d == null) {
                        return true;
                    }
                } else if (this.f2874d.n(lVar.f2874d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.e.d
    public final boolean o() {
        boolean z;
        synchronized (this.f2872b) {
            z = this.f2875e == e.RUNNING;
        }
        return z;
    }
}
