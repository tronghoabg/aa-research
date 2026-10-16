package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class org extends defpackage.oqz {
    private static final defpackage.yqm c = defpackage.yqm.c("GH.Bt");

    public static boolean b(android.bluetooth.BluetoothAdapter bluetoothAdapter, int i) {
        try {
            bluetoothAdapter.getClass().getMethod("setScanMode", java.lang.Integer.TYPE, java.lang.Long.TYPE).invoke(bluetoothAdapter, java.lang.Integer.valueOf(i), 120000L);
            return true;
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.reflect.InvocationTargetException unused) {
            ((defpackage.yqj) ((defpackage.yqj) c.h()).ai((char) 6102)).u("Unable to start pairing via reflection with manual timeout, method/signature pairing not found. Attempting without manual timeout.");
            try {
                bluetoothAdapter.getClass().getMethod("setScanMode", java.lang.Integer.TYPE).invoke(bluetoothAdapter, java.lang.Integer.valueOf(i));
                return true;
            } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.reflect.InvocationTargetException unused2) {
                ((defpackage.yqj) ((defpackage.yqj) c.h()).ai((char) 6103)).u("Unable to start pairing via reflection without manual timeout, method/signature pairing not found.");
                return false;
            }
        }
    }
}
