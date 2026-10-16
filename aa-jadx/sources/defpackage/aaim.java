package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aaim {
    public final java.io.File a;
    public final java.lang.String b;
    public final long c;

    public aaim(java.io.File file, java.lang.String str, long j) {
        defpackage.zlv.n(file, "file");
        this.a = file;
        defpackage.zlv.n(str, "filename");
        this.b = str;
        this.c = j;
    }

    public static defpackage.aaim a(java.io.File file) {
        defpackage.zlv.n(file, "file");
        return new defpackage.aaim(file, file.getName(), file.lastModified());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.aaim)) {
            return false;
        }
        defpackage.aaim aaimVar = (defpackage.aaim) obj;
        return defpackage.a.B(this.a, aaimVar.a) && defpackage.a.B(this.b, aaimVar.b) && defpackage.a.B(java.lang.Long.valueOf(this.c), java.lang.Long.valueOf(aaimVar.c));
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a});
    }

    public final java.lang.String toString() {
        return java.lang.String.format("DiskCacheEntry[%s@%s]", this.b, java.lang.Long.valueOf(this.c));
    }
}
