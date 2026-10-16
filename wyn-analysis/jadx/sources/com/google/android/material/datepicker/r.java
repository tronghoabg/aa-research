package com.google.android.material.datepicker;

import a2.C1323c;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.W;
import androidx.recyclerview.widget.m0;
import com.wynauto.wyn.R;
import java.util.Calendar;

/* loaded from: classes4.dex */
public final class r extends I {

    /* renamed from: i, reason: collision with root package name */
    public final b f26965i;

    /* renamed from: j, reason: collision with root package name */
    public final C1323c f26966j;
    public final int k;

    public r(ContextThemeWrapper contextThemeWrapper, b bVar, C1323c c1323c) {
        n nVar = bVar.f26892a;
        n nVar2 = bVar.f26895d;
        if (nVar.f26949a.compareTo(nVar2.f26949a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (nVar2.f26949a.compareTo(bVar.f26893b.f26949a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.k = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * o.f26956d) + (l.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f26965i = bVar;
        this.f26966j = c1323c;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.I
    public final int getItemCount() {
        return this.f26965i.f26898g;
    }

    @Override // androidx.recyclerview.widget.I
    public final long getItemId(int i5) {
        Calendar calendarA = v.a(this.f26965i.f26892a.f26949a);
        calendarA.add(2, i5);
        calendarA.set(5, 1);
        Calendar calendarA2 = v.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.I
    public final void onBindViewHolder(m0 m0Var, int i5) {
        q qVar = (q) m0Var;
        b bVar = this.f26965i;
        Calendar calendarA = v.a(bVar.f26892a.f26949a);
        calendarA.add(2, i5);
        n nVar = new n(calendarA);
        qVar.f26963c.setText(nVar.f());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) qVar.f26964d.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !nVar.equals(materialCalendarGridView.a().f26958a)) {
            new o(nVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.I
    public final m0 onCreateViewHolder(ViewGroup viewGroup, int i5) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!l.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new q(linearLayout, false);
        }
        linearLayout.setLayoutParams(new W(-1, this.k));
        return new q(linearLayout, true);
    }
}
