package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dir {
    public final defpackage.dhz a;
    public final defpackage.dil b;
    public final int c;
    public final int d;
    public final java.lang.Object e = null;

    public dir(defpackage.dhz dhzVar, defpackage.dil dilVar, int i, int i2) {
        this.a = dhzVar;
        this.b = dilVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dir)) {
            return false;
        }
        defpackage.dir dirVar = (defpackage.dir) obj;
        if (!defpackage.afga.f(this.a, dirVar.a) || !defpackage.afga.f(this.b, dirVar.b) || this.c != dirVar.c || this.d != dirVar.d) {
            return false;
        }
        java.lang.Object obj2 = dirVar.e;
        return true;
    }

    public final int hashCode() {
        defpackage.dhz dhzVar = this.a;
        return (((((((dhzVar == null ? 0 : dhzVar.hashCode()) * 31) + this.b.o) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final java.lang.String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + defpackage.die.a(this.c) + ", fontSynthesis=" + defpackage.dif.a(this.d) + ", resourceLoaderCacheKey=null)";
    }
}
