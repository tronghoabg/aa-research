package com.waze.destination_cell.b;

import com.waze.navigate.AddressItem;
import com.waze.navigate.HistoryActivity;
import com.waze.navigate.location_preview.ba;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g extends k {

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bt.e f23502c;

    /* renamed from: d, reason: collision with root package name */
    private final HistoryActivity f23503d;

    g(com.waze.destination_cell.view.c cVar, com.waze.bt.e eVar, HistoryActivity historyActivity) {
        super(cVar);
        this.f23502c = eVar;
        this.f23503d = historyActivity;
    }

    @Override // com.waze.destination_cell.b.k
    protected final void e(com.waze.destination_cell.a.a aVar) {
        super.e(aVar);
        com.waze.destination_cell.view.c cVar = this.f23556b;
        cVar.p(3);
        cVar.v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.waze.destination_cell.view.d
    public final void f() {
        if (this.f23512a == null) {
            com.waze.shared_infra.i.h.j("HistoryCellPresenter: AddressItem was null on destination cell clicked.");
            return;
        }
        int iOrdinal = this.f23502c.ordinal();
        if (iOrdinal == 1) {
            this.f23503d.o(true, this.f23512a);
            return;
        }
        HistoryActivity historyActivity = this.f23503d;
        if (iOrdinal == 2) {
            historyActivity.o(false, this.f23512a);
        } else {
            historyActivity.n(this.f23512a);
            ba.e().a(com.waze.navigate.b.b.u, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.waze.destination_cell.view.d
    public final void m() {
        AddressItem addressItem = this.f23512a;
        if (addressItem == null) {
            com.waze.shared_infra.i.h.a("HistoryCellPresenter: AddressItem was null on destination cell's more option clicked.");
            return;
        }
        addressItem.setType(8);
        HistoryActivity historyActivity = this.f23503d;
        com.waze.menus.g.a(historyActivity, this.f23512a, historyActivity);
    }
}
