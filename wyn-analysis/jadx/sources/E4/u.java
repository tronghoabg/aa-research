package E4;

/* loaded from: classes.dex */
public final class u implements B {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2985a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2986b;

    /* renamed from: c, reason: collision with root package name */
    public final B f2987c;

    /* renamed from: d, reason: collision with root package name */
    public final o f2988d;

    /* renamed from: e, reason: collision with root package name */
    public final t f2989e;

    /* renamed from: f, reason: collision with root package name */
    public int f2990f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2991g;

    public u(B b5, boolean z2, boolean z10, t tVar, o oVar) {
        gc.b.k(b5, "Argument must not be null");
        this.f2987c = b5;
        this.f2985a = z2;
        this.f2986b = z10;
        this.f2989e = tVar;
        gc.b.k(oVar, "Argument must not be null");
        this.f2988d = oVar;
    }

    @Override // E4.B
    public final synchronized void a() {
        if (this.f2990f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f2991g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f2991g = true;
        if (this.f2986b) {
            this.f2987c.a();
        }
    }

    @Override // E4.B
    public final Class b() {
        return this.f2987c.b();
    }

    public final synchronized void c() {
        if (this.f2991g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f2990f++;
    }

    public final void d() {
        boolean z2;
        synchronized (this) {
            int i5 = this.f2990f;
            if (i5 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z2 = true;
            int i10 = i5 - 1;
            this.f2990f = i10;
            if (i10 != 0) {
                z2 = false;
            }
        }
        if (z2) {
            this.f2988d.f(this.f2989e, this);
        }
    }

    @Override // E4.B
    public final Object get() {
        return this.f2987c.get();
    }

    @Override // E4.B
    public final int getSize() {
        return this.f2987c.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f2985a + ", listener=" + this.f2988d + ", key=" + this.f2989e + ", acquired=" + this.f2990f + ", isRecycled=" + this.f2991g + ", resource=" + this.f2987c + '}';
    }
}
