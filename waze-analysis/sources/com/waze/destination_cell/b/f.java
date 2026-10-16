package com.waze.destination_cell.b;

import com.waze.an.c.w;
import com.waze.favorites.FavoritesActivity;
import com.waze.navigate.AddressItem;
import com.waze.navigate.location_preview.ba;
import com.waze.search.stats.s;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class f extends k {

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bt.e f23499c;

    /* renamed from: d, reason: collision with root package name */
    private final FavoritesActivity f23500d;

    /* renamed from: e, reason: collision with root package name */
    private w f23501e;

    f(com.waze.destination_cell.view.c cVar, com.waze.bt.e eVar, FavoritesActivity favoritesActivity) {
        super(cVar);
        this.f23499c = eVar;
        this.f23500d = favoritesActivity;
    }

    public final void b(com.waze.favorites.d dVar) {
        super.i(dVar);
        this.f23501e = dVar.k();
    }

    @Override // com.waze.destination_cell.b.k
    protected final /* bridge */ /* synthetic */ void e(com.waze.destination_cell.a.a aVar) {
        super.e((com.waze.favorites.d) aVar);
        com.waze.destination_cell.view.c cVar = this.f23556b;
        cVar.p(3);
        cVar.v();
    }

    @Override // com.waze.destination_cell.view.d
    public final void f() {
        s.f36105a.a().g(com.waze.search.stats.h.f36039d, this.f23501e.h() ? com.waze.search.stats.i.f36042b : this.f23501e.i() ? com.waze.search.stats.i.f36044d : com.waze.search.stats.i.f36043c);
        int iOrdinal = this.f23499c.ordinal();
        if (iOrdinal == 1) {
            this.f23500d.B(true, this.f23501e);
        } else if (iOrdinal == 2) {
            this.f23500d.B(false, this.f23501e);
        } else {
            ba.e().a(this.f23501e.h() ? com.waze.navigate.b.b.f31030c : this.f23501e.i() ? com.waze.navigate.b.b.f31036i : com.waze.navigate.b.b.v, null);
            this.f23500d.x(this.f23501e.f());
        }
    }

    @Override // com.waze.destination_cell.view.d
    public final void m() {
        AddressItem addressItemF = this.f23501e.f();
        FavoritesActivity favoritesActivity = this.f23500d;
        com.waze.menus.g.a(favoritesActivity, addressItemF, favoritesActivity);
    }
}
