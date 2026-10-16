package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rou implements android.os.Handler.Callback {
    private final java.lang.ref.WeakReference a;

    public rou(defpackage.qwp qwpVar) {
        this.a = new java.lang.ref.WeakReference(qwpVar);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (defpackage.omv.c("CAR.BT", 3)) {
            defpackage.rrx.d(3, "CAR.BT", null, "CarBluetoothClientHandlerCallback.handleMessage: msg code=%d", java.lang.Integer.valueOf(message.what));
        }
        defpackage.qwp qwpVar = (defpackage.qwp) this.a.get();
        if (qwpVar != null) {
            int i = message.what;
            synchronized (qwpVar.a) {
                try {
                    switch (i) {
                        case defpackage.abnt.b /* 0 */:
                            for (qrt qrtVar : qwpVar.b) {
                                if (defpackage.omv.c("CarBluetoothClient", 3)) {
                                    defpackage.rrx.d(3, "CarBluetoothClient", null, "Calling onEnabled for listener %s", qrtVar);
                                }
                                qrtVar.d();
                            }
                            break;
                        case 1:
                            for (qrt qrtVar2 : qwpVar.b) {
                                if (defpackage.omv.c("CarBluetoothClient", 3)) {
                                    defpackage.rrx.d(3, "CarBluetoothClient", null, "Calling onDisabled for listener %s", qrtVar2);
                                }
                                qrtVar2.c();
                            }
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            for (qrt qrtVar3 : qwpVar.b) {
                                if (defpackage.omv.c("CarBluetoothClient", 3)) {
                                    defpackage.rrx.d(3, "CarBluetoothClient", null, "Calling onCarDelayedPairing for listener %s", qrtVar3);
                                }
                                qrtVar3.a();
                            }
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            for (qrt qrtVar4 : qwpVar.b) {
                                if (defpackage.omv.c("CarBluetoothClient", 3)) {
                                    defpackage.rrx.d(3, "CarBluetoothClient", null, "Calling onPaired for listener %s", qrtVar4);
                                }
                                qrtVar4.g();
                            }
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            for (qrt qrtVar5 : qwpVar.b) {
                                if (defpackage.omv.c("CarBluetoothClient", 3)) {
                                    defpackage.rrx.d(3, "CarBluetoothClient", null, "Calling onUnpaired for listener %s", qrtVar5);
                                }
                                qrtVar5.h();
                            }
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            for (qrt qrtVar6 : qwpVar.b) {
                                if (defpackage.omv.c("CarBluetoothClient", 3)) {
                                    defpackage.rrx.d(3, "CarBluetoothClient", null, "Calling onHfpConnected for listener %s", qrtVar6);
                                }
                                qrtVar6.e();
                            }
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            for (qrt qrtVar7 : qwpVar.b) {
                                if (defpackage.omv.c("CarBluetoothClient", 3)) {
                                    defpackage.rrx.d(3, "CarBluetoothClient", null, "Calling onHfpDisconnected for listener %s", qrtVar7);
                                }
                                qrtVar7.f();
                            }
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            java.util.Set<qrt> set = qwpVar.b;
                            for (qrt qrtVar8 : set) {
                                if (defpackage.omv.c("CarBluetoothClient", 3)) {
                                    defpackage.rrx.d(3, "CarBluetoothClient", null, "Calling onCarDisconnected for listener %s", qrtVar8);
                                }
                                qrtVar8.b();
                            }
                            set.clear();
                            break;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } else if (defpackage.omv.c("CAR.BT", 3)) {
            defpackage.rrx.a("CAR.BT", null, "outer object has already gone");
        }
        return true;
    }
}
