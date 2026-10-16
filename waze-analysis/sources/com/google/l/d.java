package com.google.l;

import com.google.l.b.ac;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    final List f12414a;

    /* renamed from: b, reason: collision with root package name */
    final Map f12415b;

    /* renamed from: c, reason: collision with root package name */
    final b f12416c;

    /* renamed from: d, reason: collision with root package name */
    final List f12417d;

    /* renamed from: e, reason: collision with root package name */
    private final ThreadLocal f12418e;

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentMap f12419f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.l.b.e f12420g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.l.b.a.i f12421h;

    static {
        try {
            Class.forName("com.google.v.fi");
        } catch (ClassNotFoundException unused) {
        }
    }

    d(e eVar) {
        this.f12418e = new ThreadLocal();
        this.f12419f = new ConcurrentHashMap();
        com.google.l.b.g gVar = eVar.f12450e;
        int i2 = eVar.v;
        HashMap map = new HashMap(eVar.f12451f);
        this.f12415b = map;
        boolean z = eVar.f12454i;
        boolean z2 = eVar.m;
        boolean z3 = eVar.q;
        boolean z4 = eVar.o;
        this.f12416c = eVar.p;
        s sVar = eVar.r;
        boolean z5 = eVar.n;
        boolean z6 = eVar.s;
        int i3 = eVar.u;
        String str = eVar.f12455j;
        int i4 = eVar.f12456k;
        int i5 = eVar.f12457l;
        e.c(eVar.f12452g);
        e.c(eVar.f12453h);
        int i6 = eVar.w;
        int i7 = eVar.x;
        List listC = e.c(eVar.t);
        this.f12417d = listC;
        if (eVar == e.f12448c) {
            this.f12420g = e.f12446a;
            this.f12421h = e.f12447b;
            this.f12414a = e.f12449d;
        } else {
            com.google.l.b.e eVar2 = new com.google.l.b.e(map, listC);
            this.f12420g = eVar2;
            com.google.l.b.a.i iVar = new com.google.l.b.a.i(eVar2);
            this.f12421h = iVar;
            this.f12414a = eVar.b(eVar2, iVar);
        }
    }

    public static final void j(i iVar, com.google.l.d.c cVar) {
        s sVarN = cVar.n();
        boolean zT = cVar.t();
        boolean zS = cVar.s();
        cVar.p(true);
        cVar.q(false);
        if (cVar.n() == s.f12463b) {
            cVar.r(s.f12462a);
        }
        try {
            try {
                ac.d(iVar, cVar);
            } catch (IOException e2) {
                throw new j(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e3.getMessage(), e3);
            }
        } finally {
            cVar.r(sVarN);
            cVar.p(zT);
            cVar.q(zS);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r4.c(r6);
        r1.put(r9, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.l.u a(com.google.l.c.a r9) {
        /*
            r8 = this;
            java.lang.String r0 = "type must not be null"
            j$.util.Objects.requireNonNull(r9, r0)
            java.util.concurrent.ConcurrentMap r0 = r8.f12419f
            java.lang.Object r0 = r0.get(r9)
            com.google.l.u r0 = (com.google.l.u) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.ThreadLocal r0 = r8.f12418e
            java.lang.Object r1 = r0.get()
            java.util.Map r1 = (java.util.Map) r1
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L27
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.set(r1)
            r0 = r3
            goto L30
        L27:
            java.lang.Object r0 = r1.get(r9)
            com.google.l.u r0 = (com.google.l.u) r0
            if (r0 != 0) goto L87
            r0 = r2
        L30:
            com.google.l.c r4 = new com.google.l.c     // Catch: java.lang.Throwable -> L7d
            r4.<init>()     // Catch: java.lang.Throwable -> L7d
            r1.put(r9, r4)     // Catch: java.lang.Throwable -> L7d
            java.util.List r5 = r8.f12414a     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L7d
            r6 = 0
        L3f:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L57
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L7d
            com.google.l.v r6 = (com.google.l.v) r6     // Catch: java.lang.Throwable -> L7d
            com.google.l.u r6 = r6.a(r8, r9)     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L3f
            r4.c(r6)     // Catch: java.lang.Throwable -> L7d
            r1.put(r9, r6)     // Catch: java.lang.Throwable -> L7d
        L57:
            if (r0 == 0) goto L5f
            java.lang.ThreadLocal r0 = r8.f12418e
            r0.remove()
            r2 = r3
        L5f:
            if (r6 == 0) goto L69
            if (r2 == 0) goto L68
            java.util.concurrent.ConcurrentMap r8 = r8.f12419f
            r8.putAll(r1)
        L68:
            return r6
        L69:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "GSON (2.14.0) cannot handle "
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9)
            throw r8
        L7d:
            r9 = move-exception
            if (r0 != 0) goto L81
            goto L86
        L81:
            java.lang.ThreadLocal r8 = r8.f12418e
            r8.remove()
        L86:
            throw r9
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.l.d.a(com.google.l.c.a):com.google.l.u");
    }

    public final u b(Class cls) {
        return a(com.google.l.c.a.a(cls));
    }

    public final u c(v vVar, com.google.l.c.a aVar) {
        Objects.requireNonNull(vVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        com.google.l.b.a.i iVar = this.f12421h;
        if (true == iVar.c(aVar, vVar)) {
            vVar = iVar;
        }
        boolean z = false;
        for (v vVar2 : this.f12414a) {
            if (z) {
                u uVarA = vVar2.a(this, aVar);
                if (uVarA != null) {
                    return uVarA;
                }
            } else if (vVar2 == vVar) {
                z = true;
            }
        }
        if (z) {
            throw new IllegalArgumentException("GSON cannot serialize or deserialize ".concat(String.valueOf(String.valueOf(aVar))));
        }
        return a(aVar);
    }

    public final com.google.l.d.c d(Writer writer) {
        com.google.l.d.c cVar = new com.google.l.d.c(writer);
        cVar.o(this.f12416c);
        cVar.p(true);
        cVar.r(s.f12463b);
        cVar.q(false);
        return cVar;
    }

    public final Object e(com.google.l.d.b bVar, com.google.l.c.a aVar) {
        boolean z;
        Object objB;
        s sVarT = bVar.t();
        if (bVar.t() == s.f12463b) {
            bVar.v(s.f12462a);
        }
        try {
            try {
                try {
                    try {
                        bVar.r();
                        z = false;
                    } catch (EOFException e2) {
                        e = e2;
                        z = true;
                    }
                    try {
                        u uVarA = a(aVar);
                        objB = uVarA.b(bVar);
                        Class clsC = aVar.c();
                        if (clsC == Integer.TYPE) {
                            clsC = Integer.class;
                        } else if (clsC == Float.TYPE) {
                            clsC = Float.class;
                        } else if (clsC == Byte.TYPE) {
                            clsC = Byte.class;
                        } else if (clsC == Double.TYPE) {
                            clsC = Double.class;
                        } else if (clsC == Long.TYPE) {
                            clsC = Long.class;
                        } else if (clsC == Character.TYPE) {
                            clsC = Character.class;
                        } else if (clsC == Boolean.TYPE) {
                            clsC = Boolean.class;
                        } else if (clsC == Short.TYPE) {
                            clsC = Short.class;
                        } else if (clsC == Void.TYPE) {
                            clsC = Void.class;
                        }
                        if (objB != null && !clsC.isInstance(objB)) {
                            throw new ClassCastException("Type adapter '" + uVarA.toString() + "' returned wrong type; requested " + String.valueOf(aVar.c()) + " but got instance of " + String.valueOf(objB.getClass()) + "\nVerify that the adapter was registered for the correct type.");
                        }
                    } catch (EOFException e3) {
                        e = e3;
                        if (!z) {
                            throw new q(e);
                        }
                        objB = null;
                        return objB;
                    }
                    return objB;
                } catch (IllegalStateException e4) {
                    throw new q(e4);
                }
            } catch (IOException e5) {
                throw new q(e5);
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e6.getMessage(), e6);
            }
        } finally {
            bVar.v(sVarT);
        }
    }

    public final Object f(String str, Class cls) {
        com.google.l.c.a aVarA = com.google.l.c.a.a(cls);
        if (str == null) {
            return null;
        }
        com.google.l.d.b bVar = new com.google.l.d.b(new StringReader(str));
        bVar.v(s.f12463b);
        Object objE = e(bVar, aVarA);
        if (objE != null) {
            try {
                if (bVar.r() != 10) {
                    throw new q("JSON document was not fully consumed.");
                }
            } catch (com.google.l.d.d e2) {
                throw new q(e2);
            } catch (IOException e3) {
                throw new j(e3);
            }
        }
        return objE;
    }

    public final String g(i iVar) {
        StringBuilder sb = new StringBuilder();
        try {
            j(iVar, d(ac.c(sb)));
            return sb.toString();
        } catch (IOException e2) {
            throw new j(e2);
        }
    }

    public final String h(Object obj) {
        if (obj == null) {
            return g(k.f12459a);
        }
        StringBuilder sb = new StringBuilder();
        try {
            i(obj, obj.getClass(), d(ac.c(sb)));
            return sb.toString();
        } catch (IOException e2) {
            throw new j(e2);
        }
    }

    public final void i(Object obj, Type type, com.google.l.d.c cVar) {
        u uVarA = a(com.google.l.c.a.b(type));
        s sVarN = cVar.n();
        if (cVar.n() == s.f12463b) {
            cVar.r(s.f12462a);
        }
        boolean zT = cVar.t();
        boolean zS = cVar.s();
        cVar.p(true);
        cVar.q(false);
        try {
            try {
                uVarA.d(cVar, obj);
            } catch (IOException e2) {
                throw new j(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e3.getMessage(), e3);
            }
        } finally {
            cVar.r(sVarN);
            cVar.p(zT);
            cVar.q(zS);
        }
    }

    public final String toString() {
        com.google.l.b.e eVar = this.f12420g;
        return "{serializeNulls:false,factories:" + String.valueOf(this.f12414a) + ",instanceCreators:" + String.valueOf(eVar) + "}";
    }

    public d() {
        this(e.f12448c);
    }
}
