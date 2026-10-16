package com.waze.bw.b.a;

import com.waze.modules.c.df;
import h.g.b.x;
import i.b.l.nj;
import i.b.l.oq;
import i.b.l.or;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.f.f f17705a;

    /* renamed from: b, reason: collision with root package name */
    private final df f17706b;

    public m(com.waze.sharedui.f.f fVar, df dfVar) {
        x.f(fVar, "elementSender");
        x.f(dfVar, "routingParamsAndOptionsRepository");
        this.f17705a = fVar;
        this.f17706b = dfVar;
    }

    private static final or b(b bVar) {
        oq oqVarNewBuilder = or.newBuilder();
        oqVarNewBuilder.d(com.waze.sharedui.e.e.e(bVar.a()));
        if (bVar.c() != null) {
            oqVarNewBuilder.e(bVar.c());
        }
        if (bVar.b() != null) {
            oqVarNewBuilder.b(bVar.b());
        }
        if (bVar.d() != null) {
            oqVarNewBuilder.f(bVar.d());
        }
        or orVarBuild = oqVarNewBuilder.build();
        x.e(orVarBuild, "build(...)");
        return orVarBuild;
    }

    private static final j c(nj njVar) {
        int iOrdinal = njVar.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return j.f17696a;
        }
        if (iOrdinal == 2) {
            return j.f17697b;
        }
        if (iOrdinal == 3) {
            return j.f17698c;
        }
        throw new h.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0108, code lost:
    
        if (r15 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b6, code lost:
    
        if (r15 != r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0108 -> B:30:0x010a). Please report as a decompilation issue!!! */
    @Override // com.waze.bw.b.a.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r14, h.c.e r15) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.b.a.m.a(java.util.List, h.c.e):java.lang.Object");
    }
}
