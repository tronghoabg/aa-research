package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rhu extends defpackage.rip {
    final /* synthetic */ defpackage.rib a;

    public rhu(defpackage.rib ribVar) {
        this.a = ribVar;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        defpackage.yqk yqkVar = defpackage.rib.a;
        yqkVar.l().ai(8118).y("AdapterStateChangeReceiver#onReceive: intent=%s", intent.getAction());
        defpackage.rib ribVar = this.a;
        if (ribVar.n != 0) {
            yqkVar.l().ai(8123).u("BluetoothUtil not initialized or being cleaned up");
            return;
        }
        if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            yqkVar.g().ai(8122).u("AdapterStateChangeReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
        if (yqkVar.l().Z()) {
            java.lang.String string = java.lang.Integer.toString(intExtra);
            if (intExtra == 10) {
                string = "OFF";
            } else if (intExtra == 11) {
                string = "TURNING_ON";
            } else if (intExtra == 12) {
                string = "ON";
            } else if (intExtra == 13) {
                string = "TURNING_OFF";
                intExtra = 13;
            }
            yqkVar.l().ai(8121).y("new state=%s", string);
        }
        if (intExtra == 12) {
            yqkVar.l().ai(8120).u("Bluetooth has just been enabled");
            defpackage.rhf rhfVar = ribVar.d;
            rhfVar.getClass();
            rhfVar.g();
            defpackage.wyz wyzVar = ribVar.t;
            defpackage.qsa.a.l().ai(7716).u("onEnabled");
            defpackage.qsa qsaVar = (defpackage.qsa) wyzVar.a;
            qsaVar.e.c(defpackage.rhj.EVENT_ENABLED);
            qsaVar.m(new qrv(6));
            return;
        }
        if (intExtra == 10) {
            yqkVar.l().ai(8119).u("Bluetooth disabled");
            defpackage.rhs rhsVar = ribVar.o;
            if (rhsVar != null) {
                rhsVar.d();
                ribVar.o = null;
            }
            defpackage.wyz wyzVar2 = ribVar.t;
            defpackage.qsa.a.l().ai(7715).u("onDisabled");
            defpackage.qsa qsaVar2 = (defpackage.qsa) wyzVar2.a;
            qsaVar2.h = null;
            qsaVar2.e.c(defpackage.rhj.EVENT_DISABLED);
            qsaVar2.m(new qrv(2));
        }
    }
}
