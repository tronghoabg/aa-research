package com.google.z.b.a.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f implements eh {
    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        if (i2 == 0) {
            return g.UNKNOWN_CATEGORY;
        }
        if (i2 == 1) {
            return g.END_TO_END;
        }
        if (i2 == 2) {
            return g.INGESTED_BUT_NOT_SERVED;
        }
        if (i2 == 3) {
            return g.MATERIALIZED_AND_SERVED;
        }
        if (i2 != 4) {
            return null;
        }
        return g.INTERNAL_KG_USE_ONLY;
    }
}
