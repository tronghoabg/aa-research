package com.google.l.b.a;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bi extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) {
        try {
            return new AtomicInteger(bVar.b());
        } catch (NumberFormatException e2) {
            throw new com.google.l.q(e2);
        }
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        cVar.i(((AtomicInteger) obj).get());
    }
}
