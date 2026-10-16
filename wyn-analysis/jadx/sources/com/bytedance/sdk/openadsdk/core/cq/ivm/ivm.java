package com.bytedance.sdk.openadsdk.core.cq.ivm;

import android.content.Context;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oib;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm {
    private final String uef = "UGenV3OpenLinks";

    /* renamed from: oa, reason: collision with root package name */
    private final String f25505oa = "landingStyle";
    private final String yo = "url";
    private final String moa = "fallbackUrl";

    public void uef(Context context, boolean z2, gzw gzwVar, String str, Map<String, Object> map, com.bytedance.sdk.openadsdk.core.widget.lw lwVar) {
        int i5;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            Object obj = map.get("landingStyle");
            Object obj2 = map.get("url");
            Object obj3 = map.get("fallbackUrl");
            if (obj != null) {
                try {
                    i5 = Integer.parseInt(String.valueOf(obj));
                } catch (Throwable unused) {
                }
            } else {
                i5 = -1;
            }
            if (uef(i5, obj2 != null ? String.valueOf(obj2) : null, obj3 != null ? String.valueOf(obj3) : null)) {
                oib.uef(context, z2, uef(map), gzwVar, str, gb.uef(str), null, lwVar);
            }
        } catch (Throwable th) {
            dhk.yo("UGenV3OpenLinks", th.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean uef(int r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L1f
            r2 = 2
            if (r4 == r2) goto Lb
            r6 = 3
            if (r4 == r6) goto L1f
            goto L26
        Lb:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L18
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L18
            return r0
        L18:
            boolean r4 = com.bytedance.sdk.component.utils.sy.uef(r6)
            if (r4 != 0) goto L26
            return r0
        L1f:
            boolean r4 = com.bytedance.sdk.component.utils.sy.uef(r5)
            if (r4 != 0) goto L26
            return r0
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cq.ivm.ivm.uef(int, java.lang.String, java.lang.String):boolean");
    }

    private JSONObject uef(Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        jSONObject.put(entry.getKey(), String.valueOf(value));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
