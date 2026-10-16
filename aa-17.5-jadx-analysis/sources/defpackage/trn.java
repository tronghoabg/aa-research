package defpackage;

/* loaded from: classes3.dex */
public final class trn {
    private final long a;

    public trn(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof trn) && this.a == ((trn) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "{" + this.a + "}";
    }

    public trn() {
        throw null;
    }
}
