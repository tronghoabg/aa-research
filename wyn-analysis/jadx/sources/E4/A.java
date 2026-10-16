package E4;

/* loaded from: classes.dex */
public final class A implements B, Z4.b {

    /* renamed from: e, reason: collision with root package name */
    public static final Dd.c f2826e = Z4.d.a(20, new x4.d(16));

    /* renamed from: a, reason: collision with root package name */
    public final Z4.e f2827a = new Z4.e();

    /* renamed from: b, reason: collision with root package name */
    public B f2828b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2829c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2830d;

    @Override // E4.B
    public final synchronized void a() {
        this.f2827a.a();
        this.f2830d = true;
        if (!this.f2829c) {
            this.f2828b.a();
            this.f2828b = null;
            f2826e.O(this);
        }
    }

    @Override // E4.B
    public final Class b() {
        return this.f2828b.b();
    }

    @Override // Z4.b
    public final Z4.e c() {
        return this.f2827a;
    }

    public final synchronized void d() {
        this.f2827a.a();
        if (!this.f2829c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f2829c = false;
        if (this.f2830d) {
            a();
        }
    }

    @Override // E4.B
    public final Object get() {
        return this.f2828b.get();
    }

    @Override // E4.B
    public final int getSize() {
        return this.f2828b.getSize();
    }
}
