package com.waze.menus;

import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class y extends eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SideMenuAutoCompleteRecycler f29761a;

    /* synthetic */ y(SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler) {
        Objects.requireNonNull(sideMenuAutoCompleteRecycler);
        this.f29761a = sideMenuAutoCompleteRecycler;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler = this.f29761a;
        return sideMenuAutoCompleteRecycler.W ? sideMenuAutoCompleteRecycler.T.size() : sideMenuAutoCompleteRecycler.U.size();
    }

    @Override // android.support.v7.widget.eb
    public final int getItemViewType(int i2) {
        return this.f29761a.W ? 1 : 5;
    }

    @Override // android.support.v7.widget.eb
    public final void onBindViewHolder(fe feVar, int i2) {
        if (i2 >= 0) {
            SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler = this.f29761a;
            k kVar = sideMenuAutoCompleteRecycler.W ? (k) sideMenuAutoCompleteRecycler.T.get(i2) : (k) sideMenuAutoCompleteRecycler.U.get(i2);
            if (kVar == null) {
                com.waze.shared_infra.i.h.a("AutoCompleteAdapter: Failed to show to display item, since item is null.");
            } else if (feVar instanceof com.waze.destination_cell.view.a) {
                ((com.waze.destination_cell.view.a) feVar).a().b(kVar);
            }
        }
    }

    @Override // android.support.v7.widget.eb
    public final fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler = this.f29761a;
            com.waze.destination_cell.view.c cVarA = com.waze.destination_cell.view.c.a(sideMenuAutoCompleteRecycler.getContext());
            return new com.waze.destination_cell.view.a(cVarA, new com.waze.destination_cell.b.c(cVarA, sideMenuAutoCompleteRecycler));
        }
        if (i2 != 5) {
            com.waze.shared_infra.i.h.g("AutoCompleteAdapter: Failed to show an item complete item with irrelevant view type");
            SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler2 = this.f29761a;
            return new z(sideMenuAutoCompleteRecycler2, new View(sideMenuAutoCompleteRecycler2.getContext()));
        }
        SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler3 = this.f29761a;
        com.waze.destination_cell.view.c cVarA2 = com.waze.destination_cell.view.c.a(sideMenuAutoCompleteRecycler3.getContext());
        return new com.waze.destination_cell.view.a(cVarA2, new com.waze.destination_cell.b.d(cVarA2, sideMenuAutoCompleteRecycler3.aa, sideMenuAutoCompleteRecycler3));
    }
}
