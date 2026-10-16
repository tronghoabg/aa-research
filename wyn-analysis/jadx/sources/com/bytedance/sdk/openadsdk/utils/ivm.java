package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class ivm {
    public static String uef(String str) {
        if (!com.bytedance.sdk.component.utils.wk.yo() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.zjm zjmVar = new com.bytedance.sdk.openadsdk.core.model.zjm(com.bytedance.sdk.openadsdk.core.zjm.oa().wrv());
        StringBuilder sb2 = new StringBuilder(str);
        Iterator<String> it = zjmVar.oa().iterator();
        while (it.hasNext()) {
            if (sb2.toString().contains(it.next())) {
                if (sb2.toString().contains("?")) {
                    sb2.append("&");
                    sb2.append(zjmVar.uef());
                } else {
                    sb2.append("?");
                    sb2.append(zjmVar.uef());
                }
            }
        }
        return sb2.toString();
    }
}
