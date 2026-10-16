package com.bytedance.sdk.component.adexpress.dynamic.moa;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yo {

    /* renamed from: oa, reason: collision with root package name */
    private JSONObject f24869oa;
    private HashMap<String, Object> uef = new HashMap<>();

    public yo(JSONObject jSONObject) {
        this.f24869oa = jSONObject;
    }

    public boolean oa(String str) {
        return this.uef.containsKey(str);
    }

    public Object uef(String str) {
        if (this.uef.containsKey(str)) {
            return this.uef.get(str);
        }
        return null;
    }

    public void uef() {
        Iterator<String> itKeys = this.f24869oa.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = this.f24869oa.opt(next);
            int i5 = 0;
            if (TextUtils.equals("image", next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (i5 < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                                    this.uef.put(next + "." + i5 + "." + next2, objOpt2);
                                }
                            }
                            i5++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) objOpt);
                        Iterator<String> itKeys3 = jSONObject.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            Object objOpt3 = jSONObject.opt(next3);
                            if ((objOpt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i10 = 0; i10 < ((JSONArray) objOpt3).length(); i10++) {
                                    this.uef.put(next + "." + next3 + "." + i10, ((JSONArray) objOpt3).opt(i10));
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt3).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    Object objOpt4 = ((JSONObject) objOpt3).opt(next4);
                                    this.uef.put(next + "." + next3 + "." + next4, objOpt4);
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                uef(next, next3, objOpt3);
                            } else {
                                this.uef.put(next + "." + next3, objOpt3);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (!(objOpt instanceof JSONObject)) {
                this.uef.put(next, objOpt);
                if (objOpt instanceof String) {
                    this.uef.put(next, objOpt);
                }
            } else if (objOpt != null) {
                JSONObject jSONObject2 = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject2.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    Object objOpt5 = jSONObject2.opt(next5);
                    this.uef.put(next + "." + next5, objOpt5);
                }
            }
        }
    }

    private void uef(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i5 = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (i5 < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                            this.uef.put(str + "." + str2 + "." + next + "." + i5 + "." + next2, objOpt2);
                        }
                        i5++;
                    }
                }
            } else {
                this.uef.put(str + "." + str2 + "." + next, objOpt);
            }
        }
    }
}
