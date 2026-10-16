package com.bytedance.adsdk.oa.lw;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.oa.yo.oa.zjm;
import java.io.IOException;

/* loaded from: classes.dex */
class cp {
    public static com.bytedance.adsdk.oa.yo.oa.zjm uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar, int i5) throws IOException {
        boolean zNextBoolean = false;
        boolean z2 = i5 == 3;
        String strNextString = null;
        zjm.uef uefVarUef = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef = null;
        com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> cqVarOa = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef2 = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef3 = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef4 = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef5 = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef6 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                case "p":
                    cqVarOa = uef.oa(jsonReader, xsVar);
                    break;
                case "r":
                    oaVarUef2 = moa.uef(jsonReader, xsVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    oaVarUef3 = moa.uef(jsonReader, xsVar);
                    break;
                case "is":
                    oaVarUef5 = moa.uef(jsonReader, xsVar, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    oaVarUef4 = moa.uef(jsonReader, xsVar);
                    break;
                case "os":
                    oaVarUef6 = moa.uef(jsonReader, xsVar, false);
                    break;
                case "pt":
                    oaVarUef = moa.uef(jsonReader, xsVar, false);
                    break;
                case "sy":
                    uefVarUef = zjm.uef.uef(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.oa.yo.oa.zjm(strNextString, uefVarUef, oaVarUef, cqVarOa, oaVarUef2, oaVarUef3, oaVarUef4, oaVarUef5, oaVarUef6, zNextBoolean, z2);
    }
}
