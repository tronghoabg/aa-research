package Yc;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes5.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final JobWorkItem f16780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f16781b;

    public l(m mVar, JobWorkItem jobWorkItem) {
        this.f16781b = mVar;
        this.f16780a = jobWorkItem;
    }

    @Override // Yc.k
    public final void a() {
        synchronized (this.f16781b.f16783b) {
            JobParameters jobParameters = this.f16781b.f16784c;
            if (jobParameters != null) {
                try {
                    jobParameters.completeWork(this.f16780a);
                } catch (IllegalArgumentException e7) {
                    Log.e("JobServiceEngineImpl", "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", e7);
                } catch (SecurityException e10) {
                    Log.e("JobServiceEngineImpl", "SecurityException: Failed to run mParams.completeWork(mJobWork)!", e10);
                }
            }
        }
    }

    @Override // Yc.k
    public final Intent getIntent() {
        return this.f16780a.getIntent();
    }
}
