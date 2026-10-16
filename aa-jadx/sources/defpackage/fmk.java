package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fmk {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.String b = defpackage.fjv.b("SystemJobScheduler");

    public static final android.app.job.JobScheduler a(android.content.Context context) {
        context.getClass();
        java.lang.Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) systemService;
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        android.app.job.JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }

    public static final java.util.List b(android.app.job.JobScheduler jobScheduler) {
        jobScheduler.getClass();
        try {
            java.util.List<android.app.job.JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
            return allPendingJobs;
        } catch (java.lang.Throwable th) {
            java.lang.String str = b;
            defpackage.fjv.a();
            android.util.Log.e(str, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }
}
