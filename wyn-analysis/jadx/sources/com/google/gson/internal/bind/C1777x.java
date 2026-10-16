package com.google.gson.internal.bind;

import java.io.IOException;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1777x extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) {
        if (c3962a.e0() != 9) {
            return Float.valueOf((float) c3962a.V());
        }
        c3962a.a0();
        return null;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            c3963b.z();
            return;
        }
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(numberValueOf.floatValue());
        }
        c3963b.X(numberValueOf);
    }
}
