package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;

/* loaded from: classes.dex */
final class rhb extends rht {
    final /* synthetic */ rhg a;

    public rhb(rhg rhgVar) {
        this.a = rhgVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        rhg rhgVar = this.a;
        if (rhgVar.n != 0) {
            rhg.a.l().ai(8106).u("BluetoothUtil not initialized or being cleaned up");
            return;
        }
        if (!"android.bluetooth.device.action.UUID".equals(intent.getAction())) {
            rhg.a.g().ai(8105).u("FetchUuidReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (!rhgVar.f(bluetoothDevice)) {
            rhg.a.l().ai(8104).y("Not our device: %s", bluetoothDevice);
            return;
        }
        String str = rhgVar.e;
        if (str == null) {
            rhgVar.f = null;
            return;
        }
        rgk rgkVar = rhgVar.d;
        rgkVar.getClass();
        rhgVar.f = rgkVar.b(str);
        rgx rgxVar = rhgVar.o;
        if (rgxVar == null) {
            return;
        }
        rgl rglVar = rhgVar.f;
        rglVar.getClass();
        rgxVar.c = rglVar.a;
        rhgVar.t.l();
    }
}
