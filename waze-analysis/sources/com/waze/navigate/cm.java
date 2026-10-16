package com.waze.navigate;

import android.view.ViewGroup;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class cm extends android.support.v7.widget.eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HistoryActivity f31170a;

    /* renamed from: b, reason: collision with root package name */
    private final List f31171b;

    cm(HistoryActivity historyActivity, List list) {
        Objects.requireNonNull(historyActivity);
        this.f31170a = historyActivity;
        this.f31171b = list;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f31171b.size();
    }

    @Override // android.support.v7.widget.eb
    public final void onBindViewHolder(android.support.v7.widget.fe feVar, int i2) {
        if (!(feVar instanceof com.waze.destination_cell.view.e)) {
            com.waze.shared_infra.i.h.g("HistoryActivity: onBindViewHolder cannot identify destination cell");
        } else {
            ((com.waze.destination_cell.b.g) ((com.waze.destination_cell.view.e) feVar).a()).i(new ct((AddressItem) this.f31171b.get(i2)));
        }
    }

    @Override // android.support.v7.widget.eb
    public final android.support.v7.widget.fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        HistoryActivity historyActivity = this.f31170a;
        com.waze.destination_cell.view.c cVarA = com.waze.destination_cell.view.c.a(historyActivity);
        return new com.waze.destination_cell.view.e(cVarA, com.waze.destination_cell.b.e.a(cVarA, historyActivity.f30925h, historyActivity));
    }
}
