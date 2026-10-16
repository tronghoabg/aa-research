package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class jdq {
    public final long a;
    public final long b;
    public final int c;

    public jdq(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.jdq) {
            defpackage.jdq jdqVar = (defpackage.jdq) obj;
            if (this.a == jdqVar.a && this.b == jdqVar.b && this.c == jdqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        int i = (int) (j ^ (j >>> 32));
        return this.c ^ ((i ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003);
    }

    public final java.lang.String toString() {
        return "FrameStats{presentationTimeMillis=" + this.a + ", enqueueTimeMillis=" + this.b + ", frameSize=" + this.c + "}";
    }

    public jdq() {
        throw null;
    }
}
