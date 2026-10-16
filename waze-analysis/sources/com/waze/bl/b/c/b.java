package com.waze.bl.b.c;

import com.waze.reports_v2.b.at;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class b {
    public b() {
    }

    public static com.waze.bl.c.b.k a(com.waze.bl.c.b.j jVar) {
        h.g.b.x.f(jVar, "<this>");
        if (jVar instanceof com.waze.bl.c.b.g) {
            com.waze.bl.c.b.g gVar = (com.waze.bl.c.b.g) jVar;
            return new com.waze.bl.c.b.k(gVar.e(), gVar.a(), gVar.b());
        }
        if (jVar instanceof com.waze.bl.c.b.i) {
            com.waze.bl.c.b.i iVar = (com.waze.bl.c.b.i) jVar;
            return new com.waze.bl.c.b.k(iVar.e(), 0, iVar.a().b());
        }
        if (jVar instanceof com.waze.bl.c.b.h) {
            com.waze.bl.c.b.h hVar = (com.waze.bl.c.b.h) jVar;
            return new com.waze.bl.c.b.k(hVar.e(), hVar.a(), at.I);
        }
        if (jVar instanceof com.waze.bl.c.b.f) {
            return null;
        }
        throw new h.i();
    }

    public /* synthetic */ b(byte[] bArr, byte[] bArr2) {
    }
}
