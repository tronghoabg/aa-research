package com.waze.av.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15886a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final long f15887b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f15888c;

    static {
        h.o.c cVar = h.o.a.f48264a;
        f15887b = h.o.c.i(1, h.o.d.f48274e);
        f15888c = h.o.c.i(1, h.o.d.f48276g);
    }

    public static final aa a(ah ahVar, String str) {
        Object next;
        h.g.b.x.f(ahVar, "<this>");
        h.g.b.x.f(str, "eventId");
        Iterator it = ((Iterable) ahVar.d().d()).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List listB = ((aa) next).b();
            if (!(listB instanceof Collection) || !listB.isEmpty()) {
                Iterator it2 = listB.iterator();
                while (it2.hasNext()) {
                    if (h.g.b.x.n(((c) it2.next()).c(), str)) {
                        break loop0;
                    }
                }
            }
        }
        return (aa) next;
    }

    public static final aa b(ah ahVar, long j2) {
        Object next;
        h.g.b.x.f(ahVar, "<this>");
        Iterator it = ((Iterable) ahVar.d().d()).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List listC = ((aa) next).c();
            if (!(listC instanceof Collection) || !listC.isEmpty()) {
                Iterator it2 = listC.iterator();
                while (it2.hasNext()) {
                    if (((h) it2.next()).a() == j2) {
                        break loop0;
                    }
                }
            }
        }
        return (aa) next;
    }

    public static final aa c(ah ahVar, int i2) {
        Object next;
        h.g.b.x.f(ahVar, "<this>");
        Iterator it = ((Iterable) ahVar.d().d()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer numE = ((aa) next).a().e();
            if (numE != null && numE.intValue() == i2) {
                break;
            }
        }
        return (aa) next;
    }

    public static final aa d(ah ahVar, String str) {
        Object next;
        h.g.b.x.f(ahVar, "<this>");
        h.g.b.x.f(str, "venueId");
        Iterator it = ((Iterable) ahVar.d().d()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (h.g.b.x.n(((aa) next).a().c().c(), str)) {
                break;
            }
        }
        return (aa) next;
    }

    public static final aa e(ah ahVar) {
        Object next;
        h.g.b.x.f(ahVar, "<this>");
        Iterator it = ((Iterable) ahVar.d().d()).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List listC = ((aa) next).c();
            if (!(listC instanceof Collection) || !listC.isEmpty()) {
                Iterator it2 = listC.iterator();
                while (it2.hasNext()) {
                    if (((h) it2.next()) instanceof e) {
                        break loop0;
                    }
                }
            }
        }
        return (aa) next;
    }

    public static final aa f(ah ahVar) {
        Object next;
        h.g.b.x.f(ahVar, "<this>");
        Iterator it = ((Iterable) ahVar.d().d()).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List listC = ((aa) next).c();
            if (!(listC instanceof Collection) || !listC.isEmpty()) {
                Iterator it2 = listC.iterator();
                while (it2.hasNext()) {
                    if (((h) it2.next()) instanceof g) {
                        break loop0;
                    }
                }
            }
        }
        return (aa) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(com.waze.av.b.ah r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.av.b.ar
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.av.b.ar r0 = (com.waze.av.b.ar) r0
            int r1 = r0.f15882c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15882c = r1
            goto L18
        L13:
            com.waze.av.b.ar r0 = new com.waze.av.b.ar
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15881b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15882c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f15880a
            com.waze.av.b.ah r7 = (com.waze.av.b.ah) r7
            e.b.c.b(r8)
            goto L4b
        L3a:
            e.b.c.b(r8)
            kotlinx.coroutines.b.k r8 = m(r7)
            r0.f15880a = r7
            r0.f15882c = r4
            java.lang.Object r8 = kotlinx.coroutines.b.ai.h(r8, r0)
            if (r8 == r1) goto L83
        L4b:
            com.waze.av.b.aa r8 = (com.waze.av.b.aa) r8
            r2 = 0
            if (r8 != 0) goto L51
            return r2
        L51:
            java.util.List r4 = r8.c()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L5b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.waze.av.b.h r6 = (com.waze.av.b.h) r6
            boolean r6 = r6 instanceof com.waze.av.b.e
            if (r6 == 0) goto L5b
            goto L6e
        L6d:
            r5 = r2
        L6e:
            com.waze.av.b.h r5 = (com.waze.av.b.h) r5
            if (r5 != 0) goto L73
            return r2
        L73:
            com.waze.av.a.p r8 = r8.a()
            r0.f15880a = r2
            r0.f15882c = r3
            java.lang.Object r7 = r7.b(r8, r5, r0)
            if (r7 != r1) goto L82
            goto L83
        L82:
            return r7
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.av.b.at.g(com.waze.av.b.ah, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(com.waze.av.b.ah r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.av.b.as
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.av.b.as r0 = (com.waze.av.b.as) r0
            int r1 = r0.f15885c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15885c = r1
            goto L18
        L13:
            com.waze.av.b.as r0 = new com.waze.av.b.as
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15884b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15885c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f15883a
            com.waze.av.b.ah r7 = (com.waze.av.b.ah) r7
            e.b.c.b(r8)
            goto L4b
        L3a:
            e.b.c.b(r8)
            kotlinx.coroutines.b.k r8 = p(r7)
            r0.f15883a = r7
            r0.f15885c = r4
            java.lang.Object r8 = kotlinx.coroutines.b.ai.h(r8, r0)
            if (r8 == r1) goto L83
        L4b:
            com.waze.av.b.aa r8 = (com.waze.av.b.aa) r8
            r2 = 0
            if (r8 != 0) goto L51
            return r2
        L51:
            java.util.List r4 = r8.c()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L5b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.waze.av.b.h r6 = (com.waze.av.b.h) r6
            boolean r6 = r6 instanceof com.waze.av.b.g
            if (r6 == 0) goto L5b
            goto L6e
        L6d:
            r5 = r2
        L6e:
            com.waze.av.b.h r5 = (com.waze.av.b.h) r5
            if (r5 != 0) goto L73
            return r2
        L73:
            com.waze.av.a.p r8 = r8.a()
            r0.f15883a = r2
            r0.f15885c = r3
            java.lang.Object r7 = r7.b(r8, r5, r0)
            if (r7 != r1) goto L82
            goto L83
        L82:
            return r7
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.av.b.at.h(com.waze.av.b.ah, h.c.e):java.lang.Object");
    }

    public static final List i(ah ahVar) {
        h.g.b.x.f(ahVar, "<this>");
        Iterable iterable = (Iterable) ahVar.d().d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!((aa) obj).c().isEmpty()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List j(ah ahVar) {
        h.g.b.x.f(ahVar, "<this>");
        Iterable iterable = (Iterable) ahVar.d().d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            List listC = ((aa) obj).c();
            if (!(listC instanceof Collection) || !listC.isEmpty()) {
                Iterator it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((h) it.next()) instanceof f) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static final List k(ah ahVar) {
        h.g.b.x.f(ahVar, "<this>");
        Iterable iterable = (Iterable) ahVar.d().d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!((aa) obj).d().isEmpty()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List l(ah ahVar, long j2) {
        h.g.b.x.f(ahVar, "<this>");
        long jM = j2 - h.o.a.m(f15887b);
        long jM2 = j2 + h.o.a.m(f15888c);
        Iterable iterable = (Iterable) ahVar.d().d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            List listB = ((aa) obj).b();
            if (!(listB instanceof Collection) || !listB.isEmpty()) {
                Iterator it = listB.iterator();
                while (true) {
                    if (it.hasNext()) {
                        long jB = ((c) it.next()).b();
                        if (jM <= jB && jB <= jM2) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final kotlinx.coroutines.b.k m(ah ahVar) {
        h.g.b.x.f(ahVar, "<this>");
        return new al(ahVar.d(), 1);
    }

    public static final kotlinx.coroutines.b.k n(ah ahVar) {
        h.g.b.x.f(ahVar, "<this>");
        return new al(ahVar.d(), 2);
    }

    public static final kotlinx.coroutines.b.k o(ah ahVar, long j2) {
        h.g.b.x.f(ahVar, "<this>");
        return new ap(ahVar.d(), j2 - h.o.a.m(f15887b), j2 + h.o.a.m(f15888c));
    }

    public static final kotlinx.coroutines.b.k p(ah ahVar) {
        h.g.b.x.f(ahVar, "<this>");
        return new al(ahVar.d(), 3);
    }
}
