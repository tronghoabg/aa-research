package com.bytedance.sdk.openadsdk.dz;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.oib;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.uef.yo;
import com.bytedance.sdk.openadsdk.gzw.lw;
import com.bytedance.sdk.openadsdk.moa.cq;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.xs.oa;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    private static long moa = 3600000;
    private static volatile uef uef = null;
    private static int yo = 2;
    private LinkedHashMap<Integer, SoftReference<ivm>> lw;

    /* renamed from: oa, reason: collision with root package name */
    private final Handler f25890oa;

    public uef() {
        yo = lw.uef("pre_render_count", 2);
        long jUef = lw.uef("pre_render_duration", 3600000);
        moa = jUef;
        if (yo <= 0) {
            yo = 2;
        }
        if (jUef <= 0) {
            moa = 3600000L;
        }
        this.lw = new LinkedHashMap<>();
        this.f25890oa = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.dz.uef.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                SoftReference softReference;
                int i5 = message.what;
                if (uef.this.lw == null || (softReference = (SoftReference) uef.this.lw.get(Integer.valueOf(i5))) == null) {
                    return false;
                }
                ivm ivmVar = (ivm) softReference.get();
                uef.this.uef(i5, 2, new gzw(), ivmVar == null ? "" : ivmVar.getTag());
                return false;
            }
        });
    }

    public static boolean yo(gzw gzwVar) {
        return dhk.bcc(gzwVar) || dhk.oa(gzwVar) || dhk.yo(gzwVar);
    }

    public ivm oa(gzw gzwVar) {
        if (gzwVar == null || TextUtils.isEmpty(gzwVar.cc())) {
            return null;
        }
        String strCc = gzwVar.cc();
        if (TextUtils.isEmpty(strCc)) {
            return null;
        }
        int iHashCode = strCc.hashCode();
        SoftReference<ivm> softReference = this.lw.get(Integer.valueOf(iHashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        ivm ivmVar = softReference.get();
        uef(gzwVar, ivmVar.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - gzwVar.jn()).floatValue(), "web_use_pre_render");
        uef(iHashCode, 3, gzwVar, ivmVar.getTag());
        return ivmVar;
    }

    public static uef uef() {
        if (uef == null) {
            synchronized (uef.class) {
                try {
                    if (uef == null) {
                        uef = new uef();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public void uef(final gzw gzwVar) {
        final String str;
        if (gzwVar == null || !yo(gzwVar)) {
            return;
        }
        oib oibVarGr = gzwVar.gr();
        if (oibVarGr == null) {
            oibVarGr = new oib();
        }
        gzwVar.kkq();
        if (gzwVar.kkq()) {
            String strCc = gzwVar.cc();
            if (TextUtils.isEmpty(strCc)) {
                return;
            }
            final int iHashCode = strCc.hashCode();
            if (dhk.oa(gzwVar)) {
                str = "landingpage_split_screen";
            } else if (dhk.moa(gzwVar)) {
                str = "landingpage_direct";
            } else if (dhk.yo(gzwVar)) {
                str = "landingpage_split_ceiling";
            } else {
                str = "";
            }
            LinkedHashMap<Integer, SoftReference<ivm>> linkedHashMap = this.lw;
            if (linkedHashMap == null || !linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                HashMap map = new HashMap();
                map.put(gzwVar.vup(), gzwVar);
                if (oibVarGr.oa() == 2) {
                    com.bytedance.sdk.openadsdk.xs.oa.uef().uef((Map<String, gzw>) map, new oa.uef() { // from class: com.bytedance.sdk.openadsdk.dz.uef.2
                        @Override // com.bytedance.sdk.openadsdk.xs.oa.uef
                        public void uef() {
                            uef.this.uef(iHashCode, gzwVar, str, true);
                        }
                    }, true);
                    return;
                }
                if (oibVarGr.oa() == 1) {
                    com.bytedance.sdk.openadsdk.xs.oa.uef().uef((Map<String, gzw>) map, (oa.uef) null, true);
                    uef(iHashCode, gzwVar, str, true);
                } else if (oibVarGr.oa() == 0) {
                    uef(iHashCode, gzwVar, str, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final int i5, final gzw gzwVar, final String str, final boolean z2) {
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dz.uef.3
            private com.bytedance.sdk.openadsdk.core.widget.uef.lw uef(final ivm ivmVar, cq cqVar) {
                com.bytedance.sdk.openadsdk.core.widget.uef.lw lwVar = new com.bytedance.sdk.openadsdk.core.widget.uef.lw(sy.uef(), null, gzwVar.iou(), cqVar, true) { // from class: com.bytedance.sdk.openadsdk.dz.uef.3.3
                    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str2) {
                        ivm ivmVar2 = ivmVar;
                        if (ivmVar2 != null) {
                            ivmVar2.setPreFinish(true);
                        }
                        super.onPageFinished(webView, str2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                    public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        ivm ivmVar2 = ivmVar;
                        if (ivmVar2 != null) {
                            ivmVar2.setPreStart(true);
                        }
                        super.onPageStarted(webView, str2, bitmap);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, int i10, String str2, String str3) {
                        String strMoa = com.bytedance.sdk.openadsdk.core.widget.uef.lw.moa(str3);
                        boolean z10 = false;
                        boolean z11 = strMoa != null && strMoa.startsWith("image");
                        if (strMoa != null && strMoa.startsWith("mp4")) {
                            z10 = true;
                        }
                        if (!z11 && !z10 && !ivmVar.yo()) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            uef.this.uef(i5, 4, gzwVar, str);
                        }
                        super.onReceivedError(webView, i10, str2, str3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (sslErrorHandler != null) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            uef.this.uef(i5, 4, gzwVar, str);
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                        try {
                            if (!z2) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            ivm ivmVar2 = ivmVar;
                            if (ivmVar2 != null) {
                                ivmVar2.uef++;
                            }
                            WebResourceResponseModel webResourceResponseModelUef = com.bytedance.sdk.openadsdk.xs.oa.uef().uef(com.bytedance.sdk.openadsdk.xs.oa.uef().oa(), gzwVar.vup(), str2);
                            if (webResourceResponseModelUef != null && webResourceResponseModelUef.getWebResourceResponse() != null) {
                                ivm ivmVar3 = ivmVar;
                                if (ivmVar3 != null) {
                                    ivmVar3.f24972oa++;
                                }
                                return webResourceResponseModelUef.getWebResourceResponse();
                            }
                            if (ivmVar != null && webResourceResponseModelUef != null && webResourceResponseModelUef.getMsg() == 2) {
                                ivmVar.yo++;
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable unused) {
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                        return super.shouldOverrideUrlLoading(webView, str2);
                    }
                };
                lwVar.uef(gzwVar);
                lwVar.uef(str);
                return lwVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 387
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.dz.uef.AnonymousClass3.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(int i5, int i10, gzw gzwVar, String str) {
        LinkedHashMap<Integer, SoftReference<ivm>> linkedHashMap = this.lw;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i5))) {
            this.lw.remove(Integer.valueOf(i5));
        }
        Handler handler = this.f25890oa;
        if (handler != null) {
            handler.removeMessages(i5);
        }
        uef(gzwVar, str, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(ivm ivmVar, String str) {
        if (ivmVar == null) {
            return;
        }
        yo.uef(sy.uef()).uef(false).oa(false).uef(ivmVar.getWebView());
        ivmVar.setMixedContentMode(0);
        com.bytedance.sdk.openadsdk.utils.gzw.uef(ivmVar, str);
    }

    public static void uef(gzw gzwVar, String str, final float f10, String str2) {
        com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, str, str2, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.dz.uef.4
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", f10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void uef(gzw gzwVar, final String str, final int i5) {
        com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.dz.uef.5
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i5);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }
}
