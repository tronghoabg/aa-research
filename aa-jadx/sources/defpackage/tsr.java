package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tsr {
    public final long a;

    public tsr(long j) {
        this.a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof defpackage.tsr) && this.a == ((defpackage.tsr) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final java.lang.String toString() {
        return "{" + this.a + "}";
    }

    public tsr() {
        throw null;
    }
}
