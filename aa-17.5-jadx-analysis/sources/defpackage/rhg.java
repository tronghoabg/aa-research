package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.ParcelUuid;
import com.google.android.gms.car.CarInfo;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* loaded from: classes.dex */
public final class rhg {
    public final Context c;
    public final rgk d;
    String e;
    public rgl f;
    public final rgz g;
    public final rhe h;
    public final rha i;
    public final rhc j;
    public final rgy k;
    public final rhb l;
    public final rhd m;
    public volatile int n;
    public rgx o;
    public int p;
    public int q;
    public volatile String r;
    boolean s;
    public final wyd t;
    public static final ypf a = ols.R("CAR.BT");
    private static final vqk v = new vqk("debug.car.fail_bt_pairing");
    public static final ParcelUuid[] b = {ParcelUuid.fromString("0000111e-0000-1000-8000-00805f9b34fb")};
    private static final ygr u = ygr.t(0, 1, 2, 4, 5, 7, new Integer[0]);

    public rhg(Context context, String str, wyd wydVar) {
        this.e = null;
        rgz rgzVar = new rgz(this);
        this.g = rgzVar;
        rhe rheVar = new rhe(this);
        this.h = rheVar;
        rha rhaVar = new rha(this);
        this.i = rhaVar;
        rhc rhcVar = new rhc(this);
        this.j = rhcVar;
        rgy rgyVar = new rgy(this);
        this.k = rgyVar;
        rhb rhbVar = new rhb(this);
        this.l = rhbVar;
        rhd rhdVar = new rhd(this);
        this.m = rhdVar;
        this.n = -1;
        this.p = Integer.MIN_VALUE;
        this.q = Integer.MIN_VALUE;
        ypf ypfVar = a;
        ypfVar.l().ai(8121).u("BluetoothUtil");
        this.c = context;
        this.t = wydVar;
        this.s = true;
        if (str != null && !BluetoothAdapter.checkBluetoothAddress(str)) {
            ypfVar.g().ai(8124).y("Invalid peer Bluetooth address: %s", str);
            this.n = -2;
            this.d = null;
            this.f = null;
            return;
        }
        rgk rgkVarA = rgk.a(context);
        this.d = rgkVarA;
        if (rgkVarA == null) {
            ypfVar.g().ai(8123).u("BluetoothAdapter is null");
            this.n = -3;
            this.f = null;
            return;
        }
        this.e = str;
        if (str != null) {
            this.f = rgkVarA.b(str);
        } else {
            this.f = null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
        intentFilter2.setPriority(999);
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        IntentFilter intentFilter4 = new IntentFilter();
        intentFilter4.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        IntentFilter intentFilter5 = new IntentFilter();
        intentFilter5.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter5.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        dup.e(context, rgzVar, intentFilter, null, 2);
        dup.e(context, rheVar, intentFilter2, null, 2);
        dup.e(context, rhaVar, intentFilter3, null, 2);
        dup.e(context, rhcVar, intentFilter4, null, 2);
        dup.e(context, rgyVar, intentFilter5, null, 2);
        IntentFilter intentFilter6 = new IntentFilter();
        intentFilter6.addAction("android.bluetooth.device.action.UUID");
        dup.e(context, rhbVar, intentFilter6, null, 2);
        if (Build.VERSION.SDK_INT >= 35) {
            ypfVar.f().ai(8122).u("Registered key missing receiver");
            IntentFilter intentFilter7 = new IntentFilter("android.bluetooth.device.action.KEY_MISSING");
            intentFilter7.setPriority(999);
            dup.e(context, rhdVar, intentFilter7, null, 2);
        }
        this.n = 0;
    }

    public final void a() {
        rsf rsfVar;
        int i = this.p;
        if (i == Integer.MIN_VALUE) {
            a.l().ai(8158).u("Not ready for authentication yet, requestedPairingMethod is not set");
            return;
        }
        if (u.contains(Integer.valueOf(i)) && this.r == null) {
            a.l().ai(8157).w("Not ready for authentication yet, requestedPairingMethod: %d requires authentication data from client which is not set", this.p);
            return;
        }
        ypf ypfVar = a;
        ypfVar.l().ai(8127).R("authenticateIfReady: requested pairing method=%d, requested pairing key=%d, pairing key from client=%s", Integer.valueOf(this.p), Integer.valueOf(this.q), this.r);
        ypfVar.l().ai(8128).w("Pairing Bluetooth using method %d", this.p);
        int i2 = this.p;
        int i3 = 1;
        boolean pin = false;
        if (i2 == 0) {
            this.r.getClass();
            byte[] bytes = this.r.getBytes(StandardCharsets.UTF_8);
            if (rlc.a(v)) {
                bytes[0] = (byte) (bytes[0] ^ 1);
            }
            rgl rglVar = this.f;
            rglVar.getClass();
            pin = rglVar.a.setPin(bytes);
            ypfVar.l().ai(8133).y("setPin returned %b", Boolean.valueOf(pin));
            rsfVar = rsf.a;
        } else if (i2 != 2) {
            ypfVar.g().ai(8129).w("Invalid Bluetooth pairing method: %d", this.p);
            d(yxi.ANDROID_AUTO_BLUETOOTH_PAIRING_AUTHENTICATION_INVALID_PAIRING_METHOD);
            rsfVar = rsf.b;
        } else {
            String str = String.format(Locale.US, "%06d", Integer.valueOf(this.q));
            if (!str.equals(this.r) || rlc.a(v)) {
                ypfVar.g().ai(8134).M("Bluetooth pairing authentication data mismatch. Pairing passkey from intent=%s, auth data from client=%s", str, this.r);
                d(yxi.ANDROID_AUTO_BLUETOOTH_PAIRING_AUTHENTICATION_AUTH_DATA_MISMATCH);
                rgl rglVar2 = this.f;
                rglVar2.getClass();
                rglVar2.d(false);
                rsfVar = rsf.d;
            } else {
                rgl rglVar3 = this.f;
                rglVar3.getClass();
                pin = rglVar3.d(true);
                ypfVar.l().ai(8135).y("setPairingConfirmation returned %b", Boolean.valueOf(pin));
                rsfVar = rsf.a;
            }
        }
        if (pin) {
            ypfVar.f().ai(8132).u("Authentication success");
            d(yxi.ANDROID_AUTO_BLUETOOTH_PAIRING_AUTHENTICATION_SUCCESS);
        } else {
            ypfVar.g().ai(8130).u("Authentication failed");
            d(yxi.ANDROID_AUTO_BLUETOOTH_PAIRING_AUTHENTICATION_FAILED);
        }
        c();
        if (!pin) {
            ypfVar.g().ai(8131).u("Unpairing due to authentication failure");
            if (Build.VERSION.SDK_INT >= 30) {
                b();
            } else {
                i(rhf.BLUETOOTH_UNPAIR_AUTHENTICATION_FAILED);
            }
        }
        wyd wydVar = this.t;
        ypf ypfVar2 = qrg.a;
        ypfVar2.l().ai(7687).y("onAuthenticationResult %s", rsfVar);
        qrg qrgVar = (qrg) wydVar.a;
        CarInfo carInfoL = qrgVar.p.l();
        if (carInfoL == null) {
            ypfVar2.l().ai(7689).u("not sending result: failed to get head unit protocol version");
            return;
        }
        int i4 = carInfoL.e;
        int i5 = carInfoL.f;
        if (i4 <= 0) {
            i3 = i4;
        } else if (i4 != 1 || i5 >= 5) {
            qrgVar.g.f(rsfVar);
            return;
        }
        ypfVar2.l().ai(7688).B("not sending result: unsupported on head unit protocol v%d.%d", i3, i5);
    }

    public final void b() {
        a.f().ai(8136).u("cancel pairing");
        rgl rglVar = this.f;
        rglVar.getClass();
        rglVar.e();
    }

    public final void c() {
        ypf ypfVar = a;
        ypfVar.l().ai(8149).u("invalidateAuthenticationData");
        if (this.n != 0) {
            ypfVar.g().ai(8150).u("invalidateAuthenticationData: This object wasn't initialized successfully");
            return;
        }
        this.p = Integer.MIN_VALUE;
        this.q = Integer.MIN_VALUE;
        this.r = null;
    }

    final void d(yxi yxiVar) {
        yxiVar.name();
        ols.M(this.c, yxiVar);
    }

    public final boolean e() {
        ypf ypfVar = a;
        ypfVar.l().ai(8151).u("isEnabled");
        if (this.n != 0) {
            ypfVar.l().ai(8152).u("isEnabled: This object wasn't initialized successfully.");
            return false;
        }
        rgk rgkVar = this.d;
        rgkVar.getClass();
        return rgkVar.a.isEnabled();
    }

    final boolean f(BluetoothDevice bluetoothDevice) {
        rgl rglVar = this.f;
        rglVar.getClass();
        return rglVar != null && rglVar.a.equals(bluetoothDevice);
    }

    public final boolean g() {
        ypf ypfVar = a;
        ypfVar.l().ai(8153).u("isPaired");
        if (this.n != 0) {
            ypfVar.l().ai(8154).u("isPaired: This object wasn't initialized successfully.");
            return false;
        }
        rgl rglVar = this.f;
        rglVar.getClass();
        return rglVar.a() == 12;
    }

    public final boolean h() {
        ypf ypfVar = a;
        ypfVar.l().ai(8155).u("isPairing");
        if (this.n != 0) {
            ypfVar.l().ai(8156).u("isPairing: This object wasn't initialized successfully.");
            return false;
        }
        rgl rglVar = this.f;
        rglVar.getClass();
        return rglVar.a() == 11;
    }

    public final void i(rhf rhfVar) {
        ypf ypfVar = a;
        ypfVar.l().ai(8166).u("unpair");
        qrg qrgVar = (qrg) this.t.a;
        qrgVar.o.e(rhfVar.h);
        if (rhfVar == rhf.BLUETOOTH_UNPAIR_HFP_CONNECTING_EXCEEDS_MAX_COUNT) {
            rxf.m(qrgVar.n, yxo.NO_HFP);
        }
        if (this.n != 0) {
            ypfVar.l().ai(8168).u("unpair: This object wasn't initialized successfully.");
            return;
        }
        rgl rglVar = this.f;
        rglVar.getClass();
        this.s = rglVar.c();
        rgl rglVar2 = this.f;
        rglVar2.getClass();
        int iA = rglVar2.a();
        ypfVar.l().ai(8167).w("bond state = %s", iA);
        if (iA == 11) {
            rgl rglVar3 = this.f;
            rglVar3.getClass();
            rglVar3.e();
        } else if (iA == 10) {
            return;
        }
        d(rhfVar.g);
        rgl rglVar4 = this.f;
        rglVar4.getClass();
        rglVar4.h();
    }
}
