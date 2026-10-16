package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rhw extends defpackage.rip {
    final /* synthetic */ defpackage.rib a;

    public rhw(defpackage.rib ribVar) {
        this.a = ribVar;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        defpackage.rib ribVar = this.a;
        if (ribVar.n != 0) {
            defpackage.rib.a.l().ai(8131).u("BluetoothUtil not initialized or being cleaned up");
            return;
        }
        if (!"android.bluetooth.device.action.UUID".equals(intent.getAction())) {
            defpackage.rib.a.g().ai(8130).u("FetchUuidReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (!ribVar.g(bluetoothDevice)) {
            defpackage.rib.a.l().ai(8129).y("Not our device: %s", bluetoothDevice);
            return;
        }
        java.lang.String str = ribVar.e;
        if (str == null) {
            ribVar.f = null;
            return;
        }
        defpackage.rhf rhfVar = ribVar.d;
        rhfVar.getClass();
        ribVar.f = rhfVar.b(str);
        defpackage.rhs rhsVar = ribVar.o;
        if (rhsVar == null) {
            return;
        }
        defpackage.rhg rhgVar = ribVar.f;
        rhgVar.getClass();
        rhsVar.c = rhgVar.a;
        ribVar.t.k();
    }
}
