package com.bytedance.adsdk.oa.lw;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class ivm {
    public static com.bytedance.adsdk.oa.yo.oa.oa uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar, int i5) throws IOException {
        boolean z2 = i5 == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> cqVarOa = null;
        com.bytedance.adsdk.oa.yo.uef.ivm ivmVarYo = null;
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
        return new com.bytedance.adsdk.oa.yo.oa.oa(strNextString, cqVarOa, ivmVarYo, z2, zNextBoolean);
    }
}
