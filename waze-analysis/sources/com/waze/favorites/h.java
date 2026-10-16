package com.waze.favorites;

import android.content.Intent;
import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.waze.R;
import com.waze.an.c.w;
import com.waze.sharedui.views.WazeTextView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FavoritesActivity f23803a;

    /* synthetic */ h(FavoritesActivity favoritesActivity) {
        Objects.requireNonNull(favoritesActivity);
        this.f23803a = favoritesActivity;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f23803a.f23784h.size();
    }

    @Override // android.support.v7.widget.eb
    public final int getItemViewType(int i2) {
        return ((i) this.f23803a.f23784h.get(i2)).a();
    }

    @Override // android.support.v7.widget.eb
    public final void onBindViewHolder(fe feVar, int i2) {
        FavoritesActivity favoritesActivity = this.f23803a;
        i iVar = (i) favoritesActivity.f23784h.get(i2);
        if (iVar instanceof a) {
            w wVarB = ((a) iVar).b();
            if (feVar instanceof com.waze.destination_cell.view.e) {
                ((com.waze.destination_cell.b.f) ((com.waze.destination_cell.view.e) feVar).a()).b(new d(wVarB, favoritesActivity.f23786l));
            } else {
                com.waze.shared_infra.i.h.g("FavoriteActivity: onBindViewHolder cannot identify destination cell");
            }
        }
    }

    @Override // android.support.v7.widget.eb
    public final fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                FavoritesActivity favoritesActivity = this.f23803a;
                com.waze.destination_cell.view.c cVarA = com.waze.destination_cell.view.c.a(favoritesActivity);
                return new com.waze.destination_cell.view.e(cVarA, com.waze.destination_cell.b.e.b(cVarA, favoritesActivity.p, favoritesActivity));
            }
            com.waze.shared_infra.i.h.g("Invalid view type in FavoritesAdapter: " + i2);
            return new g(this, new View(this.f23803a));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.add_new_favorite_cell, viewGroup, false);
        WazeTextView wazeTextView = (WazeTextView) viewInflate.findViewById(R.id.cellTitle);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.cellLeadIcon);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(com.waze.design_components.b.d.ax.c(com.waze.design_components.b.e.f23312a));
        wazeTextView.setText(this.f23803a.o.c(R.string.ADD_NEW_FAVORITE, new Object[0]));
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.waze.favorites.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.waze.search.stats.s.f36105a.a().g(com.waze.search.stats.h.f36038c, com.waze.search.stats.i.f36041a);
                int i3 = AddFavoriteActivity.f23776g;
                FavoritesActivity favoritesActivity2 = this.f23802a.f23803a;
                favoritesActivity2.startActivityForResult(new Intent(favoritesActivity2, (Class<?>) AddFavoriteActivity.class), 1);
            }
        });
        return new g(this, viewInflate, null);
    }
}
