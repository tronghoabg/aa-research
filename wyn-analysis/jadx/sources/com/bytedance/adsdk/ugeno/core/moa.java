package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class moa {
    private static Map<String, oa> uef = new HashMap();

    public static void uef(List<oa> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (oa oaVar : list) {
            if (oaVar != null) {
                uef.put(oaVar.uef(), oaVar);
            }
        }
    }

    public static oa uef(String str) {
        return uef.get(str);
    }
}
