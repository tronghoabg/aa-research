package com.waze.j.a;

import com.waze.R;
import com.waze.bl.d.a.h;
import com.waze.iv;
import com.waze.j.j;
import com.waze.j.l;
import com.waze.mo;
import com.waze.search.e.p;
import com.waze.search.e.v;
import com.waze.search.e.z;
import com.waze.ui.ac.k;
import com.waze.w.i;
import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    private final j f24862a;

    /* renamed from: b, reason: collision with root package name */
    private final l f24863b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f24864c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.search.h.f f24865d;

    public g(j jVar, l lVar, com.waze.search.h.f fVar, h.g.a.a aVar) {
        x.f(jVar, "autoCompleteListBuilder");
        x.f(lVar, "itemTransformer");
        x.f(fVar, "searchAutocompleteClickHandler");
        x.f(aVar, "howSuggestionsWorkLinkEnabled");
        this.f24862a = jVar;
        this.f24863b = lVar;
        this.f24865d = fVar;
        this.f24864c = aVar;
    }

    public static /* synthetic */ ab b(g gVar, String str) {
        x.f(str, "it");
        gVar.f24865d.b();
        return ab.f48028a;
    }

    public static /* synthetic */ ab c(g gVar, i iVar, String str, int i2, z zVar) {
        x.f(zVar, "it");
        gVar.f24865d.a(iVar, str, i2);
        return ab.f48028a;
    }

    public static /* synthetic */ ab d(g gVar, String str, int i2, String str2) {
        x.f(str2, "it");
        gVar.f24865d.c(str2, str, i2);
        return ab.f48028a;
    }

    @Override // com.waze.j.a.c
    public final List a(final String str, List list) {
        x.f(str, "searchTerm");
        x.f(list, "autoCompletePlaces");
        List listA = this.f24862a.a(str, list);
        ArrayList arrayList = new ArrayList(h.a.i.q(listA, 10));
        Iterator it = listA.iterator();
        final int i2 = 0;
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i4 = i2 + 1;
            if (i2 < 0) {
                h.a.i.p();
            }
            final i iVar = (i) next;
            arrayList.add(this.f24863b.a(iVar, new h(iVar, str, i2, i3), new h.g.a.l() { // from class: com.waze.j.a.d
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return g.c(this.f24854a, iVar, str, i2, (z) obj);
                }
            }, new mo(9)));
            i2 = i4;
        }
        List listAq = h.a.i.aq(arrayList);
        final int size = listAq.size();
        List list2 = listAq;
        list2.add(new p("AUTOCOMPLETE_MORE_ITEM_ID", new com.waze.ui.ac.f(com.waze.design_components.b.d.aj.c(com.waze.design_components.b.e.f23312a)), new k(R.string.AUTOCOMPLETE_MORE_RESULTS_FOR, str), null, new iv(new com.waze.j.f() { // from class: com.waze.j.a.e
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return g.d(this.f24858a, str, size, (String) obj);
            }
        }, 4), null, null, null, null, null, null, null, null, 32744));
        if (((Boolean) this.f24864c.invoke()).booleanValue()) {
            list2.add(new v(new com.waze.ui.ac.j(R.string.ND4C_ALGO_TRANSPARENCY_LINK_SEARCH_TITLE), new h.g.a.l() { // from class: com.waze.j.a.f
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return g.b(this.f24861a, (String) obj);
                }
            }));
        }
        return listAq;
    }
}
