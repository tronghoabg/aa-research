package com.vungle.ads.internal.network.converters;

import com.vungle.ads.internal.network.j;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class b implements a {
    @Override // com.vungle.ads.internal.network.converters.a
    public final Object a(j jVar) throws IOException {
        try {
            jVar.close();
            jVar.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Ba.c.n(jVar, th);
                throw th2;
            }
        }
    }
}
