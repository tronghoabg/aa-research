package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class ecw extends defpackage.ecv {
    public ecw(defpackage.edf edfVar, android.view.WindowInsets windowInsets) {
        super(edfVar, windowInsets);
    }

    @Override // defpackage.edc
    public defpackage.eag B() {
        android.view.DisplayCutout displayCutoutM = hh$.ExternalSyntheticApiModelOutline0.m(this.a);
        if (displayCutoutM == null) {
            return null;
        }
        return new defpackage.eag(displayCutoutM);
    }

    @Override // defpackage.edc
    public defpackage.edf C() {
        return defpackage.edf.q(hh$.ExternalSyntheticApiModelOutline0.m(this.a), null);
    }

    @Override // defpackage.ecu, defpackage.edc
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ecw)) {
            return false;
        }
        defpackage.ecw ecwVar = (defpackage.ecw) obj;
        return j$.util.Objects.equals(this.a, ecwVar.a) && j$.util.Objects.equals(this.b, ecwVar.b) && v(this.c, ecwVar.c);
    }

    @Override // defpackage.edc
    public int hashCode() {
        return this.a.hashCode();
    }

    public ecw(defpackage.edf edfVar, defpackage.ecw ecwVar) {
        super(edfVar, ecwVar);
    }
}
