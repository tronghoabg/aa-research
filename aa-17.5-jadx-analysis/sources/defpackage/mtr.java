package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mtr {
    private final yph d = yph.c("GH.DashShadeScrimCtrl");
    private final Context e;
    private final afgl f;
    static final /* synthetic */ afia[] b = {new affn(mtr.class, "perLifetimeState", "getPerLifetimeState()Lcom/google/android/apps/auto/components/system/dashboard/DashboardShadeScrimController$perLifetimeState$2$1;", 0)};
    public static final mtp a = new mtp();
    public static final afgl c = new lcj(mki.b, 17);

    public mtr() {
        Context context = mki.a.c;
        context.getClass();
        this.e = context;
        this.f = new lhu(new mii(17), lho.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, rby] */
    public final void a() {
        ?? r2;
        if (d().a) {
            this.d.l().u("hide()");
            sab sabVar = (sab) khc.t(new wci("GH.DashShadeScrimCtrl", yzz.DASHBOARD, yzy.r, "Unable to get car window manager", new Object[0]), new mto(0));
            if (sabVar != 0 && (r2 = d().d) != 0) {
                sabVar.i(r2);
            }
            te teVarD = d();
            teVarD.b = null;
            teVarD.d = null;
            teVarD.a = false;
            teVarD.c = null;
        }
    }

    public final void b(Integer num) {
        Integer num2 = num;
        if (d().a) {
            if (num2 != null) {
                c(num2.intValue());
                return;
            }
            return;
        }
        yph yphVar = this.d;
        yphVar.l().y("show(initialOffset=%s)", num2);
        nso nsoVarB = nsr.c().b();
        nsn nsnVar = nsn.s;
        Rect rectH = nsoVarB.h(nsnVar);
        Rect rectH2 = nsoVarB.h(nsn.r);
        nsu nsuVarL = nsoVarB.l();
        yfq yfqVar = nsuVarL != null ? nsuVarL.e : null;
        if (rectH == null || rectH2 == null || nsuVarL == null || ((yls) yfqVar).c < 2) {
            ((ype) yphVar.h()).S("Layout parameters not available or invalid: mapBounds=%s, shadeBounds=%s, widgetShadeLayoutState=%s, dragStops=%s", rectH, rectH2, nsuVarL, yfqVar);
            return;
        }
        if (num2 != null) {
            d().c = num2;
        } else {
            num2 = null;
        }
        qsw qswVarN = nsoVarB.n(nsnVar);
        CarWindowLayoutParams carWindowLayoutParamsA = qswVarN != null ? qswVarN.a() : null;
        int i = carWindowLayoutParamsA != null ? carWindowLayoutParamsA.i : 0;
        qsw qswVar = new qsw(rectH.width(), rectH.height(), nsoVarB.v());
        qswVar.a = rectH.left;
        qswVar.b = rectH.top;
        qswVar.g = i + 2;
        int i2 = 1;
        qswVar.l = true;
        qswVar.m = 192;
        qswVar.q = null;
        if (num2 != null && num2.intValue() > 0) {
            qswVar.j = new ProjectionWindowAnimationParams(R.anim.dashboard_fade_in, false, null, 0);
        }
        CarWindowLayoutParams carWindowLayoutParamsA2 = qswVar.a();
        sab sabVar = (sab) khc.t(new wci("GH.DashShadeScrimCtrl", yzz.DASHBOARD, yzy.r, "Unable to get car window manager", new Object[0]), new mto(i2));
        ocg ocgVar = new ocg(rectH2, rectH, nsuVarL, yfqVar, this, 1);
        d().d = ocgVar;
        sabVar.f(ocgVar, "widget_shade_scrim", this.e, carWindowLayoutParamsA2, 0);
        d().a = true;
    }

    public final void c(int i) {
        if (lbh.d().g()) {
            d().c = Integer.valueOf(i);
            Object obj = d().b;
            if (obj != null) {
                ((mtq) obj).a(i);
            }
        }
    }

    public final te d() {
        return (te) this.f.getValue(this, b[0]);
    }
}
