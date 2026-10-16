package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.ac;
import com.google.android.datatransport.runtime.w;
import com.google.android.datatransport.runtime.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        ac.d(getApplicationContext());
        w wVarA = x.a();
        wVarA.b(string);
        wVarA.d(com.google.android.datatransport.runtime.d.a.b(i2));
        if (string2 != null) {
            wVarA.c(Base64.decode(string2, 0));
        }
        ac.c().e().b(wVarA.a(), i3, new android.support.v4.app.ac(this, jobParameters, 6));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
