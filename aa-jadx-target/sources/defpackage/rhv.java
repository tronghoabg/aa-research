package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rhv extends defpackage.rip {
    final /* synthetic */ defpackage.rib a;

    public rhv(defpackage.rib ribVar) {
        this.a = ribVar;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        defpackage.yqk yqkVar = defpackage.rib.a;
        yqkVar.l().ai(8124).y("BondStateChangeReceiver#onReceive: intent=%s", intent.getAction());
        defpackage.rib ribVar = this.a;
        if (ribVar.n != 0) {
            yqkVar.l().ai(8128).u("BluetoothUtil not initialized or being cleaned up");
            return;
        }
        if (!"android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
            yqkVar.g().ai(8127).u("BondStateChangeReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (!ribVar.g(bluetoothDevice)) {
            yqkVar.l().ai(8126).y("Bond state changed, but not our device: %s", bluetoothDevice);
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
        if (yqkVar.l().Z()) {
            java.lang.String string = java.lang.Integer.toString(intExtra);
            if (intExtra == 10) {
                string = "NONE";
            } else if (intExtra == 11) {
                string = "BONDING";
            } else if (intExtra == 12) {
                string = "BONDED";
                intExtra = 12;
            }
            yqkVar.l().ai(8125).y("BondStateChangeReceiver#onReceive: new state=%s", string);
        }
        if (intExtra != 12) {
            if (intExtra == 10) {
                defpackage.wyz wyzVar = ribVar.t;
                defpackage.qsa.a.l().ai(7723).u("onUnpaired");
                defpackage.qsa qsaVar = (defpackage.qsa) wyzVar.a;
                qsaVar.e.c(defpackage.rhj.EVENT_UNPAIRED);
                qsaVar.m(new qrv(5));
                ribVar.e(defpackage.yyn.ANDROID_AUTO_BLUETOOTH_PAIRING_BOND_REMOVED);
                return;
            }
            return;
        }
        defpackage.wyz wyzVar2 = ribVar.t;
        wyzVar2.k();
        defpackage.rhg rhgVar = ribVar.f;
        yqkVar.f().ai(8150).y("attemptEnablePhoneBookAccessWithState, shouldEnablePbap=%b", java.lang.Boolean.valueOf(ribVar.s));
        if (rhgVar == null) {
            yqkVar.f().ai(8151).u("attemptEnablePhoneBookAccessWithState failed due to null device");
        } else if (ribVar.s) {
            rhgVar.g();
        } else {
            rhgVar.f();
        }
        boolean z = ribVar.s;
        boolean zC = rhgVar != null ? rhgVar.c() : false;
        yqkVar.f().ai(8185).Q("logPhonebookAccess expected:%b, observed:%b", z, zC);
        if (z == zC) {
            defpackage.qsa.a.f().ai(7722).u("logPhonebookAccess: expected same as observed");
            ((defpackage.qsa) wyzVar2.a).o.d(defpackage.zbe.BLUETOOTH, defpackage.zbd.qy);
        } else if (!z && zC) {
            defpackage.qsa.a.f().ai(7721).u("logPhonebookAccess: expected false, observed true");
            ((defpackage.qsa) wyzVar2.a).o.d(defpackage.zbe.BLUETOOTH, defpackage.zbd.qz);
        } else if (z && !zC) {
            defpackage.qsa.a.f().ai(7720).u("logPhonebookAccess: expected true, observed false");
            ((defpackage.qsa) wyzVar2.a).o.d(defpackage.zbe.BLUETOOTH, defpackage.zbd.qA);
        }
        ribVar.e(defpackage.yyn.ANDROID_AUTO_BLUETOOTH_PAIRING_BOND_CREATED);
    }
}
