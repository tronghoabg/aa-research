package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class am implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MaterialCalendarGridView f6415a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ao f6416b;

    am(ao aoVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f6415a = materialCalendarGridView;
        Objects.requireNonNull(aoVar);
        this.f6416b = aoVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f6415a;
        ak adapter = materialCalendarGridView.getAdapter();
        if (i2 < adapter.g() || i2 > adapter.h()) {
            return;
        }
        s sVar = this.f6416b.f6425g;
        long jLongValue = materialCalendarGridView.getAdapter().getItem(i2).longValue();
        z zVar = sVar.f6488a;
        if (zVar.f6498c.f().a(jLongValue)) {
            zVar.r.h(jLongValue);
            Iterator it = zVar.f6427a.iterator();
            while (it.hasNext()) {
                ((ap) it.next()).b(zVar.r.b());
            }
            zVar.f6503h.j().notifyDataSetChanged();
            if (zVar.f6502g != null) {
                zVar.f6502g.j().notifyDataSetChanged();
            }
        }
    }
}
