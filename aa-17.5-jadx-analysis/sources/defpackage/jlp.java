package defpackage;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class jlp {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("^([0-9A-Fa-f]{2}[:]){5}([0-9A-Fa-f]{2})$");

    public static String a(String str) {
        if (!str.startsWith("\"")) {
            str = "\"".concat(str);
        }
        return !str.endsWith("\"") ? str.concat("\"") : str;
    }

    public static boolean b(Iterable iterable, BluetoothDevice bluetoothDevice) {
        String strAl = woy.al(bluetoothDevice.getName());
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (strAl.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        return roc.k(str).equals(roc.k(str2));
    }

    public static boolean d(String str) {
        return b.matcher(str).matches();
    }

    public static boolean e(String str) {
        return !TextUtils.isEmpty(str) && str.contains(".") && zcv.c(str);
    }
}
