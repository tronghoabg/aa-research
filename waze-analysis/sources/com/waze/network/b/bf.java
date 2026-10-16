package com.waze.network.b;

import com.waze.config.ConfigValues;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class bf {
    public /* synthetic */ bf(byte[] bArr) {
    }

    public static com.waze.reports_v2.presentation.ai g() {
        Object next;
        String strB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_SOUND_PACKAGE_NAME.b();
        Iterator<E> it = com.waze.reports_v2.presentation.ai.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String lowerCase = ((com.waze.reports_v2.presentation.ai) next).name().toLowerCase(Locale.ROOT);
            h.g.b.x.e(lowerCase, "toLowerCase(...)");
            if (h.g.b.x.n(lowerCase, strB)) {
                break;
            }
        }
        com.waze.reports_v2.presentation.ai aiVar = (com.waze.reports_v2.presentation.ai) next;
        return aiVar == null ? com.waze.reports_v2.presentation.ai.f34789a : aiVar;
    }

    private bf() {
        throw null;
    }

    public bf(char[] cArr) {
    }
}
