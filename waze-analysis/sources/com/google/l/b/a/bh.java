package com.google.l.b.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bh extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        try {
            return Integer.valueOf(bVar.b());
        } catch (NumberFormatException e2) {
            throw new com.google.l.q(e2);
        }
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            cVar.g();
        } else {
            cVar.i(r4.intValue());
        }
    }
}
