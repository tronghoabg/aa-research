package com.bytedance.adsdk.oa.lw;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.oa.yo.oa;
import java.io.IOException;

/* loaded from: classes.dex */
public class cz implements rl<com.bytedance.adsdk.oa.yo.oa> {
    public static final cz uef = new cz();

    private cz() {
    }

    @Override // com.bytedance.adsdk.oa.lw.rl
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.oa.yo.oa oa(JsonReader jsonReader, float f10) throws IOException {
        oa.uef uefVar = oa.uef.CENTER;
        jsonReader.beginObject();
        oa.uef uefVar2 = uefVar;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iUef = 0;
        int iUef2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "f":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "j":
                    int iNextInt2 = jsonReader.nextInt();
                    uefVar2 = oa.uef.CENTER;
                    if (iNextInt2 <= uefVar2.ordinal() && iNextInt2 >= 0) {
                        uefVar2 = oa.uef.values()[iNextInt2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case "s":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    strNextString = jsonReader.nextString();
                    break;
                case "fc":
                    iUef = oib.uef(jsonReader);
                    break;
                case "lh":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    iUef2 = oib.uef(jsonReader);
                    break;
                case "sw":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.oa.yo.oa(strNextString, strNextString2, fNextDouble, uefVar2, iNextInt, fNextDouble2, fNextDouble3, iUef, iUef2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
