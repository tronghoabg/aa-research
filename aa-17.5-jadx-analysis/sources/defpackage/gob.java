package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class gob {
    public static final gob a = new gob();

    public static final boolean a(Action action, xc xcVar, geu geuVar) {
        if (fvr.j(action)) {
            return xcVar == null || geuVar.x().a();
        }
        return false;
    }

    public static final gor b(ActionStrip actionStrip, ActionStrip actionStrip2, xc xcVar, geu geuVar) {
        List arrayList;
        List<Action> actions;
        List<Action> actions2;
        if (((ggk) geuVar.F(ggk.class)).f()) {
            List listE = e(actionStrip != null ? actionStrip.getActions() : null, xcVar, geuVar);
            List listE2 = e(actionStrip2 != null ? actionStrip2.getActions() : null, xcVar, geuVar);
            return new gor(listE, listE2, d(geuVar, listE, listE2, false));
        }
        if (actionStrip == null || (actions2 = actionStrip.getActions()) == null) {
            arrayList = null;
        } else {
            afec afecVarC = c(xcVar, geuVar);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : actions2) {
                if (!((Boolean) afecVarC.invoke(obj)).booleanValue()) {
                    arrayList2.add(obj);
                }
            }
            gdg gdgVar = new gdg(xcVar, geuVar, 16, null);
            arrayList = new ArrayList(woy.bp(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(gdgVar.invoke(it.next()));
            }
        }
        if (arrayList == null) {
            arrayList = afbe.a;
        }
        if (actionStrip2 != null && (actions = actionStrip2.getActions()) != null) {
            afec afecVarC2 = c(xcVar, geuVar);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : actions) {
                if (!((Boolean) afecVarC2.invoke(obj2)).booleanValue()) {
                    arrayList3.add(obj2);
                }
            }
            gdg gdgVar2 = new gdg(xcVar, geuVar, 16, null);
            arrayList = new ArrayList(woy.bp(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList.add(gdgVar2.invoke(it2.next()));
            }
        }
        if (arrayList == null) {
            arrayList = afbe.a;
        }
        return new gor(arrayList, arrayList, d(geuVar, arrayList, arrayList, true));
    }

    private static final afec c(xc xcVar, geu geuVar) {
        return new cib((Object) xcVar, (Object) geuVar, (Object) new goa(new afft(), 0), 15, (byte[]) null);
    }

    private static final fvu d(geu geuVar, List list, List list2, boolean z) {
        Object next;
        if (geuVar.i().c() < 8) {
            return null;
        }
        Iterator it = woy.bY(list2, list).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((fvu) next).c()) {
                break;
            }
        }
        fvu fvuVar = (fvu) next;
        if (!z) {
            return fvuVar;
        }
        if (fvuVar == null) {
            return null;
        }
        return fvu.d(fvuVar, null, null, new fwc(geuVar, fvuVar, 4), 111);
    }

    private static final List e(List list, xc xcVar, geu geuVar) {
        boolean z;
        fvu fvuVar;
        geu geuVar2 = geuVar;
        if (list == null) {
            return afbe.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Action action = (Action) it.next();
            if (!a(action, xcVar, geuVar2)) {
                if (!fvr.d(action)) {
                    z = z2;
                } else if (z2) {
                    continue;
                } else {
                    z = true;
                }
                if (action.getType() == 65540) {
                    action.getClass();
                    ah ahVar = new ah((Object) action, (Object) geuVar2, (Object) xcVar, 4, (byte[]) null);
                    CarText title = action.getTitle();
                    gcs gcsVarF = title != null ? fzo.f(title) : null;
                    CarIcon icon = action.getIcon();
                    if (icon == null) {
                        icon = CarIcon.PAN;
                    }
                    icon.getClass();
                    geuVar2 = geuVar;
                    fvuVar = new fvu(null, new fvy(gcsVarF, gai.a(icon, geuVar2, null, null, null, 14), ahVar, action.isEnabled(), true != fvr.d(action) ? null : action.getBackgroundColor(), fvr.d(action), false), null);
                } else {
                    fwb fwbVarE = fvr.e(action, geuVar2, null);
                    if (!(fwbVarE instanceof fvy) && !(fwbVarE instanceof fvz)) {
                        if (!(fwbVarE instanceof fwa)) {
                            throw new aezs();
                        }
                        fwbVarE = ((fwa) fwbVarE).b;
                    }
                    fvuVar = new fvu(null, fwbVarE, null);
                }
                arrayList.add(fvuVar);
                z2 = z;
            }
        }
        return arrayList;
    }
}
