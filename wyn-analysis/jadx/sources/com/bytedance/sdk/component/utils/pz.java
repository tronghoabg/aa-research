package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.utils.gzw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class pz {
    private static final HashMap<String, uef> uef = new HashMap<>();

    public static WebView oa(Context context, AttributeSet attributeSet, int i5, ivm.yo yoVar) {
        return uef(context, attributeSet, i5, yoVar, true);
    }

    public static com.bytedance.sdk.component.cz.ivm uef(Context context, AttributeSet attributeSet, int i5, ivm.yo yoVar) {
        WebView webViewUef = uef(context, attributeSet, i5, yoVar, false);
        if (webViewUef == null) {
            return null;
        }
        com.bytedance.sdk.component.cz.ivm ivmVar = new com.bytedance.sdk.component.cz.ivm(context, true, yoVar);
        ivmVar.setWebView(webViewUef);
        ivmVar.lw();
        return ivmVar;
    }

    public static void oa(com.bytedance.sdk.component.cz.ivm ivmVar) {
        if (ivmVar == null) {
            return;
        }
        try {
            ivmVar.removeAllViews();
            ivmVar.xs();
            ivmVar.setWebChromeClient(null);
            ivmVar.setWebViewClient(null);
            ivmVar.setDownloadListener(null);
            ivmVar.setJavaScriptEnabled(true);
            ivmVar.setCacheMode(-1);
            ivmVar.setSupportZoom(false);
            ivmVar.setUseWideViewPort(true);
            ivmVar.setJavaScriptCanOpenWindowsAutomatically(true);
            ivmVar.setDomStorageEnabled(true);
            ivmVar.setBuiltInZoomControls(false);
            ivmVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            ivmVar.setLoadWithOverviewMode(false);
            ivmVar.setDefaultTextEncodingName("UTF-8");
            ivmVar.setDefaultFontSize(16);
            WebView webView = ivmVar.getWebView();
            if (webView instanceof com.bytedance.sdk.component.cz.lw) {
                ((com.bytedance.sdk.component.cz.lw) webView).uef();
            }
        } catch (Throwable unused) {
        }
    }

    private static WebView uef(Context context, AttributeSet attributeSet, int i5, ivm.yo yoVar, boolean z2) {
        WebView webViewOa;
        uef uefVar;
        if (yoVar == null || attributeSet != null || i5 != 0 || (uefVar = uef.get(yoVar.dz)) == null) {
            webViewOa = null;
        } else {
            webViewOa = uefVar.oa();
            if (webViewOa != null) {
                if (webViewOa instanceof com.bytedance.sdk.component.cz.lw) {
                    ((com.bytedance.sdk.component.cz.lw) webViewOa).setRecycler(false);
                }
                uef(yoVar, false);
            }
        }
        if (webViewOa != null || !z2) {
            return webViewOa;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        uef(yoVar, true);
        return i5 != 0 ? new com.bytedance.sdk.component.cz.lw(context, attributeSet, i5) : new com.bytedance.sdk.component.cz.lw(context, attributeSet);
    }

    public static class uef {
        private final String moa;

        /* renamed from: oa, reason: collision with root package name */
        public final int f25104oa;
        public final HashSet<String> uef = new HashSet<>();
        private final ArrayList<WebView> yo = new ArrayList<>();

        public uef(String str, JSONObject jSONObject) {
            this.moa = str;
            this.f25104oa = jSONObject.optInt("max_count");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("scene");
            if (jSONArrayOptJSONArray != null) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i5);
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.uef.add(strOptString);
                    }
                }
            }
        }

        public WebView oa() {
            if (this.yo.isEmpty()) {
                return null;
            }
            return this.yo.remove(0);
        }

        public boolean uef(WebView webView) {
            if (webView != null && this.yo.size() < this.f25104oa && !this.yo.contains(webView)) {
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    if (webView instanceof com.bytedance.sdk.component.cz.lw) {
                        ((com.bytedance.sdk.component.cz.lw) webView).setRecycler(true);
                    }
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(webView);
                    }
                    this.yo.add(webView);
                    return true;
                }
            }
            return false;
        }

        public int yo() {
            return this.yo.size();
        }

        public HashSet<String> uef() {
            return this.uef;
        }
    }

    private static void uef(final ivm.yo yoVar, final boolean z2) {
        gzw.uef("webview_allocate", new gzw.uef() { // from class: com.bytedance.sdk.component.utils.pz.1
            @Override // com.bytedance.sdk.component.utils.gzw.uef
            public JSONObject uef() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z2 ? 1 : 0);
                    jSONObject.put("scene", yoVar.dz);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void uef(com.bytedance.sdk.component.cz.ivm ivmVar) {
        WebView webView;
        if (ivmVar == null || (webView = ivmVar.getWebView()) == null) {
            return;
        }
        uef uefVar = uef.get(ivmVar.getScene().dz);
        if (uefVar != null && uefVar.uef(webView)) {
            oa(ivmVar);
        } else {
            uef(webView);
        }
    }

    public static boolean oa(ivm.yo yoVar) {
        return (yoVar == null || uef.get(yoVar.dz) == null) ? false : true;
    }

    private static void uef(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            Context context = webView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }

    public static void uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    uef uefVar = new uef(next, jSONObject.getJSONObject(next));
                    Iterator<String> it = uefVar.uef().iterator();
                    while (it.hasNext()) {
                        uef.put(it.next(), uefVar);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static int uef(ivm.yo yoVar) {
        uef uefVar;
        if (yoVar == null || (uefVar = uef.get(yoVar.dz)) == null) {
            return 0;
        }
        return uefVar.yo();
    }
}
