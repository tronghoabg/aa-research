package com.bytedance.sdk.openadsdk.activity.single;

import Lb.h;
import Va.M6;
import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cb.AbstractC1593a;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.component.utils.pz;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.cq;
import com.bytedance.sdk.openadsdk.common.dhk;
import com.bytedance.sdk.openadsdk.common.tpx;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.uef.ivm;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.dj;
import j$.util.Objects;
import java.net.URLEncoder;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class TTWebsiteActivity extends TTBaseActivity {

    /* renamed from: ab, reason: collision with root package name */
    private ImageView f25214ab;
    private String bcc;
    private ImageView bs;
    private ILoader cq;
    private int dj;
    private float dz;
    private HashMap<String, String> ivm;
    private com.bytedance.sdk.component.cz.ivm moa;
    public cq uef;
    private ImageView wk;
    private int wrv;
    private ivm.uef xs;
    private dhk yo;

    /* renamed from: oa, reason: collision with root package name */
    private String f25215oa = null;
    private boolean lw = false;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sy.oa(getApplicationContext());
        if (!wk.lw()) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.dz.oa.uef(this);
        gzw gzwVarUef = cp.uef().uef(cp.uef(getIntent()));
        if (gzwVarUef == null) {
            finish();
            return;
        }
        String strPz = gzwVarUef.pz();
        String strYo = gzwVarUef.ys().yo();
        String strMoa = gzwVarUef.ys().moa();
        if (TextUtils.isEmpty(strYo)) {
            finish();
            return;
        }
        boolean zKu = sy.moa().ku();
        this.lw = zKu;
        if (zKu) {
            oa(gzwVarUef, strPz, strYo, strMoa);
        } else {
            uef(gzwVarUef, strPz, strYo, strMoa);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.cz.ivm ivmVar = this.moa;
        if (ivmVar != null) {
            pz.uef(ivmVar);
        }
        super.onDestroy();
    }

    private void oa(final gzw gzwVar, String str, String str2, String str3) {
        com.bytedance.sdk.component.cz.ivm ivmVar;
        if (gzwVar != null) {
            this.bcc = gzwVar.vup();
        }
        if (!TextUtils.isEmpty(this.bcc)) {
            this.cq = com.bytedance.sdk.openadsdk.xs.oa.uef().oa();
            int iUef = com.bytedance.sdk.openadsdk.xs.oa.uef().uef(this.cq, this.bcc);
            this.dj = iUef;
            this.wrv = iUef > 0 ? 2 : 0;
        }
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(this);
        if (Build.VERSION.SDK_INT >= 35) {
            lwVar.setFitsSystemWindows(true);
        }
        lwVar.setBackgroundColor(-1);
        lwVar.setId(520093726);
        lwVar.setOrientation(1);
        lwVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(lwVar);
            cq cqVar = new cq(this, gzwVar, "tag", true);
            this.uef = cqVar;
            View viewMoa = cqVar.moa();
            this.uef.uef();
            viewMoa.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            viewMoa.setVisibility(0);
            lwVar.addView(viewMoa);
            final TextView textView = (TextView) viewMoa.findViewById(bs.uef);
            viewMoa.findViewById(bs.f26137oa);
            final com.bytedance.sdk.openadsdk.core.ivm.ivm ivmVar2 = (com.bytedance.sdk.openadsdk.core.ivm.ivm) findViewById(520093743);
            if (ivmVar2 != null) {
                ivmVar2.setProgress(0);
                ivmVar2.setMax(100);
            }
            ImageView imageView = (ImageView) findViewById(bs.hdd);
            this.wk = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.10
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (TTWebsiteActivity.this.moa != null) {
                            if (TTWebsiteActivity.this.xs != null) {
                                TTWebsiteActivity.this.xs.uef();
                            }
                            if (TTWebsiteActivity.this.moa.cz()) {
                                TTWebsiteActivity.this.moa.zjm();
                            } else {
                                TTWebsiteActivity.this.finish();
                            }
                        }
                    }
                });
            }
            ImageView imageView2 = (ImageView) findViewById(bs.f26138tc);
            this.f25214ab = imageView2;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new h(this, 2));
            }
            ImageView imageView3 = (ImageView) viewMoa.findViewById(520093740);
            this.bs = imageView3;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f25222a.uef(ivmVar2, gzwVar, view);
                    }
                });
            }
            try {
                com.bytedance.sdk.component.cz.ivm ivmVarYo = this.uef.yo();
                this.moa = ivmVarYo;
                WebView webView = ivmVarYo.getWebView();
                if (webView != null) {
                    this.xs = new com.bytedance.sdk.openadsdk.core.widget.uef.ivm(webView, gzwVar, this, false).yo();
                }
                this.uef.uef(true);
                if (this.moa.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.moa.getParent()).removeView(this.moa);
                }
                lwVar.addView(this.moa, new ViewGroup.LayoutParams(-1, -1));
                this.f25215oa = str2;
                if (!TextUtils.isEmpty(str)) {
                    String strEncode = URLEncoder.encode(str);
                    if (this.f25215oa.contains("?")) {
                        this.f25215oa = M6.t(new StringBuilder(), this.f25215oa, "&gdid_encrypted=", strEncode);
                    } else {
                        this.f25215oa = M6.t(new StringBuilder(), this.f25215oa, "?gdid_encrypted=", strEncode);
                    }
                }
                if (this.f25215oa == null || (ivmVar = this.moa) == null) {
                    finish();
                    return;
                }
                WebView webView2 = ivmVar.getWebView();
                if (webView2 != null) {
                    WebSettings settings = webView2.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                }
                HashMap<String, String> mapL = AbstractC1593a.l("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
                this.ivm = mapL;
                try {
                    this.moa.uef(this.f25215oa, mapL);
                } catch (Throwable unused2) {
                    this.moa.a_(this.f25215oa);
                }
                this.moa.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.12
                    @Override // android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView3, int i5) {
                        super.onProgressChanged(webView3, i5);
                        if (ivmVar2 == null || TTWebsiteActivity.this.isFinishing()) {
                            return;
                        }
                        if (i5 == 100) {
                            ivmVar2.setVisibility(8);
                            webView3.canGoBack();
                        } else {
                            ivmVar2.setVisibility(0);
                            ivmVar2.setProgress(i5);
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView3, String str4) {
                        TextView textView2;
                        if (TextUtils.isEmpty(str4) || (textView2 = textView) == null) {
                            return;
                        }
                        textView2.setText(str4);
                        TTWebsiteActivity.this.uef.oa(webView3.getUrl());
                    }
                });
                this.moa.setWebViewClient(new ivm.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.2
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView3, String str4) {
                        TTWebsiteActivity tTWebsiteActivity;
                        cq cqVar2;
                        super.onPageFinished(webView3, str4);
                        if (!TTWebsiteActivity.this.lw || (cqVar2 = (tTWebsiteActivity = TTWebsiteActivity.this).uef) == null) {
                            return;
                        }
                        cqVar2.uef(webView3, tTWebsiteActivity.xs);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView3, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView3, webResourceRequest, webResourceError);
                        webResourceError.getErrorCode();
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedHttpError(WebView webView3, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView3, webResourceRequest, webResourceResponse);
                        Objects.toString(webResourceResponse);
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView3, String str4) {
                        try {
                            Uri uri = Uri.parse(str4);
                            if (!com.bytedance.sdk.component.utils.sy.uef(str4)) {
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(uri);
                                    intent.addFlags(268435456);
                                    com.bytedance.sdk.component.utils.oa.uef(TTWebsiteActivity.this, intent, null);
                                    return true;
                                } catch (Throwable unused3) {
                                    return true;
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        return super.shouldOverrideUrlLoading(webView3, str4);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView3, int i5, String str4, String str5) {
                        super.onReceivedError(webView3, i5, str4, str5);
                    }
                });
                if (this.moa != null && webView2 != null) {
                    webView2.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.3

                        /* renamed from: oa, reason: collision with root package name */
                        private final int f25218oa = sy.oa();

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            try {
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    TTWebsiteActivity.this.dz = motionEvent.getRawY();
                                    return false;
                                }
                                if (actionMasked != 2) {
                                    return false;
                                }
                                float rawY = motionEvent.getRawY();
                                if (!TTWebsiteActivity.this.lw) {
                                    return false;
                                }
                                if (rawY - TTWebsiteActivity.this.dz > this.f25218oa) {
                                    TTWebsiteActivity.this.uef.uef();
                                }
                                if (rawY - TTWebsiteActivity.this.dz >= (-this.f25218oa)) {
                                    return false;
                                }
                                TTWebsiteActivity.this.uef.oa();
                                return false;
                            } catch (Throwable th) {
                                Log.e("TTAD.TTWebsiteActivity", "TouchRecordTool onTouch error", th);
                                return false;
                            }
                        }
                    });
                }
                com.bytedance.sdk.openadsdk.core.widget.uef.yo.oa(webView2);
            } catch (Exception e7) {
                com.bytedance.sdk.component.utils.dhk.uef("TTAD.TTWebsiteActivity", "onCreate: ", e7);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    public static void uef(Context context, gzw gzwVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, str, "open_policy");
        if (TextUtils.isEmpty(gzwVar.ys().yo())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        intent.putExtra("meta_index", cp.uef().uef(gzwVar));
        com.bytedance.sdk.component.utils.oa.uef(context, intent, null);
    }

    private void uef(final gzw gzwVar, String str, String str2, String str3) {
        com.bytedance.sdk.component.cz.ivm ivmVar;
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(this);
        if (Build.VERSION.SDK_INT >= 35) {
            lwVar.setFitsSystemWindows(true);
        }
        lwVar.setBackgroundColor(-1);
        lwVar.setId(520093726);
        lwVar.setOrientation(1);
        lwVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(lwVar);
            int iOa = af.oa(this, 5.0f);
            int iOa2 = af.oa(this, 8.0f);
            int iOa3 = af.oa(this, 10.0f);
            int iOa4 = af.oa(this, 12.0f);
            int iOa5 = af.oa(this, 14.0f);
            int iOa6 = af.oa(this, 20.0f);
            int iOa7 = af.oa(this, 24.0f);
            int iOa8 = af.oa(this, 40.0f);
            int iOa9 = af.oa(this, 44.0f);
            int iOa10 = af.oa(this, 191.0f);
            com.bytedance.sdk.openadsdk.core.ivm.xs xsVar = new com.bytedance.sdk.openadsdk.core.ivm.xs(this);
            xsVar.setGravity(15);
            xsVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iOa9));
            com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(this);
            moaVar.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOa8, iOa9);
            layoutParams.setMarginStart(iOa2);
            moaVar.setLayoutParams(layoutParams);
            moaVar.setClickable(true);
            moaVar.setFocusable(true);
            moaVar.setPadding(iOa5, iOa4, iOa5, iOa4);
            moaVar.setImageDrawable(orq.yo(this, "tt_ad_arrow_backward"));
            final com.bytedance.sdk.openadsdk.core.ivm.moa moaVar2 = new com.bytedance.sdk.openadsdk.core.ivm.moa(this);
            moaVar2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iOa8, iOa9);
            layoutParams2.addRule(17, 520093720);
            moaVar2.setLayoutParams(layoutParams2);
            moaVar2.setClickable(true);
            moaVar2.setFocusable(true);
            moaVar2.setPadding(iOa4, iOa5, iOa4, iOa5);
            moaVar2.setImageDrawable(orq.yo(this, "tt_ad_xmark"));
            com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(this);
            bccVar.setId(bs.uu);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOa10, iOa7);
            layoutParams3.setMarginStart(iOa);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            bccVar.setLayoutParams(layoutParams3);
            bccVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            bccVar.setGravity(17);
            bccVar.setSingleLine(true);
            bccVar.setTextColor(Color.parseColor("#222222"));
            bccVar.setTextSize(17.0f);
            com.bytedance.sdk.openadsdk.core.ivm.moa moaVar3 = new com.bytedance.sdk.openadsdk.core.ivm.moa(this);
            moaVar3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iOa8, iOa9);
            layoutParams4.addRule(16, 520093742);
            moaVar3.setLayoutParams(layoutParams4);
            moaVar3.setPadding(iOa3, iOa4, iOa3, iOa4);
            moaVar3.setImageDrawable(orq.yo(this, "tt_ad_link"));
            com.bytedance.sdk.openadsdk.core.ivm.moa moaVar4 = new com.bytedance.sdk.openadsdk.core.ivm.moa(this);
            moaVar4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iOa8, iOa9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(iOa2);
            moaVar4.setLayoutParams(layoutParams5);
            moaVar4.setPadding(iOa4, iOa6, iOa4, iOa6);
            moaVar4.setImageDrawable(orq.yo(this, "tt_ad_threedots"));
            final com.bytedance.sdk.openadsdk.core.ivm.ivm ivmVar2 = new com.bytedance.sdk.openadsdk.core.ivm.ivm(this, null, R.style.Widget.ProgressBar.Horizontal);
            ivmVar2.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, af.oa(this, 2.0f));
            layoutParams6.addRule(12);
            ivmVar2.setLayoutParams(layoutParams6);
            ivmVar2.setProgress(1);
            ivmVar2.setProgressDrawable(dj.uef(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, af.oa(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            xsVar.addView(moaVar);
            xsVar.addView(moaVar2);
            xsVar.addView(bccVar);
            xsVar.addView(moaVar3);
            xsVar.addView(moaVar4);
            xsVar.addView(ivmVar2);
            xsVar.addView(view);
            lwVar.addView(xsVar);
            try {
                com.bytedance.sdk.component.cz.ivm ivmVar3 = new com.bytedance.sdk.component.cz.ivm(this, ivm.yo.PRIVACY);
                this.moa = ivmVar3;
                ivmVar3.setBackgroundColor(-1);
                lwVar.addView(this.moa, new ViewGroup.LayoutParams(-1, -1));
                moaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.moa.cz()) {
                            TTWebsiteActivity.this.moa.zjm();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                moaVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                moaVar2.setVisibility(4);
                moaVar2.setClickable(false);
                if (!TextUtils.isEmpty(str3)) {
                    bccVar.setText(str3);
                }
                moaVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.moa.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.oa.uef(TTWebsiteActivity.this, intent, null);
                    }
                });
                moaVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.yo == null) {
                            TTWebsiteActivity.this.yo = new dhk(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.yo.uef(gzwVar);
                            TTWebsiteActivity.this.yo.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.yo.show();
                    }
                });
                this.f25215oa = str2;
                if (!TextUtils.isEmpty(str)) {
                    String strEncode = URLEncoder.encode(str);
                    if (this.f25215oa.contains("?")) {
                        this.f25215oa = M6.t(new StringBuilder(), this.f25215oa, "&gdid_encrypted=", strEncode);
                    } else {
                        this.f25215oa = M6.t(new StringBuilder(), this.f25215oa, "?gdid_encrypted=", strEncode);
                    }
                }
                if (this.f25215oa != null && (ivmVar = this.moa) != null) {
                    WebView webView = ivmVar.getWebView();
                    if (webView != null) {
                        WebSettings settings = webView.getSettings();
                        settings.setMixedContentMode(0);
                        try {
                            settings.setJavaScriptEnabled(true);
                            settings.setDomStorageEnabled(true);
                            settings.setSavePassword(false);
                            settings.setAllowFileAccess(false);
                        } catch (Throwable unused) {
                        }
                    }
                    try {
                        this.moa.uef(this.f25215oa, AbstractC1593a.l("Referer", TTAdConstant.REQUEST_HEAD_REFERER));
                    } catch (Throwable unused2) {
                        this.moa.a_(this.f25215oa);
                    }
                    this.moa.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.8
                        @Override // android.webkit.WebChromeClient
                        public void onProgressChanged(WebView webView2, int i5) {
                            super.onProgressChanged(webView2, i5);
                            if (ivmVar2 == null || TTWebsiteActivity.this.isFinishing()) {
                                return;
                            }
                            if (i5 != 100) {
                                ivmVar2.setVisibility(0);
                                ivmVar2.setProgress(i5);
                                return;
                            }
                            ivmVar2.setVisibility(8);
                            if (webView2.canGoBack()) {
                                moaVar2.setVisibility(0);
                                moaVar2.setClickable(true);
                            } else {
                                moaVar2.setVisibility(4);
                                moaVar2.setClickable(false);
                            }
                        }
                    });
                    this.moa.setWebViewClient(new ivm.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.9
                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView2, String str4) {
                            super.onPageFinished(webView2, str4);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            super.onReceivedError(webView2, webResourceRequest, webResourceError);
                            webResourceError.getErrorCode();
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                            Objects.toString(webResourceResponse);
                        }

                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView2, String str4) {
                            try {
                                Uri uri = Uri.parse(str4);
                                if (!com.bytedance.sdk.component.utils.sy.uef(str4)) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.setData(uri);
                                        intent.addFlags(268435456);
                                        com.bytedance.sdk.component.utils.oa.uef(TTWebsiteActivity.this, intent, null);
                                        return true;
                                    } catch (Throwable unused3) {
                                        return true;
                                    }
                                }
                            } catch (Throwable unused4) {
                            }
                            return super.shouldOverrideUrlLoading(webView2, str4);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, int i5, String str4, String str5) {
                            super.onReceivedError(webView2, i5, str4, str5);
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.widget.uef.yo.oa(this.moa.getWebView());
                    return;
                }
                finish();
            } catch (Exception e7) {
                com.bytedance.sdk.component.utils.dhk.uef("TTAD.TTWebsiteActivity", "onCreate: ", e7);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void uef(View view) {
        com.bytedance.sdk.component.cz.ivm ivmVar = this.moa;
        if (ivmVar == null || !ivmVar.dj()) {
            return;
        }
        this.moa.wrv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void uef(final com.bytedance.sdk.openadsdk.core.ivm.ivm ivmVar, final gzw gzwVar, View view) {
        final tpx tpxVar = new tpx(this, true);
        tpxVar.setOnMenuItemClickListener(new tpx.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.11
            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
            public void ivm() {
                TTWebsiteActivity.this.uef("onSelectPrivacy");
                tpxVar.uef();
            }

            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
            public void lw() {
                if (TTWebsiteActivity.this.yo == null) {
                    TTWebsiteActivity.this.yo = new dhk(TTWebsiteActivity.this);
                    TTWebsiteActivity.this.yo.uef(gzwVar);
                    TTWebsiteActivity.this.yo.setCanceledOnTouchOutside(false);
                }
                TTWebsiteActivity.this.yo.show();
                TTWebsiteActivity.this.uef("onSelectReport");
                tpxVar.uef();
            }

            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
            public void moa() {
                if (TTWebsiteActivity.this.moa != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = TTWebsiteActivity.this.moa.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.oa.uef(TTWebsiteActivity.this, intent, null);
                    }
                    TTWebsiteActivity.this.uef("onSelectOpenInBrowser");
                    tpxVar.uef();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
            public void oa() {
                com.bytedance.sdk.component.cz.ivm ivmVar2 = TTWebsiteActivity.this.moa;
                if (ivmVar2 != null && ivmVar2.getUrl() != null && TTWebsiteActivity.this.ivm != null) {
                    com.bytedance.sdk.openadsdk.core.ivm.ivm ivmVar3 = ivmVar;
                    if (ivmVar3 != null) {
                        ivmVar3.setVisibility(0);
                        ivmVar.setProgress(0);
                    }
                    ivmVar2.xs();
                    String url = ivmVar2.getUrl();
                    if (url != null) {
                        ivmVar2.a_(url);
                    }
                    tpxVar.uef();
                }
                TTWebsiteActivity.this.uef("onSelectRetry");
            }

            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
            public void uef() {
                tpxVar.uef();
            }

            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
            public void yo() {
                ClipboardManager clipboardManager;
                if (TTWebsiteActivity.this.moa != null) {
                    String url = TTWebsiteActivity.this.moa.getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTWebsiteActivity.this.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                }
                TTWebsiteActivity.this.uef("onSelectCopyLink");
                tpxVar.uef();
            }
        });
        tpxVar.uef(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final String str) {
        try {
            com.bytedance.sdk.openadsdk.ab.moa.uef(str, false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.4
                @Override // com.bytedance.sdk.openadsdk.ab.oa
                public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                    return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef(str).oa((String) null);
                }
            });
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.uef("TTAD.TTWebsiteActivity", "Failed to put iab_click_time into JSON", e7);
        }
    }
}
