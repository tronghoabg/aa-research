package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class pz {
    private int bcc;
    private String cz;
    private int dj;
    private String ivm;
    private String lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f25704oa;
    private String uef;
    private String xs;
    private int yo;
    private String zjm;

    public boolean bcc() {
        return this.moa == 2;
    }

    public boolean cz() {
        return this.dj == 1;
    }

    public JSONObject dj() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.uef)) {
                jSONObject.put("market_dpl", this.uef);
            }
            if (!TextUtils.isEmpty(this.f25704oa)) {
                jSONObject.put("market_dpl_auto", this.f25704oa);
            }
            if (!TextUtils.isEmpty(this.lw)) {
                jSONObject.put("market_pkg", this.lw);
            }
            if (!TextUtils.isEmpty(this.xs)) {
                jSONObject.put("app_pkg", this.xs);
            }
            if (!TextUtils.isEmpty(this.ivm)) {
                jSONObject.put("regex", this.ivm);
            }
            jSONObject.put("exec_type", this.yo);
            jSONObject.put("oem_vendor_type", this.moa);
            jSONObject.put("overlay", this.bcc);
            jSONObject.put("gp_card", this.dj);
            if (!TextUtils.isEmpty(this.cz)) {
                jSONObject.put("caller_id", this.cz);
            }
            if (!TextUtils.isEmpty(this.zjm)) {
                jSONObject.put("ext_map", this.zjm);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("OemModel", th.getMessage());
            return null;
        }
    }

    public void ivm(String str) {
        this.uef = str;
    }

    public String lw() {
        return this.ivm;
    }

    public String moa() {
        return this.lw;
    }

    public int oa() {
        return this.bcc;
    }

    public String uef() {
        return this.xs;
    }

    public void xs(String str) {
        this.f25704oa = str;
    }

    public String yo() {
        return this.cz;
    }

    public String zjm() {
        return this.yo == 2 ? this.f25704oa : this.uef;
    }

    public int ivm() {
        return this.moa;
    }

    public void lw(String str) {
        this.ivm = str;
    }

    public void moa(String str) {
        this.lw = str;
    }

    public void oa(int i5) {
        this.bcc = i5;
    }

    public void uef(String str) {
        this.xs = str;
    }

    public boolean xs() {
        return this.moa == 1;
    }

    public void yo(String str) {
        this.zjm = str;
    }

    public void moa(int i5) {
        this.moa = i5;
    }

    public void oa(String str) {
        this.cz = str;
    }

    public void uef(int i5) {
        this.dj = i5;
    }

    public void yo(int i5) {
        this.yo = i5;
    }

    public static pz uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        pz pzVar = new pz();
        try {
            pzVar.ivm(jSONObject.optString("market_dpl", ""));
            pzVar.xs(jSONObject.optString("market_dpl_auto", ""));
            pzVar.yo(jSONObject.optInt("exec_type", 0));
            pzVar.moa(jSONObject.optInt("oem_vendor_type", 0));
            pzVar.moa(jSONObject.optString("market_pkg", ""));
            pzVar.lw(jSONObject.optString("regex", ""));
            pzVar.oa(jSONObject.optInt("overlay", 1));
            pzVar.oa(jSONObject.optString("caller_id", ""));
            pzVar.yo(jSONObject.optString("ext_map", null));
            pzVar.uef(jSONObject.optInt("gp_card", 0));
            pzVar.uef(jSONObject.optString("app_pkg", ""));
            return pzVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("OemModel", th.getMessage());
            return pzVar;
        }
    }

    public void uef(Intent intent) {
        if (TextUtils.isEmpty(this.zjm)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.zjm);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
