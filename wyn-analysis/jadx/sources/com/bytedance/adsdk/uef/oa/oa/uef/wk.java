package com.bytedance.adsdk.uef.oa.oa.uef;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wk implements com.bytedance.adsdk.uef.oa.oa.uef {
    private Number uef;

    public wk(String str) throws NumberFormatException {
        if (str.indexOf(46) < 0) {
            try {
                this.uef = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                this.uef = Long.valueOf(str);
            }
        } else {
            Float fValueOf = Float.valueOf(str);
            this.uef = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.uef = Double.valueOf(str);
            }
        }
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public String oa() {
        return this.uef.toString();
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
        return com.bytedance.adsdk.uef.oa.moa.ivm.NUMBER;
    }
}
