package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    private int cz;
    private String dj;
    private rt ivm;
    private gzw lw;

    /* renamed from: oa, reason: collision with root package name */
    private int f25712oa;
    private String uef;
    private gzw wrv;
    private String yo;
    private orq zjm;
    private List<gzw> moa = new ArrayList();
    private JSONObject xs = new JSONObject();
    private volatile boolean bcc = false;

    public orq bcc() {
        return this.zjm;
    }

    public gzw cq() {
        return this.lw;
    }

    public boolean cz() {
        return this.cz == 1;
    }

    public rt dj() {
        return this.ivm;
    }

    public boolean ivm() {
        List<gzw> list = this.moa;
        return list != null && list.size() > 0;
    }

    public List<gzw> lw() {
        return this.moa;
    }

    public int moa() {
        return this.f25712oa;
    }

    public String oa() {
        return this.uef;
    }

    public JSONObject uef() {
        return this.xs;
    }

    public String wrv() {
        return this.dj;
    }

    public gzw xs() {
        if (this.moa.size() > 0) {
            return this.moa.get(0);
        }
        return null;
    }

    public String yo() {
        gzw gzwVarXs = xs();
        return gzwVarXs != null ? gzwVarXs.ofp() : "";
    }

    public gzw zjm() {
        return this.wrv;
    }

    public void oa(String str) {
        this.yo = str;
    }

    public void uef(JSONObject jSONObject) {
        this.xs = jSONObject;
    }

    public void oa(int i5) {
        this.cz = i5;
    }

    public void uef(String str) {
        this.uef = str;
    }

    public static uef oa(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            uef uefVar = new uef();
            uefVar.uef(orq.uef(jSONObject.optJSONObject("loop_config")));
            uefVar.oa(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    gzw gzwVarUef = com.bytedance.sdk.openadsdk.core.oa.uef(jSONArrayOptJSONArray.optJSONObject(i5), null, null, uefVar, i5);
                    if (gzwVarUef != null) {
                        arrayList.add(gzwVarUef);
                    }
                }
                uefVar.uef(arrayList);
            }
            uefVar.uef(jSONObject.optString("request_id", ""));
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                uefVar.uef(rt.uef(strOptString));
            }
            return uefVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.uef("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    public void uef(int i5) {
        this.f25712oa = i5;
    }

    public void yo(String str) {
        this.dj = str;
    }

    public void uef(gzw gzwVar) {
        this.moa.add(gzwVar);
        if (this.wrv == null) {
            this.wrv = gzwVar;
        }
    }

    public void uef(List<gzw> list) {
        this.moa = list;
        if (list.isEmpty()) {
            return;
        }
        this.wrv = list.get(0);
    }

    public static Map<String, gzw> uef(uef uefVar) {
        if (uefVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (gzw gzwVar : uefVar.lw()) {
            if (!TextUtils.isEmpty(gzwVar.vup())) {
                map.put(gzwVar.vup(), gzwVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public void uef(orq orqVar) {
        this.zjm = orqVar;
    }

    public void uef(rt rtVar) {
        this.ivm = rtVar;
    }

    public void oa(gzw gzwVar) {
        this.lw = gzwVar;
    }
}
