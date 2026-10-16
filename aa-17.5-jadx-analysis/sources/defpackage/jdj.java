package defpackage;

/* loaded from: classes.dex */
final class jdj {
    public final long a;
    public final long b;
    public final int c;

    public jdj(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jdj) {
            jdj jdjVar = (jdj) obj;
            if (this.a == jdjVar.a && this.b == jdjVar.b && this.c == jdjVar.c) {
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

    public final String toString() {
        return "FrameStats{presentationTimeMillis=" + this.a + ", enqueueTimeMillis=" + this.b + ", frameSize=" + this.c + "}";
    }

    public jdj() {
        throw null;
    }
}
