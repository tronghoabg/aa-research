package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class hmj implements java.util.function.Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ hmj(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.tna.aO((androidx.car.app.messaging.model.CarMessage) obj);
            case 1:
                return !(((uk) obj) instanceof androidx.car.app.messaging.model.ConversationItem);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar = defpackage.ike.a;
                return ((com.google.android.gms.car.control.CarPropertyConfig) obj).a == 627081341;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return j$.util.Objects.nonNull((android.content.pm.ActivityInfo) obj);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.ivt ivtVar = (defpackage.ivt) obj;
                defpackage.yqm yqmVar2 = defpackage.ivv.a;
                return ivtVar == defpackage.ivt.d;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar3 = defpackage.iyh.a;
                return ((defpackage.iyg) obj).b != defpackage.qqe.i;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return j$.util.Objects.nonNull((java.lang.Long) obj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                int i = defpackage.jqu.b;
                return (!com.google.android.gms.car.display.CarDisplayId.b(((com.google.android.gms.car.display.CarRegionId) entry.getKey()).h) || entry.getValue() == null || j$.util.Objects.equals(((defpackage.mqj) entry.getValue()).a(), defpackage.mkt.y)) ? false : true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int i2 = jws.a;
                return defpackage.tna.aE((defpackage.mqj) obj);
            case 9:
                int i3 = jxk.a;
                return !((android.content.ComponentName) obj).getPackageName().equals("com.google.android.projection.gearhead");
            case 10:
                return ((androidx.car.app.messaging.model.CarMessage) obj).isRead();
            case 11:
                return defpackage.tna.aO((androidx.car.app.messaging.model.CarMessage) obj);
            case 12:
                return defpackage.tna.aO((androidx.car.app.messaging.model.CarMessage) obj);
            case 13:
                int i4 = defpackage.jym.a;
                return !((android.content.ComponentName) obj).getPackageName().equals("com.google.android.projection.gearhead");
            case 14:
                return ((defpackage.mqi) obj).e();
            case 15:
                return j$.util.Objects.nonNull((android.content.ComponentName) obj);
            case 16:
                defpackage.yqm yqmVar4 = com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView.a;
                return defpackage.tna.aO((androidx.car.app.messaging.model.CarMessage) obj);
            case 17:
                defpackage.yqm yqmVar5 = com.google.android.apps.auto.components.apphost.view.widgets.common.RowView.a;
                return defpackage.tna.aO((androidx.car.app.messaging.model.CarMessage) obj);
            case 18:
                return !((defpackage.mqj) obj).c;
            case 19:
                lmj lmjVarH = ((defpackage.lma) obj).h();
                if (lmjVarH.O() == null) {
                    return (lmjVarH.P() == null || defpackage.mlv.t(lmjVarH.P()) || defpackage.mlv.s(lmjVarH.P())) ? false : true;
                }
                return true;
            default:
                return ((defpackage.lma) obj).j();
        }
    }
}
