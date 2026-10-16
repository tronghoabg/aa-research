package com.bytedance.adsdk.oa.lw;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.oa.xs;
import com.bytedance.adsdk.oa.yo.yo.lw;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gzw {
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.bytedance.adsdk.oa.zjm.uef> moa(android.util.JsonReader r5) throws java.io.IOException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lce
            r0.<init>()     // Catch: java.lang.Exception -> Lce
        L5:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> Lce
            if (r1 == 0) goto Lcd
            com.bytedance.adsdk.oa.zjm$uef r1 = new com.bytedance.adsdk.oa.zjm$uef     // Catch: java.lang.Exception -> Lce
            r1.<init>()     // Catch: java.lang.Exception -> Lce
            r5.beginObject()     // Catch: java.lang.Exception -> Lce
        L13:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Exception -> Lce
            if (r2 == 0) goto Lc5
            java.lang.String r2 = r5.nextName()     // Catch: java.lang.Exception -> Lce
            int r3 = r2.hashCode()     // Catch: java.lang.Exception -> Lce
            r4 = 99
            if (r3 == r4) goto L7b
            r4 = 102(0x66, float:1.43E-43)
            if (r3 == r4) goto L71
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L67
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L5d
            r4 = 3153(0xc51, float:4.418E-42)
            if (r3 == r4) goto L53
            r4 = 3449(0xd79, float:4.833E-42)
            if (r3 == r4) goto L49
            r4 = 96670(0x1799e, float:1.35464E-40)
            if (r3 == r4) goto L3f
            goto L85
        L3f:
            java.lang.String r3 = "ali"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lce
            if (r2 == 0) goto L85
            r2 = 6
            goto L86
        L49:
            java.lang.String r3 = "le"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lce
            if (r2 == 0) goto L85
            r2 = 1
            goto L86
        L53:
            java.lang.String r3 = "bs"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lce
            if (r2 == 0) goto L85
            r2 = 5
            goto L86
        L5d:
            java.lang.String r3 = "s"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lce
            if (r2 == 0) goto L85
            r2 = 2
            goto L86
        L67:
            java.lang.String r3 = "l"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lce
            if (r2 == 0) goto L85
            r2 = 0
            goto L86
        L71:
            java.lang.String r3 = "f"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lce
            if (r2 == 0) goto L85
            r2 = 4
            goto L86
        L7b:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lce
            if (r2 == 0) goto L85
            r2 = 3
            goto L86
        L85:
            r2 = -1
        L86:
            switch(r2) {
                case 0: goto Lbd;
                case 1: goto Lb5;
                case 2: goto Lad;
                case 3: goto La5;
                case 4: goto L9d;
                case 5: goto L95;
                case 6: goto L8d;
                default: goto L89;
            }     // Catch: java.lang.Exception -> Lce
        L89:
            r5.skipValue()     // Catch: java.lang.Exception -> Lce
            goto L13
        L8d:
            java.lang.String r2 = r5.nextString()     // Catch: java.lang.Exception -> Lce
            r1.xs = r2     // Catch: java.lang.Exception -> Lce
            goto L13
        L95:
            int r2 = r5.nextInt()     // Catch: java.lang.Exception -> Lce
            r1.ivm = r2     // Catch: java.lang.Exception -> Lce
            goto L13
        L9d:
            java.lang.String r2 = r5.nextString()     // Catch: java.lang.Exception -> Lce
            r1.moa = r2     // Catch: java.lang.Exception -> Lce
            goto L13
        La5:
            java.lang.String r2 = r5.nextString()     // Catch: java.lang.Exception -> Lce
            r1.yo = r2     // Catch: java.lang.Exception -> Lce
            goto L13
        Lad:
            int r2 = r5.nextInt()     // Catch: java.lang.Exception -> Lce
            r1.lw = r2     // Catch: java.lang.Exception -> Lce
            goto L13
        Lb5:
            int r2 = r5.nextInt()     // Catch: java.lang.Exception -> Lce
            r1.f24655oa = r2     // Catch: java.lang.Exception -> Lce
            goto L13
        Lbd:
            int r2 = r5.nextInt()     // Catch: java.lang.Exception -> Lce
            r1.uef = r2     // Catch: java.lang.Exception -> Lce
            goto L13
        Lc5:
            r5.endObject()     // Catch: java.lang.Exception -> Lce
            r0.add(r1)     // Catch: java.lang.Exception -> Lce
            goto L5
        Lcd:
            return r0
        Lce:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.lw.gzw.moa(android.util.JsonReader):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void oa(android.util.JsonReader r5, com.bytedance.adsdk.oa.xs.uef r6) throws java.io.IOException {
        /*
            r5.beginObject()     // Catch: java.io.IOException -> L62
        L3:
            boolean r0 = r5.hasNext()     // Catch: java.io.IOException -> L62
            if (r0 == 0) goto L5f
            java.lang.String r0 = r5.nextName()     // Catch: java.io.IOException -> L62
            int r1 = r0.hashCode()     // Catch: java.io.IOException -> L62
            r2 = 3239(0xca7, float:4.539E-42)
            r3 = 1
            r4 = 2
            if (r1 == r2) goto L35
            r2 = 3276(0xccc, float:4.59E-42)
            if (r1 == r2) goto L2b
            r2 = 107027(0x1a213, float:1.49977E-40)
            if (r1 == r2) goto L21
            goto L3f
        L21:
            java.lang.String r1 = "lel"
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L62
            if (r0 == 0) goto L3f
            r0 = r4
            goto L40
        L2b:
            java.lang.String r1 = "fr"
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L62
            if (r0 == 0) goto L3f
            r0 = 0
            goto L40
        L35:
            java.lang.String r1 = "el"
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L62
            if (r0 == 0) goto L3f
            r0 = r3
            goto L40
        L3f:
            r0 = -1
        L40:
            if (r0 == 0) goto L58
            if (r0 == r3) goto L51
            if (r0 == r4) goto L4a
            r5.skipValue()     // Catch: java.io.IOException -> L62
            goto L3
        L4a:
            org.json.JSONArray r0 = yo(r5)     // Catch: java.io.IOException -> L62
            r6.xs = r0     // Catch: java.io.IOException -> L62
            goto L3
        L51:
            java.lang.String r0 = r5.nextString()     // Catch: java.io.IOException -> L62
            r6.ivm = r0     // Catch: java.io.IOException -> L62
            goto L3
        L58:
            int r0 = r5.nextInt()     // Catch: java.io.IOException -> L62
            r6.lw = r0     // Catch: java.io.IOException -> L62
            goto L3
        L5f:
            r5.endObject()     // Catch: java.io.IOException -> L62
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.lw.gzw.oa(android.util.JsonReader, com.bytedance.adsdk.oa.xs$uef):void");
    }

    public static com.bytedance.adsdk.oa.xs uef(JsonReader jsonReader) throws JSONException, IOException {
        float f10;
        xs.yo yoVar;
        float fUef = com.bytedance.adsdk.oa.ivm.ivm.uef();
        LongSparseArray<com.bytedance.adsdk.oa.yo.yo.lw> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.oa.yo.moa> sparseArray = new SparseArray<>();
        xs.yo yoVar2 = new xs.yo();
        xs.uef uefVar = new xs.uef();
        xs.oa oaVar = new xs.oa();
        com.bytedance.adsdk.oa.xs xsVar = new com.bytedance.adsdk.oa.xs();
        jsonReader.beginObject();
        float fNextDouble = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float fNextDouble2 = 0.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        String strNextString = null;
        float fNextDouble3 = 0.0f;
        while (jsonReader.hasNext()) {
            float f11 = fUef;
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            char c10 = 65535;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    f10 = fNextDouble;
                    if (strNextName.equals("assets")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1109732030:
                    f10 = fNextDouble;
                    if (strNextName.equals("layers")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -865448777:
                    f10 = fNextDouble;
                    if (strNextName.equals("globalEvent")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 104:
                    f10 = fNextDouble;
                    if (strNextName.equals("h")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 118:
                    f10 = fNextDouble;
                    if (strNextName.equals("v")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 119:
                    f10 = fNextDouble;
                    if (strNextName.equals(OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX)) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3208:
                    f10 = fNextDouble;
                    if (strNextName.equals("dl")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3276:
                    f10 = fNextDouble;
                    if (strNextName.equals("fr")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3292:
                    f10 = fNextDouble;
                    if (strNextName.equals("gc")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 3367:
                    f10 = fNextDouble;
                    if (strNextName.equals("ip")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 3553:
                    f10 = fNextDouble;
                    if (strNextName.equals("op")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 94623709:
                    f10 = fNextDouble;
                    if (strNextName.equals("chars")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 97615364:
                    f10 = fNextDouble;
                    if (strNextName.equals("fonts")) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case 110364485:
                    f10 = fNextDouble;
                    if (strNextName.equals("timer")) {
                        c10 = '\r';
                        break;
                    }
                    break;
                case 839250809:
                    f10 = fNextDouble;
                    if (strNextName.equals("markers")) {
                        c10 = 14;
                        break;
                    }
                    break;
                default:
                    f10 = fNextDouble;
                    break;
            }
            switch (c10) {
                case 0:
                    yoVar = yoVar2;
                    uef(jsonReader, xsVar, map, map2);
                    yoVar2 = yoVar;
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case 1:
                    yoVar = yoVar2;
                    uef(jsonReader, xsVar, arrayList, longSparseArray);
                    yoVar2 = yoVar;
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case 2:
                    yoVar = yoVar2;
                    uef(jsonReader, oaVar);
                    yoVar2 = yoVar;
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case 3:
                    iNextInt = jsonReader.nextInt();
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case 4:
                    yoVar = yoVar2;
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.oa.ivm.ivm.uef(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        xsVar.uef("Lottie only supports bodymovin >= 4.4.0");
                    }
                    yoVar2 = yoVar;
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case 5:
                    iNextInt2 = jsonReader.nextInt();
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case 7:
                    yoVar = yoVar2;
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    yoVar2 = yoVar;
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case '\b':
                    yoVar = yoVar2;
                    uef(jsonReader, uefVar);
                    yoVar2 = yoVar;
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case '\t':
                    yoVar2 = yoVar2;
                    fNextDouble = (float) jsonReader.nextDouble();
                    fUef = f11;
                    break;
                case '\n':
                    yoVar = yoVar2;
                    fNextDouble3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    yoVar2 = yoVar;
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case 11:
                    uef(jsonReader, xsVar, sparseArray);
                    yoVar = yoVar2;
                    yoVar2 = yoVar;
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case '\f':
                    uef(jsonReader, map3);
                    yoVar = yoVar2;
                    yoVar2 = yoVar;
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case '\r':
                    uef(jsonReader, yoVar2);
                    yoVar = yoVar2;
                    yoVar2 = yoVar;
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                case 14:
                    uef(jsonReader, arrayList2);
                    yoVar = yoVar2;
                    yoVar2 = yoVar;
                    fUef = f11;
                    fNextDouble = f10;
                    break;
                default:
                    jsonReader.skipValue();
                    yoVar = yoVar2;
                    yoVar2 = yoVar;
                    fUef = f11;
                    fNextDouble = f10;
                    break;
            }
        }
        float f12 = fUef;
        jsonReader.endObject();
        xsVar.uef(new Rect(0, 0, (int) (iNextInt2 * f12), (int) (iNextInt * f12)), fNextDouble, fNextDouble3, fNextDouble2, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, yoVar2, strNextString, uefVar, oaVar);
        return xsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONArray yo(android.util.JsonReader r8) throws org.json.JSONException, java.io.IOException {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r8.beginArray()     // Catch: java.lang.Exception -> L66
        L8:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> L66
            if (r1 == 0) goto L63
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L66
            r1.<init>()     // Catch: java.lang.Exception -> L66
            r0.put(r1)     // Catch: java.lang.Exception -> L66
            r8.beginObject()     // Catch: java.lang.Exception -> L66
        L19:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L5f
            java.lang.String r2 = r8.nextName()     // Catch: java.lang.Exception -> L66
            int r3 = r2.hashCode()     // Catch: java.lang.Exception -> L66
            r4 = 3324(0xcfc, float:4.658E-42)
            r5 = 1
            java.lang.String r6 = "hd"
            java.lang.String r7 = "vid"
            if (r3 == r4) goto L3e
            r4 = 116753(0x1c811, float:1.63606E-40)
            if (r3 == r4) goto L36
            goto L46
        L36:
            boolean r2 = r2.equals(r7)     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L46
            r2 = 0
            goto L47
        L3e:
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L46
            r2 = r5
            goto L47
        L46:
            r2 = -1
        L47:
            if (r2 == 0) goto L57
            if (r2 == r5) goto L4f
            r8.skipValue()     // Catch: java.lang.Exception -> L66
            goto L19
        L4f:
            int r2 = r8.nextInt()     // Catch: org.json.JSONException -> L19 java.lang.Exception -> L66
            r1.put(r6, r2)     // Catch: org.json.JSONException -> L19 java.lang.Exception -> L66
            goto L19
        L57:
            java.lang.String r2 = r8.nextString()     // Catch: org.json.JSONException -> L19 java.lang.Exception -> L66
            r1.put(r7, r2)     // Catch: org.json.JSONException -> L19 java.lang.Exception -> L66
            goto L19
        L5f:
            r8.endObject()     // Catch: java.lang.Exception -> L66
            goto L8
        L63:
            r8.endArray()     // Catch: java.lang.Exception -> L66
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.lw.gzw.yo(android.util.JsonReader):org.json.JSONArray");
    }

    private static Map<String, Object> oa(JsonReader jsonReader) throws JSONException, IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("lel")) {
                map.put("lel", yo(jsonReader));
            } else if (!strNextName.equals("lottie_back")) {
                jsonReader.skipValue();
            } else {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("hd")) {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        Object objRemove = map.remove("lottie_back");
        if (objRemove instanceof JSONObject) {
            Object obj = map.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(objRemove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(objRemove);
                map.put("lel", jSONArray);
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void uef(android.util.JsonReader r7, com.bytedance.adsdk.oa.xs.oa r8) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 1
            r7.beginObject()     // Catch: java.lang.Exception -> L91
        L5:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L8e
            java.lang.String r2 = r7.nextName()     // Catch: java.lang.Exception -> L91
            int r3 = r2.hashCode()     // Catch: java.lang.Exception -> L91
            r4 = 3239(0xca7, float:4.539E-42)
            r5 = 2
            r6 = -1
            if (r3 == r4) goto L38
            r4 = 107027(0x1a213, float:1.49977E-40)
            if (r3 == r4) goto L2e
            r4 = 3237004(0x31648c, float:4.536009E-39)
            if (r3 == r4) goto L24
            goto L42
        L24:
            java.lang.String r3 = "inel"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L42
            r2 = r0
            goto L43
        L2e:
            java.lang.String r3 = "lel"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L42
            r2 = r5
            goto L43
        L38:
            java.lang.String r3 = "el"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L42
            r2 = r1
            goto L43
        L42:
            r2 = r6
        L43:
            if (r2 == 0) goto L5b
            if (r2 == r1) goto L54
            if (r2 == r5) goto L4d
            r7.skipValue()     // Catch: java.lang.Exception -> L91
            goto L5
        L4d:
            org.json.JSONArray r2 = yo(r7)     // Catch: java.lang.Exception -> L91
            r8.yo = r2     // Catch: java.lang.Exception -> L91
            goto L5
        L54:
            java.lang.String r2 = r7.nextString()     // Catch: java.lang.Exception -> L91
            r8.uef = r2     // Catch: java.lang.Exception -> L91
            goto L5
        L5b:
            int[] r2 = new int[]{r6, r6}     // Catch: java.lang.Exception -> L91
            int[][] r3 = new int[r1][]     // Catch: java.lang.Exception -> L91
            r3[r0] = r2     // Catch: java.lang.Exception -> L91
            r8.f24602oa = r3     // Catch: java.lang.Exception -> L91
            r7.beginArray()     // Catch: java.lang.Exception -> L91
            boolean r2 = r7.hasNext()     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L89
            r7.beginArray()     // Catch: java.lang.Exception -> L91
            r2 = r0
        L72:
            if (r2 >= r5) goto L86
            boolean r3 = r7.hasNext()     // Catch: java.lang.Exception -> L91
            if (r3 == 0) goto L84
            int[][] r3 = r8.f24602oa     // Catch: java.lang.Exception -> L91
            r3 = r3[r0]     // Catch: java.lang.Exception -> L91
            int r4 = r7.nextInt()     // Catch: java.lang.Exception -> L91
            r3[r2] = r4     // Catch: java.lang.Exception -> L91
        L84:
            int r2 = r2 + r1
            goto L72
        L86:
            r7.endArray()     // Catch: java.lang.Exception -> L91
        L89:
            r7.endArray()     // Catch: java.lang.Exception -> L91
            goto L5
        L8e:
            r7.endObject()     // Catch: java.lang.Exception -> L91
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.lw.gzw.uef(android.util.JsonReader, com.bytedance.adsdk.oa.xs$oa):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void uef(android.util.JsonReader r7, com.bytedance.adsdk.oa.xs.uef r8) throws java.io.IOException {
        /*
            r7.beginObject()     // Catch: java.lang.Exception -> L91
        L3:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L8e
            java.lang.String r0 = r7.nextName()     // Catch: java.lang.Exception -> L91
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L91
            r2 = 3139(0xc43, float:4.399E-42)
            r3 = 1
            r4 = 2
            r5 = 3
            r6 = 4
            if (r1 == r2) goto L53
            r2 = 3232(0xca0, float:4.529E-42)
            if (r1 == r2) goto L49
            r2 = 3571(0xdf3, float:5.004E-42)
            if (r1 == r2) goto L3f
            r2 = 3666(0xe52, float:5.137E-42)
            if (r1 == r2) goto L35
            r2 = 98713(0x18199, float:1.38326E-40)
            if (r1 == r2) goto L2b
            goto L5d
        L2b:
            java.lang.String r1 = "cpf"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L5d
            r0 = r6
            goto L5e
        L35:
            java.lang.String r1 = "se"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L5d
            r0 = 0
            goto L5e
        L3f:
            java.lang.String r1 = "pc"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L5d
            r0 = r5
            goto L5e
        L49:
            java.lang.String r1 = "ee"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L5d
            r0 = r4
            goto L5e
        L53:
            java.lang.String r1 = "be"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L5d
            r0 = r3
            goto L5e
        L5d:
            r0 = -1
        L5e:
            if (r0 == 0) goto L86
            if (r0 == r3) goto L7e
            if (r0 == r4) goto L77
            if (r0 == r5) goto L70
            if (r0 == r6) goto L6c
            r7.skipValue()     // Catch: java.lang.Exception -> L91
            goto L3
        L6c:
            oa(r7, r8)     // Catch: java.lang.Exception -> L91
            goto L3
        L70:
            int r0 = r7.nextInt()     // Catch: java.lang.Exception -> L91
            r8.moa = r0     // Catch: java.lang.Exception -> L91
            goto L3
        L77:
            java.util.Map r0 = oa(r7)     // Catch: java.lang.Exception -> L91
            r8.yo = r0     // Catch: java.lang.Exception -> L91
            goto L3
        L7e:
            java.util.Map r0 = oa(r7)     // Catch: java.lang.Exception -> L91
            r8.f24605oa = r0     // Catch: java.lang.Exception -> L91
            goto L3
        L86:
            int r0 = r7.nextInt()     // Catch: java.lang.Exception -> L91
            r8.uef = r0     // Catch: java.lang.Exception -> L91
            goto L3
        L8e:
            r7.endObject()     // Catch: java.lang.Exception -> L91
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.lw.gzw.uef(android.util.JsonReader, com.bytedance.adsdk.oa.xs$uef):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void uef(android.util.JsonReader r6, com.bytedance.adsdk.oa.xs.yo r7) throws java.io.IOException {
        /*
            r6.beginObject()     // Catch: java.lang.Exception -> Ld5
        L3:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> Ld5
            if (r0 == 0) goto Ld2
            java.lang.String r0 = r6.nextName()     // Catch: java.lang.Exception -> Ld5
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> Ld5
            r2 = 3123(0xc33, float:4.376E-42)
            r3 = 0
            r4 = 2
            r5 = -1
            if (r1 == r2) goto L6f
            r2 = 3239(0xca7, float:4.539E-42)
            if (r1 == r2) goto L65
            r2 = 3355(0xd1b, float:4.701E-42)
            if (r1 == r2) goto L5b
            r2 = 3418(0xd5a, float:4.79E-42)
            if (r1 == r2) goto L51
            r2 = 3704(0xe78, float:5.19E-42)
            if (r1 == r2) goto L47
            r2 = 107027(0x1a213, float:1.49977E-40)
            if (r1 == r2) goto L3d
            r2 = 3237004(0x31648c, float:4.536009E-39)
            if (r1 == r2) goto L33
            goto L79
        L33:
            java.lang.String r1 = "inel"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Ld5
            if (r0 == 0) goto L79
            r0 = 4
            goto L7a
        L3d:
            java.lang.String r1 = "lel"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Ld5
            if (r0 == 0) goto L79
            r0 = 6
            goto L7a
        L47:
            java.lang.String r1 = "tl"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Ld5
            if (r0 == 0) goto L79
            r0 = r4
            goto L7a
        L51:
            java.lang.String r1 = "ke"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Ld5
            if (r0 == 0) goto L79
            r0 = r3
            goto L7a
        L5b:
            java.lang.String r1 = "id"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Ld5
            if (r0 == 0) goto L79
            r0 = 1
            goto L7a
        L65:
            java.lang.String r1 = "el"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Ld5
            if (r0 == 0) goto L79
            r0 = 5
            goto L7a
        L6f:
            java.lang.String r1 = "at"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Ld5
            if (r0 == 0) goto L79
            r0 = 3
            goto L7a
        L79:
            r0 = r5
        L7a:
            switch(r0) {
                case 0: goto Lca;
                case 1: goto Lc2;
                case 2: goto Lba;
                case 3: goto Lb2;
                case 4: goto L91;
                case 5: goto L89;
                case 6: goto L81;
                default: goto L7d;
            }     // Catch: java.lang.Exception -> Ld5
        L7d:
            r6.skipValue()     // Catch: java.lang.Exception -> Ld5
            goto L3
        L81:
            org.json.JSONArray r0 = yo(r6)     // Catch: java.lang.Exception -> Ld5
            r7.xs = r0     // Catch: java.lang.Exception -> Ld5
            goto L3
        L89:
            java.lang.String r0 = r6.nextString()     // Catch: java.lang.Exception -> Ld5
            r7.ivm = r0     // Catch: java.lang.Exception -> Ld5
            goto L3
        L91:
            int[] r0 = new int[]{r5, r5}     // Catch: java.lang.Exception -> Ld5
            r7.lw = r0     // Catch: java.lang.Exception -> Ld5
            r6.beginArray()     // Catch: java.lang.Exception -> Ld5
        L9a:
            if (r3 >= r4) goto Lad
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> Ld5
            if (r0 == 0) goto Laa
            int[] r0 = r7.lw     // Catch: java.lang.Exception -> Ld5
            int r1 = r6.nextInt()     // Catch: java.lang.Exception -> Ld5
            r0[r3] = r1     // Catch: java.lang.Exception -> Ld5
        Laa:
            int r3 = r3 + 1
            goto L9a
        Lad:
            r6.endArray()     // Catch: java.lang.Exception -> Ld5
            goto L3
        Lb2:
            java.lang.String r0 = r6.nextString()     // Catch: java.lang.Exception -> Ld5
            r7.moa = r0     // Catch: java.lang.Exception -> Ld5
            goto L3
        Lba:
            java.lang.String r0 = r6.nextString()     // Catch: java.lang.Exception -> Ld5
            r7.yo = r0     // Catch: java.lang.Exception -> Ld5
            goto L3
        Lc2:
            java.lang.String r0 = r6.nextString()     // Catch: java.lang.Exception -> Ld5
            r7.f24607oa = r0     // Catch: java.lang.Exception -> Ld5
            goto L3
        Lca:
            int r0 = r6.nextInt()     // Catch: java.lang.Exception -> Ld5
            r7.uef = r0     // Catch: java.lang.Exception -> Ld5
            goto L3
        Ld2:
            r6.endObject()     // Catch: java.lang.Exception -> Ld5
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.lw.gzw.uef(android.util.JsonReader, com.bytedance.adsdk.oa.xs$yo):void");
    }

    private static void uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar, List<com.bytedance.adsdk.oa.yo.yo.lw> list, LongSparseArray<com.bytedance.adsdk.oa.yo.yo.lw> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.oa.yo.yo.lw lwVarUef = orq.uef(jsonReader, xsVar);
            lwVarUef.dj();
            lw.uef uefVar = lw.uef.PRE_COMP;
            list.add(lwVarUef);
            longSparseArray.put(lwVarUef.lw(), lwVarUef);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void uef(android.util.JsonReader r19, com.bytedance.adsdk.oa.xs r20, java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.oa.yo.yo.lw>> r21, java.util.Map<java.lang.String, com.bytedance.adsdk.oa.zjm> r22) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.lw.gzw.uef(android.util.JsonReader, com.bytedance.adsdk.oa.xs, java.util.Map, java.util.Map):void");
    }

    private static void uef(JsonReader jsonReader, Map<String, com.bytedance.adsdk.oa.yo.yo> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.oa.yo.yo yoVarUef = dz.uef(jsonReader);
                    map.put(yoVarUef.oa(), yoVarUef);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar, SparseArray<com.bytedance.adsdk.oa.yo.moa> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.oa.yo.moa moaVarUef = cq.uef(jsonReader, xsVar);
            sparseArray.put(moaVarUef.hashCode(), moaVarUef);
        }
        jsonReader.endArray();
    }

    private static void uef(JsonReader jsonReader, List<com.bytedance.adsdk.oa.yo.ivm> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.oa.yo.ivm(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
