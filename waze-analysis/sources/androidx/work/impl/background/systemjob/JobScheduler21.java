package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class JobScheduler21 {
    public static final JobScheduler21 INSTANCE = new JobScheduler21();

    private JobScheduler21() {
    }

    public final List<JobInfo> getAllPendingJobs(JobScheduler jobScheduler) {
        x.f(jobScheduler, "jobScheduler");
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        x.e(allPendingJobs, "getAllPendingJobs(...)");
        return allPendingJobs;
    }
}
