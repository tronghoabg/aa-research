package com.waze.bl.b.c;

import com.waze.t.b.al;
import com.waze.t.b.am;
import com.waze.t.b.bq;
import com.waze.t.b.bw;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class r {
    public r() {
    }

    public static com.waze.bl.c.b.j b(bw bwVar) {
        h.g.b.x.f(bwVar, "<this>");
        bq bqVar = bwVar instanceof bq ? (bq) bwVar : null;
        am amVarB = bqVar != null ? bqVar.b() : null;
        al alVar = amVarB instanceof al ? (al) amVarB : null;
        if (alVar != null) {
            return (com.waze.bl.c.b.j) alVar.a();
        }
        return null;
    }

    public static boolean c(com.waze.bl.c.b.j jVar) {
        h.g.b.x.f(jVar, "<this>");
        if (jVar instanceof com.waze.bl.c.b.f) {
            return false;
        }
        if ((jVar instanceof com.waze.bl.c.b.g) || (jVar instanceof com.waze.bl.c.b.h) || (jVar instanceof com.waze.bl.c.b.i)) {
            return jVar.e();
        }
        throw new h.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.waze.reports_v2.b.g d(com.waze.bl.c.c.b bVar) {
        return new com.waze.reports_v2.b.g(bVar.a().b(), bVar.a().c(), com.waze.reports_v2.b.s.f34126a, bVar.a().d(), Integer.valueOf(h.h.a.b(bVar.a().a())));
    }

    public /* synthetic */ r(byte[] bArr, byte[] bArr2) {
    }
}
