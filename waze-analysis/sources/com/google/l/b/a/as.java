package com.google.l.b.a;

import java.io.IOException;
import java.net.URL;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class as extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        String strH = bVar.h();
        if (strH.equals("null")) {
            return null;
        }
        return new URL(strH);
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        URL url = (URL) obj;
        cVar.l(url == null ? null : url.toExternalForm());
    }
}
