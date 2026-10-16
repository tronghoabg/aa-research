package com.google.gson.internal.bind;

import java.io.IOException;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class z extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        String strC0 = c3962a.c0();
        if (strC0.length() == 1) {
            return Character.valueOf(strC0.charAt(0));
        }
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Expecting character, got: ", strC0, "; at ");
        sbW.append(c3962a.B());
        throw new la.p(sbW.toString(), 13);
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        Character ch = (Character) obj;
        c3963b.Y(ch == null ? null : String.valueOf(ch));
    }
}
