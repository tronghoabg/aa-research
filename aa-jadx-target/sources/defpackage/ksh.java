package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ksh {
    public final defpackage.ksd a;
    public final defpackage.ksr b;

    public ksh(defpackage.ksd ksdVar, defpackage.ksr ksrVar) {
        ksdVar.getClass();
        this.a = ksdVar;
        this.b = ksrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ksh)) {
            return false;
        }
        defpackage.ksh kshVar = (defpackage.ksh) obj;
        return defpackage.afga.f(this.a, kshVar.a) && defpackage.afga.f(this.b, kshVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "VersionedPalette(palette=" + this.a + ", themeVersion=" + this.b + ")";
    }
}
