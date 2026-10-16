package defpackage;

import android.os.SystemProperties;

/* loaded from: classes.dex */
public final class rlc {
    public static boolean a = false;
    public static final vqk b = new vqk("debug.car.svc.dev_only_log");
    public static final vqk c = new vqk("debug.car.svc.enable_systrace");

    public static boolean a(vqk vqkVar) {
        if (a) {
            return "true".equals(SystemProperties.get((String) vqkVar.a, "false"));
        }
        return false;
    }
}
