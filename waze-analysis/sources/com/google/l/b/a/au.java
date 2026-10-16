package com.google.l.b.a;

import java.io.IOException;
import java.net.InetAddress;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class au extends com.google.l.u {
    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() != 9) {
            return InetAddress.getByName(bVar.h());
        }
        bVar.m();
        return null;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        cVar.l(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
