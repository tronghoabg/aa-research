package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class lnl extends eqj {
    public final Context k;
    public final ComponentName l;
    public lmb n;
    public llu q;
    public static final yph a = yph.c("GH.MediaBCConnection");
    private static final Duration s = Duration.ofSeconds(2);
    static final Duration h = Duration.ofSeconds(60);
    static final Duration i = Duration.ofSeconds(3);
    static final Duration j = Duration.ofMillis(500);
    public long o = -1;
    public int p = 0;
    private boolean u = false;
    public final Handler m = new Handler(Looper.getMainLooper());
    public final llu r = new lnk(this);
    private final Runnable t = new kyl(this, 19, null);

    public lnl(Context context, ComponentName componentName) {
        this.k = context;
        this.l = componentName;
    }

    public final void a() {
        yph yphVar = a;
        zjc zjcVar = zjc.a;
        ComponentName componentName = this.l;
        ((ype) yphVar.l().ai((char) 4057)).y("connectToBrowser component=%s", new zjd(zjcVar, componentName));
        lnm.a();
        lnj lnjVar = new lnj(this);
        Context context = this.k;
        Resources resources = context.getResources();
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.media.browse.SEARCH_SUPPORTED", true);
        bundle.putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true);
        if (acsx.H()) {
            bundle.putBoolean("android.service.media.extra.SUGGESTED", true);
        }
        bundle.putInt("com.google.android.gms.car.media.BrowserIconSize", resources.getDimensionPixelSize(R.dimen.browser_icon_size));
        bundle.putInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_LIMIT", 4);
        bundle.putInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", 1);
        llu lluVar = new llu(context, componentName, lnjVar, bundle);
        this.q = lluVar;
        lluVar.p();
        oit.a();
        this.o = SystemClock.elapsedRealtime();
    }

    public final void b() {
        this.p = 0;
        lmb lmbVar = this.n;
        if (lmbVar != null) {
            lmbVar.X(this.r);
            this.n = null;
        }
        r();
        this.m.removeCallbacksAndMessages(null);
        this.u = false;
    }

    @Override // defpackage.eqj
    protected final void c() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 4061)).y("onActive component=%s", new zjd(zjc.a, this.l));
        if (acsx.x() && this.u) {
            ((ype) yphVar.l().ai((char) 4062)).u("Cancelling pending disconnect");
            this.m.removeCallbacks(this.t);
            this.u = false;
            lni lniVar = (lni) e();
            if (lniVar != null && lniVar.a == lok.b) {
                ((ype) yphVar.l().ai((char) 4063)).u("Already connected, keeping connection.");
                return;
            }
        }
        m(lni.a(lok.a));
        a();
    }

    @Override // defpackage.eqj
    protected final void d() {
        ((ype) a.l().ai((char) 4067)).y("onInactive component=%s", new zjd(zjc.a, this.l));
        if (!acsx.x()) {
            b();
        } else {
            this.u = true;
            this.m.postDelayed(this.t, j.toMillis());
        }
    }

    public final void r() {
        ((ype) a.l().ai((char) 4058)).y("disconnectFromBrowser component=%s", new zjd(zjc.a, this.l));
        llu lluVar = this.q;
        if (lluVar != null) {
            lluVar.q();
            this.q = null;
        }
    }

    public final void s(Duration duration) {
        if (this.p >= 5) {
            ((ype) a.l().ai((char) 4069)).u("Not attempting to reconnect. Max attempts exceeded.");
            return;
        }
        yop yopVarH = a.h();
        ComponentName componentName = this.l;
        ((ype) ((ype) yopVarH).ai((char) 4070)).y("reconnecting component=%s", new zjd(zjc.a, componentName));
        Handler handler = this.m;
        handler.removeCallbacksAndMessages(null);
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fy);
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
        m(lni.a(lok.e));
        handler.postDelayed(new kyl(this, 16), duration.toMillis());
        kyl kylVar = new kyl(this, 17);
        int i2 = this.p;
        Duration duration2 = s;
        wub.aE(i2);
        handler.postDelayed(kylVar, duration.plus(duration2.multipliedBy(i2 < 64 ? 1 << i2 : 0L)).toMillis());
        this.p++;
    }

    public final boolean t() {
        return ((lni) e()).a != lok.b;
    }
}
