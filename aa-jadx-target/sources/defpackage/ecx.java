package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class ecx extends defpackage.ecw {
    private defpackage.dvl g;
    private defpackage.dvl h;
    private defpackage.dvl k;

    public ecx(defpackage.edf edfVar, android.view.WindowInsets windowInsets) {
        super(edfVar, windowInsets);
        this.g = null;
        this.h = null;
        this.k = null;
    }

    @Override // defpackage.edc
    public defpackage.dvl D() {
        defpackage.dvl dvlVar = this.h;
        if (dvlVar != null) {
            return dvlVar;
        }
        defpackage.dvl dvlVarF = defpackage.dvl.f(ep$.ExternalSyntheticApiModelOutline0.m$1(this.a));
        this.h = dvlVarF;
        return dvlVarF;
    }

    @Override // defpackage.edc
    public defpackage.dvl E() {
        defpackage.dvl dvlVar = this.g;
        if (dvlVar != null) {
            return dvlVar;
        }
        defpackage.dvl dvlVarF = defpackage.dvl.f(ep$.ExternalSyntheticApiModelOutline0.m$2(this.a));
        this.g = dvlVarF;
        return dvlVarF;
    }

    @Override // defpackage.edc
    public defpackage.dvl F() {
        defpackage.dvl dvlVar = this.k;
        if (dvlVar != null) {
            return dvlVar;
        }
        defpackage.dvl dvlVarF = defpackage.dvl.f(ep$.ExternalSyntheticApiModelOutline0.m(this.a));
        this.k = dvlVarF;
        return dvlVarF;
    }

    @Override // defpackage.ecu, defpackage.edc
    public defpackage.edf e(int i, int i2, int i3, int i4) {
        return defpackage.edf.q(ep$.ExternalSyntheticApiModelOutline0.m(this.a, i, i2, i3, i4), null);
    }

    public ecx(defpackage.edf edfVar, defpackage.ecx ecxVar) {
        super(edfVar, ecxVar);
        this.g = null;
        this.h = null;
        this.k = null;
    }

    @Override // defpackage.ecv, defpackage.edc
    public void z(defpackage.dvl dvlVar) {
    }
}
