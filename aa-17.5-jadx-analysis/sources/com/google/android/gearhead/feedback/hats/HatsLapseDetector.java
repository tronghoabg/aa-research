package com.google.android.gearhead.feedback.hats;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.Context;
import com.google.android.apps.auto.components.feedback.hats.HatsDownloadService;
import defpackage.acrq;
import defpackage.ebf;
import defpackage.rqv;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yyv;

/* loaded from: classes.dex */
public final class HatsLapseDetector {
    public static final yph a = yph.c("GH.HatsLapseDetector");
    public final Context b;
    public final JobScheduler c;

    /* loaded from: classes2.dex */
    public static final class LapseService extends JobService {
        @Override // android.app.job.JobService
        public final boolean onStartJob(JobParameters jobParameters) {
            yph yphVar = HatsLapseDetector.a;
            if (acrq.e()) {
                ((ype) HatsLapseDetector.a.l().ai((char) 7340)).u("Lapse detected");
                HatsDownloadService.b(this, jobParameters.getExtras().getString("SURVEY_TRIGGER_ID"), jobParameters.getExtras().getPersistableBundle("SURVEY_PSD"), 2);
                ebf.j().F(rqv.h(yxy.GEARHEAD, 12, yyv.HATS_LAPSE_DETECTED).l());
            }
            jobFinished(jobParameters, false);
            return false;
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            ((ype) HatsLapseDetector.a.l().ai((char) 7341)).u("LapseService stopping");
            return false;
        }
    }

    public HatsLapseDetector(Context context) {
        this.b = context;
        this.c = (JobScheduler) context.getSystemService("jobscheduler");
    }
}
