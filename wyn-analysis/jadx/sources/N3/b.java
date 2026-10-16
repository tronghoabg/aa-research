package N3;

import A.e0;
import J3.r;
import K3.h;
import K3.q;
import S3.i;
import S3.j;
import S3.p;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC3340k;
import o3.g;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final String f8390e = r.f("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f8391a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f8392b;

    /* renamed from: c, reason: collision with root package name */
    public final q f8393c;

    /* renamed from: d, reason: collision with root package name */
    public final a f8394d;

    public b(Context context, q qVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f8391a = context;
        this.f8393c = qVar;
        this.f8392b = jobScheduler;
        this.f8394d = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i5) {
        try {
            jobScheduler.cancel(i5);
        } catch (Throwable th) {
            r.d().c(f8390e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i5)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler, String str) {
        ArrayList arrayListF = f(context, jobScheduler);
        if (arrayListF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            j jVarG = g(jobInfo);
            if (jVarG != null && str.equals(jVarG.f10965a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            r.d().c(f8390e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // K3.h
    public final void a(String str) {
        Context context = this.f8391a;
        JobScheduler jobScheduler = this.f8392b;
        ArrayList arrayListD = d(context, jobScheduler, str);
        if (arrayListD == null || arrayListD.isEmpty()) {
            return;
        }
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            b(jobScheduler, ((Integer) it.next()).intValue());
        }
        i iVarR = this.f8393c.f6503c.r();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarR.f10961a;
        workDatabase_Impl.b();
        S3.h hVar = (S3.h) iVarR.f10964d;
        g gVarA = hVar.a();
        if (str == null) {
            gVarA.N(1);
        } else {
            gVarA.x(1, str);
        }
        workDatabase_Impl.c();
        try {
            gVarA.g();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            hVar.q(gVarA);
        }
    }

    @Override // K3.h
    public final void c(p... pVarArr) {
        int iIntValue;
        ArrayList arrayListD;
        int iIntValue2;
        q qVar = this.f8393c;
        WorkDatabase workDatabase = qVar.f6503c;
        final e0 e0Var = new e0(workDatabase);
        for (p pVar : pVarArr) {
            workDatabase.c();
            try {
                p pVarH = workDatabase.u().h(pVar.f10977a);
                String str = f8390e;
                String str2 = pVar.f10977a;
                if (pVarH == null) {
                    r.d().g(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.n();
                } else if (pVarH.f10978b != 1) {
                    r.d().g(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.n();
                } else {
                    j jVarS = Fe.c.s(pVar);
                    S3.g gVarC = workDatabase.r().c(jVarS);
                    WorkDatabase workDatabase2 = (WorkDatabase) e0Var.f152b;
                    if (gVarC != null) {
                        iIntValue = gVarC.f10959c;
                    } else {
                        qVar.f6502b.getClass();
                        final int i5 = qVar.f6502b.f5550g;
                        Object objM = workDatabase2.m(new Callable() { // from class: T3.g
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                e0 this$0 = e0Var;
                                AbstractC3340k.e(this$0, "this$0");
                                WorkDatabase workDatabase3 = (WorkDatabase) this$0.f152b;
                                Long lO = workDatabase3.q().o("next_job_scheduler_id");
                                int i10 = 0;
                                int iLongValue = lO != null ? (int) lO.longValue() : 0;
                                workDatabase3.q().q(new S3.d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i5) {
                                    workDatabase3.q().q(new S3.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i10 = iLongValue;
                                }
                                return Integer.valueOf(i10);
                            }
                        });
                        AbstractC3340k.d(objM, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objM).intValue();
                    }
                    if (gVarC == null) {
                        qVar.f6503c.r().d(new S3.g(jVarS.f10965a, jVarS.f10966b, iIntValue));
                    }
                    h(pVar, iIntValue);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListD = d(this.f8391a, this.f8392b, str2)) != null) {
                        int iIndexOf = arrayListD.indexOf(Integer.valueOf(iIntValue));
                        if (iIndexOf >= 0) {
                            arrayListD.remove(iIndexOf);
                        }
                        if (arrayListD.isEmpty()) {
                            qVar.f6502b.getClass();
                            final int i10 = qVar.f6502b.f5550g;
                            Object objM2 = workDatabase2.m(new Callable() { // from class: T3.g
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    e0 this$0 = e0Var;
                                    AbstractC3340k.e(this$0, "this$0");
                                    WorkDatabase workDatabase3 = (WorkDatabase) this$0.f152b;
                                    Long lO = workDatabase3.q().o("next_job_scheduler_id");
                                    int i102 = 0;
                                    int iLongValue = lO != null ? (int) lO.longValue() : 0;
                                    workDatabase3.q().q(new S3.d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                    if (iLongValue < 0 || iLongValue > i10) {
                                        workDatabase3.q().q(new S3.d("next_job_scheduler_id", Long.valueOf(1)));
                                    } else {
                                        i102 = iLongValue;
                                    }
                                    return Integer.valueOf(i102);
                                }
                            });
                            AbstractC3340k.d(objM2, "workDatabase.runInTransa…            id\n        })");
                            iIntValue2 = ((Number) objM2).intValue();
                        } else {
                            iIntValue2 = ((Integer) arrayListD.get(0)).intValue();
                        }
                        h(pVar, iIntValue2);
                    }
                    workDatabase.n();
                }
            } finally {
                workDatabase.j();
            }
        }
    }

    @Override // K3.h
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        if (r10 < 26) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(S3.p r21, int r22) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.b.h(S3.p, int):void");
    }
}
