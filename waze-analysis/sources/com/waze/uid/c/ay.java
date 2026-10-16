package com.waze.uid.c;

import android.os.Bundle;
import android.view.View;
import com.waze.R;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ay extends be {
    public ay() {
        super(R.layout.fragment_request_user_age, null, com.waze.uid.activities.e.f44087a, false, bd.f44257a, 2);
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        String strC = com.waze.shared_infra.o.b.a().c(R.string.AADC_REQUEST_AGE_SCREEN_TITLE, new Object[0]);
        String strC2 = com.waze.shared_infra.o.b.a().c(R.string.AADC_REQUEST_AGE_SCREEN_BODY, new Object[0]);
        String strC3 = com.waze.shared_infra.o.b.a().c(R.string.AADC_REQUEST_AGE_SCREEN_LINK_TEXT, new Object[0]);
        String strC4 = com.waze.shared_infra.o.b.a().c(R.string.AADC_DATE_PICKER_TITLE, new Object[0]);
        String strC5 = com.waze.shared_infra.o.b.a().c(R.string.AADC_REQUEST_USER_AGE_OK, new Object[0]);
        String strB = ConfigValues.CONFIG_VALUE_AADC_LEARN_MORE_URL.b();
        h.g.b.x.e(strB, "getValue(...)");
        com.waze.a.af.e(this, strC, strC2, strC3, strB, strC4, strC5, new c(this, 3), null, null, new com.waze.ui.x.a(11), null, true);
    }
}
