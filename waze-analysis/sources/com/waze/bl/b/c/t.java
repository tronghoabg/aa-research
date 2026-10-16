package com.waze.bl.b.c;

import com.waze.config.ConfigValues;
import com.waze.t.b.ap;
import com.waze.t.b.aq;
import com.waze.t.b.ar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t implements aq {

    /* renamed from: a, reason: collision with root package name */
    private final ap f16979a;

    public t(ap apVar, r rVar) {
        h.g.b.x.f(apVar, "frequencyFeedbackPolicy");
        h.g.b.x.f(rVar, "config");
        this.f16979a = apVar;
    }

    @Override // com.waze.t.b.aq
    public final boolean a(ar arVar) {
        Object next;
        h.g.b.x.f(arVar, "history");
        List listA = arVar.a();
        s sVar = s.f16972a;
        String strB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AGENT_FEEDBACK_TRIGGER_TYPE.b();
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
        s sVar2 = (s) next;
        if (sVar2 == null) {
            sVar2 = s.f16972a;
        }
        int iOrdinal = sVar2.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                List<com.waze.bl.c.b.j> list = listA;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return false;
                }
                for (com.waze.bl.c.b.j jVar : list) {
                    if (com.waze.bi.i.d(jVar) || com.waze.bi.i.c(jVar)) {
                    }
                }
                return false;
            }
            if (iOrdinal == 2) {
                List list2 = listA;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return false;
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (com.waze.bi.i.d((com.waze.bl.c.b.j) it2.next())) {
                    }
                }
                return false;
            }
            if (iOrdinal != 3) {
                throw new h.i();
            }
            List list3 = listA;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                return false;
            }
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                if (com.waze.bi.i.c((com.waze.bl.c.b.j) it3.next())) {
                }
            }
            return false;
        }
        return this.f16979a.a(arVar);
    }
}
