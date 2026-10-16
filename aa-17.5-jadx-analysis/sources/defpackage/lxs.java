package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class lxs implements gsd {
    private final Context a = mki.a.c;

    public static lxs b() {
        return (lxs) mki.a.b(lxs.class, new lpu(16));
    }

    public static final void d(String str, ComponentName componentName) {
        if (lup.e().g(componentName)) {
            e(str, componentName, R.string.messaging_compose_via_app, yzy.mg);
            return;
        }
        lup.e();
        if (!lup.k(componentName)) {
            throw new IllegalStateException("Current app is not supportted for adding compose message action. AppName: ".concat(String.valueOf(str)));
        }
        e("SMS", componentName, R.string.messaging_compose_via_sms, yzy.mh);
    }

    private static final void e(String str, ComponentName componentName, int i, yzy yzyVar) {
        ohu ohuVarA = ohu.a();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MESSAGING_APP, yzyVar);
        rrbVarH.p(componentName);
        ohuVarA.b((rrc) rrbVarH.l());
        if (actj.l()) {
            kfl.h().D(str, componentName.getPackageName(), osv.ASSISTANT_NUDGE_IN_MESSAGING_APP_CLICKED);
        } else {
            kfl.h().B(i, Optional.empty(), Optional.of(osv.ASSISTANT_NUDGE_IN_MESSAGING_APP_CLICKED), yfq.q(str));
        }
    }

    @Override // defpackage.gsd
    public final void a(geu geuVar) {
        jxv.a();
        ComponentName componentName = (ComponentName) jxv.f(geuVar, null, false).b;
        String strA = jrk.a(geuVar, componentName.getPackageName());
        strA.getClass();
        d(strA, componentName);
    }

    public final Optional c(String str, ComponentName componentName, int i) {
        CarIcon carIcon;
        if (!lup.e().g(componentName)) {
            lup.e();
            if (!lup.k(componentName)) {
                return Optional.empty();
            }
        }
        jsu jsuVar = new jsu(str, componentName, 7);
        Context context = this.a;
        int color = context.getColor(R.color.boardwalk_elevation3);
        if (i != 0) {
            int iP = mlq.U().P(1.5d, i, context.getResources().getColor(R.color.gearhead_sdk_tint_light), context.getResources().getColor(R.color.gearhead_sdk_tint_dark));
            tj tjVar = new tj(IconCompat.m(context, R.drawable.gs_chat_vd_theme_48));
            tjVar.a(CarColor.createCustom(iP, iP));
            carIcon = new CarIcon(tjVar);
        } else {
            carIcon = new CarIcon(new tj(IconCompat.m(context, R.drawable.gs_chat_vd_theme_48)));
            i = color;
        }
        sw swVar = new sw();
        swVar.b(CarColor.createCustom(i, i));
        swVar.c(carIcon);
        swVar.d(jsuVar);
        return Optional.of(swVar.a());
    }
}
