package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class dj {
    private com.bytedance.adsdk.oa.yo.uef.oa lw;
    private com.bytedance.adsdk.oa.yo.uef.oa moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.adsdk.oa.yo.uef.oa f24566oa;
    private com.bytedance.adsdk.oa.yo.uef.uef uef;
    private com.bytedance.adsdk.oa.yo.uef.oa yo;

    private void oa(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("v")) {
                strNextString.getClass();
                switch (strNextString) {
                    case "Distance":
                        this.moa = moa.uef(jsonReader, xsVar);
                        break;
                    case "Opacity":
                        this.f24566oa = moa.uef(jsonReader, xsVar, false);
                        break;
                    case "Direction":
                        this.yo = moa.uef(jsonReader, xsVar, false);
                        break;
                    case "Shadow Color":
                        this.uef = moa.xs(jsonReader, xsVar);
                        break;
                    case "Softness":
                        this.lw = moa.uef(jsonReader, xsVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (strNextName.equals("nm")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    public zjm uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar) throws IOException {
        com.bytedance.adsdk.oa.yo.uef.oa oaVar;
        com.bytedance.adsdk.oa.yo.uef.oa oaVar2;
        com.bytedance.adsdk.oa.yo.uef.oa oaVar3;
        com.bytedance.adsdk.oa.yo.uef.oa oaVar4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    oa(jsonReader, xsVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.oa.yo.uef.uef uefVar = this.uef;
        if (uefVar == null || (oaVar = this.f24566oa) == null || (oaVar2 = this.yo) == null || (oaVar3 = this.moa) == null || (oaVar4 = this.lw) == null) {
            return null;
        }
        return new zjm(uefVar, oaVar, oaVar2, oaVar3, oaVar4);
    }
}
