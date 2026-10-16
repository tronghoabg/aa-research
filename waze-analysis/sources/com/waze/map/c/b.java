package com.waze.map.c;

import com.waze.R;
import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements a {
    @Override // com.waze.map.c.a
    public final int a() {
        return x.n(ConfigValues.CONFIG_VALUE_PARKING_SYMBOL_STYLE.b(), "latam") ? R.drawable.parking_label_latam : R.drawable.parking_label;
    }
}
