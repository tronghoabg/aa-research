package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Set;

/* loaded from: classes.dex */
public final class rnz implements Handler.Callback {
    private final WeakReference a;

    public rnz(qvt qvtVar) {
        this.a = new WeakReference(qvtVar);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (omc.c("CAR.BT", 3)) {
            rrd.d(3, "CAR.BT", null, "CarBluetoothClientHandlerCallback.handleMessage: msg code=%d", Integer.valueOf(message.what));
        }
        qvt qvtVar = (qvt) this.a.get();
        if (qvtVar != null) {
            int i = message.what;
            synchronized (qvtVar.a) {
                switch (i) {
                    case 0:
                        for (qqx qqxVar : qvtVar.b) {
                            if (omc.c("CarBluetoothClient", 3)) {
                                rrd.d(3, "CarBluetoothClient", null, "Calling onEnabled for listener %s", qqxVar);
                            }
                            qqxVar.d();
                        }
                        break;
                    case 1:
                        for (qqx qqxVar2 : qvtVar.b) {
                            if (omc.c("CarBluetoothClient", 3)) {
                                rrd.d(3, "CarBluetoothClient", null, "Calling onDisabled for listener %s", qqxVar2);
                            }
                            qqxVar2.c();
                        }
                        break;
                    case 2:
                        for (qqx qqxVar3 : qvtVar.b) {
                            if (omc.c("CarBluetoothClient", 3)) {
                                rrd.d(3, "CarBluetoothClient", null, "Calling onCarDelayedPairing for listener %s", qqxVar3);
                            }
                            qqxVar3.a();
                        }
                        break;
                    case 3:
                        for (qqx qqxVar4 : qvtVar.b) {
                            if (omc.c("CarBluetoothClient", 3)) {
                                rrd.d(3, "CarBluetoothClient", null, "Calling onPaired for listener %s", qqxVar4);
                            }
                            qqxVar4.g();
                        }
                        break;
                    case 4:
                        for (qqx qqxVar5 : qvtVar.b) {
                            if (omc.c("CarBluetoothClient", 3)) {
                                rrd.d(3, "CarBluetoothClient", null, "Calling onUnpaired for listener %s", qqxVar5);
                            }
                            qqxVar5.h();
                        }
                        break;
                    case 5:
                        for (qqx qqxVar6 : qvtVar.b) {
                            if (omc.c("CarBluetoothClient", 3)) {
                                rrd.d(3, "CarBluetoothClient", null, "Calling onHfpConnected for listener %s", qqxVar6);
                            }
                            qqxVar6.e();
                        }
                        break;
                    case 6:
                        for (qqx qqxVar7 : qvtVar.b) {
                            if (omc.c("CarBluetoothClient", 3)) {
                                rrd.d(3, "CarBluetoothClient", null, "Calling onHfpDisconnected for listener %s", qqxVar7);
                            }
                            qqxVar7.f();
                        }
                        break;
                    case 7:
                        Set<qqx> set = qvtVar.b;
                        for (qqx qqxVar8 : set) {
                            if (omc.c("CarBluetoothClient", 3)) {
                                rrd.d(3, "CarBluetoothClient", null, "Calling onCarDisconnected for listener %s", qqxVar8);
                            }
                            qqxVar8.b();
                        }
                        set.clear();
                        break;
                }
            }
        } else if (omc.c("CAR.BT", 3)) {
            rrd.a("CAR.BT", null, "outer object has already gone");
        }
        return true;
    }
}
