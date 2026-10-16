package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajnb {
    public static final /* synthetic */ int a = 0;
    private static final java.util.concurrent.CopyOnWriteArraySet b = new java.util.concurrent.CopyOnWriteArraySet();
    private static final java.util.Map c;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Package r2 = defpackage.ajiz.class.getPackage();
        java.lang.String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(defpackage.ajiz.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(defpackage.ajlu.class.getName(), "okhttp.Http2");
        linkedHashMap.put(defpackage.ajjx.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        c = defpackage.afga.X(linkedHashMap);
    }

    public static final void a(java.lang.String str, int i, java.lang.String str2, java.lang.Throwable th) {
        int iMin;
        java.lang.String strZ = (java.lang.String) c.get(str);
        if (strZ == null) {
            strZ = defpackage.afzh.z(str, 23);
        }
        if (!android.util.Log.isLoggable(strZ, i)) {
            return;
        }
        if (th != null) {
            str2 = str2 + "\n" + android.util.Log.getStackTraceString(th);
        }
        int i2 = 0;
        while (true) {
            int length = str2.length();
            if (i2 >= length) {
                return;
            }
            int iD = defpackage.afzh.D(str2, '\n', i2);
            if (iD != -1) {
                length = iD;
            }
            while (true) {
                iMin = java.lang.Math.min(length, i2 + 4000);
                java.lang.String strSubstring = str2.substring(i2, iMin);
                strSubstring.getClass();
                android.util.Log.println(i, strZ, strSubstring);
                if (iMin >= length) {
                    break;
                } else {
                    i2 = iMin;
                }
            }
            i2 = iMin + 1;
        }
    }

    public static final void b() {
        try {
            for (java.util.Map.Entry entry : c.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.String str2 = (java.lang.String) entry.getValue();
                java.util.logging.Logger logger = java.util.logging.Logger.getLogger(str);
                if (b.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(android.util.Log.isLoggable(str2, 3) ? java.util.logging.Level.FINE : android.util.Log.isLoggable(str2, 4) ? java.util.logging.Level.INFO : java.util.logging.Level.WARNING);
                    logger.addHandler(defpackage.ajnc.a);
                }
            }
        } catch (java.lang.RuntimeException e) {
            java.lang.System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (java.lang.UnsatisfiedLinkError e2) {
            java.lang.System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
    }
}
