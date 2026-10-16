package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kxz implements defpackage.kxu {
    public final android.bluetooth.BluetoothHeadset a;
    public final android.bluetooth.BluetoothDevice b;
    public final defpackage.yqm c = defpackage.yqm.c("GH.Bt.VrAudioStrategy");

    public kxz(android.bluetooth.BluetoothHeadset bluetoothHeadset, android.bluetooth.BluetoothDevice bluetoothDevice) {
        this.a = bluetoothHeadset;
        this.b = bluetoothDevice;
    }

    @Override // defpackage.kxu
    public final void a() {
        android.bluetooth.BluetoothHeadset bluetoothHeadset = this.a;
        android.bluetooth.BluetoothDevice bluetoothDevice = this.b;
        boolean zStopVoiceRecognition = bluetoothHeadset.stopVoiceRecognition(bluetoothDevice);
        defpackage.yqm yqmVar = this.c;
        if (zStopVoiceRecognition) {
            ((defpackage.yqj) yqmVar.l().ai(3523)).y("Stopped voice recognition mode on %s", bluetoothDevice.getName());
        } else {
            ((defpackage.yqj) yqmVar.l().ai(3522)).y("Failed to stop voice recognition mode on %s", bluetoothDevice.getName());
        }
    }
}
