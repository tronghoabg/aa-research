package defpackage;

/* loaded from: classes2.dex */
public final class gij implements gim {
    private final cql a;
    private final long b;

    public gij(cql cqlVar, long j) {
        cqlVar.getClass();
        this.a = cqlVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gij)) {
            return false;
        }
        gij gijVar = (gij) obj;
        return affa.f(this.a, gijVar.a) && this.b == gijVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.g(this.b);
    }

    public final String toString() {
        return "Touch(event=" + this.a + ", timeMillis=" + this.b + ")";
    }
}
