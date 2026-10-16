package com.google.gson.internal.bind;

import java.io.IOException;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1778y extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) {
        if (c3962a.e0() != 9) {
            return Double.valueOf(c3962a.V());
        }
        c3962a.a0();
        return null;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c3963b.z();
        } else {
            c3963b.Q(number.doubleValue());
        }
    }
}
