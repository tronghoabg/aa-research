package com.waze.search.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f35584a;

    public a(h.g.a.a aVar) {
        x.f(aVar, "symbolStyle");
        this.f35584a = aVar;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        com.waze.menus.a.a.g gVar = (com.waze.menus.a.a.g) obj;
        x.f(gVar, "option");
        return gVar == com.waze.menus.a.a.f29649l ? x.n(this.f35584a.invoke(), "latam") ? new com.waze.ui.ac.f(com.waze.design_components.b.d.ai.b()) : gVar.a() : gVar.a();
    }
}
