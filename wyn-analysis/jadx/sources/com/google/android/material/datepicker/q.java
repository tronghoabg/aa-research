package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.m0;
import com.wynauto.wyn.R;
import java.util.WeakHashMap;
import k1.F;
import k1.S;

/* loaded from: classes4.dex */
public final class q extends m0 {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f26963c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialCalendarGridView f26964d;

    public q(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f26963c = textView;
        WeakHashMap weakHashMap = S.f38779a;
        new F(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).g(textView, Boolean.TRUE);
        this.f26964d = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
