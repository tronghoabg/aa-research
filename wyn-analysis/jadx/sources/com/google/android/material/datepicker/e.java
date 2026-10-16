package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.wynauto.wyn.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class e extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26902d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f26903a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26904b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26905c;

    static {
        f26902d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar calendarC = v.c(null);
        this.f26903a = calendarC;
        this.f26904b = calendarC.getMaximum(7);
        this.f26905c = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f26904b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i5) {
        int i10 = this.f26904b;
        if (i5 >= i10) {
            return null;
        }
        int i11 = i5 + this.f26905c;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i10 = i5 + this.f26905c;
        int i11 = this.f26904b;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.f26903a;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, f26902d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i5) {
        Calendar calendarC = v.c(null);
        this.f26903a = calendarC;
        this.f26904b = calendarC.getMaximum(7);
        this.f26905c = i5;
    }
}
