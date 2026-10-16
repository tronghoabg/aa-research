package com.bytedance.sdk.openadsdk.core.widget.uef;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.dhk;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class oa implements uef {
    private final boolean lw;
    private final MessageQueue moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.component.cz.ivm f25779oa;
    oyt uef;
    private final AtomicInteger yo;

    public oa(int i5, boolean z2, MessageQueue messageQueue) {
        this.yo = new AtomicInteger(i5);
        this.lw = z2;
        this.moa = messageQueue;
    }

    private void uef(com.bytedance.sdk.component.cz.ivm ivmVar) {
        if (ivmVar == null || ivmVar.getWebView() == null) {
            return;
        }
        try {
            yo.uef(sy.uef()).uef(false).uef(ivmVar.getWebView());
            ivmVar.setVerticalScrollBarEnabled(false);
            ivmVar.setHorizontalScrollBarEnabled(false);
            yo.uef(ivmVar);
            ivmVar.dz();
            ivmVar.setUserAgentString(dhk.uef(ivmVar.getWebView(), BuildConfig.VERSION_CODE));
            ivmVar.setMixedContentMode(0);
            ivmVar.setJavaScriptEnabled(true);
            ivmVar.setJavaScriptCanOpenWindowsAutomatically(true);
            ivmVar.setDomStorageEnabled(true);
            ivmVar.setDatabaseEnabled(true);
            ivmVar.setCacheMode(-1);
            ivmVar.setAllowFileAccess(false);
            ivmVar.setSupportZoom(true);
            ivmVar.setBuiltInZoomControls(true);
            ivmVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            ivmVar.setUseWideViewPort(true);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("WebViewPool", th.toString());
        }
    }

    public void oa() {
        if (this.yo.get() <= 0) {
            return;
        }
        Objects.toString(this.yo);
        String strMoa = com.bytedance.sdk.component.adexpress.uef.oa.oa.moa(null);
        if (this.lw) {
            String strMoa2 = com.bytedance.sdk.component.adexpress.uef.oa.oa.moa("v3");
            if (strMoa != null && strMoa.equals(strMoa2)) {
                return;
            } else {
                strMoa = strMoa2;
            }
        }
        if (TextUtils.isEmpty(strMoa)) {
            return;
        }
        try {
            com.bytedance.sdk.component.cz.ivm ivmVar = new com.bytedance.sdk.component.cz.ivm(new MutableContextWrapper(sy.uef()), this.lw ? ivm.yo.ADS_V3 : ivm.yo.ADS);
            this.f25779oa = ivmVar;
            if (ivmVar.getWebView() == null) {
                return;
            }
            this.f25779oa.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.uef.oa.1
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }
            });
            uef(this.f25779oa);
            Uri uriBuild = Uri.parse(strMoa).buildUpon().appendQueryParameter("isPreLoad", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION).build();
            oyt oytVar = new oyt(this.f25779oa.getContext());
            this.uef = oytVar;
            oytVar.oa(this.f25779oa).uef(this).uef(this.f25779oa);
            com.bytedance.sdk.component.adexpress.lw.lw.uef().uef(this.f25779oa, this.uef);
            this.f25779oa.a_(uriBuild.toString());
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.uef
    public void uef() {
        MessageQueue messageQueue;
        if (this.lw) {
            com.bytedance.sdk.component.adexpress.lw.lw.uef().yo(this.f25779oa);
        } else {
            com.bytedance.sdk.component.adexpress.lw.lw.uef().moa(this.f25779oa);
        }
        try {
            this.yo.get();
            this.yo.decrementAndGet();
            if (this.yo.get() <= 0 || (messageQueue = this.moa) == null) {
                return;
            }
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.widget.uef.oa.2
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    new oa(oa.this.yo.get(), oa.this.lw, oa.this.moa).oa();
                    return false;
                }
            });
        } catch (Exception e7) {
            e7.getMessage();
        }
    }
}
