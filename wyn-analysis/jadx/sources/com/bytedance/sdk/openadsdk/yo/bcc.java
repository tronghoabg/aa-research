package com.bytedance.sdk.openadsdk.yo;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.yo.zjm;
import java.util.List;

/* loaded from: classes3.dex */
public class bcc extends ViewGroup implements zjm.yo {
    private final zjm uef;

    public bcc(Context context, zjm zjmVar) {
        super(context);
        this.uef = zjmVar;
        zjmVar.uef(this);
    }

    private View oa(FilterWord filterWord) {
        TextView textView = new TextView(getContext());
        textView.setTag(filterWord);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int iOa = af.oa(getContext(), 8.0f);
        marginLayoutParams.leftMargin = iOa;
        marginLayoutParams.bottomMargin = iOa;
        textView.setTextColor(uef());
        textView.setText(filterWord.getName());
        textView.setPadding(iOa, iOa, iOa, iOa);
        textView.setBackground(oa());
        textView.setSelected(false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.yo.bcc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (bcc.this.uef != null) {
                    if (view.isSelected()) {
                        bcc.this.uef.uef(zjm.uef);
                        return;
                    }
                    Object tag = view.getTag();
                    if (tag instanceof FilterWord) {
                        bcc.this.uef.uef((FilterWord) tag);
                    }
                }
            }
        });
        textView.setSelected(false);
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        int i13;
        int childCount = getChildCount();
        int i14 = i11 - i5;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i18 = i15 != 0 ? marginLayoutParams.leftMargin : 0;
            if (measuredWidth + i18 + i16 < i14) {
                i13 = i16 + i18;
            } else {
                i17 += marginLayoutParams.bottomMargin + measuredHeight;
                i13 = 0;
            }
            childAt.layout(i13, marginLayoutParams.topMargin + i17, i13 + measuredWidth, measuredHeight + i17);
            i16 = i13 + measuredWidth + marginLayoutParams.rightMargin;
            i15++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        View.MeasureSpec.getMode(i5);
        View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i5);
        View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < getChildCount()) {
            View childAt = getChildAt(i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i5, i10);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = i11 != 0 ? marginLayoutParams.leftMargin : 0;
            int i15 = (measuredWidth + i14) + i13 < size ? i13 + i14 : 0;
            if (i15 == 0) {
                i12 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i13 = i15 + measuredWidth + marginLayoutParams.rightMargin;
            i11++;
        }
        setMeasuredDimension(size, i12);
    }

    public void uef(List<FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            FilterWord filterWord = list.get(i5);
            if (filterWord != null) {
                addView(oa(filterWord));
            }
        }
    }

    private ColorStateList uef() {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{Color.rgb(255, 44, 85), -16777216});
    }

    @Override // com.bytedance.sdk.openadsdk.yo.zjm.yo
    public void uef(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null) {
                if (zjm.uef.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }

    private Drawable oa() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fOa = af.oa(getContext(), 5.0f);
        gradientDrawable.setCornerRadius(fOa);
        gradientDrawable.setColor(Color.parseColor("#0D000000"));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(af.oa(getContext(), 1.0f), Color.parseColor("#FE2C55"));
        gradientDrawable2.setCornerRadius(fOa);
        gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }
}
