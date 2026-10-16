package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Currency;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class L extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        String strC0 = c3962a.c0();
        try {
            return Currency.getInstance(strC0);
        } catch (IllegalArgumentException e7) {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Failed parsing '", strC0, "' as Currency; at path ");
            sbW.append(c3962a.B());
            throw new la.p(sbW.toString(), e7, 13);
        }
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        c3963b.Y(((Currency) obj).getCurrencyCode());
    }
}
