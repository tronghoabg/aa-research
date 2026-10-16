package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class pgc {
    final /* synthetic */ pgr a;
    private long b = 0;

    public pgc(pgr pgrVar) {
        this.a = pgrVar;
    }

    public final void a(final pab pabVar, xpr xprVar, abow abowVar) {
        String str;
        yxi yxiVar;
        int iAp;
        wer.c();
        int iM = abowVar.m();
        yph yphVar = pgr.a;
        ((ype) yphVar.l().ai(6472)).R("Received message of type: %s, length: %d, from: %s", xprVar.name(), Integer.valueOf(iM), pabVar.a());
        final pgr pgrVar = this.a;
        pgrVar.r();
        pac pacVarA = pabVar.a();
        int i = 0;
        if (!knx.d.contains(xprVar)) {
            yfy yfyVar = knx.b;
            if (yfyVar.containsKey(xprVar)) {
                koa koaVar = (koa) yfyVar.get(xprVar);
                if (koaVar == null) {
                    throw new IllegalArgumentException(String.format("No matching wpp telemetry exists to send for received message type %s.", xprVar.name()));
                }
                pgrVar.ab.a(pacVarA, koaVar);
            } else {
                ((ype) ((ype) knx.a.h()).ai((char) 3263)).y("No connection event type for received wifi projection protocol message type: %s defined. No telemetry will be logged.", xprVar.name());
            }
        }
        pag pagVar = pag.WIFI_INVALID_PROJECTION_ENDPOINT;
        int i2 = 9;
        int i3 = 2;
        switch (xprVar) {
            case MESSAGE_WIFI_REQUEST_START_BT:
                xpx xpxVar = (xpx) abowVar;
                ype ypeVar = (ype) ((ype) yphVar.f()).ai(6536);
                if ((xpxVar.b & 4) != 0) {
                    int iAp2 = a.ap(xpxVar.e);
                    str = (iAp2 == 0 || iAp2 == 1) ? "USER_REQUEST" : iAp2 != 2 ? "AUTOMATIC_RESTART" : "AUTO_LAUNCH";
                } else {
                    str = "n/a";
                }
                ypeVar.y("Received WifiStartRequest, reason=%s", str);
                if (pgrVar.w.containsValue(pfz.b)) {
                    pgrVar.w(yxi.WIRELESS_PROJECTION_REQUESTED_WHILE_GAL_SOCKET_CONNECTED);
                }
                gjv gjvVar = pgrVar.ao;
                if (gjvVar.v() instanceof pgi) {
                    pgrVar.w(yxi.WIRELESS_PROJECTION_REQUESTED_AFTER_MD_REQUESTED);
                }
                pgrVar.p();
                gjvVar.w(new pgh(new gjv(pgrVar.Q)));
                ((ype) ((ype) yphVar.f()).ai((char) 6537)).u("Start request received, setting user intention.");
                if (pgr.ab()) {
                    ((uk) pgrVar.at.v()).d(pdo.a);
                } else {
                    pgrVar.am.w(true);
                }
                gjv gjvVar2 = pgrVar.an;
                if (gjvVar2.v() == pgn.a) {
                    ((ype) ((ype) yphVar.h()).ai((char) 6539)).u("Trying to proceed with WifiStartRequest before we received WifiVersionRequest");
                    pgrVar.w(yxi.WIRELESS_WIFI_VERSION_NOT_REQUESTED);
                    gjvVar2.w(pgn.d);
                }
                if ((xpxVar.b & 4) != 0) {
                    int iAp3 = a.ap(xpxVar.e);
                    if (iAp3 == 0) {
                        iAp3 = 1;
                    }
                    int i4 = iAp3 - 1;
                    yxiVar = i4 != 0 ? i4 != 1 ? yxi.WIRELESS_WIFI_PROJECTION_REQUESTED_BY_HU_DUE_TO_AUTOMATIC_RESTART : yxi.WIRELESS_WIFI_PROJECTION_REQUESTED_BY_HU_DUE_TO_AUTO_LAUNCH : yxi.WIRELESS_WIFI_PROJECTION_REQUESTED_BY_HU_DUE_TO_USER_REQUEST;
                } else {
                    yxiVar = yxi.WIRELESS_WIFI_PROJECTION_REQUESTED_BY_HU_WITHOUT_REASON;
                }
                pgrVar.w(yxiVar);
                if (!pgr.S(pgrVar.u, pgrVar.v) ? pgr.X(xpxVar.c) : pgr.W(xpxVar.c, xpxVar.d) && (xpxVar.b & 2) != 0) {
                    if (!pgr.S(pgrVar.u, pgrVar.v)) {
                        pgrVar.af(pabVar, 5);
                        return;
                    } else {
                        pgrVar.J(pag.WIFI_INVALID_PROJECTION_ENDPOINT);
                        ((ype) ((ype) yphVar.g()).ai(6538)).K("WifiStartRequest sent an invalid projection endpoint, IP: '%s', Port: '%d'", xpxVar.c, xpxVar.d);
                        return;
                    }
                }
                pgrVar.s = xpxVar.c;
                if ((xpxVar.b & 2) != 0) {
                    pgrVar.t = xpxVar.d;
                }
                pgrVar.J(pag.WIFI_PROJECTION_START_REQUESTED);
                WifiManager wifiManager = (WifiManager) pgrVar.q.getApplicationContext().getSystemService("wifi");
                if ((xpxVar.b & 4) != 0 && (iAp = a.ap(xpxVar.e)) != 0 && iAp == 3 && wifiManager.getWifiState() == 1) {
                    ((kny) pgrVar.aj.e).d(yxi.WIRELESS_WIFI_PROJECTION_REQUESTED_BY_HU_DUE_TO_AUTOMATIC_RESTART_WHILE_WIFI_DISABLED);
                    pgrVar.ag(pabVar, 2);
                    return;
                } else {
                    pgrVar.C(pabVar);
                    pgrVar.ag(pabVar, 12);
                    pgrVar.N(pgrVar.s, pgrVar.t, pabVar);
                    return;
                }
            case MESSAGE_WIFI_REQUEST_INFO_BT:
            case MESSAGE_WIFI_VERSION_RESPONSE_BT:
            case MESSAGE_WIFI_CONNECT_STATUS_BT:
            case MESSAGE_WIFI_PING_REQUEST_BT:
                ((ype) ((ype) yphVar.g()).ai(6473)).w("Unexpected message type: %s", xprVar.l);
                return;
            case MESSAGE_WIFI_RESPONSE_INFO_BT:
                xpq xpqVar = (xpq) abowVar;
                pgrVar.w(yxi.WIRELESS_RFCOMM_INFO_RESPONSE_RECEIVED);
                xpv xpvVarB = xpv.b(xpqVar.e);
                if (xpvVarB == null) {
                    xpvVarB = xpv.UNKNOWN_SECURITY_MODE;
                }
                xpv xpvVar = xpv.UNKNOWN_SECURITY_MODE;
                if (xpvVarB.equals(xpvVar)) {
                    pgrVar.w(yxi.WIRELESS_RFCOMM_INFO_RESPONSE_RECEIVED_WITH_UNKNOWN_SECURITY_MODE);
                }
                pgrVar.q();
                jbq jbqVar = new jbq(pgrVar.u, pgrVar.v);
                Optional optionalL = pgrVar.l(pgrVar.r);
                miq miqVar = new miq(jbqVar, 10);
                if (true == optionalL.isPresent()) {
                    optionalL = Optional.ofNullable(pgr.g((ozy) optionalL.get(), (jbq) miqVar.a));
                }
                String str2 = xpqVar.b;
                String str3 = xpqVar.d;
                String str4 = xpqVar.c;
                xpv xpvVarB2 = xpv.b(xpqVar.e);
                if (xpvVarB2 != null) {
                    xpvVar = xpvVarB2;
                }
                Optional optionalOfNullable = true != optionalL.isPresent() ? optionalL : Optional.ofNullable(((ozy) optionalL.get()).e);
                int i5 = yfq.d;
                boolean z = false;
                ozy ozyVarG = pgr.g(pgr.f(str2, str3, str4, xpvVar, (List) optionalOfNullable.orElse(yls.a)), jbqVar);
                ype ypeVar2 = (ype) ((ype) yphVar.f()).ai(6524);
                gjv gjvVar3 = pgrVar.aq;
                ypeVar2.R("Info response received. Received credentials=%s, cached credentials=%s, networkState=%s", ozyVarG, optionalL, gjvVar3.v());
                pgrVar.ak.w(pgp.c);
                boolean zIsEmpty = optionalL.isEmpty();
                miq miqVar2 = new miq(ozyVarG, i2);
                if (true == optionalL.isPresent()) {
                    optionalL = Optional.ofNullable(Boolean.valueOf(!((ozy) optionalL.get()).a((ozy) miqVar2.a)));
                }
                boolean zBooleanValue = ((Boolean) optionalL.orElse(false)).booleanValue();
                int iAC = a.aC(xpqVar.f);
                if (iAC != 0 && iAC == 2) {
                    z = true;
                }
                pgrVar.M(ozyVarG, !z);
                if (z) {
                    ((ype) yphVar.l().ai((char) 6525)).y("Won't persist Wifi Configuration (%s) since access point is DYNAMIC", ozyVarG);
                }
                if (zBooleanValue) {
                    pgrVar.w(yxi.WIRELESS_WIFI_CACHED_CREDENTIALS_INVALID);
                    if (((pgm) gjvVar3.v()).equals(pgm.c)) {
                        pgrVar.w(yxi.WIRELESS_WIFI_CACHED_CREDENTIALS_INVALID_WHILE_NETWORK_CONNECTED);
                    }
                    if (((pgm) gjvVar3.v()).a() && !a.O()) {
                        pgrVar.N.d();
                        pgrVar.N.c();
                    }
                }
                if ((zIsEmpty || zBooleanValue || ((pgm) gjvVar3.v()).equals(pgm.a)) && !pgrVar.Q(ozyVarG, pgrVar.s, pgrVar.t, pabVar)) {
                    pgrVar.D(ozr.h);
                    return;
                }
                return;
            case MESSAGE_WIFI_VERSION_REQUEST_BT:
                final xpz xpzVar = (xpz) abowVar;
                final zgp zgpVarK = !pgr.S(xpzVar.c, xpzVar.d) ? pgrVar.k(pfu.a, new pfl(pgrVar, xpzVar, i3)) : wub.Y(pgo.a);
                zgh zghVarV = wub.V(zgpVarK, pgrVar.D);
                Callable callable = new Callable() { // from class: pfo
                    /* JADX WARN: Removed duplicated region for block: B:130:0x041a  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 1201
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfo.call():java.lang.Object");
                    }
                };
                Context context = pgrVar.q;
                wub.ah(zghVarV.a(callable, context.getMainExecutor()), new tdx(new tdv()), context.getMainExecutor());
                return;
            case MESSAGE_WIFI_RESPONSE_START_BT:
                xpy xpyVar = (xpy) abowVar;
                pgrVar.z.c(pgrVar.L);
                ype ypeVar3 = (ype) yphVar.l().ai(6540);
                int iAm = wpq.am(xpyVar.e);
                if (iAm == 0) {
                    iAm = 13;
                }
                ypeVar3.y("processing wifi start response %s", wpq.al(iAm));
                int iAm2 = wpq.am(xpyVar.e);
                int i6 = (iAm2 != 0 ? iAm2 : 13) - 12;
                if (i6 == -6) {
                    pgrVar.J(pag.START_WIFI_REQUEST_FAILED_WIFI_NOT_YET_STARTED);
                    pgrVar.F(wox.ah(aczv.J()), wox.ah(aczv.L()));
                    return;
                }
                if (i6 == -5) {
                    ((ype) ((ype) yphVar.f()).ai((char) 6544)).u("HU WiFi disabled, disabling user intention.");
                    pgrVar.p();
                    if (pgr.ab()) {
                        ((uk) pgrVar.at.v()).d(pdo.h);
                    } else {
                        pgrVar.am.w(false);
                    }
                    pgrVar.J(pag.START_WIFI_REQUEST_FAILED_WIFI_DISABLED);
                    return;
                }
                if (i6 == -4) {
                    pgrVar.J(pag.START_WIFI_REQUEST_FAILED_ALREADY_STARTED);
                    Duration durationAh = wox.ah(aczv.K());
                    Duration durationAh2 = wox.ah(aczv.J());
                    if (a.X(durationAh)) {
                        ((ype) yphVar.l().ai((char) 6543)).u("Keeping wifi start request scheduled with exponential backoff instead of canceling it on PROJECTION_ALREADY_STARTED response.");
                        pgrVar.F(durationAh2, durationAh);
                        return;
                    }
                    return;
                }
                if (i6 != 0) {
                    ((ype) ((ype) yphVar.g()).ai((char) 6541)).u("Unexpected Wifi Response Message");
                    return;
                }
                if (!pgr.S(pgrVar.u, pgrVar.v) ? pgr.X(xpyVar.c) : pgr.W(xpyVar.c, xpyVar.d) && (xpyVar.b & 2) != 0) {
                    if (!pgr.S(pgrVar.u, pgrVar.v)) {
                        pgrVar.af(pabVar, 9);
                        return;
                    } else {
                        pgrVar.J(pag.WIFI_INVALID_PROJECTION_ENDPOINT);
                        ((ype) ((ype) yphVar.g()).ai(6542)).K("WifiStartResponse sent an invalid projection endpoint, IP: %s, Port: %d", xpyVar.c, xpyVar.d);
                        return;
                    }
                }
                pgrVar.s = xpyVar.c;
                if ((xpyVar.b & 2) != 0) {
                    pgrVar.t = xpyVar.d;
                }
                pgrVar.J(pag.START_WIFI_REQUEST_SUCCESS);
                pgrVar.N(pgrVar.s, pgrVar.t, pabVar);
                pgrVar.C(pabVar);
                return;
            case MESSAGE_WIFI_PING_RESPONSE_BT:
                long epochMilli = Instant.now().toEpochMilli() - ((xpt) abowVar).b;
                pgr.o(pabVar);
                if (epochMilli > pgr.j.toMillis()) {
                    ((ype) ((ype) yphVar.h()).ai(6527)).L("Manager: %s has received the ping response but with high latency: %d ms", pgr.o(pabVar), epochMilli);
                }
                pgrVar.az.w(0);
                pgrVar.Z++;
                if (!aczv.aG() || pgrVar.Z < aczv.x() || pgrVar.aa) {
                    return;
                }
                pgrVar.w(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_PING_STATE_HEALTHY);
                pgrVar.aa = true;
                return;
            case MESSAGE_WIFI_CONNECTION_REJECTION_BT:
                xpo xpoVar = (xpo) abowVar;
                pac pacVarA2 = pabVar.a();
                ype ypeVar4 = (ype) ((ype) yphVar.f()).ai(6474);
                int iAp4 = a.ap(xpoVar.b);
                if (iAp4 == 0) {
                    iAp4 = 1;
                }
                ypeVar4.y("Handling WifiConnectionRejection with reason: %s", wox.s(iAp4));
                int iAp5 = a.ap(xpoVar.b);
                if (iAp5 == 0) {
                    iAp5 = 1;
                }
                int i7 = iAp5 - 1;
                if (i7 == 0) {
                    throw new IllegalStateException("WPP connection rejected over " + pacVarA2.name() + " with unknown rejection reason.");
                }
                if (i7 != 1) {
                    int iOrdinal = pacVarA2.ordinal();
                    if (iOrdinal == 0) {
                        throw new IllegalStateException("RFCOMM connection should never be used to return CONNECTION_REJECTION_REASON_INVALID_SETUP_TOKEN error.");
                    }
                    if (iOrdinal != 1) {
                        return;
                    }
                    b(ozr.x);
                    return;
                }
                int iOrdinal2 = pacVarA2.ordinal();
                if (iOrdinal2 == 0) {
                    throw new IllegalStateException("RFCOMM connection should never be rejected.");
                }
                if (iOrdinal2 != 1) {
                    return;
                }
                b(ozr.w);
                return;
            case MESSAGE_WIFI_SETUP_INFO_BT:
                final xpw xpwVar = (xpw) abowVar;
                wub.ah(pgrVar.k(pfu.a, new pfl(pgrVar, xpwVar, i)), new tdx(new tdw() { // from class: pfm
                    @Override // defpackage.tdw
                    public final void a(Object obj) {
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        pab pabVar2 = pabVar;
                        woy.ad(pabVar2.a() == pac.a, "WifiSetupInfo may only be received over RFCOMM, current manager type: %s", pabVar2.a());
                        woy.ab(Build.VERSION.SDK_INT >= 30, "WifiInfoSetup config is not supported below Android SDK version: %s", 30);
                        pgr pgrVar2 = pgrVar;
                        pgrVar2.w(yxi.WIRELESS_RFCOMM_WIFI_SETUP_INFO_RECEIVED);
                        xpw xpwVar2 = xpwVar;
                        int i8 = xpwVar2.b;
                        pgrVar2.u = i8;
                        int i9 = xpwVar2.c;
                        pgrVar2.v = i9;
                        if (i8 != 0 && !new jbq(i8, i9).s(pgr.f)) {
                            pgrVar2.t(pgrVar2.u, pgrVar2.v);
                            return;
                        }
                        yph yphVar2 = pgr.a;
                        ((ype) ((ype) yphVar2.f()).ai(6532)).B("WifiSetupInfo received on HU with version %s.%s", pgrVar2.u, pgrVar2.v);
                        if (!zBooleanValue2) {
                            xpm xpmVar = xpwVar2.f;
                            if (xpmVar == null) {
                                xpmVar = xpm.a;
                            }
                            pgrVar2.u(wub.ay(xpmVar.f));
                            return;
                        }
                        xpm xpmVar2 = xpwVar2.f;
                        if (xpmVar2 == null) {
                            xpmVar2 = xpm.a;
                        }
                        String str5 = xpmVar2.b;
                        String str6 = xpmVar2.d;
                        String str7 = xpmVar2.c;
                        xpv xpvVarB3 = xpv.b(xpmVar2.e);
                        if (xpvVarB3 == null) {
                            xpvVarB3 = xpv.UNKNOWN_SECURITY_MODE;
                        }
                        int i10 = yfq.d;
                        yfq yfqVar = yls.a;
                        if (!pgrVar2.Z(pgr.f(str5, str6, str7, xpvVarB3, yfqVar), true)) {
                            ((ype) ((ype) pgr.a.g()).ai((char) 6535)).u("Invalid WiFi access point info received in WifiSetupInfo message");
                            pgrVar2.ae();
                            return;
                        }
                        xpu xpuVar = xpwVar2.e;
                        if (xpuVar == null) {
                            xpuVar = xpu.a;
                        }
                        if (!pgr.W(xpuVar.c, xpuVar.d) || (xpuVar.b & 2) == 0) {
                            ((ype) ((ype) pgr.a.g()).ai(6533)).K("Invalid WPP configuration received in WifiSetupInfo message, IP %s, Port: %d", xpuVar.c, xpuVar.d);
                            pgrVar2.J(pag.WIFI_INVALID_WPP_ENDPOINT);
                            pgrVar2.ae();
                            return;
                        }
                        pgrVar2.y = Optional.of(xpwVar2.d.D());
                        ((ype) yphVar2.l().ai((char) 6534)).y("Received token '%s' in WifiSetupInfo message", Arrays.toString((byte[]) pgrVar2.y.get()));
                        pgrVar2.L();
                        try {
                            BluetoothDevice bluetoothDevice = pgrVar2.r;
                            xpm xpmVar3 = xpwVar2.f;
                            if (xpmVar3 == null) {
                                xpmVar3 = xpm.a;
                            }
                            String str8 = xpmVar3.b;
                            String str9 = xpmVar3.d;
                            String str10 = xpmVar3.c;
                            xpv xpvVarB4 = xpv.b(xpmVar3.e);
                            if (xpvVarB4 == null) {
                                xpvVarB4 = xpv.UNKNOWN_SECURITY_MODE;
                            }
                            ozy ozyVarG2 = pgr.g(pgr.f(str8, str9, str10, xpvVarB4, yfqVar), new jbq(pgrVar2.u, pgrVar2.v));
                            woy.aa(pgrVar2.Z(ozyVarG2, false), "WifiConfiguration must be valid at this point.");
                            pgrVar2.M(ozyVarG2, true);
                            ozf ozfVar = pgrVar2.P;
                            xpu xpuVar2 = xpwVar2.e;
                            if (xpuVar2 == null) {
                                xpuVar2 = xpu.a;
                            }
                            a.L(ozfVar.i(bluetoothDevice, xpuVar2));
                            pgrVar2.D(ozr.y);
                        } catch (ExecutionException e) {
                            throw new IllegalStateException("Failed to write WiFi setup info to data store, unable to start WPP on TCP.", e);
                        }
                    }
                }), pgrVar.q.getMainExecutor());
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.ozr r6) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgc.b(ozr):void");
    }

    public final void c() {
        wer.c();
        pgr pgrVar = this.a;
        pgrVar.O(pag.CONNECTED_RFCOMM);
        pgrVar.ay.w(false);
        pgrVar.p();
        pgrVar.an.w(pgn.a);
        pgrVar.ak.w(pgp.a);
        if (Build.VERSION.SDK_INT >= 29) {
            if (pgrVar.z.a.hasCallbacks(pgrVar.ac)) {
                if (aczv.bg()) {
                    throw new IllegalStateException("Unexpected wppFirstMessageTimeoutRunnable on control handler thread");
                }
                ((ype) ((ype) pgr.a.g()).ai((char) 6478)).u("Unexpected wppFirstMessageTimeoutRunnable on control handler thread");
            }
        }
        pgrVar.r();
        oqe oqeVar = pgrVar.X;
        BluetoothDevice bluetoothDevice = pgrVar.r;
        long jW = oqeVar.j(bluetoothDevice) ? aczv.w() : 10000L;
        if (this.b < jW) {
            Duration durationOfMillis = Duration.ofMillis(aczv.v());
            Duration durationAh = wox.ah(aczv.N());
            if (true == oqeVar.j(bluetoothDevice)) {
                durationOfMillis = durationAh;
            }
            long millis = durationOfMillis.toMillis();
            ((ype) ((ype) pgr.a.f()).ai(6477)).G("Scheduling WPP first message timeout trigger to execute in %d milliseconds, attempt: %d", millis, this.b);
            pgrVar.z.e(pgrVar.ac, millis);
        } else {
            ((ype) pgr.a.l().ai(6476)).G("Exhausted WPP first message timeout attempts . Attempts: %d out of %d", this.b, jW);
        }
        this.b++;
        pgrVar.aw.w(false);
    }
}
