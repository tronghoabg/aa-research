package com.bytedance.sdk.openadsdk.moa;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.ue;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef implements com.bytedance.sdk.component.ivm.uef.moa.uef.oa {

    /* renamed from: ab, reason: collision with root package name */
    private String f25990ab;
    private int bcc;
    private String bs;
    private JSONObject cq;
    private int cz;
    private com.bytedance.sdk.openadsdk.moa.oa.uef dhk;
    private String dz;
    private String gsd;
    private int gzw;
    private final String ivm;
    private long lw;
    private long moa;

    /* renamed from: oa, reason: collision with root package name */
    protected final JSONObject f25991oa;
    private String oib;
    private String orq;
    private List<String> rt;
    private String sy;
    private String tpx;
    public final String uef;
    private String wk;
    private final AtomicBoolean wrv;
    private int xs;
    private boolean yo;
    private static final Set<String> zjm = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> dj = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.moa.uef.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put("errorCode", "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.moa.uef$uef, reason: collision with other inner class name */
    public static final class C0127uef {

        /* renamed from: ab, reason: collision with root package name */
        private final long f26000ab;
        private String bcc;
        private int bs;
        private String cq;
        private String cz;
        private String dhk;
        private String dj;
        private com.bytedance.sdk.openadsdk.moa.oa.oa dz;
        private String ivm;
        private String lw;
        private String moa;

        /* renamed from: oa, reason: collision with root package name */
        private String f26001oa;
        private boolean oib;
        private int sy;
        private List<String> tpx;
        public int uef;
        private com.bytedance.sdk.openadsdk.moa.oa.uef wk;
        private final int wrv;
        private String xs;
        private String yo;
        private JSONObject zjm;

        public C0127uef(long j8, gzw gzwVar) {
            this.bs = -1;
            this.sy = -1;
            this.uef = -1;
            if (gzwVar != null) {
                this.oib = cp.oa(gzwVar);
                this.bs = gzwVar.hg();
                this.sy = gzwVar.wxf();
                this.uef = gzwVar.hw();
            }
            this.f26000ab = j8;
            this.wrv = com.bytedance.sdk.component.utils.sy.yo(com.bytedance.sdk.openadsdk.core.sy.uef());
        }

        public C0127uef bcc(String str) {
            this.dhk = str;
            return this;
        }

        public C0127uef ivm(String str) {
            this.cz = str;
            return this;
        }

        public C0127uef lw(String str) {
            this.bcc = str;
            return this;
        }

        public C0127uef moa(String str) {
            this.lw = str;
            return this;
        }

        public C0127uef oa(String str) {
            this.yo = str;
            return this;
        }

        public C0127uef xs(String str) {
            this.xs = str;
            return this;
        }

        public C0127uef yo(String str) {
            this.moa = str;
            return this;
        }

        public C0127uef uef(String str) {
            this.cq = str;
            return this;
        }

        public C0127uef uef(List<String> list) {
            this.tpx = list;
            return this;
        }

        public C0127uef uef(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.zjm = jSONObject;
            return this;
        }

        public void uef(com.bytedance.sdk.openadsdk.moa.oa.uef uefVar) {
            com.bytedance.sdk.openadsdk.ivm.oa.uef().uef(this.moa, this.dhk, this.xs, this.yo);
            this.wk = uefVar;
            uef uefVar2 = new uef(this);
            try {
                com.bytedance.sdk.openadsdk.moa.oa.oa oaVar = this.dz;
                if (oaVar != null) {
                    oaVar.uef(uefVar2.f25991oa, this.f26000ab);
                } else {
                    new com.bytedance.sdk.openadsdk.moa.oa.yo().uef(uefVar2.f25991oa, this.f26000ab);
                }
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.moa.uef.oa.uef(uefVar2);
        }
    }

    public uef(String str, JSONObject jSONObject) {
        this.ivm = "adiff";
        this.wrv = new AtomicBoolean(false);
        this.cq = new JSONObject();
        this.uef = str;
        this.f25991oa = jSONObject;
    }

    private void bcc() throws JSONException {
        this.f25991oa.putOpt("app_log_url", this.gsd);
        List<String> list = this.rt;
        if (list != null && !list.isEmpty()) {
            try {
                this.f25991oa.putOpt("app_log_url_back", new JSONArray((Collection) this.rt));
            } catch (Throwable th) {
                dhk.yo("AdEvent", th.getMessage());
            }
        }
        this.f25991oa.putOpt("tag", this.dz);
        this.f25991oa.putOpt("label", this.wk);
        this.f25991oa.putOpt("category", this.f25990ab);
        if (!TextUtils.isEmpty(this.bs)) {
            try {
                this.f25991oa.putOpt(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, Long.valueOf(Long.parseLong(this.bs)));
            } catch (NumberFormatException unused) {
                this.f25991oa.putOpt(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, 0L);
            }
        }
        if (!TextUtils.isEmpty(this.oib)) {
            try {
                this.f25991oa.putOpt("ext_value", Long.valueOf(Long.parseLong(this.oib)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.orq)) {
            this.f25991oa.putOpt("log_extra", this.orq);
        }
        if (!TextUtils.isEmpty(this.tpx)) {
            try {
                this.f25991oa.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.tpx)));
            } catch (NumberFormatException unused3) {
            }
        }
        uef(this.f25991oa, this.wk);
        try {
            if (!this.f25991oa.has("nt")) {
                this.f25991oa.putOpt("nt", Integer.valueOf(this.gzw));
            }
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.cq.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.f25991oa.putOpt(next, this.cq.opt(next));
        }
    }

    private boolean oa(String str) {
        str.getClass();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private boolean uef(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        switch (str2) {
        }
        return false;
    }

    private void xs() {
        JSONObject jSONObject = this.cq;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
            String strOptString2 = this.cq.optString("category");
            String strOptString3 = this.cq.optString("log_extra");
            if (uef(this.bs, this.f25990ab, this.orq)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !oa(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.bs) || TextUtils.equals(this.bs, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.f25990ab) || !oa(this.f25990ab)) && (TextUtils.isEmpty(strOptString2) || !oa(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.orq) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!uef(this.bs, this.f25990ab, this.orq)) {
            return;
        }
        this.moa = com.bytedance.sdk.openadsdk.moa.uef.oa.uef.incrementAndGet();
    }

    public boolean ivm() {
        Set<String> setCq;
        if (this.f25991oa == null || (setCq = com.bytedance.sdk.openadsdk.core.sy.moa().cq()) == null) {
            return false;
        }
        String strOptString = this.f25991oa.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setCq.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.wk)) {
            return false;
        }
        return setCq.contains(this.wk);
    }

    public String lw() {
        return this.uef;
    }

    public JSONObject moa() {
        JSONObject jSONObjectYo = yo();
        try {
            JSONObject jSONObject = new JSONObject(jSONObjectYo.toString());
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            if (jSONObjectOptJSONObject == null) {
                return jSONObject;
            }
            jSONObjectOptJSONObject.remove("app_log_url");
            jSONObjectOptJSONObject.remove("app_log_url_back");
            return jSONObject;
        } catch (JSONException e7) {
            dhk.yo("AdEvent", e7.getMessage());
            return jSONObjectYo;
        }
    }

    public JSONObject yo() {
        if (this.wrv.get()) {
            return this.f25991oa;
        }
        try {
            bcc();
            if (this.f25991oa.has("ad_extra_data")) {
                Object objOpt = this.f25991oa.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            this.f25991oa.put("ad_extra_data", uef((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.f25991oa.put("ad_extra_data", uef(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e7) {
                        dhk.yo("AdEvent", "json error", e7.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.uef);
                    if (this.yo) {
                        jSONObject.put("interaction_method", this.xs);
                        jSONObject.put("real_interaction_method", this.bcc);
                        jSONObject.put("image_mode", this.cz);
                    }
                    this.f25991oa.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e10) {
                    dhk.yo("AdEvent", "json error", e10.getMessage());
                }
            }
            this.wrv.set(true);
        } catch (Throwable unused) {
        }
        return this.f25991oa;
    }

    private void oa(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : dj.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(dj.get(str), objOpt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private JSONObject uef(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.uef);
            }
            if (this.yo) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.xs);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.bcc);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.cz);
                }
            }
            oa(jSONObject);
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.uef + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th) {
            dhk.yo("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    public uef(C0127uef c0127uef) throws JSONException {
        this.ivm = "adiff";
        this.wrv = new AtomicBoolean(false);
        this.cq = new JSONObject();
        if (!TextUtils.isEmpty(c0127uef.f26001oa)) {
            this.uef = c0127uef.f26001oa;
        } else {
            this.uef = ue.uef();
        }
        this.dhk = c0127uef.wk;
        this.orq = c0127uef.ivm;
        this.dz = c0127uef.yo;
        this.wk = c0127uef.moa;
        if (!TextUtils.isEmpty(c0127uef.lw)) {
            this.f25990ab = c0127uef.lw;
        } else {
            this.f25990ab = "app_union";
        }
        this.tpx = c0127uef.dj;
        this.bs = c0127uef.bcc;
        this.oib = c0127uef.cz;
        this.sy = c0127uef.xs;
        this.gzw = c0127uef.wrv;
        this.gsd = c0127uef.cq;
        this.cq = c0127uef.zjm = c0127uef.zjm != null ? c0127uef.zjm : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.f25991oa = jSONObject;
        if (!TextUtils.isEmpty(c0127uef.cq)) {
            try {
                jSONObject.put("app_log_url", c0127uef.cq);
            } catch (JSONException e7) {
                dhk.yo("AdEvent", e7.getMessage());
            }
        }
        this.rt = c0127uef.tpx;
        if (c0127uef.tpx != null && !c0127uef.tpx.isEmpty()) {
            try {
                this.f25991oa.putOpt("app_log_url_back", new JSONArray((Collection) c0127uef.tpx));
            } catch (Throwable th) {
                dhk.yo("AdEvent", th.getMessage());
            }
        }
        this.xs = c0127uef.bs;
        this.bcc = c0127uef.sy;
        this.cz = c0127uef.uef;
        this.yo = c0127uef.oib;
        this.lw = System.currentTimeMillis();
        xs();
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef.oa
    public long oa() {
        return this.moa;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef.oa
    public JSONObject uef(String str) {
        return yo();
    }

    @Override // com.bytedance.sdk.component.ivm.uef.moa.uef.oa
    public long uef() {
        return this.lw;
    }

    private static void uef(JSONObject jSONObject, String str) {
        try {
            Set<String> set = zjm;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
        } catch (Throwable th) {
            dhk.yo("AdEvent", th);
        }
    }
}
