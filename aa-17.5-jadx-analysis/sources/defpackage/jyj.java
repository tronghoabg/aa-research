package defpackage;

import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;

/* loaded from: classes2.dex */
public final class jyj {
    public static final yob a = yob.c("com/google/android/apps/auto/components/apphost/nav/NavigationStateCallbackImpl");
    public final mai b;
    public final geu c;
    public Runnable e;
    public final mal d = mal.a();
    public final ajmd f = new ajmd(this, null);

    public jyj(geu geuVar) {
        this.c = geuVar;
        this.b = new mai(((gmh) geuVar.d()).a);
    }

    public final void a() {
        ((ynz) ((ynz) a.e()).ai((char) 2830)).y("onNavigationEnded %s", this.c.d());
        un unVar = new un(null, null);
        unVar.r(2);
        this.b.c((NavigationSummary) unVar.a);
        wer.c();
        mal malVar = this.d;
        if (!malVar.c) {
            ((ype) ((ype) mal.a.g()).ai((char) 4633)).u("AbandonFocus invoked when NavigationFocusManager was never started.");
        } else if (malVar.b) {
            if (malVar.g != this.f) {
                ((ype) ((ype) mal.a.h()).ai((char) 4631)).u("The app does not have the navigation focus, so cannot abandon it");
            } else {
                yph yphVar = mal.a;
                ((ype) ((ype) yphVar.f()).ai((char) 4628)).u("Focus abandoned");
                malVar.g = null;
                if (malVar.d) {
                    malVar.e(maj.c);
                    try {
                        kgq.d(new kyi(malVar, 4), "GH.GhNavFocusManager", yzz.APP_HOST_CONTEXT, yzy.qm, "Non-recoverable error during abandon focus. Bailing.", new Object[0]);
                    } catch (IllegalStateException e) {
                        ((ype) ((ype) ((ype) mal.a.h()).p(e)).ai((char) 4629)).u("Car Connection failed.");
                        malVar.e(maj.a);
                    }
                } else {
                    ((ype) ((ype) yphVar.h()).ai((char) 4630)).u("GH does not own nav focus, cannot release it");
                }
            }
        } else {
            ((ype) ((ype) mal.a.h()).ai((char) 4632)).u("AbandonFocus invoked after stop(). Dropping request.");
        }
        geu geuVar = this.c;
        gei geiVar = (gei) geuVar.l(gei.class);
        geiVar.getClass();
        geiVar.a();
        gts gtsVar = (gts) geuVar.F(gts.class);
        ((ynz) gtsVar.b.f().o(ypi.a, "CarApp.H.Nav.RouteInfo").ai(88)).u("Stopping Navigation");
        gtsVar.c = null;
        gtsVar.d = null;
        gtsVar.a();
        gtsVar.b();
    }
}
