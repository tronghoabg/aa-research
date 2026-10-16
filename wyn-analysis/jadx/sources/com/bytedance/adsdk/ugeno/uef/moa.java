package com.bytedance.adsdk.ugeno.uef;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.uef.yo;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class moa {
    private static String moa(String str, JSONObject jSONObject) {
        String strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(str, jSONObject);
        return yo(strUef) ? Arrays.toString(oa(strUef, jSONObject)) : com.bytedance.adsdk.ugeno.yo.oa.uef(strUef, jSONObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.animation.Interpolator oa(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 2
            r2 = 1
            switch(r0) {
                case -1965072618: goto L28;
                case -1102672091: goto L1e;
                case -787702915: goto L14;
                case 1065009829: goto La;
                default: goto L9;
            }
        L9:
            goto L32
        La:
            java.lang.String r0 = "ease_in_out"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            r3 = r2
            goto L33
        L14:
            java.lang.String r0 = "ease_out"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            r3 = r1
            goto L33
        L1e:
            java.lang.String r0 = "linear"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            r3 = 3
            goto L33
        L28:
            java.lang.String r0 = "ease_in"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            r3 = 0
            goto L33
        L32:
            r3 = -1
        L33:
            if (r3 == 0) goto L4b
            if (r3 == r2) goto L45
            if (r3 == r1) goto L3f
            android.view.animation.LinearInterpolator r3 = new android.view.animation.LinearInterpolator
            r3.<init>()
            return r3
        L3f:
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            return r3
        L45:
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            return r3
        L4b:
            android.view.animation.AccelerateInterpolator r3 = new android.view.animation.AccelerateInterpolator
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.uef.moa.oa(java.lang.String):android.view.animation.Interpolator");
    }

    public static int uef(int i5) {
        if (i5 < 0) {
            return -1;
        }
        if (i5 == 0) {
            return Integer.MIN_VALUE;
        }
        return i5 - 1;
    }

    public static boolean yo(String str) {
        JSONArray jSONArrayUef = com.bytedance.adsdk.ugeno.xs.oa.uef(str, (JSONArray) null);
        return jSONArrayUef != null && jSONArrayUef.length() > 0;
    }

    public static List<yo> uef(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(uef(jSONObjectOptJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static yo.uef yo(String str, JSONObject jSONObject) {
        JSONArray jSONArrayUef;
        if (TextUtils.isEmpty(str) || (jSONArrayUef = com.bytedance.adsdk.ugeno.xs.oa.uef(str, (JSONArray) null)) == null || jSONArrayUef.length() != 2) {
            return null;
        }
        yo.uef uefVar = new yo.uef();
        uefVar.uef = com.bytedance.adsdk.ugeno.yo.oa.uef(jSONArrayUef.optString(0), jSONObject);
        uefVar.f24773oa = com.bytedance.adsdk.ugeno.yo.oa.uef(jSONArrayUef.optString(1), jSONObject);
        return uefVar;
    }

    public static float[] oa(String str, JSONObject jSONObject) {
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        JSONArray jSONArrayUef = com.bytedance.adsdk.ugeno.xs.oa.uef(str, (JSONArray) null);
        if (jSONArrayUef != null && jSONArrayUef.length() == 2) {
            fArr[0] = (float) com.bytedance.adsdk.ugeno.xs.yo.uef(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONArrayUef.optString(0), jSONObject), 0.0d);
            fArr[1] = (float) com.bytedance.adsdk.ugeno.xs.yo.uef(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONArrayUef.optString(1), jSONObject), 0.0d);
        }
        return fArr;
    }

    public static yo uef(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        yo yoVar = new yo();
        yoVar.oa(com.bytedance.adsdk.ugeno.xs.yo.uef(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("delay"), jSONObject2), 0L));
        yoVar.yo(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString(MediationMetaData.KEY_NAME), jSONObject2));
        yoVar.oa(com.bytedance.adsdk.ugeno.xs.yo.uef(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("playState"), jSONObject2), 1));
        yoVar.uef(Math.max(com.bytedance.adsdk.ugeno.xs.yo.uef(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("duration"), jSONObject2), 0L), 0L));
        yoVar.uef(com.bytedance.adsdk.ugeno.xs.yo.uef(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("playCount"), jSONObject2), 1));
        yoVar.uef(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("playDirection"), jSONObject2));
        yoVar.uef(yo(jSONObject.optString("transformOrigin"), jSONObject2));
        yoVar.oa(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        yoVar.uef(jSONObject.optJSONObject("effect"));
        yoVar.uef(uef(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return yoVar;
    }

    public static Map<String, TreeMap<Float, String>> uef(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR)) {
                        TreeMap treeMap = (TreeMap) map.get(next);
                        if (treeMap == null) {
                            treeMap = new TreeMap();
                            map.put(next, treeMap);
                        }
                        treeMap.put(Float.valueOf(fOptDouble), moa(jSONObjectOptJSONObject.optString(next), jSONObject));
                    }
                }
            }
        }
        return map;
    }

    public static int uef(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1408024454) {
            return str.equals("alternate") ? 2 : 1;
        }
        if (iHashCode != -1039745817) {
            return 1;
        }
        str.equals("normal");
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int uef(java.lang.String r6, int r7) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            int r3 = r7 / 2
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto Ld
            goto L73
        Ld:
            r6.getClass()
            r4 = -1
            int r5 = r6.hashCode()
            switch(r5) {
                case -1383228885: goto L44;
                case -1364013995: goto L39;
                case 115029: goto L30;
                case 3317767: goto L25;
                case 108511772: goto L1a;
                default: goto L18;
            }
        L18:
            r2 = r4
            goto L4e
        L1a:
            java.lang.String r2 = "right"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L23
            goto L18
        L23:
            r2 = 4
            goto L4e
        L25:
            java.lang.String r2 = "left"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L2e
            goto L18
        L2e:
            r2 = 3
            goto L4e
        L30:
            java.lang.String r5 = "top"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L4e
            goto L18
        L39:
            java.lang.String r2 = "center"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L42
            goto L18
        L42:
            r2 = r0
            goto L4e
        L44:
            java.lang.String r2 = "bottom"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L4d
            goto L18
        L4d:
            r2 = r1
        L4e:
            switch(r2) {
                case 0: goto L74;
                case 1: goto L73;
                case 2: goto L72;
                case 3: goto L72;
                case 4: goto L74;
                default: goto L51;
            }
        L51:
            java.lang.String r2 = "%"
            boolean r2 = r6.endsWith(r2)
            if (r2 == 0) goto L6d
            int r2 = r6.length()     // Catch: java.lang.NumberFormatException -> L73
            int r2 = r2 - r0
            java.lang.String r6 = r6.substring(r1, r2)     // Catch: java.lang.NumberFormatException -> L73
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.NumberFormatException -> L73
            float r7 = (float) r7     // Catch: java.lang.NumberFormatException -> L73
            float r7 = r7 * r6
            r6 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r6
            int r6 = (int) r7     // Catch: java.lang.NumberFormatException -> L73
            return r6
        L6d:
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L73
            return r6
        L72:
            return r1
        L73:
            return r3
        L74:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.uef.moa.uef(java.lang.String, int):int");
    }
}
