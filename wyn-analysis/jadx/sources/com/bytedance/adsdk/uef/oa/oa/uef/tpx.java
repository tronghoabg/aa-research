package com.bytedance.adsdk.uef.oa.oa.uef;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tpx implements com.bytedance.adsdk.uef.oa.oa.uef {
    private com.bytedance.adsdk.uef.oa.moa.moa uef;

    public tpx(com.bytedance.adsdk.uef.oa.moa.moa moaVar) {
        this.uef = moaVar;
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public String oa() {
        return this.uef.uef();
    }

    public String toString() {
        return oa();
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public Object uef(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public com.bytedance.adsdk.uef.oa.moa.lw uef() {
        return this.uef;
    }
}
