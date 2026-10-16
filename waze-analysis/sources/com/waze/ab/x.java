package com.waze.ab;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x implements w {
    @Override // com.waze.ab.w
    public final boolean a() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_ENCOURAGEMENT_WALDO_SKIP_ON_IMAGE_NOT_FOUND.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
