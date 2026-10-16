package com.google.gson.internal.bind;

import A.AbstractC0213f;
import java.io.IOException;
import java.util.BitSet;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class O extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException, NumberFormatException {
        boolean zQ;
        BitSet bitSet = new BitSet();
        c3962a.a();
        int iE0 = c3962a.e0();
        int i5 = 0;
        while (iE0 != 2) {
            int iF = AbstractC0213f.f(iE0);
            if (iF == 5 || iF == 6) {
                int iW = c3962a.W();
                if (iW == 0) {
                    zQ = false;
                } else {
                    if (iW != 1) {
                        StringBuilder sbL = pd.f.l(iW, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbL.append(c3962a.B());
                        throw new la.p(sbL.toString(), 13);
                    }
                    zQ = true;
                }
            } else {
                if (iF != 7) {
                    throw new la.p("Invalid bitset value type: " + pd.f.s(iE0) + "; at path " + c3962a.y(), 13);
                }
                zQ = c3962a.Q();
            }
            if (zQ) {
                bitSet.set(i5);
            }
            i5++;
            iE0 = c3962a.e0();
        }
        c3962a.i();
        return bitSet;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c3963b.b();
        int length = bitSet.length();
        for (int i5 = 0; i5 < length; i5++) {
            c3963b.V(bitSet.get(i5) ? 1L : 0L);
        }
        c3963b.i();
    }
}
