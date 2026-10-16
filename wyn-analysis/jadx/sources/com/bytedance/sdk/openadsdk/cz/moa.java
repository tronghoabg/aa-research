package com.bytedance.sdk.openadsdk.cz;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.oyt;
import java.util.Map;

/* loaded from: classes3.dex */
public final class moa extends uef {
    public static yo uef;

    public static String uef(com.bytedance.sdk.component.xs.oa.yo yoVar, String str) {
        yo yoVarUef;
        Map map;
        if (!oyt.yo() || (yoVarUef = oa.uef("net")) == null || (map = (Map) yoVarUef.uef(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                yoVar.oa(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
