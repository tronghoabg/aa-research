package com.bytedance.sdk.openadsdk.core.widget;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.rt;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class oa extends Dialog {

    /* renamed from: ab, reason: collision with root package name */
    private boolean f25765ab;
    private final Context bcc;
    private int bs;
    private int cq;
    private String cz;
    private String dj;
    private OnBackInvokedCallback dz;
    private com.bytedance.sdk.openadsdk.core.ivm.uef ivm;
    private com.bytedance.sdk.openadsdk.core.ivm.uef lw;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.ivm.moa f25766oa;
    private int oib;
    private float sy;
    public InterfaceC0102oa uef;
    private boolean wk;
    private String wrv;
    private View xs;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc yo;
    private String zjm;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.oa$oa, reason: collision with other inner class name */
    public interface InterfaceC0102oa {
        void oa();

        void uef();
    }

    public static class uef implements OnBackInvokedCallback {
        private final WeakReference<oa> uef;

        public uef(oa oaVar) {
            this.uef = new WeakReference<>(oaVar);
        }

        public void onBackInvoked() {
            oa oaVar = this.uef.get();
            if (oaVar != null) {
                com.bytedance.sdk.component.utils.dhk.uef("CustomCommonDialog", "onBackInvoked");
                oaVar.onBackPressed();
            }
        }
    }

    public oa(Context context) {
        super(context, orq.ivm(context, "tt_custom_dialog"));
        this.cq = -1;
        this.wk = false;
        this.f25765ab = false;
        this.bcc = context;
    }

    private void oa() {
        if (TextUtils.isEmpty(this.zjm)) {
            this.yo.setVisibility(8);
        } else {
            this.yo.setText(this.zjm);
            this.yo.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.cz)) {
            this.moa.setText(this.cz);
        }
        if (TextUtils.isEmpty(this.dj)) {
            this.ivm.setText(orq.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), "tt_postive_txt"));
        } else {
            this.ivm.setText(this.dj);
        }
        if (TextUtils.isEmpty(this.wrv)) {
            this.lw.setText(orq.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), "tt_negtive_txt"));
        } else {
            this.lw.setText(this.wrv);
        }
        int i5 = this.cq;
        if (i5 != -1) {
            this.f25766oa.setImageResource(i5);
            this.f25766oa.setVisibility(0);
        } else {
            this.f25766oa.setVisibility(8);
        }
        if (this.wk) {
            this.xs.setVisibility(8);
            this.lw.setVisibility(8);
        } else {
            this.lw.setVisibility(0);
            this.xs.setVisibility(0);
        }
    }

    private void uef() {
        this.ivm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.oa.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0102oa interfaceC0102oa = oa.this.uef;
                if (interfaceC0102oa != null) {
                    interfaceC0102oa.uef();
                }
            }
        });
        this.lw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.oa.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0102oa interfaceC0102oa = oa.this.uef;
                if (interfaceC0102oa != null) {
                    interfaceC0102oa.oa();
                }
            }
        });
    }

    private void yo() {
        if (this.dz == null || !rt.uef()) {
            return;
        }
        com.bytedance.sdk.component.utils.dhk.uef("CustomCommonDialog", "isAtLeastT unregisterOnBackInvokedCallback");
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.dz);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        yo();
    }

    public oa moa(String str) {
        this.wrv = str;
        return this;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.bytedance.sdk.component.utils.dhk.uef("CustomCommonDialog", "onBackPressed");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean zKu = com.bytedance.sdk.openadsdk.core.sy.moa().ku();
        this.f25765ab = zKu;
        if (zKu) {
            this.bs = Color.argb(166, 0, 0, 0);
            this.sy = 16.0f;
            this.oib = Color.parseColor("#000000");
            setContentView(oa(this.bcc));
        } else {
            setContentView(uef(this.bcc));
        }
        if (rt.uef()) {
            com.bytedance.sdk.component.utils.dhk.uef("CustomCommonDialog", "isAtLeastT registerOnBackInvokedCallback");
            this.dz = new uef(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.dz);
        }
        setCanceledOnTouchOutside(false);
        oa();
        uef();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        oa();
    }

    private View uef(Context context) {
        com.bytedance.sdk.openadsdk.core.ivm.xs xsVar = new com.bytedance.sdk.openadsdk.core.ivm.xs(context);
        xsVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        lwVar.setMinimumWidth(uef(260.0f));
        lwVar.setPadding(0, uef(32.0f), 0, 0);
        lwVar.setBackground(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_custom_dialog_bg"));
        lwVar.setOrientation(1);
        lwVar.setLayoutParams(layoutParams);
        this.yo = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = uef(16.0f);
        layoutParams2.rightMargin = uef(16.0f);
        layoutParams2.bottomMargin = uef(16.0f);
        this.yo.setGravity(17);
        this.yo.setVisibility(0);
        this.yo.setTextColor(Color.parseColor("#333333"));
        this.yo.setTextSize(18.0f);
        this.yo.setLayoutParams(layoutParams2);
        this.f25766oa = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = uef(16.0f);
        layoutParams3.rightMargin = uef(16.0f);
        layoutParams3.bottomMargin = uef(10.0f);
        this.f25766oa.setMaxHeight(uef(150.0f));
        this.f25766oa.setMaxWidth(uef(150.0f));
        this.f25766oa.setVisibility(0);
        this.f25766oa.setLayoutParams(layoutParams3);
        this.moa = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = uef(20.0f);
        layoutParams4.rightMargin = uef(20.0f);
        this.moa.setGravity(17);
        this.moa.setLineSpacing(uef(3.0f), 1.2f);
        this.moa.setTextSize(18.0f);
        this.moa.setTextColor(Color.parseColor("#000000"));
        this.moa.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = uef(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        lwVar2.setOrientation(0);
        lwVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.ivm.uef uefVar = new com.bytedance.sdk.openadsdk.core.ivm.uef(context);
        this.lw = uefVar;
        uefVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = uef(10.0f);
        layoutParams7.weight = 1.0f;
        this.lw.setPadding(0, uef(16.0f), 0, uef(16.0f));
        this.lw.setBackground(null);
        this.lw.setGravity(17);
        this.lw.setSingleLine(true);
        this.lw.setTextColor(Color.parseColor("#999999"));
        this.lw.setTextSize(16.0f);
        this.lw.setLayoutParams(layoutParams7);
        this.xs = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.xs.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.xs.setLayoutParams(layoutParams8);
        com.bytedance.sdk.openadsdk.core.ivm.uef uefVar2 = new com.bytedance.sdk.openadsdk.core.ivm.uef(context);
        this.ivm = uefVar2;
        uefVar2.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = uef(10.0f);
        layoutParams9.weight = 1.0f;
        this.ivm.setPadding(0, uef(16.0f), 0, uef(16.0f));
        this.ivm.setBackground(null);
        this.ivm.setGravity(17);
        this.ivm.setSingleLine(true);
        this.ivm.setTextColor(Color.parseColor("#38ADFF"));
        this.ivm.setTextSize(16.0f);
        this.ivm.setLayoutParams(layoutParams9);
        xsVar.addView(lwVar);
        lwVar.addView(this.yo);
        lwVar.addView(this.f25766oa);
        lwVar.addView(this.moa);
        lwVar.addView(view);
        lwVar.addView(lwVar2);
        lwVar2.addView(this.lw);
        lwVar2.addView(this.xs);
        lwVar2.addView(this.ivm);
        return xsVar;
    }

    public oa yo(String str) {
        this.dj = str;
        return this;
    }

    private View oa(Context context) {
        com.bytedance.sdk.openadsdk.core.ivm.xs xsVar = new com.bytedance.sdk.openadsdk.core.ivm.xs(context);
        xsVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        lwVar.setMinimumWidth(uef(280.0f));
        lwVar.setPadding(0, uef(32.0f), 0, 0);
        lwVar.setBackground(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_custom_dialog_bg_new"));
        lwVar.setOrientation(1);
        lwVar.setLayoutParams(layoutParams);
        this.yo = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = uef(16.0f);
        layoutParams2.rightMargin = uef(16.0f);
        layoutParams2.bottomMargin = uef(16.0f);
        this.yo.setGravity(17);
        this.yo.setVisibility(0);
        this.yo.setTextColor(Color.parseColor("#333333"));
        this.yo.setTextSize(20.0f);
        this.yo.setTypeface(Typeface.defaultFromStyle(1));
        this.yo.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.3f);
        this.yo.setLetterSpacing(0.015f);
        this.yo.setLayoutParams(layoutParams2);
        this.f25766oa = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = uef(16.0f);
        layoutParams3.rightMargin = uef(16.0f);
        layoutParams3.bottomMargin = uef(10.0f);
        this.f25766oa.setMaxHeight(uef(150.0f));
        this.f25766oa.setMaxWidth(uef(150.0f));
        this.f25766oa.setVisibility(0);
        this.f25766oa.setLayoutParams(layoutParams3);
        this.moa = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = uef(20.0f);
        layoutParams4.rightMargin = uef(20.0f);
        this.moa.setGravity(17);
        this.moa.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.3f);
        this.moa.setLetterSpacing(0.004f);
        this.moa.setTextSize(15.0f);
        this.moa.setTextColor(this.bs);
        this.moa.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = uef(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        lwVar2.setOrientation(0);
        lwVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.ivm.uef uefVar = new com.bytedance.sdk.openadsdk.core.ivm.uef(context);
        this.lw = uefVar;
        uefVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = uef(10.0f);
        layoutParams7.weight = 1.0f;
        this.lw.setPadding(0, uef(16.0f), 0, uef(16.0f));
        this.lw.setBackground(null);
        this.lw.setGravity(17);
        this.lw.setSingleLine(true);
        this.lw.setTextSize(2, this.sy);
        this.lw.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.3f);
        this.lw.setLetterSpacing(0.0019f);
        this.lw.setTypeface(Typeface.defaultFromStyle(0));
        this.lw.setTextColor(ColorStateList.valueOf(this.bs));
        this.lw.setLayoutParams(layoutParams7);
        this.xs = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.xs.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.xs.setLayoutParams(layoutParams8);
        com.bytedance.sdk.openadsdk.core.ivm.uef uefVar2 = new com.bytedance.sdk.openadsdk.core.ivm.uef(context);
        this.ivm = uefVar2;
        uefVar2.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = uef(10.0f);
        layoutParams9.weight = 1.0f;
        this.ivm.setPadding(0, uef(16.0f), 0, uef(16.0f));
        this.ivm.setBackground(null);
        this.ivm.setGravity(17);
        this.ivm.setSingleLine(true);
        int i5 = Build.VERSION.SDK_INT;
        this.ivm.setTextAppearance(R.style.TextAppearance.Material.Medium);
        Typeface typefaceCreate = i5 >= 28 ? Typeface.create(this.ivm.getTypeface(), 500, false) : null;
        if (typefaceCreate != null) {
            this.ivm.setTypeface(typefaceCreate);
        }
        this.ivm.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.3f);
        this.ivm.setLetterSpacing(0.0019f);
        this.ivm.setTextColor(ColorStateList.valueOf(this.oib));
        this.ivm.setTextSize(this.sy);
        this.ivm.setLayoutParams(layoutParams9);
        xsVar.addView(lwVar);
        lwVar.addView(this.yo);
        lwVar.addView(this.f25766oa);
        lwVar.addView(this.moa);
        lwVar.addView(view);
        lwVar.addView(lwVar2);
        lwVar2.addView(this.lw);
        lwVar2.addView(this.xs);
        lwVar2.addView(this.ivm);
        return xsVar;
    }

    private int uef(float f10) {
        return af.oa(getContext(), f10);
    }

    public oa uef(InterfaceC0102oa interfaceC0102oa) {
        this.uef = interfaceC0102oa;
        return this;
    }

    public oa uef(String str) {
        this.cz = str;
        return this;
    }

    public oa oa(String str) {
        this.zjm = str;
        return this;
    }
}
