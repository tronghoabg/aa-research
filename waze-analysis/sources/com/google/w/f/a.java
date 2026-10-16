package com.google.w.f;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a implements eh {
    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        if (i2 == 0) {
            return b.UNKNOWN;
        }
        if (i2 == 1) {
            return b.SUCCESS;
        }
        if (i2 == 2) {
            return b.FAILURE;
        }
        if (i2 != 3) {
            return null;
        }
        return b.CANCEL;
    }
}
