package defpackage;

/* loaded from: classes3.dex */
public final class trt {
    public final long a;

    public trt(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof trt) && this.a == ((trt) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "{" + this.a + "}";
    }

    public trt() {
        throw null;
    }
}
