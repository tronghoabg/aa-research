package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class lw {
    private static com.bytedance.adsdk.oa.yo.oa.uef oa(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.oa.yo.oa.uef uefVar = null;
        while (true) {
            boolean z2 = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("v")) {
                    if (z2) {
                        uefVar = new com.bytedance.adsdk.oa.yo.oa.uef(moa.uef(jsonReader, xsVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (!strNextName.equals("ty")) {
                    jsonReader.skipValue();
                } else if (jsonReader.nextInt() == 0) {
                    z2 = true;
                }
            }
            jsonReader.endObject();
            return uefVar;
        }
    }

    public static com.bytedance.adsdk.oa.yo.oa.uef uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        com.bytedance.adsdk.oa.yo.oa.uef uefVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.oa.yo.oa.uef uefVarOa = oa(jsonReader, xsVar);
                    if (uefVarOa != null) {
                        uefVar = uefVarOa;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return uefVar;
    }
}
