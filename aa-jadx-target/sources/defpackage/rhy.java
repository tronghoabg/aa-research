package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rhy extends defpackage.rip {
    final /* synthetic */ defpackage.rib a;

    public rhy(defpackage.rib ribVar) {
        this.a = ribVar;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        java.lang.Object parcelableExtra;
        defpackage.rib.a.f().ai(8139).y("Received intent %s for key missing receiver", intent);
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            parcelableExtra = ag$.ExternalSyntheticApiModelOutline0.m(intent, "android.bluetooth.device.extra.DEVICE", android.bluetooth.BluetoothDevice.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (!android.bluetooth.BluetoothDevice.class.isInstance(parcelableExtra)) {
                parcelableExtra = null;
            }
        }
        defpackage.rib ribVar = this.a;
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) parcelableExtra;
        bluetoothDevice.getClass();
        if (ribVar.g(bluetoothDevice)) {
            ribVar.j(ria.f);
            abortBroadcast();
        }
    }
}
