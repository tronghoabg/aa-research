package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wba {
    public final android.content.Context c;
    public final defpackage.xzi d;
    public final defpackage.xzi e;
    public final defpackage.wem f;
    public final defpackage.xzi g;
    public final defpackage.wdx h;
    public final defpackage.wde i = new defpackage.wde();
    private final defpackage.xzi m;
    private final defpackage.xzi n;
    private static final java.lang.Object j = new java.lang.Object();
    public static final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference();
    private static volatile defpackage.wba k = null;
    private static volatile defpackage.wba l = null;
    public static final defpackage.xzi b = defpackage.ysr.aQ(new defpackage.riu(11));

    public interface a {
        defpackage.xyn b();
    }

    public wba(android.content.Context context, defpackage.xzi xziVar, defpackage.xzi xziVar2, defpackage.xzi xziVar3, defpackage.xzi xziVar4, defpackage.xzi xziVar5) {
        android.content.Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        xziVar.getClass();
        xziVar2.getClass();
        xziVar3.getClass();
        xziVar4.getClass();
        xziVar5.getClass();
        defpackage.xzi xziVarAQ = defpackage.ysr.aQ(xziVar);
        defpackage.xzi xziVarAQ2 = defpackage.ysr.aQ(xziVar2);
        defpackage.xzi xziVarAQ3 = defpackage.ysr.aQ(new defpackage.ryo(xziVar3, 13));
        defpackage.xzi xziVarAQ4 = defpackage.ysr.aQ(xziVar4);
        defpackage.xzi xziVarAQ5 = defpackage.ysr.aQ(xziVar5);
        this.c = applicationContext;
        this.m = xziVarAQ;
        this.n = xziVarAQ2;
        this.d = xziVarAQ3;
        this.e = xziVarAQ4;
        this.f = new defpackage.wem(applicationContext, xziVarAQ, xziVarAQ2);
        this.g = xziVarAQ5;
        this.h = new defpackage.wdx(applicationContext, xziVarAQ, xziVarAQ3, xziVarAQ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.wba a(android.content.Context context) {
        boolean z;
        java.lang.Object obj;
        defpackage.wba wbaVar = k;
        if (wbaVar != null) {
            return wbaVar;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        try {
            applicationContext.getClass();
            android.content.Context applicationContext2 = applicationContext.getApplicationContext();
            if (applicationContext2 instanceof android.app.Application) {
                obj = (android.app.Application) applicationContext2;
            } else {
                android.content.Context baseContext = applicationContext2;
                do {
                    if (!(baseContext instanceof android.content.ContextWrapper)) {
                        throw new java.lang.IllegalStateException("Could not find an Application in the given context: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(applicationContext2))));
                    }
                    baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext();
                } while (!(baseContext instanceof android.app.Application));
                obj = (android.app.Application) baseContext;
            }
            obj.getClass();
            if (!(obj instanceof defpackage.aclo)) {
                java.lang.Class<?> cls = obj.getClass();
                java.util.Objects.toString(cls);
                throw new java.lang.IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(java.lang.String.valueOf(cls)));
            }
            try {
                java.lang.Object objCast = wba.a.class.cast(((defpackage.aclo) obj).a());
                objCast.getClass();
                try {
                    return (defpackage.wba) ((defpackage.xys) ((wba.a) objCast).b()).a;
                } catch (java.lang.IllegalStateException unused) {
                    z = true;
                }
            } catch (java.lang.ClassCastException e) {
                throw new java.lang.IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
            }
        } catch (java.lang.IllegalStateException unused2) {
            z = false;
        }
        synchronized (j) {
            if (k != null) {
                return k;
            }
            defpackage.xyn xynVarB = defpackage.xxe.a;
            boolean z2 = applicationContext instanceof wba.a;
            if (z2) {
                xynVarB = ((wba.a) applicationContext).b();
            }
            defpackage.wba wbaVar2 = (defpackage.wba) xynVarB.c(new defpackage.ryo(applicationContext, 10));
            k = wbaVar2;
            if (!z && !z2) {
                defpackage.sqs.bL(java.util.logging.Level.CONFIG, wbaVar2.b(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new java.lang.Object[0]);
            }
            return wbaVar2;
        }
    }

    public static void c(android.content.Context context) {
        android.content.Context applicationContext;
        if (a.get() != null) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
        } catch (java.lang.NullPointerException unused) {
            if (d()) {
                defpackage.sqs.bL(java.util.logging.Level.INFO, (java.util.concurrent.Executor) b.fF(), null, "context.getApplicationContext() yielded NullPointerException in test mode", new java.lang.Object[0]);
            } else {
                defpackage.sqs.bL(java.util.logging.Level.WARNING, (java.util.concurrent.Executor) b.fF(), null, "context.getApplicationContext() yielded NullPointerException", new java.lang.Object[0]);
            }
            applicationContext = null;
        }
        if (applicationContext != null) {
            defpackage.a.o(a, applicationContext);
        }
    }

    public static boolean d() {
        boolean z;
        synchronized (defpackage.wbc.a) {
            z = defpackage.wbc.b;
        }
        if (a.get() != null || z || defpackage.wbc.d != null) {
            return z;
        }
        defpackage.wbc.d = new defpackage.wbb();
        return false;
    }

    public final defpackage.zhw b() {
        return (defpackage.zhw) this.m.fF();
    }

    public final defpackage.roy e() {
        return (defpackage.roy) this.n.fF();
    }
}
