package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Log;
import defpackage.a;
import defpackage.dsz;
import defpackage.fjo;
import defpackage.fkb;
import defpackage.fkm;
import defpackage.fkr;
import defpackage.flo;
import defpackage.fny;
import defpackage.gjv;
import defpackage.sx;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class SystemJobService extends JobService implements fkb {
    private static final String a = fjo.b("SystemJobService");
    private flo b;
    private final Map c = new HashMap();
    private final fkr d = dsz.k(false);
    private sx e;

    private static fny b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new fny(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static void c(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a.bq(str, "Cannot invoke ", " on a background thread"));
        }
    }

    @Override // defpackage.fkb
    public final void a(fny fnyVar, boolean z) {
        c("onExecuted");
        JobParameters jobParameters = (JobParameters) this.c.remove(fnyVar);
        this.d.c(fnyVar);
        if (jobParameters != null) {
            fjo.a().c(a, fnyVar.a.concat(" executed on JobScheduler"));
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            flo floVarB = flo.b(getApplicationContext());
            this.b = floVarB;
            fkm fkmVar = floVarB.f;
            this.e = new sx(fkmVar, floVarB.k);
            fkmVar.c(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            fjo.a();
            Log.w(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        flo floVar = this.b;
        if (floVar != null) {
            floVar.f.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        c("onStartJob");
        if (this.b == null) {
            fjo.a().c(a, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        fny fnyVarB = b(jobParameters);
        if (fnyVarB == null) {
            fjo.a();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        Map map = this.c;
        if (map.containsKey(fnyVarB)) {
            fjo fjoVarA = fjo.a();
            String str = a;
            Objects.toString(fnyVarB);
            fjoVarA.c(str, "Job is already being executed by SystemJobService: ".concat(fnyVarB.toString()));
            return false;
        }
        fjo fjoVarA2 = fjo.a();
        String str2 = a;
        Objects.toString(fnyVarB);
        fjoVarA2.c(str2, "onStartJob for ".concat(fnyVarB.toString()));
        map.put(fnyVarB, jobParameters);
        dsz dszVar = new dsz(null);
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        jobParameters.getNetwork();
        this.e.w(this.d.d(fnyVarB), dszVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        c("onStopJob");
        if (this.b == null) {
            fjo.a().c(a, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        fny fnyVarB = b(jobParameters);
        if (fnyVarB == null) {
            fjo.a();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        fjo fjoVarA = fjo.a();
        String str = a;
        Objects.toString(fnyVarB);
        fjoVarA.c(str, "onStopJob for ".concat(fnyVarB.toString()));
        this.c.remove(fnyVarB);
        gjv gjvVarC = this.d.c(fnyVarB);
        if (gjvVarC != null) {
            int i = -512;
            if (Build.VERSION.SDK_INT >= 31) {
                int stopReason = jobParameters.getStopReason();
                switch (stopReason) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        i = stopReason;
                        break;
                }
            }
            this.e.x(gjvVarC, i);
        }
        fkm fkmVar = this.b.f;
        String str2 = fnyVarB.a;
        synchronized (fkmVar.k) {
            zContains = fkmVar.i.contains(str2);
        }
        return !zContains;
    }
}
