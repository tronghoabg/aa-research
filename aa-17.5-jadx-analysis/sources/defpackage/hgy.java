package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;

/* loaded from: classes2.dex */
public final /* synthetic */ class hgy {
    public static final fvz a(Action action, geu geuVar, boolean z) {
        CarIcon icon;
        if (action.getType() == 65538) {
            return fvr.k(geuVar);
        }
        if (!z || (icon = action.getIcon()) == null) {
            return null;
        }
        ghw ghwVar = ghw.a;
        ghv ghvVar = ghv.a;
        ghvVar.getClass();
        return new fvz(gai.a(icon, geuVar, ghwVar, ghvVar, null, 8), null);
    }
}
