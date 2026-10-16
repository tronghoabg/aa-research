package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qjg implements defpackage.ldq {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.HatsManager");
    public final android.content.Context b;
    public final java.util.Random c;
    public final com.google.android.gearhead.feedback.hats.HatsLapseDetector d;
    public final defpackage.qjf e;
    public final defpackage.qjf f;
    public final defpackage.ygw g;
    oip h;
    public android.os.PersistableBundle i;
    public boolean j;
    public int k;

    public qjg(android.content.Context context) {
        java.util.Random random = new java.util.Random();
        com.google.android.gearhead.feedback.hats.HatsLapseDetector hatsLapseDetector = new com.google.android.gearhead.feedback.hats.HatsLapseDetector(context);
        defpackage.qjf qjfVar = new defpackage.qjf(this, defpackage.absu.TRIGGER_TYPE_SESSION_END);
        this.e = qjfVar;
        defpackage.qjf qjfVar2 = new defpackage.qjf(this, defpackage.absu.TRIGGER_TYPE_LAPSE);
        this.f = qjfVar2;
        this.g = defpackage.ygw.r(qjfVar, qjfVar2);
        this.b = context;
        this.c = random;
        this.d = hatsLapseDetector;
    }

    @Override // defpackage.lhn
    public final void d() {
        ((defpackage.yqj) a.l().ai((char) 7383)).u("Stopping HatsManager.");
        defpackage.omf.t().f(this.h);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.h = new oip() { // from class: qjd
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.CharSequence, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.CharSequence, java.lang.Object] */
            public final void a(com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent) {
                defpackage.yyg yygVar = telemetryEvent.b;
                int i = yygVar.b & 8192;
                defpackage.qjg qjgVar = this.a;
                if (i != 0) {
                    defpackage.zae zaeVar = yygVar.p;
                    if (zaeVar == null) {
                        zaeVar = defpackage.zae.a;
                    }
                    int iOrdinal = defpackage.zaa.b(zaeVar.d).ordinal();
                    if (iOrdinal == 6) {
                        qjgVar.j = true;
                    } else if (iOrdinal == 27) {
                        int iAo = defpackage.a.ao(telemetryEvent.b.A);
                        defpackage.yqm yqmVar = defpackage.qjg.a;
                        ((defpackage.yqj) yqmVar.l().ai((char) 7375)).u("Starting new HatsManager session.");
                        qjgVar.k = iAo;
                        android.content.Context context = qjgVar.b;
                        defpackage.yqm yqmVar2 = com.google.android.apps.auto.components.feedback.hats.HatsDownloadService.a;
                        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
                        jobScheduler.getClass();
                        jobScheduler.cancel(351620553);
                        com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.d(context);
                        acsp.c();
                        defpackage.ygw ygwVar = qjgVar.g;
                        for (int i2 = 0; i2 < ((defpackage.ymx) ygwVar).c; i2++) {
                            defpackage.qjf qjfVar = (defpackage.qjf) ygwVar.get(i2);
                            qjfVar.d();
                            qjfVar.c(acsp.c());
                        }
                        com.google.android.gearhead.feedback.hats.HatsLapseDetector hatsLapseDetector = qjgVar.d;
                        if (iAo == 2) {
                            ((defpackage.yqj) com.google.android.gearhead.feedback.hats.HatsLapseDetector.a.l().ai((char) 7367)).u("Canceling lapse detection job.");
                            hatsLapseDetector.c.cancel(219202846);
                        }
                        int i3 = qjgVar.k;
                        int i4 = i3 - 1;
                        if (i3 == 0) {
                            throw null;
                        }
                        defpackage.jrj jrjVar = i4 != 1 ? defpackage.jrj.a : defpackage.jrj.b;
                        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
                        persistableBundle.putString("app_ui_mode", jrjVar.name());
                        persistableBundle.putString("app_version", defpackage.kzi.m(context.getPackageName(), context));
                        java.lang.String strM = defpackage.kzi.m("com.google.android.gms", context);
                        if (strM.indexOf(32) != -1) {
                            strM = strM.substring(0, strM.indexOf(32));
                        }
                        persistableBundle.putString("gmscore_version", strM);
                        persistableBundle.putString("android_version", android.os.Build.VERSION.RELEASE);
                        persistableBundle.putString("phone_make", android.os.Build.MANUFACTURER);
                        persistableBundle.putString("phone_model", android.os.Build.MODEL);
                        com.google.android.gms.car.CarInfo carInfoB = defpackage.kiv.a().b();
                        persistableBundle.putString("car_make", carInfoB != null ? carInfoB.a : "UNAVAILABLE");
                        persistableBundle.putString("car_model", carInfoB != null ? carInfoB.b : "UNAVAILABLE");
                        persistableBundle.putString("hu_make", carInfoB != null ? carInfoB.i : "UNAVAILABLE");
                        persistableBundle.putString("hu_model", carInfoB != null ? carInfoB.j : "UNAVAILABLE");
                        persistableBundle.putString("hu_sw_build", carInfoB != null ? carInfoB.k : "UNAVAILABLE");
                        persistableBundle.putString("hu_sw_version", carInfoB != null ? carInfoB.l : "UNAVAILABLE");
                        java.lang.String strC = defpackage.kiv.a().c();
                        persistableBundle.putString("connection_type", strC != null ? strC : "UNAVAILABLE");
                        java.lang.String strSubstring = "com.google.android.projection.gearhead".substring(30);
                        if (acsp.h()) {
                            persistableBundle.putString("gearhead_package", strSubstring);
                        } else {
                            persistableBundle.putString("com.google.android.projection.gearhead", strSubstring);
                        }
                        persistableBundle.putString("is_user_googler", java.lang.String.valueOf(defpackage.acrc.c()));
                        persistableBundle.putString("locale", java.util.Locale.getDefault().toString());
                        qjgVar.i = persistableBundle;
                        ((defpackage.yqj) yqmVar.l().ai(7377)).y("Survey PSD is: %s", qjgVar.i);
                        qjgVar.j = false;
                    } else if (iOrdinal == 29) {
                        if (qjgVar.j) {
                            ((defpackage.yqj) defpackage.qjg.a.l().ai((char) 7378)).u("Suppressing survey");
                        } else {
                            j$.util.Optional optionalA = qjgVar.e.a();
                            if (optionalA.isEmpty()) {
                                ((defpackage.yqj) defpackage.qjg.a.l().ai((char) 7374)).u("No available session end surveys to show");
                            } else if (android.text.TextUtils.isEmpty(optionalA.get())) {
                                ((defpackage.yqj) defpackage.qjg.a.l().ai((char) 7373)).u("No trigger ID set on session end survey");
                            } else if (!acsp.f() || qjgVar.c.nextFloat() <= acsp.b()) {
                                ((defpackage.yqj) defpackage.qjg.a.l().ai((char) 7372)).y("Will attempt to download survey with trigger ID: %s", optionalA.get());
                                com.google.android.apps.auto.components.feedback.hats.HatsDownloadService.b(qjgVar.b, (java.lang.String) optionalA.get(), qjgVar.i, 1);
                            } else {
                                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.HATS_SURVEY, defpackage.zbd.ht).l());
                            }
                            j$.util.Optional optionalA2 = qjgVar.f.a();
                            if (optionalA2.isEmpty()) {
                                ((defpackage.yqj) defpackage.qjg.a.l().ai((char) 7381)).u("No available lapse surveys to show");
                            } else if (android.text.TextUtils.isEmpty(optionalA2.get())) {
                                ((defpackage.yqj) defpackage.qjg.a.l().ai((char) 7380)).u("No trigger ID set on lapse survey");
                            } else {
                                ((defpackage.yqj) defpackage.qjg.a.l().ai((char) 7379)).y("Will schedule lapse detector job with trigger ID: %s", optionalA2.get());
                                com.google.android.gearhead.feedback.hats.HatsLapseDetector hatsLapseDetector2 = qjgVar.d;
                                int i5 = qjgVar.k;
                                android.os.PersistableBundle persistableBundle2 = qjgVar.i;
                                java.lang.Object obj = optionalA2.get();
                                if (i5 == 2) {
                                    defpackage.yqm yqmVar3 = com.google.android.gearhead.feedback.hats.HatsLapseDetector.a;
                                    ((defpackage.yqj) yqmVar3.l().ai((char) 7368)).u("Handling lapse detection scheduling.");
                                    if (acss.e()) {
                                        android.os.PersistableBundle persistableBundle3 = new android.os.PersistableBundle();
                                        persistableBundle3.putString("SURVEY_TRIGGER_ID", (java.lang.String) obj);
                                        persistableBundle3.putPersistableBundle("SURVEY_PSD", persistableBundle2);
                                        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis((int) acss.c());
                                        long millis2 = java.util.concurrent.TimeUnit.SECONDS.toMillis((int) acss.b());
                                        if (acsp.c().c.containsKey(obj)) {
                                            absr absrVar = (absr) acsp.c().c.get(obj);
                                            if (absrVar == null) {
                                                throw new java.lang.IllegalArgumentException();
                                            }
                                            long millis3 = java.util.concurrent.TimeUnit.HOURS.toMillis(absrVar.b);
                                            long millis4 = java.util.concurrent.TimeUnit.HOURS.toMillis(absrVar.b + absrVar.c);
                                            ((defpackage.yqj) yqmVar3.l().ai(7369)).G("Lapse trigger has overridden waiting period: minimum is %d ms, maximum is %d ms", millis3, millis4);
                                            millis = millis3;
                                            millis2 = millis4;
                                        }
                                        hatsLapseDetector2.c.schedule(new android.app.job.JobInfo.Builder(219202846, new android.content.ComponentName(hatsLapseDetector2.b, (java.lang.Class<?>) com.google.android.gearhead.feedback.hats.HatsLapseDetector.LapseService.class)).setMinimumLatency(millis).setOverrideDeadline(millis2).setPersisted(true).setExtras(persistableBundle3).build());
                                    }
                                }
                            }
                        }
                    }
                }
                defpackage.ygw ygwVar2 = qjgVar.g;
                for (int i6 = 0; i6 < ((defpackage.ymx) ygwVar2).c; i6++) {
                    ((defpackage.qjf) ygwVar2.get(i6)).b(telemetryEvent);
                }
            }
        };
        ((defpackage.yqj) a.l().ai((char) 7382)).u("Starting HatsManager.");
        defpackage.omf.t().d(this.h, java.util.Arrays.asList(defpackage.yyh.UI, defpackage.yyh.NON_UI));
    }
}
