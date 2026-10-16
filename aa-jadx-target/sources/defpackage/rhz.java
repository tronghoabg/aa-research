package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rhz extends defpackage.rip {
    final /* synthetic */ defpackage.rib a;

    public rhz(defpackage.rib ribVar) {
        this.a = ribVar;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        defpackage.yqk yqkVar = defpackage.rib.a;
        yqkVar.l().ai(8140).y("PairingRequestReceiver#onReceive: intent=%s", intent.getAction());
        defpackage.rib ribVar = this.a;
        if (ribVar.n != 0) {
            yqkVar.l().ai(8145).u("BluetoothUtil not initialized or being cleaned up");
            return;
        }
        if (!"android.bluetooth.device.action.PAIRING_REQUEST".equals(intent.getAction())) {
            yqkVar.g().ai(8144).u("PairingRequestReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (!ribVar.g(bluetoothDevice)) {
            yqkVar.g().ai(8143).y("Wrong device is being paired: %s", bluetoothDevice);
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE);
        if (intExtra == Integer.MIN_VALUE) {
            yqkVar.g().ai(8142).u("Wrong Bluetooth pairing method");
            return;
        }
        int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", Integer.MIN_VALUE);
        yqkVar.l().ai(8141).B("PairingRequestReceiver#onReceive: pairing method=%d, pairing key=%d", intExtra, intExtra2);
        ribVar.p = intExtra;
        ribVar.q = intExtra2;
        defpackage.rbz.h(new defpackage.rid(ribVar, 1));
        abortBroadcast();
    }
}
