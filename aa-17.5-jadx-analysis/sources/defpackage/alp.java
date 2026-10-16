package defpackage;

/* loaded from: classes.dex */
public final class alp {
    public final long a = -4294967296L;
    public final long b = -72057594037927936L;
    public final long c = -72057594037927936L;
    public final long d;
    public final long e;

    public alp(long j, long j2) {
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof alp)) {
            return false;
        }
        alp alpVar = (alp) obj;
        return a.j(-4294967296L, -4294967296L) && a.j(-72057594037927936L, -72057594037927936L) && a.j(-72057594037927936L, -72057594037927936L) && a.j(this.d, alpVar.d) && a.j(this.e, alpVar.e);
    }

    public final int hashCode() {
        int iG = a.g(-4294967296L) * 31;
        long j = this.e;
        return ((((((iG + a.g(-72057594037927936L)) * 31) + a.g(-72057594037927936L)) * 31) + a.g(this.d)) * 31) + a.g(j);
    }

    public final String toString() {
        long j = this.e;
        long j2 = this.d;
        return "ContextMenuColors(backgroundColor=" + cjv.g(-4294967296L) + ", textColor=" + cjv.g(-72057594037927936L) + ", iconColor=" + cjv.g(-72057594037927936L) + ", disabledTextColor=" + cjv.g(j2) + ", disabledIconColor=" + cjv.g(j) + ")";
    }
}
