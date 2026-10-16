package defpackage;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import com.google.android.projection.gearhead.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class woh extends BaseAdapter {
    static final int a = woq.e(null).getMaximum(4);
    public static final int b = (woq.e(null).getMaximum(5) + woq.e(null).getMaximum(7)) - 1;
    public final Month c;
    public final DateSelector d;
    public Collection e;
    public wnr f;
    final CalendarConstraints g;
    final DayViewDecorator h;

    public woh(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.c = month;
        this.d = dateSelector;
        this.g = calendarConstraints;
        this.h = dayViewDecorator;
        this.e = dateSelector.a();
    }

    private final void j(TextView textView, long j, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        wnq wnqVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean zK = k(j);
        DateSelector dateSelector = this.d;
        Iterator it = dateSelector.b().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Object obj = ((dzi) it.next()).a;
            if (obj != null && ((Long) obj).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Iterator it2 = dateSelector.b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = false;
                break;
            }
            Object obj2 = ((dzi) it2.next()).b;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z3 = true;
                break;
            }
        }
        Calendar calendarD = woq.d();
        Calendar calendarE = woq.e(null);
        calendarE.setTimeInMillis(j);
        String str = calendarD.get(1) == calendarE.get(1) ? woq.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : woq.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (zK) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z2) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z3) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.g.c.a()) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.a().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                } else if (woq.a(j) == woq.a(((Long) it3.next()).longValue())) {
                    z = true;
                    break;
                }
            }
            textView.setSelected(z);
            if (z) {
                wnqVar = this.f.b;
            } else {
                boolean zK2 = k(j);
                wnr wnrVar = this.f;
                wnqVar = zK2 ? wnrVar.c : wnrVar.a;
            }
        } else {
            textView.setEnabled(false);
            wnqVar = this.f.g;
        }
        if (this.h == null || i == -1) {
            wnqVar.d(textView);
            return;
        }
        Month month = this.c;
        int i2 = month.c;
        int i3 = month.b;
        throw null;
    }

    private static final boolean k(long j) {
        return woq.d().getTimeInMillis() == j;
    }

    public final int a() {
        return c(e() - 1);
    }

    public final int b() {
        return d(f() + 1);
    }

    public final int c(int i) {
        do {
            i++;
            if (i > f()) {
                return -1;
            }
        } while (!i(i));
        return i;
    }

    public final int d(int i) {
        for (int i2 = i - 1; i2 >= e(); i2--) {
            if (i(i2)) {
                return i2;
            }
        }
        return -1;
    }

    public final int e() {
        Month month = this.c;
        Calendar calendar = month.a;
        int i = calendar.get(7);
        int firstDayOfWeek = this.g.e;
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + month.d : i2;
    }

    public final int f() {
        return (e() + this.c.e) - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < e() || i > f()) {
            return null;
        }
        Month month = this.c;
        int iE = i - e();
        Calendar calendarC = woq.c(month.a);
        calendarC.set(5, iE + 1);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return b;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.c.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            wnr r1 = r5.f
            if (r1 != 0) goto Lf
            wnr r1 = new wnr
            r1.<init>(r0)
            r5.f = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L27
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131624379(0x7f0e01bb, float:1.8875936E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r7 = r5.e()
            int r7 = r6 - r7
            if (r7 < 0) goto L5d
            com.google.android.material.datepicker.Month r8 = r5.c
            int r2 = r8.e
            if (r7 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L66
        L5d:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 == 0) goto L73
            long r1 = r6.longValue()
            r5.j(r0, r1, r7)
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.woh.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final void h(MaterialCalendarGridView materialCalendarGridView, long j) {
        Month monthC = Month.c(j);
        Month month = this.c;
        if (monthC.equals(month)) {
            Calendar calendarC = woq.c(month.a);
            calendarC.setTimeInMillis(j);
            int i = calendarC.get(5);
            j((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().e() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public final boolean i(int i) {
        Long item = getItem(i);
        if (item == null) {
            return false;
        }
        CalendarConstraints calendarConstraints = this.g;
        item.longValue();
        return calendarConstraints.c.a();
    }
}
