package com.waze.network;

import e.a.co;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f implements co {
    @Override // e.a.co
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new ByteArrayInputStream((byte[]) obj);
    }

    @Override // e.a.co
    public final /* synthetic */ Object b(InputStream inputStream) {
        return h.a.i.aX(inputStream);
    }
}
