package com.bytedance.sdk.openadsdk.component.reward.uef;

import A0.j;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.openadsdk.core.af;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.google.android.gms.common.api.f;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oib implements com.bytedance.sdk.openadsdk.cq.cz {
    private volatile boolean bcc;
    private final oa cz;
    private com.bytedance.sdk.openadsdk.core.yo.xs ivm;
    private boolean lw;
    private ImageView moa;

    /* renamed from: oa, reason: collision with root package name */
    private final gzw f25416oa;
    private final Activity uef;
    private final AtomicBoolean xs = new AtomicBoolean(false);
    private com.bytedance.sdk.component.cz.ivm yo;
    private int zjm;

    public oib(oa oaVar) {
        this.cz = oaVar;
        this.f25416oa = oaVar.f25412oa;
        this.uef = oaVar.pu;
    }

    private void moa() {
        this.yo.lw();
        uef(this.yo);
        this.yo.setDisplayZoomControls(false);
        this.yo.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.oib.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i5) {
                super.onProgressChanged(webView, i5);
                if (i5 == 100) {
                    oib.this.yo();
                }
            }
        });
        this.yo.setWebViewClient(new ivm.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.oib.4
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                oib.this.yo();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    oib.this.uef(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (oib.this.uef(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo() {
        uef(f.API_PRIORITY_OTHER, (String) null);
    }

    public void oa() {
        DeviceUtils.AudioInfoReceiver.oa(this);
        com.bytedance.sdk.component.cz.ivm ivmVar = this.yo;
        if (ivmVar != null) {
            af.uef(ivmVar.getWebView());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.cq.cz
    public void yo(int i5) {
        int i10 = this.zjm;
        if (i10 == 0 && i5 > 0) {
            this.f25416oa.nkc().uef().cz(this.cz.tpx.cq());
        } else if (i10 > 0 && i5 == 0) {
            this.f25416oa.nkc().uef().bcc(this.cz.tpx.cq());
        }
        this.zjm = i5;
    }

    public void uef() {
        DeviceUtils.AudioInfoReceiver.uef(this);
        this.zjm = DeviceUtils.xs();
        if (this.f25416oa.nkc() != null) {
            this.ivm = new com.bytedance.sdk.openadsdk.core.yo.xs("VAST_END_CARD", this.f25416oa.nkc()) { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.oib.1
            };
            com.bytedance.sdk.openadsdk.core.dz.yo yoVarYo = this.f25416oa.nkc().yo();
            if (yoVarYo != null) {
                String strMoa = yoVarYo.moa();
                if (!TextUtils.isEmpty(strMoa)) {
                    this.lw = true;
                    this.moa = (ImageView) this.cz.km.findViewById(com.bytedance.sdk.openadsdk.utils.bs.zjm);
                    uef(yoVarYo.uef(), yoVarYo.oa());
                    com.bytedance.sdk.openadsdk.zjm.moa.uef(strMoa).uef(yoVarYo.uef()).oa(yoVarYo.oa()).lw(com.bytedance.sdk.openadsdk.utils.af.lw(com.bytedance.sdk.openadsdk.core.sy.uef())).moa(com.bytedance.sdk.openadsdk.utils.af.yo(com.bytedance.sdk.openadsdk.core.sy.uef())).yo(1).uef(new com.bytedance.sdk.openadsdk.zjm.oa(this.f25416oa, strMoa, new uef(this.moa, strMoa, this, this.xs)));
                    return;
                }
                com.bytedance.sdk.component.cz.ivm ivmVar = (com.bytedance.sdk.component.cz.ivm) this.cz.km.findViewById(com.bytedance.sdk.openadsdk.utils.bs.dj);
                this.yo = ivmVar;
                if (ivmVar == null) {
                    return;
                }
                moa();
                String strYo = yoVarYo.yo();
                if (strYo != null) {
                    this.lw = true;
                    if (strYo.startsWith("http")) {
                        this.yo.a_(strYo);
                        return;
                    }
                    String strUef = com.bytedance.sdk.openadsdk.core.dz.lw.uef(strYo);
                    String str = TextUtils.isEmpty(strUef) ? strYo : strUef;
                    this.yo.setDefaultTextEncodingName("UTF -8");
                    this.yo.uef(null, str, "text/html", "UTF-8", null);
                }
            }
        }
    }

    public static class uef implements com.bytedance.sdk.component.lw.ab {
        private final AtomicBoolean moa;

        /* renamed from: oa, reason: collision with root package name */
        private final String f25418oa;
        private final WeakReference<ImageView> uef;
        private final WeakReference<oib> yo;

        public uef(ImageView imageView, String str, oib oibVar, AtomicBoolean atomicBoolean) {
            this.uef = new WeakReference<>(imageView);
            this.f25418oa = str;
            this.yo = new WeakReference<>(oibVar);
            this.moa = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(com.bytedance.sdk.component.lw.dj djVar) {
            oib oibVar;
            ImageView imageView = this.uef.get();
            if (imageView == null || (oibVar = this.yo.get()) == null || djVar == null) {
                return;
            }
            Object objOa = djVar.oa();
            if (objOa == null) {
                oibVar.uef(-1, this.f25418oa);
                return;
            }
            if (objOa instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objOa);
            } else if (objOa instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && j.B(objOa)) {
                    j.k(objOa).start();
                }
                imageView.setImageDrawable((Drawable) objOa);
            }
            this.moa.set(true);
            oibVar.yo();
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(int i5, String str, Throwable th) {
            oib oibVar;
            ImageView imageView = this.uef.get();
            if (imageView == null || (oibVar = this.yo.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            oibVar.uef(-2, this.f25418oa);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final int i5, final String str) {
        if (this.bcc) {
            return;
        }
        this.bcc = true;
        if (i5 == Integer.MAX_VALUE) {
            gzw gzwVar = this.f25416oa;
            com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, gzwVar.lw(), "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.moa.yo.uef(new com.bytedance.sdk.component.bcc.oa.yo("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.oib.2
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i5);
                        jSONObject.put("error_code", i5);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        com.bytedance.sdk.openadsdk.moa.yo.oa(oib.this.f25416oa, oib.this.f25416oa.lw(), "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void uef(com.bytedance.sdk.component.cz.ivm ivmVar) {
        ivmVar.setVerticalScrollBarEnabled(false);
        ivmVar.setHorizontalScrollBarEnabled(false);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(String str) {
        gzw gzwVar;
        if (str == null || (gzwVar = this.f25416oa) == null || gzwVar.nkc() == null || this.ivm == null) {
            return false;
        }
        this.f25416oa.nkc().ivm(str);
        this.ivm.onClick(this.yo);
        return true;
    }

    private void uef(int i5, int i10) {
        if (i5 == 0 || i10 == 0 || this.moa == null) {
            return;
        }
        int iYo = com.bytedance.sdk.openadsdk.utils.af.yo((Context) this.uef);
        int iLw = com.bytedance.sdk.openadsdk.utils.af.lw(this.uef);
        if (i5 / i10 <= iYo / iLw) {
            iYo = (int) Math.ceil(r5 * r4);
        } else {
            iLw = (int) Math.ceil(r5 / r4);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.moa.getLayoutParams();
        layoutParams.width = iYo;
        layoutParams.height = iLw;
        layoutParams.gravity = 17;
        this.moa.setLayoutParams(layoutParams);
        this.moa.setOnClickListener(this.ivm);
        this.moa.setOnTouchListener(this.ivm);
    }

    public boolean uef(bs bsVar) {
        com.bytedance.sdk.openadsdk.core.dz.yo yoVarYo;
        if (!this.lw) {
            return false;
        }
        if (this.moa != null && this.xs.get()) {
            this.moa.setVisibility(0);
        } else {
            com.bytedance.sdk.component.cz.ivm ivmVar = this.yo;
            if (ivmVar != null) {
                ivmVar.setVisibility(0);
                if (this.yo.getWebView() != null) {
                    this.yo.getWebView().setOnTouchListener(this.ivm);
                }
            }
        }
        gzw gzwVar = this.f25416oa;
        if (gzwVar == null || gzwVar.nkc() == null || (yoVarYo = this.f25416oa.nkc().yo()) == null) {
            return true;
        }
        yoVarYo.oa(bsVar != null ? bsVar.cq() : -1L);
        return true;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.yo.lw lwVar) {
        com.bytedance.sdk.openadsdk.core.yo.xs xsVar = this.ivm;
        if (xsVar != null) {
            xsVar.uef(lwVar);
        }
    }
}
