package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import D5.a;
import Uc.e;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import ne.C3618a;
import t5.C4114i;
import t5.C4123r;
import yc.RunnableC4579b;
import z5.f;

/* loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26262a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int i5 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        C4123r.b(getApplicationContext());
        C3618a c3618aA = C4114i.a();
        c3618aA.h(string);
        c3618aA.f41022c = a.b(i5);
        if (string2 != null) {
            c3618aA.f41021b = Base64.decode(string2, 0);
        }
        f fVar = C4123r.a().f45802d;
        C4114i c4114iC = c3618aA.c();
        RunnableC4579b runnableC4579b = new RunnableC4579b(4, this, jobParameters);
        fVar.getClass();
        fVar.f48387e.execute(new e(i10, 3, fVar, c4114iC, runnableC4579b));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
