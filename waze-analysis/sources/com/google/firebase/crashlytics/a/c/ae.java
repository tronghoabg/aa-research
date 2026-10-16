package com.google.firebase.crashlytics.a.c;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.crashlytics.a.b.a f9091a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f9092b;

    /* renamed from: c, reason: collision with root package name */
    private final aj f9093c;

    /* renamed from: e, reason: collision with root package name */
    private af f9095e;

    /* renamed from: f, reason: collision with root package name */
    private af f9096f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9097g;

    /* renamed from: h, reason: collision with root package name */
    private aa f9098h;

    /* renamed from: i, reason: collision with root package name */
    private final aq f9099i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.f.c f9100j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.a.a f9101k;

    /* renamed from: l, reason: collision with root package name */
    private final ExecutorService f9102l;
    private final n m;
    private final j n;
    private final com.google.firebase.crashlytics.a.a o;
    private final com.google.android.play.core.a.r p;

    /* renamed from: d, reason: collision with root package name */
    private final long f9094d = System.currentTimeMillis();
    private final com.google.e.a.b.a.a q = new com.google.e.a.b.a.a(null);

    public ae(com.google.firebase.e eVar, aq aqVar, com.google.firebase.crashlytics.a.a aVar, aj ajVar, com.google.firebase.crashlytics.a.b.a aVar2, com.google.firebase.crashlytics.a.a.a aVar3, com.google.firebase.crashlytics.a.f.c cVar, ExecutorService executorService, j jVar, com.google.android.play.core.a.r rVar) {
        this.f9093c = ajVar;
        this.f9092b = eVar.a();
        this.f9099i = aqVar;
        this.o = aVar;
        this.f9091a = aVar2;
        this.f9101k = aVar3;
        this.f9102l = executorService;
        this.f9100j = cVar;
        this.m = new n(executorService);
        this.n = jVar;
        this.p = rVar;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.o.t k(ae aeVar, com.google.firebase.crashlytics.a.h.f fVar) throws IOException {
        com.google.android.gms.o.t tVarB;
        aeVar.m.e();
        aeVar.f9095e.c();
        com.google.firebase.crashlytics.a.i.a().g("Initialization marker file was created.");
        try {
            try {
                aeVar.f9091a.a(new com.google.firebase.crashlytics.h());
                aeVar.f9098h.o();
                if (fVar.c().f9741b.f9736a) {
                    if (!aeVar.f9098h.x(fVar)) {
                        com.google.firebase.crashlytics.a.i.a().h("Previous sessions could not be finalized.");
                    }
                    tVarB = aeVar.f9098h.c(fVar.a());
                } else {
                    com.google.firebase.crashlytics.a.i.a().b("Collection of crash reports disabled in Crashlytics settings.");
                    tVarB = com.google.android.gms.o.ag.b(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                }
            } catch (Exception e2) {
                com.google.firebase.crashlytics.a.i.a().e("Crashlytics encountered a problem during asynchronous initialization.", e2);
                tVarB = com.google.android.gms.o.ag.b(e2);
            }
            return tVarB;
        } finally {
            aeVar.f();
        }
    }

    private final void q(com.google.firebase.crashlytics.a.h.f fVar) throws ExecutionException, InterruptedException, TimeoutException {
        Future<?> futureSubmit = this.f9102l.submit(new ac(this, fVar));
        com.google.firebase.crashlytics.a.i.a().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            com.google.firebase.crashlytics.a.i.a().e("Crashlytics was interrupted during initialization.", e2);
        } catch (ExecutionException e3) {
            com.google.firebase.crashlytics.a.i.a().e("Crashlytics encountered a problem during initialization.", e3);
        } catch (TimeoutException e4) {
            com.google.firebase.crashlytics.a.i.a().e("Crashlytics timed out during initialization.", e4);
        }
    }

    public final com.google.android.gms.o.t a() {
        aa aaVar = this.f9098h;
        if (aaVar.f9078e.compareAndSet(false, true)) {
            return aaVar.f9075b.a();
        }
        com.google.firebase.crashlytics.a.i.a().h("checkForUnsentReports should only be called once per execution.");
        return com.google.android.gms.o.ag.c(false);
    }

    public final void d(String str) {
        this.f9098h.s(System.currentTimeMillis() - this.f9094d, str);
    }

    public final void e(Throwable th) {
        this.f9098h.r(Thread.currentThread(), th);
    }

    final void f() {
        this.m.a(new ad(this, 0));
    }

    public final void g(Boolean bool) {
        this.f9093c.d(bool);
    }

    public final void h(String str, String str2) {
        this.f9098h.p(str, str2);
    }

    public final void i(String str) {
        this.f9098h.q(str);
    }

    public final boolean j() {
        return this.f9097g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    public final boolean l(a aVar, com.google.firebase.crashlytics.a.h.f fVar) throws Resources.NotFoundException {
        a aVar2;
        boolean z;
        aa aaVar;
        boolean z2;
        NetworkInfo activeNetworkInfo;
        int i2 = g.f9183a;
        Context context = this.f9092b;
        Resources resources = context.getResources();
        if (resources == null) {
            aVar2 = aVar;
            z = true;
        } else {
            int iB = g.b(context, "com.crashlytics.RequireBuildId", "bool");
            if (iB > 0) {
                z = resources.getBoolean(iB);
            } else {
                int iB2 = g.b(context, "com.crashlytics.RequireBuildId", TypedValues.Custom.S_STRING);
                if (iB2 > 0) {
                    z = Boolean.parseBoolean(context.getString(iB2));
                }
                aVar2 = aVar;
                z = true;
            }
            aVar2 = aVar;
        }
        String str = aVar2.f9066b;
        if (!z) {
            com.google.firebase.crashlytics.a.i.a().g("Configured not to require a build ID.");
        } else if (TextUtils.isEmpty(str)) {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        aq aqVar = this.f9099i;
        String string = new e(aqVar).toString();
        try {
            com.google.firebase.crashlytics.a.f.c cVar = this.f9100j;
            this.f9096f = new af("crash_marker", cVar);
            this.f9095e = new af("initialization_marker", cVar);
            n nVar = this.m;
            com.google.firebase.crashlytics.a.d.t tVar = new com.google.firebase.crashlytics.a.d.t(string, cVar, nVar);
            com.google.firebase.crashlytics.a.d.f fVar2 = new com.google.firebase.crashlytics.a.d.f(cVar);
            com.google.firebase.crashlytics.a.i.a aVar3 = new com.google.firebase.crashlytics.a.i.a(new com.google.firebase.crashlytics.a.i.b(0));
            this.p.b(tVar);
            j jVar = this.n;
            ag agVar = new ag(context, aqVar, aVar2, aVar3, fVar);
            z2 = 0;
            try {
                try {
                    try {
                    } catch (Exception e2) {
                        e = e2;
                        z2 = 0;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                aaVar = null;
            }
            try {
                try {
                    try {
                        this.f9098h = new aa(context, nVar, aqVar, this.f9093c, cVar, this.f9096f, aVar, tVar, fVar2, new av(agVar, new com.google.firebase.crashlytics.a.f.a(cVar, fVar, jVar), com.google.firebase.crashlytics.a.g.b.c(context, fVar), fVar2, tVar, aqVar), this.o, this.f9101k, jVar);
                        boolean zA = this.f9095e.a();
                        z2 = 2;
                        z2 = 2;
                        aaVar = null;
                        try {
                            try {
                                try {
                                    this.f9097g = Boolean.TRUE.equals((Boolean) ay.a(nVar.a(new ad(this, 2, (byte[]) null))));
                                    z2 = 0;
                                } catch (Exception e5) {
                                    e = e5;
                                    com.google.firebase.crashlytics.a.i.a().e("Crashlytics was not started due to an exception during initialization", e);
                                    this.f9098h = aaVar;
                                    return z2;
                                }
                            } catch (Exception unused) {
                                z2 = 0;
                                this.f9097g = false;
                            }
                            this.f9098h.w(string, Thread.getDefaultUncaughtExceptionHandler(), fVar);
                            if (zA) {
                                Context context2 = this.f9092b;
                                if (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting())) {
                                    com.google.firebase.crashlytics.a.i.a().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                                    q(fVar);
                                    return z2;
                                }
                            }
                            com.google.firebase.crashlytics.a.i.a().b("Successfully configured exception handler.");
                            return true;
                        } catch (Exception e6) {
                            e = e6;
                            z2 = 0;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        z2 = 0;
                        aaVar = null;
                    }
                } catch (Exception e8) {
                    e = e8;
                    aaVar = null;
                    z2 = 0;
                }
            } catch (Exception e9) {
                e = e9;
                z2 = 0;
                aaVar = null;
                com.google.firebase.crashlytics.a.i.a().e("Crashlytics was not started due to an exception during initialization", e);
                this.f9098h = aaVar;
                return z2;
            }
        } catch (Exception e10) {
            e = e10;
            aaVar = null;
            z2 = 0;
        }
    }

    public final void m() {
        aa aaVar = this.f9098h;
        aaVar.f9076c.e(false);
        com.google.android.gms.o.w wVar = aaVar.f9077d;
    }

    public final void n(com.google.firebase.crashlytics.a.h.f fVar) {
        final ab abVar = new ab(this, fVar);
        int i2 = ay.f9162a;
        final com.google.android.gms.o.w wVar = new com.google.android.gms.o.w();
        final ExecutorService executorService = this.f9102l;
        executorService.execute(new Runnable() { // from class: com.google.firebase.crashlytics.a.c.ax
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = ay.f9162a;
                Callable callable = abVar;
                Executor executor = executorService;
                com.google.android.gms.o.w wVar2 = wVar;
                try {
                    com.google.android.gms.o.t tVarA = ((ab) callable).a();
                    com.google.android.gms.o.t tVar = tVarA;
                    tVarA.b(executor, new aw(wVar2, 0));
                } catch (Exception e2) {
                    wVar2.b(e2);
                }
            }
        });
    }

    public final void o() {
        aa aaVar = this.f9098h;
        aaVar.f9076c.e(true);
        com.google.android.gms.o.w wVar = aaVar.f9077d;
    }

    public final void p() {
        this.f9098h.z();
    }
}
