package com.google.b.c;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a implements eh {
    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        if (i2 == 0) {
            return b.INT52;
        }
        if (i2 == 1) {
            return b.NUMBER;
        }
        if (i2 == 2) {
            return b.STRING;
        }
        if (i2 != 3) {
            return null;
        }
        return b.GBIGINT;
    }
}
