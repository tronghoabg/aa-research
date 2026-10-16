package defpackage;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;

/* loaded from: classes.dex */
public final class rgw implements BluetoothProfile.ServiceListener {
    final /* synthetic */ rgx a;

    public rgw(rgx rgxVar) {
        this.a = rgxVar;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        rgx rgxVar = this.a;
        if (rgxVar.f) {
            rgx.a.l().ai(8077).u("skipping hfp onServiceConnected - object is invalidated");
            return;
        }
        ypf ypfVar = rgx.a;
        ypfVar.l().ai(8075).u("hfp onServiceConnected");
        if (i != 1) {
            ypfVar.h().ai(8076).w("hfp onServiceConnected: wrong profile=%d", i);
            return;
        }
        rgxVar.e = new rgu((BluetoothHeadset) bluetoothProfile);
        if (rgxVar.e == null) {
            ypfVar.l().ai(8081).u("BluetoothProfileUtilImpl is not initialized");
        } else {
            ypfVar.l().ai(8080).u("BluetoothProfileUtilImpl initialized");
            rgxVar.d.run();
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        rgx.a.l().ai(8078).u("hfp onServiceDisconnected");
    }
}
