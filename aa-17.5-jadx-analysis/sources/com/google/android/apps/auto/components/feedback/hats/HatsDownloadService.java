package com.google.android.apps.auto.components.feedback.hats;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import defpackage.ebf;
import defpackage.ohs;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.xx;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import defpackage.zaa;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class HatsDownloadService extends JobService {
    public static final yph a = yph.c("GH.HatsDownloadService");
    static final Executor b = Executors.newSingleThreadExecutor();
    public JobParameters c;

    public static void b(Context context, String str, PersistableBundle persistableBundle, int i) {
        ComponentName componentName = new ComponentName(context, HatsDownloadService.class.getName());
        PersistableBundle persistableBundle2 = new PersistableBundle();
        persistableBundle2.putString("trigger_id", str);
        persistableBundle2.putString("survey_type", i != 1 ? "LAPSE" : "SESSION_END");
        persistableBundle2.putPersistableBundle("survey_psd", persistableBundle);
        JobInfo.Builder requiresStorageNotLow = new JobInfo.Builder(351620553, componentName).setPersisted(true).setExtras(persistableBundle2).setRequiredNetworkType(3).setRequiresBatteryNotLow(true).setRequiresStorageNotLow(true);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        jobScheduler.schedule(requiresStorageNotLow.build());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r4, android.os.PersistableBundle r5, java.lang.String r6) {
        /*
            r3 = this;
            yph r0 = com.google.android.apps.auto.components.feedback.hats.HatsDownloadService.a
            yop r0 = r0.f()
            java.lang.String r1 = "Downloading HaTS survey (%s)."
            r2 = 3739(0xe9b, float:5.24E-42)
            defpackage.a.bF(r0, r1, r4, r2)
            int r0 = r6.hashCode()
            r1 = 72203533(0x44dbd0d, float:2.4184442E-36)
            if (r0 == r1) goto L25
            r1 = 2131763058(0x7f101f72, float:1.915721E38)
            if (r0 != r1) goto Le6
            java.lang.String r0 = "SESSION_END"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto Le6
            r6 = 1
            goto L2e
        L25:
            java.lang.String r0 = "LAPSE"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto Le6
            r6 = 2
        L2e:
            org.chromium.net.CronetEngine$Builder r0 = new org.chromium.net.CronetEngine$Builder     // Catch: java.lang.Throwable -> L38
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L38
            org.chromium.net.CronetEngine r0 = r0.build()     // Catch: java.lang.Throwable -> L38
            goto L45
        L38:
            org.chromium.net.impl.JavaCronetProvider r0 = new org.chromium.net.impl.JavaCronetProvider
            r0.<init>(r3)
            org.chromium.net.CronetEngine$Builder r0 = r0.createBuilder()
            org.chromium.net.CronetEngine r0 = r0.build()
        L45:
            defpackage.vuf.M(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto Lde
            ldk r0 = new ldk
            r0.<init>(r3, r4, r6, r5)
            boolean r5 = defpackage.acrn.e()
            whg r6 = new whg
            r6.<init>(r3, r4, r0, r5)
            ohs r3 = defpackage.ebf.j()
            yxy r5 = defpackage.yxy.GEARHEAD
            yzz r0 = defpackage.yzz.HATS_SURVEY
            yzy r1 = defpackage.yzy.hp
            rrb r5 = defpackage.rrc.h(r5, r0, r1)
            r5.x(r4)
            rqy r4 = r5.l()
            r3.F(r4)
            java.lang.Object r3 = r6.d
            whl r4 = defpackage.whl.a
            java.lang.String r3 = (java.lang.String) r3
            r4.i = r3
            java.lang.String r3 = r4.i
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L8b
            java.lang.String r3 = "SurveyController"
            java.lang.String r5 = "API key was not set or set empty by the client. API key is needed if survey is targeted for signed out users as well. For surveys targeted for only signin users, api key is not needed."
            android.util.Log.d(r3, r5)
        L8b:
            java.lang.String r3 = r4.i
            wht r3 = r4.a(r6, r3)
            ackx r5 = defpackage.ackx.a
            abnp r5 = r5.n()
            java.lang.String r0 = r4.i
            r5.t()
            abnv r1 = r5.b
            ackx r1 = (defpackage.ackx) r1
            r0.getClass()
            r1.b = r0
            r5.t()
            abnv r0 = r5.b
            ackx r0 = (defpackage.ackx) r0
            r1 = 4
            int r1 = defpackage.aclh.c(r1)
            r0.c = r1
            abnv r5 = r5.q()
            ackx r5 = (defpackage.ackx) r5
            java.lang.String r0 = "AIzaSyBmGDOmYcGmylWMKTdQxmf5vXWAuybv7qA"
            wht r0 = r4.a(r6, r0)
            whk r1 = new whk
            r1.<init>(r4, r6, r3)
            if (r5 != 0) goto Lce
            java.lang.String r3 = "NetworkCallerGrpc"
            java.lang.String r4 = "Survey startup config request was null"
            android.util.Log.e(r3, r4)
            return
        Lce:
            long r3 = defpackage.wid.a
            java.util.concurrent.Executor r3 = defpackage.whq.a()
            uze r4 = new uze
            r6 = 3
            r4.<init>(r0, r5, r1, r6)
            r3.execute(r4)
            return
        Lde:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Trigger ID cannot be null or empty."
            r3.<init>(r4)
            throw r3
        Le6:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.feedback.hats.HatsDownloadService.a(java.lang.String, android.os.PersistableBundle, java.lang.String):void");
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        PersistableBundle extras = jobParameters.getExtras();
        String string = extras.getString("trigger_id");
        String string2 = extras.getString("survey_type");
        PersistableBundle persistableBundle = extras.getPersistableBundle("survey_psd");
        string.getClass();
        string2.getClass();
        persistableBundle.getClass();
        b.execute(new xx(this, string, persistableBundle, string2, 14));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("trigger_id");
        string.getClass();
        ((ype) ((ype) a.f()).ai((char) 3740)).y("HaTS survey %s download timed out.", string);
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.HATS_SURVEY, yzy.hr);
        rrbVarH.x(string);
        rrbVarH.v(zaa.HATS_JOB_TIMEOUT);
        ohsVarJ.F(rrbVarH.l());
        return false;
    }
}
