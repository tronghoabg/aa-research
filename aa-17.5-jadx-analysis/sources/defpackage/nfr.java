package defpackage;

import android.content.Intent;
import com.google.android.gms.car.display.CarDisplayUiFeatures;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public final class nfr implements lhg, mnd {
    public final eqm c = new eqm();
    public final eqm d = new eqm();
    public final eqm e = new eqm();
    public final eqm f = new eqm();
    private final aezr i = new aezy(new deh(this, 19));
    public static final nfq a = new nfq();
    private static final yph g = yph.c("GH.DisplayUiFeaturesMgr");
    private static final List h = woy.bi("resizeType", "hasClock", "hasBatteryLevel", "hasPhoneSignal");
    public static final afgl b = new nfm(mki.b, 2);

    public final rcg a() {
        return (rcg) this.i.a();
    }

    public final void b() {
        ((ype) g.f()).u("Requesting exiting AAP.");
        mpe.a().i(new Intent().setComponent(mkn.e));
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.CAR_DISPLAY_UI_FEATURES, yzy.Lr).l());
    }

    @Override // defpackage.lhg
    public final void c() {
        yzz yzzVar = yzz.CAR_DISPLAY_UI_FEATURES;
        khc.t(new wci("GH.DisplayUiFeaturesMgr", yzzVar, yzy.Ln, "Car not connected when registering listener for display UI features.", new Object[0]), new nav(this, 9));
        khc.t(new wci("GH.DisplayUiFeaturesMgr", yzzVar, yzy.Lm, "Car not connected when retrieving initial display UI features.", new Object[0]), new nav(this, 11));
        mnc.a().b(mnb.B, this);
    }

    @Override // defpackage.lhg
    public final void d() {
        if (kio.b().q()) {
            khc.t(new wci("GH.DisplayUiFeaturesMgr", yzz.CAR_DISPLAY_UI_FEATURES, yzy.Lo, "Car not connected when registering listener for display UI features.", new Object[0]), new nav(this, 10));
        }
        mnc.a().d(mnb.B);
    }

    public final void e(qrn qrnVar) {
        ((ype) g.f()).u("Requesting HU to resize the primary display larger.");
        yzz yzzVar = yzz.CAR_DISPLAY_UI_FEATURES;
        khc.t(new wci("GH.DisplayUiFeaturesMgr", yzzVar, yzy.Lq, "Car not connected when requesting display to be resized larger.", new Object[0]), new nav(qrnVar, 12));
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, yzy.Lt).l());
    }

    public final void f(qrn qrnVar) {
        ((ype) g.f()).u("Requesting HU to resize the primary display smaller.");
        yzz yzzVar = yzz.CAR_DISPLAY_UI_FEATURES;
        khc.t(new wci("GH.DisplayUiFeaturesMgr", yzzVar, yzy.Lp, "Car not connected when requesting display to be resized smaller.", new Object[0]), new nav(qrnVar, 13));
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, yzy.Ls).l());
    }

    public final void g(CarDisplayUiFeatures carDisplayUiFeatures, String str) {
        ((ype) g.f()).M("updateValues from %s: %s", str, carDisplayUiFeatures);
        this.c.m(Integer.valueOf(carDisplayUiFeatures.a));
        this.d.m(Boolean.valueOf(carDisplayUiFeatures.a(1)));
        this.e.m(Boolean.valueOf(carDisplayUiFeatures.a(2)));
        this.f.m(Boolean.valueOf(carDisplayUiFeatures.a(4)));
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        printWriter.getClass();
        mnf mnfVarL = mnk.l();
        for (String str : h) {
            mng mngVarA = mnh.a();
            mngVarA.a = str;
            mngVarA.b();
            mngVarA.c('|');
            mngVarA.d(true);
            mnfVarL.b(mngVarA.a());
        }
        mnfVarL.c(this.c.e(), this.d.e(), this.e.e(), this.f.e());
        mnfVarL.a().m(printWriter);
        printWriter.println("\n-------------------------------");
    }
}
