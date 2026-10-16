package com.bytedance.sdk.openadsdk.core.cq.yo;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.oa.dj;
import com.bytedance.sdk.component.adexpress.oa.dz;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.bs;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.widget.uef.lw;
import com.bytedance.sdk.openadsdk.core.zjm.ab;
import com.bytedance.sdk.openadsdk.utils.dhk;
import com.bytedance.sdk.openadsdk.utils.sk;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa implements dj, yo<ivm> {
    private final boolean bcc;
    private boolean cz = false;
    private com.bytedance.sdk.openadsdk.core.cq.yo.uef ivm;
    private String lw;
    private oyt moa;

    /* renamed from: oa, reason: collision with root package name */
    private gzw f25561oa;
    private Context uef;
    private int xs;
    private ivm yo;
    private uef zjm;

    public interface uef {
        void xs();
    }

    public moa(Context context, gzw gzwVar, boolean z2) {
        this.xs = 1;
        this.uef = context;
        this.f25561oa = gzwVar;
        this.xs = gzwVar.cgg();
        this.bcc = z2;
        if (z2) {
            this.lw = bs.oa(this.f25561oa).uef(this.xs == 1);
        } else {
            this.lw = bs.yo(this.f25561oa).uef(this.xs == 1);
        }
    }

    private void bcc() {
        oyt oytVar = new oyt(this.uef);
        this.moa = oytVar;
        oytVar.oa(this.yo).uef(this.f25561oa).yo(this.f25561oa.iou()).moa(this.f25561oa.em()).lw(this.f25561oa.kid()).uef(com.bytedance.sdk.openadsdk.core.zjm.oa.yo.uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, this.f25561oa, null, null)).uef(this).uef(this.yo);
    }

    private void xs() {
        moa moaVar;
        this.yo.setBackgroundColor(0);
        this.yo.setBackgroundResource(R.color.transparent);
        this.yo.setVisibility(8);
        uef(this.yo);
        if (this.f25561oa != null) {
            moaVar = this;
            this.yo.setWebViewClient(new lw(this.uef, this.moa, this.f25561oa.iou(), null, false) { // from class: com.bytedance.sdk.openadsdk.core.cq.yo.moa.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (moa.this.zjm != null) {
                        moa.this.zjm.xs();
                    }
                }
            });
        } else {
            moaVar = this;
        }
        com.bytedance.sdk.component.adexpress.lw.lw.uef().uef(moaVar.yo, moaVar.moa);
        moaVar.yo.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.uef.moa(moaVar.moa));
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.yo.yo
    /* renamed from: ivm, reason: merged with bridge method [inline-methods] */
    public ivm moa() {
        return this.yo;
    }

    public oyt lw() {
        return this.moa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.yo.yo
    public void oa() {
        if (TextUtils.isEmpty(this.lw)) {
            this.yo.setVisibility(8);
        } else {
            this.yo.a_(this.lw);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.dj
    public void uef(dz dzVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.yo.yo
    public void yo() {
        oyt oytVar = this.moa;
        if (oytVar != null) {
            oytVar.yo();
        }
        this.moa = null;
        try {
            ivm ivmVar = this.yo;
            if (ivmVar != null) {
                ViewGroup viewGroup = (ViewGroup) ivmVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.yo);
                }
                this.yo.ab();
            }
        } catch (Throwable unused) {
        }
        if (this.zjm != null) {
            this.zjm = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.yo.yo
    public void uef() {
        this.yo = new ivm(this.uef, ivm.yo.EASY_PLAYABLE);
        xs();
        bcc();
        if (this.bcc) {
            return;
        }
        sk.uef(this.yo, false, this.f25561oa.epe(), false, new sk.oa() { // from class: com.bytedance.sdk.openadsdk.core.cq.yo.moa.1
            @Override // com.bytedance.sdk.openadsdk.utils.sk.oa
            public void oa() {
                moa.this.uef(false);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.sk.oa
            public void uef(View view, boolean z2) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.sk.oa
            public void uef(boolean z2) {
                moa.this.uef(z2);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.sk.oa
            public void uef() {
                moa.this.uef(true);
            }
        }, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.yo.yo
    public void uef(com.bytedance.sdk.openadsdk.core.cq.yo.uef uefVar) {
        this.ivm = uefVar;
    }

    private void uef(ivm ivmVar) {
        if (ivmVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.uef.yo.uef(this.uef).uef(false).uef(ivmVar.getWebView());
            ivmVar.setVerticalScrollBarEnabled(false);
            ivmVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.uef.yo.uef(ivmVar);
            ivmVar.dz();
            ivmVar.setUserAgentString(dhk.uef(ivmVar.getWebView(), BuildConfig.VERSION_CODE));
            ivmVar.setMixedContentMode(0);
            ivmVar.setJavaScriptEnabled(true);
            ivmVar.setJavaScriptCanOpenWindowsAutomatically(true);
            ivmVar.setDomStorageEnabled(true);
            ivmVar.setDatabaseEnabled(true);
            ivmVar.setAllowFileAccess(false);
            ivmVar.setSupportZoom(true);
            ivmVar.setBuiltInZoomControls(true);
            ivmVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            ivmVar.setUseWideViewPort(true);
            ivmVar.setCacheMode(-1);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.yo.yo
    public void uef(ab abVar) {
        oyt oytVar = this.moa;
        if (oytVar != null) {
            oytVar.uef(abVar);
        }
    }

    public void uef(boolean z2) {
        if (z2 == this.cz) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visibleState", !z2 ? 1 : 0);
        } catch (Exception e7) {
            e7.getMessage();
        }
        this.moa.uef("visibleStateChange", jSONObject);
        this.cz = z2;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.dj
    public void uef(View view, int i5, com.bytedance.sdk.component.adexpress.yo yoVar) {
        com.bytedance.sdk.openadsdk.core.cq.yo.uef uefVar = this.ivm;
        if (uefVar != null) {
            uefVar.uef(view, i5, yoVar);
        }
    }

    public void uef(uef uefVar) {
        this.zjm = uefVar;
    }
}
