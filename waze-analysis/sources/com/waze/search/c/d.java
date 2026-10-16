package com.waze.search.c;

import com.waze.li;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f35585a;

    public d(h.g.a.a aVar) {
        x.f(aVar, "categoriesLimit");
        this.f35585a = aVar;
    }

    @Override // com.waze.search.c.c
    public final List a(List list) {
        x.f(list, "venueGroups");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((li) obj).a().length() != 0) {
                arrayList.add(obj);
            }
        }
        return h.a.i.am(arrayList, ((Number) this.f35585a.invoke()).intValue());
    }
}
