package com.bytedance.adsdk.oa.lw;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.adsdk.oa.yo.yo.lw;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class orq {

    /* renamed from: com.bytedance.adsdk.oa.lw.orq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[lw.oa.values().length];
            uef = iArr;
            try {
                iArr[lw.oa.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[lw.oa.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.bytedance.adsdk.oa.yo.yo.lw uef(com.bytedance.adsdk.oa.xs xsVar) {
        Rect rectMoa = xsVar.moa();
        List list = Collections.EMPTY_LIST;
        return new com.bytedance.adsdk.oa.yo.yo.lw(list, xsVar, "__container", -1L, lw.uef.PRE_COMP, -1L, null, list, new com.bytedance.adsdk.oa.yo.uef.wrv(), 0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectMoa.width(), rectMoa.height(), null, null, list, lw.oa.NONE, null, false, null, null);
    }

    public static com.bytedance.adsdk.oa.yo.yo.lw uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        Float f10;
        int i5;
        lw.oa oaVar = lw.oa.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        String strNextString = "UNSET";
        String strNextString2 = null;
        Float fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Float fValueOf2 = Float.valueOf(1.0f);
        lw.oa oaVar2 = oaVar;
        com.bytedance.adsdk.oa.yo.uef.dj djVarUef = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef = null;
        com.bytedance.adsdk.oa.yo.oa.uef uefVarUef = null;
        zjm zjmVarUef = null;
        float fNextDouble = 0.0f;
        float fXs = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        Float f11 = fValueOf;
        long jNextInt = -1;
        float fNextDouble5 = 1.0f;
        int color = 0;
        int iNextInt = 0;
        int iUef = 0;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.oa.yo.uef.wrv wrvVarUef = null;
        com.bytedance.adsdk.oa.yo.uef.zjm zjmVarIvm = null;
        long jNextInt2 = 0;
        lw.uef uefVar = null;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parent":
                    jNextInt = jsonReader.nextInt();
                    break;
                case "shapes":
                    f10 = f11;
                    i5 = color;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.oa.yo.oa.yo yoVarUef = bcc.uef(jsonReader, xsVar);
                        if (yoVarUef != null) {
                            arrayList2.add(yoVarUef);
                        }
                    }
                    jsonReader.endArray();
                    f11 = f10;
                    color = i5;
                    break;
                case "h":
                    f10 = f11;
                    i5 = color;
                    fNextDouble3 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.oa.ivm.ivm.uef());
                    f11 = f10;
                    color = i5;
                    break;
                case "t":
                    f10 = f11;
                    i5 = color;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                djVarUef = oa.uef(jsonReader, xsVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (!strNextName2.equals("d")) {
                            jsonReader.skipValue();
                        } else {
                            zjmVarIvm = moa.ivm(jsonReader, xsVar);
                        }
                    }
                    jsonReader.endObject();
                    f11 = f10;
                    color = i5;
                    break;
                case "w":
                    f10 = f11;
                    i5 = color;
                    fNextDouble2 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.oa.ivm.ivm.uef());
                    f11 = f10;
                    color = i5;
                    break;
                case "cl":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "ef":
                    f10 = f11;
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (!strNextName3.equals("nm")) {
                                if (!strNextName3.equals("ty")) {
                                    jsonReader.skipValue();
                                } else {
                                    int iNextInt2 = jsonReader.nextInt();
                                    if (iNextInt2 == 29) {
                                        uefVarUef = lw.uef(jsonReader, xsVar);
                                    } else if (iNextInt2 == 25) {
                                        zjmVarUef = new dj().uef(jsonReader, xsVar);
                                    }
                                }
                            } else {
                                arrayList3.add(jsonReader.nextString());
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    xsVar.uef("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    f11 = f10;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ip":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ks":
                    wrvVarUef = yo.uef(jsonReader, xsVar);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "op":
                    fXs = (float) jsonReader.nextDouble();
                    break;
                case "sc":
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case "sh":
                    iUef = (int) (com.bytedance.adsdk.oa.ivm.ivm.uef() * jsonReader.nextInt());
                    break;
                case "sr":
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case "st":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sw":
                    f10 = f11;
                    iNextInt = (int) (jsonReader.nextInt() * com.bytedance.adsdk.oa.ivm.ivm.uef());
                    f11 = f10;
                    break;
                case "tm":
                    oaVarUef = moa.uef(jsonReader, xsVar, false);
                    break;
                case "tt":
                    f10 = f11;
                    int iNextInt3 = jsonReader.nextInt();
                    if (iNextInt3 >= lw.oa.values().length) {
                        xsVar.uef("Unsupported matte type: ".concat(String.valueOf(iNextInt3)));
                        i5 = color;
                        f11 = f10;
                        color = i5;
                        break;
                    } else {
                        oaVar2 = lw.oa.values()[iNextInt3];
                        int i10 = AnonymousClass1.uef[oaVar2.ordinal()];
                        if (i10 == 1) {
                            xsVar.uef("Unsupported matte type: Luma");
                        } else if (i10 == 2) {
                            xsVar.uef("Unsupported matte type: Luma Inverted");
                        }
                        xsVar.uef(1);
                        f11 = f10;
                        break;
                    }
                case "ty":
                    f10 = f11;
                    int iNextInt4 = jsonReader.nextInt();
                    uefVar = lw.uef.UNKNOWN;
                    if (iNextInt4 < uefVar.ordinal()) {
                        uefVar = lw.uef.values()[iNextInt4];
                    }
                    f11 = f10;
                    break;
                case "ind":
                    f10 = f11;
                    jNextInt2 = jsonReader.nextInt();
                    f11 = f10;
                    break;
                case "refId":
                    strNextString3 = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(gsd.uef(jsonReader, xsVar));
                    }
                    xsVar.uef(arrayList.size());
                    jsonReader.endArray();
                    f10 = f11;
                    i5 = color;
                    f11 = f10;
                    color = i5;
                    break;
                default:
                    jsonReader.skipValue();
                    f10 = f11;
                    i5 = color;
                    f11 = f10;
                    color = i5;
                    break;
            }
        }
        Float f12 = f11;
        int i11 = color;
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            arrayList4.add(new com.bytedance.adsdk.oa.xs.uef(xsVar, f12, f12, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(fNextDouble)));
        }
        if (fXs <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fXs = xsVar.xs();
        }
        arrayList4.add(new com.bytedance.adsdk.oa.xs.uef(xsVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(fXs)));
        arrayList4.add(new com.bytedance.adsdk.oa.xs.uef(xsVar, f12, f12, null, fXs, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString.endsWith(".ai") || "ai".equals(strNextString2)) {
            xsVar.uef("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.oa.yo.yo.lw(arrayList2, xsVar, strNextString, jNextInt2, uefVar, jNextInt, strNextString3, arrayList, wrvVarUef, iNextInt, iUef, i11, fNextDouble5, fNextDouble4, fNextDouble2, fNextDouble3, zjmVarIvm, djVarUef, arrayList4, oaVar2, oaVarUef, zNextBoolean, uefVarUef, zjmVarUef);
    }
}
