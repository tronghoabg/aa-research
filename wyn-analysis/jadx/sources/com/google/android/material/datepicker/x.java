package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.m0;
import com.wynauto.wyn.R;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class x extends I {

    /* renamed from: i, reason: collision with root package name */
    public final k f26970i;

    public x(k kVar) {
        this.f26970i = kVar;
    }

    @Override // androidx.recyclerview.widget.I
    public final int getItemCount() {
        return this.f26970i.f26917c.f26897f;
    }

    @Override // androidx.recyclerview.widget.I
    public final void onBindViewHolder(m0 m0Var, int i5) {
        w wVar = (w) m0Var;
        k kVar = this.f26970i;
        int i10 = kVar.f26917c.f26892a.f26951c + i5;
        wVar.f26969c.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i10)));
        TextView textView = wVar.f26969c;
        Context context = textView.getContext();
        textView.setContentDescription(v.b().get(1) == i10 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10)));
        c cVar = kVar.f26920f;
        if (v.b().get(1) == i10) {
            a2.k kVar2 = cVar.f26900b;
        } else {
            a2.k kVar3 = cVar.f26899a;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.I
    public final m0 onCreateViewHolder(ViewGroup viewGroup, int i5) {
        return new w((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
