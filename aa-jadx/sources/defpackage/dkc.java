package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dkc implements defpackage.djg {
    private final int a;
    private final int b;

    public dkc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.djg
    public final void a(defpackage.djh djhVar) {
        int iG = defpackage.afqt.g(this.a, 0, djhVar.c());
        int iG2 = defpackage.afqt.g(this.b, 0, djhVar.c());
        if (iG < iG2) {
            djhVar.j(iG, iG2);
        } else {
            djhVar.j(iG2, iG);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dkc)) {
            return false;
        }
        defpackage.dkc dkcVar = (defpackage.dkc) obj;
        return this.a == dkcVar.a && this.b == dkcVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "SetSelectionCommand(start=" + this.a + ", end=" + this.b + ")";
    }
}
