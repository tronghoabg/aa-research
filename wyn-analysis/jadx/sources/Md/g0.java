package md;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f40642d = Logger.getLogger(g0.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static g0 f40643e;

    /* renamed from: a, reason: collision with root package name */
    public String f40644a = "unknown";

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f40645b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public l8.j0 f40646c = l8.j0.f40119g;

    public final synchronized void a(f0 f0Var) {
        f0Var.getClass();
        this.f40645b.add(f0Var);
    }

    public final f0 b(String str) {
        l8.j0 j0Var;
        if (str == null) {
            return null;
        }
        synchronized (this) {
            j0Var = this.f40646c;
        }
        return (f0) j0Var.get(str.toLowerCase(Locale.US));
    }

    public final synchronized void c() {
        try {
            HashMap map = new HashMap();
            String str = "unknown";
            Iterator it = this.f40645b.iterator();
            char c10 = 0;
            while (it.hasNext()) {
                f0 f0Var = (f0) it.next();
                f0Var.getClass();
                if (((f0) map.get("dns")) == null) {
                    map.put("dns", f0Var);
                }
                if (c10 < 5) {
                    str = "dns";
                    c10 = 5;
                }
            }
            this.f40646c = l8.j0.a(map);
            this.f40644a = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
