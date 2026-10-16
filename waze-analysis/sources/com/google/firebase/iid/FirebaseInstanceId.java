package com.google.firebase.iid;

import android.os.Looper;
import android.util.Log;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.f.aa;
import com.google.android.gms.f.v;
import com.google.android.gms.l.q;
import com.google.android.gms.o.ag;
import com.google.android.gms.o.t;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public class FirebaseInstanceId {

    /* renamed from: a, reason: collision with root package name */
    static ScheduledExecutorService f9918a = null;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9919c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final long f9920d;

    /* renamed from: e, reason: collision with root package name */
    private static n f9921e;

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f9922f;

    /* renamed from: b, reason: collision with root package name */
    final Executor f9923b;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.e f9924g;

    /* renamed from: h, reason: collision with root package name */
    private final g f9925h;

    /* renamed from: i, reason: collision with root package name */
    private final d f9926i;

    /* renamed from: j, reason: collision with root package name */
    private final k f9927j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.installations.d f9928k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9929l = false;
    private final List m = new ArrayList();

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        f9920d = 28800L;
        f9922f = Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    FirebaseInstanceId(com.google.firebase.e eVar, g gVar, Executor executor, Executor executor2, com.google.firebase.g.c cVar, com.google.firebase.g.c cVar2, com.google.firebase.installations.d dVar) {
        if (com.waze.c.c.e.d(eVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (f9921e == null) {
                f9921e = new n(eVar.a());
            }
        }
        this.f9924g = eVar;
        this.f9925h = gVar;
        this.f9926i = new d(eVar, gVar, new aa(eVar.a()), cVar, cVar2, dVar);
        this.f9923b = executor2;
        this.f9927j = new k(executor);
        this.f9928k = dVar;
    }

    public static /* synthetic */ void f(FirebaseInstanceId firebaseInstanceId, m mVar, e eVar) {
        String strA = eVar.a();
        if (mVar == null || !strA.equals(mVar.f9960a)) {
            Iterator it = firebaseInstanceId.m.iterator();
            while (it.hasNext()) {
                ((FirebaseMessaging) ((com.google.firebase.messaging.l) it.next()).f10212a).w(strA);
            }
        }
    }

    public static FirebaseInstanceId getInstance(com.google.firebase.e eVar) {
        v(eVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) eVar.f(FirebaseInstanceId.class);
        av.n(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    static boolean k() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    static final void o(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (f9918a == null) {
                f9918a = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.a.b("FirebaseInstanceId"));
            }
            f9918a.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public static /* synthetic */ t p(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        f9921e.f(firebaseInstanceId.u(), str, str2, firebaseInstanceId.f9925h.c());
        return ag.c(new f(str2));
    }

    public static /* synthetic */ t q(FirebaseInstanceId firebaseInstanceId, String str) throws InterruptedException {
        try {
            f9921e.d(firebaseInstanceId.f9924g.h());
            t tVarA = firebaseInstanceId.f9928k.a();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            tVarA.n(new v(3), new com.google.android.gms.common.api.internal.b(countDownLatch, 3));
            countDownLatch.await(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
            if (tVarA.k()) {
                String str2 = (String) tVarA.g();
                m mVarS = firebaseInstanceId.s(str);
                return !firebaseInstanceId.m(mVarS) ? ag.c(new f(mVarS.f9960a)) : firebaseInstanceId.f9927j.a(str, new b(firebaseInstanceId, str2, str, mVarS));
            }
            if (tVarA.i()) {
                throw new CancellationException("Task is already canceled");
            }
            if (tVarA.j()) {
                throw new IllegalStateException(tVarA.f());
            }
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static /* synthetic */ t r(final FirebaseInstanceId firebaseInstanceId, String str, String str2, final m mVar) {
        t tVarE = firebaseInstanceId.f9926i.a(str, str2).e(firebaseInstanceId.f9923b, new com.google.firebase.remoteconfig.internal.d(firebaseInstanceId, str2, 1));
        tVarE.q(new v(3), new com.google.android.gms.o.o() { // from class: com.google.firebase.iid.c
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) {
                FirebaseInstanceId.f(this.f9935a, mVar, (e) obj);
            }
        });
        return tVarE;
    }

    private final Object t(t tVar) throws IOException {
        try {
            return ag.g(tVar, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    this.g();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        }
    }

    private final String u() {
        com.google.firebase.e eVar = this.f9924g;
        return "[DEFAULT]".equals(eVar.g()) ? "" : eVar.h();
    }

    private static void v(com.google.firebase.e eVar) {
        av.l(eVar.d().e(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        av.l(eVar.d().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        av.l(eVar.d().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        av.d(eVar.d().c().contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        av.d(f9922f.matcher(eVar.d().b()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private final t w(String str) {
        return ag.c(null).c(this.f9923b, new q(this, str, 2));
    }

    @Deprecated
    public final t a() {
        com.google.firebase.e eVar = this.f9924g;
        v(eVar);
        return w(com.waze.c.c.e.d(eVar));
    }

    final com.google.firebase.e b() {
        return this.f9924g;
    }

    final m c() {
        return s(com.waze.c.c.e.d(this.f9924g));
    }

    final String d() throws IOException {
        com.google.firebase.e eVar = this.f9924g;
        String strD = com.waze.c.c.e.d(eVar);
        v(eVar);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((e) t(w(strD))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    @Deprecated
    public final String e() {
        v(this.f9924g);
        m mVarC = c();
        if (m(mVarC)) {
            i();
        }
        int i2 = m.f9958d;
        if (mVarC == null) {
            return null;
        }
        return mVarC.f9960a;
    }

    final synchronized void g() {
        f9921e.a();
    }

    final synchronized void h(boolean z) {
        this.f9929l = z;
    }

    final synchronized void i() {
        if (this.f9929l) {
            return;
        }
        j(0L);
    }

    final synchronized void j(long j2) {
        o(new p(this, Math.min(Math.max(30L, j2 + j2), f9920d)), j2);
        this.f9929l = true;
    }

    public final boolean l() {
        return this.f9925h.b() != 0;
    }

    final boolean m(m mVar) {
        return mVar == null || mVar.b(this.f9925h.c());
    }

    final void n(com.google.firebase.messaging.l lVar) {
        this.m.add(lVar);
    }

    final m s(String str) {
        return f9921e.e(u(), str);
    }
}
