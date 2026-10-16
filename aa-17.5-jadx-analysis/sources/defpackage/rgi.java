package defpackage;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothProfile;

/* loaded from: classes.dex */
public final class rgi implements BluetoothProfile.ServiceListener {
    final /* synthetic */ rgj a;

    public rgi(rgj rgjVar) {
        this.a = rgjVar;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        rgj rgjVar = this.a;
        if (rgjVar.d) {
            rgjVar.b.d(i, bluetoothProfile);
            rgj.a.f().ai(8015).u("skipping a2dp onServiceConnected - object is invalidated");
        } else {
            rgj.a.l().ai(8014).u("a2dp onServiceConnected");
            rgjVar.f = new kgx((BluetoothA2dp) bluetoothProfile);
            rgjVar.a();
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        rgj.a.l().ai(8016).u("a2dp onServiceDisconnected");
    }
}
