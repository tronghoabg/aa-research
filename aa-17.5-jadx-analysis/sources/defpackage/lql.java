package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class lql implements eqn {
    static final Duration a = Duration.ofSeconds(10);
    static final Duration b = Duration.ofSeconds(10);
    static final Duration c = Duration.ofSeconds(60);
    public static final /* synthetic */ int m = 0;
    public final SharedPreferences d;
    public boolean i;
    public lqq j;
    gjv l;
    private final Context n;
    private int o;
    public boolean k = false;
    public final Handler e = new Handler(Looper.getMainLooper());
    public boolean g = false;
    public boolean h = false;
    public final List f = new ArrayList();

    public lql(Context context, SharedPreferences sharedPreferences) {
        this.n = context;
        this.d = sharedPreferences;
        this.o = sharedPreferences.getInt("autoplay_media_pause_history", 0);
    }

    public final void b(String str, boolean z) {
        ((ype) lqu.a.l().ai(4192)).N("Key (%s) committed to: %b", str, z);
        this.d.edit().putBoolean(str, z).commit();
        oit.a();
        this.f.add(new lqk(Instant.now(), str, z));
    }

    public final void c(boolean z) {
        int i = this.o;
        this.o = ((z ? 1 : 0) | (i + i)) & ((1 << ((int) acsx.c())) - 1);
        this.d.edit().putInt("autoplay_media_pause_history", this.o).apply();
    }

    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        lqq lqqVar;
        lqm lqmVar = (lqm) obj;
        boolean z = lqmVar.b;
        yph yphVar = lqu.a;
        boolean z2 = this.h;
        this.h = z || lqmVar.c == 2;
        boolean z3 = this.g;
        this.g = lkb.b(lqmVar.a);
        if (acsx.y() && z3 && !this.g && !this.k && (lqqVar = this.j) != null) {
            oit.a();
            if (Duration.between(lqqVar.d, Instant.now()).compareTo(Duration.ofSeconds(acsx.d())) < 0) {
                this.k = true;
                c(true);
                if (Integer.bitCount(this.o) >= acsx.e()) {
                    SharedPreferences sharedPreferences = this.d;
                    if (sharedPreferences.getBoolean("disable_autoplay_hun_shown", false)) {
                        ((ype) ((ype) lqu.a.f()).ai((char) 4193)).u("Pause history higher than required count, but disable autoplay HUN already shown");
                    } else if (kio.b().r()) {
                        ((ype) ((ype) lqu.a.f()).ai((char) 4195)).u("Pause history higher than required count, triggering disable autoplay HUN");
                        Context context = this.n;
                        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.MEDIA_AUTOPLAY, yzy.gs).l());
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.gearhead.autoplay.ACTION_DISABLE_AUTOPLAY").setPackage(context.getPackageName()), 201326592);
                        aaew aaewVar = new aaew(null);
                        aaewVar.d = context.getString(R.string.disable_autoplay_hun_turn_off_button);
                        aaewVar.b = broadcast;
                        nul nulVar = new nul(aaewVar);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 1, new Intent("com.google.android.gearhead.autoplay.ACTION_KEEP_ON_AUTOPLAY").setPackage(context.getPackageName()), 201326592);
                        aaew aaewVar2 = new aaew(null);
                        aaewVar2.d = context.getString(R.string.disable_autoplay_hun_keep_on_button);
                        aaewVar2.b = broadcast2;
                        nul nulVar2 = new nul(aaewVar2);
                        num numVar = new num();
                        numVar.f = context.getPackageName();
                        numVar.x = nuo.a;
                        numVar.a = nup.HIGH;
                        numVar.m = context.getString(R.string.disable_autoplay_hun_title);
                        numVar.n = context.getString(R.string.disable_autoplay_hun_body);
                        numVar.p = nulVar;
                        numVar.q = nulVar2;
                        nuj.b().j(yzr.MEDIA.name(), 881096330L, numVar.b());
                        sharedPreferences.edit().putBoolean("disable_autoplay_hun_shown", true).apply();
                    } else {
                        ((ype) ((ype) lqu.a.f()).ai((char) 4194)).u("Pause history higher than required count, but not connected to car");
                    }
                }
            }
        }
        if (acsx.s() && this.h) {
            this.e.removeCallbacksAndMessages(null);
            return;
        }
        if (!(acsx.s() && z2) && z3 == this.g) {
            return;
        }
        Handler handler = this.e;
        handler.removeCallbacksAndMessages(null);
        if (this.g) {
            handler.postDelayed(new lqj(this, 0), b.toMillis());
        }
        handler.postDelayed(new lqj(this, 2), this.g ? 0L : a.toMillis());
    }
}
