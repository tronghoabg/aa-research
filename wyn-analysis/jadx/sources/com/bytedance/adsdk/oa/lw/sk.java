package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import com.bytedance.adsdk.oa.yo.oa.oib;
import java.io.IOException;

/* loaded from: classes.dex */
class sk {
    public static com.bytedance.adsdk.oa.yo.oa.oib uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        String strNextString = null;
        oib.uef uefVarUef = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef2 = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    oaVarUef2 = moa.uef(jsonReader, xsVar, false);
                    break;
                case "m":
                    uefVarUef = oib.uef.uef(jsonReader.nextInt());
                    break;
                case "o":
                    oaVarUef3 = moa.uef(jsonReader, xsVar, false);
                    break;
                case "s":
                    oaVarUef = moa.uef(jsonReader, xsVar, false);
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
        return new com.bytedance.adsdk.oa.yo.oa.oib(strNextString, uefVarUef, oaVarUef, oaVarUef2, oaVarUef3, zNextBoolean);
    }
}
