package kotlinx.coroutines;

import androidx.core.app.NotificationCompat;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class aj {
    public static Object C(Collection collection, h.c.e eVar) {
        return collection.isEmpty() ? h.a.i.h() : new e((am[]) collection.toArray(new am[0])).a(eVar);
    }

    public static Object D(am[] amVarArr, h.c.e eVar) {
        return new e(amVarArr).a(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object E(java.util.Collection r4, h.c.e r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.f
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.f r0 = (kotlinx.coroutines.f) r0
            int r1 = r0.f51931c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51931c = r1
            goto L18
        L13:
            kotlinx.coroutines.f r0 = new kotlinx.coroutines.f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f51930b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51931c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f51929a
            java.util.Iterator r4 = (java.util.Iterator) r4
            e.b.c.b(r5)
            goto L3c
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e.b.c.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.br r5 = (kotlinx.coroutines.br) r5
            r0.f51929a = r4
            r0.f51931c = r3
            java.lang.Object r5 = r5.m(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.aj.E(java.util.Collection, h.c.e):java.lang.Object");
    }

    public static final void F(Object obj) {
        h.g.b.x.f(obj, NotificationCompat.CATEGORY_EVENT);
    }

    public static Object G(long j2, h.g.a.p pVar, h.c.e eVar) {
        if (j2 <= 0) {
            throw new df("Timed out immediately", null);
        }
        Object objAa = aa(new dg(j2, eVar), pVar);
        if (objAa == h.c.a.a.f48038a) {
            h.d.b.c(eVar);
        }
        return objAa;
    }

    public static Object H(long j2, h.g.a.p pVar, h.c.e eVar) {
        return G(o(j2), pVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object I(long r7, h.g.a.p r9, h.c.e r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.dh
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.dh r0 = (kotlinx.coroutines.dh) r0
            int r1 = r0.f51843d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51843d = r1
            goto L18
        L13:
            kotlinx.coroutines.dh r0 = new kotlinx.coroutines.dh
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f51842c
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51843d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            long r7 = r0.f51840a
            h.g.b.aq r7 = r0.f51844e
            r8 = r7
            h.g.b.aq r8 = (h.g.b.aq) r8
            java.lang.Object r8 = r0.f51841b
            h.g.a.p r8 = (h.g.a.p) r8
            e.b.c.b(r10)     // Catch: kotlinx.coroutines.df -> L33
            return r10
        L33:
            r8 = move-exception
            goto L6d
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            e.b.c.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L47
            return r3
        L47:
            h.g.b.aq r10 = new h.g.b.aq
            r10.<init>()
            r0.f51841b = r9     // Catch: kotlinx.coroutines.df -> L6a
            r0.f51844e = r10     // Catch: kotlinx.coroutines.df -> L6a
            r0.f51840a = r7     // Catch: kotlinx.coroutines.df -> L6a
            r0.f51843d = r4     // Catch: kotlinx.coroutines.df -> L6a
            h.c.e r0 = (h.c.e) r0     // Catch: kotlinx.coroutines.df -> L6a
            kotlinx.coroutines.dg r2 = new kotlinx.coroutines.dg     // Catch: kotlinx.coroutines.df -> L6a
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.df -> L6a
            r10.f48105a = r2     // Catch: kotlinx.coroutines.df -> L6a
            java.lang.Object r7 = aa(r2, r9)     // Catch: kotlinx.coroutines.df -> L6a
            if (r7 != r1) goto L66
            h.d.b.c(r0)     // Catch: kotlinx.coroutines.df -> L6a
        L66:
            if (r7 != r1) goto L69
            return r1
        L69:
            return r7
        L6a:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L6d:
            kotlinx.coroutines.br r9 = r8.f51838a
            java.lang.Object r7 = r7.f48105a
            if (r9 != r7) goto L74
            return r3
        L74:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.aj.I(long, h.g.a.p, h.c.e):java.lang.Object");
    }

    public static Object J(long j2, h.g.a.p pVar, h.c.e eVar) {
        return I(o(j2), pVar, eVar);
    }

    public static dc K(ThreadLocal threadLocal, Object obj) {
        return new kotlinx.coroutines.e.aq(obj, threadLocal);
    }

    public static byte M(char c2) {
        if (c2 < '~') {
            return kotlinx.b.d.a.h.f51161b[c2];
        }
        return (byte) 0;
    }

    public static String N(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == 127 ? "invalid token" : "valid token";
    }

    public static Object O(h.g.a.p pVar, h.c.e eVar) {
        da daVar = new da(eVar.getContext(), eVar);
        Object objB = kotlinx.coroutines.g.d.b(daVar, daVar, pVar);
        if (objB == h.c.a.a.f48038a) {
            h.d.b.c(eVar);
        }
        return objB;
    }

    public static s P(br brVar) {
        return new db(brVar);
    }

    public static /* synthetic */ s Q() {
        return P(null);
    }

    public static h.c.b.a.d R(List list, int i2) {
        if (i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return new cu(i2, list);
    }

    public static boolean S(StackTraceElement stackTraceElement) {
        return h.n.o.ah(stackTraceElement.getMethodName(), "runBlocking") && h.n.o.ah(stackTraceElement.getClassName(), "kotlinx.coroutines.BuildersKt");
    }

    public static h.c.b.a.d T(cq cqVar) {
        if (cy.f51826b.e()) {
            return (h.c.b.a.d) h.m.k.i(h.m.k.k(h.m.k.g(cqVar.r(), new h.g.b.aj() { // from class: kotlinx.coroutines.co
                @Override // h.g.b.aj, h.l.p
                public final Object get(Object obj) {
                    return ((br) obj).r();
                }
            }), cp.f51813a));
        }
        return null;
    }

    public static ax U(br brVar, boolean z, bv bvVar) {
        return brVar instanceof cf ? ((cf) brVar).F(z, bvVar) : brVar.q(bvVar.c(), z, new bu(bvVar));
    }

    public static br V(h.c.j jVar) {
        br brVar = (br) jVar.get(br.f51766a);
        if (brVar != null) {
            return brVar;
        }
        Objects.toString(jVar);
        throw new IllegalStateException("Current context doesn't contain Job in it: ".concat(String.valueOf(jVar)));
    }

    public static void W(h.c.j jVar, CancellationException cancellationException) {
        br brVar = (br) jVar.get(br.f51766a);
        if (brVar != null) {
            brVar.s(cancellationException);
        }
    }

    public static void X(br brVar, String str, Throwable th) {
        brVar.s(bo.g(str, th));
    }

    public static void Y(h.c.j jVar) {
        br brVar = (br) jVar.get(br.f51766a);
        if (brVar != null) {
            Z(brVar);
        }
    }

    public static void Z(br brVar) {
        if (!brVar.bZ()) {
            throw brVar.n();
        }
    }

    public static String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    private static Object aa(dg dgVar, h.g.a.p pVar) {
        U(dgVar, true, new ay(s(dgVar.f51865c.getContext()).b(dgVar.f51839b, dgVar, dgVar.getContext())));
        return kotlinx.coroutines.g.d.c(dgVar, dgVar, pVar);
    }

    public static String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static String c(h.c.e eVar) {
        Object objA;
        if (eVar instanceof kotlinx.coroutines.e.j) {
            return ((kotlinx.coroutines.e.j) eVar).toString();
        }
        try {
            objA = eVar + "@" + b(eVar);
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        if (h.m.c(objA) != null) {
            objA = eVar.getClass().getName() + "@" + b(eVar);
        }
        return (String) objA;
    }

    public static Object d(h.g.a.p pVar, h.c.e eVar) {
        kotlinx.coroutines.e.ah ahVar = new kotlinx.coroutines.e.ah(eVar.getContext(), eVar);
        Object objB = kotlinx.coroutines.g.d.b(ahVar, ahVar, pVar);
        if (objB == h.c.a.a.f48038a) {
            h.d.b.c(eVar);
        }
        return objB;
    }

    public static af e(h.c.j jVar) {
        if (jVar.get(br.f51766a) == null) {
            jVar = jVar.plus(new bt(null));
        }
        return new kotlinx.coroutines.e.f(jVar);
    }

    public static af f() {
        s sVarQ = Q();
        int i2 = av.f51370a;
        return new kotlinx.coroutines.e.f(sVarQ.plus(kotlinx.coroutines.e.ac.f51860a));
    }

    public static af g(af afVar, h.c.j jVar) {
        return new kotlinx.coroutines.e.f(afVar.getCoroutineContext().plus(jVar));
    }

    public static void h(af afVar, CancellationException cancellationException) {
        br brVar = (br) afVar.getCoroutineContext().get(br.f51766a);
        if (brVar != null) {
            brVar.s(cancellationException);
        } else {
            Objects.toString(afVar);
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(afVar)));
        }
    }

    public static void i(af afVar) {
        Y(afVar.getCoroutineContext());
    }

    public static boolean j(af afVar) {
        br brVar = (br) afVar.getCoroutineContext().get(br.f51766a);
        if (brVar != null) {
            return brVar.bZ();
        }
        return true;
    }

    public static void m(at atVar, h.c.e eVar, boolean z) {
        Object objM = atVar.m();
        Throwable thP = atVar.p(objM);
        Object objA = thP != null ? e.b.c.a(thP) : atVar.l(objM);
        if (!z) {
            eVar.resumeWith(objA);
            return;
        }
        h.g.b.x.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        kotlinx.coroutines.e.j jVar = (kotlinx.coroutines.e.j) eVar;
        h.c.e eVar2 = jVar.f51901c;
        Object obj = jVar.f51903e;
        h.c.j context = eVar2.getContext();
        Object objB = kotlinx.coroutines.e.ap.b(context, obj);
        dj djVarC = objB != kotlinx.coroutines.e.ap.f51872a ? y.c(eVar2, context, objB) : null;
        try {
            eVar2.resumeWith(objA);
            if (djVarC == null || djVarC.U()) {
                kotlinx.coroutines.e.ap.c(context, objB);
            }
        } catch (Throwable th) {
            if (djVarC == null || djVarC.U()) {
                kotlinx.coroutines.e.ap.c(context, objB);
            }
            throw th;
        }
    }

    public static boolean n(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static long o(long j2) {
        if (h.o.a.E(j2)) {
            return h.o.a.m(h.o.a.r(j2, h.o.c.j(999999L, h.o.d.f48270a)));
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object p(h.c.e r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.ap
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.ap r0 = (kotlinx.coroutines.ap) r0
            int r1 = r0.f51365b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51365b = r1
            goto L18
        L13:
            kotlinx.coroutines.ap r0 = new kotlinx.coroutines.ap
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f51364a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51365b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            e.b.c.b(r4)
            goto L51
        L2f:
            e.b.c.b(r4)
            r0.f51365b = r3
            h.c.e r0 = (h.c.e) r0
            kotlinx.coroutines.l r4 = new kotlinx.coroutines.l
            h.c.e r2 = h.c.a.h.d(r0)
            r4.<init>(r2, r3)
            r4.u()
            r2 = r4
            kotlinx.coroutines.k r2 = (kotlinx.coroutines.k) r2
            java.lang.Object r4 = r4.j()
            if (r4 != r1) goto L4e
            h.d.b.c(r0)
        L4e:
            if (r4 != r1) goto L51
            return r1
        L51:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.aj.p(h.c.e):java.lang.Object");
    }

    public static Object q(long j2, h.c.e eVar) {
        if (j2 > 0) {
            l lVar = new l(h.c.a.h.d(eVar), 1);
            lVar.u();
            l lVar2 = lVar;
            if (j2 < Long.MAX_VALUE) {
                s(lVar2.getContext()).f(j2, lVar2);
            }
            Object objJ = lVar.j();
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (objJ == aVar) {
                h.d.b.c(eVar);
            }
            if (objJ == aVar) {
                return objJ;
            }
        }
        return h.ab.f48028a;
    }

    public static Object r(long j2, h.c.e eVar) {
        Object objQ = q(o(j2), eVar);
        return objQ == h.c.a.a.f48038a ? objQ : h.ab.f48028a;
    }

    public static ao s(h.c.j jVar) {
        h.c.h hVar = jVar.get(h.c.g.f48059a);
        ao aoVar = hVar instanceof ao ? (ao) hVar : null;
        return aoVar == null ? al.a() : aoVar;
    }

    public static Object t(h.c.j jVar, h.g.a.p pVar) {
        ba baVarA;
        h.c.j jVarB;
        if (((h.c.g) jVar.get(h.c.g.f48059a)) == null) {
            int i2 = dd.f51833a;
            baVarA = dd.b();
            jVarB = y.b(bj.f51758a, jVar.plus(baVarA));
        } else {
            int i3 = dd.f51833a;
            baVarA = dd.a();
            jVarB = y.b(bj.f51758a, jVar);
        }
        g gVar = new g(jVarB, Thread.currentThread(), baVarA);
        gVar.bS(ag.f51342a, gVar, pVar);
        return gVar.i();
    }

    public static Object u(h.c.j jVar, h.g.a.p pVar) {
        return t(jVar, pVar);
    }

    public static Object v(h.c.j jVar, h.g.a.p pVar, h.c.e eVar) {
        return bo.o(jVar, pVar, eVar);
    }

    public static am w(af afVar, h.c.j jVar, ag agVar, h.g.a.p pVar) {
        return bo.p(afVar, jVar, agVar, pVar);
    }

    public static br x(af afVar, h.c.j jVar, ag agVar, h.g.a.p pVar) {
        return bo.q(afVar, jVar, agVar, pVar);
    }

    public static /* synthetic */ am y(af afVar, h.c.j jVar, ag agVar, h.g.a.p pVar, int i2) {
        if ((i2 & 1) != 0) {
            jVar = h.c.k.f48060a;
        }
        if ((i2 & 2) != 0) {
            agVar = ag.f51342a;
        }
        return bo.p(afVar, jVar, agVar, pVar);
    }

    public static /* synthetic */ br z(af afVar, h.c.j jVar, ag agVar, h.g.a.p pVar, int i2) {
        if ((i2 & 1) != 0) {
            jVar = h.c.k.f48060a;
        }
        if ((i2 & 2) != 0) {
            agVar = ag.f51342a;
        }
        return bo.q(afVar, jVar, agVar, pVar);
    }
}
