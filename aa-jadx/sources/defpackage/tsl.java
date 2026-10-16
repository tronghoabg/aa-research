package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tsl {
    private final long a;

    public tsl(long j) {
        this.a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof defpackage.tsl) && this.a == ((defpackage.tsl) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final java.lang.String toString() {
        return "{" + this.a + "}";
    }

    public tsl() {
        throw null;
    }
}
