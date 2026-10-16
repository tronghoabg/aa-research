package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ParkedOnlyOnClickListener;
import androidx.core.graphics.drawable.IconCompat;
import com.android.car.libraries.apphost.external.model.GridWrapperTemplate;
import com.google.android.apps.auto.components.gearsnacks.GearSnacksService;
import com.google.android.projection.gearhead.R;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class lfi extends qw {
    public lfi(qn qnVar) {
        super(qnVar);
        if (lgv.c().s()) {
            return;
        }
        obs.a().f(this.a, mkn.u, R.string.location_permission_required_message, 1);
    }

    public static void a(yzy yzyVar, int i) {
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.GAMES, yzyVar);
        rrbVarH.A(i);
        ohsVarJ.F(rrbVarH.l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.qw
    public final wb h() {
        yph yphVar = GearSnacksService.c;
        ((ype) yphVar.l().ai((char) 3866)).u("Creating home screen");
        ug ugVar = new ug();
        yfq yfqVarA = tgx.a(new koj(18), acre.b());
        int size = yfqVarA.size();
        int i = 0;
        final int i2 = 0;
        while (i < size) {
            final ogz ogzVar = (ogz) yfqVarA.get(i);
            ?? r7 = ogzVar.a;
            Object obj = ogzVar.b;
            tw twVar = new tw();
            twVar.e(r7);
            qn qnVar = this.a;
            int identifier = qnVar.getResources().getIdentifier("ic_".concat(woy.ar((String) r7).replaceAll("\\s", "")), "drawable", qnVar.getPackageName());
            if (identifier == 0) {
                ((ype) yphVar.l().ai((char) 3864)).y("Using default icon for %s", r7);
                identifier = R.drawable.ic_gamesnacks_default_game_icon;
            }
            twVar.b(new CarIcon(new tj(IconCompat.m(qnVar, identifier))));
            twVar.d(ParkedOnlyOnClickListener.create(new us() { // from class: lfh
                @Override // defpackage.us
                public final void onClick() {
                    boolean zB = nto.a().b();
                    lfi lfiVar = this.a;
                    int i3 = i2;
                    if (zB) {
                        ogz ogzVar2 = ogzVar;
                        lfi.a(yzy.BJ, i3);
                        lfiVar.g().f(new lfg(lfiVar.a, (String) ogzVar2.b));
                    } else {
                        obs.a().f(lfiVar.a, mkn.u, R.string.no_internet_message, 1);
                        lfi.a(yzy.BK, i3);
                    }
                }
            }));
            ugVar.b(twVar.a());
            i++;
            i2++;
        }
        tz tzVar = new tz();
        tzVar.b = ugVar.a();
        Action action = Action.APP_ICON;
        wf.a.a(Collections.singletonList(action));
        tzVar.d = action;
        qn qnVar2 = this.a;
        String string = qnVar2.getString(R.string.gamesnacks_launcher_app_title);
        string.getClass();
        tzVar.c = CarText.create(string);
        wi.d.a(tzVar.c);
        GridTemplate gridTemplateA = tzVar.a();
        gjy gjyVar = null;
        if (leh.a().b()) {
            return new GridWrapperTemplate(new gjx(gridTemplateA), gjyVar);
        }
        gjx gjxVar = new gjx(gridTemplateA);
        gjxVar.b = new CarIcon(new tj(IconCompat.m(qnVar2, R.drawable.ic_gamesnacks_background)));
        return new GridWrapperTemplate(gjxVar, gjyVar);
    }
}
