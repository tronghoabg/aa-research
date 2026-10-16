package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.waze.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f6477a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6478b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6479c;

    public m() {
        Calendar calendarK = ax.k();
        this.f6477a = calendarK;
        this.f6478b = calendarK.getMaximum(7);
        this.f6479c = calendarK.getFirstDayOfWeek();
    }

    private final int a(int i2) {
        int i3 = i2 + this.f6479c;
        int i4 = this.f6478b;
        return i3 > i4 ? i3 - i4 : i3;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f6478b;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i2) {
        if (i2 >= this.f6478b) {
            return null;
        }
        return Integer.valueOf(a(i2));
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f6477a;
        calendar.set(7, a(i2));
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public m(int i2) {
        Calendar calendarK = ax.k();
        this.f6477a = calendarK;
        this.f6478b = calendarK.getMaximum(7);
        this.f6479c = i2;
    }
}
