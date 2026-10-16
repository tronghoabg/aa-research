package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class sdu implements defpackage.sdt {
    private static final defpackage.yqk b = defpackage.omv.n("CAR.CarBTStore");
    public final android.content.SharedPreferences a;
    private final java.util.concurrent.atomic.AtomicBoolean c;
    private final android.content.Context d;

    public sdu(android.content.Context context, android.content.SharedPreferences sharedPreferences) {
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.a = sharedPreferences;
        this.d = context;
    }

    static java.lang.String e(java.lang.String str) {
        return java.lang.String.format("AndroidAutoBluetooth_%s", str);
    }

    @Override // defpackage.sdt
    public final java.util.EnumSet a(java.lang.String str) {
        f();
        java.util.EnumSet enumSetNoneOf = java.util.EnumSet.noneOf(defpackage.sds.class);
        if (android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str)) {
            android.content.SharedPreferences sharedPreferences = this.a;
            defpackage.ynd yndVar = defpackage.ynd.a;
            if (sharedPreferences.getStringSet("AndroidAutoBluetooth", yndVar).contains(str)) {
                enumSetNoneOf.add(defpackage.sds.a);
            }
            for (java.lang.String str2 : sharedPreferences.getStringSet(e(str), yndVar)) {
                try {
                    enumSetNoneOf.add(defpackage.sds.valueOf(str2));
                } catch (java.lang.IllegalArgumentException unused) {
                    b.l().ai(8795).y("Failed to parse ConnectvitiyCapability capability: %s", str2);
                }
            }
        }
        return enumSetNoneOf;
    }

    @Override // defpackage.sdt
    public final void b(java.lang.String str) {
        f();
        android.content.SharedPreferences sharedPreferences = this.a;
        java.util.HashSet hashSet = new java.util.HashSet(sharedPreferences.getStringSet("SDP_REQUESTED_MAC_ADDRESS_STORE", defpackage.ynd.a));
        hashSet.add(str);
        sharedPreferences.edit().putStringSet("SDP_REQUESTED_MAC_ADDRESS_STORE", hashSet).apply();
    }

    @Override // defpackage.sdt
    public final boolean c(java.lang.String str, defpackage.sds sdsVar) {
        f();
        if (!android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str)) {
            return false;
        }
        java.util.EnumSet enumSetA = a(str);
        if (enumSetA.contains(sdsVar)) {
            return false;
        }
        enumSetA.add(sdsVar);
        this.a.edit().putStringSet(e(str), defpackage.yhx.m(defpackage.ysr.am(enumSetA, new defpackage.ikt(17)))).apply();
        return true;
    }

    @Override // defpackage.sdt
    public final boolean d(java.lang.String str) {
        return !a(str).isEmpty();
    }

    public final void f() {
        if (defpackage.adct.c() || this.c.getAndSet(true)) {
            return;
        }
        b.h().q(defpackage.yqi.FULL).ai(8794).u("Using to CarBluetoothAddress store when it is disabled.");
        defpackage.omv.i(this.d, defpackage.yyn.DB_MIGRATION_WRONG_STORAGE_ACCESS);
    }

    public sdu(android.content.Context context) {
        this(context, context.getSharedPreferences("bluetooth_addresses_prefs", 0));
    }
}
