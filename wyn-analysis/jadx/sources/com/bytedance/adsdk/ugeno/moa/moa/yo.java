package com.bytedance.adsdk.ugeno.moa.moa;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.moa.ivm;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class yo {
    protected String bcc;
    protected String cz;
    protected String ivm;
    protected Map<String, Object> lw;
    protected ivm.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.oa.yo f24741oa;
    protected com.bytedance.adsdk.ugeno.moa.dj uef;
    protected String xs;
    protected com.bytedance.adsdk.ugeno.moa.ivm yo;
    protected Context zjm;

    public static class uef {
        public static yo uef(Context context, com.bytedance.adsdk.ugeno.oa.yo yoVar, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.moa.ivm ivmVarUef;
            ivm.uef uefVarUef;
            if (yoVar == null || jSONObject == null || (ivmVarUef = com.bytedance.adsdk.ugeno.moa.ivm.uef(jSONObject, jSONObject2)) == null || (uefVarUef = ivmVarUef.uef()) == null) {
                return null;
            }
            String strUef = uefVarUef.uef();
            if (TextUtils.equals(strUef, "custom")) {
                moa moaVar = new moa(context);
                moaVar.uef(yoVar);
                moaVar.uef(ivmVarUef);
                moaVar.yo();
                return moaVar;
            }
            com.bytedance.adsdk.ugeno.moa.xs xsVarUef = (TextUtils.isEmpty(strUef) || TextUtils.equals(strUef, "global")) ? com.bytedance.adsdk.ugeno.moa.zjm.uef(uefVarUef.oa()) : com.bytedance.adsdk.ugeno.moa.zjm.uef(uefVarUef.lw());
            if (xsVarUef == null) {
                return null;
            }
            yo yoVarUef = xsVarUef.uef(context);
            yoVarUef.uef(yoVar);
            yoVarUef.uef(ivmVarUef);
            yoVarUef.yo();
            return yoVarUef;
        }
    }

    public yo(Context context) {
        this.zjm = context;
    }

    public String ivm() {
        return this.cz;
    }

    public String lw() {
        return this.bcc;
    }

    public String moa() {
        return this.ivm;
    }

    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        this.f24741oa = yoVar;
    }

    public abstract boolean uef(Object... objArr);

    public com.bytedance.adsdk.ugeno.moa.ivm xs() {
        return this.yo;
    }

    public void yo() {
        this.moa = this.yo.uef();
        com.bytedance.adsdk.ugeno.moa.ivm ivmVar = this.yo;
        if (ivmVar == null) {
            return;
        }
        ivm.uef uefVarUef = ivmVar.uef();
        this.moa = uefVarUef;
        if (uefVarUef == null) {
            return;
        }
        this.lw = uefVarUef.yo();
        this.ivm = this.moa.oa();
        this.xs = this.moa.uef();
        this.bcc = this.moa.moa();
        this.cz = this.moa.lw();
    }

    public void uef(com.bytedance.adsdk.ugeno.moa.ivm ivmVar) {
        this.yo = ivmVar;
    }

    public void uef(com.bytedance.adsdk.ugeno.moa.dj djVar) {
        this.uef = djVar;
    }
}
