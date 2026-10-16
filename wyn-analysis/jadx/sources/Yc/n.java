package Yc;

import U1.AbstractC0832b;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes5.dex */
public final class n extends o {

    /* renamed from: d, reason: collision with root package name */
    public final JobInfo f16785d;

    /* renamed from: e, reason: collision with root package name */
    public final JobScheduler f16786e;

    public n(Context context, ComponentName componentName, int i5) {
        super(componentName);
        b(i5);
        this.f16785d = new JobInfo.Builder(i5, componentName).setOverrideDeadline(0L).build();
        this.f16786e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // Yc.o
    public final void a(Intent intent) {
        this.f16786e.enqueue(this.f16785d, AbstractC0832b.d(intent));
    }
}
