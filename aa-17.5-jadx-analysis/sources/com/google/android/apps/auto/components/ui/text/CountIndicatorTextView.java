package com.google.android.apps.auto.components.ui.text;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.eee;
import defpackage.ka;

/* loaded from: classes2.dex */
public class CountIndicatorTextView extends ka {
    public CountIndicatorTextView(Context context) {
        super(context);
    }

    private final int b(int i) {
        return getContext().getResources().getDimensionPixelSize(i);
    }

    private final void c(int i) {
        int iB = b(i);
        int iB2 = b(R.dimen.count_indicator_view_height);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(iB, iB2));
            return;
        }
        layoutParams.width = iB;
        layoutParams.height = iB2;
        setLayoutParams(layoutParams);
    }

    public final void a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("CountIndicatorTextView should not be used with negative numbers.");
        }
        int iB = b(R.dimen.count_indicator_view_left_right_padding);
        int iB2 = b(R.dimen.count_indicator_view_top_bottom_padding);
        setPadding(iB, iB2, iB, iB2);
        eee.d(this, 0);
        setIncludeFontPadding(false);
        setGravity(17);
        setTextAlignment(4);
        if (i <= 9) {
            c(R.dimen.count_indicator_view_single_digit_width);
            setText(String.valueOf(i), TextView.BufferType.SPANNABLE);
        } else {
            c(R.dimen.count_indicator_view_double_digit_width);
            setText("9+", TextView.BufferType.SPANNABLE);
        }
    }

    public CountIndicatorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CountIndicatorTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
