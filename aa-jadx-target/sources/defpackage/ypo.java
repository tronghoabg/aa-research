package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ypo extends defpackage.ypp {
    private final int d;
    private int f = 0;
    private final java.lang.String b = "A";
    private final java.lang.String c = "a";
    private final java.lang.String e = "SourceFile";

    public ypo(int i) {
        this.d = i;
    }

    @Override // defpackage.ypp
    public final int a() {
        return (char) this.d;
    }

    @Override // defpackage.ypp
    public final java.lang.String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.ypp
    public final java.lang.String c() {
        java.lang.String str = this.e;
        return str.substring(str.lastIndexOf(java.io.File.separatorChar) + 1);
    }

    @Override // defpackage.ypp
    public final java.lang.String d() {
        return this.c;
    }

    @Override // defpackage.ypp
    public final java.lang.String e() {
        return this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ypo)) {
            return false;
        }
        defpackage.ypo ypoVar = (defpackage.ypo) obj;
        if (!this.c.equals(ypoVar.c) || this.d != ypoVar.d) {
            return false;
        }
        java.lang.String str = ypoVar.b;
        return true;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.c.hashCode() + 4867) * 31) + this.d;
        this.f = iHashCode;
        return iHashCode;
    }
}
