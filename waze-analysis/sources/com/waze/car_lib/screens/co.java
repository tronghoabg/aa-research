package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;
import androidx.core.graphics.drawable.IconCompat;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class co extends cn {

    /* renamed from: a, reason: collision with root package name */
    private final ListTemplate f21944a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(CarContext carContext, com.waze.settings.tree.d.d dVar, com.waze.car_lib.c.n nVar) {
        ListTemplate listTemplateX;
        super(carContext, "SettingsOptionsScreen", dVar, nVar);
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(dVar, "settingChoice");
        h.g.b.x.f(nVar, "analyticsSender");
        com.waze.car_lib.p.cd cdVarA = new ei(dVar).a();
        if (cdVarA != null) {
            CarContext carContext2 = carContext;
            h.g.b.x.f(cdVarA, "state");
            h.g.b.x.f(carContext2, "context");
            ListTemplate.Builder builder = new ListTemplate.Builder();
            ItemList.Builder builder2 = new ItemList.Builder();
            for (com.waze.car_lib.p.cc ccVar : cdVarA.c()) {
                Row.Builder builder3 = new Row.Builder();
                builder3.setTitle(ccVar.c());
                String strB = ccVar.b();
                if (strB != null && !h.n.o.G(strB)) {
                    builder3.addText(ccVar.b());
                }
                if (ccVar.a() != null) {
                    CarIcon.Builder builder4 = new CarIcon.Builder(IconCompat.createWithResource(carContext2, ccVar.a().intValue()));
                    builder4.setTint(CarColor.PRIMARY);
                    builder3.setImage(builder4.build());
                }
                builder2.addItem(builder3.build());
            }
            builder2.setOnSelectedListener(new com.waze.car_lib.p.cb(cdVarA.d(), 0));
            builder2.setSelectedIndex(cdVarA.a());
            builder.setSingleList(builder2.build());
            builder.setHeaderAction(Action.BACK);
            builder.setTitle(cdVarA.b());
            listTemplateX = builder.build();
            h.g.b.x.e(listTemplateX, "build(...)");
        } else {
            listTemplateX = dh.x();
        }
        this.f21944a = listTemplateX;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21944a;
    }
}
