package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import com.bytedance.adsdk.oa.yo.oa.cz;
import java.io.IOException;

/* loaded from: classes.dex */
class rt {
    public static com.bytedance.adsdk.oa.yo.oa.cz uef(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        cz.uef uefVarUef = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    uefVarUef = cz.uef.uef(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.oa.yo.oa.cz(strNextString, uefVarUef, zNextBoolean);
    }
}
