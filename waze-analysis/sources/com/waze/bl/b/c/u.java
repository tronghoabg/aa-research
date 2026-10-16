package com.waze.bl.b.c;

import com.waze.config.ConfigValues;
import com.waze.reports_v2.c.af;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements af {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f16980a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.t.a.k f16981b;

    public u(com.waze.shared_infra.i.e eVar, com.waze.t.a.k kVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(kVar, "audioLocaleProvider");
        this.f16980a = eVar;
        this.f16981b = kVar;
    }

    @Override // com.waze.reports_v2.c.af
    public final boolean a() {
        String str = (String) this.f16981b.b();
        if (str == null) {
            this.f16980a.b("audioLocaleProvider.currentValue() is null");
            return false;
        }
        if (str.length() == 0) {
            return false;
        }
        String strB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AGENT_SUPPORTED_LANGUAGES.b();
        h.g.b.x.c(strB);
        List listAe = h.n.o.ae(strB, new char[]{'|'});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAe) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (h.n.o.O((String) obj2, '-')) {
                arrayList2.add(obj2);
            } else {
                arrayList3.add(obj2);
            }
        }
        h.k kVar = new h.k(arrayList2, arrayList3);
        return h.a.i.au((List) kVar.a()).contains(str) || h.a.i.au((List) kVar.b()).contains(h.n.o.ai(str, '-'));
    }
}
