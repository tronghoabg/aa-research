package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* loaded from: classes3.dex */
class wop extends LinearLayoutManager {
    public wop(int i) {
        super(i);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.lz
    public final void as(RecyclerView recyclerView, int i) {
        woo wooVar = new woo(recyclerView.getContext());
        wooVar.b = i;
        bc(wooVar);
    }
}
