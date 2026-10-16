package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class X extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) {
        return new AtomicBoolean(c3962a.Q());
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        c3963b.Z(((AtomicBoolean) obj).get());
    }
}
