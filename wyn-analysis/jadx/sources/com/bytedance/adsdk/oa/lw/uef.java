package com.bytedance.adsdk.oa.lw;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class uef {
    public static com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> oa(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.oa.yo.uef.lw lwVarUef = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef2 = null;
        boolean z2 = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "k":
                    lwVarUef = uef(jsonReader, xsVar);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        oaVarUef = moa.uef(jsonReader, xsVar);
                        break;
                    } else {
                        z2 = true;
                        jsonReader.skipValue();
                        break;
                    }
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        oaVarUef2 = moa.uef(jsonReader, xsVar);
                        break;
                    } else {
                        z2 = true;
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z2) {
            xsVar.uef("Lottie doesn't support expressions.");
        }
        return lwVarUef != null ? lwVarUef : new com.bytedance.adsdk.oa.yo.uef.cz(oaVarUef, oaVarUef2);
    }

    public static com.bytedance.adsdk.oa.yo.uef.lw uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(gr.uef(jsonReader, xsVar));
            }
            jsonReader.endArray();
            tpx.uef(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.oa.xs.uef(oib.oa(jsonReader, com.bytedance.adsdk.oa.ivm.ivm.uef())));
        }
        return new com.bytedance.adsdk.oa.yo.uef.lw(arrayList);
    }
}
