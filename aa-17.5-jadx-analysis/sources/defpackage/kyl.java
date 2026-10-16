package defpackage;

import com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class kyl implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kyl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                if (acxa.al() && !((kyw) obj).m) {
                    ((ype) kyw.a.l().ai((char) 3615)).u("notifyVoiceSessionReady called when session is not active. Ignoring.");
                    return;
                }
                Iterator it = ((kyw) obj).g.iterator();
                while (it.hasNext()) {
                    laj.c(new kot(obj, (kww) it.next(), 9, null));
                }
                return;
            case 1:
                kql kqlVar = (kql) this.a;
                int i2 = kqlVar.g;
                kqlVar.g = i2 + 1;
                ajju ajjuVar = kqlVar.l;
                if (i2 >= ajjuVar.b.size()) {
                    ((ype) kql.a.l().ai((char) 3382)).u("Ran out of USB modes to attempt.");
                    ols.M(kqlVar.c, yxi.USB_ISSUE_NO_ACCESSORY_MODE_FAILED_TO_FIND_USB_FUNCTION);
                    kqlVar.k = 3;
                    return;
                }
                yph yphVar = kql.a;
                ((ype) yphVar.l().ai(3383)).w("Attempting to switch to USB mode %d", i2);
                long jLongValue = ((Long) ajjuVar.k(i2)).longValue();
                if (jLongValue >= 0) {
                    kqlVar.c(jLongValue);
                } else {
                    ((ype) ((ype) yphVar.f()).ai((char) 3384)).u("Function switch triggered, but performed no action.");
                }
                kqlVar.b();
                kqlVar.k = 2;
                return;
            case 2:
                ((kyw) this.a).u();
                return;
            case 3:
                yph yphVar2 = kyw.a;
                kzt kztVarA = kzt.a();
                Object obj2 = this.a;
                ((rzj) obj2).f("AssistantSuggestionsManager", new kyv(kztVarA, obj2, i)).l();
                return;
            case 4:
                ((kyw) this.a).U();
                return;
            case 5:
                ((ype) ((ype) lam.a.f()).ai((char) 3689)).u("Adding OS deprecation notification to Projected");
                nuj.b().j("GH.DeprecationAlertGen", 28L, (nur) this.a);
                return;
            case 6:
                lay layVar = (lay) this.a;
                if (layVar.i.b()) {
                    layVar.h();
                    return;
                }
                return;
            case 7:
                Object obj3 = this.a;
                synchronized (obj3) {
                    ((ype) ldo.a.l().ai(3758)).u("Timeout exceeded.");
                    ((ldo) obj3).f = false;
                    ((ldo) obj3).g = true;
                    ((ldo) obj3).h();
                }
                return;
            case 8:
                ((ype) ((ype) WirelessPreflightActivity.n.f()).ai((char) 3838)).u("User didn't unlock to proceed within 30s.");
                Object obj4 = this.a;
                if (((WirelessPreflightActivity) obj4).isFinishing()) {
                    return;
                }
                WirelessPreflightActivity.D(yzz.FRX_WIRELESS_PREFLIGHT_ACTIVITY, yzy.pT);
                lex lexVar = (lex) obj4;
                lexVar.r = true;
                lexVar.E();
                return;
            case 9:
                lin linVar = (lin) this.a;
                linVar.i = lin.r();
                linVar.a();
                return;
            case 10:
                ((AbstractC0001do) ((llu) this.a).b).k();
                return;
            case 11:
                ((AbstractC0001do) ((llu) this.a).b).b();
                return;
            case 12:
                ((AbstractC0001do) ((llu) this.a).b).i();
                return;
            case 13:
                ((AbstractC0001do) ((llu) this.a).b).a();
                return;
            case 14:
                ((AbstractC0001do) ((llu) this.a).b).h();
                return;
            case 15:
                ((lnb) this.a).k = false;
                return;
            case 16:
                ((lnl) this.a).r();
                return;
            case 17:
                ((lnl) this.a).a();
                return;
            case 18:
                ((ype) lnl.a.l().ai((char) 4060)).u("Resetting reconnect count.");
                lnl lnlVar = (lnl) this.a;
                lnlVar.p = 0;
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fz);
                rrbVarH.p(lnlVar.l);
                ohsVarJ.F(rrbVarH.l());
                return;
            case 19:
                ((ype) lnl.a.l().ai((char) 4056)).u("Executing delayed disconnect");
                ((lnl) this.a).b();
                return;
            default:
                yph yphVar3 = lpq.a;
                Object obj5 = this.a;
                lpo lpoVar = (lpo) obj5;
                String str = lpoVar.h;
                try {
                    lmb lmbVar = ((lpo) obj5).a;
                    ((eqj) obj5).m(new lpf(str, lmbVar.P(), lmbVar.O(), lpo.a(lmbVar.U()), lmbVar.n(), lmbVar.L()));
                    return;
                } catch (RuntimeException e) {
                    ((ype) ((ype) ((ype) lpq.a.h()).p(e)).ai(4160)).y("Failed to poll session state for %s; remote process likely died.", lpoVar.h);
                    return;
                }
        }
    }

    public kyl(lnl lnlVar, int i, short[] sArr) {
        this.b = i;
        this.a = lnlVar;
    }
}
