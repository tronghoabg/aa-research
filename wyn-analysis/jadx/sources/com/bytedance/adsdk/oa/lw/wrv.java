package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class wrv implements rl<Float> {
    public static final wrv uef = new wrv();

    private wrv() {
    }

    @Override // com.bytedance.adsdk.oa.lw.rl
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public Float oa(JsonReader jsonReader, float f10) throws IOException {
        return Float.valueOf(oib.oa(jsonReader) * f10);
    }
}
