package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm {
    public boolean ivm;
    public boolean lw;
    public boolean moa;
    public String yo;
    public static final ivm uef = new ivm(null);

    /* renamed from: oa, reason: collision with root package name */
    public static String f25745oa = "";

    public ivm(String str) {
        this.yo = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.moa = true;
        this.lw = true;
        this.ivm = true;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.yo = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i5));
            }
            this.moa = arrayList.contains("load_finish");
            this.ivm = arrayList.contains("load_fail");
            this.lw = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
