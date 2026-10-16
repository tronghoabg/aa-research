package p9;

import A7.C0237b0;
import E5.n0;
import G5.RunnableC0534o;
import K8.C0694f;
import Va.Y7;
import ad.L;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import com.applovin.impl.Y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import me.C3558a;
import n9.C3607b;
import n9.C3609d;
import n9.C3610e;
import nd.C3615a;
import ne.C3618a;
import p7.AbstractC3772b;
import r9.C3948e;
import r9.C3955l;
import r9.P;
import r9.RunnableC3951h;
import w9.AbstractC4392k;
import w9.C4386e;
import w9.ExecutorC4384c;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final C0237b0 f43379a;

    /* renamed from: b, reason: collision with root package name */
    public final C3609d f43380b;

    /* renamed from: c, reason: collision with root package name */
    public final C3607b f43381c;

    /* renamed from: d, reason: collision with root package name */
    public final C4386e f43382d;

    /* renamed from: e, reason: collision with root package name */
    public final o9.g f43383e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC3772b f43384f;

    /* renamed from: g, reason: collision with root package name */
    public C3955l f43385g;

    /* renamed from: h, reason: collision with root package name */
    public n0 f43386h;

    /* renamed from: i, reason: collision with root package name */
    public z f43387i;

    /* renamed from: j, reason: collision with root package name */
    public Q1.n f43388j;
    public C3618a k;

    /* renamed from: l, reason: collision with root package name */
    public P f43389l;

    public n(Context context, C0237b0 c0237b0, C3609d c3609d, C3607b c3607b, C4386e c4386e, v9.h hVar, s sVar) {
        this.f43379a = c0237b0;
        this.f43380b = c3609d;
        this.f43381c = c3607b;
        this.f43382d = c4386e;
        this.f43383e = new o9.g(new v9.o((s9.f) c0237b0.f815e));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c4386e.a(new Kb.c(this, taskCompletionSource, context, sVar, hVar, 9));
        Y y10 = new Y(this, atomicBoolean, taskCompletionSource, c4386e);
        synchronized (c3609d) {
            c3609d.f40951d = y10;
            y10.b(c3609d.X());
        }
        c3607b.Z(new m9.B(14));
    }

    public final void a(Context context, C3610e c3610e, s sVar, v9.h hVar) {
        int i5 = 1;
        Ba.c.p("FirestoreClient", "Initializing. user=%s", 1, c3610e.f40955a);
        C0237b0 c0237b0 = this.f43379a;
        C3609d c3609d = this.f43380b;
        C3607b c3607b = this.f43381c;
        C4386e c4386e = this.f43382d;
        C3558a c3558a = new C3558a();
        c3558a.f40736a = context;
        c3558a.f40737b = c4386e;
        c3558a.f40738c = c0237b0;
        C8.i iVar = sVar.f43398b;
        s9.f fVar = (s9.f) c0237b0.f815e;
        iVar.f1940c = new v9.o(fVar);
        v9.i iVar2 = new v9.i(c3609d, c3607b);
        X8.c cVar = new X8.c();
        cVar.f16185b = c4386e;
        cVar.f16188e = context;
        cVar.f16189f = c0237b0;
        cVar.f16190g = iVar2;
        cVar.f16184a = Tasks.call(AbstractC4392k.f47446c, new G8.c(cVar, 11));
        iVar.f1939b = cVar;
        X8.c cVar2 = (X8.c) iVar.f1939b;
        A6.c.A(cVar2, "grpcCallProvider not initialized yet", new Object[0]);
        iVar.f1941d = new v9.m(c4386e, c3609d, c3607b, fVar, hVar, cVar2);
        v9.o oVar = (v9.o) iVar.f1940c;
        A6.c.A(oVar, "remoteSerializer not initialized yet", new Object[0]);
        v9.m mVar = (v9.m) iVar.f1941d;
        A6.c.A(mVar, "firestoreChannel not initialized yet", new Object[0]);
        iVar.f1942e = new v9.g(c4386e, oVar, mVar);
        Y7 y72 = new Y7();
        y72.f13870d = new ArrayList();
        A6.c.z(context != null, "Context must be non-null", new Object[0]);
        y72.f13867a = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        y72.f13868b = connectivityManager;
        Application application = (Application) context.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new v9.c(y72, atomicBoolean));
        application.registerComponentCallbacks(new v9.d(atomicBoolean));
        if (Build.VERSION.SDK_INT < 24 || connectivityManager == null) {
            C3615a c3615a = new C3615a(y72, i5);
            context.registerReceiver(c3615a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            y72.f13869c = new ng.a(22, y72, c3615a);
        } else {
            Q3.h hVar2 = new Q3.h(y72, 4);
            connectivityManager.registerDefaultNetworkCallback(hVar2);
            y72.f13869c = new ng.a(21, y72, hVar2);
        }
        iVar.f1943f = y72;
        AbstractC3772b abstractC3772bC = sVar.c(c3558a);
        sVar.f43399c = abstractC3772bC;
        abstractC3772bC.T();
        AbstractC3772b abstractC3772b = sVar.f43399c;
        A6.c.A(abstractC3772b, "persistence not initialized yet", new Object[0]);
        C0694f c0694f = new C0694f();
        c0694f.f6640b = false;
        sVar.f43400d = new C3955l(abstractC3772b, c0694f, c3610e);
        L l10 = new L(sVar, 20);
        C3955l c3955lD = sVar.d();
        v9.g gVar = (v9.g) iVar.f1942e;
        A6.c.A(gVar, "datastore not initialized yet", new Object[0]);
        Y7 y73 = (Y7) iVar.f1943f;
        A6.c.A(y73, "connectivityMonitor not initialized yet", new Object[0]);
        sVar.f43402f = new n0(fVar, l10, c3955lD, gVar, c4386e, y73);
        C3955l c3955lD2 = sVar.d();
        n0 n0Var = sVar.f43402f;
        A6.c.A(n0Var, "remoteStore not initialized yet", new Object[0]);
        sVar.f43401e = new z(c3955lD2, n0Var, c3610e);
        sVar.f43403g = new Q1.n(sVar.e());
        C3955l c3955l = sVar.f43400d;
        c3955l.f44631a.B().run();
        RunnableC3951h runnableC3951h = new RunnableC3951h(c3955l, 0);
        AbstractC3772b abstractC3772b2 = c3955l.f44631a;
        abstractC3772b2.P("Start IndexManager", runnableC3951h);
        abstractC3772b2.P("Start MutationQueue", new RunnableC3951h(c3955l, 1));
        sVar.f43402f.h();
        sVar.f43405i = sVar.a(c3558a);
        sVar.f43404h = sVar.b(c3558a);
        AbstractC3772b abstractC3772b3 = sVar.f43399c;
        A6.c.A(abstractC3772b3, "persistence not initialized yet", new Object[0]);
        this.f43384f = abstractC3772b3;
        this.f43389l = sVar.f43405i;
        this.f43385g = sVar.d();
        n0 n0Var2 = sVar.f43402f;
        A6.c.A(n0Var2, "remoteStore not initialized yet", new Object[0]);
        this.f43386h = n0Var2;
        this.f43387i = sVar.e();
        Q1.n nVar = sVar.f43403g;
        A6.c.A(nVar, "eventManager not initialized yet", new Object[0]);
        this.f43388j = nVar;
        C3948e c3948e = sVar.f43404h;
        P p10 = this.f43389l;
        if (p10 != null) {
            p10.start();
        }
        if (c3948e != null) {
            C3618a c3618a = c3948e.f44612a;
            this.k = c3618a;
            c3618a.start();
        }
    }

    public final v b(u uVar, C3786g c3786g, C3781b c3781b) {
        e();
        v vVar = new v(uVar, c3786g, c3781b);
        this.f43382d.a(new m(this, vVar, 1));
        return vVar;
    }

    public final void c(boolean z2) {
        e();
        this.f43382d.a(new RunnableC0534o(5, this, z2));
    }

    public final Task d() {
        this.f43380b.a0();
        this.f43381c.Y();
        C4386e c4386e = this.f43382d;
        l lVar = new l(this, 0);
        ExecutorC4384c executorC4384c = c4386e.f47427a;
        synchronized (executorC4384c) {
            if (!executorC4384c.c()) {
                Task taskB = executorC4384c.b(new G8.c(lVar, 13));
                executorC4384c.f47414b = true;
                return taskB;
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
    }

    public final void e() {
        if (this.f43382d.f47427a.c()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    public final Task f(List list) {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f43382d.a(new com.applovin.impl.mediation.ads.f(this, list, taskCompletionSource, 28));
        return taskCompletionSource.getTask();
    }
}
