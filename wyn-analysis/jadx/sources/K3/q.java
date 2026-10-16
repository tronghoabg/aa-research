package K3;

import A7.RunnableC0299w0;
import J3.x;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k3.C3179k;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class q extends x {
    public static q k;

    /* renamed from: l, reason: collision with root package name */
    public static q f6499l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f6500m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6501a;

    /* renamed from: b, reason: collision with root package name */
    public final J3.b f6502b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f6503c;

    /* renamed from: d, reason: collision with root package name */
    public final b7.k f6504d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6505e;

    /* renamed from: f, reason: collision with root package name */
    public final f f6506f;

    /* renamed from: g, reason: collision with root package name */
    public final xa.d f6507g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6508h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f6509i;

    /* renamed from: j, reason: collision with root package name */
    public final S3.n f6510j;

    static {
        J3.r.f("WorkManagerImpl");
        k = null;
        f6499l = null;
        f6500m = new Object();
    }

    public q(Context context, J3.b bVar, b7.k kVar) throws Resources.NotFoundException {
        C3179k c3179kK;
        int i5 = 2;
        int i10 = 0;
        int i11 = 1;
        boolean z2 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        T3.m queryExecutor = (T3.m) kVar.f19396b;
        AbstractC3340k.e(context2, "context");
        AbstractC3340k.e(queryExecutor, "queryExecutor");
        if (z2) {
            c3179kK = new C3179k(context2, WorkDatabase.class, null);
            c3179kK.f39216j = true;
        } else {
            c3179kK = AbstractC3230e0.k(context2, WorkDatabase.class, "androidx.work.workdb");
            c3179kK.f39215i = new l(context2);
        }
        c3179kK.f39213g = queryExecutor;
        c3179kK.f39210d.add(b.f6456a);
        c3179kK.a(d.f6460g);
        c3179kK.a(new g(context2, 2, 3));
        c3179kK.a(d.f6461h);
        c3179kK.a(d.f6462i);
        c3179kK.a(new g(context2, 5, 6));
        c3179kK.a(d.f6463j);
        c3179kK.a(d.k);
        c3179kK.a(d.f6464l);
        c3179kK.a(new g(context2));
        c3179kK.a(new g(context2, 10, 11));
        c3179kK.a(d.f6457d);
        c3179kK.a(d.f6458e);
        c3179kK.a(d.f6459f);
        c3179kK.f39217l = false;
        c3179kK.f39218m = true;
        WorkDatabase workDatabase = (WorkDatabase) c3179kK.b();
        Context context3 = context.getApplicationContext();
        J3.r rVar = new J3.r(bVar.f5549f);
        synchronized (J3.r.f5582b) {
            J3.r.f5583c = rVar;
        }
        AbstractC3340k.e(context3, "context");
        Context applicationContext = context3.getApplicationContext();
        AbstractC3340k.d(applicationContext, "context.applicationContext");
        Q3.a aVar = new Q3.a(applicationContext, kVar, i10);
        Context applicationContext2 = context3.getApplicationContext();
        AbstractC3340k.d(applicationContext2, "context.applicationContext");
        Q3.a aVar2 = new Q3.a(applicationContext2, kVar, i11);
        Context applicationContext3 = context3.getApplicationContext();
        AbstractC3340k.d(applicationContext3, "context.applicationContext");
        String str = Q3.j.f9839a;
        Object iVar = Build.VERSION.SDK_INT >= 24 ? new Q3.i(applicationContext3, kVar) : new Q3.k(applicationContext3, kVar);
        Context applicationContext4 = context3.getApplicationContext();
        AbstractC3340k.d(applicationContext4, "context.applicationContext");
        Q3.a aVar3 = new Q3.a(applicationContext4, kVar, i5);
        S3.n nVar = new S3.n();
        nVar.f10970a = aVar;
        nVar.f10971b = aVar2;
        nVar.f10972c = iVar;
        nVar.f10973d = aVar3;
        this.f6510j = nVar;
        String str2 = i.f6484a;
        N3.b bVar2 = new N3.b(context3, this);
        T3.k.a(context3, SystemJobService.class, true);
        J3.r.d().a(i.f6484a, "Created SystemJobScheduler and enabled SystemJobService");
        List listAsList = Arrays.asList(bVar2, new L3.b(context3, bVar, nVar, this));
        f fVar = new f(context, bVar, kVar, workDatabase, listAsList);
        Context applicationContext5 = context.getApplicationContext();
        this.f6501a = applicationContext5;
        this.f6502b = bVar;
        this.f6504d = kVar;
        this.f6503c = workDatabase;
        this.f6505e = listAsList;
        this.f6506f = fVar;
        this.f6507g = new xa.d(workDatabase, 23);
        this.f6508h = false;
        if (Build.VERSION.SDK_INT >= 24 && p.a(applicationContext5)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f6504d.v(new T3.f(applicationContext5, this));
    }

    public static q b() {
        synchronized (f6500m) {
            try {
                q qVar = k;
                if (qVar != null) {
                    return qVar;
                }
                return f6499l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static q c(Context context) {
        q qVarB;
        synchronized (f6500m) {
            try {
                qVarB = b();
                if (qVarB == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVarB;
    }

    public static void d(Context context, J3.b bVar) {
        synchronized (f6500m) {
            try {
                q qVar = k;
                if (qVar != null && f6499l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (qVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f6499l == null) {
                        f6499l = new q(applicationContext, bVar, new b7.k(bVar.f5545b));
                    }
                    k = f6499l;
                }
            } finally {
            }
        }
    }

    public final void e() {
        synchronized (f6500m) {
            try {
                this.f6508h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f6509i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f6509i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        ArrayList arrayListF;
        WorkDatabase workDatabase = this.f6503c;
        Context context = this.f6501a;
        String str = N3.b.f8390e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListF = N3.b.f(context, jobScheduler)) != null && !arrayListF.isEmpty()) {
            Iterator it = arrayListF.iterator();
            while (it.hasNext()) {
                N3.b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        S3.q qVarU = workDatabase.u();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVarU.f10996a;
        workDatabase_Impl.b();
        S3.h hVar = (S3.h) qVarU.k;
        o3.g gVarA = hVar.a();
        workDatabase_Impl.c();
        try {
            gVarA.g();
            workDatabase_Impl.n();
            workDatabase_Impl.j();
            hVar.q(gVarA);
            i.a(this.f6502b, workDatabase, this.f6505e);
        } catch (Throwable th) {
            workDatabase_Impl.j();
            hVar.q(gVarA);
            throw th;
        }
    }

    public final void g(j jVar, b7.k kVar) {
        b7.k kVar2 = this.f6504d;
        RunnableC0299w0 runnableC0299w0 = new RunnableC0299w0(18);
        runnableC0299w0.f1095d = this;
        runnableC0299w0.f1093b = jVar;
        runnableC0299w0.f1094c = kVar;
        kVar2.v(runnableC0299w0);
    }

    public final void h(j jVar) {
        this.f6504d.v(new T3.n(this, jVar, false));
    }
}
