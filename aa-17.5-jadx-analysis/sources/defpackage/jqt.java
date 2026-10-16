package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;

/* loaded from: classes.dex */
public final class jqt implements lhg {
    public static final /* synthetic */ int b = 0;
    public final Context a;
    private eqn e;
    private boolean d = false;
    private int f = 1;
    private final jqs c = new jqs();

    static {
        yph.c("GH.AapmHunController");
    }

    public jqt(Context context) {
        this.a = context;
    }

    public static void a(yzz yzzVar, yzy yzyVar) {
        ebf.j().F((rrc) rrc.h(yxy.GEARHEAD, yzzVar, yzyVar).l());
    }

    public final void b() {
        if (this.e != null) {
            mpd.b().h.k(this.e);
        }
    }

    @Override // defpackage.lhg
    public final void c() {
        if (acli.c() && Build.VERSION.SDK_INT >= 33 && !this.d) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.projection.gearhead.ACTION_DSA_AAPM_HUN");
            dup.e(this.a, this.c, intentFilter, null, 4);
            this.d = true;
        }
        if (acli.d() && jqu.a(this.a)) {
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LIFETIME, yzy.Nb).l());
        }
        if (e()) {
            this.e = new hlg(this, 2);
            mpd.b().h.fE(lbh.d(), this.e);
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        b();
        if (Build.VERSION.SDK_INT >= 33 && this.d) {
            this.a.unregisterReceiver(this.c);
            this.d = false;
        }
        this.f = 1;
    }

    public final boolean e() {
        Context context;
        SharedPreferences sharedPreferences;
        if (acli.c() && acxa.aI() && (((sharedPreferences = (context = this.a).getSharedPreferences("gh_notification_pref", 0)) == null || !sharedPreferences.getBoolean("aapm_hun_dsa_pref", false)) && jqu.a(context))) {
            mkp.b();
            if (mkp.a()) {
                int i = this.f;
                int i2 = 1;
                if (i == 1) {
                    i = true != ((Boolean) kgq.c(new kym(i2), "GH.AapmHunController", yzz.LIFETIME, yzy.pf, true, "Could not get car connection type", new Object[0])).booleanValue() ? 3 : 2;
                    this.f = i;
                }
                if (i != 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
