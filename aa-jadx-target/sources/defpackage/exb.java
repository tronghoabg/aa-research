package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class exb {
    private final defpackage.op a;
    private final defpackage.eqg b;

    public exb(defpackage.op opVar, defpackage.eqg eqgVar) {
        this.a = opVar;
        this.b = eqgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.exb)) {
            return false;
        }
        defpackage.exb exbVar = (defpackage.exb) obj;
        return defpackage.afga.f(this.a, exbVar.a) && defpackage.afga.f(this.b, exbVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.eqg eqgVar = this.b;
        return iHashCode + (eqgVar == null ? 0 : eqgVar.hashCode());
    }

    public final java.lang.String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ")";
    }

    public exb() {
        throw null;
    }
}
