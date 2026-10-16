package com.google.l.b.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bk extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() != 9) {
            return Double.valueOf(bVar.a());
        }
        bVar.m();
        return null;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            cVar.g();
            return;
        }
        double dDoubleValue = number.doubleValue();
        bo.h(dDoubleValue);
        cVar.h(dDoubleValue);
    }
}
