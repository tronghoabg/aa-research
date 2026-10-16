package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qbc implements java.io.Serializable, defpackage.qas {
    public final defpackage.qav b;
    public java.lang.Integer c;

    public qbc(defpackage.abxr abxrVar) {
        this.b = defpackage.qav.c(abxrVar);
    }

    @Override // defpackage.qas
    public final defpackage.abxr a() {
        return this.b.f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.qbc)) {
            return false;
        }
        defpackage.qbc qbcVar = (defpackage.qbc) obj;
        return j$.util.Objects.equals(this.b, qbcVar.b) && j$.util.Objects.equals(this.c, qbcVar.c);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.b, this.c);
    }
}
