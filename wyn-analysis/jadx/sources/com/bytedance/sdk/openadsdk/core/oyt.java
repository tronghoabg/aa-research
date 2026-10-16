package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.ab;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.moa.uef;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.unity3d.services.UnityAdsConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.DublinCore;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oyt implements com.bytedance.sdk.component.adexpress.lw.oa, ue.uef, com.bytedance.sdk.openadsdk.dj.oa {
    private static final Map<String, Boolean> bcc;
    private com.bytedance.sdk.openadsdk.core.wk.moa.oa au;
    private com.bytedance.sdk.openadsdk.core.model.gzw bs;
    private Context cop;
    private int cq;
    private com.bytedance.sdk.openadsdk.dj.yo cz;
    private com.bytedance.sdk.openadsdk.core.zjm.ab dhk;
    private WeakReference<View> dj;
    private Activity dor;
    private com.bytedance.sdk.openadsdk.component.reward.yo.moa dv;
    private String dz;
    private com.bytedance.sdk.openadsdk.component.reward.yo.ivm etd;
    private String gb;
    private boolean gem;
    private com.bytedance.sdk.openadsdk.core.yo.moa gr;
    private com.bytedance.sdk.openadsdk.cq.lw gsd;
    private com.bytedance.sdk.openadsdk.cq.uef gzw;
    private yo hts;
    private String ivm;
    private com.bytedance.sdk.component.uef.wk km;
    private HashMap<String, dj> ku;
    private WeakReference<com.bytedance.sdk.component.cz.ivm> moa;
    private uef nkh;
    private com.bytedance.sdk.component.adexpress.oa.dj oib;
    private com.bytedance.sdk.openadsdk.dj.moa orq;
    private com.bytedance.sdk.openadsdk.moa.moa.lw oyt;
    private com.bytedance.sdk.openadsdk.cq.oa pu;
    private com.bytedance.sdk.openadsdk.cq.dj pz;
    private com.bytedance.sdk.openadsdk.component.reward.yo.cz rj;
    private com.bytedance.sdk.openadsdk.cq.bcc rl;
    private JSONObject rt;
    private com.bytedance.sdk.openadsdk.core.widget.uef.uef sk;
    private boolean swd;
    private JSONObject sy;
    private JSONObject tpx;

    /* renamed from: ue, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.cq.yo f25727ue;
    protected Map<String, Object> uef;
    private com.bytedance.sdk.openadsdk.component.reward.yo.uef uqx;
    private int wk;
    private String wrv;
    private com.bytedance.sdk.openadsdk.core.widget.lw xs;
    private String zjm;
    private ue zou;

    /* renamed from: ab, reason: collision with root package name */
    private boolean f25725ab = true;
    private boolean cp = true;
    private boolean fz = false;
    private boolean dxx = false;
    private boolean lz = false;

    /* renamed from: oa, reason: collision with root package name */
    boolean f25726oa = false;
    boolean yo = false;
    private boolean af = false;
    private final com.bytedance.sdk.component.utils.ue lw = new com.bytedance.sdk.component.utils.ue(Looper.getMainLooper(), this);

    public static class oa {
        public int lw;
        public JSONObject moa;

        /* renamed from: oa, reason: collision with root package name */
        public String f25736oa;
        public String uef;
        public String yo;
    }

    public interface uef {
        void uef();
    }

    public static class yo implements Runnable {

        /* renamed from: oa, reason: collision with root package name */
        private final JSONObject f25737oa;
        private final com.bytedance.sdk.openadsdk.core.zjm.ab uef;

        public yo(com.bytedance.sdk.openadsdk.core.zjm.ab abVar, JSONObject jSONObject) {
            this.uef = abVar;
            this.f25737oa = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            oyt.oa(this.uef, this.f25737oa);
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        bcc = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public oyt(Context context) {
        this.cop = context;
    }

    private void ab(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.cq.yo yoVar = this.f25727ue;
        if (yoVar == null || jSONObject == null) {
            return;
        }
        yoVar.uef(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString("msg", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs(JSONObject jSONObject) {
        if (this.dhk == null || jSONObject == null) {
            return;
        }
        try {
            this.dhk.uef(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    private void cp() {
        if (this.cop == null || TextUtils.isEmpty(sy.moa().swd())) {
            return;
        }
        TTWebsiteActivity.uef(this.cop, this.bs, this.gb);
    }

    private void cq(JSONObject jSONObject) throws Exception {
        uef(jSONObject, this.bs);
    }

    private boolean dhk(JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    private void dxx() {
        if (this.cz == null) {
            this.cz = com.bytedance.sdk.openadsdk.dj.uef.uef(this, this.bs);
        }
    }

    private void dz(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.cp.zjm(this.bs))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.cp.zjm(this.bs));
    }

    private boolean fz() {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.bs;
        if (gzwVar == null || gzwVar.kn() == null || com.bytedance.sdk.openadsdk.core.model.cp.oa(this.bs) || this.fz || this.bs.kn().optInt("parent_type") != 2) {
            return false;
        }
        int iDqw = this.bs.dqw();
        if (iDqw != 8 && iDqw != 7) {
            return false;
        }
        this.fz = true;
        return true;
    }

    private void gr() {
        com.bytedance.sdk.openadsdk.cq.dj djVar = this.pz;
        if (djVar == null) {
            return;
        }
        djVar.uef();
    }

    private static List<String> gsd() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    private JSONObject gzw() {
        WeakReference<View> weakReference;
        try {
            weakReference = this.dj;
        } catch (Throwable unused) {
        }
        if (weakReference == null) {
            return null;
        }
        View view = weakReference.get();
        com.bytedance.sdk.component.cz.ivm ivmVar = this.moa.get();
        if (view != null && ivmVar != null) {
            int[] iArrOa = com.bytedance.sdk.openadsdk.utils.af.oa(view);
            int[] iArrOa2 = com.bytedance.sdk.openadsdk.utils.af.oa((View) ivmVar);
            if (iArrOa != null && iArrOa2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", com.bytedance.sdk.openadsdk.utils.af.yo(sy.uef(), iArrOa[0] - iArrOa2[0]));
                jSONObject.put("y", com.bytedance.sdk.openadsdk.utils.af.yo(sy.uef(), iArrOa[1] - iArrOa2[1]));
                jSONObject.put(OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, com.bytedance.sdk.openadsdk.utils.af.yo(sy.uef(), view.getWidth()));
                jSONObject.put("h", com.bytedance.sdk.openadsdk.utils.af.yo(sy.uef(), view.getHeight()));
                jSONObject.put("isExist", true);
                return jSONObject;
            }
        }
        return null;
    }

    private JSONObject ku() {
        return oa(this.bs);
    }

    private void oib(JSONObject jSONObject) {
        int i5;
        String strOptString;
        double dOptDouble;
        double dOptDouble2;
        boolean z2;
        double d3;
        double d5;
        int i10;
        String strOptString2;
        if (this.oib == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.oyt;
        if (lwVar != null) {
            lwVar.wk();
        }
        com.bytedance.sdk.component.adexpress.oa.dz dzVar = new com.bytedance.sdk.component.adexpress.oa.dz();
        dzVar.uef(1);
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isRenderSuc");
            strOptString = jSONObject.optString("engineType");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("AdSize");
            if (jSONObjectOptJSONObject != null) {
                dOptDouble = jSONObjectOptJSONObject.optDouble("width");
                dOptDouble2 = jSONObjectOptJSONObject.optDouble("height");
            } else {
                dOptDouble = 0.0d;
                dOptDouble2 = 0.0d;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject2 != null) {
                double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("x");
                z2 = zOptBoolean;
                i10 = 101;
                try {
                    double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("y");
                    d5 = dOptDouble2;
                    double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("width");
                    double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("height");
                    if (dhk(jSONObjectOptJSONObject2)) {
                        d3 = dOptDouble;
                        dzVar.uef((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopLeft"));
                        dzVar.oa((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopRight"));
                        dzVar.yo((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomLeft"));
                        dzVar.moa((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomRight"));
                    } else {
                        d3 = dOptDouble;
                    }
                    dzVar.yo(dOptDouble3);
                    dzVar.moa(dOptDouble4);
                    dzVar.lw(dOptDouble5);
                    dzVar.ivm(dOptDouble6);
                } catch (Exception unused) {
                    i5 = 101;
                    dzVar.oa(i5);
                    dzVar.uef(cz.uef(i5));
                    this.oib.uef(dzVar);
                }
            } else {
                z2 = zOptBoolean;
                d3 = dOptDouble;
                d5 = dOptDouble2;
                i10 = 101;
            }
            strOptString2 = jSONObject.optString("msg", cz.uef(i10));
            i5 = i10;
        } catch (Exception unused2) {
            i5 = 101;
        }
        try {
            int iOptInt = jSONObject.optInt("code", i5);
            dzVar.uef(z2);
            dzVar.uef(d3);
            dzVar.oa(d5);
            dzVar.uef(strOptString2);
            dzVar.oa(iOptInt);
            dzVar.oa(strOptString);
            this.oib.uef(dzVar);
        } catch (Exception unused3) {
            dzVar.oa(i5);
            dzVar.uef(cz.uef(i5));
            this.oib.uef(dzVar);
        }
    }

    private WebView orq() {
        com.bytedance.sdk.component.cz.ivm ivmVar;
        WeakReference<com.bytedance.sdk.component.cz.ivm> weakReference = this.moa;
        if (weakReference == null || (ivmVar = weakReference.get()) == null) {
            return null;
        }
        return ivmVar.getWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pz() {
        com.bytedance.sdk.openadsdk.core.zjm.ab abVar = this.dhk;
        if (abVar != null) {
            abVar.uef();
        }
    }

    private Context rt() {
        WeakReference<com.bytedance.sdk.component.cz.ivm> weakReference = this.moa;
        Activity activityUef = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.oa.uef(this.moa.get());
        return activityUef == null ? this.cop : activityUef;
    }

    private boolean sy(JSONObject jSONObject) throws JSONException {
        com.bytedance.sdk.openadsdk.core.zjm.ab abVar = this.dhk;
        if (abVar != null && jSONObject != null) {
            double dYo = abVar.yo();
            double dMoa = this.dhk.moa();
            int iLw = this.dhk.lw();
            com.bytedance.sdk.component.utils.dhk.uef("TTAD.TopLayoutHelper", "current:", Double.valueOf(dYo), "state", Integer.valueOf(iLw), "countdownTime", Double.valueOf(dMoa));
            try {
                jSONObject.put("currentTime", dYo / 1000.0d);
                if (dMoa > 0.0d) {
                    jSONObject.put("countDownTime", dMoa / 1000.0d);
                }
                jSONObject.put("state", iLw);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private void tpx(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri uri = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(uri.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.dhk.uef(uri, this);
            }
        } catch (Exception unused) {
        }
    }

    private void ue() {
        com.bytedance.sdk.openadsdk.cq.dj djVar = this.pz;
        if (djVar == null) {
            return;
        }
        djVar.oa();
    }

    private void wk(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar;
        if (jSONObject == null || (lwVar = this.oyt) == null) {
            return;
        }
        lwVar.oa(jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            cq(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            oa(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public void bcc() {
        com.bytedance.sdk.openadsdk.core.zjm.ab abVar = this.dhk;
        if (abVar != null) {
            abVar.oa();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.oyt.3
                @Override // java.lang.Runnable
                public void run() {
                    oyt.this.bs(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.oyt.4
                @Override // java.lang.Runnable
                public void run() {
                    oyt.this.lw(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    public boolean cz() {
        return this.af;
    }

    public void dj() {
        fz();
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            tpx(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public String getCurrentVideoState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        sy(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.tpx.toString();
        }
        try {
            JSONObject jSONObjectUef = com.bytedance.sdk.openadsdk.core.zjm.oa.yo.uef(this.tpx, new JSONObject(str));
            return jSONObjectUef == null ? this.tpx.toString() : jSONObjectUef.toString();
        } catch (Exception unused) {
            return this.tpx.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public String getTemplateInfo() throws JSONException {
        uef("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.tpx;
            if (jSONObject != null) {
                jSONObject.put("setting", ku());
                com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.bs;
                if (gzwVar != null && gzwVar.rwy() != null) {
                    this.tpx.put("dynamic_configs", this.bs.rwy());
                }
                com.bytedance.sdk.openadsdk.core.model.gzw gzwVar2 = this.bs;
                if (gzwVar2 != null) {
                    this.tpx.put("extension", gzwVar2.ht());
                }
            }
            uef("getTemplateInfo", false);
            return this.tpx.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.oyt.6
            @Override // java.lang.Runnable
            public void run() {
                if (oyt.this.sk != null) {
                    oyt.this.sk.uef();
                }
            }
        });
    }

    public boolean ivm() {
        return this.f25726oa;
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            yo yoVar = this.hts;
            if (yoVar != null) {
                com.bytedance.sdk.openadsdk.utils.km.oa(yoVar);
            }
            yo yoVar2 = new yo(this.dhk, jSONObject);
            this.hts = yoVar2;
            com.bytedance.sdk.openadsdk.utils.km.uef(yoVar2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.AndroidObject", "");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            oib(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.oyt.5
            @Override // java.lang.Runnable
            public void run() {
                oyt.this.pz();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    @JavascriptInterface
    public void videoFrameChanged(String str) {
        if (this.rl == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.component.adexpress.oa.dz dzVar = new com.bytedance.sdk.component.adexpress.oa.dz();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject != null) {
                double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
                double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
                double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
                double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
                if (dhk(jSONObjectOptJSONObject)) {
                    dzVar.uef((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopLeft"));
                    dzVar.oa((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopRight"));
                    dzVar.yo((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomLeft"));
                    dzVar.moa((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomRight"));
                }
                dzVar.yo(dOptDouble);
                dzVar.moa(dOptDouble2);
                dzVar.lw(dOptDouble3);
                dzVar.ivm(dOptDouble4);
            }
            com.bytedance.sdk.openadsdk.cq.bcc bccVar = this.rl;
            if (bccVar != null) {
                bccVar.uef(dzVar);
            }
        } catch (Throwable unused) {
        }
    }

    public void wrv() {
        com.bytedance.sdk.openadsdk.dj.yo yoVar = this.cz;
        if (yoVar != null) {
            yoVar.uef();
        }
        yo yoVar2 = this.hts;
        if (yoVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.km.oa(yoVar2);
            this.hts = null;
        }
        this.cop = null;
        this.au = null;
    }

    public void xs() {
        com.bytedance.sdk.openadsdk.cq.yo yoVar;
        if (this.gem && (yoVar = this.f25727ue) != null) {
            yoVar.uef();
            return;
        }
        Context context = this.cop;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.gsd.uef((Activity) context)) {
            ((Activity) this.cop).finish();
        }
        Activity activity = this.dor;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.dor.finish();
    }

    public boolean zjm() {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.bs;
        return gzwVar != null && gzwVar.uf() == 1;
    }

    private void cz(String str) {
        int iIndexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView webViewOrq = orq();
                    if (webViewOrq != null) {
                        com.bytedance.sdk.component.utils.dz.uef(webViewOrq, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (str.startsWith("bytedance://private/setresult/") && (iIndexOf = str.indexOf(38, 30)) > 0) {
                    String strSubstring = str.substring(30, iIndexOf);
                    String strSubstring2 = str.substring(iIndexOf + 1);
                    if (!strSubstring.equals("SCENE_FETCHQUEUE") || strSubstring2.length() <= 0) {
                        return;
                    }
                    xs(strSubstring2);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject gsd(JSONObject jSONObject) throws JSONException {
        if (this.uef != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String strOptString = jSONObject.optString("ad_extra_data", null);
                if (strOptString != null) {
                    jSONObject2 = new JSONObject(strOptString);
                }
                for (Map.Entry<String, Object> entry : this.uef.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e7) {
                com.bytedance.sdk.component.utils.dhk.yo(e7.toString(), new Object[0]);
            }
        }
        return jSONObject;
    }

    public void cq() {
        uef uefVar = this.nkh;
        if (uefVar != null) {
            uefVar.uef();
        }
    }

    public void dj(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        ue ueVar = this.zou;
        if (ueVar != null) {
            if (iOptInt == 1) {
                ueVar.q_();
            } else if (iOptInt == 2) {
                ueVar.r_();
            }
        }
    }

    public void ivm(String str) {
        this.gb = str;
    }

    public boolean lw() {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.bs;
        return gzwVar != null && gzwVar.xvp();
    }

    public com.bytedance.sdk.openadsdk.core.model.gzw moa() {
        return this.bs;
    }

    public oyt yo(String str) {
        this.zjm = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bcc(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return zjm();
        }
        return true;
    }

    public void ab() {
        ue ueVar = this.zou;
        if (ueVar != null) {
            ueVar.o_();
        }
    }

    public com.bytedance.sdk.openadsdk.core.wk.moa.oa dz() {
        return this.au;
    }

    public void ivm(JSONObject jSONObject) throws JSONException {
        boolean z2 = false;
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVarUef = com.bytedance.sdk.openadsdk.core.oa.uef(jSONObject, null, null, null, 0);
        if (gzwVarUef != null) {
            boolean zXs = com.bytedance.sdk.openadsdk.core.model.dhk.xs(this.bs);
            String strOa = zXs ? com.bytedance.sdk.openadsdk.utils.gb.oa(this.cq) : this.gb;
            if (!com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(gzwVarUef) && !zXs) {
                z2 = true;
            }
            uef(gzwVarUef, strOa, z2);
        }
    }

    public oyt lw(String str) {
        this.dz = str;
        return this;
    }

    public oyt moa(String str) {
        this.wrv = str;
        return this;
    }

    public void wk() {
        ue ueVar = this.zou;
        if (ueVar != null) {
            ueVar.n_();
        }
    }

    public void yo() {
        com.bytedance.sdk.component.uef.wk wkVar = this.km;
        if (wkVar == null) {
            return;
        }
        wkVar.uef();
        this.km = null;
    }

    public void zjm(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.uef uefVarMoa;
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.bs;
        if (gzwVar == null || (uefVarMoa = gzwVar.moa()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.gzw> listLw = uefVarMoa.lw();
        if (iOptInt < 0 || iOptInt >= listLw.size()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar2 = listLw.get(iOptInt);
        gzwVar2.zou(iOptInt);
        uef(gzwVar2, this.gb, false);
        com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar = this.au;
        if (oaVar != null) {
            oaVar.hts();
        }
        com.bytedance.sdk.openadsdk.component.reward.yo.uef uefVar = this.uqx;
        if (uefVar != null) {
            uefVar.uef();
        }
    }

    private void orq(JSONObject jSONObject) {
        if (jSONObject == null || this.orq == null) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                this.orq.uef(true, jSONArrayOptJSONArray);
            } else {
                this.orq.uef(false, null);
            }
        } catch (Exception unused) {
            this.orq.uef(false, null);
        }
    }

    public JSONObject bs() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            ue ueVar = this.zou;
            if (ueVar != null) {
                jSONObject.put("leftTime", ueVar.p_());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void lw(JSONObject jSONObject) {
        double d3;
        double dOptDouble;
        double d5;
        double d10;
        double d11;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.utils.dhk.uef("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String strOptString = jSONObject.optString("adId");
            int iOptInt = jSONObject.optInt("areaType", 1);
            String strOptString2 = jSONObject.optString("clickAreaType");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("clickInfo");
            int iOptInt2 = 0;
            double d12 = 0.0d;
            if (jSONObjectOptJSONObject2 != null) {
                double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("down_x", 0.0d);
                dOptDouble = jSONObjectOptJSONObject2.optDouble("down_y", 0.0d);
                double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("up_x", 0.0d);
                double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("up_y", 0.0d);
                double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("down_time", 0.0d);
                double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("up_time", 0.0d);
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("rectInfo");
                iOptInt2 = jSONObjectOptJSONObject2.optInt("duration", 0);
                d11 = dOptDouble6;
                d12 = dOptDouble2;
                d3 = dOptDouble3;
                d5 = dOptDouble4;
                d10 = dOptDouble5;
            } else {
                d3 = 0.0d;
                dOptDouble = 0.0d;
                d5 = 0.0d;
                d10 = 0.0d;
                d11 = 0.0d;
                jSONObjectOptJSONObject = null;
            }
            com.bytedance.sdk.openadsdk.core.model.ab abVarUef = new ab.uef().moa((float) d12).yo((float) dOptDouble).oa((float) d3).uef((float) d5).oa((long) d10).uef((long) d11).uef(strOptString2).uef((SparseArray<yo.uef>) null).uef(true).moa(iOptInt2).oa(iOptInt).uef(jSONObjectOptJSONObject).uef(jSONObject.optInt("clickAreaCategory", -1)).oa(jSONObjectOptJSONObject2).oa(jSONObject.optString("dislike_source")).uef();
            com.bytedance.sdk.component.adexpress.oa.dj djVar = this.oib;
            if (djVar != null) {
                djVar.uef(null, iOptInt, abVarUef);
            }
            uef(strOptString, iOptInt, abVarUef);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.oa.dj djVar2 = this.oib;
            if (djVar2 != null) {
                djVar2.uef(null, -1, null);
            }
        }
    }

    public void moa(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("zoom_type", 1);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
        com.bytedance.sdk.component.adexpress.oa.dz dzVar = new com.bytedance.sdk.component.adexpress.oa.dz();
        if (jSONObjectOptJSONObject != null) {
            double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
            double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
            double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
            dzVar.yo(dOptDouble);
            dzVar.moa(dOptDouble2);
            dzVar.lw(dOptDouble3);
            dzVar.ivm(dOptDouble4);
        }
        com.bytedance.sdk.openadsdk.core.zjm.ab abVar = this.dhk;
        if (abVar != null) {
            abVar.uef(iOptInt, dzVar);
        }
    }

    public oyt oa(String str) {
        this.ivm = str;
        return this;
    }

    public void dhk() {
        try {
            uef("requestHeartBeat", new JSONObject());
        } catch (Exception e7) {
            Log.e("TTAD.AndroidObject", "", e7);
        }
    }

    public com.bytedance.sdk.component.uef.wk oa() {
        return this.km;
    }

    public JSONObject bcc(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.zjm.ab abVar = this.dhk;
        if (abVar != null) {
            try {
                jSONObject2.put("state", abVar.uef(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public oyt oa(com.bytedance.sdk.component.cz.ivm ivmVar) {
        this.moa = new WeakReference<>(ivmVar);
        return this;
    }

    public void tpx() {
        com.bytedance.sdk.openadsdk.component.reward.yo.moa moaVar = this.dv;
        if (moaVar != null) {
            moaVar.uef();
        }
    }

    public void yo(JSONObject jSONObject) {
        oib.uef(rt(), this.cop instanceof Activity, jSONObject, this.bs, this.gb, this.cq, orq(), this.xs);
    }

    private void xs(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i5 = 0; i5 < length; i5++) {
                oa oaVar = new oa();
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                    if (jSONObjectOptJSONObject != null) {
                        oaVar.uef = jSONObjectOptJSONObject.optString("__msg_type", null);
                        oaVar.f25736oa = jSONObjectOptJSONObject.optString("__callback_id", null);
                        oaVar.yo = jSONObjectOptJSONObject.optString("func");
                        oaVar.moa = jSONObjectOptJSONObject.optJSONObject("params");
                        oaVar.lw = jSONObjectOptJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(oaVar.uef) && !TextUtils.isEmpty(oaVar.yo)) {
                    Message messageObtainMessage = this.lw.obtainMessage(11);
                    messageObtainMessage.obj = oaVar;
                    this.lw.sendMessage(messageObtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public oyt oa(boolean z2) {
        this.lz = z2;
        return this;
    }

    public void ivm(boolean z2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z2);
            uef("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public oyt oa(int i5) {
        this.cq = i5;
        return this;
    }

    public oyt uef(com.bytedance.sdk.openadsdk.core.widget.uef.uef uefVar) {
        this.sk = uefVar;
        return this;
    }

    public void wrv(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.uef(new com.bytedance.sdk.component.bcc.oa.yo("sendLogV3") { // from class: com.bytedance.sdk.openadsdk.core.oyt.2
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extJson");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("category") && jSONObjectOptJSONObject.has("tag") && jSONObjectOptJSONObject.has("label")) {
                    String strOptString = jSONObjectOptJSONObject.optString("category");
                    String strOptString2 = jSONObjectOptJSONObject.optString("tag");
                    String strOptString3 = jSONObjectOptJSONObject.optString("label");
                    long jOptLong = jSONObject.optLong(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                    long jOptLong2 = jSONObject.optLong("extValue");
                    try {
                        jSONObjectOptJSONObject.put("ua_policy", oyt.this.wk);
                    } catch (Exception unused) {
                    }
                    if (!TextUtils.isEmpty(cq.uef(sy.uef())) && TextUtils.equals(strOptString3, "click") && oyt.this.bs != null) {
                        com.bytedance.sdk.openadsdk.moa.uef.oa.uef(com.bytedance.sdk.openadsdk.gsd.uef.uef(oyt.this.bs.uxr(), true), 2, oyt.this.bs.iou());
                    }
                    new uef.C0127uef(System.currentTimeMillis(), oyt.this.bs).moa(strOptString).oa(strOptString2).yo(strOptString3).uef(oyt.this.bs == null ? "" : oyt.this.bs.m167try()).uef(oyt.this.bs == null ? null : oyt.this.bs.nau()).lw(String.valueOf(jOptLong)).bcc(oyt.this.bs == null ? "" : oyt.this.bs.au()).xs(oyt.this.bs != null ? oyt.this.bs.ofp() : "").ivm(String.valueOf(jOptLong2)).uef(jSONObjectOptJSONObject).uef((com.bytedance.sdk.openadsdk.moa.oa.uef) null);
                }
            }
        });
    }

    public static void oa(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = gsd().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.yo.uef());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.yo.xs());
        jSONObject.put("aid", com.bytedance.sdk.openadsdk.common.yo.oa());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.yo.yo());
        jSONObject.put("formatSdkEdition", com.bytedance.sdk.openadsdk.common.yo.moa());
        jSONObject.put("fullSdkEdition", com.bytedance.sdk.openadsdk.common.yo.lw());
        jSONObject.put("appVersion", com.bytedance.sdk.openadsdk.common.yo.ivm());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.yo.bcc());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.yo.uef(sy.uef()));
        Object obj = Build.VERSION.RELEASE;
        jSONObject.put("os_version", obj);
        if (DeviceUtils.oa(sy.uef())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", "Android");
        }
        jSONObject.put("device_type", obj);
    }

    public void sy() {
        ue ueVar = this.zou;
        if (ueVar != null) {
            ueVar.s_();
        }
    }

    public oyt uef(com.bytedance.sdk.openadsdk.core.widget.lw lwVar) {
        this.xs = lwVar;
        return this;
    }

    public com.bytedance.sdk.openadsdk.cq.oa uef() {
        return this.pu;
    }

    public void uef(com.bytedance.sdk.openadsdk.cq.oa oaVar) {
        this.pu = oaVar;
    }

    public void yo(boolean z2) {
        this.f25726oa = z2;
    }

    private void gzw(JSONObject jSONObject) {
        WebView webViewOrq;
        if (jSONObject == null || (webViewOrq = orq()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.dz.uef(webViewOrq, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    private void yo(String str, JSONObject jSONObject) throws JSONException {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "event");
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            gzw(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public oyt uef(com.bytedance.sdk.component.cz.ivm ivmVar) {
        WebView webView;
        if (ivmVar != null && (webView = ivmVar.getWebView()) != null) {
            try {
                this.km = com.bytedance.sdk.component.uef.wk.uef(webView).uef(new com.bytedance.sdk.openadsdk.wrv.uef()).uef("ToutiaoJSBridge").uef(new com.bytedance.sdk.component.uef.zjm() { // from class: com.bytedance.sdk.openadsdk.core.oyt.1
                    @Override // com.bytedance.sdk.component.uef.zjm
                    public <T> T uef(String str, Type type) {
                        return null;
                    }

                    @Override // com.bytedance.sdk.component.uef.zjm
                    public <T> String uef(T t10) {
                        return null;
                    }
                }).uef(zjm.oa().wk()).oa(true).uef();
                if (com.bytedance.sdk.openadsdk.gzw.lw.xs()) {
                    com.bytedance.sdk.openadsdk.wrv.uef.bcc.uef(this.km, this);
                    com.bytedance.sdk.openadsdk.wrv.uef.zjm.uef(this.km, this);
                    com.bytedance.sdk.openadsdk.wrv.uef.orq.uef(this.km, ivmVar, this, this.bs);
                } else {
                    com.bytedance.sdk.openadsdk.wrv.uef.xs.uef(this.km, this);
                    com.bytedance.sdk.openadsdk.wrv.uef.cz.uef(this.km, this);
                    com.bytedance.sdk.openadsdk.wrv.uef.tpx.uef(this.km, ivmVar, this, this.bs);
                }
                com.bytedance.sdk.openadsdk.wrv.uef.uef.uef(this.km, this);
                com.bytedance.sdk.openadsdk.wrv.uef.oa.uef(this.km, this);
                com.bytedance.sdk.openadsdk.wrv.uef.yo.uef(this.km, this);
                com.bytedance.sdk.openadsdk.wrv.uef.ivm.uef(this.km, this);
                com.bytedance.sdk.openadsdk.wrv.uef.dj.uef(this.km, this);
                com.bytedance.sdk.openadsdk.wrv.uef.ab.uef(this.km, this);
                com.bytedance.sdk.openadsdk.wrv.uef.cq.uef(this.km, ivmVar);
                com.bytedance.sdk.openadsdk.wrv.uef.lw.uef(this.km, this.tpx);
                com.bytedance.sdk.openadsdk.wrv.uef.moa.uef(this.km, this);
                com.bytedance.sdk.openadsdk.wrv.uef.wk.uef(this.km, this, this.bs);
                com.bytedance.sdk.openadsdk.wrv.uef.bs.uef(this.km, this);
                com.bytedance.sdk.openadsdk.wrv.uef.sy.uef(this.km, this);
                com.bytedance.sdk.openadsdk.wrv.uef.wrv.uef(this.km, this);
                com.bytedance.sdk.openadsdk.wrv.uef.dhk.uef(this.km, this.bs);
                com.bytedance.sdk.openadsdk.wrv.uef.dz.uef(this.km, this);
                com.bytedance.sdk.openadsdk.wrv.uef.oib.uef(this.km, this, this.bs);
            } catch (Exception unused) {
            }
        }
        return this;
    }

    public JSONObject cz(JSONObject jSONObject) throws JSONException {
        List<com.bytedance.sdk.openadsdk.core.model.gzw> listZou;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar = this.au;
            if (oaVar != null && (listZou = oaVar.zou()) != null) {
                for (int i5 = 0; i5 < listZou.size(); i5++) {
                    jSONArray.put(yo(listZou.get(i5)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void moa(boolean z2) {
        this.swd = z2;
    }

    public void moa(int i5) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netType", i5);
            uef("netTypeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void yo(int i5) {
        com.bytedance.sdk.openadsdk.core.zjm.ab abVar = this.dhk;
        if (abVar != null) {
            abVar.oa(i5);
        }
    }

    private JSONObject yo(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_ad_event", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        jSONObject2.put("cid", gzwVar.au());
        jSONObject2.put("req_id", gzwVar.ofp());
        jSONObject2.put("ad_id", gzwVar.iou());
        jSONObject2.put("log_extra", gzwVar.em());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.dj.oa().vj());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", gzwVar.dor());
        jSONObject.put("dynamic_creative", gzwVar.lo());
        jSONObject.put("title", gzwVar.xw());
        com.bytedance.sdk.openadsdk.core.model.gzw.uef(gzwVar, jSONObject);
        com.bytedance.sdk.openadsdk.core.model.gzw.oa(gzwVar, jSONObject);
        jSONObject.put("source", gzwVar.jp());
        jSONObject.put("button_text", gzwVar.up());
        com.bytedance.sdk.openadsdk.core.model.cq cqVarAgr = gzwVar.agr();
        if (cqVarAgr != null) {
            jSONObject.put("deeplink_url", cqVarAgr.uef());
        }
        jSONObject.put("app_name", gzwVar.wf());
        jSONObject.put("has_show", gzwVar.swd() ? 1 : 0);
        jSONObject.put("has_click", gzwVar.vxo() ? 1 : 0);
        return jSONObject;
    }

    public JSONObject xs(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.zjm.ab abVar = this.dhk;
        if (abVar != null) {
            try {
                jSONObject2.put("state", abVar.oa(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public void xs(boolean z2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z2 ? 1 : 0);
            uef("viewableChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oa(com.bytedance.sdk.openadsdk.core.zjm.ab abVar, JSONObject jSONObject) {
        if (abVar == null || jSONObject == null) {
            return;
        }
        try {
            abVar.uef(jSONObject.optBoolean("mute", false), !jSONObject.has("mute") ? "jsb_def" : "jsb_web");
        } catch (Exception unused) {
        }
    }

    public static JSONObject oa(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) throws JSONException {
        int iJnk;
        boolean zSy;
        JSONObject jSONObject = new JSONObject();
        if (sy.moa() != null) {
            int i5 = 0;
            if (gzwVar != null) {
                try {
                    iJnk = gzwVar.jnk();
                } catch (Exception unused) {
                }
            } else {
                iJnk = 0;
            }
            int iDqw = gzwVar != null ? gzwVar.dqw() : 0;
            int iHo = gzwVar != null ? gzwVar.ho() : 0;
            int iQe = gzwVar != null ? gzwVar.qe() : 0;
            boolean zIvm = sy.moa().ivm(String.valueOf(iJnk));
            int iDz = sy.moa().dz(String.valueOf(iJnk));
            boolean z2 = iDz == 1;
            if (iDqw != 7 && iDqw != 8) {
                zSy = sy.moa().yo(String.valueOf(iJnk));
            } else {
                zSy = sy.moa().sy(String.valueOf(iJnk));
            }
            jSONObject.put("voice_control", zSy);
            jSONObject.put("rv_skip_time", iHo);
            jSONObject.put("fv_skip_show", zIvm);
            jSONObject.put("iv_skip_time", iQe);
            jSONObject.put("show_dislike", gzwVar != null && gzwVar.lox());
            jSONObject.put("video_adaptation", gzwVar != null ? gzwVar.aos() : 0);
            jSONObject.put("splash_image_count_down_time", sy.moa().gsd(String.valueOf(iJnk)));
            if (gzwVar != null && gzwVar.rwy() != null) {
                jSONObject.put("dynamic_configs", gzwVar.rwy());
            }
            if (com.bytedance.sdk.openadsdk.core.model.dhk.yo(gzwVar)) {
                jSONObject.put("skip_change_to_close", true);
            } else {
                jSONObject.put("skip_change_to_close", z2);
            }
            if (gzwVar != null && gzwVar.gem()) {
                i5 = 1;
            }
            jSONObject.put("bar_render_platform", i5);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("endcard_close_time", sy.moa().uef(iJnk));
            jSONObject.put("video_skip_result", iDz);
            jSONObject.put("if_show_win", sy.moa().cz(String.valueOf(iJnk)));
            jSONObject.put("origin_rv_skip_time", sy.moa().dj(String.valueOf(iJnk)));
            jSONObject.put("origin_iv_skip_time", sy.moa().dhk(String.valueOf(iJnk)));
        }
        return jSONObject;
    }

    public void oib() {
        com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar = this.au;
        if (oaVar != null) {
            oaVar.ku();
        }
    }

    public void lw(boolean z2) {
        this.gem = z2;
    }

    public void lw(int i5) {
        com.bytedance.sdk.openadsdk.component.reward.yo.uef uefVar;
        if (i5 == 0 || i5 != 1 || (uefVar = this.uqx) == null) {
            return;
        }
        uefVar.uef();
    }

    public oyt uef(com.bytedance.sdk.openadsdk.moa.moa.lw lwVar) {
        this.oyt = lwVar;
        return this;
    }

    public oyt uef(boolean z2) {
        this.dxx = z2;
        return this;
    }

    public oyt uef(View view) {
        this.dj = new WeakReference<>(view);
        return this;
    }

    public oyt uef(int i5) {
        this.wk = i5;
        return this;
    }

    public oyt uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        this.bs = gzwVar;
        if (gzwVar != null) {
            this.sy = gzwVar.kn();
        }
        return this;
    }

    public oyt uef(com.bytedance.sdk.openadsdk.cq.yo yoVar) {
        this.f25727ue = yoVar;
        return this;
    }

    public oyt uef(com.bytedance.sdk.openadsdk.cq.dj djVar) {
        this.pz = djVar;
        return this;
    }

    public oyt uef(Map<String, Object> map) {
        this.uef = map;
        return this;
    }

    public oyt uef(com.bytedance.sdk.component.adexpress.oa.dj djVar) {
        this.oib = djVar;
        return this;
    }

    public oyt uef(com.bytedance.sdk.openadsdk.core.zjm.ab abVar) {
        this.dhk = abVar;
        return this;
    }

    public oyt uef(JSONObject jSONObject) {
        this.tpx = jSONObject;
        return this;
    }

    public oyt uef(com.bytedance.sdk.openadsdk.cq.uef uefVar) {
        this.gzw = uefVar;
        return this;
    }

    public oyt uef(com.bytedance.sdk.openadsdk.cq.lw lwVar) {
        this.gsd = lwVar;
        return this;
    }

    public oyt uef(com.bytedance.sdk.openadsdk.cq.bcc bccVar) {
        this.rl = bccVar;
        return this;
    }

    public static void uef(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) throws Exception {
        String strIou = gzwVar.iou();
        if (!TextUtils.isEmpty(strIou)) {
            jSONObject.put("cid", strIou);
        }
        String strEm = gzwVar.em();
        if (!TextUtils.isEmpty(strEm)) {
            jSONObject.put("log_extra", strEm);
        }
        String strKid = gzwVar.kid();
        if (!TextUtils.isEmpty(strKid)) {
            jSONObject.put("download_url", strKid);
        }
        jSONObject.put(DublinCore.PREFIX_DC, TextUtils.isEmpty(sy.moa().au()) ? sy.moa().au() : "TX");
        jSONObject.put("language", cq.oa());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.dj.oa().vj());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(String str, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            gzw(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public void oa(final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    cz(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.moa.yo.uef(new com.bytedance.sdk.component.bcc.oa.yo("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.oyt.10
                @Override // java.lang.Runnable
                public void run() throws JSONException, NumberFormatException {
                    long j8;
                    String strUef;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    oyt.this.gb = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (oyt.this.bcc(queryParameter3)) {
                        long j10 = 0;
                        try {
                            j8 = Long.parseLong(uri.getQueryParameter(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
                        } catch (Exception unused) {
                            j8 = 0;
                        }
                        try {
                            j10 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        long j11 = j10;
                        JSONObject jSONObject = null;
                        try {
                            String queryParameter4 = uri.getQueryParameter("extra");
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                JSONObject jSONObject2 = new JSONObject(queryParameter4);
                                try {
                                    jSONObject2.putOpt("ua_policy", Integer.valueOf(oyt.this.wk));
                                } catch (Throwable unused3) {
                                }
                                jSONObject = jSONObject2;
                            }
                        } catch (Throwable unused4) {
                        }
                        if ("click".equals(queryParameter3)) {
                            jSONObject = oyt.this.gsd(jSONObject);
                        }
                        if ("landing_perf_error".equals(queryParameter3) || "landing_perf_stats".equals(queryParameter3)) {
                            try {
                                jSONObject = new JSONObject();
                                for (String str : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str)) {
                                            jSONObject.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject.put(str, uri.getQueryParameter(str));
                                        }
                                    } catch (Exception unused5) {
                                    }
                                }
                                strUef = oyt.this.ivm;
                            } catch (Exception unused6) {
                                return;
                            }
                        } else {
                            strUef = oyt.this.uef(queryParameter2, queryParameter3);
                        }
                        com.bytedance.sdk.openadsdk.moa.yo.uef(oyt.this.bs, queryParameter, strUef, queryParameter3, j8, j11, jSONObject, com.bytedance.sdk.openadsdk.core.model.dhk.xs(oyt.this.bs));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e0 A[PHI: r3
  0x03e0: PHI (r3v23 org.json.JSONObject) = (r3v15 org.json.JSONObject), (r3v24 org.json.JSONObject) binds: [B:251:0x0432, B:230:0x03de] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject uef(com.bytedance.sdk.openadsdk.core.oyt.oa r25, int r26) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.oyt.uef(com.bytedance.sdk.openadsdk.core.oyt$oa, int):org.json.JSONObject");
    }

    private void uef(JSONObject jSONObject, boolean z2, String str) {
        com.bytedance.sdk.openadsdk.core.widget.lw lwVar;
        if (z2) {
            try {
                String strOptString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString) || new JSONObject(strOptString).optInt("agg_request_type", -1) != 1 || !"click".equals(str) || (lwVar = this.xs) == null) {
                    return;
                }
                lwVar.uef();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.uef("TTAD.AndroidObject", "callAggClickListener faile", th);
            }
        }
    }

    private boolean uef(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String strOptString;
        int iOptInt;
        String strOptString2;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("landingStyle");
            strOptString = jSONObject.optString("url");
            strOptString2 = jSONObject.optString("fallback_url");
        } else {
            strOptString = null;
            iOptInt = -1;
            strOptString2 = null;
        }
        if (iOptInt == 1) {
            if (!com.bytedance.sdk.component.utils.sy.uef(strOptString)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e7) {
                    com.bytedance.sdk.component.utils.dhk.uef("TTAD.AndroidObject", "handleUrl, EX1->: ", e7);
                }
                return false;
            }
            return true;
        }
        if (iOptInt == 2) {
            try {
                if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) {
                    jSONObject2.put("empty_url", 1);
                    return false;
                }
                if (!com.bytedance.sdk.component.utils.sy.uef(strOptString2)) {
                    jSONObject2.put("invalid_url", 1);
                    return false;
                }
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.dhk.uef("TTAD.AndroidObject", "handleUrl, EX2->: ", e10);
            }
        }
        return true;
    }

    private void uef(String str, boolean z2) {
        if (this.oyt == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z2) {
            this.oyt.uef(str);
        } else {
            this.oyt.oa(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.oa
    public void uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("time");
            String strOptString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.zjm.ab abVar = this.dhk;
            if (abVar != null) {
                abVar.uef(iOptInt, strOptString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    public void uef(final oa oaVar, final JSONObject jSONObject) {
        if (oaVar == null) {
            return;
        }
        try {
            uef(oaVar.moa, new com.bytedance.sdk.openadsdk.cq.moa() { // from class: com.bytedance.sdk.openadsdk.core.oyt.7
                @Override // com.bytedance.sdk.openadsdk.cq.moa
                public void uef(boolean z2, com.bytedance.sdk.openadsdk.core.model.uef uefVar) throws JSONException {
                    if (!z2) {
                        oyt.this.oa(oaVar.f25736oa, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put("creatives", oyt.uef(uefVar));
                        oyt.this.oa(oaVar.f25736oa, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    private boolean uef(String str, int i5, com.bytedance.sdk.openadsdk.core.model.ab abVar) {
        HashMap<String, dj> map;
        if (TextUtils.isEmpty(str) || (map = this.ku) == null || map.get(str) == null) {
            return false;
        }
        throw null;
    }

    public void uef(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.cq.moa moaVar) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        if (moaVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.cq.moa moaVar2 = new com.bytedance.sdk.openadsdk.cq.moa() { // from class: com.bytedance.sdk.openadsdk.core.oyt.8
                @Override // com.bytedance.sdk.openadsdk.cq.moa
                public void uef(final boolean z2, final com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
                    com.bytedance.sdk.openadsdk.utils.km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.oyt.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            moaVar.uef(z2, uefVar);
                        }
                    });
                }
            };
            if (this.bs != null && !TextUtils.isEmpty(this.wrv)) {
                int iDqw = this.bs.dqw();
                AdSlot adSlotCl = this.bs.cl();
                com.bytedance.sdk.openadsdk.core.model.ue ueVar = new com.bytedance.sdk.openadsdk.core.model.ue();
                ueVar.ivm = true;
                if (this.bs.vep() != null || this.bs.aje() != null) {
                    ueVar.cz = 2;
                }
                JSONObject jSONObject2 = this.sy;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null && jSONObject.has("session_params") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("session_params")) != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObjectOptJSONObject.opt(next));
                    }
                }
                ueVar.xs = jSONObject2;
                if (jSONObject != null && jSONObject.has("common_params")) {
                    if (ueVar.bcc == null) {
                        ueVar.bcc = new JSONObject();
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("common_params");
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            ueVar.bcc.put(next2, jSONObjectOptJSONObject2.opt(next2));
                        }
                    }
                }
                sy.yo().uef(adSlotCl, ueVar, iDqw, new orq() { // from class: com.bytedance.sdk.openadsdk.core.oyt.9
                    @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
                    public void uef(int i5, String str) {
                        moaVar2.uef(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
                    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
                        oyt.this.uef(uefVar, yoVar, moaVar2);
                    }
                });
                return;
            }
            moaVar2.uef(false, null);
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.uef("TTAD.AndroidObject", "get ads error", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar, com.bytedance.sdk.openadsdk.cq.moa moaVar) {
        if (uefVar.lw() != null && !uefVar.lw().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = uefVar.lw().get(0);
            if (gzwVar != null) {
                this.sy = gzwVar.kn();
            }
            moaVar.uef(true, uefVar);
            return;
        }
        moaVar.uef(false, null);
        yoVar.uef(-3);
        yoVar.yo(7);
        com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
    }

    public static JSONArray uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVarXs;
        if (uefVar == null || !uefVar.ivm() || (gzwVarXs = uefVar.xs()) == null || TextUtils.isEmpty(gzwVarXs.cd())) {
            return null;
        }
        try {
            return new JSONObject(gzwVarXs.cd()).optJSONArray("creatives");
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean uef(Uri uri) {
        if (uri == null) {
            return false;
        }
        if ("bytedance".equals(uri.getScheme())) {
            return bcc.containsKey(uri.getHost());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String uef(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.dhk.xs(this.bs)) {
            if ("show".equals(str2)) {
                return com.bytedance.sdk.openadsdk.utils.gb.uef(this.cq);
            }
            return "aggregate_page";
        }
        if (com.bytedance.sdk.openadsdk.core.model.cp.lw(this.bs)) {
            return this.ivm;
        }
        if (this.f25727ue != null) {
            return com.bytedance.sdk.openadsdk.utils.gb.uef(this.cq);
        }
        return this.oib == null ? com.bytedance.sdk.openadsdk.utils.gb.oa(this.cq) : str;
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof oa) {
                try {
                    uef((oa) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.dj.oa
    public void uef(String str, JSONObject jSONObject) {
        yo(str, jSONObject);
    }

    private void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str, boolean z2) {
        com.bytedance.sdk.openadsdk.core.yo.uef uefVar = new com.bytedance.sdk.openadsdk.core.yo.uef(sy.uef(), gzwVar, str, this.cq);
        uefVar.uef(com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(sy.uef(), str));
        if (!z2) {
            uefVar.uef(false);
        }
        uefVar.uef((View) null);
    }

    public void uef(JSONObject jSONObject, String str) {
        com.bytedance.sdk.openadsdk.core.zjm.ab abVar = this.dhk;
        if (abVar != null) {
            abVar.uef(str, jSONObject);
            return;
        }
        com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar = this.au;
        if (oaVar != null) {
            oaVar.uef(str, jSONObject);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        this.au = oaVar;
    }

    public void uef(ue ueVar) {
        this.zou = ueVar;
    }

    public void uef(uef uefVar) {
        this.nkh = uefVar;
    }

    public void uef(int i5, int i10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i5);
            jSONObject.put("height", i10);
            uef("resize", jSONObject);
        } catch (Exception e7) {
            Log.e("TTAD.AndroidObject", "", e7);
        }
    }

    public oyt uef(Activity activity) {
        this.dor = activity;
        return this;
    }

    public oyt uef(com.bytedance.sdk.openadsdk.component.reward.yo.ivm ivmVar) {
        this.etd = ivmVar;
        return this;
    }

    public oyt uef(com.bytedance.sdk.openadsdk.component.reward.yo.uef uefVar) {
        this.uqx = uefVar;
        return this;
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.yo.cz czVar) {
        this.rj = czVar;
    }

    public void uef(int i5, JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.component.reward.yo.cz czVar = this.rj;
        if (czVar != null) {
            czVar.uef(i5, jSONObject);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.yo.moa moaVar) {
        this.dv = moaVar;
    }
}
