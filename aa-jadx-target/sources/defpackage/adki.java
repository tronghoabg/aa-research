package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adki {
    public final defpackage.adkh a;
    public final defpackage.ador b;

    public adki(defpackage.adkh adkhVar, defpackage.ador adorVar) {
        this.a = adkhVar;
        adorVar.getClass();
        this.b = adorVar;
    }

    public static defpackage.adki a(defpackage.adkh adkhVar) {
        defpackage.ysr.aY(adkhVar != defpackage.adkh.c, "state is TRANSIENT_ERROR. Use forError() instead");
        return new defpackage.adki(adkhVar, defpackage.ador.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adki)) {
            return false;
        }
        defpackage.adki adkiVar = (defpackage.adki) obj;
        return this.a.equals(adkiVar.a) && this.b.equals(adkiVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ador adorVar = this.b;
        boolean zG = adorVar.g();
        defpackage.adkh adkhVar = this.a;
        if (zG) {
            return adkhVar.toString();
        }
        return adkhVar.toString() + "(" + adorVar.toString() + ")";
    }
}
