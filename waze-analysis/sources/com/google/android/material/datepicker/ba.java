package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import com.waze.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ba extends eb {

    /* renamed from: a, reason: collision with root package name */
    private final z f6440a;

    ba(z zVar) {
        this.f6440a = zVar;
    }

    final int a(int i2) {
        return i2 - this.f6440a.i().m().f6399b;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f6440a.i().d();
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ void onBindViewHolder(fe feVar, int i2) {
        z zVar = this.f6440a;
        int i3 = zVar.i().m().f6399b + i2;
        TextView textView = ((az) feVar).f6439a;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i3);
        textView.setText(String.format(locale, "%d", numValueOf));
        Context context = textView.getContext();
        textView.setContentDescription(ax.j().get(1) == i3 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), numValueOf) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), numValueOf));
        e eVarK = zVar.k();
        Calendar calendarJ = ax.j();
        d dVar = calendarJ.get(1) == i3 ? eVarK.f6459f : eVarK.f6457d;
        Iterator it = zVar.w().e().iterator();
        while (it.hasNext()) {
            calendarJ.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarJ.get(1) == i3) {
                dVar = eVarK.f6458e;
            }
        }
        dVar.e(textView);
        if (!(textView.getForeground() instanceof FocusRingDrawable)) {
            Drawable drawableB = FocusRingDrawable.b(textView.getContext(), textView.getForeground());
            if (drawableB instanceof FocusRingDrawable) {
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) drawableB;
                focusRingDrawable.h(dVar.d());
                focusRingDrawable.f(dVar.b());
                textView.setForeground(focusRingDrawable);
            }
        }
        textView.setSelected(dVar == eVarK.f6458e);
        textView.setOnClickListener(new ay(this, i3));
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new az((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
