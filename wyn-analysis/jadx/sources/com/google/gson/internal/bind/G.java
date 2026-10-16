package com.google.gson.internal.bind;

import java.io.IOException;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class G extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) {
        if (c3962a.e0() != 9) {
            return new StringBuffer(c3962a.c0());
        }
        c3962a.a0();
        return null;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        StringBuffer stringBuffer = (StringBuffer) obj;
        c3963b.Y(stringBuffer == null ? null : stringBuffer.toString());
    }
}
