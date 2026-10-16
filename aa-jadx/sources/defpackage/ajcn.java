package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajcn {
    public static final boolean a;

    static {
        boolean z;
        java.lang.String property = java.lang.System.getProperty("kotlinx.coroutines.google.stacktrace.recovery");
        if (property != null) {
            z = java.lang.Boolean.parseBoolean(property);
        } else {
            z = java.lang.System.getenv("TEST_SRCDIR") != null;
        }
        a = z;
    }
}
