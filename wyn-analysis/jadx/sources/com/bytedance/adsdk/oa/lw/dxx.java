package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class dxx {
    public static com.bytedance.adsdk.oa.yo.oa.cq uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "r":
                    oaVarUef = moa.uef(jsonReader, xsVar, true);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new com.bytedance.adsdk.oa.yo.oa.cq(strNextString, oaVarUef);
    }
}
