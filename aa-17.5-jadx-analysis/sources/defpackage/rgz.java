package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
final class rgz extends rht {
    final /* synthetic */ rhg a;

    public rgz(rhg rhgVar) {
        this.a = rhgVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        ypf ypfVar = rhg.a;
        ypfVar.l().ai(8093).y("AdapterStateChangeReceiver#onReceive: intent=%s", intent.getAction());
        rhg rhgVar = this.a;
        if (rhgVar.n != 0) {
            ypfVar.l().ai(8098).u("BluetoothUtil not initialized or being cleaned up");
            return;
        }
        if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            ypfVar.g().ai(8097).u("AdapterStateChangeReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
        if (ypfVar.l().Z()) {
            String string = Integer.toString(intExtra);
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
            ypfVar.l().ai(8096).y("new state=%s", string);
        }
        if (intExtra == 12) {
            ypfVar.l().ai(8095).u("Bluetooth has just been enabled");
            rgk rgkVar = rhgVar.d;
            rgkVar.getClass();
            rgkVar.g();
            wyd wydVar = rhgVar.t;
            qrg.a.l().ai(7691).u("onEnabled");
            qrg qrgVar = (qrg) wydVar.a;
            qrgVar.e.c(rgo.EVENT_ENABLED);
            qrgVar.m(new qra(6));
            return;
        }
        if (intExtra == 10) {
            ypfVar.l().ai(8094).u("Bluetooth disabled");
            rgx rgxVar = rhgVar.o;
            if (rgxVar != null) {
                rgxVar.d();
                rhgVar.o = null;
            }
            wyd wydVar2 = rhgVar.t;
            qrg.a.l().ai(7690).u("onDisabled");
            qrg qrgVar2 = (qrg) wydVar2.a;
            qrgVar2.h = null;
            qrgVar2.e.c(rgo.EVENT_DISABLED);
            qrgVar2.m(new qra(2));
        }
    }
}
