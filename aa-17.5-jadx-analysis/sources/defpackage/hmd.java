package defpackage;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import androidx.car.app.messaging.model.CarMessage;
import androidx.car.app.messaging.model.ConversationItem;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowView;
import com.google.android.gms.car.control.CarPropertyConfig;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class hmd implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ hmd(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return roc.aE((CarMessage) obj);
            case 1:
                return !(((uf) obj) instanceof ConversationItem);
            case 2:
                yph yphVar = ijv.a;
                return ((CarPropertyConfig) obj).a == 627081341;
            case 3:
                return Objects.nonNull((ActivityInfo) obj);
            case 4:
                ivl ivlVar = (ivl) obj;
                yph yphVar2 = ivn.a;
                return ivlVar == ivl.d;
            case 5:
                return Objects.nonNull((Long) obj);
            case 6:
                Map.Entry entry = (Map.Entry) obj;
                int i = jqt.b;
                return (!CarDisplayId.b(((CarRegionId) entry.getKey()).h) || entry.getValue() == null || Objects.equals(((mqc) entry.getValue()).a(), mkn.y)) ? false : true;
            case 7:
                int i2 = jwn.a;
                return roc.au((mqc) obj);
            case 8:
                int i3 = jxg.a;
                return !((ComponentName) obj).getPackageName().equals("com.google.android.projection.gearhead");
            case 9:
                return ((CarMessage) obj).isRead();
            case 10:
                return roc.aE((CarMessage) obj);
            case 11:
                return roc.aE((CarMessage) obj);
            case 12:
                int i4 = jyh.a;
                return !((ComponentName) obj).getPackageName().equals("com.google.android.projection.gearhead");
            case 13:
                return ((mqb) obj).e();
            case 14:
                return Objects.nonNull((ComponentName) obj);
            case 15:
                yph yphVar3 = MaterialRowView.a;
                return roc.aE((CarMessage) obj);
            case 16:
                yph yphVar4 = RowView.a;
                return roc.aE((CarMessage) obj);
            case 17:
                return !((mqc) obj).c;
            case 18:
                lmc lmcVarH = ((llu) obj).h();
                if (lmcVarH.O() == null) {
                    return (lmcVarH.P() == null || mlq.L(lmcVarH.P()) || mlq.K(lmcVarH.P())) ? false : true;
                }
                return true;
            case 19:
                return ((llu) obj).j();
            default:
                return Objects.nonNull((String[]) obj);
        }
    }
}
