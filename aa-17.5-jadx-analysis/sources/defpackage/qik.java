package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.google.android.apps.auto.components.feedback.hats.HatsDownloadService;
import com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper;
import com.google.android.apps.auto.components.telemetry.TelemetryEvent;
import com.google.android.gearhead.feedback.hats.HatsLapseDetector;
import com.google.android.gms.car.CarInfo;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qik implements ldl {
    public static final yph a = yph.c("GH.HatsManager");
    public final Context b;
    public final Random c;
    public final HatsLapseDetector d;
    public final qij e;
    public final qij f;
    public final yfq g;
    ohv h;
    public PersistableBundle i;
    public boolean j;
    public int k;

    public qik(Context context) {
        Random random = new Random();
        HatsLapseDetector hatsLapseDetector = new HatsLapseDetector(context);
        qij qijVar = new qij(this, abrr.TRIGGER_TYPE_SESSION_END);
        this.e = qijVar;
        qij qijVar2 = new qij(this, abrr.TRIGGER_TYPE_LAPSE);
        this.f = qijVar2;
        this.g = yfq.r(qijVar, qijVar2);
        this.b = context;
        this.c = random;
        this.d = hatsLapseDetector;
    }

    @Override // defpackage.lhg
    public final void c() {
        this.h = new ohv() { // from class: qih
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.CharSequence, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // defpackage.ohv
            public final void a(TelemetryEvent telemetryEvent) {
                yxb yxbVar = telemetryEvent.b;
                int i = yxbVar.b & 8192;
                qik qikVar = this.a;
                if (i != 0) {
                    yyz yyzVar = yxbVar.p;
                    if (yyzVar == null) {
                        yyzVar = yyz.a;
                    }
                    int iOrdinal = yyv.b(yyzVar.d).ordinal();
                    if (iOrdinal == 6) {
                        qikVar.j = true;
                    } else if (iOrdinal == 27) {
                        int iAp = a.ap(telemetryEvent.b.A);
                        yph yphVar = qik.a;
                        ((ype) yphVar.l().ai((char) 7350)).u("Starting new HatsManager session.");
                        qikVar.k = iAp;
                        Context context = qikVar.b;
                        yph yphVar2 = HatsDownloadService.a;
                        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                        jobScheduler.getClass();
                        jobScheduler.cancel(351620553);
                        FeedbackNotificationHelper.d(context);
                        acrn.c();
                        yfq yfqVar = qikVar.g;
                        for (int i2 = 0; i2 < ((yls) yfqVar).c; i2++) {
                            qij qijVar = (qij) yfqVar.get(i2);
                            qijVar.d();
                            qijVar.c(acrn.c());
                        }
                        HatsLapseDetector hatsLapseDetector = qikVar.d;
                        if (iAp == 2) {
                            ((ype) HatsLapseDetector.a.l().ai((char) 7342)).u("Canceling lapse detection job.");
                            hatsLapseDetector.c.cancel(219202846);
                        }
                        int i3 = qikVar.k;
                        int i4 = i3 - 1;
                        if (i3 == 0) {
                            throw null;
                        }
                        jri jriVar = i4 != 1 ? jri.a : jri.b;
                        PersistableBundle persistableBundle = new PersistableBundle();
                        persistableBundle.putString("app_ui_mode", jriVar.name());
                        persistableBundle.putString(CloudRecognizerProtocolStrings.APP_VERSION, lnm.J(context.getPackageName(), context));
                        String strJ = lnm.J("com.google.android.gms", context);
                        if (strJ.indexOf(32) != -1) {
                            strJ = strJ.substring(0, strJ.indexOf(32));
                        }
                        persistableBundle.putString("gmscore_version", strJ);
                        persistableBundle.putString("android_version", Build.VERSION.RELEASE);
                        persistableBundle.putString("phone_make", Build.MANUFACTURER);
                        persistableBundle.putString("phone_model", Build.MODEL);
                        CarInfo carInfoB = kiq.a().b();
                        persistableBundle.putString("car_make", carInfoB != null ? carInfoB.a : "UNAVAILABLE");
                        persistableBundle.putString("car_model", carInfoB != null ? carInfoB.b : "UNAVAILABLE");
                        persistableBundle.putString("hu_make", carInfoB != null ? carInfoB.i : "UNAVAILABLE");
                        persistableBundle.putString("hu_model", carInfoB != null ? carInfoB.j : "UNAVAILABLE");
                        persistableBundle.putString("hu_sw_build", carInfoB != null ? carInfoB.k : "UNAVAILABLE");
                        persistableBundle.putString("hu_sw_version", carInfoB != null ? carInfoB.l : "UNAVAILABLE");
                        String strC = kiq.a().c();
                        persistableBundle.putString("connection_type", strC != null ? strC : "UNAVAILABLE");
                        String strSubstring = "com.google.android.projection.gearhead".substring(30);
                        if (acrn.h()) {
                            persistableBundle.putString("gearhead_package", strSubstring);
                        } else {
                            persistableBundle.putString("com.google.android.projection.gearhead", strSubstring);
                        }
                        persistableBundle.putString("is_user_googler", String.valueOf(acqa.c()));
                        persistableBundle.putString("locale", Locale.getDefault().toString());
                        qikVar.i = persistableBundle;
                        ((ype) yphVar.l().ai(7352)).y("Survey PSD is: %s", qikVar.i);
                        qikVar.j = false;
                    } else if (iOrdinal == 29) {
                        if (qikVar.j) {
                            ((ype) qik.a.l().ai((char) 7353)).u("Suppressing survey");
                        } else {
                            Optional optionalA = qikVar.e.a();
                            if (optionalA.isEmpty()) {
                                ((ype) qik.a.l().ai((char) 7349)).u("No available session end surveys to show");
                            } else if (TextUtils.isEmpty(optionalA.get())) {
                                ((ype) qik.a.l().ai((char) 7348)).u("No trigger ID set on session end survey");
                            } else if (!acrn.f() || qikVar.c.nextFloat() <= acrn.b()) {
                                ((ype) qik.a.l().ai((char) 7347)).y("Will attempt to download survey with trigger ID: %s", optionalA.get());
                                HatsDownloadService.b(qikVar.b, (String) optionalA.get(), qikVar.i, 1);
                            } else {
                                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.HATS_SURVEY, yzy.ht).l());
                            }
                            Optional optionalA2 = qikVar.f.a();
                            if (optionalA2.isEmpty()) {
                                ((ype) qik.a.l().ai((char) 7356)).u("No available lapse surveys to show");
                            } else if (TextUtils.isEmpty(optionalA2.get())) {
                                ((ype) qik.a.l().ai((char) 7355)).u("No trigger ID set on lapse survey");
                            } else {
                                ((ype) qik.a.l().ai((char) 7354)).y("Will schedule lapse detector job with trigger ID: %s", optionalA2.get());
                                HatsLapseDetector hatsLapseDetector2 = qikVar.d;
                                int i5 = qikVar.k;
                                PersistableBundle persistableBundle2 = qikVar.i;
                                Object obj = optionalA2.get();
                                if (i5 == 2) {
                                    yph yphVar3 = HatsLapseDetector.a;
                                    ((ype) yphVar3.l().ai((char) 7343)).u("Handling lapse detection scheduling.");
                                    if (acrq.e()) {
                                        PersistableBundle persistableBundle3 = new PersistableBundle();
                                        persistableBundle3.putString("SURVEY_TRIGGER_ID", (String) obj);
                                        persistableBundle3.putPersistableBundle("SURVEY_PSD", persistableBundle2);
                                        long millis = TimeUnit.SECONDS.toMillis((int) acrq.c());
                                        long millis2 = TimeUnit.SECONDS.toMillis((int) acrq.b());
                                        if (acrn.c().c.containsKey(obj)) {
                                            if (((abro) acrn.c().c.get(obj)) == null) {
                                                throw new IllegalArgumentException();
                                            }
                                            long millis3 = TimeUnit.HOURS.toMillis(r1.b);
                                            long millis4 = TimeUnit.HOURS.toMillis(r1.b + r1.c);
                                            ((ype) yphVar3.l().ai(7344)).G("Lapse trigger has overridden waiting period: minimum is %d ms, maximum is %d ms", millis3, millis4);
                                            millis = millis3;
                                            millis2 = millis4;
                                        }
                                        hatsLapseDetector2.c.schedule(new JobInfo.Builder(219202846, new ComponentName(hatsLapseDetector2.b, (Class<?>) HatsLapseDetector.LapseService.class)).setMinimumLatency(millis).setOverrideDeadline(millis2).setPersisted(true).setExtras(persistableBundle3).build());
                                    }
                                }
                            }
                        }
                    }
                }
                yfq yfqVar2 = qikVar.g;
                for (int i6 = 0; i6 < ((yls) yfqVar2).c; i6++) {
                    ((qij) yfqVar2.get(i6)).b(telemetryEvent);
                }
            }
        };
        ((ype) a.l().ai((char) 7357)).u("Starting HatsManager.");
        olm.d().d(this.h, Arrays.asList(yxc.UI, yxc.NON_UI));
    }

    @Override // defpackage.lhg
    public final void d() {
        ((ype) a.l().ai((char) 7358)).u("Stopping HatsManager.");
        olm.d().f(this.h);
    }
}
