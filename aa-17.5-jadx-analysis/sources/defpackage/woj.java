package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class woj implements AdapterView.OnItemClickListener {
    final /* synthetic */ MaterialCalendarGridView a;
    final /* synthetic */ wol b;

    public woj(wol wolVar, MaterialCalendarGridView materialCalendarGridView) {
        this.a = materialCalendarGridView;
        this.b = wolVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        woh adapter = materialCalendarGridView.getAdapter();
        if (i < adapter.e() || i > adapter.f()) {
            return;
        }
        wol wolVar = this.b;
        materialCalendarGridView.getAdapter().getItem(i).longValue();
        woa woaVar = (woa) wolVar.f.a;
        if (woaVar.b.c.a()) {
            woaVar.a.h();
            Iterator it = woaVar.k.iterator();
            while (it.hasNext()) {
                ykd ykdVar = (ykd) it.next();
                woaVar.a.i();
                wod wodVar = (wod) ykdVar.a;
                wodVar.l(wodVar.i());
                wodVar.i.setEnabled(wodVar.h().c());
            }
            woaVar.f.m.g();
            RecyclerView recyclerView = woaVar.e;
            if (recyclerView != null) {
                recyclerView.m.g();
            }
        }
    }
}
