package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
class pu {
    public static com.bytedance.adsdk.oa.yo.oa.ab uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "it":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.oa.yo.oa.yo yoVarUef = bcc.uef(jsonReader, xsVar);
                        if (yoVarUef != null) {
                            arrayList.add(yoVarUef);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.oa.yo.oa.ab(strNextString, arrayList, zNextBoolean);
    }
}
