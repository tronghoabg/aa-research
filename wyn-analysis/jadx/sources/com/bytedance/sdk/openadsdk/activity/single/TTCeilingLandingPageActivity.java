package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.component.utils.pz;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.oib;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.widget.uef.ivm;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.moa.cq;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;

/* loaded from: classes3.dex */
public class TTCeilingLandingPageActivity extends TTBaseLandingPageActivity {
    private cq bcc;
    private com.bytedance.sdk.openadsdk.common.lw dj;
    private int ivm;
    private String lw;
    private String moa;

    /* renamed from: oa, reason: collision with root package name */
    private gzw f25165oa;
    uef uef;
    private com.bytedance.sdk.component.cz.ivm wrv;
    private String xs;
    private oyt yo;

    public interface uef {
        void uef();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!wk.lw()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.ivm = intent.getIntExtra("source", -1);
        gzw gzwVarUef = cp.uef().uef(cp.uef(intent));
        this.f25165oa = gzwVarUef;
        if (gzwVarUef == null) {
            finish();
            return;
        }
        this.xs = gzwVarUef.dj();
        this.moa = this.f25165oa.iou();
        this.lw = this.f25165oa.em();
        this.ivm = this.f25165oa.cl().getDurationSlotType() != 7 ? 5 : 7;
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(this);
        uef(this, yoVar);
        setContentView(yoVar);
        oa();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.component.cz.ivm ivmVar = this.wrv;
        if (ivmVar != null) {
            pz.uef(ivmVar);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        cq cqVar = this.bcc;
        if (cqVar != null) {
            cqVar.bcc();
        }
    }

    private void oa() {
        oyt oytVar = new oyt(this);
        this.yo = oytVar;
        oytVar.oa(this.wrv).yo(this.moa).moa(this.lw).uef(this.f25165oa).oa(this.ivm).uef(this.f25165oa.us()).lw(this.f25165oa.kid()).uef(this.wrv).oa("landingpage_split_ceiling");
    }

    private void uef(Context context, FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar;
        this.wrv = new com.bytedance.sdk.component.cz.ivm(context, ivm.yo.LANDING_PAGE);
        frameLayout.addView(this.wrv, new FrameLayout.LayoutParams(-1, -1));
        View viewOa = com.bytedance.sdk.openadsdk.core.widget.ivm.oa(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = af.oa(context, 18.0f);
        layoutParams.rightMargin = af.oa(context, 18.0f);
        frameLayout.addView(viewOa, layoutParams);
        final int iXs = this.f25165oa.gr().xs();
        if (iXs != 3) {
            moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(af.oa(context, 28.0f), af.oa(context, 28.0f));
            layoutParams2.gravity = 8388659;
            layoutParams2.topMargin = af.oa(context, 18.0f);
            layoutParams2.leftMargin = af.oa(context, 18.0f);
            int iOa = af.oa(context, 5.0f);
            moaVar.setPadding(iOa, iOa, iOa, iOa);
            moaVar.setScaleType(ImageView.ScaleType.FIT_XY);
            moaVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.moa.uef());
            moaVar.setImageDrawable(orq.yo(context, "tt_white_lefterbackicon_titlebar"));
            frameLayout.addView(moaVar, layoutParams2);
        } else {
            moaVar = null;
        }
        com.bytedance.sdk.openadsdk.utils.gzw.uef(this.wrv, this.xs);
        final WebView webView = this.wrv.getWebView();
        viewOa.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        cq cqVar = new cq(this.f25165oa, webView, true);
        this.bcc = cqVar;
        cqVar.uef("landingpage_split_ceiling");
        final ivm.uef uefVar = this.bcc.uef;
        if (moaVar != null) {
            moaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i5 = iXs;
                    if (i5 == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    } else if (i5 != 2) {
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 == null || !webView2.canGoBack()) {
                        TTCeilingLandingPageActivity.this.finish();
                        return;
                    }
                    webView.goBack();
                    ivm.uef uefVar2 = uefVar;
                    if (uefVar2 != null) {
                        uefVar2.uef();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.common.lw lwVarUef = gb.uef(this.f25165oa, this.wrv, this, "landingpage_split_ceiling");
        this.dj = lwVarUef;
        if (lwVarUef != null) {
            lwVarUef.uef("landingpage_split_ceiling");
            this.dj.uef();
        }
        gb.uef(this.f25165oa, this.wrv, true);
        this.uef = new uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.uef
            public void uef() {
                if (TTCeilingLandingPageActivity.this.f25165oa.gr().bcc() == oib.f25702oa) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        com.bytedance.sdk.openadsdk.core.widget.uef.lw lwVar = new com.bytedance.sdk.openadsdk.core.widget.uef.lw(this, this.yo, this.moa, this.dj, this.bcc, true, true, this.uef) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
            }
        };
        lwVar.uef(this.f25165oa);
        com.bytedance.sdk.openadsdk.core.widget.uef.moa moaVar2 = new com.bytedance.sdk.openadsdk.core.widget.uef.moa(this.yo, this.bcc, this.dj) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.moa, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView2, int i5) {
                super.onProgressChanged(webView2, i5);
            }
        };
        com.bytedance.sdk.component.cz.ivm ivmVar = this.wrv;
        if (ivmVar != null) {
            ivmVar.setWebViewClient(lwVar);
            this.wrv.setWebChromeClient(moaVar2);
        }
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.6
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTCeilingLandingPageActivity.this.bcc == null) {
                        return false;
                    }
                    TTCeilingLandingPageActivity.this.bcc.uef(motionEvent);
                    return false;
                }
            });
            webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.7
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i5, int i10, int i11, int i12) {
                    if (TTCeilingLandingPageActivity.this.bcc != null) {
                        TTCeilingLandingPageActivity.this.bcc.oa(i10);
                    }
                }
            });
        }
    }
}
