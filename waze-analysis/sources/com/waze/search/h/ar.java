package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar implements ao {

    /* renamed from: a, reason: collision with root package name */
    private final ca f35786a;

    /* renamed from: b, reason: collision with root package name */
    private final af f35787b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.search.c.h f35788c;

    public ar(ca caVar, af afVar, com.waze.search.c.h hVar) {
        h.g.b.x.f(caVar, "searchListItemTransformer");
        h.g.b.x.f(afVar, "searchEmptyStateCategoriesTransformerCreator");
        h.g.b.x.f(hVar, "searchEmptyStateListBuilder");
        this.f35786a = caVar;
        this.f35787b = afVar;
        this.f35788c = hVar;
    }

    @Override // com.waze.search.h.ao
    public final ap a(com.waze.j.f fVar, am amVar) {
        h.g.b.x.f(fVar, "ctaItemCallback");
        h.g.b.x.f(amVar, "searchEmptyStateListHandler");
        return new aw(this.f35788c, this.f35787b.a(new aq(amVar)), this.f35786a, amVar, fVar);
    }
}
