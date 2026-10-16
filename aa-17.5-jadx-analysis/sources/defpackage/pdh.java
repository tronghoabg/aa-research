package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.MacAddress;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Map;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.Consumer$CC;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;

/* loaded from: classes2.dex */
public final class pdh {
    private static final yfy H;
    private static final ygr I;
    public static final yph a = yph.c("GH.WirelessNetRequest");
    public static final Duration b = Duration.ofSeconds(2);
    public static final Duration c = Duration.ofSeconds(7);
    static final Duration d = Duration.ofMillis(500);
    static final yfy e;
    public static final yfy f;
    public volatile Network A;
    public LinkProperties B;
    public WifiInfo C;
    public boolean D;
    public boolean E;
    public final Object F;
    public final gjv G;
    private final yfq J;
    private final Duration K;
    private final ToIntFunction L;
    private final ConnectivityManager.NetworkCallback M;
    private pdg N;
    private final ajdr O;
    public final Duration g;
    public final yfy h;
    public final yfy i;
    public final pbz j;
    public final WifiManager k;
    public final UserManager l;
    public final pdk m;
    public final boolean n;
    public final xya o;
    public final Optional p;
    public final Context q;
    public final Object r;
    public final Object s;
    public final Map t;
    public ozy u;
    public pde v;
    public pdb w;
    public int x;
    public boolean y;
    public boolean z;

    static {
        int i;
        yfy yfyVarQ;
        char c2;
        yfy yfyVarD;
        yfu yfuVar = new yfu(4);
        yfuVar.e(SupplicantState.DISCONNECTED, yxi.WIRELESS_WIFI_SUPPLICANT_DISCONNECTED);
        yfuVar.e(SupplicantState.INTERFACE_DISABLED, yxi.WIRELESS_WIFI_SUPPLICANT_INTERFACE_DISABLED);
        yfuVar.e(SupplicantState.INACTIVE, yxi.WIRELESS_WIFI_SUPPLICANT_INACTIVE);
        yfuVar.e(SupplicantState.SCANNING, yxi.WIRELESS_WIFI_SUPPLICANT_SCANNING);
        yfuVar.e(SupplicantState.AUTHENTICATING, yxi.WIRELESS_WIFI_SUPPLICANT_AUTHENTICATING);
        yfuVar.e(SupplicantState.ASSOCIATING, yxi.WIRELESS_WIFI_SUPPLICANT_ASSOCIATING);
        yfuVar.e(SupplicantState.ASSOCIATED, yxi.WIRELESS_WIFI_SUPPLICANT_ASSOCIATED);
        yfuVar.e(SupplicantState.FOUR_WAY_HANDSHAKE, yxi.WIRELESS_WIFI_SUPPLICANT_FOUR_WAY_HANDSHAKE);
        yfuVar.e(SupplicantState.GROUP_HANDSHAKE, yxi.WIRELESS_WIFI_SUPPLICANT_GROUP_HANDSHAKE);
        yfuVar.e(SupplicantState.COMPLETED, yxi.WIRELESS_WIFI_SUPPLICANT_COMPLETED);
        yfuVar.e(SupplicantState.DORMANT, yxi.WIRELESS_WIFI_SUPPLICANT_DORMANT);
        yfuVar.e(SupplicantState.UNINITIALIZED, yxi.WIRELESS_WIFI_SUPPLICANT_UNINITIALIZED);
        yfuVar.e(SupplicantState.INVALID, yxi.WIRELESS_WIFI_SUPPLICANT_INVALID);
        e = yfuVar.d(true);
        if (Build.VERSION.SDK_INT >= 34) {
            i = 34;
            yfyVarQ = yfy.q(0, ozr.k, 1, ozr.l, 2, ozr.m, 3, ozr.n, 4, ozr.o, 5, ozr.p, 6, ozr.q);
        } else {
            i = 34;
            yfyVarQ = ylx.a;
        }
        H = yfyVarQ;
        if (Build.VERSION.SDK_INT >= i) {
            yfu yfuVar2 = new yfu(4);
            yfuVar2.e(0, yxi.WIRELESS_LOCAL_ONLY_CONNECTION_FAILURE_UNKNOWN);
            yfuVar2.e(1, yxi.WIRELESS_LOCAL_ONLY_CONNECTION_FAILURE_ASSOCIATION);
            yfuVar2.e(2, yxi.WIRELESS_LOCAL_ONLY_CONNECTION_FAILURE_AUTHENTICATION);
            yfuVar2.e(3, yxi.WIRELESS_LOCAL_ONLY_CONNECTION_FAILURE_IP_PROVISIONING);
            yfuVar2.e(4, yxi.WIRELESS_LOCAL_ONLY_CONNECTION_FAILURE_NOT_FOUND);
            yfuVar2.e(5, yxi.WIRELESS_LOCAL_ONLY_CONNECTION_FAILURE_NO_RESPONSE);
            yfuVar2.e(6, yxi.WIRELESS_LOCAL_ONLY_CONNECTION_FAILURE_USER_REJECT);
            c2 = 1;
            yfyVarD = yfuVar2.d(true);
        } else {
            c2 = 1;
            yfyVarD = ylx.a;
        }
        f = yfyVarD;
        SupplicantState supplicantState = SupplicantState.AUTHENTICATING;
        SupplicantState[] supplicantStateArr = new SupplicantState[4];
        supplicantStateArr[0] = SupplicantState.ASSOCIATING;
        supplicantStateArr[c2] = SupplicantState.ASSOCIATED;
        supplicantStateArr[2] = SupplicantState.FOUR_WAY_HANDSHAKE;
        supplicantStateArr[3] = SupplicantState.GROUP_HANDSHAKE;
        I = yrm.o(supplicantState, supplicantStateArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01bd, code lost:
    
        if (r12.equals("high_performance") != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pdh(android.content.Context r12, defpackage.ajdr r13, java.util.function.Function r14, java.util.function.ToIntFunction r15) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdh.<init>(android.content.Context, ajdr, java.util.function.Function, java.util.function.ToIntFunction):void");
    }

    public static boolean m() {
        return hrp.a() && aczv.ar();
    }

    private final void p(WifiNetworkSpecifier.Builder builder) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 34) {
            WifiManager wifiManager = this.k;
            if (wifiManager.isStaConcurrencyForLocalOnlyConnectionsSupported()) {
                b(yxi.WIRELESS_WIFI_DUAL_STA_SUPPORTED, DesugarArrays.stream(ep$$ExternalSyntheticApiModelOutline0.m288m$1().getDeclaredMethods()).anyMatch(new oly(8)) ? 1 : 0);
                if (!aczv.at()) {
                    ((ype) a.l().ai((char) 6363)).u("Dual STA is not enabled: disabled");
                    return;
                }
                if (aczv.an() && wifiManager.isWifiApEnabled()) {
                    ((ype) a.l().ai((char) 6362)).u("Dual STA is not enabled: hotspot");
                    a(yxi.WIRELESS_WIFI_DUAL_STA_NOT_ENABLED_DUE_TO_HOTSPOT);
                    return;
                }
                try {
                    Method declaredMethod = ep$$ExternalSyntheticApiModelOutline0.m288m$1().getDeclaredMethod("setPreferSecondarySta", Boolean.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(builder, true);
                    ((ype) a.l().ai(6360)).u("Dual STA is enabled.");
                    a(yxi.WIRELESS_WIFI_DUAL_STA_ENABLED);
                    return;
                } catch (ReflectiveOperationException unused) {
                    ((ype) a.l().ai((char) 6361)).u("Dual STA is not enabled.");
                    return;
                }
            }
        }
        ((ype) a.l().ai((char) 6359)).u("Dual STA is not enabled: not supported");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean q(boolean r7) {
        /*
            r6 = this;
            xya r0 = r6.o
            boolean r1 = r0.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            j$.time.Duration r1 = r0.c()
            r1.getClass()
            j$.time.Duration r4 = r6.K
            boolean r1 = defpackage.ysi.c(r4, r1)
            if (r1 == 0) goto L18
            goto L1a
        L18:
            r1 = r2
            goto L1b
        L1a:
            r1 = r3
        L1b:
            int r4 = r6.x
            int r4 = r4 + r3
            r6.x = r4
            yfq r5 = r6.J
            yls r5 = (defpackage.yls) r5
            int r5 = r5.c
            if (r4 >= r5) goto L2b
            if (r1 == 0) goto L2d
            r1 = r3
        L2b:
            if (r7 == 0) goto L4a
        L2d:
            yph r0 = defpackage.pdh.a
            yop r0 = r0.f()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r1 = 6365(0x18dd, float:8.919E-42)
            java.lang.String r2 = "Retry to connect to the same network. Force: %b"
            defpackage.a.bF(r0, r2, r7, r1)
            r6.e()
            r6.f()
            yxi r7 = defpackage.yxi.WIRELESS_WIFI_RECONNECTION_ATTEMPT
            r6.a(r7)
            return r3
        L4a:
            yph r7 = defpackage.pdh.a
            yop r7 = r7.f()
            ype r7 = (defpackage.ype) r7
            r3 = 6364(0x18dc, float:8.918E-42)
            yop r7 = r7.ai(r3)
            ype r7 = (defpackage.ype) r7
            int r6 = r6.x
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r4 = "Do not retry wifi connection. Num attempts used: %d/%d, expired: %b"
            r7.R(r4, r6, r3, r1)
            r0.d()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdh.q(boolean):boolean");
    }

    private static boolean r() {
        if (Build.VERSION.SDK_INT < 36) {
            return Build.VERSION.SDK_INT >= 34 && woy.at(Build.MANUFACTURER, "Google");
        }
        return true;
    }

    public final void a(yxi yxiVar) {
        ((kny) this.O.e).d(yxiVar);
    }

    public final void b(yxi yxiVar, int i) {
        ((kny) this.O.e).e(yxiVar, OptionalInt.of(i));
    }

    public final void c(ozr ozrVar) {
        if (!Collection.EL.stream(this.t.values()).anyMatch(new oly(9))) {
            e();
            n(2, 3, new kok(ozrVar, 18));
            return;
        }
        woy.aa(this.y ^ this.z, "Network loss occurred while clients have not been previously notified and neither delayed onAvailable nor waiting on DHCP address was true.");
        if (this.y) {
            a(yxi.WIRELESS_WIFI_NETWORK_LOST_BEFORE_CLIENT_INFORMED_OF_AVAILABLE);
        } else if (this.z) {
            a(yxi.WIRELESS_WIFI_NETWORK_LOST_WHILE_WAITING_FOR_DHCP_SERVER_ADDRESS);
        }
        e();
        q(true);
    }

    public final void d(OptionalInt optionalInt) {
        ozr ozrVar;
        if (this.E) {
            if (aczv.as()) {
                if (optionalInt.isPresent() && optionalInt.getAsInt() == 6) {
                    ((ype) ((ype) a.f()).ai((char) 6368)).u("Not retrying network connection after local only user reject");
                } else if (q(false)) {
                    return;
                }
            } else if (q(false)) {
                return;
            }
            e();
            SupplicantState supplicantState = this.k.getConnectionInfo().getSupplicantState();
            a((yxi) e.getOrDefault(supplicantState, yxi.WIRELESS_WIFI_SUPPLICANT_UNKNOWN));
            a(yxi.WIRELESS_WIFI_NETWORK_CONNECT_ATTEMPTS_EXHAUSTED);
            if (Build.VERSION.SDK_INT < 34 || !optionalInt.isPresent()) {
                ozrVar = I.contains(supplicantState) ? ozr.r : ozr.s;
            } else {
                int asInt = optionalInt.getAsInt();
                ozrVar = (ozr) H.get(Integer.valueOf(asInt));
                if (ozrVar == null) {
                    throw new IllegalArgumentException(a.bp(asInt, "Invalid local failure reason: "));
                }
            }
            n(1, 3, new kok(ozrVar, 17));
            n(2, 3, new iwu(20));
        }
    }

    public final void e() {
        wer.c();
        if (this.E) {
            this.A = null;
            this.B = null;
            this.C = null;
            this.z = false;
            this.y = false;
            ((ype) a.l().ai((char) 6371)).w("Unregistering network callback. PID=%d", Process.myPid());
            if (l()) {
                this.m.c(this.s);
            }
            this.E = false;
            this.j.d(this.M);
            this.m.c(this.F);
            this.G.w(false);
            this.o.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        HashSet hashSet;
        boolean z;
        List<ScanResult> scanResults;
        wer.c();
        if (this.E) {
            return;
        }
        yph yphVar = a;
        ((ype) yphVar.l().ai(6372)).w("Requesting network. PID=%d", Process.myPid());
        if (aczv.aO() && koo.n() && woy.at("true", dlz.E("debug.gh.print_wifi_info"))) {
            ((ype) yphVar.l().ai(6374)).y("FI_ONLY %s", this.u);
            ((ype) yphVar.l().ai(6375)).y("FI_ONLY WifiPassword: %s", this.u.c);
        }
        byte[] bArr = null;
        this.A = null;
        this.B = null;
        this.C = null;
        a(yxi.WIRELESS_CONNECTING_WIFI);
        ozy ozyVar = this.u;
        ozyVar.getClass();
        WifiNetworkSpecifier.Builder ssid = new WifiNetworkSpecifier.Builder().setSsid(ozyVar.a);
        if (aczv.aM()) {
            ((ype) yphVar.l().ai(6373)).y("omit BSSID (%s) when requesting network", ozyVar.b);
        } else {
            ssid.setBssid(MacAddress.fromString(ozyVar.b));
        }
        if (aczv.aa()) {
            ssid.setIsHiddenSsid(true);
        }
        Object[] objArr = 0;
        if (Build.VERSION.SDK_INT >= 34 && ((aczv.bc() || this.x != ((yls) this.J).c - 1 || r()) && !this.u.e.isEmpty())) {
            List list = this.u.e;
            ToIntFunction toIntFunction = this.L;
            WifiManager wifiManager = this.k;
            int iApplyAsInt = toIntFunction.applyAsInt(wifiManager);
            if (r()) {
                hashSet = new HashSet();
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0 || hashSet.size() >= iApplyAsInt) {
                        break;
                    } else {
                        hashSet.add((Integer) list.get(size));
                    }
                }
                z = !hashSet.isEmpty();
            } else {
                hashSet = new HashSet(list);
                z = ((long) hashSet.size()) * aczv.t() <= ((long) list.size()) && hashSet.size() <= iApplyAsInt;
            }
            int i = iApplyAsInt << 16;
            if (((aczv.f() <= 0 || (scanResults = wifiManager.getScanResults()) == null) ? true : Collection.EL.stream(scanResults).filter(new pcx(this.u, objArr == true ? 1 : 0)).filter(new oly(7)).findAny().isEmpty()) && z) {
                ssid.setPreferredChannelsFrequenciesMhz(Collection.EL.stream(hashSet).mapToInt(new mim(9)).toArray());
                ((ype) ((ype) yphVar.f()).ai(6367)).R("Wi-Fi frequency is specified: %s; size: %d; limit: %d", hashSet, Integer.valueOf(list.size()), Integer.valueOf(iApplyAsInt));
                b(yxi.WIRELESS_WIFI_FREQUENCY_SPECIFIED, (list.size() << 8) | new HashSet(list).size() | i);
            } else {
                ((ype) ((ype) yphVar.f()).ai(6366)).R("Wi-Fi frequency is not specified: %s; size = %d; limit = %d", hashSet, Integer.valueOf(list.size()), Integer.valueOf(iApplyAsInt));
                b(yxi.WIRELESS_WIFI_FREQUENCY_NOT_SPECIFIED, (list.size() << 8) | new HashSet(list).size() | i);
            }
        }
        p(ssid);
        boolean z2 = this.n;
        kok kokVar = new kok(this, 15);
        xpv xpvVar = ozyVar.d;
        switch (xpvVar) {
            case UNKNOWN_SECURITY_MODE:
            case OPEN:
            case WEP_64:
            case WEP_128:
            case WPA_PERSONAL:
            case WPA_WPA2_PERSONAL:
            case WPA_ENTERPRISE:
            case WPA2_ENTERPRISE:
            case WPA_WPA2_ENTERPRISE:
                throw new IllegalArgumentException("Manager does not support the specified security mode ".concat(String.valueOf(xpvVar.name())));
            case WPA2_PERSONAL:
                ((ype) ((ype) yphVar.f()).ai((char) 6339)).u("HU is using WPA2 security mode.");
                kokVar.accept(yxi.WIRELESS_WIFI_USING_WPA2_SECURITY);
                ssid.setWpa2Passphrase(ozyVar.c);
                break;
            case WPA3_PERSONAL:
                ((ype) ((ype) yphVar.f()).ai((char) 6341)).u("HU is using WPA3 security mode.");
                kokVar.accept(yxi.WIRELESS_WIFI_USING_WPA3_SECURITY);
                ssid.setWpa3Passphrase(ozyVar.c);
                break;
            case WPA2_WPA3_PERSONAL:
                Object[] objArr2 = aczv.bi() && z2;
                ((ype) ((ype) yphVar.f()).ai(6340)).y("HU is using WPA3 transition security mode. Selected mode=%s", true != objArr2 ? "WPA2" : "WPA3");
                kokVar.accept(yxi.WIRELESS_WIFI_USING_WPA3_TRANSITION_SECURITY);
                if (objArr2 != true) {
                    ssid.setWpa2Passphrase(ozyVar.c);
                    break;
                } else {
                    ssid.setWpa3Passphrase(ozyVar.c);
                    break;
                }
        }
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).removeCapability(12).setNetworkSpecifier(ssid.build()).build();
        int i2 = this.x;
        yfq yfqVar = this.J;
        woy.Z(i2 < ((yls) yfqVar).c);
        Duration duration = (Duration) yfqVar.get(this.x);
        if (l()) {
            this.m.f(new ojl(this, duration, 13, bArr), this.s, duration.toMillis());
            this.j.b(networkRequestBuild, this.M);
        } else {
            this.j.c(networkRequestBuild, this.M, (int) duration.toMillis());
        }
        b(yxi.WIRELESS_CONNECTING_WIFI_WITH_TIMEOUT, (int) duration.toMillis());
        this.E = true;
        xya xyaVar = this.o;
        if (!xyaVar.a) {
            xyaVar.e();
        }
        pdk pdkVar = this.m;
        Object obj = this.r;
        pdkVar.c(obj);
        pdkVar.f(new pct(this, 4), obj, c.toMillis());
    }

    public final void g() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 6376)).u("Resetting...");
        Optional optional = this.p;
        if (true == optional.isPresent()) {
            WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) optional.get();
            if (wifiLock.isHeld()) {
                wifiLock.release();
            }
        }
        Map map = this.t;
        if (!map.isEmpty()) {
            ((ype) ((ype) yphVar.f()).ai((char) 6377)).w("Removing %d network requester callbacks", map.size());
            map.clear();
        }
        this.o.d();
        this.x = 0;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = false;
        this.u = null;
        j();
        this.m.c(null);
    }

    public final void h() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 6378)).u("Requesting Wi-Fi scan...");
        a(yxi.WIRELESS_WIFI_SCAN_ISSUED);
        if (this.N == null) {
            pdg pdgVar = new pdg(this);
            this.N = pdgVar;
            dup.e(this.q, pdgVar, new IntentFilter("android.net.wifi.SCAN_RESULTS"), null, 2);
        }
        if (this.k.startScan()) {
            return;
        }
        ((ype) ((ype) yphVar.h()).ai((char) 6379)).u("Failed to issue Wi-Fi scan. Check system logs for more details.");
        j();
        a(yxi.WIRELESS_WIFI_SCAN_FAILED_TO_START);
    }

    public final void i() {
        wer.c();
        n(1, 2, new kok(this, 16));
    }

    public final void j() {
        pdg pdgVar = this.N;
        if (pdgVar != null) {
            this.q.unregisterReceiver(pdgVar);
            this.N = null;
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean k() {
        if (this.A != null) {
            return true;
        }
        WifiManager wifiManager = this.k;
        if (!wifiManager.isWifiEnabled()) {
            ((ype) ((ype) a.h()).ai((char) 6352)).u("Wi-Fi is disabled");
            a(yxi.WIRELESS_WIFI_TURNED_OFF);
            return false;
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        String ssid = connectionInfo.getSSID();
        int i = jlp.a;
        String strK = roc.k(ssid);
        String bssid = connectionInfo.getBSSID();
        SupplicantState supplicantState = connectionInfo.getSupplicantState();
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 6342)).y("Supplicant state: %s", supplicantState.name());
        a((yxi) e.getOrDefault(supplicantState, yxi.WIRELESS_WIFI_SUPPLICANT_INVALID));
        if (!SupplicantState.COMPLETED.equals(supplicantState)) {
            return false;
        }
        if (TextUtils.isEmpty(bssid)) {
            ((ype) ((ype) yphVar.h()).ai((char) 6351)).u("Not connected to any Wi-Fi network");
            a(yxi.WIRELESS_WIFI_NOT_CONNECTED_TO_ANY_NETWORK);
            return false;
        }
        if (TextUtils.isEmpty(strK) || "<unknown ssid>".equals(strK)) {
            ((ype) ((ype) yphVar.h()).ai((char) 6348)).u("Failed to get SSID from connection info");
            a(yxi.WIRELESS_WIFI_FAILED_TO_GET_WIFI_INFO);
            return false;
        }
        if (!strK.equals(this.u.a)) {
            ((ype) ((ype) yphVar.h()).ai(6350)).M("Connected to network %s while expected %s", strK, this.u.a);
            a(yxi.WIRELESS_WIFI_CONNECTED_TO_WRONG_SSID);
            return false;
        }
        if (woy.at(bssid, this.u.b)) {
            return true;
        }
        ((ype) ((ype) yphVar.h()).ai(6349)).R("Connected to %s, but wrong BSSID: %s, while expected %s", strK, bssid, this.u.b);
        a(yxi.WIRELESS_WIFI_CONNECTED_TO_WRONG_BSSID);
        return false;
    }

    public final boolean l() {
        if (this.v == null) {
            return false;
        }
        woy.Z(Build.VERSION.SDK_INT >= 34);
        return true;
    }

    public final void n(int i, final int i2, final Consumer consumer) {
        Iterable$EL.forEach((ygr) Collection.EL.stream(this.t.entrySet()).filter(new nsc(i, 4)).collect(ycm.b), new Consumer() { // from class: pcy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                pdh pdhVar = this.a;
                Map map = pdhVar.t;
                if (!map.containsKey(key)) {
                    ((ype) ((ype) pdh.a.f()).ai((char) 6355)).y("Client %s was unregistered prior to callback dispatch. Not notifying", entry.getKey());
                    return;
                }
                Consumer consumer2 = consumer;
                ((pdf) entry.getValue()).b = i2;
                consumer2.accept(((pdf) entry.getValue()).a);
                pdd pddVar = (pdd) entry.getKey();
                if (map.containsKey(pddVar) && ((pdf) map.get(pddVar)).b == 3) {
                    pdhVar.o(pddVar);
                }
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        });
    }

    final void o(pdd pddVar) {
        pdb pdbVar;
        wer.c();
        Map map = this.t;
        if (map.containsKey(pddVar)) {
            pdf pdfVar = (pdf) map.remove(pddVar);
            yph yphVar = a;
            ((ype) ((ype) yphVar.f()).ai(6384)).M("unregisterRequest: removing %s, requester state: %s", pddVar, pdfVar);
            if (!map.isEmpty()) {
                ((ype) ((ype) yphVar.f()).ai(6385)).Q("unregisterRequest: other callbacks registered, do not stop right now. Network requested: %b, available: %b", this.E, this.A != null);
                return;
            }
            ((ype) ((ype) yphVar.f()).ai((char) 6386)).u("unregisterRequest: no callbacks registered, calling stop");
            wer.c();
            e();
            if (this.D) {
                if (l()) {
                    pde pdeVar = this.v;
                    pdeVar.a = true;
                    try {
                        this.k.removeLocalOnlyConnectionFailureListener(pdeVar);
                    } catch (SecurityException e2) {
                        yphVar = a;
                        ((ype) ((ype) ((ype) yphVar.h()).p(e2)).ai((char) 6381)).u("Cannot remove local-only connection listener");
                    }
                    this.v = null;
                }
                if (m() && (pdbVar = this.w) != null) {
                    this.k.removeLocalOnlyDisconnectionStatusListener(pdbVar);
                    this.w = null;
                    ((ype) yphVar.l().ai((char) 6382)).u("Removed disconnection status listener from wifiManager");
                }
            }
            g();
            ((ype) yphVar.l().ai((char) 6380)).u("ModernNetworkRequestManager stopped.");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModernNetworkRequestManager{");
        sb.append("callbacks: {");
        Map.EL.forEach(this.t, new pcw(sb, 0));
        sb.append("} wifiConfiguration=");
        sb.append(this.u);
        sb.append(", network=");
        sb.append(this.A);
        sb.append(", linkProperties=");
        sb.append(this.B);
        sb.append(", isStarted=");
        sb.append(this.D);
        sb.append(", isNetworkRequested=");
        sb.append(this.E);
        sb.append(", wifiInfo=");
        sb.append(this.C);
        sb.append(", numConnectionAttempts=");
        sb.append(this.x);
        sb.append("}");
        return sb.toString();
    }
}
