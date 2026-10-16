package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.List;

/* loaded from: classes2.dex */
public final class fmd {
    public static final /* synthetic */ int a = 0;
    private static final String b = fjo.b("SystemJobScheduler");

    public static final JobScheduler a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }

    public static final List b(JobScheduler jobScheduler) {
        jobScheduler.getClass();
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
            return allPendingJobs;
        } catch (Throwable th) {
            String str = b;
            fjo.a();
            Log.e(str, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }
}
