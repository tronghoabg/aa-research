package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class gb {
    public static com.bytedance.adsdk.oa.yo.oa.bs uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.oa.yo.uef.bcc bccVarLw = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ks":
                    bccVarLw = moa.lw(jsonReader, xsVar);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "ind":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.oa.yo.oa.bs(strNextString, iNextInt, bccVarLw, zNextBoolean);
    }
}
