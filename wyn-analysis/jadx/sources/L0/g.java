package L0;

import Va.M6;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final long f6802b = A6.h.b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6803c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f6804a;

    public static String a(long j8) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j8 >> 32));
        sb2.append(", ");
        return M6.r(sb2, (int) (j8 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f6804a == ((g) obj).f6804a;
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f6804a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return a(this.f6804a);
    }
}
