package defpackage;

/* loaded from: classes2.dex */
public final class hcr {
    public int a;
    public int b;

    public hcr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcr)) {
            return false;
        }
        hcr hcrVar = (hcr) obj;
        return this.a == hcrVar.a && this.b == hcrVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "VisibleRange(lowerInclusive=" + this.a + ", upperExclusive=" + this.b + ")";
    }
}
