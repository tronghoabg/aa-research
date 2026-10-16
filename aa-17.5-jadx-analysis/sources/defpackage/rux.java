package defpackage;

/* loaded from: classes.dex */
public final class rux extends ebj implements Comparable {
    public final int a;
    public final int b;

    public rux(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rux) {
            rux ruxVar = (rux) obj;
            if (this.a == ruxVar.a && this.b == ruxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    @Override // java.lang.Comparable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final int compareTo(rux ruxVar) {
        return yde.b.c(this.a, ruxVar.a).c(this.b, ruxVar.b).a();
    }

    public final boolean r(rux ruxVar) {
        return compareTo(ruxVar) >= 0;
    }

    public final String toString() {
        return a.U(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)}, rux.class);
    }
}
