package defpackage;

/* loaded from: classes2.dex */
final class cgr {
    public final int a;
    public final int b;
    public final sm c;
    private final long d;

    public cgr(int i, long j, int i2, sm smVar) {
        this.a = i;
        this.d = j;
        this.b = i2;
        this.c = smVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgr)) {
            return false;
        }
        cgr cgrVar = (cgr) obj;
        return this.a == cgrVar.a && this.d == cgrVar.d && this.b == cgrVar.b && affa.f(this.c, cgrVar.c);
    }

    public final int hashCode() {
        sm smVar = this.c;
        int iHashCode = smVar == null ? 0 : smVar.hashCode();
        long j = this.d;
        return (((((this.a * 31) + a.g(j)) * 31) + this.b) * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentCaptureEvent(id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append((Object) (this.b != 1 ? "VIEW_DISAPPEAR" : "VIEW_APPEAR"));
        sb.append(", structureCompat=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
