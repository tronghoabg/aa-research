package com.bytedance.sdk.openadsdk.core.zjm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.TypedValue;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.adexpress.moa.cz;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.dxx;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class dj extends com.bytedance.sdk.openadsdk.core.widget.uef.lw {
    private static final byte[] wrv = {-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 1, 0, 0, 0, 1, 8, 6, 0, 0, 0, 31, 21, -60, -119, 0, 0, 0, 10, 73, 68, 65, 84, 120, -100, 99, 96, 96, 96, 96, 0, 0, 0, 3, 0, 1, -2, 60, -79, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    private boolean dj;

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.model.gzw f25853oa;
    public ArrayList<Integer> uef;
    private com.bytedance.sdk.component.adexpress.oa.cq zjm;

    public dj(Context context, oyt oytVar, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, com.bytedance.sdk.openadsdk.moa.cq cqVar, com.bytedance.sdk.component.adexpress.oa.cq cqVar2) {
        super(context, oytVar, gzwVar.iou(), cqVar, false);
        this.dj = false;
        this.uef = new ArrayList<>();
        this.f25853oa = gzwVar;
        this.zjm = cqVar2;
        this.dj = com.bytedance.sdk.openadsdk.gzw.lw.uef("inject_data_normal_open", 0) == 1;
    }

    private WebResourceResponse lw() throws Resources.NotFoundException {
        InputStream inputStreamOpenRawResource;
        int iCz = com.bytedance.sdk.openadsdk.core.zjm.oa().cz();
        if (iCz == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.sy.uef().getResources();
        if (resources != null) {
            try {
                TypedValue typedValue = new TypedValue();
                resources.getValueForDensity(iCz, 0, typedValue, true);
                CharSequence charSequence = typedValue.string;
                inputStreamOpenRawResource = (charSequence == null || !charSequence.toString().endsWith(".xml")) ? resources.openRawResource(iCz) : new ByteArrayInputStream(wrv);
            } catch (Resources.NotFoundException e7) {
                com.bytedance.sdk.component.utils.dhk.yo("ExpressClient", e7.toString());
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource != null) {
            return new WebResourceResponse(cz.uef.IMAGE.uef(), "UTF-8", inputStreamOpenRawResource);
        }
        return null;
    }

    private WebResourceResponse moa(String str, cz.uef uefVar) {
        InputStream inputStreamOa;
        if (TextUtils.isEmpty(str) || (inputStreamOa = wk.oa(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(uefVar.uef(), "UTF-8", inputStreamOa);
        uef(webResourceResponse);
        return webResourceResponse;
    }

    private WebResourceResponse oa(String str, cz.uef uefVar, Map<String, String> map) {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.f25853oa;
        if (gzwVar != null && gzwVar.nj() != null) {
            File file = new File(CacheDirFactory.getICacheDir(this.f25853oa.wg()).uef(), str);
            if (file.exists() && file.length() > 0) {
                try {
                    return uef(file, uefVar, map);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.uef.oa.uef yo(String str, cz.uef uefVar) {
        dxx.uef uefVarIvm;
        JSONArray jSONArrayYo;
        dxx dxxVarAje = this.f25853oa.aje();
        if (dxxVarAje == null || (uefVarIvm = dxxVarAje.ivm()) == null || (jSONArrayYo = uefVarIvm.yo()) == null || jSONArrayYo.length() <= 0) {
            return null;
        }
        return uef(jSONArrayYo, str, uefVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.xs = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.bcc = false;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.component.adexpress.oa.cq cqVar = this.zjm;
        if (cqVar != null && cqVar.gzw() && this.dj) {
            com.bytedance.sdk.component.utils.dz.uef(webView, "javascript:window.SDK_INJECT_DATA=" + this.zjm.yo());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        com.bytedance.sdk.component.adexpress.uef.oa.uef uefVarUef;
        try {
            String string = webResourceRequest.getUrl().toString();
            cz.uef uefVarUef2 = com.bytedance.sdk.component.adexpress.moa.cz.uef(string);
            if (uefVarUef2 == cz.uef.VIDEO && com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(this.f25853oa) && com.bytedance.sdk.openadsdk.component.reward.yo.bcc.yo() && (uefVarUef = uef(string, uefVarUef2, webResourceRequest.getRequestHeaders())) != null && uefVarUef.uef() != null) {
                return uefVarUef.uef();
            }
            webResourceRequest.getUrl().toString();
            webResourceRequest.getRequestHeaders().get("Range");
            return shouldInterceptRequest(webView, string);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.uef("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public int uef() {
        Iterator<Integer> it = this.uef.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() == 3 || next.intValue() == 2 || next.intValue() == -1) {
                return next.intValue();
            }
        }
        return TextUtils.isEmpty(moa()) ? -1 : 1;
    }

    private String moa() {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.f25853oa;
        if (gzwVar == null) {
            return null;
        }
        if (gzwVar.vep() != null) {
            return this.f25853oa.vep().dj();
        }
        if (this.f25853oa.aje() != null) {
            return "v3";
        }
        return null;
    }

    private boolean oa(Map<String, String> map) {
        String str;
        return (map == null || map.isEmpty() || (str = map.get("Range")) == null || !str.startsWith("bytes=")) ? false : true;
    }

    private com.bytedance.sdk.component.adexpress.uef.oa.uef uef(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.sy syVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.equals("local://pag_open_icon_id") && !str.equals(com.bytedance.sdk.openadsdk.core.zjm.oa.yo.uef)) {
            gzw.uef uefVarVep = this.f25853oa.vep();
            if (uefVarVep != null && !TextUtils.isEmpty(str) && str.equals(uefVarVep.oa())) {
                com.bytedance.sdk.component.adexpress.uef.oa.uef uefVar = new com.bytedance.sdk.component.adexpress.uef.oa.uef();
                uefVar.uef(5);
                WebResourceResponse webResourceResponseLw = lw(str);
                uefVar.uef(webResourceResponseLw);
                com.bytedance.sdk.openadsdk.core.lw.uef.uef().uef(webResourceResponseLw != null);
                return uefVar;
            }
            cz.uef uefVarUef = com.bytedance.sdk.component.adexpress.moa.cz.uef(str);
            if (wk.oa(this.f25853oa)) {
                com.bytedance.sdk.component.adexpress.uef.oa.uef uefVarUef2 = uef(str, uefVarUef);
                if (uefVarUef2 != null) {
                    return uefVarUef2;
                }
                com.bytedance.sdk.component.adexpress.uef.oa.uef uefVarOa = oa(str, uefVarUef);
                if (uefVarOa != null) {
                    return uefVarOa;
                }
                com.bytedance.sdk.component.adexpress.uef.oa.uef uefVarYo = yo(str, uefVarUef);
                if (uefVarYo != null) {
                    return uefVarYo;
                }
            }
            if (uefVarUef != cz.uef.IMAGE) {
                Iterator<com.bytedance.sdk.openadsdk.core.model.sy> it = this.f25853oa.lpy().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.bytedance.sdk.openadsdk.core.model.sy next = it.next();
                    if (!TextUtils.isEmpty(next.uef()) && !TextUtils.isEmpty(str)) {
                        String strUef = next.uef();
                        if (strUef.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                            strUef = strUef.replaceFirst(HttpRequest.DEFAULT_SCHEME, "http");
                        }
                        if ((str.startsWith(HttpRequest.DEFAULT_SCHEME) ? str.replaceFirst(HttpRequest.DEFAULT_SCHEME, "http") : str).equals(strUef)) {
                            syVar = next;
                            break;
                        }
                    }
                }
            }
            if (uefVarUef != cz.uef.IMAGE && syVar == null) {
                return com.bytedance.sdk.component.adexpress.uef.oa.oa.uef(str, uefVarUef, "", moa());
            }
            com.bytedance.sdk.component.adexpress.uef.oa.uef uefVar2 = new com.bytedance.sdk.component.adexpress.uef.oa.uef();
            uefVar2.uef(5);
            uefVar2.uef(uef(str, com.bytedance.sdk.openadsdk.core.zjm.oa.yo.uef(this.f25853oa, str)));
            return uefVar2;
        }
        com.bytedance.sdk.component.adexpress.uef.oa.uef uefVar3 = new com.bytedance.sdk.component.adexpress.uef.oa.uef();
        uefVar3.uef(5);
        uefVar3.uef(lw());
        return uefVar3;
    }

    private WebResourceResponse lw(String str) {
        InputStream inputStreamUef;
        if (TextUtils.isEmpty(str) || (inputStreamUef = com.bytedance.sdk.openadsdk.core.lw.uef.uef().uef(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", "UTF-8", inputStreamUef);
        uef(webResourceResponse);
        return webResourceResponse;
    }

    private WebResourceResponse oa(File file, cz.uef uefVar, Map<String, String> map) {
        long j8;
        long j10;
        long[] jArrUef;
        long length = file.length();
        long j11 = length - 1;
        if (map == null || map.isEmpty() || (jArrUef = com.bytedance.sdk.openadsdk.core.zjm.oa.oa.uef(map.get("Range"), length)) == null || jArrUef.length != 2) {
            j8 = j11;
            j10 = 0;
        } else {
            j10 = jArrUef[0];
            j8 = jArrUef[1];
        }
        HashMap mapL = AbstractC1593a.l("Accept-Ranges", "bytes");
        mapL.put("Content-Range", String.format("bytes %d-%d/%d", Long.valueOf(j10), Long.valueOf(j8), Long.valueOf(length)));
        mapL.toString();
        WebResourceResponse webResourceResponse = new WebResourceResponse(null, null, null);
        if (webResourceResponse.getResponseHeaders() != null) {
            webResourceResponse.getResponseHeaders().clear();
        }
        webResourceResponse.setResponseHeaders(mapL);
        webResourceResponse.setStatusCodeAndReasonPhrase(Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE, "Partial Content");
        webResourceResponse.setMimeType(uefVar.uef());
        webResourceResponse.setEncoding("UTF-8");
        try {
            webResourceResponse.setData(new FileInputStream(file));
            return webResourceResponse;
        } catch (IOException e7) {
            e7.getMessage();
            return webResourceResponse;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            com.bytedance.sdk.component.adexpress.uef.oa.uef r0 = r8.uef(r9, r10)     // Catch: java.lang.Throwable -> L19
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1d
            android.webkit.WebResourceResponse r1 = r0.uef()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1d
            r1 = 1
        L15:
            r6 = r10
            r7 = r1
            r1 = r8
            goto L1f
        L19:
            r0 = move-exception
            r1 = r8
            r6 = r10
            goto L4b
        L1d:
            r1 = 2
            goto L15
        L1f:
            r1.uef(r2, r4, r6, r7)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3e
            int r10 = r0.oa()     // Catch: java.lang.Throwable -> L3c
            r2 = 5
            if (r10 == r2) goto L3e
            r0.oa()     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList<java.lang.Integer> r10 = r1.uef     // Catch: java.lang.Throwable -> L3c
            int r2 = r0.oa()     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3c
            r10.add(r2)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r0 = move-exception
            goto L4b
        L3e:
            if (r0 == 0) goto L52
            android.webkit.WebResourceResponse r10 = r0.uef()     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L52
            android.webkit.WebResourceResponse r9 = r0.uef()     // Catch: java.lang.Throwable -> L3c
            return r9
        L4b:
            java.lang.String r10 = "ExpressClient"
            java.lang.String r2 = "shouldInterceptRequest error2"
            com.bytedance.sdk.component.utils.dhk.uef(r10, r2, r0)
        L52:
            android.webkit.WebResourceResponse r9 = super.shouldInterceptRequest(r9, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.zjm.dj.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }

    private com.bytedance.sdk.component.adexpress.uef.oa.uef oa(String str, cz.uef uefVar) {
        dxx.uef uefVarIvm;
        JSONArray jSONArrayOa;
        dxx dxxVarAje = this.f25853oa.aje();
        if (dxxVarAje == null || (uefVarIvm = dxxVarAje.ivm()) == null || (jSONArrayOa = uefVarIvm.oa()) == null || jSONArrayOa.length() <= 0) {
            return null;
        }
        return uef(jSONArrayOa, str, uefVar);
    }

    private com.bytedance.sdk.component.adexpress.uef.oa.uef uef(String str, cz.uef uefVar, Map<String, String> map) {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.f25853oa;
        if (gzwVar == null || gzwVar.nj() == null || !TextUtils.equals(this.f25853oa.nj().dj(), str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.uef.oa.uef uefVar2 = new com.bytedance.sdk.component.adexpress.uef.oa.uef();
        uefVar2.uef(5);
        WebResourceResponse webResourceResponseOa = oa(this.f25853oa.nj().dz(), uefVar, map);
        if (webResourceResponseOa == null) {
            com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(0, str, this.f25853oa, map);
            return null;
        }
        uefVar2.uef(webResourceResponseOa);
        com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(1, str, this.f25853oa, map);
        return uefVar2;
    }

    private WebResourceResponse uef(File file, cz.uef uefVar, Map<String, String> map) {
        if (oa(map)) {
            return oa(file, uefVar, map);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            HashMap map2 = new HashMap();
            long length = file.length();
            map2.put("Accept-Ranges", "bytes");
            map2.put("Content-Range", String.format("bytes 0-%d/%d", Long.valueOf(length - 1), Long.valueOf(length)));
            WebResourceResponse webResourceResponse = new WebResourceResponse(null, null, null);
            webResourceResponse.setResponseHeaders(map);
            webResourceResponse.setEncoding("utf-8");
            webResourceResponse.setData(fileInputStream);
            webResourceResponse.setStatusCodeAndReasonPhrase(200, "OK");
            return webResourceResponse;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private com.bytedance.sdk.component.adexpress.uef.oa.uef uef(String str, cz.uef uefVar) {
        dxx.uef uefVarIvm;
        JSONArray jSONArrayUef;
        dxx dxxVarAje = this.f25853oa.aje();
        if (dxxVarAje != null && (uefVarIvm = dxxVarAje.ivm()) != null && (jSONArrayUef = uefVarIvm.uef()) != null && jSONArrayUef.length() > 0) {
            for (int i5 = 0; i5 < jSONArrayUef.length(); i5++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.cq.moa.uef(com.bytedance.sdk.openadsdk.core.settings.dj.oa().dhk(), jSONArrayUef.optString(i5)), str) && uefVar == cz.uef.IMAGE) {
                    com.bytedance.sdk.component.adexpress.uef.oa.uef uefVar2 = new com.bytedance.sdk.component.adexpress.uef.oa.uef();
                    uefVar2.uef(5);
                    uefVar2.uef(uef(str, com.bytedance.sdk.component.utils.lw.uef(str)));
                    return uefVar2;
                }
            }
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.uef.oa.uef uef(JSONArray jSONArray, String str, cz.uef uefVar) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.cq.moa.uef(com.bytedance.sdk.openadsdk.core.settings.dj.oa().dhk(), jSONArray.optString(i5)), str)) {
                    com.bytedance.sdk.component.adexpress.uef.oa.uef uefVar2 = new com.bytedance.sdk.component.adexpress.uef.oa.uef();
                    uefVar2.uef(5);
                    uefVar2.uef(moa(str, uefVar));
                    return uefVar2;
                }
            }
        }
        return null;
    }

    private WebResourceResponse uef(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamUef = com.bytedance.sdk.openadsdk.zjm.moa.uef(str, str2);
            if (inputStreamUef == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(cz.uef.IMAGE.uef(), "utf-8", inputStreamUef);
            try {
                uef(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th) {
                th = th;
                webResourceResponse = webResourceResponse2;
                com.bytedance.sdk.component.utils.dhk.uef("ExpressClient", "get image WebResourceResponse error", th);
                return webResourceResponse;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void uef(long j8, long j10, String str, int i5) {
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.ivm;
        if (cqVar == null || cqVar.oa() == null) {
            return;
        }
        cz.uef uefVarUef = com.bytedance.sdk.component.adexpress.moa.cz.uef(str);
        if (uefVarUef == cz.uef.HTML) {
            this.ivm.oa().uef(str, j8, j10, i5);
        } else if (uefVarUef == cz.uef.JS) {
            this.ivm.oa().oa(str, j8, j10, i5);
        }
    }

    private void uef(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Access-Control-Allow-Origin", "*");
        webResourceResponse.setResponseHeaders(map);
    }
}
