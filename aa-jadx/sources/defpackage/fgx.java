package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fgx {
    public static java.lang.reflect.Method a = null;
    public static boolean b = false;
    private static boolean c = true;

    static void a(android.view.ViewGroup viewGroup, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            b(viewGroup, z);
        }
    }

    private static void b(android.view.ViewGroup viewGroup, boolean z) {
        if (c) {
            try {
                viewGroup.suppressLayout(z);
            } catch (java.lang.NoSuchMethodError unused) {
                c = false;
            }
        }
    }
}
