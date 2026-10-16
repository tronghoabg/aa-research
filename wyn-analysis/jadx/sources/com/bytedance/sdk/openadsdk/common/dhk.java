package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
public class dhk extends Dialog {

    /* renamed from: oa, reason: collision with root package name */
    private static final String[] f25302oa = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private ImageView ivm;
    private Button lw;
    private TextView moa;
    private final Handler uef;
    private String yo;

    public dhk(Context context) {
        super(context, com.bytedance.sdk.component.utils.orq.ivm(context, "tt_privacy_dialog_theme_ad_report"));
        this.uef = new Handler(Looper.getMainLooper());
        this.yo = "";
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(uef(getContext()), new ViewGroup.LayoutParams(af.yo(getContext()), (int) (af.lw(getContext()) * 0.9d)));
        oa();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.uef.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.dhk.3
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.isEmpty(dhk.this.yo)) {
                        dhk.this.moa.setText("");
                    } else {
                        dhk.this.moa.setText(dhk.this.yo.substring(0, Math.min(dhk.this.yo.length(), 100)));
                    }
                }
            }, 1000L);
        } catch (Exception e7) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e7);
        }
    }

    private void oa() {
        final String strIvm = gb.ivm();
        final String strBcc = gb.bcc();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + StringUtils.SPACE + Build.MODEL;
        this.lw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.dhk.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) dhk.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb2 = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, strIvm, strBcc, str, str2, dhk.this.yo};
                    for (int i5 = 0; i5 < dhk.f25302oa.length; i5++) {
                        sb2.append(dhk.f25302oa[i5]);
                        sb2.append(": ");
                        sb2.append(strArr[i5]);
                        sb2.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb2));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.ivm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.dhk.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dhk.this.moa.setText("loading ...");
                dhk.this.cancel();
            }
        });
    }

    public void uef(gzw gzwVar) {
        try {
            this.yo = com.bytedance.sdk.component.utils.uef.uef(gzwVar.anj()).toString();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTPrivacyAdReportDialog", th.getMessage());
        }
    }

    private View uef(Context context) {
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        lwVar.setBackground(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_ad_report_info_bg"));
        lwVar.setOrientation(1);
        lwVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.xs xsVar = new com.bytedance.sdk.openadsdk.core.ivm.xs(context);
        xsVar.setLayoutParams(new ViewGroup.LayoutParams(-1, uef(44.0f)));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(uef(191.0f), uef(24.0f));
        layoutParams2.addRule(13);
        bccVar.setGravity(17);
        bccVar.setText("Ad Report");
        bccVar.setTextColor(Color.parseColor("#161823"));
        bccVar.setTextSize(1, 17.0f);
        bccVar.setLayoutParams(layoutParams2);
        this.ivm = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(uef(40.0f), uef(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = uef(8.0f);
        this.ivm.setPadding(uef(12.0f), uef(14.0f), uef(12.0f), uef(14.0f));
        this.ivm.setImageResource(com.bytedance.sdk.component.utils.orq.moa(context, "tt_ad_xmark"));
        this.ivm.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, uef(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = uef(16.0f);
        layoutParams5.rightMargin = uef(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(uef(16.0f));
        layoutParams5.setMarginEnd(uef(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        lwVar2.setOrientation(1);
        lwVar2.setLayoutParams(layoutParams6);
        String strIvm = gb.ivm();
        String strBcc = gb.bcc();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + StringUtils.SPACE + Build.MODEL;
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVarUef = uef(context, "SDK version", BuildConfig.VERSION_NAME);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVarUef2 = uef(context, "App", strIvm);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVarUef3 = uef(context, "App version", strBcc);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVarUef4 = uef(context, "OS", str);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVarUef5 = uef(context, "Device", str2);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVarUef6 = uef(context, "Creative info", "loading ...");
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar3 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, uef(76.0f));
        lwVar3.setBackgroundColor(-1);
        lwVar3.setLayoutParams(layoutParams7);
        this.lw = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int iUef = uef(16.0f);
        layoutParams8.setMargins(iUef, iUef, iUef, iUef);
        this.lw.setBackground(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_ad_report_info_button_bg"));
        this.lw.setText("copy all");
        this.lw.setTextColor(Color.parseColor("#333333"));
        this.lw.setTextSize(14.0f);
        this.lw.setLayoutParams(layoutParams8);
        lwVar.addView(xsVar);
        xsVar.addView(bccVar);
        xsVar.addView(this.ivm);
        lwVar.addView(view);
        lwVar.addView(scrollView);
        scrollView.addView(lwVar2);
        lwVar2.addView(lwVarUef);
        lwVar2.addView(lwVarUef2);
        lwVar2.addView(lwVarUef3);
        lwVar2.addView(lwVarUef4);
        lwVar2.addView(lwVarUef5);
        lwVar2.addView(lwVarUef6);
        lwVar.addView(lwVar3);
        lwVar3.addView(this.lw);
        return lwVar;
    }

    private com.bytedance.sdk.openadsdk.core.ivm.lw uef(Context context, String str, String str2) {
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : uef(74.0f));
        lwVar.setOrientation(1);
        lwVar.setPadding(0, uef(16.0f), 0, uef(16.0f));
        lwVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = uef(7.0f);
        bccVar.setIncludeFontPadding(false);
        bccVar.setText(str);
        bccVar.setTextColor(Color.parseColor("#333333"));
        bccVar.setTextSize(16.0f);
        bccVar.setTypeface(Typeface.defaultFromStyle(1));
        bccVar.setLayoutParams(layoutParams2);
        lwVar.addView(bccVar);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        if (str.equals("Creative info")) {
            this.moa = bccVar2;
            bccVar2.setMaxLines(2);
            bccVar2.setEllipsize(TextUtils.TruncateAt.END);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        bccVar2.setIncludeFontPadding(false);
        bccVar2.setTextColor(Color.parseColor("#666666"));
        bccVar2.setText(str2);
        bccVar2.setTextSize(14.0f);
        bccVar2.setLayoutParams(layoutParams3);
        lwVar.addView(bccVar2);
        return lwVar;
    }

    private int uef(float f10) {
        return af.oa(getContext(), f10);
    }
}
