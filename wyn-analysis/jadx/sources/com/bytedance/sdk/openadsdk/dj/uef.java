package com.bytedance.sdk.openadsdk.dj;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.ivm;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef implements yo {

    /* renamed from: oa, reason: collision with root package name */
    private final oa f25889oa;
    private final gzw uef;
    private final Map<String, com.bytedance.sdk.openadsdk.tpx.uef.uef.yo> yo = new HashMap();

    private uef(oa oaVar, gzw gzwVar) {
        this.f25889oa = oaVar;
        this.uef = gzwVar;
    }

    public static uef uef(oa oaVar, gzw gzwVar) {
        return new uef(oaVar, gzwVar);
    }

    @Override // com.bytedance.sdk.openadsdk.dj.yo
    public void uef() {
        this.yo.clear();
    }

    private gzw uef(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        gzw gzwVar = new gzw();
        gzwVar.lw(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            gzwVar.gr(str);
        }
        if (this.uef != null) {
            String strUef = gzwVar.no() != null ? gzwVar.no().uef() : null;
            if (TextUtils.isEmpty(strUef)) {
                return this.uef;
            }
            ivm ivmVarNo = this.uef.no();
            if (ivmVarNo != null && strUef.equals(ivmVarNo.uef())) {
                return this.uef;
            }
            if (ivmVarNo != null && strUef.contains("play.google.com/store") && !strUef.contains("referrer")) {
                gzwVar.no().uef(ivmVarNo.uef());
            }
        }
        return gzwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.dj.yo
    public void uef(Context context, JSONObject jSONObject, String str, int i5, boolean z2) {
        JSONObject jSONObjectOptJSONObject;
        if (context == null || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY)) == null) {
            return;
        }
        uef(context, uef(jSONObjectOptJSONObject, str), jSONObjectOptJSONObject, i5, z2);
    }

    private void uef(Context context, gzw gzwVar, JSONObject jSONObject, int i5, boolean z2) {
        if (context == null || gzwVar == null || gzwVar.no() == null || jSONObject == null || this.f25889oa == null || this.yo.get(gzwVar.no().uef()) != null) {
            return;
        }
        String strOa = gb.oa(i5);
        if (TextUtils.isEmpty(strOa)) {
            return;
        }
        this.yo.put(gzwVar.no().uef(), uef(context, strOa));
    }

    @Override // com.bytedance.sdk.openadsdk.dj.yo
    public void uef(Context context, JSONObject jSONObject, String str) {
        if (context == null || this.uef == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(context, str).uef(this.uef);
    }

    @Override // com.bytedance.sdk.openadsdk.dj.yo
    public void uef(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY)) == null) {
            return;
        }
        uef(uef(jSONObjectOptJSONObject, (String) null), jSONObjectOptJSONObject);
    }

    private void uef(gzw gzwVar, JSONObject jSONObject) throws JSONException {
        if (this.f25889oa == null || gzwVar == null || gzwVar.no() == null) {
            return;
        }
        String strUef = gzwVar.no().uef();
        if (this.yo.containsKey(strUef)) {
            this.yo.remove(strUef);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.f25889oa.uef("app_ad_event", jSONObject2);
            } catch (JSONException e7) {
                dhk.yo("JsAppAdDownloadManager", e7.getMessage());
            }
        }
    }

    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo uef(Context context, String str) {
        return com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(context, str);
    }
}
