package com.waze.car_lib.login.a;

import com.waze.bh.b.c;
import com.waze.car_lib.login.o;
import com.waze.config.ConfigValues;
import h.g.b.x;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {
    public a(c cVar, o oVar) {
        x.f(cVar, "client");
        x.f(oVar, "wazeLoginManager");
        ck.b(com.waze.bh.b.a.f16755a);
    }

    public static final int a() {
        return (int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_FTE_HINT_SHOWN_COUNT.b().longValue();
    }

    public a() {
    }
}
