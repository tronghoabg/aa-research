package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.ParkedOnlyOnClickListener;
import com.google.android.projection.gearhead.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class khf extends kae {
    private static final yph f = yph.c("GH.CalPermissionScreen");

    /* JADX WARN: Illegal instructions before constructor call */
    public khf(qn qnVar) {
        yzy yzyVar;
        mdh.c();
        mdg mdgVarA = mdh.a();
        int iOrdinal = mdgVarA.ordinal();
        if (iOrdinal == 1) {
            yzyVar = yzy.tf;
        } else {
            if (iOrdinal != 2) {
                Objects.toString(mdgVarA);
                throw new IllegalStateException("Unexpected gate state ".concat(mdgVarA.toString()));
            }
            yzyVar = yzy.sZ;
        }
        super(qnVar, (rrc) rrc.h(yxy.GEARHEAD, yzz.CALENDAR_APP, yzyVar).l());
    }

    public final void a(boolean z, mdg mdgVar) {
        ((ype) f.f()).P("onPermissionRequestComplete. approval=%b, initialGateState=%b", z, mdgVar);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.CALENDAR_APP, (z && mdgVar == mdg.c) ? yzy.td : z ? yzy.tg : mdgVar == mdg.c ? yzy.te : yzy.th).l());
        if (z) {
            mdh.c();
            mdh.b();
            ((qx) this.a.a(qx.class)).g(this);
        } else if (mdgVar == mdg.b) {
            this.a.c();
        }
    }

    @Override // defpackage.qw
    public final wb h() {
        String string;
        mdh.c();
        mdg mdgVarA = mdh.a();
        int i = 1;
        if (mdgVarA == mdg.a) {
            a(true, mdg.c);
        }
        int iOrdinal = mdgVarA.ordinal();
        int i2 = 2;
        if (iOrdinal == 0) {
            string = this.a.getString(R.string.permission_car_prompt_explanation);
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new aezs();
            }
            string = this.a.getString(R.string.permission_car_prompt_explanation);
        } else {
            string = this.a.getString(R.string.calendar_permission_usage_car_prompt_explanation);
        }
        string.getClass();
        um umVar = new um(string);
        umVar.c(Action.APP_ICON);
        qn qnVar = this.a;
        umVar.e(qnVar.getString(R.string.calendar_app_name));
        int iOrdinal2 = mdgVarA.ordinal();
        if (iOrdinal2 == 0) {
            ParkedOnlyOnClickListener parkedOnlyOnClickListenerCreate = ParkedOnlyOnClickListener.create(new khe(this, i2));
            sw swVar = new sw();
            swVar.d(parkedOnlyOnClickListenerCreate);
            swVar.e(qnVar.getString(R.string.permission_prompt_button));
            umVar.b(swVar.a());
        } else if (iOrdinal2 != 1) {
            if (iOrdinal2 != 2) {
                throw new aezs();
            }
            ParkedOnlyOnClickListener parkedOnlyOnClickListenerCreate2 = ParkedOnlyOnClickListener.create(new khe(this, i2));
            sw swVar2 = new sw();
            swVar2.d(parkedOnlyOnClickListenerCreate2);
            swVar2.e(qnVar.getString(R.string.permission_prompt_button));
            umVar.b(swVar2.a());
        } else {
            int color = qnVar.getColor(R.color.button_primary_blue_background);
            sw swVar3 = new sw();
            swVar3.d(new khe(this, i));
            swVar3.b(CarColor.createCustom(color, color));
            swVar3.e(qnVar.getString(R.string.permission_usage_prompt_ok_button));
            umVar.b(swVar3.a());
            sw swVar4 = new sw();
            swVar4.d(new khe(this, 0));
            swVar4.e(qnVar.getString(R.string.permission_usage_prompt_not_now_button));
            umVar.b(swVar4.a());
        }
        return umVar.a();
    }
}
