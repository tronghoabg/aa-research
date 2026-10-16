package com.bytedance.sdk.openadsdk.core.dz;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    private double bcc;
    private int cz;
    private String ivm;
    private String lw;
    private String moa;

    /* renamed from: oa, reason: collision with root package name */
    oa f25594oa;
    private String wrv;
    private String xs;
    yo yo;
    private int zjm;
    final com.bytedance.sdk.openadsdk.core.model.moa uef = new com.bytedance.sdk.openadsdk.core.model.moa();
    private String dj = "VAST_ACTION_BUTTON";

    public double bcc() {
        return this.bcc;
    }

    public com.bytedance.sdk.openadsdk.core.model.moa cq() {
        return this.uef;
    }

    public String cz() {
        yo yoVar;
        String str = this.ivm;
        if (!TextUtils.isEmpty(this.wrv)) {
            String str2 = this.wrv;
            this.wrv = null;
            return str2;
        }
        String str3 = this.dj;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            oa oaVar = this.f25594oa;
            if (oaVar != null && !TextUtils.isEmpty(oaVar.bcc)) {
                str = this.f25594oa.bcc;
            }
        } else if (str3.equals("VAST_END_CARD") && (yoVar = this.yo) != null && !TextUtils.isEmpty(yoVar.bcc)) {
            str = this.yo.bcc;
        }
        this.dj = "VAST_ACTION_BUTTON";
        return str;
    }

    public int dj() {
        return this.zjm;
    }

    public String ivm() {
        return this.ivm;
    }

    public String lw() {
        return this.lw;
    }

    public String moa() {
        return this.moa;
    }

    public oa oa() {
        return this.f25594oa;
    }

    public moa uef() {
        return this.uef.uef();
    }

    public Set<zjm> wrv() {
        return this.uef.oa();
    }

    public String xs() {
        return this.xs;
    }

    public yo yo() {
        return this.yo;
    }

    public int zjm() {
        return this.cz;
    }

    public void ivm(String str) {
        this.wrv = str;
    }

    public void lw(String str) {
        this.dj = str;
    }

    public void moa(String str) {
        this.xs = str;
    }

    public void oa(String str) {
        this.lw = str;
    }

    public void uef(oa oaVar) {
        if (oaVar != null) {
            oaVar.uef(this.xs);
        }
        this.f25594oa = oaVar;
    }

    public void yo(String str) {
        this.ivm = str;
    }

    public void oa(int i5) {
        this.zjm = i5;
    }

    public void uef(yo yoVar) {
        if (yoVar != null) {
            yoVar.uef(this.xs);
        }
        this.yo = yoVar;
    }

    public void uef(String str) {
        this.moa = str;
    }

    public void uef(double d3) {
        this.bcc = d3;
    }

    public static uef uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        uef uefVar = new uef();
        moa moaVarUef = uefVar.uef.uef();
        if (moaVarUef == null) {
            moaVarUef = new moa();
            uefVar.uef.uef(moaVarUef);
        }
        moaVarUef.uef(jSONObject.optJSONObject("videoTrackers"));
        uefVar.f25594oa = oa.uef(jSONObject.optJSONObject("vastIcon"));
        uefVar.yo = yo.oa(jSONObject.optJSONObject("endCard"));
        uefVar.moa = jSONObject.optString("title");
        uefVar.lw = jSONObject.optString("description");
        uefVar.ivm = jSONObject.optString("clickThroughUrl");
        uefVar.xs = jSONObject.optString("videoUrl");
        uefVar.bcc = jSONObject.optDouble("videDuration");
        uefVar.cz = jSONObject.optInt("videoWidth");
        uefVar.cz = jSONObject.optInt("videoHeight");
        Set<zjm> setOa = uefVar.uef.oa();
        if (setOa == null) {
            setOa = new HashSet<>();
            uefVar.uef.uef(setOa);
        }
        setOa.addAll(zjm.uef(jSONObject.optJSONArray("viewabilityVendor")));
        return uefVar;
    }

    public void uef(gzw gzwVar) {
        this.uef.uef(gzwVar);
        oa oaVar = this.f25594oa;
        if (oaVar != null) {
            oaVar.uef(gzwVar);
        }
        yo yoVar = this.yo;
        if (yoVar != null) {
            yoVar.uef(gzwVar);
        }
    }

    public void uef(int i5) {
        this.cz = i5;
    }

    public void uef(Set<zjm> set) {
        this.uef.oa(set);
    }
}
