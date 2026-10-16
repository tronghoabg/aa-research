package defpackage;

import android.content.Context;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.SectionedItemList;
import androidx.car.app.model.Toggle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.settings.ui.CarSettingsService;
import com.google.android.gms.car.CarInfo;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.projection.gearhead.R;
import java.text.MessageFormat;

/* loaded from: classes2.dex */
public final class mms extends qw {
    public static final yph f = yph.c("GH.EVSettingsScreen");
    public CarInfo g;

    public mms(qn qnVar) {
        super(qnVar);
    }

    public static final void a(yzy yzyVar, yzy yzyVar2, boolean z) {
        ohs ohsVarJ = ebf.j();
        yxy yxyVar = yxy.GEARHEAD;
        yzz yzzVar = yzz.SETTINGS_CAR_SCREEN_UI;
        if (true != z) {
            yzyVar = yzyVar2;
        }
        ohsVarJ.F(rrc.h(yxyVar, yzzVar, yzyVar).l());
    }

    @Override // defpackage.qw
    public final /* bridge */ /* synthetic */ wb h() {
        qrn qrnVarE = kio.b().e();
        yph yphVar = CarSettingsService.c;
        this.g = mlq.d(qrnVarE);
        mlq.c();
        boolean zA = mlq.a(kio.b().e(), "car_ev_features_enabled", this.g);
        ((ype) f.l().ai((char) 5074)).y("onGetTemplate(): currentEvEnabledSetting=%s", Boolean.valueOf(zA));
        ug ugVar = new ug();
        qn qnVar = this.a;
        Context baseContext = qnVar.getBaseContext();
        vf vfVar = new vf();
        vfVar.i(baseContext.getString(R.string.settings_ev_features));
        wc wcVar = new wc(new mmj(this, 9));
        wcVar.b = zA;
        vfVar.j(new Toggle(wcVar));
        ugVar.b(vfVar.a());
        uj ujVar = new uj();
        ujVar.g(baseContext.getString(R.string.settings_electric_vehicle_settings_title));
        ujVar.e(Action.BACK);
        ujVar.c(SectionedItemList.create(ugVar.a(), baseContext.getString(R.string.settings_ev_status)));
        if (!acob.Y() || zA) {
            mlq.c();
            Context baseContext2 = qnVar.getBaseContext();
            ug ugVar2 = new ug();
            vf vfVar2 = new vf();
            vfVar2.e(new CarIcon(new tj(IconCompat.m(baseContext2, R.drawable.ic_connector_j1772))), 4);
            vfVar2.i(MessageFormat.format(baseContext2.getString(R.string.settings_connector_type_1), CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE));
            wc wcVar2 = new wc(new mmj(this, 10));
            wcVar2.b = mlq.a(kio.b().e(), "car_ev_connector_type_1", this.g);
            vfVar2.j(new Toggle(wcVar2));
            ugVar2.b(vfVar2.a());
            vf vfVar3 = new vf();
            vfVar3.e(new CarIcon(new tj(IconCompat.m(baseContext2, R.drawable.ic_connector_ccs_1))), 4);
            vfVar3.i(MessageFormat.format(baseContext2.getString(R.string.settings_connector_type_combo), CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE));
            wc wcVar3 = new wc(new mmj(this, 11));
            wcVar3.b = mlq.a(kio.b().e(), "car_ev_connector_type_combo_1", this.g);
            vfVar3.j(new Toggle(wcVar3));
            ugVar2.b(vfVar3.a());
            vf vfVar4 = new vf();
            vfVar4.e(new CarIcon(new tj(IconCompat.m(baseContext2, R.drawable.ic_connector_type_2))), 4);
            vfVar4.i(MessageFormat.format(baseContext2.getString(R.string.settings_connector_type_2), "2"));
            wc wcVar4 = new wc(new mmj(this, 12));
            wcVar4.b = mlq.a(kio.b().e(), "car_ev_connector_type_2", this.g);
            vfVar4.j(new Toggle(wcVar4));
            ugVar2.b(vfVar4.a());
            vf vfVar5 = new vf();
            vfVar5.e(new CarIcon(new tj(IconCompat.m(baseContext2, R.drawable.ic_connector_ccs_2))), 4);
            vfVar5.i(MessageFormat.format(baseContext2.getString(R.string.settings_connector_type_combo), "2"));
            wc wcVar5 = new wc(new mmj(this, 13));
            wcVar5.b = mlq.a(kio.b().e(), "car_ev_connector_type_combo_2", this.g);
            vfVar5.j(new Toggle(wcVar5));
            ugVar2.b(vfVar5.a());
            vf vfVar6 = new vf();
            vfVar6.e(new CarIcon(new tj(IconCompat.m(baseContext2, R.drawable.ic_connector_chademo))), 4);
            vfVar6.i(baseContext2.getString(R.string.settings_connector_type_chademo));
            wc wcVar6 = new wc(new mmj(this, 14));
            wcVar6.b = mlq.a(kio.b().e(), "car_ev_connector_type_chademo", this.g);
            vfVar6.j(new Toggle(wcVar6));
            ugVar2.b(vfVar6.a());
            vf vfVar7 = new vf();
            vfVar7.e(new CarIcon(new tj(IconCompat.m(baseContext2, R.drawable.ic_connector_supercharger))), 4);
            vfVar7.i(baseContext2.getString(R.string.settings_connector_type_nacs));
            wc wcVar7 = new wc(new mmj(this, 15));
            wcVar7.b = mlq.a(kio.b().e(), "car_ev_connector_type_nacs", this.g);
            vfVar7.j(new Toggle(wcVar7));
            ugVar2.b(vfVar7.a());
            vf vfVar8 = new vf();
            vfVar8.e(new CarIcon(new tj(IconCompat.m(baseContext2, R.drawable.ic_connector_type_6))), 4);
            vfVar8.i(MessageFormat.format(baseContext2.getString(R.string.settings_connector_type_6), "6"));
            wc wcVar8 = new wc(new mmj(this, 16));
            wcVar8.b = mlq.a(kio.b().e(), "car_ev_connector_type_6", this.g);
            vfVar8.j(new Toggle(wcVar8));
            ugVar2.b(vfVar8.a());
            vf vfVar9 = new vf();
            vfVar9.e(new CarIcon(new tj(IconCompat.m(baseContext2, R.drawable.ic_connector_leccs))), 4);
            vfVar9.i(baseContext2.getString(R.string.settings_connector_type_leccs));
            wc wcVar9 = new wc(new mmj(this, 17));
            wcVar9.b = mlq.a(kio.b().e(), "car_ev_connector_type_leccs", this.g);
            vfVar9.j(new Toggle(wcVar9));
            ugVar2.b(vfVar9.a());
            ujVar.c(SectionedItemList.create(ugVar2.a(), baseContext.getString(R.string.settings_your_plugs)));
        }
        return ujVar.a();
    }
}
