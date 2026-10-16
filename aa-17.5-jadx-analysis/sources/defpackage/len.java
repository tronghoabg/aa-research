package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.auto.components.frx.frxrewind.FrxRewindJobService;

/* loaded from: classes2.dex */
public final class len {
    public static final yph a = yph.c("GH.FrxRewind.Cli");

    public static void a(Context context, long j) {
        ((ype) ((ype) a.f()).ai((char) 3810)).u("Scheduling FRX Rewind");
        JobInfo.Builder minimumLatency = new JobInfo.Builder(368496209, new ComponentName(context, FrxRewindJobService.class.getName())).setPersisted(false).setRequiredNetworkType(0).setMinimumLatency(j);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        jobScheduler.schedule(minimumLatency.build());
    }
}
