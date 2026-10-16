package defpackage;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothDevice;

/* loaded from: classes.dex */
public final class rgj {
    public static final ypf a = ols.R("CAR.BT.A2dpDisabler");
    public final rgk b;
    public final BluetoothDevice c;
    public boolean d;
    public boolean e;
    public kgx f;

    public rgj(rgk rgkVar, String str) {
        this.b = rgkVar;
        rgl rglVarB = rgkVar.b(str);
        rglVarB.getClass();
        this.c = rglVarB.a;
    }

    public final void a() {
        kgx kgxVar = this.f;
        if (kgxVar != null) {
            try {
                boolean z = this.e;
                BluetoothDevice bluetoothDevice = this.c;
                this.e = (((BluetoothA2dp) kgxVar.a).getConnectionPolicy(bluetoothDevice) == 100) | z;
                this.f.e(bluetoothDevice, 0);
            } catch (SecurityException e) {
                a.g().p(e).ai(8017).u("a2dp cannot be disabled during drive");
            }
        }
    }
}
