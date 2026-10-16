package com.bytedance.adsdk.uef.oa.oa.uef;

import java.util.Map;
import org.json.JSONObject;
import wg.b;

/* loaded from: classes.dex */
public class dhk implements com.bytedance.adsdk.uef.oa.oa.uef {
    private final String uef;

    public dhk(String str) {
        this.uef = str;
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public String oa() {
        return b.c(new StringBuilder("'"), this.uef, "'");
    }

    public String toString() {
        return oa();
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public Object uef(Map<String, JSONObject> map) {
        return this.uef;
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public com.bytedance.adsdk.uef.oa.moa.lw uef() {
        return com.bytedance.adsdk.uef.oa.moa.ivm.STRING;
    }
}
