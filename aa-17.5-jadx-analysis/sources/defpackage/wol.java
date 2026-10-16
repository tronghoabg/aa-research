package defpackage;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class wol extends lt {
    public Month a;
    public int e = 0;
    public final ykd f;
    private final CalendarConstraints g;
    private final DateSelector h;
    private final DayViewDecorator i;
    private final int j;
    private final ykd k;

    public wol(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, ykd ykdVar, ykd ykdVar2) {
        Month month = calendarConstraints.a;
        Month month2 = calendarConstraints.b;
        Month month3 = calendarConstraints.d;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.j = (woh.a * woa.a(context)) + (wod.o(context, R.attr.windowFullscreen) ? woa.a(context) : 0);
        this.g = calendarConstraints;
        this.h = dateSelector;
        this.i = dayViewDecorator;
        this.f = ykdVar;
        this.k = ykdVar2;
        this.a = month3;
        p(true);
    }

    @Override // defpackage.lt
    public final int a() {
        return this.g.g;
    }

    final int b(Month month) {
        return this.g.a.b(month);
    }

    public final Month c(int i) {
        return this.g.a.e(i);
    }

    @Override // defpackage.lt
    public final long e(int i) {
        return this.g.a.e(i).a.getTimeInMillis();
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.projection.gearhead.R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!wod.o(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new wok(linearLayout, false);
        }
        linearLayout.setLayoutParams(new ma(-1, this.j));
        return new wok(linearLayout, true);
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        wok wokVar = (wok) moVar;
        CalendarConstraints calendarConstraints = this.g;
        Month monthE = calendarConstraints.a.e(i);
        wokVar.s.setText(monthE.f());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) wokVar.t.findViewById(com.google.android.projection.gearhead.R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthE.equals(materialCalendarGridView.getAdapter().c)) {
            woh wohVar = new woh(monthE, this.h, calendarConstraints, this.i);
            materialCalendarGridView.setNumColumns(monthE.d);
            materialCalendarGridView.setAdapter((ListAdapter) wohVar);
        } else {
            materialCalendarGridView.invalidate();
            woh adapter = materialCalendarGridView.getAdapter();
            Iterator it = adapter.e.iterator();
            while (it.hasNext()) {
                adapter.h(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            DateSelector dateSelector = adapter.d;
            if (dateSelector != null) {
                Iterator it2 = dateSelector.a().iterator();
                while (it2.hasNext()) {
                    adapter.h(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                adapter.e = dateSelector.a();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new woj(this, materialCalendarGridView));
        materialCalendarGridView.a = this.k;
        boolean zO = wod.o(wokVar.a.getContext(), R.attr.windowFullscreen);
        if (zO || monthE.equals(this.a)) {
            materialCalendarGridView.setFocusable(true);
            materialCalendarGridView.setDescendantFocusability(131072);
            if (zO) {
                return;
            }
        } else {
            materialCalendarGridView.setFocusable(false);
            materialCalendarGridView.setDescendantFocusability(393216);
        }
        if (monthE.equals(this.a)) {
            final int i2 = this.e;
            this.e = 0;
            materialCalendarGridView.post(new Runnable() { // from class: woi
                @Override // java.lang.Runnable
                public final void run() {
                    int i3;
                    int iA;
                    MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                    if (!materialCalendarGridView2.hasFocus() || (i3 = i2) == 0) {
                        return;
                    }
                    woh adapter2 = materialCalendarGridView2.getAdapter();
                    if (i3 == 1) {
                        iA = adapter2.b();
                        if (iA == -1) {
                            iA = adapter2.f();
                        }
                    } else {
                        iA = adapter2.a();
                        if (iA == -1) {
                            iA = adapter2.e();
                        }
                    }
                    materialCalendarGridView2.setSelection(iA);
                }
            });
        }
    }

    final CharSequence s(int i) {
        return c(i).f();
    }
}
