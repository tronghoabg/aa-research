package okhttp3.internal.g.a;

import android.util.Log;
import h.a.r;
import h.g.b.x;
import h.n.o;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.ai;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56255a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final CopyOnWriteArraySet f56256b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f56257c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = ai.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        linkedHashMap2.put(ai.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap2.put(okhttp3.internal.f.g.class.getName(), "okhttp.Http2");
        linkedHashMap2.put(okhttp3.internal.b.e.class.getName(), "okhttp.TaskRunner");
        linkedHashMap2.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f56257c = r.r(linkedHashMap2);
    }

    public static final void a() {
        for (Map.Entry entry : f56257c.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Logger logger = Logger.getLogger(str);
            if (f56256b.add(logger)) {
                logger.setUseParentHandlers(false);
                logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                logger.addHandler(d.f56258a);
            }
        }
    }

    public static final void b(String str, int i2, String str2, Throwable th) {
        int iMin;
        x.f(str, "loggerName");
        x.f(str2, "message");
        String strN = (String) f56257c.get(str);
        if (strN == null) {
            strN = o.N(str, 23);
        }
        if (Log.isLoggable(strN, i2)) {
            if (th != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i3 = 0;
            while (i3 < length) {
                int iW = o.W(str2, '\n', i3, 4);
                if (iW == -1) {
                    iW = length;
                }
                while (true) {
                    iMin = Math.min(iW, i3 + 4000);
                    String strSubstring = str2.substring(i3, iMin);
                    x.e(strSubstring, "substring(...)");
                    Log.println(i2, strN, strSubstring);
                    if (iMin >= iW) {
                        break;
                    } else {
                        i3 = iMin;
                    }
                }
                i3 = iMin + 1;
            }
        }
    }
}
