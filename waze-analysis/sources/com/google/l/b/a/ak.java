package com.google.l.b.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ak extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        String strH = bVar.h();
        if (strH.length() == 1) {
            return Character.valueOf(strH.charAt(0));
        }
        throw new com.google.l.q("Expecting character, got: " + strH + "; at " + bVar.f());
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        Character ch = (Character) obj;
        cVar.l(ch == null ? null : ch.toString());
    }
}
