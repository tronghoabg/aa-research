package defpackage;

/* loaded from: classes.dex */
public final class adjw {
    public static final boolean a = a("GRPC_ENABLE_RFC3986_URIS", true);

    public static boolean a(String str, boolean z) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        return z ? woy.am(strTrim) || Boolean.parseBoolean(strTrim) : !woy.am(strTrim) && Boolean.parseBoolean(strTrim);
    }
}
