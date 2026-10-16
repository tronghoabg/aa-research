package s9;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import ka.B1;
import ka.C1;
import ka.C3257n0;
import ka.C3263p0;

/* loaded from: classes4.dex */
public final class l implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public C1 f45386a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f45387b;

    public l(C1 c12) {
        this.f45387b = new HashMap();
        A6.c.z(c12.v() == 11, "ObjectValues should be backed by a MapValue", new Object[0]);
        A6.c.z(!n.c(c12), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f45386a = c12;
    }

    public static t9.f c(C3263p0 c3263p0) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : c3263p0.getFieldsMap().entrySet()) {
            j jVar = new j(Collections.singletonList((String) entry.getKey()));
            C1 c12 = (C1) entry.getValue();
            C1 c13 = p.f45391a;
            if (c12 == null || c12.v() != 11) {
                hashSet.add(jVar);
            } else {
                HashSet hashSet2 = c(((C1) entry.getValue()).s()).f45948a;
                if (hashSet2.isEmpty()) {
                    hashSet.add(jVar);
                } else {
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        hashSet.add((j) jVar.b((j) it.next()));
                    }
                }
            }
        }
        return new t9.f(hashSet);
    }

    public static C1 d(C1 c12, j jVar) {
        if (jVar.h()) {
            return c12;
        }
        for (int i5 = 0; i5 < jVar.f45369a.size() - 1; i5++) {
            c12 = c12.s().d(jVar.g(i5));
            C1 c13 = p.f45391a;
            if (c12 == null || c12.v() != 11) {
                return null;
            }
        }
        return c12.s().d(jVar.f());
    }

    public static l e(Map map) {
        B1 b1W = C1.w();
        C3257n0 c3257n0F = C3263p0.f();
        c3257n0F.a(map);
        b1W.j(c3257n0F);
        return new l((C1) b1W.build());
    }

    public final C3263p0 a(j jVar, Map map) {
        C1 c1D = d(this.f45386a, jVar);
        C1 c12 = p.f45391a;
        C3257n0 c3257n0F = (c1D == null || c1D.v() != 11) ? C3263p0.f() : (C3257n0) c1D.s().toBuilder();
        boolean z2 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                C3263p0 c3263p0A = a((j) jVar.a(str), (Map) value);
                if (c3263p0A != null) {
                    B1 b1W = C1.w();
                    b1W.k(c3263p0A);
                    c3257n0F.b(str, (C1) b1W.build());
                    z2 = true;
                }
            } else {
                if (value instanceof C1) {
                    c3257n0F.b(str, (C1) value);
                } else if (c3257n0F.containsFields(str)) {
                    A6.c.z(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                    c3257n0F.c(str);
                }
                z2 = true;
            }
        }
        if (z2) {
            return (C3263p0) c3257n0F.build();
        }
        return null;
    }

    public final C1 b() {
        synchronized (this.f45387b) {
            try {
                C3263p0 c3263p0A = a(j.f45379c, this.f45387b);
                if (c3263p0A != null) {
                    B1 b1W = C1.w();
                    b1W.k(c3263p0A);
                    this.f45386a = (C1) b1W.build();
                    this.f45387b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f45386a;
    }

    public final Object clone() {
        return new l(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return p.e(b(), ((l) obj).b());
        }
        return false;
    }

    public final C1 f(j jVar) {
        return d(b(), jVar);
    }

    public final void g(C1 c12, j jVar) {
        A6.c.z(!jVar.h(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        j(c12, jVar);
    }

    public final void h(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            j jVar = (j) entry.getKey();
            if (entry.getValue() == null) {
                A6.c.z(!jVar.h(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
                j(null, jVar);
            } else {
                g((C1) entry.getValue(), jVar);
            }
        }
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final void j(C1 c12, j jVar) {
        Map map;
        Map map2 = this.f45387b;
        for (int i5 = 0; i5 < jVar.f45369a.size() - 1; i5++) {
            String strG = jVar.g(i5);
            Object obj = map2.get(strG);
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                if (obj instanceof C1) {
                    C1 c13 = (C1) obj;
                    if (c13.v() == 11) {
                        HashMap map3 = new HashMap(c13.s().getFieldsMap());
                        map2.put(strG, map3);
                        map2 = map3;
                    }
                }
                map = new HashMap();
                map2.put(strG, map);
            }
            map2 = map;
        }
        map2.put(jVar.f(), c12);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ObjectValue{internalValue=");
        C1 c1B = b();
        C1 c12 = p.f45391a;
        StringBuilder sb3 = new StringBuilder();
        p.a(sb3, c1B);
        sb2.append(sb3.toString());
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l() {
        B1 b1W = C1.w();
        b1W.k(C3263p0.c());
        this((C1) b1W.build());
    }
}
