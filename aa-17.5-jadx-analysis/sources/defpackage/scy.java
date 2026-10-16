package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes.dex */
public final class scy implements scx {
    private static final ypf b = ols.R("CAR.CarBTStore");
    public final SharedPreferences a;
    private final AtomicBoolean c;
    private final Context d;

    public scy(Context context, SharedPreferences sharedPreferences) {
        this.c = new AtomicBoolean(false);
        this.a = sharedPreferences;
        this.d = context;
    }

    static String e(String str) {
        return String.format("AndroidAutoBluetooth_%s", str);
    }

    @Override // defpackage.scx
    public final EnumSet a(String str) {
        f();
        EnumSet enumSetNoneOf = EnumSet.noneOf(scw.class);
        if (BluetoothAdapter.checkBluetoothAddress(str)) {
            SharedPreferences sharedPreferences = this.a;
            yly ylyVar = yly.a;
            if (sharedPreferences.getStringSet("AndroidAutoBluetooth", ylyVar).contains(str)) {
                enumSetNoneOf.add(scw.a);
            }
            for (String str2 : sharedPreferences.getStringSet(e(str), ylyVar)) {
                try {
                    enumSetNoneOf.add(scw.valueOf(str2));
                } catch (IllegalArgumentException unused) {
                    b.l().ai(8770).y("Failed to parse ConnectvitiyCapability capability: %s", str2);
                }
            }
        }
        return enumSetNoneOf;
    }

    @Override // defpackage.scx
    public final void b(String str) {
        f();
        SharedPreferences sharedPreferences = this.a;
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet("SDP_REQUESTED_MAC_ADDRESS_STORE", yly.a));
        hashSet.add(str);
        sharedPreferences.edit().putStringSet("SDP_REQUESTED_MAC_ADDRESS_STORE", hashSet).apply();
    }

    @Override // defpackage.scx
    public final boolean c(String str, scw scwVar) {
        f();
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            return false;
        }
        EnumSet enumSetA = a(str);
        if (enumSetA.contains(scwVar)) {
            return false;
        }
        enumSetA.add(scwVar);
        this.a.edit().putStringSet(e(str), ygr.m(yrm.am(enumSetA, new ikj(17)))).apply();
        return true;
    }

    @Override // defpackage.scx
    public final boolean d(String str) {
        return !a(str).isEmpty();
    }

    public final void f() {
        if (adbu.c() || this.c.getAndSet(true)) {
            return;
        }
        b.h().q(ypd.FULL).ai(8769).u("Using to CarBluetoothAddress store when it is disabled.");
        ols.M(this.d, yxi.DB_MIGRATION_WRONG_STORAGE_ACCESS);
    }

    public scy(Context context) {
        this(context, context.getSharedPreferences("bluetooth_addresses_prefs", 0));
    }
}
