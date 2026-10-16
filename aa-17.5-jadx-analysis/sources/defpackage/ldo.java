package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.PersistableBundle;
import com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper;
import com.google.android.libraries.surveys.SurveyData;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ldo implements lbm {
    public static final yph a = yph.c("GH.FeedbackNotifManager");
    public static final long b = 5000;
    public boolean e;
    public boolean f;
    public boolean g;
    private final Context i;
    private final SharedPreferences j;
    private boolean k;
    private Boolean l;
    private SurveyData m;
    private PersistableBundle n;
    private Boolean o;
    private Runnable p;
    private Boolean q;
    private lbt r;
    final Handler c = new Handler();
    public final Runnable h = new kyl(this, 7);
    final ohv d = new ldn(this, 0);

    public ldo(Context context) {
        this.i = context;
        this.j = context.getSharedPreferences("GH.FeedbackNotifManager", 0);
    }

    private final void i() {
        this.k = true;
        this.j.edit().putLong("last_notification_time", k().toEpochMilli()).apply();
    }

    private final boolean j() {
        Duration durationBetween = Duration.between(Instant.ofEpochMilli(this.j.getLong("last_notification_time", 0L)), k());
        Duration durationOfSeconds = Duration.ofSeconds(acqp.c());
        ((ype) a.l().ai(3777)).x("Notification cooldown seconds: %s", durationOfSeconds.toSeconds());
        return durationBetween.compareTo(durationOfSeconds) < 0;
    }

    private static final Instant k() {
        oit.a();
        return Instant.now();
    }

    @Override // defpackage.lbm
    public final synchronized void a(lbt lbtVar) {
        ((ype) a.l().ai((char) 3759)).y("CSAT survey available: %s", lbtVar);
        if (this.g) {
            if (lbtVar != null) {
                lda.a().b(lbtVar);
            }
        } else {
            this.q = Boolean.valueOf(lbtVar != null);
            this.r = lbtVar;
            h();
        }
    }

    @Override // defpackage.lbm
    public final synchronized void b(SurveyData surveyData, PersistableBundle persistableBundle) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 3760)).u("HaTS lapse-survey is available");
        if (!this.e && !this.f) {
            if (j()) {
                ((ype) yphVar.l().ai((char) 3762)).u("Too soon since last notification");
                ebf.j().y(yyv.HATS_LAPSE_SKIPPED_RECENT_NOTIFICATION, surveyData.a().a);
                return;
            } else {
                FeedbackNotificationHelper.g(this.i, surveyData, persistableBundle, 2);
                i();
                return;
            }
        }
        ((ype) yphVar.l().ai((char) 3761)).u("Skipping survey since sessionActive/timeoutPending");
        ebf.j().y(yyv.HATS_LAPSE_SKIPPED_RECENT_SESSION, surveyData.a().a);
    }

    @Override // defpackage.lhg
    public final void c() {
        ((ype) a.l().ai((char) 3775)).u("Starting FeedbackNotificationManager.");
        olm.d().d(this.d, Arrays.asList(yxc.UI, yxc.NON_UI));
    }

    @Override // defpackage.lhg
    public final void d() {
        ((ype) a.l().ai((char) 3776)).u("Stopping FeedbackNotificationManager.");
        olm.d().f(this.d);
    }

    @Override // defpackage.lbm
    public final synchronized void e(boolean z, SurveyData surveyData, PersistableBundle persistableBundle) {
        yph yphVar = a;
        yop yopVarF = yphVar.f();
        Boolean boolValueOf = Boolean.valueOf(z);
        ((ype) ((ype) yopVarF).ai((char) 3763)).y("HaTS survey is available: %b", boolValueOf);
        if (this.g) {
            ((ype) ((ype) yphVar.f()).ai((char) 3764)).u("HaTS survey timeout exceeded");
            return;
        }
        this.l = boolValueOf;
        this.m = surveyData;
        this.n = persistableBundle;
        h();
    }

    @Override // defpackage.lbm
    public final synchronized void f(boolean z, Runnable runnable) {
        yph yphVar = a;
        Boolean boolValueOf = Boolean.valueOf(z);
        ((ype) yphVar.l().ai((char) 3765)).y("Rating prompt is available: %b", boolValueOf);
        if (this.g) {
            return;
        }
        this.o = boolValueOf;
        this.p = runnable;
        h();
    }

    public final synchronized void g() {
        ((ype) a.l().ai((char) 3766)).u("Starting new FeedbackNotificationManager session.");
        this.e = true;
        this.g = false;
        this.k = false;
        this.l = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        FeedbackNotificationHelper.c(this.i, true);
    }

    public final synchronized void h() {
        if (this.k) {
            ((ype) a.l().ai((char) 3774)).u("Already showed a notification.");
            return;
        }
        if (this.g || (this.l != null && this.o != null && this.q != null)) {
            this.c.removeCallbacks(this.h);
            this.f = false;
            if (Objects.equals(this.q, true)) {
                lbt lbtVar = this.r;
                lbtVar.getClass();
                if (lbtVar.v) {
                    ((ype) a.l().ai((char) 3773)).y("Showing a CSAT survey that is force-shown (%s)", this.r.name());
                    FeedbackNotificationHelper.f(this.i, this.r);
                    i();
                    return;
                }
            }
            if (j()) {
                ((ype) a.l().ai((char) 3772)).u("Too soon since last notification was shown. Will not show a new one.");
            } else if (Boolean.TRUE.equals(this.l)) {
                ((ype) a.l().ai((char) 3771)).u("User is eligible to see a HaTS survey.");
                FeedbackNotificationHelper.g(this.i, this.m, this.n, 1);
                i();
            } else {
                if (Boolean.TRUE.equals(this.q)) {
                    lbt lbtVar2 = this.r;
                    lbtVar2.getClass();
                    ((ype) a.l().ai((char) 3770)).y("User is eligible to see a CSAT survey (%s)", lbtVar2.name());
                    FeedbackNotificationHelper.f(this.i, lbtVar2);
                    i();
                    return;
                }
                if (Boolean.TRUE.equals(this.o)) {
                    ((ype) a.l().ai((char) 3769)).u("User is eligible to see the rating prompt.");
                    Context context = this.i;
                    yph yphVar = FeedbackNotificationHelper.a;
                    Intent component = new Intent().setComponent(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.companion.AndroidAutoActivity"));
                    component.putExtra("gh_feedback_show_rating_prompt", true);
                    dsx dsxVarA = FeedbackNotificationHelper.a(context, component, R.string.rating_prompt_notification_title, R.string.rating_prompt_notification_body);
                    dsxVarA.j(FeedbackNotificationHelper.NotificationCancelReceiver.c(context, "com.google.android.gearhead.feedback.DISMISS_RATING_PROMPT_NOTIFICATION"));
                    new dug(context).b(null, R.id.rating_prompt_notification_id, dsxVarA.a());
                    ebf.j().l(yzk.NOTIFICATION_SHOWN);
                    this.p.run();
                    i();
                } else {
                    ((ype) a.l().ai((char) 3768)).u("User is not eligible for any feedback notifications.");
                }
            }
            if (this.r != null) {
                lda.a().b(this.r);
            }
        }
    }
}
