package com.bytedance.adsdk.uef.oa.moa;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum uef implements lw {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, uef> moa = new HashMap(128);

    static {
        for (uef uefVar : values()) {
            moa.put(uefVar.name().toLowerCase(), uefVar);
        }
    }

    public static uef uef(String str) {
        return moa.get(str.toLowerCase());
    }
}
