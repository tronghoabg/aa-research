package com.waze.j.a;

import com.waze.j.j;
import com.waze.j.l;
import h.g.b.ah;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final j f24851a;

    /* renamed from: b, reason: collision with root package name */
    private final l f24852b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.search.h.a f24853c;

    public b(j jVar, l lVar, com.waze.search.h.a aVar) {
        x.f(jVar, "autoCompleteListBuilder");
        x.f(lVar, "itemTransformer");
        x.f(aVar, "autocompleteConfig");
        this.f24851a = jVar;
        this.f24852b = lVar;
        this.f24853c = aVar;
    }

    public final c a(com.waze.search.h.f fVar) {
        x.f(fVar, "searchAutocompleteClickHandler");
        final com.waze.search.h.a aVar = this.f24853c;
        return new g(this.f24851a, this.f24852b, fVar, new ah(aVar) { // from class: com.waze.j.a.a
            @Override // h.g.b.ah, h.l.n
            public final Object get() {
                return Boolean.valueOf(((com.waze.search.h.a) this.receiver).a());
            }
        });
    }
}
