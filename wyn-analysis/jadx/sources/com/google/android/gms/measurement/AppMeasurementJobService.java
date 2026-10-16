package com.google.android.gms.measurement;

import A7.C0273n0;
import A7.InterfaceC0306y1;
import A7.L1;
import A7.N;
import A7.RunnableC0278p;
import A7.RunnableC0299w0;
import S3.l;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* loaded from: classes4.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC0306y1 {

    /* renamed from: a, reason: collision with root package name */
    public l f26743a;

    @Override // A7.InterfaceC0306y1
    public final void a(Intent intent) {
    }

    @Override // A7.InterfaceC0306y1
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final l c() {
        if (this.f26743a == null) {
            this.f26743a = new l((Object) this);
        }
        return this.f26743a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        N n10 = C0273n0.a((Service) c().f10967a, null, null).f981i;
        C0273n0.d(n10);
        n10.f612n.c("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        N n10 = C0273n0.a((Service) c().f10967a, null, null).f981i;
        C0273n0.d(n10);
        n10.f612n.c("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        l lVarC = c();
        if (intent == null) {
            lVarC.u().f605f.c("onRebind called with null intent");
            return;
        }
        lVarC.getClass();
        lVarC.u().f612n.d("onRebind called. action", intent.getAction());
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        l lVarC = c();
        N n10 = C0273n0.a((Service) lVarC.f10967a, null, null).f981i;
        C0273n0.d(n10);
        String string = jobParameters.getExtras().getString(HandleInvocationsFromAdViewer.KEY_ACTION);
        n10.f612n.d("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        RunnableC0299w0 runnableC0299w0 = new RunnableC0299w0(8);
        runnableC0299w0.f1095d = lVarC;
        runnableC0299w0.f1093b = n10;
        runnableC0299w0.f1094c = jobParameters;
        L1 l1D = L1.d((Service) lVarC.f10967a);
        l1D.zzl().m0(new RunnableC0278p(l1D, false, runnableC0299w0, 12));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        l lVarC = c();
        if (intent == null) {
            lVarC.u().f605f.c("onUnbind called with null intent");
            return true;
        }
        lVarC.getClass();
        lVarC.u().f612n.d("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @Override // A7.InterfaceC0306y1
    public final boolean zza(int i5) {
        throw new UnsupportedOperationException();
    }
}
