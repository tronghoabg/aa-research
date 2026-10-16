package com.waze.w;

import com.waze.ar;
import com.waze.li;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final ar f45472a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f45473b;

    public y(ar arVar, h.g.a.a aVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(arVar, "categoryGroupsProvider");
        h.g.b.x.f(aVar, "isEvUserSettingOn");
        h.g.b.x.f(eVar, "logger");
        this.f45472a = arVar;
        this.f45473b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List d(List list) {
        Object obj;
        Object next;
        if (list.isEmpty()) {
            return h.a.i.h();
        }
        if (((Boolean) this.f45473b.invoke()).booleanValue()) {
            List list2 = list;
            Iterator it = list2.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (h.g.b.x.n(((li) next).a(), "gas_station")) {
                    break;
                }
            }
            int I = h.a.i.I(list, next);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (h.g.b.x.n(((li) next2).a(), "charging_station")) {
                    obj = next2;
                    break;
                }
            }
            int I2 = h.a.i.I(list, obj);
            if (I != -1 && I2 != -1 && I < I2) {
                Collections.swap(list, I, I2);
            }
        }
        return list;
    }

    public final List b() {
        return d((List) this.f45472a.a().d());
    }

    public final kotlinx.coroutines.b.k c() {
        return ai.L(new w(this.f45472a.a(), this), new x(this, null));
    }
}
