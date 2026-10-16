package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import j$.time.Instant;

/* loaded from: classes.dex */
public final class lrt extends lhf {
    public static final yfy c;
    public final Context d;
    public ComponentName e;
    public ComponentName f;
    public Instant g;
    public Instant h;
    private final eqn k = new lnc(this, 11);
    private final eqj l = tby.C(tby.w(tby.C(lgx.b().a(mpz.d), new lqc(15)), new lqc(16)), new lqc(17));
    private static final yph i = yph.c("GH.MediaPBErrNotifier");
    public static final Duration a = Duration.ofSeconds(30);
    public static final Duration b = Duration.ofSeconds(60);

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e(1, Integer.valueOf(R.string.error_code_app_error));
        yfuVar.e(2, Integer.valueOf(R.string.error_code_not_supported));
        yfuVar.e(3, Integer.valueOf(R.string.error_code_authentication_expired));
        yfuVar.e(4, Integer.valueOf(R.string.error_code_premium_account_required));
        yfuVar.e(5, Integer.valueOf(R.string.error_code_concurrent_stream_limit));
        yfuVar.e(6, Integer.valueOf(R.string.error_code_parental_control_restricted));
        yfuVar.e(7, Integer.valueOf(R.string.error_code_not_available_in_region));
        yfuVar.e(8, Integer.valueOf(R.string.error_code_content_already_playing));
        yfuVar.e(9, Integer.valueOf(R.string.error_code_skip_limit_reached));
        yfuVar.e(10, Integer.valueOf(R.string.error_code_action_aborted));
        yfuVar.e(11, Integer.valueOf(R.string.error_code_end_of_queue));
        c = yfuVar.d(true);
    }

    public lrt(Context context) {
        this.d = context;
        loh.b().fE(this, new lnc(this, 12));
    }

    public final void a(String str, ComponentName componentName, boolean z, boolean z2) {
        if (!z) {
            ((ype) i.l().ai((char) 4250)).u("A non-fatal playback error occurred, background app toast request not allowed.");
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.gT);
            rrbVarH.p(componentName);
            ohsVarJ.F(rrbVarH.l());
            return;
        }
        obs.a().g(this.d, componentName, str, 1);
        ((ype) i.l().ai(4251)).N("An error toast was requested: <%s> isCustom=%b", str, z2);
        ohs ohsVarJ2 = ebf.j();
        rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.gS);
        rrbVarH2.p(componentName);
        ohsVarJ2.F(rrbVarH2.l());
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        super.c();
        if (acsx.E()) {
            oit.a();
            this.h = Instant.now();
            this.l.fE(this, this.k);
        }
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        super.d();
        if (acsx.E()) {
            this.l.k(this.k);
            this.g = null;
            this.f = null;
            this.h = null;
        }
    }
}
