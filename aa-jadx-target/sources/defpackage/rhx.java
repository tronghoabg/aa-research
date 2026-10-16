package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rhx extends defpackage.rip {
    final /* synthetic */ defpackage.rib a;

    public rhx(defpackage.rib ribVar) {
        this.a = ribVar;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        defpackage.yqk yqkVar = defpackage.rib.a;
        yqkVar.l().ai(8132).y("HeadsetConnectionStateChangeReceiver#onReceive. intent=%s", intent.getAction());
        defpackage.rib ribVar = this.a;
        if (ribVar.n != 0) {
            yqkVar.l().ai(8138).u("BluetoothUtil not initialized or being cleaned up");
            return;
        }
        if (!"android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            yqkVar.g().ai(8137).u("HeadsetConnectionStateChangeReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (!ribVar.g(bluetoothDevice)) {
            yqkVar.l().ai(8136).y("HFP connection state changed, but not our device: %s", bluetoothDevice);
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
        if (yqkVar.l().Z()) {
            java.lang.String string = java.lang.Integer.toString(intExtra);
            if (intExtra == 0) {
                string = "DISCONNECTED";
            } else if (intExtra == 1) {
                string = "CONNECTING";
            } else if (intExtra == 2) {
                string = "CONNECTED";
            } else if (intExtra == 3) {
                string = "DISCONNECTING";
                intExtra = 3;
            }
            yqkVar.l().ai(8135).y("HeadsetConnectionStateChangeReceiver#onReceive. new state=%s", string);
        }
        if (intExtra != 2) {
            if (intExtra == 0) {
                yqkVar.l().ai(8133).u("Disconnected HFP");
                defpackage.wyz wyzVar = ribVar.t;
                defpackage.qsa.a.l().ai(7718).u("onHfpDisconnected");
                defpackage.qsa qsaVar = (defpackage.qsa) wyzVar.a;
                qsaVar.e.c(defpackage.rhj.EVENT_HFP_DISCONNECTED);
                qsaVar.m(new qrv(3));
                return;
            }
            return;
        }
        yqkVar.l().ai(8134).u("Connected to HFP");
        java.lang.String str = ribVar.e;
        if (str != null) {
            defpackage.rhf rhfVar = ribVar.d;
            rhfVar.getClass();
            ribVar.f = rhfVar.b(str);
        } else {
            ribVar.f = null;
        }
        defpackage.rhs rhsVar = ribVar.o;
        if (rhsVar == null) {
            return;
        }
        defpackage.rhg rhgVar = ribVar.f;
        rhgVar.getClass();
        rhsVar.c = rhgVar.a;
        defpackage.wyz wyzVar2 = ribVar.t;
        defpackage.qsa.a.l().ai(7717).u("onHfpConnected");
        defpackage.qsa qsaVar2 = (defpackage.qsa) wyzVar2.a;
        qsaVar2.e.c(defpackage.rhj.EVENT_HFP_CONNECTED);
        qsaVar2.m(new qrv(7));
        rxy.l(qsaVar2.n, yyt.q);
    }
}
