package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.sy;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {
    private static final ConcurrentHashMap<String, oa> uef = new ConcurrentHashMap<>();

    private static HashMap<String, oa> oa(JSONArray jSONArray) {
        HashMap<String, oa> map = new HashMap<>();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            try {
                oa oaVarUef = uef(jSONArray.getJSONObject(i5));
                if (oaVarUef != null) {
                    map.put(oaVarUef.uef, oaVarUef);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    public static void uef(boolean z2) {
        File fileOa = oa();
        if (fileOa.exists()) {
            try {
                HashMap<String, oa> mapOa = oa(new JSONArray(new String(com.bytedance.sdk.component.utils.xs.moa(fileOa))));
                if (mapOa.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, oa> entry : mapOa.entrySet()) {
                    uef.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    private static File oa() {
        return com.bytedance.sdk.component.utils.xs.uef(sy.uef(), sy.uef().getFilesDir(), "tt_ads_conf_sr");
    }

    private static oa oa(String str) {
        return new oa(str, 1);
    }

    private static oa uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new oa(jSONObject);
    }

    public static oa uef(String str) {
        oa oaVar = uef.get(str);
        return oaVar == null ? oa(str) : oaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void uef(org.json.JSONArray r5) throws java.lang.Throwable {
        /*
            if (r5 != 0) goto L4
            goto L99
        L4:
            java.io.File r0 = oa()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r0.getParent()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.getName()
            r3.append(r4)
            java.lang.String r4 = ".tmp"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r2 = 0
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            if (r3 == 0) goto L35
            r1.delete()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            goto L35
        L31:
            r5 = move-exception
            goto L9a
        L33:
            r0 = move-exception
            goto L56
        L35:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r3.write(r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r1.renameTo(r0)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r0 = r1.exists()
            if (r0 == 0) goto L4d
            r1.delete()
        L4d:
            com.bytedance.sdk.openadsdk.utils.cq.uef(r3)
            goto L69
        L51:
            r5 = move-exception
            r2 = r3
            goto L9a
        L54:
            r0 = move-exception
            r2 = r3
        L56:
            java.lang.String r3 = "SdkSettings.AdSlot"
            java.lang.String r4 = "saveAdSlotToLocal: "
            android.util.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L31
            boolean r0 = r1.exists()
            if (r0 == 0) goto L66
            r1.delete()
        L66:
            com.bytedance.sdk.openadsdk.utils.cq.uef(r2)
        L69:
            java.util.HashMap r5 = oa(r5)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L99
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L7b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            com.bytedance.sdk.openadsdk.core.settings.oa r0 = (com.bytedance.sdk.openadsdk.core.settings.oa) r0
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.oa> r2 = com.bytedance.sdk.openadsdk.core.settings.yo.uef
            r2.put(r1, r0)
            goto L7b
        L99:
            return
        L9a:
            boolean r0 = r1.exists()
            if (r0 == 0) goto La3
            r1.delete()
        La3:
            com.bytedance.sdk.openadsdk.utils.cq.uef(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.yo.uef(org.json.JSONArray):void");
    }

    public static void uef() {
        File fileOa = oa();
        if (fileOa.exists()) {
            fileOa.delete();
        }
    }
}
