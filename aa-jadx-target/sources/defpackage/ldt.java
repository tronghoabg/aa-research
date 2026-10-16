package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ldt implements defpackage.lbr {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.FeedbackNotifManager");
    public static final long b = 5000;
    public boolean e;
    public boolean f;
    public boolean g;
    private final android.content.Context i;
    private final android.content.SharedPreferences j;
    private boolean k;
    private java.lang.Boolean l;
    private com.google.android.libraries.surveys.SurveyData m;
    private android.os.PersistableBundle n;
    private java.lang.Boolean o;
    private java.lang.Runnable p;
    private java.lang.Boolean q;
    private defpackage.lby r;
    final android.os.Handler c = new android.os.Handler();
    public final java.lang.Runnable h = new defpackage.kmp(this, 16);
    final oip d = new defpackage.lds(this, 0);

    public ldt(android.content.Context context) {
        this.i = context;
        this.j = context.getSharedPreferences("GH.FeedbackNotifManager", 0);
    }

    private final void i() {
        this.k = true;
        this.j.edit().putLong("last_notification_time", k().toEpochMilli()).apply();
    }

    private final boolean j() {
        j$.time.Duration durationBetween = j$.time.Duration.between(j$.time.Instant.ofEpochMilli(this.j.getLong("last_notification_time", 0L)), k());
        j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(defpackage.acrr.c());
        ((defpackage.yqj) a.l().ai(3780)).x("Notification cooldown seconds: %s", durationOfSeconds.toSeconds());
        return durationBetween.compareTo(durationOfSeconds) < 0;
    }

    private static final j$.time.Instant k() {
        defpackage.ojm.a();
        return j$.time.Instant.now();
    }

    @Override // defpackage.lbr
    public final synchronized void a(defpackage.lby lbyVar) {
        ((defpackage.yqj) a.l().ai((char) 3762)).y("CSAT survey available: %s", lbyVar);
        if (this.g) {
            if (lbyVar != null) {
                defpackage.ldf.a().b(lbyVar);
            }
        } else {
            this.q = java.lang.Boolean.valueOf(lbyVar != null);
            this.r = lbyVar;
            h();
        }
    }

    @Override // defpackage.lbr
    public final synchronized void b(com.google.android.libraries.surveys.SurveyData surveyData, android.os.PersistableBundle persistableBundle) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 3763)).u("HaTS lapse-survey is available");
        if (!this.e && !this.f) {
            if (j()) {
                ((defpackage.yqj) yqmVar.l().ai((char) 3765)).u("Too soon since last notification");
                defpackage.omf.u().y(defpackage.zaa.HATS_LAPSE_SKIPPED_RECENT_NOTIFICATION, surveyData.a().a);
                return;
            } else {
                com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.g(this.i, surveyData, persistableBundle, 2);
                i();
                return;
            }
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 3764)).u("Skipping survey since sessionActive/timeoutPending");
        defpackage.omf.u().y(defpackage.zaa.HATS_LAPSE_SKIPPED_RECENT_SESSION, surveyData.a().a);
    }

    @Override // defpackage.lhn
    public final void d() {
        ((defpackage.yqj) a.l().ai((char) 3779)).u("Stopping FeedbackNotificationManager.");
        defpackage.omf.t().f(this.d);
    }

    @Override // defpackage.lbr
    public final synchronized void e(boolean z, com.google.android.libraries.surveys.SurveyData surveyData, android.os.PersistableBundle persistableBundle) {
        defpackage.yqm yqmVar = a;
        defpackage.ypu ypuVarF = yqmVar.f();
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 3766)).y("HaTS survey is available: %b", boolValueOf);
        if (this.g) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3767)).u("HaTS survey timeout exceeded");
            return;
        }
        this.l = boolValueOf;
        this.m = surveyData;
        this.n = persistableBundle;
        h();
    }

    @Override // defpackage.lhn
    public final void eQ() {
        ((defpackage.yqj) a.l().ai((char) 3778)).u("Starting FeedbackNotificationManager.");
        defpackage.omf.t().d(this.d, java.util.Arrays.asList(defpackage.yyh.UI, defpackage.yyh.NON_UI));
    }

    @Override // defpackage.lbr
    public final synchronized void f(boolean z, java.lang.Runnable runnable) {
        defpackage.yqm yqmVar = a;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        ((defpackage.yqj) yqmVar.l().ai((char) 3768)).y("Rating prompt is available: %b", boolValueOf);
        if (this.g) {
            return;
        }
        this.o = boolValueOf;
        this.p = runnable;
        h();
    }

    public final synchronized void g() {
        ((defpackage.yqj) a.l().ai((char) 3769)).u("Starting new FeedbackNotificationManager session.");
        this.e = true;
        this.g = false;
        this.k = false;
        this.l = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.c(this.i, true);
    }

    public final synchronized void h() {
        if (this.k) {
            ((defpackage.yqj) a.l().ai((char) 3777)).u("Already showed a notification.");
            return;
        }
        if (this.g || (this.l != null && this.o != null && this.q != null)) {
            this.c.removeCallbacks(this.h);
            this.f = false;
            if (j$.util.Objects.equals(this.q, java.lang.Boolean.TRUE)) {
                defpackage.lby lbyVar = this.r;
                lbyVar.getClass();
                if (lbyVar.v) {
                    ((defpackage.yqj) a.l().ai((char) 3776)).y("Showing a CSAT survey that is force-shown (%s)", this.r.name());
                    com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.f(this.i, this.r);
                    i();
                    return;
                }
            }
            if (j()) {
                ((defpackage.yqj) a.l().ai((char) 3775)).u("Too soon since last notification was shown. Will not show a new one.");
            } else if (java.lang.Boolean.TRUE.equals(this.l)) {
                ((defpackage.yqj) a.l().ai((char) 3774)).u("User is eligible to see a HaTS survey.");
                com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.g(this.i, this.m, this.n, 1);
                i();
            } else {
                if (java.lang.Boolean.TRUE.equals(this.q)) {
                    defpackage.lby lbyVar2 = this.r;
                    lbyVar2.getClass();
                    ((defpackage.yqj) a.l().ai((char) 3773)).y("User is eligible to see a CSAT survey (%s)", lbyVar2.name());
                    com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.f(this.i, lbyVar2);
                    i();
                    return;
                }
                if (java.lang.Boolean.TRUE.equals(this.o)) {
                    ((defpackage.yqj) a.l().ai((char) 3772)).u("User is eligible to see the rating prompt.");
                    android.content.Context context = this.i;
                    defpackage.yqm yqmVar = com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.a;
                    android.content.Intent component = new android.content.Intent().setComponent(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.companion.AndroidAutoActivity"));
                    component.putExtra("gh_feedback_show_rating_prompt", true);
                    defpackage.dte dteVarA = com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.a(context, component, 2132084944, 2132084943);
                    dteVarA.j(com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.NotificationCancelReceiver.c(context, "com.google.android.gearhead.feedback.DISMISS_RATING_PROMPT_NOTIFICATION"));
                    new defpackage.dun(context).b(null, 2131429272, dteVarA.a());
                    defpackage.omf.u().l(zap.a);
                    this.p.run();
                    i();
                } else {
                    ((defpackage.yqj) a.l().ai((char) 3771)).u("User is not eligible for any feedback notifications.");
                }
            }
            if (this.r != null) {
                defpackage.ldf.a().b(this.r);
            }
        }
    }
}
