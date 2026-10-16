package defpackage;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes.dex */
public final /* synthetic */ class kph implements xxj {
    @Override // defpackage.xxj
    public final boolean a(Object obj) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
        yph yphVar = kpn.a;
        scx scxVarB = mpl.f().b();
        if (bluetoothDevice == null) {
            return false;
        }
        return ((scy) scxVarB).d(bluetoothDevice.getAddress());
    }
}
