package androidx.work.impl.background.systemjob;

import J3.r;
import K3.c;
import K3.q;
import N3.d;
import S3.j;
import S3.s;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import b7.k;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f19079d = r.f("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public q f19080a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f19081b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final s f19082c = new s((byte) 0, 10);

    public static j a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // K3.c
    public final void d(j jVar, boolean z2) {
        JobParameters jobParameters;
        r.d().a(f19079d, jVar.f10965a + " executed on JobScheduler");
        synchronized (this.f19081b) {
            jobParameters = (JobParameters) this.f19081b.remove(jVar);
        }
        this.f19082c.w(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z2);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            q qVarC = q.c(getApplicationContext());
            this.f19080a = qVarC;
            qVarC.f6506f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            r.d().g(f19079d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        q qVar = this.f19080a;
        if (qVar != null) {
            qVar.f6506f.g(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        k kVar;
        if (this.f19080a == null) {
            r.d().a(f19079d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j jVarA = a(jobParameters);
        if (jVarA == null) {
            r.d().b(f19079d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f19081b) {
            try {
                if (this.f19081b.containsKey(jVarA)) {
                    r.d().a(f19079d, "Job is already being executed by SystemJobService: " + jVarA);
                    return false;
                }
                r.d().a(f19079d, "onStartJob for " + jVarA);
                this.f19081b.put(jVarA, jobParameters);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 24) {
                    kVar = new k(6);
                    if (N3.c.b(jobParameters) != null) {
                        kVar.f19397c = Arrays.asList(N3.c.b(jobParameters));
                    }
                    if (N3.c.a(jobParameters) != null) {
                        kVar.f19396b = Arrays.asList(N3.c.a(jobParameters));
                    }
                    if (i5 >= 28) {
                        kVar.f19398d = d.a(jobParameters);
                    }
                } else {
                    kVar = null;
                }
                this.f19080a.g(this.f19082c.y(jVarA), kVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (this.f19080a == null) {
            r.d().a(f19079d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j jVarA = a(jobParameters);
        if (jVarA == null) {
            r.d().b(f19079d, "WorkSpec id not found!");
            return false;
        }
        r.d().a(f19079d, "onStopJob for " + jVarA);
        synchronized (this.f19081b) {
            this.f19081b.remove(jVarA);
        }
        K3.j jVarW = this.f19082c.w(jVarA);
        if (jVarW != null) {
            this.f19080a.h(jVarW);
        }
        return !this.f19080a.f6506f.e(jVarA.f10965a);
    }
}
