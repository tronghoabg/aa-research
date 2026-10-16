package com.bytedance.adsdk.oa.lw;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class oyt implements rl<com.bytedance.adsdk.oa.yo.oa.dz> {
    public static final oyt uef = new oyt();

    private oyt() {
    }

    @Override // com.bytedance.adsdk.oa.lw.rl
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.oa.yo.oa.dz oa(JsonReader jsonReader, float f10) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listUef = null;
        boolean zNextBoolean = false;
        List<PointF> listUef2 = null;
        List<PointF> listUef3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "i":
                    listUef2 = oib.uef(jsonReader, f10);
                    break;
                case "o":
                    listUef3 = oib.uef(jsonReader, f10);
                    break;
                case "v":
                    listUef = oib.uef(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (listUef == null || listUef2 == null || listUef3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listUef.isEmpty()) {
            return new com.bytedance.adsdk.oa.yo.oa.dz(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listUef.size();
        PointF pointF = listUef.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i5 = 1; i5 < size; i5++) {
            PointF pointF2 = listUef.get(i5);
            int i10 = i5 - 1;
            arrayList.add(new com.bytedance.adsdk.oa.yo.uef(com.bytedance.adsdk.oa.ivm.lw.uef(listUef.get(i10), listUef3.get(i10)), com.bytedance.adsdk.oa.ivm.lw.uef(pointF2, listUef2.get(i5)), pointF2));
        }
        if (zNextBoolean) {
            PointF pointF3 = listUef.get(0);
            int i11 = size - 1;
            arrayList.add(new com.bytedance.adsdk.oa.yo.uef(com.bytedance.adsdk.oa.ivm.lw.uef(listUef.get(i11), listUef3.get(i11)), com.bytedance.adsdk.oa.ivm.lw.uef(pointF3, listUef2.get(0)), pointF3));
        }
        return new com.bytedance.adsdk.oa.yo.oa.dz(pointF, zNextBoolean, arrayList);
    }
}
