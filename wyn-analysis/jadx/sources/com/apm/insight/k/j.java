package com.apm.insight.k;

import android.util.Log;
import com.apm.insight.runtime.m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static File f20497a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f20498b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f20499c = false;

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, String> f20500d;

    public static boolean a() {
        return f20498b;
    }

    public static boolean b() {
        return f20499c;
    }

    public static void c() {
        if (f20498b) {
            return;
        }
        f20499c = true;
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.f.a(file, "\n")), false);
                f20498b = true;
            } catch (Throwable unused) {
                com.apm.insight.runtime.a.a((JSONArray) null, false);
            }
        }
    }

    public static void d() {
        c();
        if (g()) {
            a.a();
        }
    }

    public static void e() {
        m.a().a(new Runnable() { // from class: com.apm.insight.k.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (j.g()) {
                    a.a();
                }
            }
        });
    }

    public static void f() {
        Map<String, String> map = f20500d;
        if (map != null) {
            map.clear();
        }
    }

    public static boolean g() {
        File fileH = h();
        try {
            Map<String, String> mapC = f20500d;
            if (mapC == null) {
                mapC = com.apm.insight.l.f.c(fileH);
            }
            f20500d = mapC;
            if (mapC == null) {
                f20500d = new HashMap();
                return true;
            }
            if (mapC.size() < com.apm.insight.entity.b.c()) {
                return true;
            }
            Iterator<String> it = com.apm.insight.entity.b.d().iterator();
            while (it.hasNext()) {
                if (!f20500d.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z2 = false;
            for (Map.Entry<String, String> entry : f20500d.entrySet()) {
                try {
                    if (jCurrentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.d.d(entry.getKey())) {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    com.apm.insight.a.a(th);
                }
            }
            if (z2) {
                com.apm.insight.a.a((Object) "config should be updated");
            } else {
                com.apm.insight.a.a((Object) "config should not be updated");
            }
            return z2;
        } catch (Throwable th2) {
            Log.e("npth", "err", th2);
            return true;
        }
    }

    private static File h() {
        if (f20497a == null) {
            f20497a = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configInvalid");
        }
        return f20497a;
    }

    public static void a(JSONArray jSONArray) {
        try {
            com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile"), jSONArray);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.f.a(h(), f20500d);
        } catch (Throwable unused2) {
        }
    }

    public static void a(String str) {
        if (f20500d == null) {
            f20500d = new HashMap();
        }
        f20500d.put(str, String.valueOf(System.currentTimeMillis()));
    }
}
