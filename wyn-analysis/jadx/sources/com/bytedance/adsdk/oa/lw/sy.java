package com.bytedance.adsdk.oa.lw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class sy implements rl<Integer> {
    public static final sy uef = new sy();

    private sy() {
    }

    @Override // com.bytedance.adsdk.oa.lw.rl
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public Integer oa(JsonReader jsonReader, float f10) throws IOException {
        return Integer.valueOf(Math.round(oib.oa(jsonReader) * f10));
    }
}
