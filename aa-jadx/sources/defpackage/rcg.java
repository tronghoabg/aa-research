package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rcg implements defpackage.raz {
    final /* synthetic */ android.app.job.JobParameters a;
    final /* synthetic */ com.google.android.gms.car.StagingService b;

    public rcg(com.google.android.gms.car.StagingService stagingService, android.app.job.JobParameters jobParameters) {
        this.a = jobParameters;
        this.b = stagingService;
    }

    @Override // defpackage.raz
    public final void a() {
        this.b.jobFinished(this.a, false);
    }
}
