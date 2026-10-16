package com.bytedance.sdk.openadsdk.yo;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.af;
import java.util.Locale;

/* loaded from: classes3.dex */
public class wrv extends Dialog {
    private com.bytedance.sdk.openadsdk.core.ivm.moa ivm;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc lw;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc moa;

    /* renamed from: oa, reason: collision with root package name */
    private uef f26202oa;
    private com.bytedance.sdk.openadsdk.core.ivm.lw uef;
    private final zjm xs;
    private com.bytedance.sdk.openadsdk.core.ivm.oa yo;

    public interface uef {
        void oa();

        void uef();

        void uef(int i5, FilterWord filterWord, String str);

        void yo();
    }

    public wrv(Context context, zjm zjmVar) {
        super(context, orq.ivm(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.xs = zjmVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        oa();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVarUef = uef(sy.uef());
        this.uef = lwVarUef;
        setContentView(lwVarUef);
        uef(this.uef);
        yo();
        uef();
        moa();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        uef uefVar = this.f26202oa;
        if (uefVar != null) {
            uefVar.uef();
        }
    }

    private void moa() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.yo.wrv.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (wrv.this.f26202oa != null) {
                    wrv.this.f26202oa.yo();
                }
            }
        });
    }

    private void uef(View view) {
        uef((EditText) this.yo);
        zjm zjmVar = this.xs;
        if (zjmVar != null) {
            String strXs = zjmVar.xs();
            if (!TextUtils.isEmpty(strXs)) {
                this.yo.setText(strXs);
                this.moa.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(strXs.length()), "/200"));
            }
            this.lw.setEnabled(true ^ TextUtils.isEmpty(strXs));
        }
        this.lw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.yo.wrv.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String string = wrv.this.yo.getText().toString();
                if (wrv.this.f26202oa != null) {
                    wrv.this.f26202oa.uef(4, zjm.uef, string);
                }
                wrv.this.dismiss();
            }
        });
        this.ivm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.yo.wrv.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (wrv.this.f26202oa != null) {
                    wrv.this.f26202oa.oa();
                }
                wrv.this.dismiss();
            }
        });
        this.yo.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.yo.wrv.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
                com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar;
                int iRound = Math.round(charSequence.length());
                wrv.this.moa.setText(iRound + "/200");
                boolean z2 = true;
                if (iRound <= 0) {
                    bccVar = wrv.this.lw;
                    if (wrv.this.xs == null || TextUtils.isEmpty(wrv.this.xs.xs())) {
                        z2 = false;
                    }
                } else if (wrv.this.lw.isEnabled()) {
                    return;
                } else {
                    bccVar = wrv.this.lw;
                }
                bccVar.setEnabled(z2);
            }
        });
    }

    private void yo() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
    }

    public void oa() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.ivm.oa oaVar = this.yo;
        if (oaVar == null || (inputMethodManager = (InputMethodManager) oaVar.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.uef.getWindowToken(), 0);
    }

    public static void uef(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.yo.wrv.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i5, int i10, Spanned spanned, int i11, int i12) {
                while (i5 < i10) {
                    int type = Character.getType(charSequence.charAt(i5));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i5++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    public void uef(uef uefVar) {
        this.f26202oa = uefVar;
    }

    public void uef() {
        com.bytedance.sdk.openadsdk.core.ivm.oa oaVar = this.yo;
        if (oaVar == null) {
            return;
        }
        oaVar.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void uef(gzw gzwVar) {
        zjm zjmVar = this.xs;
        if (zjmVar != null) {
            zjmVar.uef(gzwVar);
        }
    }

    private com.bytedance.sdk.openadsdk.core.ivm.lw uef(Context context) {
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        lwVar.setOrientation(1);
        lwVar.setBackground(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.ivm.xs xsVar = new com.bytedance.sdk.openadsdk.core.ivm.xs(context);
        xsVar.setLayoutParams(new LinearLayout.LayoutParams(-1, af.oa(context, 48.0f)));
        this.ivm = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        int iOa = af.oa(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOa, iOa);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int iOa2 = af.oa(context, 10.0f);
        layoutParams.topMargin = iOa2;
        layoutParams.rightMargin = iOa2;
        this.ivm.setLayoutParams(layoutParams);
        this.ivm.setClickable(true);
        this.ivm.setFocusable(true);
        this.ivm.setImageDrawable(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = af.oa(context, 12.0f);
        bccVar.setLayoutParams(layoutParams2);
        bccVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        bccVar.setGravity(17);
        bccVar.setSingleLine(true);
        bccVar.setText(orq.uef(context, "tt_other_reason"));
        bccVar.setTextColor(Color.parseColor("#161823"));
        bccVar.setTextSize(15.0f);
        bccVar.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, af.oa(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        lwVar2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.ivm.oa oaVar = new com.bytedance.sdk.openadsdk.core.ivm.oa(context);
        this.yo = oaVar;
        oaVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = af.oa(context, 16.0f);
        layoutParams3.rightMargin = af.oa(context, 16.0f);
        layoutParams3.topMargin = af.oa(context, 11.5f);
        this.yo.setLayoutParams(layoutParams3);
        this.yo.setLines(4);
        this.yo.setGravity(48);
        this.yo.setTextSize(15.0f);
        this.yo.setTextColor(Color.rgb(22, 24, 35));
        this.yo.setHintTextColor(Color.parseColor("#57161823"));
        this.yo.setBackground(null);
        this.yo.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar3 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int iOa3 = af.oa(context, 16.0f);
        int iOa4 = af.oa(context, 17.0f);
        lwVar3.setPadding(iOa3, iOa4, iOa3, iOa4);
        lwVar3.setLayoutParams(layoutParams4);
        lwVar3.setOrientation(0);
        this.moa = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = 8388611;
        this.moa.setLayoutParams(layoutParams5);
        this.moa.setText("0/200");
        this.moa.setGravity(8388611);
        this.moa.setTextColor(Color.parseColor("#57161823"));
        this.moa.setTextSize(15.0f);
        this.lw = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 8388613;
        this.lw.setLayoutParams(layoutParams6);
        this.lw.setTextSize(14.0f);
        this.lw.setTextColor(-1);
        this.lw.setVisibility(0);
        this.lw.setSingleLine(true);
        int iOa5 = af.oa(context, 27.0f);
        int iOa6 = af.oa(context, 5.0f);
        this.lw.setPadding(iOa5, iOa6, iOa5, iOa6);
        int iOa7 = af.oa(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f10 = iOa7;
        gradientDrawable.setCornerRadius(f10);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f10);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.lw.setBackground(stateListDrawable);
        this.lw.setText(orq.uef(context, "tt_done"));
        this.lw.setEnabled(false);
        lwVar.addView(xsVar);
        lwVar.addView(view);
        lwVar.addView(lwVar2);
        xsVar.addView(this.ivm);
        xsVar.addView(bccVar);
        lwVar2.addView(this.yo);
        lwVar2.addView(lwVar3);
        lwVar3.addView(this.moa);
        lwVar3.addView(this.lw);
        return lwVar;
    }
}
