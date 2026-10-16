package com.google.l.b.a;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class at extends com.google.l.u {
    public static final URI a(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        try {
            String strH = bVar.h();
            if (strH.equals("null")) {
                return null;
            }
            return new URI(strH);
        } catch (URISyntaxException e2) {
            throw new com.google.l.j(e2);
        }
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) {
        return a(bVar);
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        cVar.l(uri == null ? null : uri.toASCIIString());
    }
}
