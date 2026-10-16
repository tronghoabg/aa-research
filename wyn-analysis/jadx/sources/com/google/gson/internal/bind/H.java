package com.google.gson.internal.bind;

import java.io.IOException;
import java.net.URL;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class H extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        String strC0 = c3962a.c0();
        if (strC0.equals("null")) {
            return null;
        }
        return new URL(strC0);
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        URL url = (URL) obj;
        c3963b.Y(url == null ? null : url.toExternalForm());
    }
}
