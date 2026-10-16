package defpackage;

import android.app.job.JobParameters;
import com.google.android.apps.auto.components.frx.frxrewind.FrxRewindJobService;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class lep implements rbt {
    final /* synthetic */ JobParameters a;
    final /* synthetic */ FrxRewindJobService b;

    public lep(FrxRewindJobService frxRewindJobService, JobParameters jobParameters) {
        this.a = jobParameters;
        this.b = frxRewindJobService;
    }

    @Override // defpackage.rbt
    public final void a() {
        yph yphVar = FrxRewindJobService.a;
        ((ype) ((ype) yphVar.f()).ai((char) 3818)).u("FrxRewind starting");
        FrxRewindJobService frxRewindJobService = this.b;
        JobParameters jobParameters = this.a;
        try {
            try {
                jlo jloVar = new jlo(frxRewindJobService);
                try {
                    qsz qszVar = frxRewindJobService.b;
                    qszVar.getClass();
                    ono onoVar = new ono(qszVar);
                    onoVar.f("car_tos_main");
                    onoVar.f("car_tos_data");
                    onoVar.f("car_tos_safety");
                    jloVar.h();
                    FrxRewindJobService.a(frxRewindJobService).edit().putLong("last_clear", System.currentTimeMillis()).apply();
                    mas.c();
                    dsx dsxVar = new dsx(frxRewindJobService, "gearhead_alerts");
                    dsxVar.n(R.drawable.gs_android_auto_vd_24);
                    dsxVar.i(frxRewindJobService.getString(R.string.frx_rewind_notification_title));
                    dsxVar.h(frxRewindJobService.getString(R.string.frx_rewind_notification_description));
                    dsxVar.i = 1;
                    dsxVar.e(16, true);
                    new dug(frxRewindJobService).b(null, 376959957, dsxVar.a());
                    FrxRewindJobService.c(yzy.uz);
                    ((ype) ((ype) yphVar.f()).ai(3819)).u("Frx Rewind complete");
                    jloVar.close();
                } catch (Throwable th) {
                    try {
                        jloVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                frxRewindJobService.b(jobParameters);
            }
        } catch (RuntimeException e) {
            ((ype) ((ype) ((ype) FrxRewindJobService.a.g()).p(e)).ai(3820)).u("Frx Rewind encountered an exception.");
        }
    }

    @Override // defpackage.rbt
    public final void b(rbs rbsVar) {
        ((ype) ((ype) FrxRewindJobService.a.h()).ai((char) 3811)).y("onConnectionSuspended: %s", rbsVar);
    }
}
