package L8;

import ka.AbstractC3256n;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final t f7017a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7018b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7019c;

    public l(int i5, int i10, Class cls) {
        this(t.a(cls), i5, i10);
    }

    public static l a(Class cls) {
        return new l(0, 2, cls);
    }

    public static l b(Class cls) {
        return new l(0, 1, cls);
    }

    public static l c(t tVar) {
        return new l(tVar, 1, 0);
    }

    public static l d(Class cls) {
        return new l(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f7017a.equals(lVar.f7017a) && this.f7018b == lVar.f7018b && this.f7019c == lVar.f7019c;
    }

    public final int hashCode() {
        return ((((this.f7017a.hashCode() ^ 1000003) * 1000003) ^ this.f7018b) * 1000003) ^ this.f7019c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f7017a);
        sb2.append(", type=");
        int i5 = this.f7018b;
        sb2.append(i5 == 1 ? "required" : i5 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i10 = this.f7019c;
        if (i10 == 0) {
            str = "direct";
        } else if (i10 == 1) {
            str = "provider";
        } else {
            if (i10 != 2) {
                throw new AssertionError(AbstractC3256n.g(i10, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return wg.b.c(sb2, str, "}");
    }

    public l(t tVar, int i5, int i10) {
        Fe.g.u(tVar, "Null dependency anInterface.");
        this.f7017a = tVar;
        this.f7018b = i5;
        this.f7019c = i10;
    }
}
