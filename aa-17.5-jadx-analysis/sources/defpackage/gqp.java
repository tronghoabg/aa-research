package defpackage;

import android.graphics.drawable.Drawable;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class gqp {
    private static final yob a = yob.c("com/android/car/libraries/apphost/media/converters/MediaPlaybackTemplateToInternalModelConverterKt");

    public static final fzg a(geu geuVar, CarText carText, List list, List list2) {
        fvu fvuVarC;
        fvz fvzVarK;
        ggk ggkVar = (ggk) geuVar.F(ggk.class);
        Action action = Action.BACK;
        action.getClass();
        List listBk = woy.bk(fvl.c(action, geuVar, ggkVar.f(), null, false, 12));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Action action2 = (Action) it.next();
            if (!affa.f(action2, Action.BACK)) {
                if (affa.f(action2, Action.APP_ICON) && ggkVar.f()) {
                    if (geuVar.d().d()) {
                        Drawable drawableA = geuVar.d().a();
                        drawableA.getClass();
                        fvzVarK = new fvz(new gae(drawableA), null);
                    } else {
                        fvzVarK = fvr.k(geuVar);
                    }
                    fvuVarC = new fvu(null, fvzVarK, null);
                } else if (affa.f(action2, Action.APP_ICON)) {
                    Action action3 = Action.APP_ICON;
                    action3.getClass();
                    fvuVarC = fvl.c(action3, geuVar, ggkVar.f(), null, false, 4);
                } else if (action2.getType() == 1) {
                    CarIcon icon = action2.getIcon();
                    if (icon != null) {
                        if (ggkVar.f()) {
                            ghw ghwVar = ghw.a;
                            ghv ghvVar = ghv.a;
                            ghvVar.getClass();
                            fvuVarC = new fvu(null, new fvz(gai.a(icon, geuVar, ghwVar, ghvVar, null, 8), null), null);
                        } else {
                            fvuVarC = new fvu(fvr.b(action2, geuVar, null), null, null);
                        }
                        listBk.add(fvuVarC);
                    }
                } else {
                    ((ynz) a.h().o(ypi.a, "CarApp.H.MPV").ai(72)).y("Ignoring unsupported media header start action [%s]", action2);
                }
                listBk.add(fvuVarC);
            }
        }
        ArrayList arrayList = new ArrayList(woy.bp(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(fvl.c((Action) it2.next(), geuVar, ggkVar.f(), null, false, 12));
        }
        return new fzg(carText, null, null, null, woy.cd(listBk, 3), arrayList);
    }

    public static final fzg b(Header header, geu geuVar) {
        CarText title = header.getTitle();
        List listBj = woy.bj(header.getStartHeaderAction());
        List<Action> endHeaderActions = header.getEndHeaderActions();
        endHeaderActions.getClass();
        return a(geuVar, title, listBj, woy.cd(endHeaderActions, 3));
    }
}
