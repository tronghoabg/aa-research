package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class lhm implements defpackage.lhn, defpackage.eqg {
    public final defpackage.eqi j = new defpackage.eqi(this, true);

    @Override // defpackage.lhn
    public void d() {
        boolean zC = defpackage.actt.c();
        defpackage.eqi eqiVar = this.j;
        if (!zC) {
            eqiVar.e(defpackage.epw.ON_STOP);
            return;
        }
        defpackage.epx epxVar = eqiVar.e;
        if (epxVar == defpackage.epx.a) {
            return;
        }
        if (epxVar.a(defpackage.epx.d)) {
            eqiVar.e(defpackage.epw.ON_STOP);
        }
        eqiVar.e(defpackage.epw.ON_DESTROY);
    }

    @Override // defpackage.lhn
    public void eQ() {
        defpackage.eqi eqiVar = this.j;
        eqiVar.e(defpackage.epw.ON_CREATE);
        eqiVar.e(defpackage.epw.ON_START);
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.j;
    }
}
