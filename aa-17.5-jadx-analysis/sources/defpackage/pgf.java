package defpackage;

import android.app.ActivityOptions;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.net.LinkProperties;
import android.net.Network;
import android.net.wifi.WifiInfo;
import android.os.Build;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessStartupActivity;
import com.google.android.gms.car.bluetooth.data.AutoValue_CarBluetoothData;
import com.google.android.gms.carsetup.CarInfoInternal;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.EnumSet;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pgf implements ozs {
    public pbw a;
    final /* synthetic */ pgr b;
    private final boolean c;
    private final pbx d;
    private final pab e;
    private final String f;
    private final Integer g;

    public pgf(pgr pgrVar, pbx pbxVar, pab pabVar, boolean z, String str, Integer num) {
        this.b = pgrVar;
        this.d = pbxVar;
        this.e = pabVar;
        this.c = z;
        this.f = str;
        this.g = num;
    }

    private final void g(ozr ozrVar) {
        yph yphVar = pgr.a;
        ((ype) yphVar.l().ai((char) 6485)).y("WSEM#onProjectionNetworkLost connectionFailureReason: %s", ozrVar.name());
        wer.c();
        pgr pgrVar = this.b;
        pgrVar.aq.w(pgm.a);
        pgrVar.w(yxi.WIRELESS_WIFI_NETWORK_CONNECTION_LOST);
        if (!((Boolean) pgrVar.av.v()).booleanValue()) {
            ((ype) yphVar.l().ai((char) 6486)).u("WPP connection loop terminated, so initiate shutdown");
            pgrVar.w(yxi.WIRELESS_WIFI_NETWORK_DISCONNECTED_AFTER_WPP_STOPPED);
            pgrVar.ah(true);
            return;
        }
        Map map = pgrVar.w;
        int i = 4;
        ygr ygrVar = (ygr) yum.f(map).e(new oly(12)).i(new moq(i)).filter(new pcx(this, i)).collect(ycm.b);
        if (!ygrVar.isEmpty()) {
            pgrVar.w(yxi.WIRELESS_NETWORK_LOSS_WHILE_EARLIER_GAL_ATTEMPTS_PENDING);
        }
        boolean z = pgr.U() && !ozrVar.c();
        if (z) {
            ((uk) pgrVar.at.v()).d(pgrVar.i(ozrVar).b);
        }
        if (acot.w()) {
            boolean zContainsValue = map.containsValue(pfz.b);
            if (!z && zContainsValue) {
                pgrVar.w(yxi.WIRELESS_WIFI_NETWORK_DISCONNECTED_UNEXPECTEDLY_WHILE_GAL_CONNECTED);
            }
        }
        if (acot.w() && z) {
            pgrVar.w(yxi.WIRELESS_WIFI_NETWORK_DISCONNECTED_INTENTIONALLY);
        }
        yno it = ygrVar.iterator();
        while (it.hasNext()) {
            f((pbw) it.next(), pfz.c);
        }
        pbw pbwVar = this.a;
        pbwVar.getClass();
        f(pbwVar, pfz.c);
        if (z) {
            pgrVar.J(pgrVar.i(ozrVar).a);
        }
    }

    @Override // defpackage.ozs
    public final void a(WifiInfo wifiInfo, Network network, LinkProperties linkProperties) {
        String str = this.f;
        str.getClass();
        Integer num = this.g;
        num.getClass();
        e(str, num.intValue(), wifiInfo, network);
    }

    @Override // defpackage.ozs
    public final void b(ozr ozrVar) {
        g(ozrVar);
    }

    @Override // defpackage.ozs
    public final void c(ozr ozrVar) {
        pgr pgrVar = this.b;
        pgrVar.aq.w(pgm.a);
        pgrVar.aA.w(pfv.a);
        if (ozrVar == ozr.t) {
            pgrVar.O(pag.WIFI_FAILED_TO_AUTOMATICALLY_ENABLE);
            pgrVar.I(this.e, pdm.a);
        } else {
            pgrVar.O(pag.ABORTED_WIFI);
            pgrVar.af(this.e, 1);
        }
        if (pgr.U() && !ozrVar.c()) {
            pgrVar.s(ozrVar);
            return;
        }
        yph yphVar = pgr.a;
        yop yopVarH = yphVar.h();
        gjv gjvVar = pgrVar.ak;
        ((ype) ((ype) yopVarH).ai((char) 6487)).y("Network unavailable. Info response state=%s", gjvVar.v());
        if (((pgp) gjvVar.v()).equals(pgp.a) || ((pgp) gjvVar.v()).equals(pgp.c)) {
            pgrVar.D(ozrVar);
        } else if (((Boolean) pgrVar.av.v()).booleanValue()) {
            ((ype) ((ype) yphVar.f()).ai((char) 6609)).u("Do not process network callback due to ongoing wireless setup.");
            ((ype) yphVar.l().ai((char) 6488)).u("WPP connection loop ongoing and waiting for wifi info, do nothing");
        } else {
            ((ype) yphVar.l().ai((char) 6489)).u("WPP connection loop terminated, so initiate shutdown");
            pgrVar.ae();
        }
    }

    public final void d() {
        g(ozr.v);
    }

    public final void e(String str, int i, WifiInfo wifiInfo, Network network) {
        yxi yxiVar;
        wer.c();
        pgr pgrVar = this.b;
        if (a.O()) {
            pgrVar.O(pag.CONNECTED_WIFI);
            pgrVar.af(this.e, 12);
            pgrVar.J(pag.PROJECTION_INITIATED);
        }
        oqe oqeVar = pgrVar.X;
        pgrVar.aq.w(pgm.c);
        wer.c();
        yph yphVar = pgr.a;
        ((ype) ((ype) yphVar.f()).ai((char) 6490)).u("Processing projection network");
        pgrVar.z(wifiInfo);
        pga pgaVar = pga.a;
        EnumSet enumSetOf = EnumSet.of(pgaVar);
        ((ype) ((ype) yphVar.f()).ai((char) 6491)).u("Handing off to begin TCP connection");
        BluetoothDevice bluetoothDevice = pgrVar.r;
        ajdr ajdrVar = pgrVar.aj;
        boolean zJ = oqeVar.j(bluetoothDevice);
        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) ((eqj) ajdrVar.c).e();
        if (zJ && bluetoothDevice2 == null) {
            yxiVar = yxi.WIRELESS_BRIDGE_INTENT_REASON_DONGLE_ASSOCIATED_DEVICE_NULL;
        } else {
            if (true != zJ) {
                bluetoothDevice2 = bluetoothDevice;
            }
            Optional optionalA = pgrVar.O.a(bluetoothDevice2.getAddress());
            qrn qrnVar = (qrn) ((eqj) ajdrVar.d).e();
            ((ype) yphVar.l().ai((char) 6492)).y("headUnitCarInfoInternal: %s", optionalA);
            ((ype) yphVar.l().ai((char) 6493)).y("carClientToken: %s", qrnVar);
            if (!optionalA.isPresent()) {
                yxiVar = yxi.WIRELESS_BRIDGE_INTENT_REASON_CAR_INFO_ABSENT;
            } else if (qrnVar != null) {
                enumSetOf.remove(pgaVar);
                CarInfoInternal carInfoInternal = (CarInfoInternal) optionalA.get();
                Context context = pgrVar.q;
                sdl sdlVar = new sdl(context, new rob(carInfoInternal), new ono(qrnVar, null), new lfm(context));
                ((ype) yphVar.l().ai((char) 6495)).y("isFrxRequired: %s", Boolean.valueOf(sdlVar.e()));
                if (sdlVar.e()) {
                    enumSetOf.add(pga.b);
                    yxiVar = yxi.WIRELESS_BRIDGE_INTENT_REASON_FRX_REQUIRED;
                } else {
                    yxiVar = null;
                }
            } else {
                yxiVar = yxi.WIRELESS_BRIDGE_INTENT_REASON_CAR_CLIENT_TOKEN_NULL;
            }
        }
        if (aczv.bb() && woy.at("true", dlz.E("debug.car.skip_frx"))) {
            enumSetOf.clear();
        }
        gjv gjvVar = pgrVar.ap;
        Integer num = (Integer) gjvVar.v();
        gjvVar.w(Integer.valueOf(num.intValue() + 1));
        int iIntValue = num.intValue();
        wer.c();
        pge pgeVar = new pge(this, iIntValue);
        ((ype) ((ype) yphVar.f()).ai((char) 6484)).w("Requesting GAL socket, callback=%d", iIntValue);
        pgrVar.w.put(pgeVar, pfz.a);
        this.a = pgeVar;
        if (!enumSetOf.isEmpty() && yxiVar != null) {
            pgrVar.w(yxiVar);
            ((ype) ((ype) yphVar.f()).ai((char) 6494)).y("Bridge intent path taken because: %s", yxiVar.name());
        }
        pbx pbxVar = this.d;
        boolean zIsEmpty = enumSetOf.isEmpty();
        AutoValue_CarBluetoothData autoValue_CarBluetoothData = this.c ? new AutoValue_CarBluetoothData(bluetoothDevice, oqeVar.j(bluetoothDevice)) : null;
        pbw pbwVar = this.a;
        pfy pfyVar = new pfy(pgrVar);
        pbxVar.d = true;
        pbxVar.g = ajdrVar;
        Context context2 = pbxVar.b;
        Intent intent = new Intent(context2, (Class<?>) WirelessStartupActivity.class);
        Intent intentPutExtra = intent.addFlags(268435456).putExtra("PARAM_HOST_ADDRESS", str).putExtra("PARAM_SERVICE_PORT", i).putExtra("PARAM_SERVICE_WIFI_NETWORK", network).putExtra("wifi_info", wifiInfo);
        Object obj = ajdrVar.a;
        intentPutExtra.putExtra("WIFI_Q_ENABLED", a.O()).putExtra("WIFI_STARTING_BLUETOOTH_DEVICE", autoValue_CarBluetoothData);
        pbxVar.f = network;
        if (zIsEmpty) {
            pbxVar.a(intent, pbwVar, pfyVar);
            return;
        }
        WifiInfo wifiInfo2 = pbxVar.d ? (WifiInfo) intent.getExtras().getParcelable("wifi_info") : null;
        ((kny) pbxVar.g.e).e(yxi.WIRELESS_WIFI_LAUNCH_STARTUP_ACTIVITY, OptionalInt.of(wifiInfo2 != null ? wifiInfo2.getRssi() : Integer.MIN_VALUE));
        ((kny) pbxVar.g.e).d(yxi.WIRELESS_WIFI_STARTUP_MANAGER_BRIDGE_INTENT_HANDOFF_STARTED);
        context2.startActivity(intent, ActivityOptions.makeBasic().setLaunchDisplayId(0).toBundle());
    }

    public final void f(pbw pbwVar, pfz pfzVar) {
        wer.c();
        pfz pfzVar2 = pfz.b;
        woy.O(pfzVar == pfzVar2 || pfzVar == pfz.c, "processSocketStateForRestart called with PENDING");
        pgr pgrVar = this.b;
        Map map = pgrVar.w;
        pfz pfzVar3 = (pfz) map.get(pbwVar);
        pfzVar3.getClass();
        pfz pfzVar4 = pfz.c;
        if (pfzVar3 == pfzVar4) {
            ((ype) pgr.a.l().ai((char) 6502)).y("Received state %s after socket already marked disconnected", pfzVar);
            pgrVar.w(pfzVar == pfzVar4 ? yxi.WIRELESS_REDUNDANT_GAL_DISCONNECTION_SIGNAL_DROPPED : yxi.WIRELESS_GAL_SOCKET_CONNECTED_AFTER_MARKED_AS_DISCONNECTED);
            return;
        }
        map.put(pbwVar, pfzVar);
        if (map.containsValue(pfzVar2)) {
            ((ype) pgr.a.l().ai((char) 6501)).u("At least one socket is connected, do nothing");
            if (pfzVar == pfzVar4) {
                pgrVar.w(yxi.WIRELESS_GAL_SOCKET_FAILED_WHILE_ANOTHER_WAS_CONNECTED);
                return;
            }
            return;
        }
        if (!Collection.EL.stream(((tko) map).a()).allMatch(new pcx(pfzVar4, 5))) {
            ((ype) pgr.a.l().ai((char) 6496)).u("At least one request is still pending, do nothing");
            if (pfzVar == pfzVar4) {
                pgrVar.w(yxi.WIRELESS_GAL_SOCKET_FAILED_WHILE_ANOTHER_WAS_PENDING);
                return;
            }
            return;
        }
        BluetoothDevice bluetoothDevice = pgrVar.r;
        boolean zAa = pgrVar.aa(bluetoothDevice);
        if (!pgrVar.X.j(bluetoothDevice) && zAa && pgrVar.ai.e(bluetoothDevice, true) == pcq.a) {
            ((ype) ((ype) pgr.a.f()).ai((char) 6500)).u("All sockets disconnected and device is unbonded. Stopping WSEM.");
            pgrVar.w(yxi.WIRELESS_SETUP_TEAR_DOWN_TRIGGERED_DUE_TO_UNBOND);
            pgrVar.ah(true);
            return;
        }
        if (!pgr.ab() && !((Boolean) pgrVar.am.v()).booleanValue()) {
            ((ype) ((ype) pgr.a.f()).ai((char) 6499)).u("All requests are failed, but GAL was deliberately disconnected, so do not restart");
            return;
        }
        if (pgr.ab()) {
            gjv gjvVar = pgrVar.at;
            int i = ((uk) gjvVar.v()).a;
            if (i == 0) {
                throw null;
            }
            if (i != 1) {
                ((ype) ((ype) pgr.a.f()).ai((char) 6498)).u("All requests are failed, but GAL was deliberately disconnected, so do not restart");
                int i2 = ((uk) gjvVar.v()).a;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 != 3 || Build.VERSION.SDK_INT < 30) {
                    return;
                }
                pgrVar.P();
                return;
            }
        }
        ((ype) pgr.a.l().ai((char) 6497)).u("All requests are failed, proceed to restart WPP");
        pgrVar.D(ozr.c);
    }

    public final String toString() {
        return "WSEM.Callback@".concat(String.valueOf(Integer.toHexString(hashCode())));
    }
}
