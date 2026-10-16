package f6;

/* renamed from: f6.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2575E implements r6.n {

    /* renamed from: a, reason: collision with root package name */
    public final r6.n f34876a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f34877b;

    public C2575E(r6.n nVar, Z z2) {
        this.f34876a = nVar;
        this.f34877b = z2;
    }

    @Override // r6.n
    public final void a() {
        this.f34876a.a();
    }

    @Override // r6.n
    public final E5.T b(int i5) {
        return this.f34876a.b(i5);
    }

    @Override // r6.n
    public final int c(int i5) {
        return this.f34876a.c(i5);
    }

    @Override // r6.n
    public final void d(float f10) {
        this.f34876a.d(f10);
    }

    @Override // r6.n
    public final void e() {
        this.f34876a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2575E)) {
            return false;
        }
        C2575E c2575e = (C2575E) obj;
        return this.f34876a.equals(c2575e.f34876a) && this.f34877b.equals(c2575e.f34877b);
    }

    @Override // r6.n
    public final int f(int i5) {
        return this.f34876a.f(i5);
    }

    @Override // r6.n
    public final Z g() {
        return this.f34877b;
    }

    @Override // r6.n
    public final void h(boolean z2) {
        this.f34876a.h(z2);
    }

    public final int hashCode() {
        return this.f34876a.hashCode() + ((this.f34877b.hashCode() + 527) * 31);
    }

    @Override // r6.n
    public final void i() {
        this.f34876a.i();
    }

    @Override // r6.n
    public final E5.T j() {
        return this.f34876a.j();
    }

    @Override // r6.n
    public final void k() {
        this.f34876a.k();
    }

    @Override // r6.n
    public final int length() {
        return this.f34876a.length();
    }
}
