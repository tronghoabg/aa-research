package defpackage;

import android.bluetooth.BluetoothProfile;

/* loaded from: classes2.dex */
final class kou implements BluetoothProfile.ServiceListener {
    final /* synthetic */ zhc a;

    public kou(zhc zhcVar) {
        this.a = zhcVar;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        yph yphVar = kow.a;
        this.a.o(bluetoothProfile);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        yph yphVar = kow.a;
    }
}
