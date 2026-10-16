package defpackage;

/* loaded from: classes2.dex */
public final class gii implements gim {
    private final crs a;
    private final long b;

    public gii(crs crsVar, long j) {
        this.a = crsVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gii)) {
            return false;
        }
        gii giiVar = (gii) obj;
        return affa.f(this.a, giiVar.a) && this.b == giiVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.g(this.b);
    }

    public final String toString() {
        return "RotaryScroll(event=" + this.a + ", timeMillis=" + this.b + ")";
    }
}
