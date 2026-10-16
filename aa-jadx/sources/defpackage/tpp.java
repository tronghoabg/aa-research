package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpp {
    public final defpackage.tpm a;
    public final defpackage.tpm b;
    public final java.util.List c;

    public tpp(defpackage.tpm tpmVar, defpackage.tpm tpmVar2, java.util.List list) {
        tpmVar.getClass();
        this.a = tpmVar;
        tpmVar2.getClass();
        this.b = tpmVar2;
        this.c = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tpp) {
            defpackage.tpp tppVar = (defpackage.tpp) obj;
            if (this.a.equals(tppVar.a) && this.b.equals(tppVar.b) && this.c.equals(tppVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        java.util.List list = this.c;
        defpackage.tpm tpmVar = this.b;
        return "{" + java.lang.String.valueOf(this.a) + ", " + java.lang.String.valueOf(tpmVar) + ", " + list.toString() + "}";
    }

    public tpp() {
        throw null;
    }
}
