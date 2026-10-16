package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tkg extends defpackage.tio {
    public defpackage.tkh a;

    public tkg(defpackage.tkh tkhVar) {
        this.a = tkhVar;
    }

    @Override // defpackage.tkl
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        androidx.car.app.model.Action action;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            action = androidx.car.app.model.Action.APP_ICON;
        } else if (iOrdinal == 1) {
            action = androidx.car.app.model.Action.BACK;
        } else if (iOrdinal == 2) {
            action = androidx.car.app.model.Action.PAN;
        } else {
            if (iOrdinal != 3) {
                throw new defpackage.afas();
            }
            action = androidx.car.app.model.Action.COMPOSE_MESSAGE;
        }
        action.getClass();
        return action;
    }

    @Override // defpackage.tkl
    public final java.lang.String b() {
        return "Standard action: ".concat(java.lang.String.valueOf(this.a.name()));
    }
}
