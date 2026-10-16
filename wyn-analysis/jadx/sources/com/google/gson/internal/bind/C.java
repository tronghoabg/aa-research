package com.google.gson.internal.bind;

import java.io.IOException;
import java.math.BigInteger;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class C extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        String strC0 = c3962a.c0();
        try {
            na.d.d(strC0);
            return new BigInteger(strC0);
        } catch (NumberFormatException e7) {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Failed parsing '", strC0, "' as BigInteger; at path ");
            sbW.append(c3962a.B());
            throw new la.p(sbW.toString(), e7, 13);
        }
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        c3963b.X((BigInteger) obj);
    }
}
