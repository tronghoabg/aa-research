package com.bytedance.adsdk.uef.oa.oa.uef;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xs implements com.bytedance.adsdk.uef.oa.oa.uef {
    private final Object uef;

    public xs(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.uef = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.uef = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase("null")) {
                throw new IllegalArgumentException();
            }
            this.uef = null;
        }
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public String oa() {
        Object obj = this.uef;
        return obj != null ? obj.toString() : "NULL";
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.uef + "]";
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public Object uef(Map<String, JSONObject> map) {
        return this.uef;
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public com.bytedance.adsdk.uef.oa.moa.lw uef() {
        return com.bytedance.adsdk.uef.oa.moa.ivm.CONSTANT;
    }
}
