package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class wae {
    public final Context c;
    public final xyc d;
    public final xyc e;
    public final wdq f;
    public final xyc g;
    public final wdb h;
    public final wci i = new wci();
    private final xyc m;
    private final xyc n;
    private static final Object j = new Object();
    public static final AtomicReference a = new AtomicReference();
    private static volatile wae k = null;
    private static volatile wae l = null;
    public static final xyc b = wub.L(new rhy(12));

    public interface a {
        xxh b();
    }

    public wae(Context context, xyc xycVar, xyc xycVar2, xyc xycVar3, xyc xycVar4, xyc xycVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        xycVar.getClass();
        xycVar2.getClass();
        xycVar3.getClass();
        xycVar4.getClass();
        xycVar5.getClass();
        xyc xycVarL = wub.L(xycVar);
        xyc xycVarL2 = wub.L(xycVar2);
        xyc xycVarL3 = wub.L(new vks(xycVar3, 12));
        xyc xycVarL4 = wub.L(xycVar4);
        xyc xycVarL5 = wub.L(xycVar5);
        this.c = applicationContext;
        this.m = xycVarL;
        this.n = xycVarL2;
        this.d = xycVarL3;
        this.e = xycVarL4;
        this.f = new wdq(applicationContext, xycVarL, xycVarL2);
        this.g = xycVarL5;
        this.h = new wdb(applicationContext, xycVarL, xycVarL3, xycVarL2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static wae a(Context context) {
        boolean z;
        Object obj;
        wae waeVar = k;
        if (waeVar != null) {
            return waeVar;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            applicationContext.getClass();
            Context applicationContext2 = applicationContext.getApplicationContext();
            if (!(applicationContext2 instanceof Application)) {
                Context baseContext = applicationContext2;
                while (baseContext instanceof ContextWrapper) {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    if (baseContext instanceof Application) {
                        obj = (Application) baseContext;
                    }
                }
                throw new IllegalStateException("Could not find an Application in the given context: ".concat(String.valueOf(String.valueOf(applicationContext2))));
            }
            obj = (Application) applicationContext2;
            obj.getClass();
            if (!(obj instanceof ackm)) {
                Class<?> cls = obj.getClass();
                Objects.toString(cls);
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            }
            try {
                Object objCast = a.class.cast(((ackm) obj).a());
                objCast.getClass();
                try {
                    return (wae) ((xxm) ((a) objCast).b()).a;
                } catch (IllegalStateException unused) {
                    z = true;
                    synchronized (j) {
                        if (k != null) {
                            return k;
                        }
                        xxh xxhVarB = xvy.a;
                        boolean z2 = applicationContext instanceof a;
                        if (z2) {
                            xxhVarB = ((a) applicationContext).b();
                        }
                        wae waeVar2 = (wae) xxhVarB.c(new vks(applicationContext, 9));
                        k = waeVar2;
                        if (!z && !z2) {
                            woy.aG(Level.CONFIG, waeVar2.b(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        return waeVar2;
                    }
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
            }
        } catch (IllegalStateException unused2) {
            z = false;
        }
    }

    public static void c(Context context) {
        Context applicationContext;
        if (a.get() != null) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
        } catch (NullPointerException unused) {
            if (d()) {
                woy.aG(Level.INFO, (Executor) b.gu(), null, "context.getApplicationContext() yielded NullPointerException in test mode", new Object[0]);
            } else {
                woy.aG(Level.WARNING, (Executor) b.gu(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
            }
            applicationContext = null;
        }
        if (applicationContext != null) {
            defpackage.a.p(a, applicationContext);
        }
    }

    public static boolean d() {
        boolean z;
        synchronized (wag.a) {
            z = wag.b;
        }
        if (a.get() != null || z || wag.d != null) {
            return z;
        }
        wag.d = new waf();
        return false;
    }

    public final zgt b() {
        return (zgt) this.m.gu();
    }

    public final six e() {
        return (six) this.n.gu();
    }
}
