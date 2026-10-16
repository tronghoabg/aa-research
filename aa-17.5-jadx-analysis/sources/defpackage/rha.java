package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;

/* loaded from: classes.dex */
final class rha extends rht {
    final /* synthetic */ rhg a;

    public rha(rhg rhgVar) {
        this.a = rhgVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        ypf ypfVar = rhg.a;
        ypfVar.l().ai(8099).y("BondStateChangeReceiver#onReceive: intent=%s", intent.getAction());
        rhg rhgVar = this.a;
        if (rhgVar.n != 0) {
            ypfVar.l().ai(8103).u("BluetoothUtil not initialized or being cleaned up");
            return;
        }
        if (!"android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
            ypfVar.g().ai(8102).u("BondStateChangeReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (!rhgVar.f(bluetoothDevice)) {
            ypfVar.l().ai(8101).y("Bond state changed, but not our device: %s", bluetoothDevice);
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
        if (ypfVar.l().Z()) {
            String string = Integer.toString(intExtra);
            if (intExtra == 10) {
                string = "NONE";
            } else if (intExtra == 11) {
                string = "BONDING";
            } else if (intExtra == 12) {
                string = "BONDED";
                intExtra = 12;
            }
            ypfVar.l().ai(8100).y("BondStateChangeReceiver#onReceive: new state=%s", string);
        }
        if (intExtra != 12) {
            if (intExtra == 10) {
                wyd wydVar = rhgVar.t;
                qrg.a.l().ai(7698).u("onUnpaired");
                qrg qrgVar = (qrg) wydVar.a;
                qrgVar.e.c(rgo.EVENT_UNPAIRED);
                qrgVar.m(new qra(5));
                rhgVar.d(yxi.ANDROID_AUTO_BLUETOOTH_PAIRING_BOND_REMOVED);
                return;
            }
            return;
        }
        wyd wydVar2 = rhgVar.t;
        wydVar2.l();
        rgl rglVar = rhgVar.f;
        ypfVar.f().ai(8125).y("attemptEnablePhoneBookAccessWithState, shouldEnablePbap=%b", Boolean.valueOf(rhgVar.s));
        if (rglVar == null) {
            ypfVar.f().ai(8126).u("attemptEnablePhoneBookAccessWithState failed due to null device");
        } else if (rhgVar.s) {
            rglVar.g();
        } else {
            rglVar.f();
        }
        boolean z = rhgVar.s;
        boolean zC = rglVar != null ? rglVar.c() : false;
        ypfVar.f().ai(8160).Q("logPhonebookAccess expected:%b, observed:%b", z, zC);
        if (z == zC) {
            qrg.a.f().ai(7697).u("logPhonebookAccess: expected same as observed");
            ((qrg) wydVar2.a).o.d(yzz.BLUETOOTH, yzy.qw);
        } else if (!z && zC) {
            qrg.a.f().ai(7696).u("logPhonebookAccess: expected false, observed true");
            ((qrg) wydVar2.a).o.d(yzz.BLUETOOTH, yzy.qx);
        } else if (z && !zC) {
            qrg.a.f().ai(7695).u("logPhonebookAccess: expected true, observed false");
            ((qrg) wydVar2.a).o.d(yzz.BLUETOOTH, yzy.qy);
        }
        rhgVar.d(yxi.ANDROID_AUTO_BLUETOOTH_PAIRING_BOND_CREATED);
    }
}
