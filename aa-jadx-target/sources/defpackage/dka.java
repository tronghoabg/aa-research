package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dka implements defpackage.djg {
    private final int a;
    private final int b;

    public dka(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.djg
    public final void a(defpackage.djh djhVar) {
        if (djhVar.k()) {
            djhVar.f();
        }
        int iG = defpackage.afqt.g(this.a, 0, djhVar.c());
        int iG2 = defpackage.afqt.g(this.b, 0, djhVar.c());
        if (iG != iG2) {
            if (iG < iG2) {
                djhVar.i(iG, iG2);
            } else {
                djhVar.i(iG2, iG);
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dka)) {
            return false;
        }
        defpackage.dka dkaVar = (defpackage.dka) obj;
        return this.a == dkaVar.a && this.b == dkaVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "SetComposingRegionCommand(start=" + this.a + ", end=" + this.b + ")";
    }
}
