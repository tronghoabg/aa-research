package com.google.gson.internal.bind;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class I extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        try {
            String strC0 = c3962a.c0();
            if (strC0.equals("null")) {
                return null;
            }
            return new URI(strC0);
        } catch (URISyntaxException e7) {
            throw new la.p(e7, 13);
        }
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        URI uri = (URI) obj;
        c3963b.Y(uri == null ? null : uri.toASCIIString());
    }
}
