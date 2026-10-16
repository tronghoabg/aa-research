package e.a.h;

import com.google.d.b.an;
import e.a.cm;
import e.a.cq;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f47800a;

    /* renamed from: b, reason: collision with root package name */
    static final e.a.g f47801b;

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f47802c = Logger.getLogger(s.class.getName());

    static {
        boolean z = false;
        if (!an.f(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            z = true;
        }
        f47800a = z;
        f47801b = e.a.g.a("internal-stub-type");
    }

    private s() {
    }

    public static g a(e.a.i iVar, cq cqVar, e.a.h hVar) {
        e.a.k kVarA = iVar.a(cqVar, hVar.e(new p()));
        g gVar = new g();
        kVarA.e(new f(gVar), new cm());
        kVarA.c(1);
        return gVar;
    }

    public static ae b(e.a.k kVar, ae aeVar) {
        an.C(aeVar, "responseObserver");
        k kVar2 = new k(kVar, true);
        h(kVar, new n(aeVar, kVar2));
        return kVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(e.a.i r3, e.a.cq r4, e.a.h r5, java.lang.Object r6) throws java.lang.Throwable {
        /*
            e.a.h.q r0 = new e.a.h.q
            r0.<init>()
            e.a.g r1 = e.a.h.s.f47801b
            e.a.h.o r2 = e.a.h.o.f47788a
            e.a.h r5 = r5.i(r1, r2)
            e.a.h r5 = r5.e(r0)
            e.a.k r3 = r3.a(r4, r5)
            r4 = 0
            e.a.h.l r5 = new e.a.h.l     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.h.r r1 = new e.a.h.r     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            g(r3, r6, r1)     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
        L23:
            boolean r6 = r5.isDone()     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            java.lang.String r1 = "Thread interrupted"
            if (r6 != 0) goto L3f
            r0.b()     // Catch: java.lang.InterruptedException -> L2f java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            goto L23
        L2f:
            r4 = move-exception
            r6 = 1
            r3.a(r1, r4)     // Catch: java.lang.Throwable -> L36 java.lang.Error -> L39 java.lang.RuntimeException -> L3c
            r4 = r6
            goto L23
        L36:
            r3 = move-exception
            goto Lc4
        L39:
            r4 = move-exception
            goto Lbf
        L3c:
            r4 = move-exception
            goto Lbf
        L3f:
            r0.a()     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            java.lang.Object r3 = r5.get()     // Catch: java.util.concurrent.ExecutionException -> L50 java.lang.InterruptedException -> La0 java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            if (r4 == 0) goto L4f
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L4f:
            return r3
        L50:
            r5 = move-exception
            java.lang.Throwable r5 = r5.getCause()     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            java.lang.String r6 = "t"
            com.google.d.b.an.C(r5, r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            r6 = r5
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            r6 = r5
        L5e:
            if (r6 == 0) goto L8d
            boolean r0 = r6 instanceof e.a.ef     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            if (r0 != 0) goto L7d
            boolean r0 = r6 instanceof e.a.eh     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            if (r0 != 0) goto L6d
            java.lang.Throwable r6 = r6.getCause()     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            goto L5e
        L6d:
            e.a.eh r6 = (e.a.eh) r6     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.eh r5 = new e.a.eh     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.ee r0 = r6.b()     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.cm r6 = r6.a()     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            goto L9f
        L7d:
            e.a.ef r6 = (e.a.ef) r6     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.eh r5 = new e.a.eh     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.ee r0 = r6.b()     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.cm r6 = r6.a()     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            goto L9f
        L8d:
            e.a.ee r6 = e.a.ee.f47403c     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            java.lang.String r0 = "unexpected exception"
            e.a.ee r6 = r6.g(r0)     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.ee r5 = r6.f(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.eh r6 = new e.a.eh     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            r5 = r6
        L9f:
            throw r5     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
        La0:
            r5 = move-exception
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            r6.interrupt()     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.ee r6 = e.a.ee.f47402b     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.ee r6 = r6.g(r1)     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.ee r5 = r6.f(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            e.a.eh r6 = new e.a.eh     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
            throw r6     // Catch: java.lang.Throwable -> Lb8 java.lang.Error -> Lba java.lang.RuntimeException -> Lbc
        Lb8:
            r3 = move-exception
            goto Lc5
        Lba:
            r5 = move-exception
            goto Lbd
        Lbc:
            r5 = move-exception
        Lbd:
            r6 = r4
            r4 = r5
        Lbf:
            java.lang.RuntimeException r3 = f(r3, r4)     // Catch: java.lang.Throwable -> L36
            throw r3     // Catch: java.lang.Throwable -> L36
        Lc4:
            r4 = r6
        Lc5:
            if (r4 == 0) goto Lce
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        Lce:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.h.s.c(e.a.i, e.a.cq, e.a.h, java.lang.Object):java.lang.Object");
    }

    public static Iterator d(e.a.i iVar, cq cqVar, e.a.h hVar, Object obj) {
        e.a.k kVarA = iVar.a(cqVar, hVar.i(f47801b, o.f47788a));
        j jVar = new j(kVarA);
        g(kVarA, obj, jVar.b());
        return jVar;
    }

    public static void e(e.a.k kVar, Object obj, ae aeVar) {
        an.C(aeVar, "responseObserver");
        g(kVar, obj, new n(aeVar, new k(kVar, false)));
    }

    private static RuntimeException f(e.a.k kVar, Throwable th) {
        try {
            kVar.a(null, th);
        } catch (Error | RuntimeException e2) {
            f47802c.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    private static void g(e.a.k kVar, Object obj, m mVar) {
        h(kVar, mVar);
        try {
            kVar.d(obj);
            kVar.b();
        } catch (Error | RuntimeException e2) {
            throw f(kVar, e2);
        }
    }

    private static void h(e.a.k kVar, m mVar) {
        kVar.e(mVar, new cm());
        mVar.c();
    }
}
