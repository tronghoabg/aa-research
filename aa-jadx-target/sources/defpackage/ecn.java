package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ecn extends defpackage.ect {
    final android.view.WindowInsets.Builder a;

    public ecn(defpackage.edf edfVar) {
        super(edfVar);
        android.view.WindowInsets windowInsetsE = edfVar.e();
        this.a = windowInsetsE != null ? new android.view.WindowInsets.Builder(windowInsetsE) : new android.view.WindowInsets.Builder();
    }

    @Override // defpackage.ect
    public defpackage.edf a() {
        i();
        defpackage.edf edfVarQ = defpackage.edf.q(ep$.ExternalSyntheticApiModelOutline0.m(this.a), null);
        edfVarQ.t(this.b);
        edfVarQ.s(null);
        edfVarQ.w(this.c);
        edfVarQ.x(this.d);
        return edfVarQ;
    }

    @Override // defpackage.ect
    public void b(defpackage.dvl dvlVar) {
        ep$.ExternalSyntheticApiModelOutline0.m$1(this.a, dvlVar.a());
    }

    @Override // defpackage.ect
    public void c(defpackage.dvl dvlVar) {
        ep$.ExternalSyntheticApiModelOutline0.m(this.a, dvlVar.a());
    }

    @Override // defpackage.ect
    public void d(defpackage.dvl dvlVar) {
        ep$.ExternalSyntheticApiModelOutline0.m$2(this.a, dvlVar.a());
    }

    @Override // defpackage.ect
    public void e(defpackage.dvl dvlVar) {
        ep$.ExternalSyntheticApiModelOutline0.m$4(this.a, dvlVar.a());
    }

    @Override // defpackage.ect
    public void f(defpackage.dvl dvlVar) {
        ep$.ExternalSyntheticApiModelOutline0.m$3(this.a, dvlVar.a());
    }

    public ecn() {
        this.a = new android.view.WindowInsets.Builder();
    }
}
