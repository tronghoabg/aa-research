package com.google.gson.internal.bind;

import java.io.IOException;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class U extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        try {
            int iW = c3962a.W();
            if (iW <= 65535 && iW >= -32768) {
                return Short.valueOf((short) iW);
            }
            StringBuilder sbL = pd.f.l(iW, "Lossy conversion from ", " to short; at path ");
            sbL.append(c3962a.B());
            throw new la.p(sbL.toString(), 13);
        } catch (NumberFormatException e7) {
            throw new la.p(e7, 13);
        }
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        if (((Number) obj) == null) {
            c3963b.z();
        } else {
            c3963b.V(r4.shortValue());
        }
    }
}
