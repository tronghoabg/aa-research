package com.waze.search.h;

import com.waze.R;
import com.waze.li;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class al implements ag {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.search.a.c.a f35775a;

    /* renamed from: b, reason: collision with root package name */
    private final p f35776b;

    public al(com.waze.search.a.c.a aVar, p pVar) {
        h.g.b.x.f(aVar, "categoryGroupItemTransformer");
        h.g.b.x.f(pVar, "onClick");
        this.f35775a = aVar;
        this.f35776b = pVar;
    }

    public static /* synthetic */ h.ab b(al alVar, int i2, int i3, com.waze.search.d.a.a.a aVar) {
        h.g.b.x.f(aVar, "categoryItem");
        alVar.f35776b.a(aVar, i2 + i3);
        return h.ab.f48028a;
    }

    static final h.ab c(al alVar, com.waze.search.d.a.a.a aVar) {
        h.g.b.x.f(aVar, "it");
        alVar.f35776b.a(aVar, 0);
        return h.ab.f48028a;
    }

    static final h.ab d(al alVar, int i2, com.waze.search.d.a.a.a aVar) {
        h.g.b.x.f(aVar, "it");
        alVar.f35776b.a(aVar, i2);
        return h.ab.f48028a;
    }

    @Override // com.waze.search.h.ag
    public final com.waze.search.e.h a(List list) {
        h.g.b.x.f(list, "venueGroups");
        ArrayList arrayList = new ArrayList();
        h.g.a.l lVar = new h.g.a.l() { // from class: com.waze.search.h.ai
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return al.c(this.f35769a, (com.waze.search.d.a.a.a) obj);
            }
        };
        com.waze.ui.ac.j jVar = new com.waze.ui.ac.j(R.string.SEARCH_ZERO_STATE_CATEGORY_SAVED);
        com.waze.design_components.b.e eVar = com.waze.design_components.b.e.f23314c;
        com.waze.ui.ac.f fVar = new com.waze.ui.ac.f(com.waze.av.c.b.c("category_saved_places", null, null, eVar, 6));
        com.waze.design_components.b.e eVar2 = com.waze.design_components.b.e.f23312a;
        arrayList.add(new com.waze.search.d.a.a.a("category_saved_places", jVar, fVar, new com.waze.ui.ac.f(com.waze.av.c.b.c("category_saved_places", null, null, eVar2, 6)), lVar));
        final int size = arrayList.size();
        final int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.i.p();
            }
            arrayList.add(this.f35775a.a((li) obj, new h.g.a.l() { // from class: com.waze.search.h.aj
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return al.b(this.f35770a, i2, size, (com.waze.search.d.a.a.a) obj2);
                }
            }));
            i2 = i3;
        }
        if (!list.isEmpty()) {
            final int size2 = arrayList.size();
            arrayList.add(new com.waze.search.d.a.a.a("category_more", new com.waze.ui.ac.j(R.string.SEARCH_ZERO_STATE_CATEGORY_MORE), new com.waze.ui.ac.f(com.waze.av.c.b.c("category_more", null, null, eVar, 6)), new com.waze.ui.ac.f(com.waze.av.c.b.c("category_more", null, null, eVar2, 6)), new h.g.a.l() { // from class: com.waze.search.h.ak
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return al.d(this.f35773a, size2, (com.waze.search.d.a.a.a) obj2);
                }
            }));
        }
        return new com.waze.search.e.h(arrayList);
    }
}
