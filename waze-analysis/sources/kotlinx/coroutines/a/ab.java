package kotlinx.coroutines.a;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlinx.coroutines.a.ad r4, h.g.a.a r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.a.z
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.a.z r0 = (kotlinx.coroutines.a.z) r0
            int r1 = r0.f51335d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51335d = r1
            goto L18
        L13:
            kotlinx.coroutines.a.z r0 = new kotlinx.coroutines.a.z
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f51334c
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51335d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f51333b
            r5 = r4
            h.g.a.a r5 = (h.g.a.a) r5
            java.lang.Object r4 = r0.f51332a
            kotlinx.coroutines.a.ad r4 = (kotlinx.coroutines.a.ad) r4
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L30
            goto L78
        L30:
            r4 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            e.b.c.b(r6)
            h.c.j r6 = r0.getContext()
            kotlinx.coroutines.ac r2 = kotlinx.coroutines.br.f51766a
            h.c.i r2 = (h.c.i) r2
            h.c.h r6 = r6.get(r2)
            if (r6 != r4) goto L82
            r0.f51332a = r4     // Catch: java.lang.Throwable -> L30
            r0.f51333b = r5     // Catch: java.lang.Throwable -> L30
            r0.f51335d = r3     // Catch: java.lang.Throwable -> L30
            h.c.e r0 = (h.c.e) r0     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.l r6 = new kotlinx.coroutines.l     // Catch: java.lang.Throwable -> L30
            h.c.e r2 = h.c.a.h.d(r0)     // Catch: java.lang.Throwable -> L30
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L30
            r6.u()     // Catch: java.lang.Throwable -> L30
            r2 = r6
            kotlinx.coroutines.k r2 = (kotlinx.coroutines.k) r2     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.a.aa r3 = new kotlinx.coroutines.a.aa     // Catch: java.lang.Throwable -> L30
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L30
            h.g.a.l r3 = (h.g.a.l) r3     // Catch: java.lang.Throwable -> L30
            r4.t(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r6.j()     // Catch: java.lang.Throwable -> L30
            if (r4 != r1) goto L75
            h.d.b.c(r0)     // Catch: java.lang.Throwable -> L30
        L75:
            if (r4 != r1) goto L78
            return r1
        L78:
            r5.invoke()
            h.ab r4 = h.ab.f48028a
            return r4
        L7e:
            r5.invoke()
            throw r4
        L82:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.ab.a(kotlinx.coroutines.a.ad, h.g.a.a, h.c.e):java.lang.Object");
    }

    public static final af b(kotlinx.coroutines.af afVar, h.c.j jVar, int i2, h.g.a.p pVar) {
        return c(afVar, jVar, i2, a.f51271a, kotlinx.coroutines.ag.f51342a, pVar);
    }

    public static final af c(kotlinx.coroutines.af afVar, h.c.j jVar, int i2, a aVar, kotlinx.coroutines.ag agVar, h.g.a.p pVar) {
        ac acVar = new ac(kotlinx.coroutines.y.b(afVar, jVar), h.g.b.w.c(i2, aVar, null, 4));
        acVar.bS(agVar, acVar, pVar);
        return acVar;
    }

    public static /* synthetic */ af d(kotlinx.coroutines.af afVar, int i2, h.g.a.p pVar, int i3) {
        h.c.k kVar = (i3 & 1) != 0 ? h.c.k.f48060a : null;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return b(afVar, kVar, i2, pVar);
    }

    public static final Object e(ag agVar, Object obj) {
        Object objI = agVar.i(obj);
        if (objI instanceof s) {
            return ((t) aj.t(h.c.k.f48060a, new v(agVar, obj, null))).b();
        }
        return h.ab.f48028a;
    }

    public static final void f(af afVar, Throwable th) {
        if (th != null) {
            cancellationExceptionG = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionG == null) {
                cancellationExceptionG = bo.g("Channel was consumed, consumer had failed", th);
            }
        }
        afVar.s(cancellationExceptionG);
    }

    public static final Map g(int i2) {
        return new ConcurrentHashMap(i2);
    }

    public static /* synthetic */ String h(long j2) {
        if (j2 == 0) {
            return "0";
        }
        if (j2 > 0) {
            return Long.toString(j2, 10);
        }
        long j3 = (j2 >>> 1) / 5;
        char[] cArr = new char[64];
        int i2 = 63;
        cArr[63] = Character.forDigit((int) (j2 - (j3 * 10)), 10);
        while (j3 > 0) {
            i2--;
            cArr[i2] = Character.forDigit((int) (j3 % 10), 10);
            j3 /= 10;
        }
        return new String(cArr, i2, 64 - i2);
    }
}
