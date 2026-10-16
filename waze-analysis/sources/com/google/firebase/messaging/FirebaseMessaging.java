package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FirebaseMessaging {

    /* renamed from: a, reason: collision with root package name */
    static com.google.firebase.g.c f10056a = null;

    /* renamed from: b, reason: collision with root package name */
    static ScheduledExecutorService f10057b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10058c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final long f10059d;

    /* renamed from: e, reason: collision with root package name */
    private static ah f10060e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.e f10061f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.iid.a.a f10062g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f10063h;

    /* renamed from: i, reason: collision with root package name */
    private final s f10064i;

    /* renamed from: j, reason: collision with root package name */
    private final ab f10065j;

    /* renamed from: k, reason: collision with root package name */
    private final q f10066k;

    /* renamed from: l, reason: collision with root package name */
    private final Executor f10067l;
    private final Executor m;
    private final com.google.android.gms.o.t n;
    private final u o;
    private boolean p = false;
    private final Application.ActivityLifecycleCallbacks q;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        f10059d = 28800L;
        f10056a = new com.google.firebase.components.aa(2);
    }

    FirebaseMessaging(com.google.firebase.e eVar, com.google.firebase.iid.a.a aVar, com.google.firebase.g.c cVar, com.google.firebase.e.c cVar2, final u uVar, final s sVar, Executor executor, Executor executor2, Executor executor3) {
        f10056a = cVar;
        this.f10061f = eVar;
        this.f10062g = aVar;
        this.f10066k = new q(this, cVar2);
        final Context contextA = eVar.a();
        this.f10063h = contextA;
        j jVar = new j();
        this.q = jVar;
        this.o = uVar;
        this.f10064i = sVar;
        this.f10065j = new ab(executor);
        this.f10067l = executor2;
        this.m = executor3;
        Context contextA2 = eVar.a();
        if (contextA2 instanceof Application) {
            ((Application) contextA2).registerActivityLifecycleCallbacks(jVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextA2.toString() + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.b(new l(this));
        }
        executor2.execute(new android.support.v7.app.p(this, 8));
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.a.b("Firebase-Messaging-Topics-Io"));
        int i2 = an.f10155a;
        com.google.android.gms.o.t tVarA = com.google.android.gms.o.ag.a(scheduledThreadPoolExecutor, new Callable() { // from class: com.google.firebase.messaging.am
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return an.a(contextA, scheduledThreadPoolExecutor, this, uVar, sVar);
            }
        });
        this.n = tVarA;
        tVarA.q(executor2, new n(this, 1));
        executor2.execute(new android.support.v7.app.p(this, 9));
    }

    public static /* synthetic */ com.google.android.gms.o.t b(FirebaseMessaging firebaseMessaging, String str, ag agVar, String str2) {
        t(firebaseMessaging.f10063h).c(firebaseMessaging.u(), str, str2, firebaseMessaging.o.c());
        if (agVar == null || !str2.equals(agVar.f10132a)) {
            firebaseMessaging.w(str2);
        }
        return com.google.android.gms.o.ag.c(str2);
    }

    public static synchronized FirebaseMessaging f() {
        return getInstance(com.google.firebase.e.b());
    }

    static synchronized FirebaseMessaging getInstance(com.google.firebase.e eVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) eVar.f(FirebaseMessaging.class);
        com.google.android.gms.common.api.internal.av.n(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static /* synthetic */ void i(FirebaseMessaging firebaseMessaging, com.google.android.gms.f.a aVar) {
        if (aVar != null) {
            y.m(aVar.a());
            firebaseMessaging.v();
        }
    }

    public static /* synthetic */ void k(FirebaseMessaging firebaseMessaging) {
        Context context = firebaseMessaging.f10063h;
        y.e(context);
        y.a(context, firebaseMessaging.f10064i, firebaseMessaging.z());
        if (firebaseMessaging.z()) {
            firebaseMessaging.v();
        }
    }

    public static /* synthetic */ void l(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.p()) {
            firebaseMessaging.y();
        }
    }

    static final void s(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (f10057b == null) {
                f10057b = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.a.b("TAG"));
            }
            f10057b.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    private static synchronized ah t(Context context) {
        ah ahVar;
        ahVar = f10060e;
        if (ahVar == null) {
            ahVar = new ah(context);
            f10060e = ahVar;
        }
        return ahVar;
    }

    private final String u() {
        com.google.firebase.e eVar = this.f10061f;
        return "[DEFAULT]".equals(eVar.g()) ? "" : eVar.h();
    }

    private final void v() {
        this.f10064i.a().q(this.f10067l, new n(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(String str) {
        com.google.firebase.e eVar = this.f10061f;
        if ("[DEFAULT]".equals(eVar.g())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: ".concat(String.valueOf(eVar.g())));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            i.b(intent, this.f10063h, new com.google.android.gms.f.v(5));
        }
    }

    private final synchronized void x() {
        if (this.p) {
            return;
        }
        o(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        com.google.firebase.iid.a.a aVar = this.f10062g;
        if (aVar != null) {
            aVar.c();
        } else if (r(g())) {
            x();
        }
    }

    private final boolean z() {
        Context context = this.f10063h;
        y.e(context);
        if (!y.g(context)) {
            return false;
        }
        if (this.f10061f.f(com.google.firebase.a.a.c.class) != null) {
            return true;
        }
        return y.o() && f10056a != null;
    }

    final Context a() {
        return this.f10063h;
    }

    public final com.google.android.gms.o.t d() {
        com.google.firebase.iid.a.a aVar = this.f10062g;
        if (aVar != null) {
            return aVar.a();
        }
        com.google.android.gms.o.w wVar = new com.google.android.gms.o.w();
        this.f10067l.execute(new m(this, wVar, 0));
        return wVar.a();
    }

    final ag g() {
        return t(this.f10063h).a(u(), com.waze.c.c.e.d(this.f10061f));
    }

    final String h() throws IOException {
        com.google.firebase.iid.a.a aVar = this.f10062g;
        if (aVar != null) {
            try {
                return (String) com.google.android.gms.o.ag.f(aVar.a());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
        ag agVarG = g();
        if (!r(agVarG)) {
            return agVarG.f10132a;
        }
        com.google.firebase.e eVar = this.f10061f;
        ab abVar = this.f10065j;
        String strD = com.waze.c.c.e.d(eVar);
        try {
            return (String) com.google.android.gms.o.ag.f(abVar.a(strD, new o(this, strD, agVarG)));
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    final synchronized void n(boolean z) {
        this.p = z;
    }

    final synchronized void o(long j2) {
        s(new aj(this, Math.min(Math.max(30L, j2 + j2), f10059d)), j2);
        this.p = true;
    }

    public final boolean p() {
        return this.f10066k.b();
    }

    final boolean q() {
        return this.o.e();
    }

    final boolean r(ag agVar) {
        return agVar == null || agVar.b(this.o.c());
    }
}
