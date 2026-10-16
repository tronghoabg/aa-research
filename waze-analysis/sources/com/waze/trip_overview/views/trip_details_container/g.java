package com.waze.trip_overview.views.trip_details_container;

import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.waze.R;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends eb {

    /* renamed from: a, reason: collision with root package name */
    private final List f41562a = new ArrayList();

    public final void a(List list) {
        x.f(list, "data");
        List list2 = this.f41562a;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f41562a.size();
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ void onBindViewHolder(fe feVar, int i2) {
        i iVar = (i) feVar;
        x.f(iVar, "holder");
        List list = this.f41562a;
        h hVar = (h) list.get(i2);
        List list2 = list;
        iVar.a(hVar, i2 == h.a.i.n(list2).a(), i2 == h.a.i.n(list2).b());
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        x.f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.trip_overview_footer_item, viewGroup, false);
        x.e(viewInflate, "inflate(...)");
        return new i(viewInflate);
    }
}
