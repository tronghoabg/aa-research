package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eio {
    public static final java.lang.Class a = b("libcore.io.Memory");
    private static final boolean b;

    static {
        b = b("org.robolectric.Robolectric") != null;
    }

    static boolean a() {
        return (a == null || b) ? false : true;
    }

    private static java.lang.Class b(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
