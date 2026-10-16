package com.bytedance.adsdk.oa.lw;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
class km {
    public static com.bytedance.adsdk.oa.yo.oa.wk uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        com.bytedance.adsdk.oa.yo.uef.moa moaVar = null;
        String strNextString = null;
        com.bytedance.adsdk.oa.yo.uef.uef uefVarXs = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    uefVarXs = moa.xs(jsonReader, xsVar);
                    break;
                case "o":
                    moaVar = moa.oa(jsonReader, xsVar);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "hd":
                    zNextBoolean2 = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (moaVar == null) {
            moaVar = new com.bytedance.adsdk.oa.yo.uef.moa(Collections.singletonList(new com.bytedance.adsdk.oa.xs.uef(100)));
        }
        return new com.bytedance.adsdk.oa.yo.oa.wk(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, uefVarXs, moaVar, zNextBoolean2);
    }
}
