package E5;

import u6.AbstractC4256a;

/* renamed from: E5.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0449f implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3345a;

    /* renamed from: c, reason: collision with root package name */
    public B0 f3347c;

    /* renamed from: d, reason: collision with root package name */
    public int f3348d;

    /* renamed from: e, reason: collision with root package name */
    public F5.l f3349e;

    /* renamed from: f, reason: collision with root package name */
    public int f3350f;

    /* renamed from: g, reason: collision with root package name */
    public f6.V f3351g;

    /* renamed from: h, reason: collision with root package name */
    public T[] f3352h;

    /* renamed from: i, reason: collision with root package name */
    public long f3353i;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3355l;

    /* renamed from: b, reason: collision with root package name */
    public final S3.s f3346b = new S3.s(4, (char) 0);

    /* renamed from: j, reason: collision with root package name */
    public long f3354j = Long.MIN_VALUE;

    public AbstractC0449f(int i5) {
        this.f3345a = i5;
    }

    public final C0465o b(Exception exc, T t10, boolean z2, int i5) {
        int iW;
        if (t10 == null || this.f3355l) {
            iW = 4;
        } else {
            this.f3355l = true;
            try {
                iW = w(t10) & 7;
            } catch (C0465o unused) {
            } finally {
                this.f3355l = false;
            }
        }
        return new C0465o(1, exc, i5, f(), this.f3348d, t10, t10 == null ? 4 : iW, z2);
    }

    public u6.j d() {
        return null;
    }

    public abstract String f();

    public final boolean h() {
        return this.f3354j == Long.MIN_VALUE;
    }

    public abstract boolean i();

    public abstract boolean j();

    public abstract void k();

    public abstract void m(long j8, boolean z2);

    public abstract void q(T[] tArr, long j8, long j10);

    public final int r(S3.s sVar, H5.h hVar, int i5) {
        f6.V v2 = this.f3351g;
        v2.getClass();
        int iH = v2.h(sVar, hVar, i5);
        if (iH == -4) {
            if (hVar.h(4)) {
                this.f3354j = Long.MIN_VALUE;
                return this.k ? -4 : -3;
            }
            long j8 = hVar.f4919f + this.f3353i;
            hVar.f4919f = j8;
            this.f3354j = Math.max(this.f3354j, j8);
            return iH;
        }
        if (iH == -5) {
            T t10 = (T) sVar.f11010c;
            t10.getClass();
            long j10 = t10.f3242p;
            if (j10 != Long.MAX_VALUE) {
                S sA = t10.a();
                sA.f3208o = j10 + this.f3353i;
                sVar.f11010c = new T(sA);
            }
        }
        return iH;
    }

    public abstract void s(long j8, long j10);

    public final void t(T[] tArr, f6.V v2, long j8, long j10) {
        AbstractC4256a.i(!this.k);
        this.f3351g = v2;
        if (this.f3354j == Long.MIN_VALUE) {
            this.f3354j = j8;
        }
        this.f3352h = tArr;
        this.f3353i = j10;
        q(tArr, j8, j10);
    }

    public final void u() {
        AbstractC4256a.i(this.f3350f == 0);
        this.f3346b.e();
        n();
    }

    public void v(float f10, float f11) {
    }

    public abstract int w(T t10);

    public int x() {
        return 0;
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    @Override // E5.x0
    public void c(int i5, Object obj) {
    }

    public void l(boolean z2, boolean z10) {
    }
}
