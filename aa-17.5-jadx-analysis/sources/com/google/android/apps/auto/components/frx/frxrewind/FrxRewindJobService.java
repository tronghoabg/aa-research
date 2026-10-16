package com.google.android.apps.auto.components.frx.frxrewind;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.auto.components.frx.frxrewind.FrxRewindJobService;
import defpackage.acvh;
import defpackage.ebf;
import defpackage.lau;
import defpackage.lep;
import defpackage.omc;
import defpackage.qsz;
import defpackage.rbv;
import defpackage.rrc;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class FrxRewindJobService extends JobService {
    public static final yph a = yph.c("GH.FrxRewind.Svc");
    public qsz b;

    public static SharedPreferences a(Context context) {
        return lau.a().a(context, "frxrewind");
    }

    public static final void c(yzy yzyVar) {
        ebf.j().F((rrc) rrc.h(yxy.FRX, yzz.PREFLIGHT_FRX_REWIND, yzyVar).l());
    }

    public final void b(JobParameters jobParameters) {
        qsz qszVar = this.b;
        if (qszVar != null) {
            qszVar.g();
            this.b = null;
        }
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 3814)).u("Frx Rewind job is running");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = a(this).getLong("last_clear", 0L);
        long millis = TimeUnit.HOURS.toMillis(acvh.d());
        ((ype) ((ype) yphVar.f()).ai(3815)).R("currentTime: %d, lastClear: %d, frxRewindInterval: %d", Long.valueOf(jCurrentTimeMillis), Long.valueOf(j), Long.valueOf(millis));
        if (jCurrentTimeMillis - j < millis) {
            ((ype) ((ype) yphVar.f()).ai((char) 3816)).u("FRX Rewind interval not met. Not clearing FRX data.");
            c(yzy.uA);
            return false;
        }
        ((ype) ((ype) yphVar.f()).ai((char) 3812)).u("Connecting to Car Service...");
        qsz qszVarB = omc.b(this, new lep(this, jobParameters), new rbv() { // from class: leo
            @Override // defpackage.rbv
            public final void a(rbu rbuVar) {
                ((ype) ((ype) FrxRewindJobService.a.g()).ai((char) 3813)).y("Connection failed: %s", rbuVar);
                this.a.b(jobParameters);
            }
        }, null, 0);
        this.b = qszVarB;
        qszVarB.e();
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        ((ype) ((ype) a.f()).ai((char) 3817)).u("Frx rewind job is being stopped");
        return false;
    }
}
