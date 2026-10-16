package com.google.l.b.a;

import java.io.IOException;
import java.util.BitSet;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class az extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException, NumberFormatException {
        BitSet bitSet = new BitSet();
        bVar.i();
        int iR = bVar.r();
        int i2 = 0;
        while (iR != 2) {
            int i3 = iR - 1;
            if (i3 == 5 || i3 == 6) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB != 1) {
                        throw new com.google.l.q("Invalid bitset value " + iB + ", expected 0 or 1; at path " + bVar.f());
                    }
                    bitSet.set(i2);
                } else {
                    continue;
                }
            } else {
                if (i3 != 7) {
                    throw new com.google.l.q("Invalid bitset value type: " + com.waze.c.c.e.c(iR) + "; at path " + bVar.e());
                }
                if (bVar.q()) {
                    bitSet.set(i2);
                }
            }
            i2++;
            iR = bVar.r();
        }
        bVar.k();
        return bitSet;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        cVar.b();
        int length = bitSet.length();
        for (int i2 = 0; i2 < length; i2++) {
            cVar.i(bitSet.get(i2) ? 1L : 0L);
        }
        cVar.d();
    }
}
