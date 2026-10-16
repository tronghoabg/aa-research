package defpackage;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import java.util.Locale;

/* loaded from: classes2.dex */
final class rgg implements BluetoothProfile.ServiceListener {
    final /* synthetic */ int a;
    final /* synthetic */ rgk b;
    final /* synthetic */ String c;
    final /* synthetic */ rgh d;

    public rgg(rgh rghVar, int i, rgk rgkVar, String str) {
        this.a = i;
        this.b = rgkVar;
        this.c = str;
        this.d = rghVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.bluetooth.BluetoothProfile, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.bluetooth.BluetoothProfile, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.bluetooth.BluetoothProfile, java.lang.Object] */
    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        woy.aa(i == 2, String.format(Locale.US, "Unexpected profile %d", Integer.valueOf(i)));
        kgx kgxVar = new kgx((BluetoothA2dp) bluetoothProfile);
        try {
            if (((Boolean) this.d.b.get()).booleanValue()) {
                rgk rgkVar = this.b;
                rgl rglVarB = rgkVar.b(this.c);
                if (rglVarB == null) {
                    rgh.a.h().ai(8008).w("Cannot set A2DP policy for car to %d, device is null", this.a);
                    rgkVar.d(2, kgxVar.a);
                } else {
                    BluetoothDevice bluetoothDevice = rglVarB.a;
                    int i2 = this.a;
                    if (kgxVar.e(bluetoothDevice, i2)) {
                        rgh.a.f().ai(8007).w("Set A2DP policy for car to %d", i2);
                    } else {
                        rgh.a.f().ai(8006).w("Failed to set A2DP policy for car to %d", i2);
                    }
                }
            } else {
                rgh.a.f().ai(8009).w("Condition not met, so not setting A2DP policy for car to %d", this.a);
            }
        } finally {
            this.b.d(2, kgxVar.a);
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
    }
}
