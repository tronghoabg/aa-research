package defpackage;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class fgr {
    public static Method a = null;
    public static boolean b = false;
    private static boolean c = true;

    static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            b(viewGroup, z);
        }
    }

    private static void b(ViewGroup viewGroup, boolean z) {
        if (c) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
    }
}
