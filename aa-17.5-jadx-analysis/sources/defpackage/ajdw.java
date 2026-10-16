package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ajdw implements aite, aiwr {
    private Object d;
    public final aisx a = new aisx(ajdx.a, aisy.a);
    private List c = new ArrayList(2);
    private int e = -1;
    public Object b = ajdx.d;

    private final ajdt i(Object obj) {
        List list = this.c;
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
            if (((ajdt) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        ajdt ajdtVar = (ajdt) obj2;
        if (ajdtVar != null) {
            return ajdtVar;
        }
        throw new IllegalStateException(a.bm(obj, "Clause with object ", " is not found"));
    }

    @Override // defpackage.aiwr
    public final void E(ajbv ajbvVar, int i) {
        this.d = ajbvVar;
        this.e = i;
    }

    @Override // defpackage.aite
    public final void a(Throwable th) {
        aisx aisxVar;
        Object obj;
        do {
            aisxVar = this.a;
            obj = aisxVar.a;
            if (obj == ajdx.b) {
                return;
            }
        } while (!aisxVar.d(obj, ajdx.c));
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ajdt) it.next()).c();
            }
            this.b = ajdx.d;
            this.c = null;
        }
    }

    public final int b(Object obj, Object obj2) {
        while (true) {
            aisx aisxVar = this.a;
            Object obj3 = aisxVar.a;
            if (obj3 instanceof aitf) {
                ajdt ajdtVarI = i(obj);
                if (ajdtVarI != null && aisxVar.d(obj3, ajdtVarI)) {
                    aitf aitfVar = (aitf) obj3;
                    this.b = obj2;
                    Object objJ = aitfVar.j(afak.a, null);
                    if (objJ == null) {
                        this.b = ajdx.d;
                        return 2;
                    }
                    aitfVar.c(objJ);
                    return 0;
                }
            } else {
                if (affa.f(obj3, ajdx.b) || (obj3 instanceof ajdt)) {
                    return 3;
                }
                if (affa.f(obj3, ajdx.c)) {
                    return 2;
                }
                if (affa.f(obj3, ajdx.a)) {
                    if (aisxVar.d(obj3, woy.bg(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        Objects.toString(obj3);
                        throw new IllegalStateException("Unexpected state: ".concat(String.valueOf(obj3)));
                    }
                    if (aisxVar.d(obj3, woy.bZ((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    public final Object c(afck afckVar) {
        boolean z = aitz.a;
        aisx aisxVar = this.a;
        Object obj = aisxVar.a;
        obj.getClass();
        ajdt ajdtVar = (ajdt) obj;
        Object obj2 = this.b;
        List<ajdt> list = this.c;
        if (list != null) {
            for (ajdt ajdtVar2 : list) {
                if (ajdtVar2 != ajdtVar) {
                    ajdtVar2.c();
                }
            }
            aisxVar.c(ajdx.b);
            this.b = ajdx.d;
            this.c = null;
        }
        return !aitz.b ? ajdtVar.a(ajdtVar.b(obj2), afckVar) : e(ajdtVar, obj2, afckVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.afck r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.ajdu
            if (r0 == 0) goto L13
            r0 = r10
            ajdu r0 = (defpackage.ajdu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajdu r0 = new ajdu
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.woy.dF(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            defpackage.woy.dF(r10)
            goto L9d
        L36:
            defpackage.woy.dF(r10)
            r0.c = r4
            aitg r10 = new aitg
            afck r2 = defpackage.affa.s(r0)
            r10.<init>(r2, r4)
            r10.z()
            aisx r2 = r9.a
        L49:
            java.lang.Object r5 = r2.a
            ajcz r6 = defpackage.ajdx.a
            if (r5 != r6) goto L59
            boolean r5 = r2.d(r5, r10)
            if (r5 == 0) goto L49
            r10.A(r9)
            goto L92
        L59:
            boolean r7 = r5 instanceof java.util.List
            r8 = 0
            if (r7 == 0) goto L87
            boolean r6 = r2.d(r5, r6)
            if (r6 == 0) goto L49
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L6d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L49
            java.lang.Object r6 = r5.next()
            ajdt r6 = r9.i(r6)
            r6.getClass()
            r6.c = r8
            r7 = -1
            r6.d = r7
            r9.f(r6, r4)
            goto L6d
        L87:
            boolean r2 = r5 instanceof defpackage.ajdt
            if (r2 == 0) goto La7
            afak r2 = defpackage.afak.a
            ajdt r5 = (defpackage.ajdt) r5
            r10.e(r2, r8)
        L92:
            java.lang.Object r10 = r10.k()
            if (r10 == r1) goto L9a
            afak r10 = defpackage.afak.a
        L9a:
            if (r10 != r1) goto L9d
            goto La5
        L9d:
            r0.c = r3
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto La6
        La5:
            return r1
        La6:
            return r9
        La7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.util.Objects.toString(r5)
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "unexpected state: "
            java.lang.String r10 = r0.concat(r10)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdw.d(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ajdt r5, java.lang.Object r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ajdv
            if (r0 == 0) goto L13
            r0 = r7
            ajdv r0 = (defpackage.ajdv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajdv r0 = new ajdv
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.a
            afcr r7 = defpackage.afcr.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            defpackage.woy.dF(r4)     // Catch: java.lang.Throwable -> L27
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
            defpackage.woy.dF(r4)
            java.lang.Object r4 = r5.b(r6)     // Catch: java.lang.Throwable -> L27
            r0.c = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.a(r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r4 != r7) goto L41
            return r7
        L41:
            return r4
        L42:
            boolean r5 = defpackage.aitz.b
            if (r5 != 0) goto L47
            throw r4
        L47:
            java.lang.Throwable r4 = defpackage.ajcy.a(r4, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdw.e(ajdt, java.lang.Object, afck):java.lang.Object");
    }

    public final void f(ajdt ajdtVar, boolean z) {
        boolean z2 = aitz.a;
        aisx aisxVar = this.a;
        if (aisxVar.a instanceof ajdt) {
            return;
        }
        if (!z) {
            Object obj = ajdtVar.a;
            List list = this.c;
            list.getClass();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((ajdt) it.next()).a == obj) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Cannot use select clauses on the same object: ".concat(obj.toString()));
                    }
                }
            }
        }
        ajdtVar.b.invoke(ajdtVar.a, this, null);
        if (this.b != ajdx.d) {
            aisxVar.c(ajdtVar);
            return;
        }
        if (!z) {
            List list2 = this.c;
            list2.getClass();
            list2.add(ajdtVar);
        }
        ajdtVar.c = this.d;
        ajdtVar.d = this.e;
        this.d = null;
        this.e = -1;
    }

    public final boolean g(Object obj, Object obj2) {
        return b(obj, obj2) == 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [afeh, java.lang.Object] */
    public final void h(ajds ajdsVar, afeg afegVar) {
        f(new ajdt(ajdsVar.a, ajdsVar.b, ajdsVar.c, afegVar), false);
    }
}
