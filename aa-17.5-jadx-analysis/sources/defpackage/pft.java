package defpackage;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes2.dex */
public final class pft implements eqn {
    boolean a = false;
    final /* synthetic */ pgr b;
    private final /* synthetic */ int c;

    public pft(pgr pgrVar, int i) {
        this.c = i;
        this.b = pgrVar;
    }

    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        if (this.c == 0) {
            pcq pcqVar = (pcq) obj;
            if (!this.a) {
                ((ype) pgr.a.l().ai((char) 6464)).y("Ignoring first headUnitState update of %s. ", pcqVar.name());
                this.a = true;
                return;
            } else {
                if (pcqVar == pcq.a) {
                    yph yphVar = pgr.a;
                    ((ype) ((ype) yphVar.f()).ai((char) 6461)).u("Observed BLUETOOTH_UNBONDED state. Checking if we can stop.");
                    pgr pgrVar = this.b;
                    pgrVar.w(yxi.WIRELESS_SETUP_DEVICE_UNBONDED);
                    if (pgrVar.w.containsValue(pfz.b)) {
                        ((ype) ((ype) yphVar.f()).ai((char) 6462)).u("Active GAL connection exists. Deferring stop.");
                        return;
                    }
                    ((ype) ((ype) yphVar.f()).ai((char) 6463)).u("No active GAL connection. Stopping WSEM.");
                    pgrVar.w(yxi.WIRELESS_SETUP_TEAR_DOWN_TRIGGERED_DUE_TO_UNBOND);
                    pgrVar.ah(true);
                    return;
                }
                return;
            }
        }
        pcq pcqVar2 = (pcq) obj;
        woy.aa(pgr.ab(), "Head unit state observer should only be registered when WifiIntentionManager is enabled.");
        if (!this.a) {
            ((ype) pgr.a.l().ai((char) 6460)).y("Ignoring first headUnitState update of %s. ", pcqVar2.name());
            this.a = true;
            return;
        }
        yph yphVar2 = pgr.a;
        ((ype) yphVar2.l().ai((char) 6458)).y("Observing headUnitState: %s", pcqVar2.name());
        pgr pgrVar2 = this.b;
        if (((Boolean) pgrVar2.av.v()).booleanValue()) {
            return;
        }
        BluetoothDevice bluetoothDevice = pgrVar2.r;
        if (pgr.ad(pcqVar2, 1, pgrVar2.h(pgrVar2.m(bluetoothDevice)))) {
            return;
        }
        ype ypeVar = (ype) ((ype) yphVar2.f()).ai(6459);
        String strName = pcqVar2.name();
        int i = ((uk) pgrVar2.at.v()).a;
        String strE = osq.E(i);
        if (i == 0) {
            throw null;
        }
        ypeVar.R("Observed disconnected head unit with state %s for device %s, wifiIntentionState: %s, trying to stop.", strName, bluetoothDevice, strE);
        pgrVar2.ae();
    }
}
