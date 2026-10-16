package com.google.android.material.datepicker;

import android.support.v7.widget.fe;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class an extends fe {

    /* renamed from: a, reason: collision with root package name */
    final TextView f6417a;

    /* renamed from: b, reason: collision with root package name */
    final MaterialCalendarGridView f6418b;

    an(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f6417a = textView;
        ViewCompat.setAccessibilityHeading(textView, true);
        this.f6418b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
