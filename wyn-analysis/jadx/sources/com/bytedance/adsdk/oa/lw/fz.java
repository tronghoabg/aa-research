package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class fz {
    public static com.bytedance.adsdk.oa.yo.oa.wrv uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef2 = null;
        com.bytedance.adsdk.oa.yo.uef.wrv wrvVarUef = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    oaVarUef = moa.uef(jsonReader, xsVar, false);
                    break;
                case "o":
                    oaVarUef2 = moa.uef(jsonReader, xsVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "tr":
                    wrvVarUef = yo.uef(jsonReader, xsVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.oa.yo.oa.wrv(strNextString, oaVarUef, oaVarUef2, wrvVarUef, zNextBoolean);
    }
}
