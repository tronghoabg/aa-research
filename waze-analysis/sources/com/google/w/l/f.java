package com.google.w.l;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f implements eh {
    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        if (i2 == 0) {
            return g.TOMBSTONE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return g.TOMBSTONE_RETAIN;
        }
        if (i2 != 2) {
            return null;
        }
        return g.TOMBSTONE_DROP;
    }
}
