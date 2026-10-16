package com.waze.reports_v2.presentation;

import com.waze.config.ConfigValues;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class p {
    public p() {
    }

    public static int b() {
        return (int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_FTE_HINT_SHOWN_COUNT.b().longValue();
    }

    public static s c() {
        Object next;
        s sVar = s.f35069a;
        String strB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_LAST_SUCCESSFUL_REPORT_TYPE.b();
        h.g.b.x.e(strB, "getValue(...)");
        h.g.b.x.f(strB, "configString");
        Iterator<E> it = s.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (h.g.b.x.n(((s) next).a(), strB)) {
                break;
            }
        }
        return (s) next;
    }

    public /* synthetic */ p(byte[] bArr, byte[] bArr2) {
    }
}
