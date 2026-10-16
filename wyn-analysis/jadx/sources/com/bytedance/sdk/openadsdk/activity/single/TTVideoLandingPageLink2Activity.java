package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bs;
import com.bytedance.sdk.openadsdk.common.wk;
import com.bytedance.sdk.openadsdk.common.wrv;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.dz;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.moa.cq;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.dj;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.dj.moa {
    bs dor;
    private wrv dv;
    TTAdDislikeToast etd;

    /* renamed from: hg, reason: collision with root package name */
    private long f25213hg;
    private com.bytedance.sdk.openadsdk.common.lw hnk;
    private boolean hts;
    private View nkh;
    private com.bytedance.sdk.openadsdk.core.widget.uef.lw ot;
    private PAGLogoView vjj;
    private TextView vyg;
    private TextView wxf;
    private View zou;
    private boolean ou = false;
    final AtomicBoolean uqx = new AtomicBoolean(false);
    final AtomicBoolean rj = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        com.bytedance.sdk.openadsdk.moa.yo.uef(this.f25206ab, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        wrv wrvVar = this.dv;
        if (wrvVar != null) {
            wrvVar.oa();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dhk() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.etd) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void oib() {
        try {
            if (this.dor == null) {
                bs bsVar = new bs(this.lw, this.f25206ab);
                this.dor = bsVar;
                bsVar.setDislikeSource("landing_page");
                this.dor.setCallback(new bs.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.4
                    @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                    public void oa(View view) {
                        TTVideoLandingPageLink2Activity.this.uqx.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                    public void uef(View view) {
                        TTVideoLandingPageLink2Activity.this.uqx.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                    public void uef(FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.rj.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.rj.set(true);
                        TTVideoLandingPageLink2Activity.this.dhk();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.dor);
            if (this.etd == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.lw);
                this.etd = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    private void sy() {
        TTAdDislikeToast tTAdDislikeToast = this.etd;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        wrv wrvVar = this.dv;
        if (wrvVar != null) {
            wrvVar.uef();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        gzw gzwVar;
        com.bytedance.sdk.component.cz.ivm ivmVar;
        super.onCreate(bundle);
        if (!wk.lw() || (gzwVar = this.f25206ab) == null || (ivmVar = ((TTVideoLandingPageActivity) this).uef) == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.lw lwVarUef = gb.uef(gzwVar, ivmVar, this.lw, this.fz);
        this.hnk = lwVarUef;
        if (lwVarUef != null) {
            lwVarUef.uef("landingpage_split_screen");
        }
        if (((TTVideoLandingPageActivity) this).uef.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).uef.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i5, int i10, int i11, int i12) {
                    cq cqVar = TTVideoLandingPageLink2Activity.this.af;
                    if (cqVar != null) {
                        cqVar.oa(i10);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.uef.lw lwVar = new com.bytedance.sdk.openadsdk.core.widget.uef.lw(this.lw, this.bcc, this.ivm, this.hnk, this.af, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.zou != null && !TTVideoLandingPageLink2Activity.this.hts) {
                        TTVideoLandingPageLink2Activity.this.zou.setVisibility(8);
                    }
                    TTVideoLandingPageLink2Activity.this.ou = true;
                    TTVideoLandingPageLink2Activity.this.bs();
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.moa.yo.uef(tTVideoLandingPageLink2Activity.f25206ab, tTVideoLandingPageLink2Activity.fz, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f25213hg, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.f25213hg = System.currentTimeMillis();
            }
        };
        this.ot = lwVar;
        lwVar.uef(this.f25206ab);
        ((TTVideoLandingPageActivity) this).uef.setWebViewClient(this.ot);
        ((TTVideoLandingPageActivity) this).uef.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.uef.moa(this.bcc, this.af, this.hnk) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.moa, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i5) {
                super.onProgressChanged(webView, i5);
                if (TTVideoLandingPageLink2Activity.this.dv != null) {
                    TTVideoLandingPageLink2Activity.this.dv.uef(i5);
                }
            }
        });
        TextView textView = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.bs.gv);
        if (textView != null && this.f25206ab.gsd() != null) {
            textView.setText(this.f25206ab.gsd().lw());
        }
        gzw gzwVar2 = this.f25206ab;
        wk.yo().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.hts = true;
                    if (TTVideoLandingPageLink2Activity.this.dv != null) {
                        TTVideoLandingPageLink2Activity.this.dv.oa();
                    }
                    TTVideoLandingPageLink2Activity.this.nkh.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.vjj != null) {
                        TTVideoLandingPageLink2Activity.this.vjj.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.ou) {
                        return;
                    }
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.moa.yo.uef(tTVideoLandingPageLink2Activity.f25206ab, tTVideoLandingPageLink2Activity.fz, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f25213hg, false);
                } catch (Exception unused) {
                }
            }
        }, (gzwVar2 == null || gzwVar2.gsd() == null) ? 10000L : this.f25206ab.gsd().uef() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        bs();
        if (!this.hts && this.af != null && ((TTVideoLandingPageActivity) this).uef != null && this.dv.getVisibility() == 8) {
            this.af.uef(((TTVideoLandingPageActivity) this).uef);
        }
        super.onDestroy();
    }

    public void wk() {
        if (isFinishing()) {
            return;
        }
        if (this.rj.get()) {
            sy();
            return;
        }
        if (this.dor == null) {
            oib();
        }
        bs bsVar = this.dor;
        if (bsVar != null) {
            bsVar.uef();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public boolean bcc() {
        int i5 = this.cq;
        return i5 == 5 || i5 == 15 || i5 == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public void ivm() {
        if (!bcc()) {
            try {
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.f25206ab.lpy().get(0), imageView, this.f25206ab);
                this.wrv.setVisibility(0);
                this.wrv.removeAllViews();
                this.wrv.addView(imageView);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        com.bytedance.sdk.openadsdk.moa.yo.oa(TTVideoLandingPageLink2Activity.this.f25206ab, "landingpage_split_screen");
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.ivm();
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = this.dz;
        if (ivmVar != null) {
            if (ivmVar.getNativeVideoController() != null) {
                this.dz.getNativeVideoController().uef(false);
                this.dz.getNativeVideoController().ivm(false);
                this.wrv.setClickable(true);
                this.wrv.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.12
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.ab();
                        return false;
                    }
                });
            }
            this.dz.getNativeVideoController().uef(new yo.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.2
                @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
                public void oa(long j8, int i5) {
                }

                @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
                public void uef() {
                }

                @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
                public void uef(long j8, int i5) {
                }

                @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
                public void uef(long j8, long j10) {
                    if (TTVideoLandingPageLink2Activity.this.vyg != null) {
                        int iMax = (int) Math.max(0L, (j10 - j8) / 1000);
                        TTVideoLandingPageLink2Activity.this.vyg.setText(String.valueOf(iMax));
                        if (iMax <= 0) {
                            TTVideoLandingPageLink2Activity.this.vyg.setVisibility(8);
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public void lw() {
        super.lw();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(orq.uef(sy.uef(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.wk();
                }
            });
        }
        this.vyg = (TextView) findViewById(520093714);
        this.dv = (wrv) findViewById(com.bytedance.sdk.openadsdk.utils.bs.etd);
        this.zou = findViewById(com.bytedance.sdk.openadsdk.utils.bs.dor);
        this.nkh = findViewById(com.bytedance.sdk.openadsdk.utils.bs.pu);
        TextView textView2 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.bs.rj);
        TextView textView3 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.bs.dv);
        com.bytedance.sdk.openadsdk.core.widget.bs bsVar = (com.bytedance.sdk.openadsdk.core.widget.bs) findViewById(com.bytedance.sdk.openadsdk.utils.bs.uqx);
        this.wxf = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.bs.zou);
        if (this.f25206ab.ifk() != null && !TextUtils.isEmpty(this.f25206ab.ifk().uef())) {
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.f25206ab.ifk(), bsVar, this.f25206ab);
        }
        textView2.setText(this.f25206ab.jp());
        textView3.setText(this.f25206ab.az());
        View viewFindViewById = findViewById(com.bytedance.sdk.openadsdk.utils.bs.nkh);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.uef(tTVideoLandingPageLink2Activity.lw, tTVideoLandingPageLink2Activity.f25206ab, tTVideoLandingPageLink2Activity.fz);
            }
        });
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.f25206ab);
        }
        com.bytedance.sdk.component.cz.ivm ivmVar = ((TTVideoLandingPageActivity) this).uef;
        if (ivmVar != null && ivmVar.getWebView() != null) {
            gb.uef(this.f25206ab, ((TTVideoLandingPageActivity) this).uef);
        }
        if (((TTVideoLandingPageActivity) this).uef.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).uef.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.11
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    cq cqVar = TTVideoLandingPageLink2Activity.this.af;
                    if (cqVar != null) {
                        cqVar.uef(motionEvent);
                    }
                    if (TTVideoLandingPageLink2Activity.this.hnk == null) {
                        return false;
                    }
                    TTVideoLandingPageLink2Activity.this.hnk.uef(motionEvent);
                    return false;
                }
            });
        }
        wrv wrvVar = this.dv;
        if (wrvVar != null) {
            wrvVar.uef(this.f25206ab);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public void wrv() {
        super.wrv();
        gzw gzwVar = this.f25206ab;
        if (gzwVar != null) {
            gzwVar.dz(true);
        }
        TextView textView = this.wxf;
        if (textView != null) {
            textView.setText(yo());
            this.wxf.setClickable(true);
            this.wxf.setOnClickListener(this.au);
            this.wxf.setOnTouchListener(this.au);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public View oa() {
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(this);
        if (Build.VERSION.SDK_INT >= 35) {
            lwVar.setFitsSystemWindows(true);
        }
        lwVar.setOrientation(1);
        lwVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(this);
        lwVar.addView(yoVar, new LinearLayout.LayoutParams(-1, af.oa(this, 220.0f)));
        View yoVar2 = new com.bytedance.sdk.openadsdk.core.ivm.yo(this);
        yoVar2.setId(com.bytedance.sdk.openadsdk.utils.bs.gb);
        yoVar.addView(yoVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(this);
        lwVar2.setOrientation(0);
        lwVar2.setPadding(0, af.oa(this, 20.0f), 0, 0);
        yoVar.addView(lwVar2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        lwVar2.addView(view, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.wk wkVar = new com.bytedance.sdk.openadsdk.core.widget.wk(this);
        wkVar.setId(520093713);
        wkVar.setGravity(17);
        wkVar.setText(orq.uef(this, "tt_reward_feedback"));
        wkVar.setTextColor(-1);
        wkVar.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, af.oa(this, 28.0f));
        int iOa = af.oa(this, 16.0f);
        layoutParams2.rightMargin = iOa;
        layoutParams2.leftMargin = iOa;
        lwVar2.addView(wkVar, layoutParams2);
        dz dzVar = new dz(this);
        dzVar.setId(com.bytedance.sdk.openadsdk.utils.bs.af);
        dzVar.setPadding(af.oa(this, 7.0f), af.oa(this, 7.0f), af.oa(this, 7.0f), af.oa(this, 7.0f));
        dzVar.setImageResource(orq.moa(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(af.oa(this, 28.0f), af.oa(this, 28.0f));
        layoutParams3.rightMargin = af.oa(this, 12.0f);
        lwVar2.addView(dzVar, layoutParams3);
        com.bytedance.sdk.openadsdk.core.ivm.xs xsVar = new com.bytedance.sdk.openadsdk.core.ivm.xs(this);
        xsVar.setVisibility(8);
        xsVar.setId(com.bytedance.sdk.openadsdk.utils.bs.sk);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = af.oa(this, 10.0f);
        lwVar.addView(xsVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.uef uefVar = new com.bytedance.sdk.openadsdk.core.widget.uef(this);
        uefVar.setId(com.bytedance.sdk.openadsdk.utils.bs.rl);
        uefVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        uefVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(af.oa(this, 44.0f), af.oa(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = af.oa(this, 5.0f);
        xsVar.addView(uefVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(this);
        int i5 = com.bytedance.sdk.openadsdk.utils.bs.swd;
        bccVar.setId(i5);
        bccVar.setBackground(dj.uef(this, "tt_circle_solid_mian"));
        bccVar.setGravity(17);
        bccVar.setTextColor(-1);
        bccVar.setTextSize(2, 19.0f);
        bccVar.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(af.oa(this, 44.0f), af.oa(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = af.oa(this, 5.0f);
        xsVar.addView(bccVar, layoutParams6);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(this);
        bccVar2.setId(com.bytedance.sdk.openadsdk.utils.bs.gem);
        bccVar2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        bccVar2.setEllipsize(truncateAt);
        bccVar2.setTextColor(Color.parseColor("#e5000000"));
        bccVar2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = af.oa(this, 5.0f);
        layoutParams7.rightMargin = af.oa(this, 80.0f);
        layoutParams7.addRule(1, i5);
        xsVar.addView(bccVar2, layoutParams7);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar3 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(this);
        bccVar3.setId(com.bytedance.sdk.openadsdk.utils.bs.cop);
        bccVar3.setClickable(true);
        bccVar3.setMaxLines(1);
        bccVar3.setEllipsize(truncateAt);
        bccVar3.setFocusable(true);
        bccVar3.setGravity(17);
        bccVar3.setText(orq.uef(this, "tt_video_mobile_go_detail"));
        bccVar3.setTextColor(-1);
        bccVar3.setTextSize(2, 14.0f);
        bccVar3.setPadding(af.oa(this, 2.0f), af.oa(this, 2.0f), af.oa(this, 2.0f), af.oa(this, 2.0f));
        bccVar3.setBackground(dj.uef(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(af.oa(this, 90.0f), af.oa(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = af.oa(this, 5.0f);
        xsVar.addView(bccVar3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar3 = new com.bytedance.sdk.openadsdk.core.ivm.yo(this);
        lwVar.addView(yoVar3, new LinearLayout.LayoutParams(-1, -1));
        View ivmVar = new com.bytedance.sdk.component.cz.ivm(this, ivm.yo.LANDING_PAGE);
        ivmVar.setId(com.bytedance.sdk.openadsdk.utils.bs.au);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = af.oa(this, 2.0f);
        yoVar3.addView(ivmVar, layoutParams9);
        com.bytedance.sdk.openadsdk.core.ivm.xs xsVar2 = new com.bytedance.sdk.openadsdk.core.ivm.xs(this);
        xsVar2.setId(com.bytedance.sdk.openadsdk.utils.bs.dor);
        xsVar2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        yoVar3.addView(xsVar2, new FrameLayout.LayoutParams(-1, -1));
        View wrvVar = new wrv(this);
        wrvVar.setId(com.bytedance.sdk.openadsdk.utils.bs.etd);
        xsVar2.addView(wrvVar, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar3 = new com.bytedance.sdk.openadsdk.core.ivm.lw(this);
        lwVar3.setId(com.bytedance.sdk.openadsdk.utils.bs.pu);
        lwVar3.setOrientation(1);
        lwVar3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        xsVar2.addView(lwVar3, layoutParams10);
        com.bytedance.sdk.openadsdk.core.widget.bs bsVar = new com.bytedance.sdk.openadsdk.core.widget.bs(this);
        bsVar.setId(com.bytedance.sdk.openadsdk.utils.bs.uqx);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(af.oa(this, 80.0f), af.oa(this, 80.0f));
        layoutParams11.gravity = 17;
        lwVar3.addView(bsVar, layoutParams11);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar4 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(this);
        bccVar4.setId(com.bytedance.sdk.openadsdk.utils.bs.rj);
        bccVar4.setTextColor(Color.parseColor("#161823"));
        bccVar4.setTextSize(0, af.oa(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = af.oa(this, 12.0f);
        lwVar3.addView(bccVar4, layoutParams12);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar5 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(this);
        bccVar5.setId(com.bytedance.sdk.openadsdk.utils.bs.dv);
        bccVar5.setTextColor(Color.parseColor("#80161823"));
        bccVar5.setTextSize(0, af.oa(this, 16.0f));
        bccVar5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int iOa2 = af.oa(this, 60.0f);
        layoutParams13.rightMargin = iOa2;
        layoutParams13.leftMargin = iOa2;
        layoutParams13.topMargin = af.oa(this, 8.0f);
        lwVar3.addView(bccVar5, layoutParams13);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar6 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(this);
        bccVar6.setId(com.bytedance.sdk.openadsdk.utils.bs.zou);
        bccVar6.setGravity(17);
        bccVar6.setTextColor(-1);
        bccVar6.setText(orq.uef(this, "tt_video_mobile_go_detail"));
        bccVar6.setBackground(dj.uef(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(af.oa(this, 255.0f), af.oa(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = af.oa(this, 32.0f);
        lwVar3.addView(bccVar6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.vjj = pAGLogoView;
        pAGLogoView.setId(com.bytedance.sdk.openadsdk.utils.bs.nkh);
        this.vjj.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, af.oa(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = af.oa(this, 18.0f);
        layoutParams15.bottomMargin = af.oa(this, 61.0f);
        xsVar2.addView(this.vjj, layoutParams15);
        View wkVar2 = new com.bytedance.sdk.openadsdk.common.wk(this, new wk.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.common.wk.uef
            public View uef(Context context) {
                return new com.bytedance.sdk.openadsdk.common.bcc(context);
            }
        });
        wkVar2.setId(com.bytedance.sdk.openadsdk.utils.bs.hts);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, af.oa(this, 48.0f));
        layoutParams16.gravity = 81;
        yoVar3.addView(wkVar2, layoutParams16);
        return lwVar;
    }
}
