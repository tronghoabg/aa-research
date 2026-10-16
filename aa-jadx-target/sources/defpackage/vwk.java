package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vwk {
    public static final /* synthetic */ int f = 0;
    public final defpackage.afak a;
    public final android.content.Context b;
    public final defpackage.afak c;
    public final defpackage.afak d;
    public final defpackage.rkq e;

    static {
        defpackage.ysr.aQ(new defpackage.riu(10));
    }

    public vwk(defpackage.afak afakVar, android.content.Context context, defpackage.afak afakVar2, defpackage.afak afakVar3, defpackage.afak afakVar4, defpackage.rkq rkqVar) {
        this.e = rkqVar;
        this.a = new defpackage.vwh(afakVar3, defpackage.ysr.aQ(new defpackage.ryo(afakVar, 9)), afakVar, 0);
        this.b = context;
        this.c = afakVar2;
        this.d = afakVar4;
    }

    public static /* synthetic */ defpackage.xyn a() {
        try {
            try {
                try {
                    return defpackage.xyn.h(android.os.Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", java.lang.Integer.TYPE));
                } catch (java.lang.Error | java.lang.Exception e) {
                    e = e;
                    ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai((char) 9866)).u("MemoryInfo.getOtherPss(which) failure");
                    return defpackage.xxe.a;
                }
            } catch (java.lang.Error e2) {
                e = e2;
                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai((char) 9866)).u("MemoryInfo.getOtherPss(which) failure");
                return defpackage.xxe.a;
            }
        } catch (java.lang.NoSuchMethodException e3) {
            ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.e()).p(e3)).ai((char) 9865)).u("MemoryInfo.getOtherPss(which) not found");
            return defpackage.xxe.a;
        }
    }

    public static java.lang.Long b(java.lang.String str) {
        if (defpackage.ysr.bw(str)) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str.trim()));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    public static java.lang.Long c(java.util.regex.Pattern pattern, java.lang.String str) throws xzp {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.find()) {
                java.lang.String strGroup = matcher.group(1);
                defpackage.ysr.aP(strGroup, new java.lang.Object[0]);
                return java.lang.Long.valueOf(java.lang.Long.parseLong(strGroup));
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        return null;
    }

    public static final java.lang.String d(java.lang.String str, java.lang.String str2, boolean z) {
        java.lang.String str3;
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                java.io.File file = new java.io.File(java.lang.String.format("/proc/%s/%s", str, str2));
                java.nio.charset.Charset charsetDefaultCharset = java.nio.charset.Charset.defaultCharset();
                charsetDefaultCharset.getClass();
                str3 = new java.lang.String(defpackage.yva.a(file), charsetDefaultCharset);
            } catch (java.io.IOException e) {
                str3 = null;
                if (!z) {
                    ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai(9868)).y("Error reading proc %s", new defpackage.vqs(str2));
                } else if (!(e instanceof java.io.FileNotFoundException)) {
                    ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).l(1, java.util.concurrent.TimeUnit.MINUTES)).p(e)).ai(9869)).y("Error reading dmabuf proc %s", new defpackage.vqs(str2));
                }
            }
            return str3;
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
