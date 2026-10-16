package com.bytedance.sdk.openadsdk.yo;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.yo.zjm;
import java.util.List;

/* loaded from: classes3.dex */
public class cz extends com.bytedance.sdk.openadsdk.core.ivm.yo implements zjm.moa, zjm.oa, zjm.uef, zjm.yo {
    private View bcc;
    private int cq;
    private View cz;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc dj;
    private FilterWord dz;
    private TextView ivm;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc lw;
    private final zjm moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f26197oa;
    ivm uef;
    private int wrv;
    private dj xs;
    private int yo;
    private com.bytedance.sdk.openadsdk.core.ivm.moa zjm;

    public cz(Context context, zjm zjmVar) {
        this(context, zjmVar, null);
    }

    private boolean moa() {
        if (this.wrv == 0) {
            yo();
        }
        return this.wrv < this.cq;
    }

    private com.bytedance.sdk.openadsdk.core.ivm.bcc oa(Context context) {
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = moa() ? this.f26197oa : af.oa(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.yo);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.yo);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i5 = this.yo;
        bccVar.setPadding(0, i5, 0, i5);
        bccVar.setGravity(17);
        bccVar.setBackground(stateListDrawable);
        bccVar.setTextColor(-1);
        bccVar.setTextSize(16.0f);
        bccVar.setText(orq.uef(context, "tt_suggestion_commit"));
        bccVar.setEnabled(false);
        bccVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.yo.cz.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                cz.this.moa.moa();
            }
        });
        bccVar.setLayoutParams(layoutParams);
        return bccVar;
    }

    private void yo() {
        if (this.wrv > 0) {
            return;
        }
        this.wrv = af.yo(getContext());
        int iLw = af.lw(getContext());
        this.cq = iLw;
        this.moa.uef(this.wrv, iLw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ivm.yo, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.wrv == 0) {
                yo();
            }
            layoutParams.width = Math.min(this.wrv, this.cq) - (af.oa(getContext(), 16.0f) * 2);
        }
    }

    public cz(Context context, zjm zjmVar, List<FilterWord> list) {
        super(context);
        this.moa = zjmVar;
        zjmVar.uef((zjm.yo) this);
        zjmVar.uef((zjm.oa) this);
        zjmVar.uef((zjm.moa) this);
        zjmVar.uef((zjm.uef) this);
        yo();
        uef(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        oa(list);
    }

    private void uef(Context context) {
        this.yo = af.oa(context, 8.0f);
        this.f26197oa = af.oa(context, 20.0f);
        int iOa = af.oa(context, 56.0f);
        int iOa2 = af.oa(context, 30.0f);
        int iOa3 = af.oa(context, 12.0f);
        if (moa()) {
            iOa3 = this.f26197oa;
        }
        if (!moa()) {
            iOa = iOa2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, af.oa(getContext(), 98.0f));
        view.setBackground(orq.yo(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.yo);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        int iOa4 = af.oa(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iOa4, iOa4);
        layoutParams3.setMargins(0, iOa3, iOa3, 0);
        layoutParams3.gravity = 8388661;
        moaVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_titlebar_close_seletor"));
        addView(moaVar, layoutParams3);
        moaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.yo.cz.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                cz.this.moa.lw();
            }
        });
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar2 = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        this.zjm = moaVar2;
        moaVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.yo.cz.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                cz.this.oa();
            }
        });
        this.zjm.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iOa4, iOa4);
        layoutParams4.setMargins(iOa3, iOa3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable drawableUef = com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_leftbackicon_selector");
        drawableUef.setAutoMirrored(true);
        this.zjm.setImageDrawable(drawableUef);
        addView(this.zjm, layoutParams4);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iOa3, iOa, iOa3, iOa3);
        lwVar.setOrientation(1);
        addView(lwVar, layoutParams5);
        View viewYo = yo(context);
        this.bcc = viewYo;
        lwVar.addView(viewYo);
        View viewMoa = moa(context);
        this.cz = viewMoa;
        lwVar.addView(viewMoa);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVarOa = oa(context);
        this.lw = bccVarOa;
        lwVar.addView(bccVarOa);
    }

    private View moa(Context context) {
        int iOa;
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar.setOrientation(1);
        if (!moa()) {
            iOa = af.oa(context, 200.0f);
        } else {
            iOa = af.oa(context, 358.0f);
        }
        lwVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iOa));
        TextView textView = new TextView(context);
        textView.setText(orq.uef(context, "tt_select_reason"));
        textView.setTextSize(moa() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = af.oa(context, moa() ? 24.0f : 4.0f);
        lwVar.addView(textView, layoutParams);
        ivm ivmVar = new ivm(context, this.moa);
        this.uef = ivmVar;
        lwVar.addView(ivmVar);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.dj = bccVar;
        bccVar.setId(bs.jr);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = moa() ? this.f26197oa : af.oa(context, 6.0f);
        layoutParams2.gravity = 17;
        this.dj.setLayoutParams(layoutParams2);
        this.dj.setFocusable(false);
        this.dj.setHint(orq.uef(context, "tt_add_bad_reason"));
        this.dj.setHintTextColor(Color.parseColor("#57000000"));
        this.dj.setTextColor(Color.rgb(22, 24, 35));
        this.dj.setTextSize(15.0f);
        this.dj.setGravity(8388615);
        this.dj.setVisibility(0);
        this.dj.setPadding(0, af.oa(context, 15.0f), 0, af.oa(context, 14.0f));
        this.dj.setEllipsize(TextUtils.TruncateAt.END);
        this.dj.setSingleLine();
        this.dj.setMaxLines(1);
        this.dj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.yo.cz.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                cz.this.moa.ivm();
            }
        });
        lwVar.addView(this.dj, layoutParams2);
        lwVar.addView(new dj(context, Color.argb(128, 0, 0, 0)));
        lwVar.setVisibility(8);
        return lwVar;
    }

    private View yo(Context context) {
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        lwVar.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(orq.uef(context, "tt_like_this_ad"));
        textView.setTextSize(moa() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        lwVar.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(orq.uef(context, "tt_feel_hint"));
        textView2.setTextSize(moa() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (moa()) {
            layoutParams2.topMargin = af.oa(context, 4.0f);
        }
        lwVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iOa = af.oa(context, 16.0f);
        int iOa2 = af.oa(context, 12.0f);
        int iOa3 = af.oa(context, 8.0f);
        if (moa()) {
            layoutParams3.topMargin = iOa;
            layoutParams3.bottomMargin = iOa;
        } else {
            layoutParams3.topMargin = iOa2;
            layoutParams3.bottomMargin = iOa3;
        }
        lwVar.addView(lwVar2, layoutParams3);
        lwVar2.addView(new lw(context, 1, this.moa));
        lw lwVar3 = new lw(context, 2, this.moa);
        ViewGroup.LayoutParams layoutParams4 = lwVar3.getLayoutParams();
        boolean z2 = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z2) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = iOa;
        layoutParams7.rightMargin = iOa;
        lwVar2.addView(lwVar3, layoutParams5);
        lwVar2.addView(new lw(context, 3, this.moa));
        dj djVar = new dj(context);
        this.xs = djVar;
        lwVar.addView(djVar);
        this.ivm = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!moa()) {
            iOa = iOa3;
        }
        layoutParams8.topMargin = iOa;
        this.ivm.setTextColor(-16777216);
        this.ivm.setPadding(iOa2, iOa3, iOa2, iOa3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iOa3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.ivm.setBackground(gradientDrawable);
        this.ivm.setText(orq.uef(context, "tt_report_this_ad"));
        this.ivm.setTextSize(moa() ? 14 : 12);
        Drawable drawableYo = orq.yo(context, "tt_report_ad_arrow");
        drawableYo.setBounds(0, 0, iOa2, iOa2);
        this.ivm.setCompoundDrawables(null, null, drawableYo, null);
        this.ivm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.yo.cz.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                cz.this.uef();
            }
        });
        lwVar.addView(this.ivm, layoutParams8);
        return lwVar;
    }

    private void oa(List<FilterWord> list) {
        this.uef.uef(list);
    }

    public void oa() {
        View view = this.cz;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.bcc;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = this.zjm;
        if (moaVar != null) {
            moaVar.setVisibility(8);
        }
        zjm zjmVar = this.moa;
        if (zjmVar != null) {
            FilterWord filterWord = this.dz;
            if (filterWord != null) {
                zjmVar.uef(filterWord);
            } else {
                zjmVar.uef(zjm.uef);
            }
            this.moa.yo(null);
        }
    }

    public void uef() {
        View view = this.cz;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.bcc;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = this.zjm;
        if (moaVar != null) {
            moaVar.setVisibility(0);
        }
        zjm zjmVar = this.moa;
        if (zjmVar == null || !zjmVar.yo()) {
            return;
        }
        this.dz = this.moa.oa();
    }

    @Override // com.bytedance.sdk.openadsdk.yo.zjm.yo
    public void uef(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.lw != null && TextUtils.isEmpty(this.moa.xs())) {
            this.lw.setEnabled(!zjm.uef.equals(filterWord));
        }
        if (lw.uef.equals(filterWord) || lw.f26199oa.equals(filterWord)) {
            this.ivm.setVisibility(8);
            this.xs.setVisibility(8);
        }
        if (lw.yo.equals(filterWord) || zjm.uef.equals(filterWord)) {
            this.ivm.setVisibility(0);
            this.xs.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yo.zjm.oa
    public void uef(int i5) {
        if (zjm.yo == i5) {
            this.dz = null;
            oa();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yo.zjm.moa
    public void uef(String str) {
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar;
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = this.dj;
        if (bccVar2 != null) {
            bccVar2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            zjm zjmVar = this.moa;
            if (zjmVar == null || (bccVar = this.lw) == null) {
                return;
            }
            bccVar.setEnabled(zjmVar.yo());
            return;
        }
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar3 = this.lw;
        if (bccVar3 != null) {
            bccVar3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yo.zjm.uef
    public void uef(List<FilterWord> list) {
        oa(list);
    }
}
