package com.waze.a.a;

import android.os.Bundle;
import android.support.v4.app.av;
import android.view.View;
import com.airbnb.lottie.b.q;
import com.airbnb.lottie.b.v;
import com.waze.R;
import com.waze.a.af;
import com.waze.app_nav.hub.service.k;
import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends com.waze.app_nav.hub.service.d {
    public a() {
        super(R.layout.fragment_request_user_age);
    }

    @Override // com.waze.app_nav.hub.service.d, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        x.f(view, "view");
        super.onViewCreated(view, bundle);
        av activity = getActivity();
        if (activity != null) {
            activity.setTheme(R.style.UidAppTheme_Translucent);
        }
        Object objD = k.f15395a.a().a(a()).d();
        if (true != (objD instanceof com.waze.a.e)) {
            objD = null;
        }
        com.waze.a.e eVar = (com.waze.a.e) objD;
        if (eVar == null) {
            throw new RuntimeException("invalid arguments class");
        }
        String strC = com.waze.shared_infra.o.b.a().c(R.string.AADC_REQUEST_AGE_SCREEN_TITLE, new Object[0]);
        String strC2 = com.waze.shared_infra.o.b.a().c(R.string.AADC_REQUEST_AGE_SCREEN_BODY, new Object[0]);
        String strC3 = com.waze.shared_infra.o.b.a().c(R.string.AADC_REQUEST_AGE_SCREEN_LINK_TEXT, new Object[0]);
        String strC4 = com.waze.shared_infra.o.b.a().c(R.string.AADC_DATE_PICKER_TITLE, new Object[0]);
        String strC5 = com.waze.shared_infra.o.b.a().c(R.string.AADC_REQUEST_USER_AGE_OK, new Object[0]);
        String strB = ConfigValues.CONFIG_VALUE_AADC_LEARN_MORE_URL.b();
        x.e(strB, "getValue(...)");
        com.waze.shared_infra.q.i iVarA = eVar.a();
        int i2 = 13;
        int i3 = 14;
        af.e(this, strC, strC2, strC3, strB, strC4, strC5, new q(eVar, i2), eVar.e() ? new v(eVar, i2) : null, eVar.e() ? new v(eVar, i3) : null, new q(eVar, i3), iVarA, eVar.d());
    }
}
