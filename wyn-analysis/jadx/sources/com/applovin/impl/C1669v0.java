package com.applovin.impl;

import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.util.ArrayList;
import ka.AbstractC3256n;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1669v0 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f23374a;

    /* renamed from: b, reason: collision with root package name */
    protected final JSONObject f23375b;

    /* renamed from: com.applovin.impl.v0$a */
    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(BackupConstant.SCENE_BACKUP_RENDER_FAIL);


        /* renamed from: a, reason: collision with root package name */
        private final int f23381a;

        a(int i5) {
            this.f23381a = i5;
        }

        public int b() {
            return this.f23381a;
        }
    }

    /* renamed from: com.applovin.impl.v0$b */
    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public C1669v0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f23374a = kVar;
        this.f23375b = jSONObject;
    }

    public static C1669v0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        b bVarC = c(JsonUtils.getString(jSONObject, "type", null));
        return bVarC == b.ALERT ? new C1671w0(jSONObject, kVar) : bVarC == b.EVENT ? new C1675y0(jSONObject, kVar) : new C1669v0(jSONObject, kVar);
    }

    public String b() {
        return JsonUtils.getString(this.f23375b, "decision_type", null);
    }

    public int c() {
        return JsonUtils.getInt(this.f23375b, "id", -1);
    }

    public b d() {
        return c(e());
    }

    public String e() {
        return JsonUtils.getString(this.f23375b, "type", null);
    }

    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + "}";
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if ("post_alert".equalsIgnoreCase(str)) {
            return b.POST_ALERT;
        }
        if ("event".equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException(R8.v.f("Invalid type provided: ", str));
    }

    public String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f23375b, str, (JSONObject) null);
        JSONArray jSONArrayM = AbstractC1593a.m("replacements", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArrayM.length(); i5++) {
            String string = JsonUtils.getObjectAtIndex(jSONArrayM, i5, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                String str2 = (String) this.f23374a.A().L().get("app_name");
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.k.a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, null), arrayList);
    }

    public a a() {
        return a(b());
    }

    public int a(Boolean bool) {
        int i5 = JsonUtils.getInt(this.f23375b, "destination_state_id", -1);
        if (i5 > 0) {
            return i5;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.f23375b, "destination_state_id_true", -1) : JsonUtils.getInt(this.f23375b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException(AbstractC3256n.g(i5, "Decision needed for state: "));
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        if ("is_eligible_for_terms_and_privacy_policy_alert".equalsIgnoreCase(str)) {
            return a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT;
        }
        if ("has_terms_of_service_uri".equalsIgnoreCase(str)) {
            return a.HAS_TERMS_OF_SERVICE_URI;
        }
        return a.NONE;
    }
}
