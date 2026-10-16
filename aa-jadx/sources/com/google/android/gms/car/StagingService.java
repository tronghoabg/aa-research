package com.google.android.gms.car;

/* JADX INFO: loaded from: classes2.dex */
public class StagingService extends android.app.job.JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(android.app.job.JobParameters jobParameters) {
        defpackage.sqg.p(this, true, true, new defpackage.rcg(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
        return true;
    }
}
