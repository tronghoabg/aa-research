package defpackage;

import android.content.res.Resources;
import androidx.car.app.model.Badge;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.ParkedOnlyOnClickListener;
import com.android.car.libraries.apphost.external.model.GridWrapperTemplate;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.system.applauncher.LauncherCarAppService;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class mqj extends qw {
    public List f;
    public boolean g;
    public CarIcon h;
    private final mqg i;

    public mqj(qn qnVar, mqg mqgVar) throws Resources.NotFoundException {
        super(qnVar);
        this.i = mqgVar;
        this.g = true;
        qnVar.getResources().getColor(R.color.boardwalk_standard_red_dark, qnVar.getTheme());
        mqgVar.d.fE(this, new med(new mcm(this, 16), 4));
        mqgVar.a.fE(this, new med(new mcm(this, 17), 4));
        mqgVar.b.fE(this, new med(new mcm(this, 18), 4));
    }

    @Override // defpackage.qw
    public final wb h() throws Resources.NotFoundException {
        Badge badgeA;
        LauncherCarAppService.c.l().u("LauncherCarAppService.onGetTemplate");
        tz tzVar = new tz();
        List<mra> list = this.f;
        gjy gjyVar = null;
        if (list == null) {
            tzVar.c();
        } else {
            ug ugVar = new ug();
            int i = 0;
            for (mra mraVar : list) {
                int i2 = i + 1;
                mqz mqzVar = mraVar.a;
                qn qnVar = this.a;
                CarIcon carIconH = mqzVar.h(qnVar, qnVar.getResources().getDimensionPixelSize(R.dimen.gearhead_launcher_icon_diameter), this.g);
                boolean z = mraVar.b;
                qnVar.getClass();
                GhIcon ghIcon = mqzVar.f;
                CarIcon carIconI = ghIcon != null ? ghIcon.i(qnVar, qnVar.getResources().getDimensionPixelSize(R.dimen.gearhead_launcher_badge_diameter)) : null;
                carIconH.getClass();
                if (z || carIconI != null) {
                    te teVar = new te();
                    if (z) {
                        teVar.b();
                        leh.a.a();
                        krr krrVar = krr.i;
                        kru kruVar = ksa.a;
                        teVar.b = CarColor.createCustom(krrVar.c(kruVar.a().c()), krrVar.c(kruVar.a().c()));
                    }
                    if (carIconI != null) {
                        teVar.c = carIconI;
                    }
                    badgeA = teVar.a();
                } else {
                    badgeA = null;
                }
                tw twVar = new tw();
                twVar.e(mqzVar.i());
                mqc mqcVar = mqzVar.c;
                us mqlVar = new mql(mraVar, i, 1);
                if (mqcVar.c) {
                    mqlVar = ParkedOnlyOnClickListener.create(mqlVar);
                }
                twVar.d(mqlVar);
                if (badgeA == null) {
                    twVar.b(carIconH);
                } else {
                    twVar.c(carIconH, badgeA);
                }
                ugVar.b(twVar.a());
                i = i2;
            }
            tzVar.b = ugVar.a();
            tzVar.b();
        }
        gjx gjxVar = new gjx(tzVar.a());
        gjxVar.a();
        gjxVar.b = this.h;
        return new GridWrapperTemplate(gjxVar, gjyVar);
    }
}
