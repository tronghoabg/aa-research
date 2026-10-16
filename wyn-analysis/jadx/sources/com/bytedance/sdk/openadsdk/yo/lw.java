package com.bytedance.sdk.openadsdk.yo;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.yo.zjm;

/* loaded from: classes3.dex */
public class lw extends com.bytedance.sdk.openadsdk.core.ivm.lw implements View.OnClickListener, zjm.yo {
    private StateListDrawable ivm;
    private FilterWord lw;
    private final zjm moa;
    private final int xs;
    public static FilterWord uef = new FilterWord("100:1", "GOOD");

    /* renamed from: oa, reason: collision with root package name */
    public static FilterWord f26199oa = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord yo = new FilterWord("100:3", "BAD");

    public lw(Context context, int i5, zjm zjmVar) {
        super(context);
        this.xs = i5;
        this.moa = zjmVar;
        if (zjmVar != null) {
            zjmVar.uef(this);
        }
        uef(i5);
        uef();
        oa();
    }

    private void oa() {
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(getContext());
        bccVar.setTextSize(this.moa.cz() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, af.oa(getContext(), 12.0f), 0, af.oa(getContext(), this.moa.cz() ? 8.0f : 4.0f));
        addView(bccVar, layoutParams);
        uef uefVar = new uef(getContext());
        uefVar.setTextSize(this.moa.cz() ? 17 : 12);
        uefVar.setTextColor(-16777216);
        uefVar.setMaxLines(1);
        uefVar.setSingleLine();
        uefVar.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, af.oa(getContext(), 12.0f));
        addView(uefVar, layoutParams2);
        int i5 = this.xs;
        if (i5 == 1) {
            bccVar.setText("😍");
            uefVar.setText(orq.uef(getContext(), "tt_good"));
        } else if (i5 == 2) {
            uefVar.setText(orq.uef(getContext(), "tt_not_bad"));
            bccVar.setText("😐");
        } else {
            if (i5 != 3) {
                return;
            }
            uefVar.setText(orq.uef(getContext(), "tt_bad"));
            bccVar.setText("😡");
        }
    }

    private void uef(int i5) {
        if (i5 == 1) {
            this.lw = uef;
        } else if (i5 == 2) {
            this.lw = f26199oa;
        } else {
            if (i5 != 3) {
                return;
            }
            this.lw = yo;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.moa.uef(zjm.uef);
        } else {
            this.moa.uef(this.lw);
        }
    }

    private void uef() {
        if (this.ivm == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(af.oa(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(af.oa(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(af.oa(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.ivm = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.ivm.addState(new int[0], gradientDrawable);
        }
        setBackground(this.ivm);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // com.bytedance.sdk.openadsdk.yo.zjm.yo
    public void uef(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.lw) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
