package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes4.dex */
public final class p implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f26961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f26962b;

    public p(r rVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f26962b = rVar;
        this.f26961a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j8) {
        MaterialCalendarGridView materialCalendarGridView = this.f26961a;
        o oVarA = materialCalendarGridView.a();
        if (i5 < oVarA.a() || i5 > oVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i5).longValue() >= ((k) this.f26962b.f26966j.f17156b).f26917c.f26894c.f26901a) {
            throw null;
        }
    }
}
