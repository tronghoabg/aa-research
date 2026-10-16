package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class omm {
    public final defpackage.omo a;
    public final java.lang.String b;
    public final defpackage.omn c;
    public final defpackage.ygw d;

    public omm(defpackage.omo omoVar, java.lang.String str, defpackage.omn omnVar, defpackage.ygw ygwVar) {
        this.a = omoVar;
        this.b = str;
        this.c = omnVar;
        this.d = ygwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.omm) {
            defpackage.omm ommVar = (defpackage.omm) obj;
            defpackage.omo omoVar = this.a;
            if (omoVar != null ? omoVar.equals(ommVar.a) : ommVar.a == null) {
                java.lang.String str = this.b;
                if (str != null ? str.equals(ommVar.b) : ommVar.b == null) {
                    defpackage.omn omnVar = this.c;
                    if (omnVar != null ? omnVar.equals(ommVar.c) : ommVar.c == null) {
                        if (defpackage.ysr.W(this.d, ommVar.d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.omo omoVar = this.a;
        int iHashCode = omoVar == null ? 0 : omoVar.hashCode();
        java.lang.String str = this.b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = iHashCode ^ 1000003;
        defpackage.omn omnVar = this.c;
        return (this.d.hashCode() ^ (((((i * 1000003) ^ iHashCode2) * 1000003) ^ (omnVar != null ? omnVar.hashCode() : 0)) * 1000003)) * 1000003;
    }

    public final java.lang.String toString() {
        defpackage.ygw ygwVar = this.d;
        defpackage.omn omnVar = this.c;
        return "AppBarModel{headerIcon=" + java.lang.String.valueOf(this.a) + ", title=" + this.b + ", headerButton=" + java.lang.String.valueOf(omnVar) + ", auxiliaryButtons=" + java.lang.String.valueOf(ygwVar) + ", tabStrip=null}";
    }

    public omm() {
        throw null;
    }
}
