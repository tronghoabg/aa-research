package kotlinx.coroutines.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    private static final ak f51906b = new ak("UNDEFINED");

    /* renamed from: a, reason: collision with root package name */
    public static final ak f51905a = new ak("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[Catch: all -> 0x00a4, DONT_GENERATE, TryCatch #0 {all -> 0x00a4, blocks: (B:13:0x0043, B:15:0x0053, B:17:0x0059, B:28:0x008d, B:18:0x0069, B:20:0x0079, B:25:0x0084, B:27:0x008a, B:34:0x009a, B:37:0x00a3, B:36:0x00a0, B:23:0x007f), top: B:47:0x0043, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(h.c.e r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.e.j
            if (r0 == 0) goto Lb1
            kotlinx.coroutines.e.j r6 = (kotlinx.coroutines.e.j) r6
            java.lang.Object r0 = h.f.s.j(r7)
            kotlinx.coroutines.ab r1 = r6.f51900b
            h.c.j r2 = r6.getContext()
            boolean r2 = d(r1, r2)
            r3 = 1
            if (r2 == 0) goto L25
            r6.f51902d = r0
            r6.f51368a = r3
            h.c.j r7 = r6.getContext()
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            c(r1, r7, r6)
            return
        L25:
            int r1 = kotlinx.coroutines.ai.f51347a
            int r1 = kotlinx.coroutines.dd.f51833a
            kotlinx.coroutines.ba r1 = kotlinx.coroutines.dd.b()
            boolean r2 = r1.l()
            if (r2 == 0) goto L3d
            r6.f51902d = r0
            r6.f51368a = r3
            kotlinx.coroutines.at r6 = (kotlinx.coroutines.at) r6
            r1.j(r6)
            return
        L3d:
            r0 = r6
            kotlinx.coroutines.at r0 = (kotlinx.coroutines.at) r0
            r1.k(r3)
            h.c.j r2 = r6.getContext()     // Catch: java.lang.Throwable -> La4
            kotlinx.coroutines.ac r4 = kotlinx.coroutines.br.f51766a     // Catch: java.lang.Throwable -> La4
            h.c.i r4 = (h.c.i) r4     // Catch: java.lang.Throwable -> La4
            h.c.h r2 = r2.get(r4)     // Catch: java.lang.Throwable -> La4
            kotlinx.coroutines.br r2 = (kotlinx.coroutines.br) r2     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L69
            boolean r4 = r2.bZ()     // Catch: java.lang.Throwable -> La4
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r2.n()     // Catch: java.lang.Throwable -> La4
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch: java.lang.Throwable -> La4
            h.c.e r6 = (h.c.e) r6     // Catch: java.lang.Throwable -> La4
            java.lang.Object r7 = e.b.c.a(r7)     // Catch: java.lang.Throwable -> La4
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> La4
            goto L8d
        L69:
            h.c.e r2 = r6.f51901c     // Catch: java.lang.Throwable -> La4
            java.lang.Object r6 = r6.f51903e     // Catch: java.lang.Throwable -> La4
            h.c.j r4 = r2.getContext()     // Catch: java.lang.Throwable -> La4
            java.lang.Object r6 = kotlinx.coroutines.e.ap.b(r4, r6)     // Catch: java.lang.Throwable -> La4
            kotlinx.coroutines.e.ak r5 = kotlinx.coroutines.e.ap.f51872a     // Catch: java.lang.Throwable -> La4
            if (r6 == r5) goto L7e
            kotlinx.coroutines.dj r5 = kotlinx.coroutines.y.c(r2, r4, r6)     // Catch: java.lang.Throwable -> La4
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r2.resumeWith(r7)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r7 = r5.U()     // Catch: java.lang.Throwable -> La4
            if (r7 == 0) goto L8d
        L8a:
            kotlinx.coroutines.e.ap.c(r4, r6)     // Catch: java.lang.Throwable -> La4
        L8d:
            boolean r6 = r1.n()     // Catch: java.lang.Throwable -> La4
            if (r6 != 0) goto L8d
            r1.i(r3)
            return
        L97:
            r7 = move-exception
            if (r5 == 0) goto La0
            boolean r2 = r5.U()     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto La3
        La0:
            kotlinx.coroutines.e.ap.c(r4, r6)     // Catch: java.lang.Throwable -> La4
        La3:
            throw r7     // Catch: java.lang.Throwable -> La4
        La4:
            r6 = move-exception
            r0.D(r6)     // Catch: java.lang.Throwable -> Lac
            r1.i(r3)
            return
        Lac:
            r6 = move-exception
            r1.i(r3)
            throw r6
        Lb1:
            r6.resumeWith(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e.k.b(h.c.e, java.lang.Object):void");
    }

    public static final void c(kotlinx.coroutines.ab abVar, h.c.j jVar, Runnable runnable) {
        try {
            abVar.dispatch(jVar, runnable);
        } catch (Throwable th) {
            throw new kotlinx.coroutines.ar(th, abVar, jVar);
        }
    }

    public static final boolean d(kotlinx.coroutines.ab abVar, h.c.j jVar) throws kotlinx.coroutines.ar {
        try {
            return abVar.isDispatchNeeded(jVar);
        } catch (Throwable th) {
            throw new kotlinx.coroutines.ar(th, abVar, jVar);
        }
    }
}
