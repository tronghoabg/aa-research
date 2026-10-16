package com.google.l.b.a;

import java.io.IOException;
import java.math.BigInteger;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class an extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        String strH = bVar.h();
        try {
            return com.google.l.b.ac.h(strH);
        } catch (NumberFormatException e2) {
            throw new com.google.l.q("Failed parsing '" + strH + "' as BigInteger; at path " + bVar.f(), e2);
        }
    }

    @Override // com.google.l.u
    public final /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        cVar.k((BigInteger) obj);
    }
}
