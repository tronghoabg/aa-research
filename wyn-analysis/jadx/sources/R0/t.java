package r0;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public int f44307a;

    /* renamed from: b, reason: collision with root package name */
    public int f44308b;

    /* renamed from: c, reason: collision with root package name */
    public long f44309c = Ba.c.a(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public long f44310d = v.f44313a;

    public final long g() {
        int i5 = this.f44307a;
        long j8 = this.f44309c;
        return A6.h.b((i5 - ((int) (j8 >> 32))) / 2, (this.f44308b - ((int) (j8 & 4294967295L))) / 2);
    }

    public int h() {
        return (int) (this.f44309c >> 32);
    }

    public abstract void m(long j8, float f10, tf.l lVar);

    public final void o() {
        this.f44307a = android.support.v4.media.session.b.S((int) (this.f44309c >> 32), L0.a.g(this.f44310d), L0.a.e(this.f44310d));
        this.f44308b = android.support.v4.media.session.b.S((int) (this.f44309c & 4294967295L), L0.a.f(this.f44310d), L0.a.d(this.f44310d));
    }

    public final void p(long j8) {
        if (this.f44310d == j8) {
            return;
        }
        this.f44310d = j8;
        o();
    }
}
