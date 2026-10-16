package com.google.android.libraries.phenotype.client;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.libraries.phenotype.client.stable.ai;
import com.google.android.libraries.phenotype.client.stable.ar;
import com.google.android.libraries.phenotype.client.stable.bh;
import com.google.d.b.aa;
import com.google.d.b.aj;
import com.google.d.b.an;
import com.google.d.m.a.bo;
import h.g.b.x;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6000a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f6001b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference f6002c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private static volatile h f6003d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile h f6004e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final aj f6005f = an.a(new d(0));

    /* renamed from: g, reason: collision with root package name */
    private final Context f6006g;

    /* renamed from: h, reason: collision with root package name */
    private final aj f6007h;

    /* renamed from: i, reason: collision with root package name */
    private final aj f6008i;

    /* renamed from: j, reason: collision with root package name */
    private final aj f6009j;

    /* renamed from: k, reason: collision with root package name */
    private final aj f6010k;

    /* renamed from: l, reason: collision with root package name */
    private final bh f6011l;
    private final aj m;
    private final ai n;
    private final com.google.android.libraries.phenotype.client.stable.j o = new com.google.android.libraries.phenotype.client.stable.j();

    /* synthetic */ h(Context context, aj ajVar, aj ajVar2, aj ajVar3, aj ajVar4, aj ajVar5) {
        Context applicationContext = context.getApplicationContext();
        an.B(applicationContext);
        an.B(ajVar);
        an.B(ajVar2);
        an.B(ajVar3);
        an.B(ajVar4);
        an.B(ajVar5);
        aj ajVarA = an.a(ajVar);
        aj ajVarA2 = an.a(ajVar2);
        aj ajVarA3 = an.a(new e(ajVar3, 3));
        aj ajVarA4 = an.a(ajVar4);
        aj ajVarA5 = an.a(ajVar5);
        this.f6006g = applicationContext;
        this.f6007h = ajVarA;
        this.f6008i = ajVarA2;
        this.f6009j = ajVarA3;
        this.f6010k = ajVarA4;
        this.f6011l = new bh(applicationContext, ajVarA, ajVarA2);
        this.m = ajVarA5;
        this.n = new ai(applicationContext, ajVarA, ajVarA3, ajVarA2);
    }

    public static h b() {
        j.a();
        j.b();
        Context context = (Context) f6002c.get();
        if (context != null) {
            return c(context);
        }
        j.d();
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h c(Context context) {
        boolean z;
        Application application;
        Application application2;
        h hVar = f6003d;
        if (hVar != null) {
            return hVar;
        }
        Context applicationContext = context.getApplicationContext();
        int i2 = 1;
        try {
            x.f(applicationContext, "context");
            x.f(g.class, "singletonEntryPoint");
            Context applicationContext2 = applicationContext.getApplicationContext();
            if (!(applicationContext2 instanceof Application)) {
                Context baseContext = applicationContext2;
                while (baseContext instanceof ContextWrapper) {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    if (baseContext instanceof Application) {
                        application = (Application) baseContext;
                    }
                }
                throw new IllegalStateException("Could not find an Application in the given context: ".concat(String.valueOf(String.valueOf(applicationContext2))));
            }
            application = (Application) applicationContext2;
            x.e(application, "getApplication(...)");
            application2 = application;
        } catch (IllegalStateException unused) {
            z = false;
        }
        if (!(application2 instanceof c.a.a.a)) {
            Class<?> cls = application2.getClass();
            Objects.toString(cls);
            throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
        }
        try {
            Object objCast = g.class.cast(((c.a.a.a) application2).a());
            x.c(objCast);
            aa aaVarA = ((g) objCast).a();
            try {
                if (aaVarA.f()) {
                    return (h) aaVarA.b();
                }
            } catch (IllegalStateException unused2) {
            }
            z = true;
            synchronized (f6001b) {
                if (f6003d != null) {
                    return f6003d;
                }
                aa aaVarG = aa.g();
                boolean z2 = applicationContext instanceof g;
                if (z2) {
                    aaVarG = ((g) applicationContext).a();
                }
                h hVar2 = (h) aaVarG.c(new e(applicationContext, i2));
                f6003d = hVar2;
                if (!z && !z2) {
                    com.google.android.libraries.b.c.b(Level.CONFIG, hVar2.j(), "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                }
                return hVar2;
            }
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e2);
        }
    }

    public static void l() {
        j.d();
        if (f6002c.get() == null) {
            j.c();
        }
    }

    public final Context a() {
        return this.f6006g;
    }

    public final ai d() {
        return this.n;
    }

    public final ar e() {
        return (ar) this.f6009j.get();
    }

    public final bh f() {
        return this.f6011l;
    }

    public final com.google.android.libraries.e.a.f g() {
        return (com.google.android.libraries.e.a.f) this.f6010k.get();
    }

    public final aa h() {
        return (aa) this.m.get();
    }

    public final bo j() {
        return (bo) this.f6007h.get();
    }

    public final com.google.android.libraries.phenotype.client.stable.j k() {
        return this.o;
    }

    public final com.bumptech.glide.load.c.e.e m() {
        return (com.bumptech.glide.load.c.e.e) this.f6008i.get();
    }
}
