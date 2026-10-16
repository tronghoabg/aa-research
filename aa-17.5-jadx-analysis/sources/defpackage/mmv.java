package defpackage;

import android.content.Context;
import androidx.car.app.model.Action;
import androidx.car.app.model.SectionedItemList;
import androidx.car.app.model.Toggle;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mmv extends qw {
    public static final yph f = yph.c("GH.PwrSavingsSetScreen");
    public jfe g;

    public mmv(qn qnVar) {
        super(qnVar);
    }

    @Override // defpackage.qw
    public final /* bridge */ /* synthetic */ wb h() {
        mme mmeVarB = mme.b();
        this.g = mme.i(kio.b().e());
        jfd jfdVarA = mmeVarB.a(kio.b().e());
        ((ype) f.l().ai(5088)).M("onGetTemplate(): multiDisplayPowerSavingSetting=%s, currentlyPowerSavingSetting=%s", jfdVarA, this.g);
        ug ugVar = new ug();
        Context baseContext = this.a.getBaseContext();
        uj ujVar = new uj();
        ujVar.e(Action.BACK);
        ujVar.g(baseContext.getString(R.string.settings_power_saving));
        vf vfVar = new vf();
        vfVar.i(baseContext.getString(R.string.settings_power_saving));
        wc wcVar = new wc(new mmk(2));
        wcVar.b = this.g == jfe.ON;
        vfVar.j(new Toggle(wcVar));
        ugVar.b(vfVar.a());
        ujVar.c(SectionedItemList.create(ugVar.a(), " "));
        ug ugVar2 = new ug();
        vf vfVar2 = new vf();
        vfVar2.i(baseContext.getString(R.string.settings_power_saving_advanced_secondary_displays));
        vfVar2.d(baseContext.getString(mmw.a(jfdVarA)));
        vfVar2.k = true;
        vfVar2.g(new mel(this, 15));
        ugVar2.b(vfVar2.a());
        ujVar.c(SectionedItemList.create(ugVar2.a(), baseContext.getString(R.string.settings_power_saving_advanced)));
        return ujVar.a();
    }
}
