package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes.dex */
public class lz implements rl<com.bytedance.adsdk.oa.xs.yo> {
    public static final lz uef = new lz();

    private lz() {
    }

    @Override // com.bytedance.adsdk.oa.lw.rl
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.oa.xs.yo oa(JsonReader jsonReader, float f10) throws IOException {
        boolean z2 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z2) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z2) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.oa.xs.yo((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}
