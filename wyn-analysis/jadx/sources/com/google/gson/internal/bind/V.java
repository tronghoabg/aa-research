package com.google.gson.internal.bind;

import java.io.IOException;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class V extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) {
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        try {
            return Integer.valueOf(c3962a.W());
        } catch (NumberFormatException e7) {
            throw new la.p(e7, 13);
        }
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        if (((Number) obj) == null) {
            c3963b.z();
        } else {
            c3963b.V(r4.intValue());
        }
    }
}
