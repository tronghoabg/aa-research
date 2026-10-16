package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.j.b.a f35807a;

    /* renamed from: b, reason: collision with root package name */
    private final a f35808b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.search.stats.s f35809c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.av.b.o f35810d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.j.a.b f35811e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f35812f;

    /* renamed from: g, reason: collision with root package name */
    private final ad f35813g;

    public b(com.waze.j.b.a aVar, a aVar2, com.waze.search.stats.s sVar, com.waze.av.b.o oVar, com.waze.j.a.b bVar, ad adVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "autocompleteRepository");
        h.g.b.x.f(aVar2, "autocompleteConfig");
        h.g.b.x.f(sVar, "searchStatsSender");
        h.g.b.x.f(oVar, "genericPlaceActions");
        h.g.b.x.f(bVar, "searchAutocompleteListTransformerCreator");
        h.g.b.x.f(adVar, "distanceFromCurrentLocation");
        h.g.b.x.f(eVar, "logger");
        this.f35807a = aVar;
        this.f35808b = aVar2;
        this.f35809c = sVar;
        this.f35810d = oVar;
        this.f35811e = bVar;
        this.f35813g = adVar;
        this.f35812f = eVar;
    }

    public final o a(ay ayVar, boolean z) {
        h.g.b.x.f(ayVar, "destinationCellAction");
        com.waze.shared_infra.i.e eVar = this.f35812f;
        return new o(this.f35807a, ayVar, this.f35808b, this.f35809c, this.f35810d, this.f35811e, this.f35813g, z, eVar);
    }
}
