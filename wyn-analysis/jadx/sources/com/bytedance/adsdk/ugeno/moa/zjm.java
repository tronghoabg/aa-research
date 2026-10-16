package com.bytedance.adsdk.ugeno.moa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class zjm {
    private static Map<String, xs> uef = new HashMap();

    public static void uef(List<xs> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (xs xsVar : list) {
            if (xsVar != null) {
                uef.put(xsVar.uef(), xsVar);
            }
        }
    }

    public static xs uef(String str) {
        return uef.get(str);
    }
}
