package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class oa {
    private static com.bytedance.adsdk.oa.yo.uef.dj oa(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.oa.yo.uef.uef uefVarXs = null;
        com.bytedance.adsdk.oa.yo.uef.uef uefVarXs2 = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "t":
                    oaVarUef2 = moa.uef(jsonReader, xsVar);
                    break;
                case "fc":
                    uefVarXs = moa.xs(jsonReader, xsVar);
                    break;
                case "sc":
                    uefVarXs2 = moa.xs(jsonReader, xsVar);
                    break;
                case "sw":
                    oaVarUef = moa.uef(jsonReader, xsVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.oa.yo.uef.dj(uefVarXs, uefVarXs2, oaVarUef, oaVarUef2);
    }

    public static com.bytedance.adsdk.oa.yo.uef.dj uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.oa.yo.uef.dj djVarOa = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("a")) {
                djVarOa = oa(jsonReader, xsVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return djVarOa == null ? new com.bytedance.adsdk.oa.yo.uef.dj(null, null, null, null) : djVarOa;
    }
}
