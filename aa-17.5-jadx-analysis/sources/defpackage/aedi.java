package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class aedi {
    static final boolean a;
    public static final adiv b;
    private static final Logger c = Logger.getLogger(aedi.class.getName());

    static {
        boolean z = false;
        if (!woy.am(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            z = true;
        }
        a = z;
        b = new adiv("internal-stub-type", null);
    }

    private aedi() {
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(defpackage.adix r3, defpackage.admf r4, defpackage.adiw r5, java.lang.Object r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aedi.a(adix, admf, adiw, java.lang.Object):java.lang.Object");
    }

    public static zgp b(adqq adqqVar, Object obj) {
        aedc aedcVar = new aedc(adqqVar);
        f(adqqVar, obj, new aedh(aedcVar));
        return aedcVar;
    }

    public static aedp c(adqq adqqVar, aedp aedpVar, boolean z) {
        aedb aedbVar = new aedb(adqqVar, z);
        g(adqqVar, new aede(aedpVar, aedbVar));
        return aedbVar;
    }

    public static void d(adqq adqqVar, Object obj, aedp aedpVar) {
        aedpVar.getClass();
        f(adqqVar, obj, new aede(aedpVar, new aedb(adqqVar, false)));
    }

    private static RuntimeException e(adqq adqqVar, Throwable th) {
        try {
            adqqVar.i(null, th);
        } catch (Error | RuntimeException e) {
            c.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    private static void f(adqq adqqVar, Object obj, aedd aeddVar) {
        g(adqqVar, aeddVar);
        try {
            adqqVar.n(obj);
            adqqVar.j();
        } catch (Error | RuntimeException e) {
            throw e(adqqVar, e);
        }
    }

    private static void g(adqq adqqVar, aedd aeddVar) {
        adqqVar.b(aeddVar, new admc());
        aeddVar.k();
    }
}
