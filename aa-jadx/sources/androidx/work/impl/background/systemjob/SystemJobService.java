package androidx.work.impl.background.systemjob;

/* JADX INFO: loaded from: classes2.dex */
public class SystemJobService extends android.app.job.JobService implements defpackage.fkj {
    private static final java.lang.String a = defpackage.fjv.b("SystemJobService");
    private defpackage.flv b;
    private final java.util.Map c = new java.util.HashMap();
    private final defpackage.fkz d = defpackage.dbd.g(false);
    private defpackage.kqe e;

    private static defpackage.fof b(android.app.job.JobParameters jobParameters) {
        try {
            android.os.PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new defpackage.fof(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (java.lang.NullPointerException unused) {
            return null;
        }
    }

    private static void c(java.lang.String str) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException(defpackage.a.bp(str, "Cannot invoke ", " on a background thread"));
        }
    }

    @Override // defpackage.fkj
    public final void a(defpackage.fof fofVar, boolean z) {
        c("onExecuted");
        android.app.job.JobParameters jobParameters = (android.app.job.JobParameters) this.c.remove(fofVar);
        this.d.c(fofVar);
        if (jobParameters != null) {
            defpackage.fjv.a().c(a, fofVar.a.concat(" executed on JobScheduler"));
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            defpackage.flv flvVarB = defpackage.flv.b(getApplicationContext());
            this.b = flvVarB;
            defpackage.fku fkuVar = flvVarB.f;
            this.e = new defpackage.kqe(fkuVar, flvVarB.k);
            fkuVar.c(this);
        } catch (java.lang.IllegalStateException e) {
            if (!android.app.Application.class.equals(getApplication().getClass())) {
                throw new java.lang.IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            defpackage.fjv.a();
            android.util.Log.w(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        defpackage.flv flvVar = this.b;
        if (flvVar != null) {
            flvVar.f.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(android.app.job.JobParameters jobParameters) {
        c("onStartJob");
        if (this.b == null) {
            defpackage.fjv.a().c(a, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        defpackage.fof fofVarB = b(jobParameters);
        if (fofVarB == null) {
            defpackage.fjv.a();
            android.util.Log.e(a, "WorkSpec id not found!");
            return false;
        }
        java.util.Map map = this.c;
        if (map.containsKey(fofVarB)) {
            defpackage.fjv fjvVarA = defpackage.fjv.a();
            java.lang.String str = a;
            java.util.Objects.toString(fofVarB);
            fjvVarA.c(str, "Job is already being executed by SystemJobService: ".concat(fofVarB.toString()));
            return false;
        }
        defpackage.fjv fjvVarA2 = defpackage.fjv.a();
        java.lang.String str2 = a;
        java.util.Objects.toString(fofVarB);
        fjvVarA2.c(str2, "onStartJob for ".concat(fofVarB.toString()));
        map.put(fofVarB, jobParameters);
        defpackage.dbd dbdVar = new defpackage.dbd(null);
        if (jobParameters.getTriggeredContentUris() != null) {
            java.util.Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            java.util.Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        jobParameters.getNetwork();
        this.e.H(this.d.d(fofVarB), dbdVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
        boolean zContains;
        c("onStopJob");
        if (this.b == null) {
            defpackage.fjv.a().c(a, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        defpackage.fof fofVarB = b(jobParameters);
        if (fofVarB == null) {
            defpackage.fjv.a();
            android.util.Log.e(a, "WorkSpec id not found!");
            return false;
        }
        defpackage.fjv fjvVarA = defpackage.fjv.a();
        java.lang.String str = a;
        java.util.Objects.toString(fofVarB);
        fjvVarA.c(str, "onStopJob for ".concat(fofVarB.toString()));
        this.c.remove(fofVarB);
        defpackage.gkc gkcVarC = this.d.c(fofVarB);
        if (gkcVarC != null) {
            int i = -512;
            if (android.os.Build.VERSION.SDK_INT >= 31) {
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
            this.e.G(gkcVarC, i);
        }
        defpackage.fku fkuVar = this.b.f;
        java.lang.String str2 = fofVarB.a;
        synchronized (fkuVar.k) {
            zContains = fkuVar.i.contains(str2);
        }
        return !zContains;
    }
}
