package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Range;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class pgr implements pai {

    @Deprecated
    public final HandlerThread A;

    @Deprecated
    public final pdk B;

    @Deprecated
    final Handler C;
    public zgp D;
    public final eqa E;
    public eqn F;
    public eqj G;
    public eqn H;
    public eqj I;
    public final Duration J;
    public final Duration K;
    public pcv N;
    public final paj O;
    public final ozf P;
    public final xyi Q;
    public final ozt R;
    public final pdz S;
    public pew T;
    final pgc U;
    public final SharedPreferences V;
    public final SharedPreferences.OnSharedPreferenceChangeListener W;
    public final oqe X;
    public final yfq Y;
    public int Z;
    public final gjv aA;
    final ajmd aB;

    @Deprecated
    private final HandlerThread aI;

    @Deprecated
    private final HandlerThread aJ;
    private final boolean aK;
    private final pbx aN;
    private final paf aO;
    private final Object aP;
    private int aQ;
    private final gjv aR;
    public boolean aa;
    public final knz ab;
    public final Runnable ac;
    public final yfy ad;
    public final BroadcastReceiver ae;
    public final BroadcastReceiver af;
    public final ohe ag;
    public final kzt ah;
    public final kzt ai;
    public final ajdr aj;
    public final gjv ar;
    public final gjv as;
    public final gjv at;
    public final gjv au;
    public final gjv av;
    public final gjv aw;
    public final gjv ax;
    public final gjv ay;
    public final gjv az;
    public pag m;
    public final pah o;
    public final Context q;
    public final BluetoothDevice r;
    public String s;
    public int t;
    public final pdk z;
    public static final yph a = yph.c("GH.WIRELESS.SETUP");
    public static final jbq b = new jbq(4, 0);
    public static final jbq c = new jbq(4, 0);
    public static final jbq d = new jbq(4, 1);
    public static final jbq e = new jbq(4, 2);
    static final jbq f = new jbq(4, 5);
    private static final Range aC = Range.create(0, 65535);
    private static final Duration aD = Duration.ofSeconds(2);
    private static final ygr aE = yrm.o(xpv.WPA2_PERSONAL, xpv.WPA2_WPA3_PERSONAL);
    public static final Duration g = Duration.ofSeconds(25);
    static final Duration h = Duration.ofSeconds(5);
    public static final Range i = Range.create(0, 100);
    private static final Duration aF = Duration.ofSeconds(1);
    public static final Duration j = Duration.ofMillis(500);
    private static final Duration aG = Duration.ofSeconds(5);
    public static final yfy k = yfy.o(1, yxi.WIRELESS_WIFI_STATE_DISABLED, 0, yxi.WIRELESS_WIFI_STATE_DISABLING, 3, yxi.WIRELESS_WIFI_STATE_ENABLED, 2, yxi.WIRELESS_WIFI_STATE_ENABLING, 4, yxi.WIRELESS_WIFI_STATE_UNKNOWN);
    public final Object l = new Object();
    public final gjv ak = new gjv(pgp.a);
    public final CopyOnWriteArraySet n = new CopyOnWriteArraySet();
    public final Runnable p = new pct(this, 17);
    public int u = -1;
    public int v = -1;
    public final gjv al = new gjv((Object) null);
    private final Object aH = new Object();
    public final gjv am = new gjv((Object) false);
    public final gjv an = new gjv(pgn.a);
    public final gjv ao = new gjv(pgj.b);
    public final Map w = new tko(new HashMap(), new nqy(14));
    public final gjv ap = new gjv((Object) 0);
    public volatile String x = "UNKNOWN";
    public Optional y = Optional.empty();
    private final List aL = new ArrayList();
    private final Object aM = new Object();
    public final Object L = new Object();

    @Deprecated
    public int M = 0;
    public final gjv aq = new gjv(pgm.a);

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, oqe] */
    public pgr(final Context context, BluetoothDevice bluetoothDevice, HandlerThread handlerThread, HandlerThread handlerThread2, HandlerThread handlerThread3, ohe oheVar, paj pajVar, paf pafVar, pbx pbxVar, final ajdr ajdrVar, ozf ozfVar, kzt kztVar, kzt kztVar2, xyi xyiVar, eqa eqaVar) {
        pgc pgcVar = new pgc(this);
        this.U = pgcVar;
        ajmd ajmdVar = new ajmd(this, null);
        this.aB = ajmdVar;
        this.W = new kwq(this, 6);
        this.ar = new gjv((Object) false);
        this.as = new gjv((Object) false);
        this.at = new gjv(new uk((char[]) null));
        this.aR = new gjv(pgq.a);
        this.au = new gjv((Object) false);
        this.av = new gjv((Object) false);
        this.aw = new gjv((Object) false);
        this.ax = new gjv((Object) false);
        this.ay = new gjv((Object) false);
        this.aP = new Object();
        this.az = new gjv((Object) 0);
        this.Z = 0;
        this.aA = new gjv(pfv.a);
        this.aQ = 0;
        this.aa = false;
        this.ae = new pfr(this);
        this.af = new pfs(this);
        this.q = context;
        this.r = bluetoothDevice;
        this.aI = handlerThread;
        this.B = new pdk(new Handler(handlerThread.getLooper()), false);
        this.aJ = handlerThread2;
        this.C = new Handler(handlerThread2.getLooper());
        this.A = handlerThread3;
        this.ag = oheVar;
        this.O = pajVar;
        this.aO = pafVar;
        this.aK = true;
        this.aN = pbxVar;
        this.aj = ajdrVar;
        this.X = ajdrVar.a;
        this.ab = new knz((kny) ajdrVar.e);
        this.P = ozfVar;
        this.ai = kztVar;
        this.ah = kztVar2;
        this.Q = xyiVar;
        this.E = eqaVar;
        yfu yfuVar = new yfu(4);
        if (Build.VERSION.SDK_INT >= 34 && aczv.as()) {
            yfuVar.e(ozr.q, new pgl(pag.USER_REJECT_WIFI_UNAVAILABLE, pdo.i));
        }
        if (hrp.a() && aczv.ar()) {
            ozr ozrVar = ozr.A;
            pag pagVar = pag.USER_DISCONNECTED_FROM_WIFI_NETWORK;
            pdo pdoVar = pdo.i;
            yfuVar.e(ozrVar, new pgl(pagVar, pdoVar));
            yfuVar.e(ozr.B, new pgl(pag.USER_DISCONNECTED_ANOTHER_NETWORK_CONNECTED, pdoVar));
            yfuVar.e(ozr.C, new pgl(pag.USER_DISCONNECTED_MD_WIFI_ADAPTER_OFF, pdo.f));
        }
        if (aczv.aq()) {
            yfuVar.e(ozr.E, new pgl(pag.USER_DISCONNECTED_MD_WIFI_ADAPTER_OFF, pdo.f));
        }
        this.ad = yfuVar.d(true);
        yph yphVar = phl.a;
        pdy pdyVar = new pdy(bluetoothDevice, ajdrVar, pgcVar, context);
        this.S = pdyVar;
        Object obj = ajdrVar.a;
        if (a.O()) {
            final nsb nsbVar = new nsb(15);
            final mim mimVar = new mim(10);
            xyc xycVarL = wub.L(new xyc() { // from class: pdc
                @Override // defpackage.xyc
                public final Object gu() {
                    return new pdh(context, ajdrVar, nsbVar, mimVar);
                }
            });
            this.R = pdd.a(xycVarL);
            woy.aa(Build.VERSION.SDK_INT >= 30, "isWirelessSetupUsingQApiEnabled must include SDK_INT >= R");
            yph yphVar2 = pew.a;
            if (ajdrVar == null) {
                throw new NullPointerException("Null wirelessContext");
            }
            this.T = new pew(context, ajdrVar, pgcVar, ajmdVar, pdd.a(xycVarL), new phy());
        } else {
            pgf pgfVar = new pgf(this, new pbx(context, handlerThread.getLooper()), pdyVar, false, null, null);
            yph yphVar3 = pcs.a;
            gkj gkjVar = new gkj();
            gkjVar.c = context;
            gkjVar.b = pgfVar;
            gkjVar.a = true;
            this.R = new pcs(gkjVar);
        }
        this.o = new pgb(this, new pdl(), this.R);
        this.m = pag.IDLE;
        this.z = new pdk(new Handler(Looper.getMainLooper()), true);
        this.V = new kmy(context, "connectivity_session_id_file");
        this.J = Duration.ofMillis(aczv.u());
        this.K = wox.ah(aczv.M());
        this.Y = yfq.o(aczv.W().b);
        this.ac = new pct(this, 19);
    }

    public static boolean R(List list, String str) {
        return !TextUtils.isEmpty(str) && Collection.EL.stream(list).anyMatch(new pcx(str, 3));
    }

    public static boolean S(int i2, int i3) {
        return new jbq(i2, i3).s(f);
    }

    public static boolean U() {
        if (aczv.as()) {
            return true;
        }
        return (hrp.a() && aczv.ar()) || aczv.aq();
    }

    public static boolean W(String str, int i2) {
        return X(str) && aC.contains((Range) Integer.valueOf(i2));
    }

    public static boolean X(String str) {
        if (jlp.e(str)) {
            return true;
        }
        ((ype) a.l().ai((char) 6561)).y("Invalid ip: %s", str);
        return false;
    }

    public static boolean ab() {
        return aczv.ap() || U();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0009  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean ad(defpackage.pcq r3, int r4, defpackage.pac r5) {
        /*
            int r4 = r4 + (-1)
            r0 = 0
            r1 = 0
            r2 = 1
            if (r4 == 0) goto Ld
            if (r4 == r2) goto Lb
        L9:
            r4 = r2
            goto L29
        Lb:
            r4 = r0
            goto L29
        Ld:
            pag r4 = defpackage.pag.WIFI_INVALID_PROJECTION_ENDPOINT
            int r4 = r5.ordinal()
            if (r4 == 0) goto L22
            if (r4 != r2) goto L1c
            boolean r4 = defpackage.aczv.aT()
            goto L29
        L1c:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r1, r1)
            throw r3
        L22:
            boolean r4 = defpackage.aczv.bj()
            if (r4 != 0) goto Lb
            goto L9
        L29:
            r4 = r4 ^ r2
            pag r5 = defpackage.pag.WIFI_INVALID_PROJECTION_ENDPOINT
            int r3 = r3.ordinal()
            if (r3 == 0) goto L42
            if (r3 == r2) goto L42
            r5 = 2
            if (r3 == r5) goto L41
            r4 = 3
            if (r3 != r4) goto L3b
            return r2
        L3b:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r1, r1)
            throw r3
        L41:
            return r4
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgr.ad(pcq, int, pac):boolean");
    }

    private final yfq ai(final Predicate predicate) {
        wer.c();
        Predicate predicate2 = new Predicate() { // from class: pfn
            public final /* synthetic */ Predicate and(Predicate predicate3) {
                return Predicate$CC.$default$and(this, predicate3);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo56negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate3) {
                return Predicate$CC.$default$or(this, predicate3);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                yph yphVar = pgr.a;
                return predicate.test(((pgk) obj).b);
            }
        };
        List list = this.aL;
        Stream map = Collection.EL.stream(list).filter(predicate2).map(new nsb(16));
        int i2 = yfq.d;
        yfq yfqVar = (yfq) map.collect(ycm.a);
        Collection.EL.removeIf(list, predicate2);
        return yfqVar;
    }

    private final void aj(yxi yxiVar, int i2) {
        ((kny) this.aj.e).e(yxiVar, OptionalInt.of(i2));
    }

    private static void ak(pdk pdkVar, Runnable runnable) {
        if (pdkVar.a().isCurrentThread()) {
            runnable.run();
        } else {
            pdkVar.d(runnable);
        }
    }

    private final void al() {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((pah) it.next()).b();
        }
    }

    private final void am() {
        wer.c();
        this.z.c(this.aP);
    }

    private final void an() {
        wer.c();
        q();
        this.z.c(this.L);
        p();
        am();
        yfq yfqVarAi = ai(new oly(11));
        int size = yfqVarAi.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zgp) yfqVarAi.get(i2)).cancel(false);
        }
        r();
        this.an.w(pgn.a);
        if (Build.VERSION.SDK_INT >= 30) {
            this.T.e();
        }
        pdy pdyVar = (pdy) this.S;
        gjv gjvVar = pdyVar.h;
        if (((pdt) gjvVar.v()).a()) {
            yph yphVar = pdy.a;
            yphVar.l().u("Stopping WPP connection by disconnecting RFComm socket.");
            if (gjvVar.v() instanceof pdr) {
                pdyVar.d(yxi.WIRELESS_RFCOMM_CONNECTION_ATTEMPT_INTERRUPTED_BY_STOP, null);
                ((ype) yphVar.f()).u("In-progress connection interrupted by stop.");
            }
            pdyVar.f();
        }
        this.au.w(false);
        if (ab()) {
            this.aR.w(pgq.a);
        }
    }

    private final boolean ao(BluetoothDevice bluetoothDevice, int i2, pac pacVar) {
        kzt kztVar = this.ai;
        kztVar.getClass();
        return ad(kztVar.e(bluetoothDevice, aa(bluetoothDevice)), i2, pacVar);
    }

    private final void ap(pab pabVar, int i2, Optional optional) {
        yph yphVar = a;
        ype ypeVar = (ype) ((ype) yphVar.f()).ai(6603);
        if (i2 == 0) {
            throw null;
        }
        ypeVar.M("Send WifiConnectStatus, status=%s, errorMessage=%s", wpq.al(i2), optional);
        if (S(this.u, this.v)) {
            ((ype) ((ype) yphVar.f()).ai((char) 6604)).y("Skipping WifiConnectStatus for PDK 4.5+, status=%s", wpq.al(i2));
            return;
        }
        abnp abnpVarN = xpn.a.n();
        abnpVarN.t();
        xpn xpnVar = (xpn) abnpVarN.b;
        xpnVar.c = i2 - 12;
        xpnVar.b |= 1;
        mla mlaVar = new mla(abnpVarN, 11);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            abnp abnpVar = (abnp) mlaVar.a;
            abnpVar.t();
            xpn xpnVar2 = (xpn) abnpVar.b;
            xpnVar2.b |= 2;
            xpnVar2.d = (String) obj;
        }
        H(pabVar, abnpVarN.q(), xpr.MESSAGE_WIFI_CONNECT_STATUS_BT);
    }

    public static HandlerThread e(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread;
    }

    public static ozy f(String str, String str2, String str3, xpv xpvVar, List list) {
        vlz vlzVar = new vlz();
        vlzVar.g(str);
        vlzVar.c(str2);
        vlzVar.e(str3);
        vlzVar.f(xpvVar);
        vlzVar.d(list);
        return vlzVar.b();
    }

    public static ozy g(ozy ozyVar, jbq jbqVar) {
        String strK;
        String strK2;
        boolean zS = jbqVar.s(f);
        vlz vlzVar = new vlz();
        if (zS) {
            strK = ozyVar.a;
        } else {
            String str = ozyVar.a;
            int i2 = jlp.a;
            strK = roc.k(str);
        }
        vlzVar.g(strK);
        vlzVar.c(ozyVar.b);
        if (zS) {
            strK2 = ozyVar.c;
        } else {
            String str2 = ozyVar.c;
            int i3 = jlp.a;
            strK2 = roc.k(str2);
        }
        vlzVar.e(strK2);
        xpv xpvVar = ozyVar.d;
        if (xpvVar == xpv.UNKNOWN_SECURITY_MODE) {
            xpvVar = xpv.WPA2_PERSONAL;
        }
        vlzVar.f(xpvVar);
        vlzVar.d(ozyVar.e);
        ozy ozyVarB = vlzVar.b();
        if (!ozyVarB.equals(ozyVar)) {
            ((ype) ((ype) a.f()).ai(6598)).M("WifiConfiguration fields affected by sanitization, input=%s, output=%s", ozyVar, ozyVarB);
        }
        return ozyVarB;
    }

    public static String n(BluetoothDevice bluetoothDevice) {
        try {
            return woy.al(bluetoothDevice.getName());
        } catch (SecurityException e2) {
            ((ype) ((ype) ((ype) a.g()).p(e2)).ai((char) 6513)).u("Failed to get Bluetooth device name due to lack of permission.");
            return "";
        }
    }

    public static String o(pab pabVar) {
        return pabVar.a().name();
    }

    @Deprecated
    public final void A() {
        ak(this.z, new pct(this, 15));
    }

    public final void B(pab pabVar, int i2) {
        ((ype) a.l().ai((char) 6591)).w("Requesting Wi-Fi credentials from HU, attempt %d", i2);
        if (i2 == 0) {
            this.ak.w(pgp.b);
        }
        H(pabVar, xpp.a, xpr.MESSAGE_WIFI_REQUEST_INFO_BT);
        synchronized (this.l) {
            this.M++;
            q();
            this.z.f(new oa(this, pabVar, i2, 15), this.aM, this.J.toMillis());
        }
    }

    public final void C(pab pabVar) {
        if (pabVar.a() == pac.b) {
            ((ype) a.l().ai((char) 6592)).u("Skipping WiFi info request for TCP transport");
        } else {
            B(pabVar, 0);
        }
    }

    public final void D(ozr ozrVar) {
        Duration durationOfMillis;
        wer.c();
        if (!((Boolean) this.av.v()).booleanValue()) {
            ae();
            return;
        }
        switch (ozrVar.ordinal()) {
            case 0:
                durationOfMillis = Duration.ofMillis(aczv.o());
                break;
            case 1:
            case 22:
            case 23:
            case 24:
                durationOfMillis = Duration.ZERO;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 21:
            case 25:
            case 26:
            case 27:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
                durationOfMillis = wox.ah(aczv.G());
                break;
            case 7:
                durationOfMillis = Duration.ofMillis(aczv.p());
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                durationOfMillis = wox.ah(aczv.H());
                break;
            default:
                throw new RuntimeException(null, null);
        }
        gjv gjvVar = this.aw;
        if (((Boolean) gjvVar.v()).booleanValue()) {
            ((ype) ((ype) a.f()).ai((char) 6595)).y("Ignoring restart wpp request with connection failure reason: %s as the prior request is already in progress.", ozrVar);
            aj(yxi.WIRELESS_SETUP_WPP_RESTART_REQUEST_DEBOUNCED, ozrVar.a());
            return;
        }
        gjvVar.w(true);
        if (((pgn) this.an.v()).b()) {
            w(yxi.WIRELESS_WPP_DISCONNECTED_BY_REQUEST);
        }
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 6593)).y("Triggering WPP restart. Reason=%s", ozrVar);
        an();
        aj(yxi.WIRELESS_SETUP_WPP_RESTART_WITH_DELAY, ozrVar.a());
        gjv gjvVar2 = this.ay;
        OptionalInt optionalIntEmpty = OptionalInt.empty();
        if (!((Boolean) gjvVar2.v()).booleanValue()) {
            gjvVar2.w(true);
            optionalIntEmpty = OptionalInt.of(this.X.a());
            aj(yxi.WIRELESS_SETUP_WPP_RESTART, optionalIntEmpty.getAsInt());
        }
        ((ype) yphVar.l().ai((char) 6594)).y("Trying to start Wifi Projection Protocol with delay: %s.", durationOfMillis);
        this.z.e(new ojl(this, optionalIntEmpty, 20, null), durationOfMillis.toMillis());
    }

    public final void E(pab pabVar) {
        am();
        ojl ojlVar = new ojl(this, pabVar, 19);
        long millis = aF.toMillis();
        this.z.f(ojlVar, this.aP, millis);
    }

    public final void F(Duration duration, Duration duration2) {
        gjv gjvVar = this.ao;
        Object objV = gjvVar.v();
        if (!(objV instanceof pgi)) {
            ((ype) ((ype) a.f()).ai((char) 6599)).y("Start request from MD no longer relevant. Journey=%s", gjvVar.v());
        } else if (((pgi) objV).a.u().compareTo(duration2) <= 0) {
            v(duration, false);
        } else {
            ((ype) ((ype) a.f()).ai((char) 6600)).u("Past timeout from when WifiStartRequests started, not sending");
            w(yxi.WIRELESS_MD_PROJECTION_REQUEST_LOOP_TIMED_OUT);
        }
    }

    public final void G(String str, int i2, WifiInfo wifiInfo) {
        J(pag.PROJECTION_INITIATED);
        this.B.d(new isp(this, str, i2, wifiInfo, 10));
    }

    public final void H(pab pabVar, abow abowVar, xpr xprVar) {
        wer.c();
        synchronized (this.l) {
            if (pag.SHUTDOWN.equals(this.m)) {
                return;
            }
            pabVar.b(xprVar, abowVar);
            knz knzVar = this.ab;
            pac pacVarA = pabVar.a();
            if (!knx.e.contains(xprVar)) {
                if (xprVar == xpr.MESSAGE_WIFI_VERSION_RESPONSE_BT) {
                    ((ype) knx.a.l().ai(3265)).u("Sending wifi version response message uses different kind of telemetry. Skipping logging connectivity event through Spark.");
                } else {
                    yfy yfyVar = knx.c;
                    if (yfyVar.containsKey(xprVar)) {
                        koa koaVar = (koa) yfyVar.get(xprVar);
                        if (koaVar == null) {
                            throw new IllegalArgumentException(String.format("No matching wpp telemetry exists to send for sent message type %s.", xprVar.name()));
                        }
                        knzVar.a(pacVarA, koaVar);
                    } else {
                        ((ype) ((ype) knx.a.h()).ai((char) 3264)).y("No connection event type for sent wifi projection protocol message type: %s defined. No telemetry will be logged through Spark.", xprVar.name());
                    }
                }
            }
        }
    }

    public final void I(pab pabVar, pdm pdmVar) {
        ap(pabVar, pdmVar.c, Optional.of(this.q.getString(pdmVar.b)));
    }

    public final void J(pag pagVar) {
        K(pagVar, Bundle.EMPTY);
    }

    public final void K(pag pagVar, Bundle bundle) {
        ((ype) ((ype) a.f()).ai((char) 6605)).y("State changed to %s", pagVar.name());
        this.B.d(new oey((Object) this, (Object) pagVar, (Object) bundle, 14, (byte[]) null));
    }

    public final void L() {
        w(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_HU_SUPPORTS_WPP_OVER_TCP);
    }

    public final void M(ozy ozyVar, boolean z) {
        if (Z(ozyVar, false)) {
            this.aA.w(new pfw(ozyVar, z));
        } else {
            ((ype) a.l().ai((char) 6608)).y("Does not update in-memory Wifi Configuration (%s) since it is invalid", ozyVar);
        }
    }

    public final void N(String str, int i2, pab pabVar) {
        pfx pfxVar = (pfx) this.aA.v();
        pfxVar.getClass();
        int iAs = lvl.as(pfxVar);
        if (iAs == 0) {
            woy.aa(pabVar.a() != pac.b, "No credentials available when connecting to the WiFi network despite TCP manager.");
        } else {
            if (iAs != 1) {
                throw new RuntimeException(null, null);
            }
            try {
                Q(((pfw) pfxVar).a, str, i2, pabVar);
                w(yxi.WIRELESS_WIFI_CACHED_CREDENTIALS_USED);
            } catch (Throwable th) {
                throw new RuntimeException(th.toString(), th);
            }
        }
    }

    public final void O(pag pagVar) {
        synchronized (this.l) {
            this.m = pagVar;
            J(pagVar);
        }
    }

    public final void P() {
        woy.aa(ab(), "userInitiatedDisconnectWifiNetwork called when WifiIntentionManager is disabled");
        wer.c();
        BluetoothDevice bluetoothDevice = this.r;
        if (!ao(bluetoothDevice, 1, h(m(bluetoothDevice)))) {
            ((ype) ((ype) a.f()).ai((char) 6625)).u("User disconnected from HU Wi-Fi network and bluetooth is disconnected, stopping WSEM. ");
            ah(true);
            return;
        }
        ype ypeVar = (ype) ((ype) a.f()).ai(6624);
        gjv gjvVar = this.aR;
        String strName = ((pgq) gjvVar.v()).name();
        int i2 = ((uk) this.at.v()).a;
        String strE = osq.E(i2);
        if (i2 == 0) {
            throw null;
        }
        ypeVar.M("Disconnecting HU Wi-Fi network. WPP Protocol State: %s, Wi-Fi intention state: %s", strName, strE);
        Map map = this.w;
        yno it = ygr.n(((tko) map).b()).iterator();
        while (it.hasNext()) {
            map.put((pbw) it.next(), pfz.c);
        }
        this.R.b();
        this.aq.w(pgm.a);
        if (((pgq) gjvVar.v()).equals(pgq.b)) {
            an();
            this.aw.w(false);
            this.av.w(false);
            this.ay.w(false);
        }
    }

    public final boolean Q(ozy ozyVar, final String str, final int i2, pab pabVar) {
        wer.c();
        boolean Z = Z(ozyVar, true);
        if (!X(str)) {
            ((ype) ((ype) a.g()).ai((char) 6509)).y("Tried to connect to an invalid ip: %s", str);
            af(pabVar, 5);
            return false;
        }
        if (!Z) {
            ((ype) ((ype) a.g()).ai((char) 6508)).u("Tried to connect to an invalid wifi network");
            af(pabVar, 9);
            return false;
        }
        if (a.O()) {
            ozt oztVar = this.R;
            ((ype) a.l().ai((char) 6507)).y("Attempt to connect to wifi network using %s", oztVar);
            this.aq.w(pgm.b);
            O(pag.CONNECTING_WIFI);
            oztVar.a(ozyVar, new pgf(this, this.aN, pabVar, true, str, Integer.valueOf(i2)));
        } else {
            ((ype) a.l().ai((char) 6506)).u("Attempt to connect to wifi network using legacyWifiNetworkSetupManager");
            this.aq.w(pgm.b);
            final String str2 = ozyVar.a;
            final String str3 = ozyVar.b;
            final String str4 = ozyVar.c;
            final xpv xpvVar = ozyVar.d;
            this.C.post(new Runnable() { // from class: pfk
                @Override // java.lang.Runnable
                public final void run() {
                    int iAddNetwork;
                    pcv pcvVar = this.a.N;
                    Object obj = pcvVar.b;
                    String str5 = str4;
                    synchronized (obj) {
                        WifiManager wifiManager = (WifiManager) pcvVar.e.getApplicationContext().getSystemService("wifi");
                        if (wifiManager.getWifiState() == 3) {
                            pcvVar.r.a(yyv.WIFI_WAS_ENABLED);
                        } else {
                            pcvVar.r.a(yyv.WIFI_WAS_DISABLED);
                        }
                        if (wifiManager.getWifiState() == 1) {
                            pgr pgrVar = pcvVar.o;
                            pgrVar.y(pag.WIFI_AUTOMATICALLY_ENABLED);
                            if (!wifiManager.setWifiEnabled(true)) {
                                pgrVar.y(pag.WIFI_FAILED_TO_AUTOMATICALLY_ENABLE);
                                return;
                            }
                        }
                        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                        String str6 = str2;
                        xpv xpvVar2 = xpvVar;
                        String str7 = str;
                        int i3 = i2;
                        if (connectionInfo != null && connectionInfo.getNetworkId() >= 0 && jlp.c(str6, connectionInfo.getSSID())) {
                            ((ype) pcv.a.l().ai(6317)).y("already connected to desired network: %s, starting", str6);
                            pcvVar.r.b(true, xpvVar2, wifiManager.getConnectionInfo().getFrequency());
                            pgr pgrVar2 = pcvVar.o;
                            pag pagVar = pag.CONNECTED_WIFI;
                            pcvVar.c = pagVar;
                            pgrVar2.y(pagVar);
                            pcvVar.l.acquire();
                            pgrVar2.G(str7, i3, wifiManager.getConnectionInfo());
                            return;
                        }
                        WifiConfiguration wifiConfiguration = new WifiConfiguration();
                        wifiConfiguration.BSSID = true != aczv.aM() ? str3 : null;
                        wifiConfiguration.SSID = jlp.a(str6);
                        wifiConfiguration.preSharedKey = jlp.a(str5);
                        if ((xpvVar2.m & 16) != 0) {
                            wifiConfiguration.allowedKeyManagement.set(2);
                        } else {
                            wifiConfiguration.allowedKeyManagement.set(1);
                        }
                        wifiConfiguration.allowedProtocols.set(1);
                        wifiConfiguration.allowedPairwiseCiphers.set(2);
                        yph yphVar = pcv.a;
                        ((ype) yphVar.l().ai(6315)).y("connecting to wifi network: %s", wifiConfiguration.SSID);
                        pcvVar.j = false;
                        if (wifiManager.getConfiguredNetworks() != null) {
                            for (WifiConfiguration wifiConfiguration2 : wifiManager.getConfiguredNetworks()) {
                                if (wifiConfiguration2.SSID != null && jlp.c(wifiConfiguration2.SSID, wifiConfiguration.SSID)) {
                                    wifiConfiguration.networkId = wifiConfiguration2.networkId;
                                    iAddNetwork = wifiManager.updateNetwork(wifiConfiguration);
                                    if (iAddNetwork == -1) {
                                        ((ype) ((ype) yphVar.g()).ai(6314)).K("Unable to update network: %s, %s", wifiConfiguration.SSID, wifiConfiguration.networkId);
                                        pcvVar.j = true;
                                        iAddNetwork = wifiConfiguration2.networkId;
                                    }
                                }
                            }
                            iAddNetwork = wifiManager.addNetwork(wifiConfiguration);
                            wifiManager.saveConfiguration();
                        } else {
                            iAddNetwork = wifiManager.addNetwork(wifiConfiguration);
                            wifiManager.saveConfiguration();
                        }
                        pcvVar.k = iAddNetwork;
                        pcvVar.g = str6;
                        pcvVar.f = xpvVar2;
                        pcvVar.h = str7;
                        pcvVar.i = i3;
                        if (pcvVar.k == -1) {
                            pcvVar.r.c(xpvVar2, 106);
                            pgr pgrVar3 = pcvVar.o;
                            pgrVar3.y(pag.WIFI_CONNECTION_SETUP_FAILED);
                            ((ype) ((ype) yphVar.g()).ai(6316)).u("failed to connect to network");
                            if (!pgrVar3.V()) {
                                pgrVar3.A();
                            }
                            return;
                        }
                        wifiManager.disconnect();
                        wifiManager.enableNetwork(pcvVar.k, true);
                        pgr pgrVar4 = pcvVar.o;
                        pag pagVar2 = pag.CONNECTING_WIFI;
                        pcvVar.c = pagVar2;
                        pgrVar4.y(pagVar2);
                        pcvVar.d = 0;
                        wifiManager.reconnect();
                        pcvVar.m.postDelayed(pcvVar.p, 25000L);
                    }
                }
            });
        }
        return true;
    }

    public final boolean T() {
        return Build.VERSION.SDK_INT >= 30 && !this.X.j(this.r);
    }

    @Deprecated
    public final boolean V() {
        boolean z;
        synchronized (this.l) {
            z = this.M > 0;
        }
        return z;
    }

    public final boolean Y(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        if (!this.aK) {
            return iArr.length > 0;
        }
        paf pafVar = this.aO;
        if (Build.VERSION.SDK_INT < 30) {
            ((ype) pez.a.l().ai((char) 6448)).u("Not running Android R+, skipping channel check.");
            return true;
        }
        try {
            ygr ygrVarA = ((pez) pafVar).a();
            yph yphVar = pez.a;
            ((ype) ((ype) yphVar.f()).ai((char) 6441)).y("WifiScanner reported available channels: %s", ygrVarA);
            for (int i2 : iArr) {
                if (i2 < 2400) {
                    ((ype) yphVar.l().ai((char) 6445)).u("Channels passed were not frequencies, skipping channel check.");
                    return true;
                }
                if (ygrVarA.contains(Integer.valueOf(i2))) {
                    ((ype) yphVar.l().ai((char) 6444)).u("Found compatible channel, allowing projection.");
                    return true;
                }
                if (i2 == 5000) {
                    ((ype) yphVar.l().ai((char) 6443)).u("Workaround for b/178809212, skipping channel check.");
                    return true;
                }
            }
            ((ype) yphVar.l().ai((char) 6442)).y("No compatible frequency was found for: %s", Arrays.toString(iArr));
            return false;
        } catch (SecurityException unused) {
            ((ype) pez.a.l().ai((char) 6446)).u("No location permission, skipping channel check.");
            return true;
        } catch (pey unused2) {
            ((ype) pez.a.l().ai((char) 6447)).u("WifiScanner not available, skipping channel check.");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Z(defpackage.ozy r9, boolean r10) {
        /*
            r8 = this;
            ygr r0 = defpackage.pgr.aE
            xpv r1 = r9.d
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1f
            yph r2 = defpackage.pgr.a
            yop r2 = r2.l()
            r3 = 6564(0x19a4, float:9.198E-42)
            yop r2 = r2.ai(r3)
            ype r2 = (defpackage.ype) r2
            int r3 = r1.m
            java.lang.String r4 = "Invalid security type: 0x%x"
            r2.w(r4, r3)
        L1f:
            if (r10 == 0) goto L2f
            if (r0 != 0) goto L2f
            pag r2 = defpackage.pag.WIFI_SECURITY_NOT_SUPPORTED
            r8.J(r2)
            int r1 = r1.m
            yxi r2 = defpackage.yxi.WIRELESS_SETUP_BAD_WIFI_SECURITY_TYPE
            r8.aj(r2, r1)
        L2f:
            java.lang.String r1 = r9.a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L44
            r1 = 6565(0x19a5, float:9.2E-42)
            yph r4 = defpackage.pgr.a
            java.lang.String r5 = "Ssid is invalid due to being empty"
            defpackage.a.bu(r5, r1, r4)
            r1 = r3
            goto L45
        L44:
            r1 = r2
        L45:
            if (r10 == 0) goto L4e
            if (r1 != 0) goto L4e
            pag r4 = defpackage.pag.WIFI_INVALID_SSID
            r8.J(r4)
        L4e:
            java.lang.String r4 = r9.b
            boolean r5 = defpackage.jlp.d(r4)
            if (r5 != 0) goto L61
            r5 = 6558(0x199e, float:9.19E-42)
            yph r6 = defpackage.pgr.a
            java.lang.String r7 = "Invalid bssid: %s"
            defpackage.a.bD(r7, r4, r5, r6)
        L5f:
            r4 = r3
            goto L86
        L61:
            java.lang.String r5 = "00:00:00:00:00:00"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L73
            r4 = 6557(0x199d, float:9.188E-42)
            yph r5 = defpackage.pgr.a
            java.lang.String r6 = "Invalid bssid due to being a zero mac address"
            defpackage.a.bu(r6, r4, r5)
            goto L5f
        L73:
            java.lang.String r5 = "ff:ff:ff:ff:ff:ff"
            boolean r4 = defpackage.woy.at(r4, r5)
            if (r4 == 0) goto L85
            r4 = 6556(0x199c, float:9.187E-42)
            yph r5 = defpackage.pgr.a
            java.lang.String r6 = "Invalid bssid due to being a broadcast mac address"
            defpackage.a.bu(r6, r4, r5)
            goto L5f
        L85:
            r4 = r2
        L86:
            if (r10 == 0) goto L8f
            if (r4 != 0) goto L8f
            pag r5 = defpackage.pag.WIFI_INVALID_BSSID
            r8.J(r5)
        L8f:
            java.lang.String r9 = r9.c
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 == 0) goto La2
            r9 = 6563(0x19a3, float:9.197E-42)
            yph r5 = defpackage.pgr.a
            java.lang.String r6 = "Password is invalid due to being empty"
            defpackage.a.bu(r6, r9, r5)
        La0:
            r9 = r3
            goto Lb9
        La2:
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.US_ASCII
            java.nio.charset.CharsetEncoder r5 = r5.newEncoder()
            boolean r9 = r5.canEncode(r9)
            if (r9 != 0) goto Lb8
            r9 = 6562(0x19a2, float:9.195E-42)
            yph r5 = defpackage.pgr.a
            java.lang.String r6 = "Password is invalid due to containing non-ASCII characters"
            defpackage.a.bu(r6, r9, r5)
            goto La0
        Lb8:
            r9 = r2
        Lb9:
            if (r10 == 0) goto Lc2
            if (r9 != 0) goto Lc2
            pag r10 = defpackage.pag.WIFI_INVALID_PASSWORD
            r8.J(r10)
        Lc2:
            if (r0 == 0) goto Ld1
            if (r1 == 0) goto Ld1
            boolean r8 = defpackage.aczv.aL()
            if (r8 != 0) goto Lce
            if (r4 == 0) goto Ld1
        Lce:
            if (r9 == 0) goto Ld1
            return r2
        Ld1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgr.Z(ozy, boolean):boolean");
    }

    @Override // defpackage.pai
    public final pag a() {
        pag pagVar;
        synchronized (this.l) {
            pagVar = this.m;
        }
        return pagVar;
    }

    public final boolean aa(BluetoothDevice bluetoothDevice) {
        String str;
        if (aczv.be()) {
            return true;
        }
        if (aczv.bf()) {
            Optional optionalA = this.O.a(bluetoothDevice.getAddress());
            if (optionalA.isPresent() && (str = ((CarInfoInternal) optionalA.get()).a.j) != null) {
                String lowerCase = str.toLowerCase(Locale.US);
                Iterator<E> it = aczv.S().b.iterator();
                while (it.hasNext()) {
                    if (lowerCase.contains(((String) it.next()).toLowerCase(Locale.US))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0131, code lost:
    
        if (r12 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014c, code lost:
    
        if (r11 != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ac(android.bluetooth.BluetoothDevice r11, int r12) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgr.ac(android.bluetooth.BluetoothDevice, int):int");
    }

    @ResultIgnorabilityUnspecified
    public final void ae() {
        ((ype) ((ype) a.f()).ai((char) 6619)).u("Attempting to stop.");
        ah(false);
    }

    public final void af(pab pabVar, int i2) {
        ap(pabVar, i2, Optional.empty());
    }

    public final void ag(pab pabVar, int i2) {
        ((ype) ((ype) a.f()).ai(6607)).M("Send WifiStartResponse, protocol=%s, status=%s", pabVar.a().name(), wpq.al(i2));
        abnp abnpVarN = xpy.a.n();
        abnpVarN.t();
        xpy xpyVar = (xpy) abnpVarN.b;
        xpyVar.e = i2 - 12;
        xpyVar.b |= 4;
        H(pabVar, (xpy) abnpVarN.q(), xpr.MESSAGE_WIFI_RESPONSE_START_BT);
    }

    @ResultIgnorabilityUnspecified
    public final void ah(boolean z) {
        yph yphVar;
        boolean zA;
        eqn eqnVar;
        eqj eqjVar;
        eqn eqnVar2;
        eqj eqjVar2;
        gjv gjvVar = this.as;
        boolean z2 = true;
        woy.aa(!((Boolean) gjvVar.v()).booleanValue(), "stop invoked when already stopped (or in process of teardown)");
        synchronized (this.l) {
            if (!((Boolean) this.ar.v()).booleanValue()) {
                ((ype) ((ype) a.f()).ai(6622)).u("WirelessSetupEventManager is not active, sending shutdown event and exiting.");
                al();
                return;
            }
            if (!z) {
                if (a.O()) {
                    pgm pgmVar = (pgm) this.aq.v();
                    zA = aczv.aN() ? pgmVar.a() : pgmVar == pgm.c;
                    yphVar = a;
                    ((ype) yphVar.l().ai(6505)).y("Basing wifi active on local network state=%s", pgmVar.name());
                    if (pgmVar == pgm.b) {
                        w(aczv.aN() ? yxi.WIRELESS_NETWORK_MANAGER_ACTIVE_NETWORK_REQUEST_IN_PROGRESS : yxi.WIRELESS_NETWORK_MANAGER_INACTIVE_NETWORK_REQUEST_IN_PROGRESS);
                    }
                } else {
                    yphVar = a;
                    ((ype) yphVar.l().ai(6503)).u("Legacy network manager always assumed to be inactive");
                    zA = false;
                }
                boolean zBooleanValue = ((Boolean) this.au.v()).booleanValue();
                if (zA) {
                    z2 = zBooleanValue;
                } else if (zBooleanValue) {
                }
                ((ype) ((ype) yphVar.f()).ai(6504)).Q("WirelessSetupEventManager should stay active due to: Wifi active=%b, WPP active=%b", zA, z2);
                return;
            }
            gjvVar.w(true);
            pag pagVar = pag.SHUTDOWN;
            this.m = pagVar;
            J(pagVar);
            this.V.unregisterOnSharedPreferenceChangeListener(this.W);
            kzt kztVar = this.ah;
            int i2 = 10;
            ((Handler) kztVar.b).post(new pct(kztVar, i2));
            an();
            if (ab() && (eqnVar2 = this.F) != null && (eqjVar2 = this.G) != null) {
                eqjVar2.k(eqnVar2);
            }
            if (aa(this.r) && (eqnVar = this.H) != null && (eqjVar = this.I) != null) {
                eqjVar.k(eqnVar);
            }
            pcv pcvVar = this.N;
            if (pcvVar != null) {
                pcvVar.d();
            }
            this.R.b();
            this.aq.w(pgm.a);
            Context context = this.q;
            context.unregisterReceiver(this.af);
            context.unregisterReceiver(this.ae);
            al();
            yph yphVar2 = a;
            ((ype) ((ype) yphVar2.f()).ai((char) 6596)).u("Quitting worker threads.");
            HandlerThread handlerThread = this.aI;
            handlerThread.quitSafely();
            HandlerThread handlerThread2 = this.aJ;
            handlerThread2.quitSafely();
            HandlerThread handlerThread3 = this.A;
            handlerThread3.quitSafely();
            ((ype) ((ype) yphVar2.f()).ai((char) 6597)).u("Waiting for worker threads to finish.");
            Duration duration = aG;
            yrm.aE(handlerThread2, duration.toMillis(), TimeUnit.MILLISECONDS);
            yrm.aE(handlerThread, duration.toMillis(), TimeUnit.MILLISECONDS);
            yrm.aE(handlerThread3, duration.toMillis(), TimeUnit.MILLISECONDS);
            this.aw.w(false);
            this.ay.w(false);
            yfq yfqVarAi = ai(new oly(i2));
            int size = yfqVarAi.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((zgp) yfqVarAi.get(i3)).cancel(false);
            }
            ((ype) ((ype) yphVar2.f()).ai((char) 6620)).u("Wireless setup is stopped.");
            w(yxi.WIRELESS_SETUP_STOPPED);
            ((ype) yphVar2.l().ai((char) 6621)).u("Removing all pending tasks on the main handler as part of shutdown.");
            pdk pdkVar = this.z;
            if (!pdkVar.d) {
                pdkVar.a.removeCallbacksAndMessages(null);
                return;
            }
            synchronized (pdkVar.b) {
                pdkVar.c = true;
                pdkVar.a.removeCallbacksAndMessages(null);
            }
        }
    }

    @Override // defpackage.pai
    @ResultIgnorabilityUnspecified
    public final void b(pah pahVar) {
        wer.c();
        this.n.add(pahVar);
    }

    @Override // defpackage.pai
    public final void c(pah pahVar) {
        wer.c();
        this.n.remove(pahVar);
    }

    @Override // defpackage.pai
    @ResultIgnorabilityUnspecified
    public final void d() {
        ak(this.z, new pct(this, 20));
    }

    public final pac h(Optional optional) {
        if (optional.isEmpty()) {
            ((ype) ((ype) a.f()).ai((char) 6517)).u("No WPP on TCP configuration found in storage for the head unit, will not start WPP on TCP.");
            return pac.a;
        }
        L();
        return pac.b;
    }

    public final pgl i(ozr ozrVar) {
        pgl pglVar = (pgl) this.ad.get(ozrVar);
        ozrVar.name();
        pglVar.getClass();
        return pglVar;
    }

    public final pgl j(ozw ozwVar, boolean z) {
        pag pagVar = pag.WIFI_INVALID_PROJECTION_ENDPOINT;
        int iOrdinal = ozwVar.a.ordinal();
        return iOrdinal != 4 ? iOrdinal != 5 ? new pgl(pag.USER_INITIATED_GAL_DISCONNECT_OTHER_REASON, pdo.c) : z ? new pgl(pag.MD_USER_REQUEST_BYE_BYE_INITIATED_WIFI_DISCONNECT_GAL_ONLY, pdo.c) : (aczv.ap() && T()) ? new pgl(pag.MD_USER_REQUEST_BYE_BYE_INITIATED_WIFI_DISCONNECT, pdo.b) : new pgl(pag.MD_USER_REQUEST_BYE_BYE_INITIATED_WIFI_DISCONNECT_GAL_ONLY, pdo.c) : new pgl(pag.HU_USER_REQUEST_BYE_BYE_INITIATED_WIFI_DISCONNECT, pdo.d);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zgs] */
    public final zgp k(pfu pfuVar, Callable callable) {
        wer.c();
        zgp zgpVarSubmit = this.aj.b.submit(callable);
        this.aL.add(new pgk(zgpVarSubmit, pfuVar));
        return zgpVarSubmit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional l(BluetoothDevice bluetoothDevice) {
        try {
            return (Optional) this.P.e(bluetoothDevice).get();
        } catch (InterruptedException | ExecutionException e2) {
            ((ype) ((ype) ((ype) a.h()).p(e2)).ai((char) 6516)).u("Failed to retrieve cached credentials from DataStore");
            return Optional.empty();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional m(BluetoothDevice bluetoothDevice) {
        if (Build.VERSION.SDK_INT < 30) {
            ((ype) ((ype) a.f()).ai((char) 6590)).w("TCP config is not supported below version: %s", 30);
            return Optional.empty();
        }
        try {
            pfx pfxVar = (pfx) this.aA.v();
            boolean z = pfxVar instanceof pfv;
            ozf ozfVar = this.P;
            if (z) {
                return (Optional) ozfVar.f(bluetoothDevice).get(aD.toSeconds(), TimeUnit.SECONDS);
            }
            bluetoothDevice.getClass();
            int i2 = oze.b;
            String strA = oze.a(bluetoothDevice);
            Optional optional = (Optional) (TextUtils.isEmpty(strA) ? wub.Y(Optional.empty()) : zfb.f(ozfVar.d.c(), new ikk(new nzf(strA, 17), 17), ozfVar.c)).get(aD.toSeconds(), TimeUnit.SECONDS);
            return optional.isEmpty() ? Optional.empty() : Optional.of(new pad(((pfw) pfxVar).a, ((pbo) optional.get()).c, ((pbo) optional.get()).d));
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            ((ype) ((ype) ((ype) a.h()).p(e2)).ai((char) 6589)).u("Failed to get Wi-Fi credentials in DataStore.");
            return Optional.empty();
        }
    }

    public final void p() {
        wer.c();
        this.z.c(this.aH);
    }

    public final void q() {
        wer.c();
        this.z.c(this.aM);
    }

    public final void r() {
        wer.c();
        this.z.b(this.ac);
    }

    public final void s(ozr ozrVar) {
        wer.c();
        woy.aa(U(), "handleNonRetryableConnectionFailureReason should only be called if the flag is enabled.");
        woy.aa(!ozrVar.c(), "connectionFailureReason should not be retryable.");
        woy.aa(Build.VERSION.SDK_INT >= 30, "handleNonRetryableConnectionFailureReason should only be called if the SDK is at least R.");
        gjv gjvVar = this.at;
        pgl pglVarI = i(ozrVar);
        ((uk) gjvVar.v()).d(pglVarI.b);
        if (Build.VERSION.SDK_INT >= 30) {
            ype ypeVar = (ype) ((ype) a.f()).ai(6521);
            String strName = ozrVar.name();
            pag pagVar = pglVarI.a;
            ypeVar.M("Stopping WPP due to non-retryable connection failure. Reason=%s, setup event=%s", strName, pagVar.name());
            P();
            O(pagVar);
        }
    }

    public final void t(int i2, int i3) {
        J(pag.NO_COMPATIBLE_WIFI_VERSION_FOUND);
        ((ype) ((ype) a.g()).ai(6522)).S("HU version mismatch, requested version: %d.%d, phone using version: %d.%d", Integer.valueOf(i2), Integer.valueOf(i3), 6, 1);
        ae();
    }

    public final void u(int[] iArr) {
        J(pag.NO_COMPATIBLE_WIFI_CHANNEL_FOUND);
        ((ype) ((ype) a.g()).ai((char) 6523)).y("WiFi channels not supported: %s", Arrays.toString(iArr));
        ae();
    }

    public final void v(Duration duration, boolean z) {
        wer.c();
        gjv gjvVar = this.an;
        if (!((pgn) gjvVar.v()).a()) {
            ((ype) ((ype) a.f()).ai((char) 6555)).y("WPP not eligible to send WifiStartRequest: %s", ((pgn) gjvVar.v()).name());
            return;
        }
        if (ab()) {
            int i2 = ((uk) this.at.v()).a;
            if (i2 == 0) {
                throw null;
            }
            if (i2 != 1) {
                ((ype) ((ype) a.f()).ai((char) 6554)).u("User does not intend to start projection. Not sending start request.");
                return;
            }
        } else if (!((Boolean) this.am.v()).booleanValue()) {
            ((ype) ((ype) a.f()).ai((char) 6553)).u("User does not intend to start projection. Not sending start request.");
            return;
        }
        ((ype) ((ype) a.f()).ai((char) 6552)).y("Scheduling MD start request in %s", duration);
        this.z.f(new jgv(this, z, 10), this.aH, duration.toMillis());
    }

    public final void w(yxi yxiVar) {
        ((kny) this.aj.e).d(yxiVar);
    }

    public final void x(boolean z, OptionalInt optionalInt) {
        if (optionalInt.isPresent()) {
            if (!z) {
                aj(yxi.WIRELESS_SETUP_WPP_CANCELLED, optionalInt.getAsInt());
            } else if (Objects.equals(new ldp(this.q, jri.a, "car").b(), true)) {
                aj(yxi.WIRELESS_SETUP_WPP_ALREADY_PROJECTING, optionalInt.getAsInt());
            }
        }
    }

    public final void y(pag pagVar) {
        synchronized (this.l) {
            int iOrdinal = pagVar.ordinal();
            pdz pdzVar = this.S;
            int i2 = 2;
            if (iOrdinal == 2) {
                pdk pdkVar = this.z;
                pdkVar.d(new pct(this, 14));
                pdkVar.d(new ojl(this, pdzVar, 18));
            } else if (iOrdinal == 6) {
                this.z.d(new ojl(this, pdzVar, 17));
            } else if (iOrdinal != 10) {
                int i3 = 0;
                if (iOrdinal == 15) {
                    pdk pdkVar2 = this.z;
                    pdkVar2.d(new pfp(this, i3));
                    pdkVar2.d(new pfq(this, pdzVar, 1));
                } else if (iOrdinal == 17) {
                    pdk pdkVar3 = this.z;
                    pdkVar3.d(new pct(this, 13));
                    pdkVar3.d(new ojl(this, pdzVar, 16));
                    J(pagVar);
                } else if (iOrdinal != 40) {
                    switch (iOrdinal) {
                        case 21:
                            this.z.d(new pfp(this, i2));
                        case 22:
                            this.m = pagVar;
                            J(pagVar);
                            break;
                        case 23:
                            this.m = pagVar;
                            J(pagVar);
                            this.z.d(new pfq(this, pdzVar, i3));
                            break;
                        default:
                            ((ype) ((ype) a.g()).ai(6584)).u("Unhandled legacy Wi-Fi network set up status");
                            break;
                    }
                } else {
                    J(pagVar);
                }
            } else {
                pdk pdkVar4 = this.z;
                pdkVar4.d(new pct(this, 12));
                pdkVar4.d(new ojl(this, pdzVar, 15));
                J(pag.ABORTED_WIFI);
                pag pagVar2 = pag.CONNECTED_RFCOMM;
                this.m = pagVar2;
                J(pagVar2);
            }
        }
    }

    public final void z(WifiInfo wifiInfo) {
        if (wifiInfo == null) {
            ((ype) ((ype) a.h()).ai((char) 6586)).u("wifi info is null!!!");
            return;
        }
        pfx pfxVar = (pfx) this.aA.v();
        pfxVar.getClass();
        int iAs = lvl.as(pfxVar);
        if (iAs == 0) {
            throw new IllegalStateException("No cached Wi-Fi configuration when trying to persist it.");
        }
        if (iAs != 1) {
            throw new RuntimeException(null, null);
        }
        pfw pfwVar = (pfw) pfxVar;
        try {
            ozy ozyVar = pfwVar.a;
            if (pfwVar.b) {
                BluetoothDevice bluetoothDevice = this.r;
                woy.O(bluetoothDevice != null, "Received null BluetoothDevice");
                try {
                    a.L(this.P.h(bluetoothDevice, ozyVar));
                } catch (ExecutionException e2) {
                    ((ype) ((ype) ((ype) a.h()).p(e2)).ai((char) 6623)).u("Failed to update Wi-Fi credentials in DataStore.");
                }
            } else {
                ((ype) ((ype) a.h()).ai((char) 6587)).u("Not persisting Wi-Fi configuration.");
            }
            int frequency = wifiInfo.getFrequency();
            if (frequency <= 0) {
                ((ype) ((ype) a.h()).ai((char) 6583)).w("HU Wi-Fi Frequency is invalid: %d", frequency);
                return;
            }
            BluetoothDevice bluetoothDevice2 = this.r;
            Optional optionalL = l(bluetoothDevice2);
            if (optionalL.isEmpty()) {
                ((ype) ((ype) a.h()).ai((char) 6582)).u("Wi-Fi frequency is not persisted: config is removed.");
                return;
            }
            ozy ozyVar2 = (ozy) optionalL.get();
            String str = ozyVar2.a;
            String str2 = ozyVar2.b;
            String str3 = ozyVar2.c;
            xpv xpvVar = ozyVar2.d;
            List list = ozyVar2.e;
            Stream streamSkip = Stream.CC.concat(Collection.EL.stream(list), Stream.CC.of(Integer.valueOf(frequency))).skip(Math.max((list.size() + 1) - aczv.g(), 0L));
            int i2 = yfq.d;
            ozy ozyVarF = f(str, str2, str3, xpvVar, (yfq) streamSkip.collect(ycm.a));
            if (list.equals(ozyVarF.e)) {
                ((ype) ((ype) a.f()).ai((char) 6581)).w("Wi-Fi frequency is not persisted: %d", frequency);
                return;
            }
            try {
                if (frequency == this.aQ) {
                    ((ype) ((ype) a.f()).ai(6580)).w("Wi-Fi frequency is not persisted: %d. same drive", frequency);
                    return;
                }
                ((zeu) this.P.h(bluetoothDevice2, ozyVarF)).s();
                this.aQ = frequency;
                ((ype) ((ype) a.f()).ai(6578)).w("Wi-Fi frequency is persisted: %d", frequency);
                aj(yxi.WIRELESS_WIFI_FREQUENCY_PERSISTED, frequency);
                Optional optionalL2 = l(this.r);
                mla mlaVar = new mla(this, 13);
                if (true != optionalL2.isPresent()) {
                    return;
                }
                ((pgr) mlaVar.a).aA.w(new pfw((ozy) optionalL2.get(), true));
            } catch (InterruptedException | ExecutionException e3) {
                ((ype) ((ype) ((ype) a.h()).p(e3)).ai((char) 6579)).u("Failed to update Wi-Fi frequency in DataStore.");
            }
        } catch (Throwable th) {
            throw new RuntimeException(th.toString(), th);
        }
    }
}
