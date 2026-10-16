package defpackage;

import androidx.car.app.model.Action;

/* loaded from: classes3.dex */
public final class tjj extends ths {
    public tjk a;

    public tjj(tjk tjkVar) {
        this.a = tjkVar;
    }

    @Override // defpackage.tjo
    public final /* bridge */ /* synthetic */ Object a() {
        Action action;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            action = Action.APP_ICON;
        } else if (iOrdinal == 1) {
            action = Action.BACK;
        } else if (iOrdinal == 2) {
            action = Action.PAN;
        } else {
            if (iOrdinal != 3) {
                throw new aezs();
            }
            action = Action.COMPOSE_MESSAGE;
        }
        action.getClass();
        return action;
    }

    @Override // defpackage.tjo
    public final String b() {
        return "Standard action: ".concat(String.valueOf(this.a.name()));
    }
}
