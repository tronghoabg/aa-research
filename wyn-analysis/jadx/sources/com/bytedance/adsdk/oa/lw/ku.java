package com.bytedance.adsdk.oa.lw;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class ku {
    public static com.bytedance.adsdk.oa.yo.oa.dj uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> cqVarOa = null;
        com.bytedance.adsdk.oa.yo.uef.ivm ivmVarYo = null;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarUef = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "p":
                    cqVarOa = uef.oa(jsonReader, xsVar);
                    break;
                case "r":
                    oaVarUef = moa.uef(jsonReader, xsVar);
                    break;
                case "s":
                    ivmVarYo = moa.yo(jsonReader, xsVar);
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
        return new com.bytedance.adsdk.oa.yo.oa.dj(strNextString, cqVarOa, ivmVarYo, oaVarUef, zNextBoolean);
    }
}
