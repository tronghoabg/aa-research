package com.google.android.gms.car;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.rbl;
import defpackage.uqw;

/* loaded from: classes2.dex */
public class StagingService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        uqw.af(this, true, true, new rbl(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
