package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adkx {
    public static final boolean a = a("GRPC_ENABLE_RFC3986_URIS", true);

    public static boolean a(java.lang.String str, boolean z) {
        java.lang.String strTrim = java.lang.System.getenv(str);
        if (strTrim == null) {
            strTrim = java.lang.System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        if (z) {
            return defpackage.ysr.bw(strTrim) || java.lang.Boolean.parseBoolean(strTrim);
        }
        return !defpackage.ysr.bw(strTrim) && java.lang.Boolean.parseBoolean(strTrim);
    }
}
