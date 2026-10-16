package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class ajmb {
    public static final /* synthetic */ int a = 0;
    private static final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    private static final Map c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = ajia.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(ajia.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(ajku.class.getName(), "okhttp.Http2");
        linkedHashMap.put(ajix.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        c = woy.bd(linkedHashMap);
    }

    public static final void a(String str, int i, String str2, Throwable th) {
        int iMin;
        String strZ = (String) c.get(str);
        if (strZ == null) {
            strZ = afyh.z(str, 23);
        }
        if (!Log.isLoggable(strZ, i)) {
            return;
        }
        if (th != null) {
            str2 = str2 + "\n" + Log.getStackTraceString(th);
        }
        int i2 = 0;
        while (true) {
            int length = str2.length();
            if (i2 >= length) {
                return;
            }
            int iD = afyh.D(str2, '\n', i2);
            if (iD != -1) {
                length = iD;
            }
            while (true) {
                iMin = Math.min(length, i2 + 4000);
                String strSubstring = str2.substring(i2, iMin);
                strSubstring.getClass();
                Log.println(i, strZ, strSubstring);
                if (iMin >= length) {
                    break;
                } else {
                    i2 = iMin;
                }
            }
            i2 = iMin + 1;
        }
    }

    public static final void b() throws SecurityException {
        try {
            for (Map.Entry entry : c.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (b.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(ajmc.a);
                }
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
    }
}
