package ud;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import md.AbstractC3538f;
import md.b0;
import md.k0;
import md.l0;
import md.m0;
import ta.l;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f46782a = Logger.getLogger(e.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f46783b;

    /* renamed from: c, reason: collision with root package name */
    public static final B8.e f46784c;

    static {
        f46783b = !Fe.c.D(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f46784c = new B8.e("internal-stub-type", 4);
    }

    public static void a(AbstractC3538f abstractC3538f, Throwable th) {
        try {
            abstractC3538f.a(null, th);
        } catch (Error | RuntimeException e7) {
            f46782a.log(Level.SEVERE, "RuntimeException encountered while closing call", e7);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }

    public static a b(AbstractC3538f abstractC3538f, l lVar) {
        a aVar = new a(abstractC3538f);
        abstractC3538f.e(new d(aVar), new b0());
        abstractC3538f.c(2);
        try {
            abstractC3538f.d(lVar);
            abstractC3538f.b();
            return aVar;
        } catch (Error | RuntimeException e7) {
            a(abstractC3538f, e7);
            throw null;
        }
    }

    public static Object c(a aVar) {
        try {
            return aVar.get();
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            throw k0.f40675f.h("Thread interrupted").g(e7).a();
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            Fe.e.t(cause, "t");
            for (Throwable cause2 = cause; cause2 != null; cause2 = cause2.getCause()) {
                if (cause2 instanceof l0) {
                    throw new m0(((l0) cause2).f40690a, null);
                }
                if (cause2 instanceof m0) {
                    m0 m0Var = (m0) cause2;
                    throw new m0(m0Var.f40698a, m0Var.f40699b);
                }
            }
            throw k0.f40676g.h("unexpected exception").g(cause).a();
        }
    }
}
