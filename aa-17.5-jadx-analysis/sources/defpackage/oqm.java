package defpackage;

import android.bluetooth.BluetoothAdapter;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class oqm extends oqf {
    private static final yph c = yph.c("GH.Bt");

    public static boolean b(BluetoothAdapter bluetoothAdapter, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            bluetoothAdapter.getClass().getMethod("setScanMode", Integer.TYPE, Long.TYPE).invoke(bluetoothAdapter, Integer.valueOf(i), 120000L);
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            ((ype) ((ype) c.h()).ai((char) 6076)).u("Unable to start pairing via reflection with manual timeout, method/signature pairing not found. Attempting without manual timeout.");
            try {
                bluetoothAdapter.getClass().getMethod("setScanMode", Integer.TYPE).invoke(bluetoothAdapter, Integer.valueOf(i));
                return true;
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused2) {
                ((ype) ((ype) c.h()).ai((char) 6077)).u("Unable to start pairing via reflection without manual timeout, method/signature pairing not found.");
                return false;
            }
        }
    }
}
