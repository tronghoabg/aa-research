package com.bytedance.sdk.openadsdk.wrv.uef;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oib extends com.bytedance.sdk.component.uef.sy<JSONObject, JSONObject> {
    public static final HashSet<String> uef = new HashSet<>(Arrays.asList("sendStatsLog", "callBackToPublisher", "trackVideoStateWithOmSdk", "commitDislike", "responseHeartBeat", "trackUrl", "postVideoState"));
    private gzw moa;

    /* renamed from: oa, reason: collision with root package name */
    private boolean f26185oa = false;
    private final oyt yo;

    public oib(oyt oytVar, gzw gzwVar) {
        this.yo = oytVar;
        this.moa = gzwVar;
    }

    private void ivm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("type");
        int iOptInt = jSONObject.optInt("isRealTime");
        jSONObject.optInt("defaultRate");
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ext");
        com.bytedance.sdk.openadsdk.ab.moa.uef(strOptString, iOptInt == 1, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.oib.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject2 = jSONObjectOptJSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef(strOptString).oa(jSONObject2.toString());
            }
        });
    }

    private void lw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.yo.lw(jSONObject.optInt("type"));
    }

    private void moa(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.yo.uef(jSONObject.optInt("state"), jSONObject);
    }

    private void oa(JSONObject jSONObject) {
        FilterWord filterWordOa;
        if (jSONObject == null) {
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filter_words");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i5);
                if (jSONObjectOptJSONObject != null && (filterWordOa = com.bytedance.sdk.openadsdk.core.oa.oa(jSONObjectOptJSONObject)) != null) {
                    arrayList.add(filterWordOa);
                }
            }
        }
        String strOptString = jSONObject.optString("dislike_source");
        com.bytedance.sdk.openadsdk.yo.oa.uef().uef(jSONObject.optString("ext"), arrayList, null, jSONObject.optString("suggestion"), strOptString);
    }

    private void yo(JSONObject jSONObject) {
        if (jSONObject == null || TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.cq.uef(com.bytedance.sdk.openadsdk.core.sy.uef()))) {
            return;
        }
        int iOptInt = jSONObject.optInt("type");
        List<String> listUef = uef(jSONObject.optJSONArray("urls"));
        String strOptString = jSONObject.optString("ad_id");
        if (iOptInt == 1) {
            com.bytedance.sdk.openadsdk.moa.uef.oa.uef(com.bytedance.sdk.openadsdk.gsd.uef.uef(listUef, true), 1, strOptString);
        } else if (iOptInt == 2) {
            com.bytedance.sdk.openadsdk.moa.uef.oa.uef(com.bytedance.sdk.openadsdk.gsd.uef.uef(listUef, true), 2, strOptString);
        }
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, oyt oytVar, gzw gzwVar) {
        wkVar.uef(uef, new oib(oytVar, gzwVar));
    }

    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        str.getClass();
        switch (str) {
            case "responseHeartBeat":
                Log.d("BaseManagerBundle", "invoke: ");
                this.yo.tpx();
                jSONObject2.put("success", true);
                break;
            case "commitDislike":
                oa(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "trackVideoStateWithOmSdk":
                moa(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "callBackToPublisher":
                lw(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "postVideoState":
                uef(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "trackUrl":
                yo(jSONObject);
                break;
            case "sendStatsLog":
                ivm(jSONObject);
                jSONObject2.put("success", true);
                break;
        }
        return jSONObject2;
    }

    private void uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        double dOptDouble = jSONObject.optDouble("percent");
        jSONObject.optInt("current");
        jSONObject.optInt("duration");
        jSONObject.optInt("play_count");
        if (this.f26185oa || dOptDouble < 0.30000001192092896d || this.moa == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ivm.oa.uef().uef("videoPercent30", this.moa);
        this.f26185oa = true;
    }

    private List<String> uef(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                arrayList.add(jSONArray.optString(i5));
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }
}
