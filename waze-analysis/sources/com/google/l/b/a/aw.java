package com.google.l.b.a;

import java.io.IOException;
import java.util.Currency;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aw extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        String strH = bVar.h();
        try {
            return Currency.getInstance(strH);
        } catch (IllegalArgumentException e2) {
            throw new com.google.l.q("Failed parsing '" + strH + "' as Currency; at path " + bVar.f(), e2);
        }
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        cVar.l(((Currency) obj).getCurrencyCode());
    }
}
