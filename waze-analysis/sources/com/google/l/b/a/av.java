package com.google.l.b.a;

import java.io.IOException;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class av extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        String strH = bVar.h();
        try {
            return UUID.fromString(strH);
        } catch (IllegalArgumentException e2) {
            throw new com.google.l.q("Failed parsing '" + strH + "' as UUID; at path " + bVar.f(), e2);
        }
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        cVar.l(uuid == null ? null : uuid.toString());
    }
}
