package k2;

import j$.util.Objects;

/* renamed from: k2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3140B extends AbstractC3166x {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f38891e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f38892c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f38893d;

    public C3140B(N1.N n10, Object obj, Object obj2) {
        super(n10);
        this.f38892c = obj;
        this.f38893d = obj2;
    }

    @Override // k2.AbstractC3166x, N1.N
    public final int b(Object obj) {
        Object obj2;
        if (f38891e.equals(obj) && (obj2 = this.f38893d) != null) {
            obj = obj2;
        }
        return this.f39170b.b(obj);
    }

    @Override // k2.AbstractC3166x, N1.N
    public final N1.L f(int i5, N1.L l10, boolean z2) {
        this.f39170b.f(i5, l10, z2);
        if (Objects.equals(l10.f8049b, this.f38893d) && z2) {
            l10.f8049b = f38891e;
        }
        return l10;
    }

    @Override // k2.AbstractC3166x, N1.N
    public final Object l(int i5) {
        Object objL = this.f39170b.l(i5);
        int i10 = Q1.x.f9724a;
        return Objects.equals(objL, this.f38893d) ? f38891e : objL;
    }

    @Override // k2.AbstractC3166x, N1.N
    public final N1.M m(int i5, N1.M m10, long j8) {
        this.f39170b.m(i5, m10, j8);
        if (Objects.equals(m10.f8057a, this.f38892c)) {
            m10.f8057a = N1.M.f8055q;
        }
        return m10;
    }
}
