package com.google.firebase.messaging;

import A.e0;
import A5.h;
import A7.C0241c1;
import C6.l;
import J9.C0649h;
import L8.n;
import M.y;
import O9.b;
import P9.d;
import W9.A;
import W9.i;
import W9.k;
import W9.o;
import W9.t;
import W9.v;
import W9.w;
import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import c7.C1566b;
import c7.C1568d;
import c7.C1575k;
import c7.C1576l;
import c7.ExecutorC1572h;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import ff.AbstractC2641B;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l9.InterfaceC3448d;
import p7.AbstractC3772b;
import r7.AbstractC3935e;
import s8.g;
import x.C4412e;

/* loaded from: classes4.dex */
public class FirebaseMessaging {

    /* renamed from: l, reason: collision with root package name */
    public static e0 f27357l;

    /* renamed from: n, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f27359n;

    /* renamed from: a, reason: collision with root package name */
    public final g f27360a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f27361b;

    /* renamed from: c, reason: collision with root package name */
    public final l f27362c;

    /* renamed from: d, reason: collision with root package name */
    public final i f27363d;

    /* renamed from: e, reason: collision with root package name */
    public final y f27364e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f27365f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f27366g;

    /* renamed from: h, reason: collision with root package name */
    public final Task f27367h;

    /* renamed from: i, reason: collision with root package name */
    public final o f27368i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27369j;
    public static final long k = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: m, reason: collision with root package name */
    public static b f27358m = new L8.g(6);

    public FirebaseMessaging(g gVar, b bVar, b bVar2, d dVar, b bVar3, InterfaceC3448d interfaceC3448d) {
        final int i5 = 1;
        final int i10 = 0;
        gVar.a();
        Context context = gVar.f45328a;
        final o oVar = new o();
        oVar.f15358b = 0;
        oVar.f15359c = context;
        final l lVar = new l(gVar, oVar, bVar, bVar2, dVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new H6.b("Firebase-Messaging-Task", 2));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new H6.b("Firebase-Messaging-Init", 2));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new H6.b("Firebase-Messaging-File-Io", 2));
        this.f27369j = false;
        f27358m = bVar3;
        this.f27360a = gVar;
        y yVar = new y();
        yVar.f7230e = this;
        yVar.f7227b = interfaceC3448d;
        this.f27364e = yVar;
        gVar.a();
        final Context context2 = gVar.f45328a;
        this.f27361b = context2;
        C0241c1 c0241c1 = new C0241c1();
        this.f27368i = oVar;
        this.f27362c = lVar;
        this.f27363d = new i(executorServiceNewSingleThreadExecutor);
        this.f27365f = scheduledThreadPoolExecutor;
        this.f27366g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c0241c1);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: W9.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f15346b;

            {
                this.f15346b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f15346b;
                        if (firebaseMessaging.f27364e.f()) {
                            firebaseMessaging.l();
                            break;
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f15346b;
                        Context context3 = firebaseMessaging2.f27361b;
                        AbstractC3935e.B(context3);
                        AbstractC2641B.I(context3, firebaseMessaging2.f27362c, firebaseMessaging2.k());
                        if (firebaseMessaging2.k()) {
                            firebaseMessaging2.g();
                            break;
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new H6.b("Firebase-Messaging-Topics-Io", 2));
        int i11 = A.f15280j;
        Task taskCall = Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: W9.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                y yVar2;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                o oVar2 = oVar;
                C6.l lVar2 = lVar;
                synchronized (y.class) {
                    try {
                        WeakReference weakReference = y.f15406d;
                        yVar2 = weakReference != null ? (y) weakReference.get() : null;
                        if (yVar2 == null) {
                            y yVar3 = new y(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            yVar3.b();
                            y.f15406d = new WeakReference(yVar3);
                            yVar2 = yVar3;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new A(firebaseMessaging, oVar2, yVar2, lVar2, context3, scheduledThreadPoolExecutor3);
            }
        });
        this.f27367h = taskCall;
        taskCall.addOnSuccessListener(scheduledThreadPoolExecutor, new k(this, i10));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: W9.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f15346b;

            {
                this.f15346b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f15346b;
                        if (firebaseMessaging.f27364e.f()) {
                            firebaseMessaging.l();
                            break;
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f15346b;
                        Context context3 = firebaseMessaging2.f27361b;
                        AbstractC3935e.B(context3);
                        AbstractC2641B.I(context3, firebaseMessaging2.f27362c, firebaseMessaging2.k());
                        if (firebaseMessaging2.k()) {
                            firebaseMessaging2.g();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j8) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f27359n == null) {
                    f27359n = new ScheduledThreadPoolExecutor(1, new H6.b("TAG", 2));
                }
                f27359n.schedule(runnable, j8, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging c() {
        return getInstance(g.e());
    }

    public static synchronized e0 d(Context context) {
        try {
            if (f27357l == null) {
                f27357l = new e0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27357l;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.c(FirebaseMessaging.class);
        AbstractC1732v.j(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        Task taskContinueWithTask;
        v vVarF = f();
        if (!n(vVarF)) {
            return vVarF.f15394a;
        }
        String strD = o.d(this.f27360a);
        i iVar = this.f27363d;
        synchronized (iVar) {
            taskContinueWithTask = (Task) ((C4412e) iVar.f15344b).get(strD);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strD);
                }
                l lVar = this.f27362c;
                taskContinueWithTask = lVar.p(lVar.D(o.d((g) lVar.f1844a), "*", new Bundle())).onSuccessTask(this.f27366g, new A5.g(this, strD, vVarF, 7)).continueWithTask((ExecutorService) iVar.f15343a, new h(24, iVar, strD));
                ((C4412e) iVar.f15344b).put(strD, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strD);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e7) {
            throw new IOException(e7);
        }
    }

    public final String e() {
        g gVar = this.f27360a;
        gVar.a();
        return "[DEFAULT]".equals(gVar.f45329b) ? "" : gVar.g();
    }

    public final v f() {
        v vVarB;
        e0 e0VarD = d(this.f27361b);
        String strE = e();
        String strD = o.d(this.f27360a);
        synchronized (e0VarD) {
            vVarB = v.b(((SharedPreferences) e0VarD.f152b).getString(e0.j(strE, strD), null));
        }
        return vVarB;
    }

    public final void g() {
        Task taskForException;
        int i5;
        C1566b c1566b = (C1566b) this.f27362c.f1846c;
        if (c1566b.f19676c.e() >= 241100000) {
            C1576l c1576lK = C1576l.k(c1566b.f19675b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (c1576lK) {
                i5 = c1576lK.f19705a;
                c1576lK.f19705a = i5 + 1;
            }
            taskForException = c1576lK.l(new C1575k(i5, 5, bundle, 1)).continueWith(ExecutorC1572h.f19689c, C1568d.f19683c);
        } else {
            taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskForException.addOnSuccessListener(this.f27365f, new k(this, 1));
    }

    public final void h(t tVar) {
        if (TextUtils.isEmpty(tVar.f15385a.getString("google.to"))) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        Context context = this.f27361b;
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        intent.putExtras(tVar.f15385a);
        context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public final void i(boolean z2) {
        y yVar = this.f27364e;
        synchronized (yVar) {
            yVar.e();
            C0649h c0649h = (C0649h) yVar.f7228c;
            if (c0649h != null) {
                ((n) ((InterfaceC3448d) yVar.f7227b)).d(c0649h);
                yVar.f7228c = null;
            }
            g gVar = ((FirebaseMessaging) yVar.f7230e).f27360a;
            gVar.a();
            SharedPreferences.Editor editorEdit = gVar.f45328a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
            editorEdit.putBoolean("auto_init", z2);
            editorEdit.apply();
            if (z2) {
                ((FirebaseMessaging) yVar.f7230e).l();
            }
            yVar.f7229d = Boolean.valueOf(z2);
        }
    }

    public final synchronized void j(boolean z2) {
        this.f27369j = z2;
    }

    public final boolean k() {
        Context context = this.f27361b;
        AbstractC3935e.B(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.f27360a.c(w8.d.class) != null || (AbstractC3772b.q() && f27358m != null)) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        return false;
    }

    public final void l() {
        if (n(f())) {
            synchronized (this) {
                if (!this.f27369j) {
                    m(0L);
                }
            }
        }
    }

    public final synchronized void m(long j8) {
        b(new w(this, Math.min(Math.max(30L, 2 * j8), k)), j8);
        this.f27369j = true;
    }

    public final boolean n(v vVar) {
        if (vVar != null) {
            return System.currentTimeMillis() > vVar.f15396c + v.f15393d || !this.f27368i.b().equals(vVar.f15395b);
        }
        return true;
    }
}
