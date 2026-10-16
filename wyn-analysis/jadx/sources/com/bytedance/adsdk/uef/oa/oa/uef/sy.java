package com.bytedance.adsdk.uef.oa.oa.uef;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sy extends bs {
    private static final ThreadLocal<StringBuilder> moa = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.uef.oa.oa.uef.sy.1
        @Override // java.lang.ThreadLocal
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public sy() {
        super(com.bytedance.adsdk.uef.oa.moa.yo.PLUS);
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public Object uef(Map<String, JSONObject> map) {
        Object objUef;
        Object objUef2 = this.uef.uef(map);
        if (objUef2 == null || (objUef = this.f24662oa.uef(map)) == null) {
            return null;
        }
        if (!(objUef2 instanceof String) && !(objUef instanceof String)) {
            return com.bytedance.adsdk.uef.oa.lw.uef.bcc.uef((Number) objUef2, (Number) objUef);
        }
        StringBuilder sb2 = moa.get();
        sb2.append(objUef2);
        sb2.append(objUef);
        String string = sb2.toString();
        sb2.setLength(0);
        return string;
    }
}
