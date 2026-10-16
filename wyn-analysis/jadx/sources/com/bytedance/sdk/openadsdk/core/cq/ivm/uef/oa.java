package com.bytedance.sdk.openadsdk.core.cq.ivm.uef;

import com.bytedance.sdk.openadsdk.core.model.gzw;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class oa {
    protected gzw uef;

    public static class uef {
        public static oa uef(gzw gzwVar, com.bytedance.sdk.openadsdk.core.cq.ivm.uef uefVar) {
            if (gzwVar == null) {
                return null;
            }
            int iEpe = gzwVar.epe();
            if (iEpe == 1) {
                return new com.bytedance.sdk.openadsdk.core.cq.ivm.uef.uef(gzwVar, uefVar);
            }
            if (iEpe == 3) {
                return new moa(gzwVar, uefVar);
            }
            if (iEpe == 7 || iEpe == 8) {
                return new lw(gzwVar, uefVar);
            }
            return null;
        }
    }

    public oa(gzw gzwVar) {
        this.uef = gzwVar;
    }

    public abstract JSONObject oa();

    public abstract String uef();

    public void uef(JSONObject jSONObject) {
    }
}
