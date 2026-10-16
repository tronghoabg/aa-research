package defpackage;

/* loaded from: classes2.dex */
public final class gif implements gim {
    private final long a;
    private final cis b;

    public gif(cis cisVar, long j) {
        this.b = cisVar;
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gif)) {
            return false;
        }
        gif gifVar = (gif) obj;
        return affa.f(this.b, gifVar.b) && this.a == gifVar.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + a.g(this.a);
    }

    public final String toString() {
        return "Focus(event=" + this.b + ", timeMillis=" + this.a + ")";
    }
}
