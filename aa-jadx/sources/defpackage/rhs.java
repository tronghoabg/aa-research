package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rhs implements defpackage.rhq {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.BT");
    public final defpackage.rhf b;
    public android.bluetooth.BluetoothDevice c;
    public final java.lang.Runnable d;
    public defpackage.rhp e;
    public boolean f;

    public rhs(defpackage.rhf rhfVar, android.bluetooth.BluetoothDevice bluetoothDevice, java.lang.Runnable runnable) {
        a.l().ai(8104).u("BluetoothProfileUtilImpl");
        this.b = rhfVar;
        this.c = bluetoothDevice;
        this.d = runnable;
    }

    @Override // defpackage.rhq
    public final boolean a() {
        defpackage.rhp rhpVar = this.e;
        rhpVar.getClass();
        return rhpVar.a(this.c) == 2;
    }

    @Override // defpackage.rhq
    public final boolean b() {
        defpackage.rhp rhpVar = this.e;
        rhpVar.getClass();
        return rhpVar.a(this.c) == 1;
    }

    @Override // defpackage.rhq
    public final boolean c() {
        a.l().ai(8108).u("isInitialized");
        return this.e != null;
    }

    public final void d() {
        a.l().ai(8107).u("BluetoothProfileUtilImpl is cleaning up internal HFP proxy");
        this.f = true;
        defpackage.rhp rhpVar = this.e;
        if (rhpVar != null) {
            this.b.d(1, rhpVar.a);
            this.e = null;
        }
    }
}
