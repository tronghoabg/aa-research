package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vqg {
    public final java.util.logging.Level a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final long d;

    public vqg(java.util.logging.Level level, java.lang.String str, java.lang.String str2, long j) {
        this.a = level;
        if (str == null) {
            throw new java.lang.NullPointerException("Null logFormat");
        }
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vqg) {
            defpackage.vqg vqgVar = (defpackage.vqg) obj;
            if (this.a.equals(vqgVar.a) && this.b.equals(vqgVar.b) && this.c.equals(vqgVar.c) && this.d == vqgVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        return "AbseilLogData{logLevel=" + this.a.toString() + ", logFormat=" + this.b + ", fileName=" + this.c + ", threadId=" + this.d + "}";
    }

    public vqg() {
        throw null;
    }
}
