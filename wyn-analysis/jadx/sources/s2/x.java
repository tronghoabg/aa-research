package s2;

import Va.M6;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final x f44937c = new x(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f44938a;

    /* renamed from: b, reason: collision with root package name */
    public final long f44939b;

    public x(long j8, long j10) {
        this.f44938a = j8;
        this.f44939b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f44938a == xVar.f44938a && this.f44939b == xVar.f44939b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f44938a) * 31) + ((int) this.f44939b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f44938a);
        sb2.append(", position=");
        return M6.s(sb2, this.f44939b, "]");
    }
}
