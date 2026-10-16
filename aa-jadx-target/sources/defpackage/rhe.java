package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rhe {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.BT.A2dpDisabler");
    public final defpackage.rhf b;
    public final android.bluetooth.BluetoothDevice c;
    public boolean d;
    public boolean e;
    public defpackage.khb f;

    public rhe(defpackage.rhf rhfVar, java.lang.String str) {
        this.b = rhfVar;
        defpackage.rhg rhgVarB = rhfVar.b(str);
        rhgVarB.getClass();
        this.c = rhgVarB.a;
    }

    public final void a() {
        defpackage.khb khbVar = this.f;
        if (khbVar != null) {
            try {
                boolean z = this.e;
                android.bluetooth.BluetoothDevice bluetoothDevice = this.c;
                this.e = (((android.bluetooth.BluetoothA2dp) khbVar.a).getConnectionPolicy(bluetoothDevice) == 100) | z;
                this.f.c(bluetoothDevice, 0);
            } catch (java.lang.SecurityException e) {
                a.g().p(e).ai(8042).u("a2dp cannot be disabled during drive");
            }
        }
    }
}
