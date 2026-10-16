package defpackage;

import android.app.job.JobParameters;
import com.google.android.gms.car.StagingService;

/* loaded from: classes2.dex */
public final class rbl implements rad {
    final /* synthetic */ JobParameters a;
    final /* synthetic */ StagingService b;

    public rbl(StagingService stagingService, JobParameters jobParameters) {
        this.a = jobParameters;
        this.b = stagingService;
    }

    @Override // defpackage.rad
    public final void a() {
        this.b.jobFinished(this.a, false);
    }
}
