package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class tpx {
    public static <T> List<com.bytedance.adsdk.oa.xs.uef<T>> uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar, float f10, rl<T> rlVar, boolean z2) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.oa.xs xsVar2;
        float f11;
        rl<T> rlVar2;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            xsVar.uef("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.oa.xs xsVar3 = xsVar;
                    float f12 = f10;
                    rl<T> rlVar3 = rlVar;
                    boolean z11 = z2;
                    com.bytedance.adsdk.oa.xs.uef uefVarUef = dhk.uef(jsonReader3, xsVar3, f12, rlVar3, false, z11);
                    jsonReader2 = jsonReader3;
                    xsVar2 = xsVar3;
                    f11 = f12;
                    rlVar2 = rlVar3;
                    z10 = z11;
                    arrayList.add(uefVarUef);
                } else {
                    jsonReader2 = jsonReader;
                    xsVar2 = xsVar;
                    f11 = f10;
                    rlVar2 = rlVar;
                    z10 = z2;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(dhk.uef(jsonReader2, xsVar2, f11, rlVar2, true, z10));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                xsVar = xsVar2;
                f10 = f11;
                rlVar = rlVar2;
                z2 = z10;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(dhk.uef(jsonReader4, xsVar, f10, rlVar, false, z2));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        uef(arrayList);
        return arrayList;
    }

    public static <T> void uef(List<? extends com.bytedance.adsdk.oa.xs.uef<T>> list) {
        int i5;
        T t10;
        int size = list.size();
        int i10 = 0;
        while (true) {
            i5 = size - 1;
            if (i10 >= i5) {
                break;
            }
            com.bytedance.adsdk.oa.xs.uef<T> uefVar = list.get(i10);
            i10++;
            com.bytedance.adsdk.oa.xs.uef<T> uefVar2 = list.get(i10);
            uefVar.xs = Float.valueOf(uefVar2.ivm);
            if (uefVar.f24604oa == null && (t10 = uefVar2.uef) != null) {
                uefVar.f24604oa = t10;
                if (uefVar instanceof com.bytedance.adsdk.oa.uef.oa.cz) {
                    ((com.bytedance.adsdk.oa.uef.oa.cz) uefVar).uef();
                }
            }
        }
        com.bytedance.adsdk.oa.xs.uef<T> uefVar3 = list.get(i5);
        if ((uefVar3.uef == null || uefVar3.f24604oa == null) && list.size() > 1) {
            list.remove(uefVar3);
        }
    }
}
