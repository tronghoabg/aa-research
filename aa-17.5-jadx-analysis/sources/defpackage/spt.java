package defpackage;

import android.app.Application;

/* loaded from: classes.dex */
public final class spt {
    public static Boolean a;
    private static String b;

    public static String a() {
        String str = b;
        if (str != null) {
            return str;
        }
        String processName = Application.getProcessName();
        b = processName;
        return processName;
    }
}
