package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes.dex */
public final class lrq extends lhf {
    public static final yph a = yph.c("GH.MediaSuggNotifier");
    static final long b;
    public final Context d;
    public eqj e;
    public ComponentName f;
    public lpt g;
    private final eqn i = new lnc(this, 8);
    public final eqn c = new lnc(this, 9);
    public final omm h = new omm(tfj.GEARHEAD_CAR_PROJECTION_MEDIA_SUGGESTION_ITEM_ALBUM_ART, new lrm(this));
    private final lrp l = new lrp(this);
    private final eqj k = tby.C(eqy.a(tby.C(lgx.b().a(mpz.d), new lqc(13))), new lqc(14));

    static {
        int i = ysy.a;
        b = ysq.a.b("MediaAlwaysAutoplayButtonNotification").c();
    }

    public lrq(Context context) {
        this.d = context;
    }

    public static void b(yzy yzyVar, ComponentName componentName) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_CONTENT_SUGGESTION, yzyVar);
        rrbVarH.p(componentName);
        ebf.j().F((rrc) rrbVarH.l());
    }

    private static Intent h(String str, ComponentName componentName) {
        Intent intent = new Intent(str).setPackage("com.google.android.projection.gearhead");
        intent.putExtra("media_suggestion_target_app_key", componentName);
        return intent;
    }

    private static CharSequence i(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) ? "" : charSequence;
    }

    public final void a(lpt lptVar, GhIcon ghIcon) {
        Context context = this.d;
        CharSequence charSequenceF = lptVar.f(context);
        CharSequence charSequenceE = lptVar.e(context);
        ComponentName componentNameA = lptVar.a();
        Intent intentH = h("com.google.android.gearhead.mediacontentsuggestionnotifier.ACTION_PLAY", componentNameA);
        intentH.putExtra("media_suggestion_playback_payload_key", lptVar.d());
        aaew aaewVar = new aaew(null);
        aaewVar.e = GhIcon.p(context, 2131233143);
        aaewVar.b = PendingIntent.getBroadcast(context, 0, intentH, 201326592);
        nul nulVar = new nul(aaewVar);
        num numVar = new num();
        numVar.d = ghIcon;
        numVar.c = PendingIntent.getBroadcast(context, 0, h("com.google.android.gearhead.mediacontentsuggestionnotifier.ACTION_ICON", componentNameA), 201326592);
        numVar.f = componentNameA.getPackageName();
        numVar.B = componentNameA;
        numVar.x = nuo.b;
        numVar.a = nup.LOW;
        numVar.m = i(charSequenceF);
        numVar.n = i(charSequenceE);
        numVar.l = true;
        numVar.q = nulVar;
        nur nurVarB = numVar.b();
        ComponentName componentNameA2 = lptVar.a();
        ((ype) ((ype) a.f()).ai(4240)).M("Posting notification: %s for component: %s", nurVarB, componentNameA2);
        nuj.b().j(yzr.MEDIA.name(), b, nurVarB);
        this.f = componentNameA2;
        b(yzy.gA, lptVar.a());
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        super.c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gearhead.mediacontentsuggestionnotifier.ACTION_ICON");
        intentFilter.addAction("com.google.android.gearhead.mediacontentsuggestionnotifier.ACTION_PLAY");
        dup.e(this.d, this.l, intentFilter, null, 2);
        this.k.fE(this, this.i);
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        super.d();
        this.d.unregisterReceiver(this.l);
        g();
        this.e = null;
        this.f = null;
    }

    public final void e() {
        if (this.f == null) {
            return;
        }
        ((ype) ((ype) a.f()).ai((char) 4229)).u("Canceling posted notification.");
        this.h.b(this.d);
        this.g = null;
        nuj.b().g(yzr.MEDIA.name(), b, this.f.getPackageName());
        this.f = null;
    }

    public final void f() {
        if (this.e == null) {
            return;
        }
        ((ype) a.l().ai((char) 4232)).u("Removing media suggestion observer.");
        this.e.k(this.c);
        this.e = null;
    }

    public final void g() {
        ((ype) a.l().ai((char) 4241)).u("Removing all observers.");
        this.k.k(this.i);
        f();
        e();
    }
}
