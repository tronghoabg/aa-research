package com.google.gson.internal.bind;

import java.io.IOException;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class A extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        int iE0 = c3962a.e0();
        if (iE0 != 9) {
            return iE0 == 8 ? Boolean.toString(c3962a.Q()) : c3962a.c0();
        }
        c3962a.a0();
        return null;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        c3963b.Y((String) obj);
    }
}
