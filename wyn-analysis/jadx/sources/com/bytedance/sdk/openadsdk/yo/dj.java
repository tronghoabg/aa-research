package com.bytedance.sdk.openadsdk.yo;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class dj extends View {
    private final int uef;

    public dj(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        setMeasuredDimension(getMeasuredWidth(), this.uef);
    }

    public dj(Context context, int i5) {
        super(context);
        setBackgroundColor(i5);
        this.uef = af.oa(getContext(), 0.66f);
    }
}
