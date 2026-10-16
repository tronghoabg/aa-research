package Yc;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.util.Log;

/* loaded from: classes5.dex */
public final class m extends JobServiceEngine {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugins.firebase.messaging.a f16782a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16783b;

    /* renamed from: c, reason: collision with root package name */
    public JobParameters f16784c;

    public m(io.flutter.plugins.firebase.messaging.a aVar) {
        super(aVar);
        this.f16783b = new Object();
        this.f16782a = aVar;
    }

    public final l a() {
        synchronized (this.f16783b) {
            JobParameters jobParameters = this.f16784c;
            if (jobParameters == null) {
                return null;
            }
            try {
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork != null) {
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f16782a.getClassLoader());
                    return new l(this, jobWorkItemDequeueWork);
                }
            } catch (SecurityException e7) {
                Log.e("JobServiceEngineImpl", "Failed to run mParams.dequeueWork()!", e7);
            }
            return null;
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.f16784c = jobParameters;
        this.f16782a.a(false);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        G9.e eVar = this.f16782a.f37181c;
        if (eVar != null) {
            ((io.flutter.plugins.firebase.messaging.a) eVar.f4687d).d();
        }
        synchronized (this.f16783b) {
            this.f16784c = null;
        }
        return true;
    }
}
