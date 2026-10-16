package com.waze.search.h;

import com.waze.R;
import com.waze.config.cv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aw implements ap {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.search.c.h f35797a;

    /* renamed from: b, reason: collision with root package name */
    private final ag f35798b;

    /* renamed from: c, reason: collision with root package name */
    private final ca f35799c;

    /* renamed from: d, reason: collision with root package name */
    private final am f35800d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.j.f f35801e;

    public aw(com.waze.search.c.h hVar, ag agVar, ca caVar, am amVar, com.waze.j.f fVar) {
        h.g.b.x.f(hVar, "searchEmptyStateListBuilder");
        h.g.b.x.f(agVar, "searchEmptyStateCategoriesTransformer");
        h.g.b.x.f(caVar, "searchListItemTransformer");
        h.g.b.x.f(amVar, "searchEmptyStateListHandler");
        h.g.b.x.f(fVar, "ctaItemCallback");
        this.f35797a = hVar;
        this.f35798b = agVar;
        this.f35799c = caVar;
        this.f35800d = amVar;
        this.f35801e = fVar;
    }

    static final void b(aw awVar, int i2, com.waze.av.b.n nVar, com.waze.search.e.p pVar) {
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(pVar, "<unused var>");
        awVar.f35800d.d(nVar, i2);
    }

    static final void c(aw awVar, int i2, com.waze.av.b.n nVar, com.waze.search.e.p pVar) {
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(pVar, "dc");
        awVar.f35800d.e(nVar, pVar, i2);
    }

    static final void d(aw awVar, int i2, com.waze.av.b.n nVar, com.waze.search.e.p pVar, com.waze.z.a.ae aeVar) {
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(pVar, "destinationCell");
        h.g.b.x.f(aeVar, "swipeAnchor");
        awVar.f35800d.c(nVar, pVar, aeVar, i2);
    }

    static final void e(aw awVar, int i2, com.waze.av.b.n nVar, com.waze.search.e.p pVar, com.waze.z.a.ad adVar) {
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(pVar, "destinationCell");
        h.g.b.x.f(adVar, "swipeAction");
        awVar.f35800d.b(nVar, pVar, adVar, i2);
    }

    private final com.waze.search.e.z f(com.waze.search.c.f fVar, final int i2) {
        return this.f35799c.a(fVar.a(), new com.waze.search.c.b() { // from class: com.waze.search.h.as
            @Override // com.waze.search.c.b
            public final void a(com.waze.av.b.n nVar, com.waze.search.e.p pVar) {
                aw.b(this.f35789a, i2, nVar, pVar);
            }
        }, new com.waze.search.c.b() { // from class: com.waze.search.h.at
            @Override // com.waze.search.c.b
            public final void a(com.waze.av.b.n nVar, com.waze.search.e.p pVar) {
                aw.c(this.f35791a, i2, nVar, pVar);
            }
        }, new au(this, i2), new av(this, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    @Override // com.waze.search.h.ap
    public final List a(List list, an anVar) {
        Object next;
        Object next2;
        com.waze.search.c.f next3;
        com.waze.search.e.p pVar;
        com.waze.search.e.p pVar2;
        h.g.b.x.f(list, "items");
        h.g.b.x.f(anVar, "ctas");
        List listA = this.f35797a.a(list);
        ArrayList arrayList = new ArrayList();
        List list2 = listA;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.waze.search.c.g) next) instanceof com.waze.search.c.e) {
                break;
            }
        }
        com.waze.search.c.e eVar = next instanceof com.waze.search.c.e ? (com.waze.search.c.e) next : null;
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            com.waze.search.c.g gVar = (com.waze.search.c.g) next2;
            if ((gVar instanceof com.waze.search.c.f) && com.waze.ac.e.x(((com.waze.search.c.f) gVar).a())) {
                break;
            }
        }
        com.waze.search.c.f fVar = next2 instanceof com.waze.search.c.f ? (com.waze.search.c.f) next2 : null;
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = 0;
                break;
            }
            next3 = it3.next();
            com.waze.search.c.g gVar2 = (com.waze.search.c.g) next3;
            if ((gVar2 instanceof com.waze.search.c.f) && com.waze.ac.e.A(((com.waze.search.c.f) gVar2).a())) {
                break;
            }
        }
        com.waze.search.c.f fVar2 = next3 instanceof com.waze.search.c.f ? next3 : null;
        int i2 = 0;
        if (eVar != null) {
            arrayList.add(0, this.f35798b.a(eVar.a()));
        }
        if (fVar != null) {
            pVar = f(fVar, 0);
        } else {
            com.waze.j.f fVar3 = this.f35801e;
            int i3 = cd.f35888a;
            h.g.b.x.f(fVar3, "onClick");
            pVar = new com.waze.search.e.p("home", new com.waze.ui.ac.f(com.waze.design_components.b.d.f23304e.c(com.waze.design_components.b.e.f23314c)), new com.waze.ui.ac.j(R.string.DESTINATION_CELL_HOME_TITLE), null, new cv(fVar3, 5), null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.j(R.string.DESTINATION_CELL_HOME_SUBTITLE), true), null, null, com.waze.search.e.r.f35648b, null, 28136);
        }
        arrayList.add(pVar);
        if (fVar2 != null) {
            pVar2 = f(fVar2, 1);
        } else {
            com.waze.j.f fVar4 = this.f35801e;
            int i4 = cd.f35888a;
            h.g.b.x.f(fVar4, "onClick");
            pVar2 = new com.waze.search.e.p("work", new com.waze.ui.ac.f(com.waze.design_components.b.d.f23309j.c(com.waze.design_components.b.e.f23314c)), new com.waze.ui.ac.j(R.string.WORK), null, new cv(fVar4, 6), null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.j(R.string.DESTINATION_CELL_WORK_SUBTITLE), true), null, null, com.waze.search.e.r.f35648b, null, 28136);
        }
        arrayList.add(pVar2);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            com.waze.search.c.g gVar3 = (com.waze.search.c.g) obj;
            if (gVar3 instanceof com.waze.search.c.f) {
                com.waze.search.c.f fVar5 = (com.waze.search.c.f) gVar3;
                if (!com.waze.ac.e.x(fVar5.a()) && !com.waze.ac.e.A(fVar5.a())) {
                    arrayList2.add(obj);
                }
            }
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(h.a.i.q(arrayList3, 10));
        for (Object obj2 : arrayList3) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                h.a.i.p();
            }
            com.waze.search.c.g gVar4 = (com.waze.search.c.g) obj2;
            h.g.b.x.d(gVar4, "null cannot be cast to non-null type com.waze.search.domain.SearchEmptyStateListBuilder.Item.GenericPlaceListItem");
            arrayList4.add(f((com.waze.search.c.f) gVar4, i2 + 2));
            i2 = i5;
        }
        ArrayList arrayList5 = arrayList4;
        if (!arrayList5.isEmpty()) {
            int i6 = cd.f35888a;
            arrayList.add(new com.waze.search.e.w(new com.waze.ui.ac.j(R.string.DESTINATION_SECTION_RECENT_TITLE)));
            arrayList.addAll(arrayList5);
        }
        if (anVar.b() || anVar.a()) {
            if (!arrayList5.isEmpty()) {
                int i7 = cd.f35888a;
                arrayList.add(new com.waze.search.e.w(new com.waze.ui.ac.j(R.string.DESTINATION_SECTION_MORE_TITLE)));
            }
            if (anVar.b()) {
                com.waze.j.f fVar6 = this.f35801e;
                int i8 = cd.f35888a;
                h.g.b.x.f(fVar6, "onClick");
                arrayList.add(new com.waze.search.e.p("contacts", new com.waze.ui.ac.f(com.waze.design_components.b.d.S.b()), new com.waze.ui.ac.j(R.string.DESTINATION_CELL_CONTACTS_TITLE), null, new cv(fVar6, 4), null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.j(R.string.DESTINATION_CELL_COTACTS_SUBTITLE), true), null, null, null, null, 32232));
            }
            if (anVar.a()) {
                com.waze.j.f fVar7 = this.f35801e;
                int i9 = cd.f35888a;
                h.g.b.x.f(fVar7, "onClick");
                arrayList.add(new com.waze.search.e.p("calendar", new com.waze.ui.ac.f(com.waze.design_components.b.d.ab.b()), new com.waze.ui.ac.j(R.string.DESTINATION_CELL_CALENDAR_TITLE), null, new cv(fVar7, 7), null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.j(R.string.DESTINATION_CELL_CALENDAR_SUBTITLE), true), null, null, null, null, 32232));
            }
        }
        return arrayList;
    }
}
