package defpackage;

import android.app.AlarmManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class qmx extends qmf {
    public boolean a;
    public boolean c;
    private final AlarmManager d;
    private Integer e;

    protected qmx(qmh qmhVar) {
        super(qmhVar);
        this.d = (AlarmManager) f().getSystemService("alarm");
    }

    private final int d() {
        Integer numValueOf = this.e;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf("analytics".concat(String.valueOf(f().getPackageName())).hashCode());
            this.e = numValueOf;
        }
        return numValueOf.intValue();
    }

    public final void a() {
        this.c = false;
        try {
            AlarmManager alarmManager = this.d;
            Context contextF = f();
            alarmManager.cancel(ssn.b(contextF, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(contextF, "com.google.android.gms.analytics.AnalyticsReceiver")), ssn.a));
        } catch (NullPointerException unused) {
        }
        JobScheduler jobScheduler = (JobScheduler) f().getSystemService("jobscheduler");
        int iD = d();
        super.p(2, "Cancelling job. JobID", Integer.valueOf(iD), null, null);
        jobScheduler.cancel(iD);
    }

    @Override // defpackage.qmf
    protected final void b() throws PackageManager.NameNotFoundException {
        try {
            a();
            j();
            if (qmu.c() > 0) {
                Context contextF = f();
                ActivityInfo receiverInfo = contextF.getPackageManager().getReceiverInfo(new ComponentName(contextF, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo == null || !receiverInfo.enabled) {
                    return;
                }
                super.p(2, "Receiver registered for local dispatch.", null, null, null);
                this.a = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void c() {
        s();
        spu.as(this.a, "Receiver not registered");
        j();
        long jC = qmu.c();
        if (jC > 0) {
            a();
            q();
            SystemClock.elapsedRealtime();
            this.c = true;
            ((Boolean) qmy.F.f()).booleanValue();
            super.p(2, "Scheduling upload with JobScheduler", null, null, null);
            Context contextF = f();
            ComponentName componentName = new ComponentName(contextF, "com.google.android.gms.analytics.AnalyticsJobService");
            int iD = d();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            JobInfo jobInfoBuild = new JobInfo.Builder(iD, componentName).setMinimumLatency(jC).setOverrideDeadline(jC + jC).setExtras(persistableBundle).build();
            super.p(2, "Scheduling job. JobID", Integer.valueOf(iD), null, null);
            sso.a(contextF, jobInfoBuild, "DispatchAlarm");
        }
    }
}
