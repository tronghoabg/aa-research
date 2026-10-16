package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rib {
    public final android.content.Context c;
    public final defpackage.rhf d;
    java.lang.String e;
    public defpackage.rhg f;
    public final defpackage.rhu g;
    public final defpackage.rhz h;
    public final defpackage.rhv i;
    public final defpackage.rhx j;
    public final defpackage.rht k;
    public final defpackage.rhw l;
    public final defpackage.rhy m;
    public volatile int n;
    public defpackage.rhs o;
    public int p;
    public int q;
    public volatile java.lang.String r;
    boolean s;
    public final defpackage.wyz t;
    public static final defpackage.yqk a = defpackage.omv.n("CAR.BT");
    private static final defpackage.kwv v = new defpackage.kwv("debug.car.fail_bt_pairing");
    public static final android.os.ParcelUuid[] b = {android.os.ParcelUuid.fromString("0000111e-0000-1000-8000-00805f9b34fb")};
    private static final defpackage.yhx u = defpackage.yhx.t(0, 1, 2, 4, 5, 7, new java.lang.Integer[0]);

    public rib(android.content.Context context, java.lang.String str, defpackage.wyz wyzVar) {
        this.e = null;
        defpackage.rhu rhuVar = new defpackage.rhu(this);
        this.g = rhuVar;
        defpackage.rhz rhzVar = new defpackage.rhz(this);
        this.h = rhzVar;
        defpackage.rhv rhvVar = new defpackage.rhv(this);
        this.i = rhvVar;
        defpackage.rhx rhxVar = new defpackage.rhx(this);
        this.j = rhxVar;
        defpackage.rht rhtVar = new defpackage.rht(this);
        this.k = rhtVar;
        defpackage.rhw rhwVar = new defpackage.rhw(this);
        this.l = rhwVar;
        defpackage.rhy rhyVar = new defpackage.rhy(this);
        this.m = rhyVar;
        this.n = -1;
        this.p = Integer.MIN_VALUE;
        this.q = Integer.MIN_VALUE;
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8146).u("BluetoothUtil");
        this.c = context;
        this.t = wyzVar;
        this.s = true;
        if (str != null && !android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str)) {
            yqkVar.g().ai(8149).y("Invalid peer Bluetooth address: %s", str);
            this.n = -2;
            this.d = null;
            this.f = null;
            return;
        }
        defpackage.rhf rhfVarA = defpackage.rhf.a(context);
        this.d = rhfVarA;
        if (rhfVarA == null) {
            yqkVar.g().ai(8148).u("BluetoothAdapter is null");
            this.n = -3;
            this.f = null;
            return;
        }
        this.e = str;
        if (str != null) {
            this.f = rhfVarA.b(str);
        } else {
            this.f = null;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
        intentFilter2.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
        intentFilter2.setPriority(999);
        android.content.IntentFilter intentFilter3 = new android.content.IntentFilter();
        intentFilter3.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        android.content.IntentFilter intentFilter4 = new android.content.IntentFilter();
        intentFilter4.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        android.content.IntentFilter intentFilter5 = new android.content.IntentFilter();
        intentFilter5.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter5.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        defpackage.duw.e(context, rhuVar, intentFilter, null, 2);
        defpackage.duw.e(context, rhzVar, intentFilter2, null, 2);
        defpackage.duw.e(context, rhvVar, intentFilter3, null, 2);
        defpackage.duw.e(context, rhxVar, intentFilter4, null, 2);
        defpackage.duw.e(context, rhtVar, intentFilter5, null, 2);
        android.content.IntentFilter intentFilter6 = new android.content.IntentFilter();
        intentFilter6.addAction("android.bluetooth.device.action.UUID");
        defpackage.duw.e(context, rhwVar, intentFilter6, null, 2);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            yqkVar.f().ai(8147).u("Registered key missing receiver");
            android.content.IntentFilter intentFilter7 = new android.content.IntentFilter("android.bluetooth.device.action.KEY_MISSING");
            intentFilter7.setPriority(999);
            defpackage.duw.e(context, rhyVar, intentFilter7, null, 2);
        }
        this.n = 0;
    }

    public static java.lang.String a(java.lang.String str) {
        if (str == null) {
            return "null";
        }
        if (android.os.Build.TYPE.equals("user")) {
            return str.length() == 17 ? "XX:XX:XX:XX:".concat(java.lang.String.valueOf(str.substring(12))) : "REDACTED";
        }
        return str;
    }

    public final void b() {
        rsz rszVar;
        int i = this.p;
        if (i == Integer.MIN_VALUE) {
            a.l().ai(8183).u("Not ready for authentication yet, requestedPairingMethod is not set");
            return;
        }
        if (u.contains(java.lang.Integer.valueOf(i)) && this.r == null) {
            a.l().ai(8182).w("Not ready for authentication yet, requestedPairingMethod: %d requires authentication data from client which is not set", this.p);
            return;
        }
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8152).R("authenticateIfReady: requested pairing method=%d, requested pairing key=%d, pairing key from client=%s", java.lang.Integer.valueOf(this.p), java.lang.Integer.valueOf(this.q), this.r);
        yqkVar.l().ai(8153).w("Pairing Bluetooth using method %d", this.p);
        int i2 = this.p;
        int i3 = 1;
        boolean pin = false;
        if (i2 == 0) {
            this.r.getClass();
            byte[] bytes = this.r.getBytes(java.nio.charset.StandardCharsets.UTF_8);
            if (defpackage.rly.a(v)) {
                bytes[0] = (byte) (bytes[0] ^ 1);
            }
            defpackage.rhg rhgVar = this.f;
            rhgVar.getClass();
            pin = rhgVar.a.setPin(bytes);
            yqkVar.l().ai(8158).y("setPin returned %b", java.lang.Boolean.valueOf(pin));
            rszVar = rsz.a;
        } else if (i2 != 2) {
            yqkVar.g().ai(8154).w("Invalid Bluetooth pairing method: %d", this.p);
            e(defpackage.yyn.ANDROID_AUTO_BLUETOOTH_PAIRING_AUTHENTICATION_INVALID_PAIRING_METHOD);
            rszVar = rsz.b;
        } else {
            java.lang.String str = java.lang.String.format(java.util.Locale.US, "%06d", java.lang.Integer.valueOf(this.q));
            if (!str.equals(this.r) || defpackage.rly.a(v)) {
                yqkVar.g().ai(8159).M("Bluetooth pairing authentication data mismatch. Pairing passkey from intent=%s, auth data from client=%s", str, this.r);
                e(defpackage.yyn.ANDROID_AUTO_BLUETOOTH_PAIRING_AUTHENTICATION_AUTH_DATA_MISMATCH);
                defpackage.rhg rhgVar2 = this.f;
                rhgVar2.getClass();
                rhgVar2.d(false);
                rszVar = rsz.d;
            } else {
                defpackage.rhg rhgVar3 = this.f;
                rhgVar3.getClass();
                pin = rhgVar3.d(true);
                yqkVar.l().ai(8160).y("setPairingConfirmation returned %b", java.lang.Boolean.valueOf(pin));
                rszVar = rsz.a;
            }
        }
        if (pin) {
            yqkVar.f().ai(8157).u("Authentication success");
            e(defpackage.yyn.ANDROID_AUTO_BLUETOOTH_PAIRING_AUTHENTICATION_SUCCESS);
        } else {
            yqkVar.g().ai(8155).u("Authentication failed");
            e(defpackage.yyn.ANDROID_AUTO_BLUETOOTH_PAIRING_AUTHENTICATION_FAILED);
        }
        d();
        if (!pin) {
            yqkVar.g().ai(8156).u("Unpairing due to authentication failure");
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                c();
            } else {
                j(ria.e);
            }
        }
        defpackage.wyz wyzVar = this.t;
        defpackage.yqk yqkVar2 = defpackage.qsa.a;
        yqkVar2.l().ai(7712).y("onAuthenticationResult %s", rszVar);
        defpackage.qsa qsaVar = (defpackage.qsa) wyzVar.a;
        com.google.android.gms.car.CarInfo carInfoL = qsaVar.p.l();
        if (carInfoL == null) {
            yqkVar2.l().ai(7714).u("not sending result: failed to get head unit protocol version");
            return;
        }
        int i4 = carInfoL.e;
        int i5 = carInfoL.f;
        if (i4 <= 0) {
            i3 = i4;
        } else if (i4 != 1 || i5 >= 5) {
            qsaVar.g.f(rszVar);
            return;
        }
        yqkVar2.l().ai(7713).B("not sending result: unsupported on head unit protocol v%d.%d", i3, i5);
    }

    public final void c() {
        a.f().ai(8161).u("cancel pairing");
        defpackage.rhg rhgVar = this.f;
        rhgVar.getClass();
        rhgVar.e();
    }

    public final void d() {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8174).u("invalidateAuthenticationData");
        if (this.n != 0) {
            yqkVar.g().ai(8175).u("invalidateAuthenticationData: This object wasn't initialized successfully");
            return;
        }
        this.p = Integer.MIN_VALUE;
        this.q = Integer.MIN_VALUE;
        this.r = null;
    }

    final void e(defpackage.yyn yynVar) {
        yynVar.name();
        defpackage.omv.i(this.c, yynVar);
    }

    public final boolean f() {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8176).u("isEnabled");
        if (this.n != 0) {
            yqkVar.l().ai(8177).u("isEnabled: This object wasn't initialized successfully.");
            return false;
        }
        defpackage.rhf rhfVar = this.d;
        rhfVar.getClass();
        return rhfVar.a.isEnabled();
    }

    final boolean g(android.bluetooth.BluetoothDevice bluetoothDevice) {
        defpackage.rhg rhgVar = this.f;
        rhgVar.getClass();
        return rhgVar != null && rhgVar.a.equals(bluetoothDevice);
    }

    public final boolean h() {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8178).u("isPaired");
        if (this.n != 0) {
            yqkVar.l().ai(8179).u("isPaired: This object wasn't initialized successfully.");
            return false;
        }
        defpackage.rhg rhgVar = this.f;
        rhgVar.getClass();
        return rhgVar.a() == 12;
    }

    public final boolean i() {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8180).u("isPairing");
        if (this.n != 0) {
            yqkVar.l().ai(8181).u("isPairing: This object wasn't initialized successfully.");
            return false;
        }
        defpackage.rhg rhgVar = this.f;
        rhgVar.getClass();
        return rhgVar.a() == 11;
    }

    public final void j(ria riaVar) {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8191).u("unpair");
        defpackage.qsa qsaVar = (defpackage.qsa) this.t.a;
        qsaVar.o.e(riaVar.h);
        if (riaVar == ria.b) {
            rxy.m(qsaVar.n, yyt.q);
        }
        if (this.n != 0) {
            yqkVar.l().ai(8193).u("unpair: This object wasn't initialized successfully.");
            return;
        }
        defpackage.rhg rhgVar = this.f;
        rhgVar.getClass();
        this.s = rhgVar.c();
        defpackage.rhg rhgVar2 = this.f;
        rhgVar2.getClass();
        int iA = rhgVar2.a();
        yqkVar.l().ai(8192).w("bond state = %s", iA);
        if (iA == 11) {
            defpackage.rhg rhgVar3 = this.f;
            rhgVar3.getClass();
            rhgVar3.e();
        } else if (iA == 10) {
            return;
        }
        e(riaVar.g);
        defpackage.rhg rhgVar4 = this.f;
        rhgVar4.getClass();
        rhgVar4.h();
    }
}
