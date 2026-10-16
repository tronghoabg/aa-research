package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sqr {
    public static java.lang.Boolean a;
    private static java.lang.String b;

    public static java.lang.String a() {
        java.lang.String str = b;
        if (str != null) {
            return str;
        }
        java.lang.String processName = android.app.Application.getProcessName();
        b = processName;
        return processName;
    }
}
