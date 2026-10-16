package la;

import ba.C1521a;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.C1755a;
import com.google.gson.internal.bind.C1758d;
import com.google.gson.internal.bind.C1760f;
import com.google.gson.internal.bind.C1766l;
import com.google.gson.internal.bind.C1767m;
import com.google.gson.internal.bind.C1768n;
import com.google.gson.internal.bind.C1776w;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.Y;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import qa.C3883a;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public final class l {
    public static final i k = i.f40186d;

    /* renamed from: l, reason: collision with root package name */
    public static final C3450a f40193l = h.f40184a;

    /* renamed from: m, reason: collision with root package name */
    public static final t f40194m = x.f40210a;

    /* renamed from: n, reason: collision with root package name */
    public static final u f40195n = x.f40211b;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f40196a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f40197b;

    /* renamed from: c, reason: collision with root package name */
    public final C1521a f40198c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f40199d;

    /* renamed from: e, reason: collision with root package name */
    public final List f40200e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f40201f;

    /* renamed from: g, reason: collision with root package name */
    public final i f40202g;

    /* renamed from: h, reason: collision with root package name */
    public final List f40203h;

    /* renamed from: i, reason: collision with root package name */
    public final List f40204i;

    /* renamed from: j, reason: collision with root package name */
    public final List f40205j;

    /* JADX WARN: Illegal instructions before constructor call */
    public l() {
        Excluder excluder = Excluder.f27385c;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        u uVar = f40195n;
        this(excluder, f40193l, map, k, list, list, list, f40194m, uVar, list);
    }

    public static void a(double d3) {
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            throw new IllegalArgumentException(d3 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Finally extract failed */
    public final Object b(String str, Type type) {
        C3883a c3883a = new C3883a(type);
        Object objB = null;
        if (str == null) {
            return null;
        }
        C3962a c3962a = new C3962a(new StringReader(str));
        c3962a.f44697o = 2;
        boolean z2 = true;
        c3962a.f44697o = 1;
        try {
            try {
                try {
                    c3962a.e0();
                    z2 = false;
                    objB = c(c3883a).b(c3962a);
                } catch (Throwable th) {
                    c3962a.f44697o = 2;
                    throw th;
                }
            } catch (EOFException e7) {
                if (!z2) {
                    throw new p(e7, 13);
                }
            } catch (IllegalStateException e10) {
                throw new p(e10, 13);
            }
            c3962a.f44697o = 2;
            if (objB != null) {
                try {
                    if (c3962a.e0() != 10) {
                        throw new p("JSON document was not fully consumed.", 13);
                    }
                } catch (ra.c e11) {
                    throw new p(e11, 13);
                } catch (IOException e12) {
                    throw new p(e12, 13);
                }
            }
            return objB;
        } catch (IOException e13) {
            throw new p(e13, 13);
        } catch (AssertionError e14) {
            throw new AssertionError("AssertionError (GSON 2.12.0): " + e14.getMessage(), e14);
        }
    }

    public final z c(C3883a c3883a) {
        boolean z2;
        Objects.requireNonNull(c3883a, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f40197b;
        z zVar = (z) concurrentHashMap.get(c3883a);
        if (zVar != null) {
            return zVar;
        }
        ThreadLocal threadLocal = this.f40196a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z2 = true;
        } else {
            z zVar2 = (z) map.get(c3883a);
            if (zVar2 != null) {
                return zVar2;
            }
            z2 = false;
        }
        try {
            k kVar = new k();
            map.put(c3883a, kVar);
            Iterator it = this.f40200e.iterator();
            z zVarCreate = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zVarCreate = ((InterfaceC3449A) it.next()).create(this, c3883a);
                if (zVarCreate != null) {
                    if (kVar.f40192a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    kVar.f40192a = zVarCreate;
                    map.put(c3883a, zVarCreate);
                }
            }
            if (z2) {
                threadLocal.remove();
            }
            if (zVarCreate != null) {
                if (z2) {
                    concurrentHashMap.putAll(map);
                }
                return zVarCreate;
            }
            throw new IllegalArgumentException("GSON (2.12.0) cannot handle " + c3883a);
        } catch (Throwable th) {
            if (z2) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final la.z d(la.InterfaceC3449A r7, qa.C3883a r8) {
        /*
            r6 = this;
            java.lang.String r0 = "skipPast must not be null"
            j$.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "type must not be null"
            j$.util.Objects.requireNonNull(r8, r0)
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r0 = r6.f40199d
            r0.getClass()
            la.A r1 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.f27389c
            if (r7 != r1) goto L14
            goto L57
        L14:
            j$.util.concurrent.ConcurrentHashMap r1 = r0.f27392b
            java.lang.Class r2 = r8.f44183a
            java.lang.Object r3 = r1.get(r2)
            la.A r3 = (la.InterfaceC3449A) r3
            if (r3 == 0) goto L23
            if (r3 != r7) goto L58
            goto L57
        L23:
            java.lang.Class<ma.a> r3 = ma.InterfaceC3527a.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            ma.a r3 = (ma.InterfaceC3527a) r3
            if (r3 != 0) goto L2e
            goto L58
        L2e:
            java.lang.Class r3 = r3.value()
            java.lang.Class<la.A> r4 = la.InterfaceC3449A.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 != 0) goto L3b
            goto L58
        L3b:
            ba.a r4 = r0.f27391a
            qa.a r5 = new qa.a
            r5.<init>(r3)
            na.m r3 = r4.t(r5)
            java.lang.Object r3 = r3.d()
            la.A r3 = (la.InterfaceC3449A) r3
            java.lang.Object r1 = r1.putIfAbsent(r2, r3)
            la.A r1 = (la.InterfaceC3449A) r1
            if (r1 == 0) goto L55
            r3 = r1
        L55:
            if (r3 != r7) goto L58
        L57:
            r7 = r0
        L58:
            java.util.List r0 = r6.f40200e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L5f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r0.next()
            la.A r2 = (la.InterfaceC3449A) r2
            if (r1 != 0) goto L71
            if (r2 != r7) goto L5f
            r1 = 1
            goto L5f
        L71:
            la.z r2 = r2.create(r6, r8)
            if (r2 == 0) goto L5f
            return r2
        L78:
            if (r1 != 0) goto L7f
            la.z r7 = r6.c(r8)
            return r7
        L7f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: la.l.d(la.A, qa.a):la.z");
    }

    public final C3963b e(Writer writer) {
        C3963b c3963b = new C3963b(writer);
        c3963b.D(this.f40202g);
        c3963b.f44709i = this.f40201f;
        c3963b.J(2);
        c3963b.k = false;
        return c3963b;
    }

    public final String f(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                h(e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e7) {
                throw new p(e7, 13);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            g(obj, cls, e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e10) {
            throw new p(e10, 13);
        }
    }

    public final void g(Object obj, Class cls, C3963b c3963b) {
        z zVarC = c(new C3883a(cls));
        int i5 = c3963b.f44708h;
        if (i5 == 2) {
            c3963b.f44708h = 1;
        }
        boolean z2 = c3963b.f44709i;
        boolean z10 = c3963b.k;
        c3963b.f44709i = this.f40201f;
        c3963b.k = false;
        try {
            try {
                zVarC.c(c3963b, obj);
            } catch (IOException e7) {
                throw new p(e7, 13);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.12.0): " + e10.getMessage(), e10);
            }
        } finally {
            c3963b.J(i5);
            c3963b.f44709i = z2;
            c3963b.k = z10;
        }
    }

    public final void h(C3963b c3963b) {
        q qVar = q.f40207a;
        int i5 = c3963b.f44708h;
        boolean z2 = c3963b.f44709i;
        boolean z10 = c3963b.k;
        c3963b.f44709i = this.f40201f;
        c3963b.k = false;
        if (i5 == 2) {
            c3963b.f44708h = 1;
        }
        try {
            try {
                Y.f27443z.getClass();
                C1760f.e(c3963b, qVar);
                c3963b.J(i5);
                c3963b.f44709i = z2;
                c3963b.k = z10;
            } catch (IOException e7) {
                throw new p(e7, 13);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.12.0): " + e10.getMessage(), e10);
            }
        } catch (Throwable th) {
            c3963b.J(i5);
            c3963b.f44709i = z2;
            c3963b.k = z10;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f40200e + ",instanceCreators:" + this.f40198c + "}";
    }

    public l(Excluder excluder, h hVar, Map map, i iVar, List list, List list2, List list3, x xVar, x xVar2, List list4) {
        InterfaceC3449A interfaceC3449AD;
        this.f40196a = new ThreadLocal();
        this.f40197b = new ConcurrentHashMap();
        C1521a c1521a = new C1521a((Object) map, false, (Object) list4, 16);
        this.f40198c = c1521a;
        this.f40201f = true;
        this.f40202g = iVar;
        this.f40203h = list;
        this.f40204i = list2;
        this.f40205j = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Y.f27417A);
        arrayList.add(C1767m.d(xVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(Y.f27433p);
        arrayList.add(Y.f27425g);
        arrayList.add(Y.f27422d);
        arrayList.add(Y.f27423e);
        arrayList.add(Y.f27424f);
        C1776w c1776w = Y.k;
        arrayList.add(Y.a(Long.TYPE, Long.class, c1776w));
        arrayList.add(Y.a(Double.TYPE, Double.class, new C1768n(1)));
        arrayList.add(Y.a(Float.TYPE, Float.class, new C1768n(2)));
        if (xVar2 == x.f40211b) {
            interfaceC3449AD = C1766l.f27471b;
        } else {
            interfaceC3449AD = C1766l.d(xVar2);
        }
        arrayList.add(interfaceC3449AD);
        arrayList.add(Y.f27426h);
        arrayList.add(Y.f27427i);
        arrayList.add(Y.b(AtomicLong.class, new j(c1776w, 0).a()));
        arrayList.add(Y.b(AtomicLongArray.class, new j(c1776w, 1).a()));
        arrayList.add(Y.f27428j);
        arrayList.add(Y.f27429l);
        arrayList.add(Y.f27434q);
        arrayList.add(Y.f27435r);
        arrayList.add(Y.b(BigDecimal.class, Y.f27430m));
        arrayList.add(Y.b(BigInteger.class, Y.f27431n));
        arrayList.add(Y.b(na.h.class, Y.f27432o));
        arrayList.add(Y.f27436s);
        arrayList.add(Y.f27437t);
        arrayList.add(Y.f27439v);
        arrayList.add(Y.f27440w);
        arrayList.add(Y.f27442y);
        arrayList.add(Y.f27438u);
        arrayList.add(Y.f27420b);
        arrayList.add(C1758d.f27448c);
        arrayList.add(Y.f27441x);
        if (com.google.gson.internal.sql.c.f27507a) {
            arrayList.add(com.google.gson.internal.sql.c.f27509c);
            arrayList.add(com.google.gson.internal.sql.c.f27508b);
            arrayList.add(com.google.gson.internal.sql.c.f27510d);
        }
        arrayList.add(C1755a.f27444c);
        arrayList.add(Y.f27419a);
        arrayList.add(new CollectionTypeAdapterFactory(c1521a));
        arrayList.add(new MapTypeAdapterFactory(c1521a));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(c1521a);
        this.f40199d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(Y.f27418B);
        arrayList.add(new ReflectiveTypeAdapterFactory(c1521a, hVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f40200e = DesugarCollections.unmodifiableList(arrayList);
    }
}
