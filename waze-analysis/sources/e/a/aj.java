package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f46260a = a("GRPC_ENABLE_RFC3986_URIS", true);

    static boolean a(String str, boolean z) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        return z ? com.google.d.b.an.f(strTrim) || Boolean.parseBoolean(strTrim) : !com.google.d.b.an.f(strTrim) && Boolean.parseBoolean(strTrim);
    }

    static boolean b() {
        return f46260a;
    }
}
