package com.bytedance.adsdk.ugeno.yo;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.lw;
import com.bytedance.adsdk.ugeno.yo.uef;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oa {
    public static String uef(String str, JSONObject jSONObject) {
        uef uefVarYo;
        uef.InterfaceC0047uef interfaceC0047uefUef;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (uefVarYo = lw.uef().yo()) != null && (interfaceC0047uefUef = uefVarYo.uef(str.substring(2, str.length() - 1))) != null) {
                    return (String) interfaceC0047uefUef.uef(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static Object uef(Object obj, JSONObject jSONObject) {
        if (obj == null) {
            return null;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        return (strValueOf.startsWith("${") && strValueOf.endsWith("}")) ? uef(strValueOf, jSONObject) : obj;
    }
}
