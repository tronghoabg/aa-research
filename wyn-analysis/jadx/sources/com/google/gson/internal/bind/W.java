package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class W extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) {
        try {
            return new AtomicInteger(c3962a.W());
        } catch (NumberFormatException e7) {
            throw new la.p(e7, 13);
        }
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        c3963b.V(((AtomicInteger) obj).get());
    }
}
