package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ock implements android.os.PowerManager.OnThermalStatusChangedListener {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ock(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.os.PowerManager.OnThermalStatusChangedListener
    public final void onThermalStatusChanged(int i) {
        int i2 = this.b;
        java.lang.Object obj = this.a;
        if (i2 == 0) {
            defpackage.eqp eqpVar = (defpackage.eqp) obj;
            eqpVar.m(java.lang.Integer.valueOf(i));
            ((defpackage.yqj) defpackage.ocl.a.f()).D("Severe thermal status changed. Thermal status: %d, isSevere+: %s", i, eqpVar.e());
        } else {
            defpackage.iya iyaVar = (defpackage.iya) obj;
            iyaVar.t = i;
            ((defpackage.yqj) defpackage.iya.a.l().ai((char) 1528)).w("Thermal status changed to %d", i);
            iyaVar.d();
        }
    }
}
