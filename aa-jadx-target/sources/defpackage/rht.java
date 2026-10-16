package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rht extends defpackage.rip {
    final /* synthetic */ defpackage.rib a;

    public rht(defpackage.rib ribVar) {
        this.a = ribVar;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        defpackage.yqk yqkVar = defpackage.rib.a;
        yqkVar.l().ai(8109).y("A2dpStateChangeReceiver#onReceive. intent=%s", intent.getAction());
        if ("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            yqkVar.h().ai(8117).B("A2DP playing state change, old:%d new:%d", intExtra, intExtra2);
            defpackage.rib ribVar = this.a;
            if (intExtra2 == 10) {
                defpackage.wyz wyzVar = ribVar.t;
                defpackage.qsa.a.h().ai(7711).u("A2DP playing while in projection. Trying disabling");
                ((defpackage.qsa) wyzVar.a).m.b();
                return;
            }
            return;
        }
        defpackage.rib ribVar2 = this.a;
        if (ribVar2.n != 0) {
            yqkVar.l().ai(8116).u("BluetoothUtil not initialized or being cleaned up");
            return;
        }
        if (!"android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            yqkVar.g().ai(8115).u("A2dpStateChangeReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (!ribVar2.g(bluetoothDevice)) {
            yqkVar.l().ai(8114).y("A2dp connection state changed, but not our device: %s", bluetoothDevice);
            return;
        }
        int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
        if (yqkVar.l().Z()) {
            java.lang.String string = java.lang.Integer.toString(intExtra3);
            if (intExtra3 == 0) {
                string = "DISCONNECTED";
            } else if (intExtra3 == 1) {
                string = "CONNECTING";
            } else if (intExtra3 == 2) {
                string = "CONNECTED";
            } else if (intExtra3 == 3) {
                string = "DISCONNECTING";
                intExtra3 = 3;
            }
            yqkVar.l().ai(8113).y("A2dpStateChangeReceiver#onReceive. new state=%s", string);
        }
        if (intExtra3 == 2) {
            yqkVar.l().ai(8112).u("Connected to A2DP");
            defpackage.wyz wyzVar2 = ribVar2.t;
            defpackage.qsa.a.l().ai(7710).u("onA2dpConnected");
            ((defpackage.qsa) wyzVar2.a).m.b();
            return;
        }
        if (intExtra3 == 1) {
            yqkVar.l().ai(8111).u("Connecting to A2DP");
            ((defpackage.qsa) ribVar2.t.a).m.a();
        } else if (intExtra3 == 0) {
            yqkVar.l().ai(8110).u("A2DP disconnected");
        }
    }
}
