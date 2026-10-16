package kotlinx.coroutines.g;

import h.ab;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.ai;
import kotlinx.coroutines.ax;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements kotlinx.coroutines.j, m {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.j f51999a;

    /* renamed from: d, reason: collision with root package name */
    private Object f52002d;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.d f52000b = h.e.b.h(n.f52006b);

    /* renamed from: c, reason: collision with root package name */
    private List f52001c = new ArrayList(2);

    /* renamed from: e, reason: collision with root package name */
    private int f52003e = -1;

    /* renamed from: f, reason: collision with root package name */
    private Object f52004f = n.f52009e;

    public k(h.c.j jVar) {
        this.f51999a = jVar;
    }

    private final int o(Object obj, Object obj2) {
        while (true) {
            kotlinx.a.d dVar = this.f52000b;
            Object objB = dVar.b();
            if (objB instanceof kotlinx.coroutines.k) {
                h hVarS = s(obj);
                if (hVarS != null) {
                    q qVarC = hVarS.c(this, obj2);
                    if (dVar.e(objB, hVarS)) {
                        kotlinx.coroutines.k kVar = (kotlinx.coroutines.k) objB;
                        this.f52004f = obj2;
                        Object objI = kVar.i(ab.f48028a, qVarC);
                        if (objI == null) {
                            this.f52004f = n.f52009e;
                            return 2;
                        }
                        kVar.b(objI);
                        return 0;
                    }
                } else {
                    continue;
                }
            } else {
                if (x.n(objB, n.f52007c) || (objB instanceof h)) {
                    return 3;
                }
                if (x.n(objB, n.f52008d)) {
                    return 2;
                }
                if (x.n(objB, n.f52006b)) {
                    if (dVar.e(objB, h.a.i.d(obj))) {
                        return 1;
                    }
                } else {
                    if (!(objB instanceof List)) {
                        Objects.toString(objB);
                        throw new IllegalStateException("Unexpected state: ".concat(String.valueOf(objB)));
                    }
                    if (dVar.e(objB, h.a.i.ag((Collection) objB, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    private final Object p(h.c.e eVar) {
        int i2 = ai.f51347a;
        kotlinx.a.d dVar = this.f52000b;
        Object objB = dVar.b();
        x.d(objB, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        h hVar = (h) objB;
        Object obj = this.f52004f;
        List<h> list = this.f52001c;
        if (list != null) {
            for (h hVar2 : list) {
                if (hVar2 != hVar) {
                    hVar2.d();
                }
            }
            dVar.d(n.f52007c);
            this.f52004f = n.f52009e;
            this.f52001c = null;
        }
        return !ai.c() ? hVar.a(hVar.b(obj), eVar) : r(hVar, obj, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(h.c.e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.g.i
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.g.i r0 = (kotlinx.coroutines.g.i) r0
            int r1 = r0.f51995c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51995c = r1
            goto L18
        L13:
            kotlinx.coroutines.g.i r0 = new kotlinx.coroutines.g.i
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f51993a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51995c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            e.b.c.b(r9)
            goto Lba
        L37:
            e.b.c.b(r9)
            r0.f51995c = r4
            kotlinx.coroutines.l r9 = new kotlinx.coroutines.l
            h.c.e r2 = h.c.a.h.d(r0)
            r9.<init>(r2, r4)
            r9.u()
            r2 = r9
            kotlinx.coroutines.k r2 = (kotlinx.coroutines.k) r2
        L4b:
            kotlinx.a.d r5 = r8.f52000b
            java.lang.Object r6 = r5.b()
            kotlinx.coroutines.e.ak r7 = kotlinx.coroutines.g.n.e()
            if (r6 != r7) goto L64
            boolean r5 = r5.e(r6, r2)
            if (r5 == 0) goto L4b
            r4 = r8
            kotlinx.coroutines.j r4 = (kotlinx.coroutines.j) r4
            kotlinx.coroutines.bo.m(r2, r4)
            goto Laa
        L64:
            boolean r7 = r6 instanceof java.util.List
            if (r7 == 0) goto L96
            kotlinx.coroutines.e.ak r7 = kotlinx.coroutines.g.n.e()
            boolean r5 = r5.e(r6, r7)
            if (r5 == 0) goto L4b
            r5 = r6
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r5 = r6.iterator()
        L7b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r5.next()
            kotlinx.coroutines.g.h r6 = r8.s(r6)
            h.g.b.x.c(r6)
            r7 = 0
            r6.f51986c = r7
            r7 = -1
            r6.f51987d = r7
            r8.h(r6, r4)
            goto L7b
        L96:
            boolean r4 = r6 instanceof kotlinx.coroutines.g.h
            if (r4 == 0) goto Lc4
            h.ab r4 = h.ab.f48028a
            kotlinx.coroutines.g.h r6 = (kotlinx.coroutines.g.h) r6
            r5 = r8
            kotlinx.coroutines.g.l r5 = (kotlinx.coroutines.g.l) r5
            java.lang.Object r7 = r8.f52004f
            h.g.a.q r5 = r6.c(r5, r7)
            r2.d(r4, r5)
        Laa:
            java.lang.Object r9 = r9.j()
            if (r9 != r1) goto Lb3
            h.d.b.c(r0)
        Lb3:
            if (r9 == r1) goto Lb7
            h.ab r9 = h.ab.f48028a
        Lb7:
            if (r9 != r1) goto Lba
            goto Lc2
        Lba:
            r0.f51995c = r3
            java.lang.Object r8 = r8.p(r0)
            if (r8 != r1) goto Lc3
        Lc2:
            return r1
        Lc3:
            return r8
        Lc4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.util.Objects.toString(r6)
            java.lang.String r9 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "unexpected state: "
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.g.k.q(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(kotlinx.coroutines.g.h r5, java.lang.Object r6, h.c.e r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.g.j
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.g.j r0 = (kotlinx.coroutines.g.j) r0
            int r1 = r0.f51998c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51998c = r1
            goto L18
        L13:
            kotlinx.coroutines.g.j r0 = new kotlinx.coroutines.g.j
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.f51996a
            h.c.a.a r7 = h.c.a.a.f48038a
            int r1 = r0.f51998c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            e.b.c.b(r4)     // Catch: java.lang.Throwable -> L27
            return r4
        L27:
            r4 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            e.b.c.b(r4)
            java.lang.Object r4 = r5.b(r6)     // Catch: java.lang.Throwable -> L27
            r0.f51998c = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.a(r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r4 != r7) goto L41
            return r7
        L41:
            return r4
        L42:
            boolean r5 = kotlinx.coroutines.ai.c()
            if (r5 == 0) goto L54
            boolean r5 = r0 instanceof h.c.b.a.d
            if (r5 != 0) goto L4d
            throw r4
        L4d:
            h.c.b.a.d r0 = (h.c.b.a.d) r0
            java.lang.Throwable r4 = kotlinx.coroutines.e.aj.a(r4, r0)
            throw r4
        L54:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.g.k.r(kotlinx.coroutines.g.h, java.lang.Object, h.c.e):java.lang.Object");
    }

    private final h s(Object obj) {
        List list = this.f52001c;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((h) next).f51984a == obj) {
                obj2 = next;
                break;
            }
        }
        h hVar = (h) obj2;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("Clause with object " + obj + " is not found");
    }

    @Override // kotlinx.coroutines.j
    public final void b(Throwable th) {
        kotlinx.a.d dVar;
        Object objB;
        do {
            dVar = this.f52000b;
            objB = dVar.b();
            if (objB == n.f52007c) {
                return;
            }
        } while (!dVar.e(objB, n.f52008d));
        List list = this.f52001c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((h) it.next()).d();
            }
            this.f52004f = n.f52009e;
            this.f52001c = null;
        }
    }

    public final Object d(h.c.e eVar) {
        return this.f52000b.b() instanceof h ? p(eVar) : q(eVar);
    }

    @Override // kotlinx.coroutines.g.l
    public final h.c.j e() {
        return this.f51999a;
    }

    public final o f(Object obj, Object obj2) {
        int iO = o(obj, obj2);
        return iO != 0 ? iO != 1 ? iO != 2 ? o.f52014d : o.f52013c : o.f52012b : o.f52011a;
    }

    @Override // kotlinx.coroutines.g.l
    public final void g(ax axVar) {
        this.f52002d = axVar;
    }

    public final void h(h hVar, boolean z) {
        int i2 = ai.f51347a;
        kotlinx.a.d dVar = this.f52000b;
        if (dVar.b() instanceof h) {
            return;
        }
        if (!z) {
            Object obj = hVar.f51984a;
            List list = this.f52001c;
            x.c(list);
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).f51984a == obj) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Cannot use select clauses on the same object: ".concat(obj.toString()));
                    }
                }
            }
        }
        if (!hVar.e(this)) {
            dVar.d(hVar);
            return;
        }
        if (!z) {
            List list3 = this.f52001c;
            x.c(list3);
            list3.add(hVar);
        }
        hVar.f51986c = this.f52002d;
        hVar.f51987d = this.f52003e;
        this.f52002d = null;
        this.f52003e = -1;
    }

    @Override // kotlinx.coroutines.g.l
    public final void i(Object obj) {
        this.f52004f = obj;
    }

    @Override // kotlinx.coroutines.g.l
    public final boolean j(Object obj, Object obj2) {
        return o(obj, obj2) == 0;
    }

    public final void k(e eVar, p pVar) {
        h(new h(this, eVar.a(), eVar.d(), eVar.c(), null, pVar, eVar.b()), false);
    }

    public final void n(org.a.d.a aVar, h.g.a.l lVar) {
        h(new h(this, aVar.k(), aVar.m(), aVar.l(), n.f(), lVar, null), false);
    }

    @Override // kotlinx.coroutines.dl
    public final void z(kotlinx.coroutines.e.e eVar, int i2) {
        this.f52002d = eVar;
        this.f52003e = i2;
    }
}
