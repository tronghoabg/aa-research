package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;

/* loaded from: classes2.dex */
final class kxt implements kxn {
    public final BluetoothHeadset a;
    public final BluetoothDevice b;
    public final yph c = yph.c("GH.Bt.VrAudioStrategy");

    public kxt(BluetoothHeadset bluetoothHeadset, BluetoothDevice bluetoothDevice) {
        this.a = bluetoothHeadset;
        this.b = bluetoothDevice;
    }

    @Override // defpackage.kxn
    public final void a() {
        BluetoothHeadset bluetoothHeadset = this.a;
        BluetoothDevice bluetoothDevice = this.b;
        boolean zStopVoiceRecognition = bluetoothHeadset.stopVoiceRecognition(bluetoothDevice);
        yph yphVar = this.c;
        if (zStopVoiceRecognition) {
            ((ype) yphVar.l().ai(3520)).y("Stopped voice recognition mode on %s", bluetoothDevice.getName());
        } else {
            ((ype) yphVar.l().ai(3519)).y("Failed to stop voice recognition mode on %s", bluetoothDevice.getName());
        }
    }
}
