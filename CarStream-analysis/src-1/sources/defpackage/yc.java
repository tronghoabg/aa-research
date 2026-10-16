package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class yc {
    public static volatile boolean a = false;
    public static int b = Integer.MIN_VALUE;
    public static long c;
    public static final ArrayList d = new ArrayList();

    public static String a(Context context) {
        String strG = xc.g(context, "wazePkg", "com.waze");
        String strTrim = strG == null ? "" : strG.trim();
        return strTrim.isEmpty() ? "com.waze" : strTrim;
    }
}
