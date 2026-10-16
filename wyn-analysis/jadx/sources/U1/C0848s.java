package U1;

/* renamed from: U1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848s implements S {

    /* renamed from: a, reason: collision with root package name */
    public C0848s f12117a;

    /* renamed from: b, reason: collision with root package name */
    public C0848s f12118b;

    @Override // U1.S
    public final void c(int i5, Object obj) {
        if (i5 == 7) {
            this.f12117a = (C0848s) obj;
        } else if (i5 == 8) {
            this.f12118b = (C0848s) obj;
        } else if (i5 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    public final void d() {
        C0848s c0848s = this.f12118b;
        if (c0848s != null) {
            c0848s.d();
        }
    }

    public final void e() {
        C0848s c0848s = this.f12118b;
        if (c0848s != null) {
            c0848s.e();
        }
    }

    public final void g() {
        C0848s c0848s = this.f12117a;
        if (c0848s != null) {
            c0848s.g();
        }
    }
}
