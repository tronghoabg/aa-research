package A7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.internal.measurement.zzcw;

/* loaded from: classes4.dex */
public final class F1 extends G1 {

    /* renamed from: d, reason: collision with root package name */
    public final AlarmManager f493d;

    /* renamed from: e, reason: collision with root package name */
    public C1 f494e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f495f;

    public F1(L1 l12) {
        super(l12);
        this.f493d = (AlarmManager) ((C0273n0) this.f421a).f973a.getSystemService("alarm");
    }

    @Override // A7.G1
    public final boolean j0() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.f493d;
        if (alarmManager != null) {
            alarmManager.cancel(m0());
        }
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((C0273n0) this.f421a).f973a.getSystemService("jobscheduler")) == null) {
            return false;
        }
        jobScheduler.cancel(l0());
        return false;
    }

    public final void k0() {
        JobScheduler jobScheduler;
        h0();
        zzj().f612n.c("Unscheduling upload");
        AlarmManager alarmManager = this.f493d;
        if (alarmManager != null) {
            alarmManager.cancel(m0());
        }
        n0().a();
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((C0273n0) this.f421a).f973a.getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(l0());
    }

    public final int l0() {
        if (this.f495f == null) {
            this.f495f = Integer.valueOf(("measurement" + ((C0273n0) this.f421a).f973a.getPackageName()).hashCode());
        }
        return this.f495f.intValue();
    }

    public final PendingIntent m0() {
        Context context = ((C0273n0) this.f421a).f973a;
        return zzcw.zza(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcw.zza);
    }

    public final AbstractC0272n n0() {
        if (this.f494e == null) {
            this.f494e = new C1(this, this.f509b.f577l, 1);
        }
        return this.f494e;
    }
}
