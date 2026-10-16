package com.google.l.b.a;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ag extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) {
        return new AtomicBoolean(bVar.q());
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        cVar.m(((AtomicBoolean) obj).get());
    }
}
