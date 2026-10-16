package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ifu {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public ifu(long j) {
        this.b = j;
    }

    protected int a(Object obj) {
        return 1;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized Object f(Object obj) {
        acjs acjsVar = (acjs) this.a.get(obj);
        if (acjsVar == null) {
            return null;
        }
        return acjsVar.b;
    }

    public final synchronized Object g(Object obj, Object obj2) {
        int iA = a(obj2);
        long j = iA;
        long j2 = this.b;
        if (j >= j2) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        acjs acjsVar = (acjs) this.a.put(obj, obj2 == null ? null : new acjs(obj2, iA));
        if (acjsVar != null) {
            this.c -= acjsVar.a;
            Object obj3 = acjsVar.b;
            if (!obj3.equals(obj2)) {
                c(obj, obj3);
            }
        }
        i(j2);
        if (acjsVar != null) {
            return acjsVar.b;
        }
        return null;
    }

    public final synchronized Object h(Object obj) {
        acjs acjsVar = (acjs) this.a.remove(obj);
        if (acjsVar == null) {
            return null;
        }
        this.c -= acjsVar.a;
        return acjsVar.b;
    }

    public final synchronized void i(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            acjs acjsVar = (acjs) entry.getValue();
            this.c -= acjsVar.a;
            Object key = entry.getKey();
            it.remove();
            c(key, acjsVar.b);
        }
    }

    protected void c(Object obj, Object obj2) {
    }
}
