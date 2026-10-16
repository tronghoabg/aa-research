package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.a.r;
import com.google.android.datatransport.runtime.x;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4305a;

    /* renamed from: b, reason: collision with root package name */
    private final f f4306b;

    /* renamed from: c, reason: collision with root package name */
    private final r f4307c;

    public a(Context context, r rVar, f fVar) {
        this.f4305a = context;
        this.f4307c = rVar;
        this.f4306b = fVar;
    }

    public final void a(x xVar, int i2) {
        b(xVar, i2, false);
    }

    public final void b(x xVar, int i2, boolean z) {
        Context context = this.f4305a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(xVar.e().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(com.google.android.datatransport.runtime.d.a.a(xVar.d())).array());
        if (xVar.f() != null) {
            adler32.update(xVar.f());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        com.google.android.datatransport.cct.e.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", xVar);
                        return;
                    }
                }
            }
        }
        r rVar = this.f4307c;
        long jB = rVar.b(xVar);
        boolean z2 = z && rVar.s(xVar);
        f fVar = this.f4306b;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        com.google.android.datatransport.c cVarD = xVar.d();
        builder.setMinimumLatency(fVar.a(cVarD, jB, i2, z2));
        Set setD = ((d) fVar.b().get(cVarD)).d();
        if (setD.contains(e.f4317a)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setD.contains(e.f4319c)) {
            builder.setRequiresCharging(true);
        }
        if (setD.contains(e.f4318b)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", xVar.e());
        persistableBundle.putInt("priority", com.google.android.datatransport.runtime.d.a.a(xVar.d()));
        if (xVar.f() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(xVar.f(), 0));
        }
        builder.setExtras(persistableBundle);
        com.google.android.datatransport.cct.e.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", xVar, Integer.valueOf(value), Long.valueOf(fVar.a(xVar.d(), jB, i2, z2)), Long.valueOf(jB), Integer.valueOf(i2));
        jobScheduler.schedule(builder.build());
    }
}
