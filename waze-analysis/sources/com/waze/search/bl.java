package com.waze.search;

import com.waze.bg.e.a.eh;
import com.waze.bg.e.a.ei;
import com.waze.config.ConfigValues;
import com.waze.navigate.dg;
import com.waze.sdk.bq;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bl extends bd {

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.aw.a f35570b;

    /* renamed from: c, reason: collision with root package name */
    private final dg f35571c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.e.g f35572d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.sharedui.f.k f35573e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.av.c.j f35574f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f35575g;

    public bl(com.waze.aw.a aVar, dg dgVar, com.waze.sharedui.e.g gVar, com.waze.sharedui.f.k kVar, com.waze.search.v2.p pVar, com.waze.av.c.j jVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "moodNameProvider");
        h.g.b.x.f(dgVar, "navigationInfo");
        h.g.b.x.f(gVar, "wazeLocationService");
        h.g.b.x.f(kVar, "gateway");
        h.g.b.x.f(pVar, "config");
        h.g.b.x.f(jVar, "searchV2ResponseParser");
        h.g.b.x.f(eVar, "logger");
        this.f35570b = aVar;
        this.f35571c = dgVar;
        this.f35572d = gVar;
        this.f35573e = kVar;
        this.f35574f = jVar;
        this.f35575g = eVar;
        e.c.d.a.p();
    }

    static /* synthetic */ Object n(bl blVar, com.waze.ad.c.b bVar, String str, String str2, String str3, Set set, h.c.e eVar, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return blVar.v(bVar, str, str2, str3, set, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.util.List r14, h.c.e r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.bl.o(java.util.List, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.util.List r17, h.c.e r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.bl.p(java.util.List, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r5, java.lang.String r6, h.c.e r7) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.bl.q(java.lang.String, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.waze.shared_infra.h.c r52, h.c.e r53) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.bl.r(com.waze.shared_infra.h.c, h.c.e):java.lang.Object");
    }

    private static final void s(Set set, h.g.a.l lVar) {
        i.b.n.a.o oVarNewBuilder = i.b.n.a.ac.newBuilder();
        h.g.b.x.c(oVarNewBuilder);
        lVar.invoke(oVarNewBuilder);
        i.b.n.a.ac acVarBuild = oVarNewBuilder.build();
        h.g.b.x.e(acVarBuild, "build(...)");
        set.add(acVarBuild);
    }

    private static final eh t(com.waze.shared_infra.h.c cVar, com.waze.shared_infra.l.a aVar) {
        eh ehVarNewBuilder = ei.newBuilder();
        ehVarNewBuilder.a(bq.d(cVar));
        if (aVar != null) {
            ehVarNewBuilder.b(aVar.a());
            ehVarNewBuilder.c(aVar.d());
        }
        h.g.b.x.e(ehVarNewBuilder, "apply(...)");
        return ehVarNewBuilder;
    }

    private static final void u(Set set, String str) {
        s(set, new com.waze.car_lib.o.ab(str, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.waze.ad.c.b r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.Set r12, h.c.e r13) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.bl.v(com.waze.ad.c.b, java.lang.String, java.lang.String, java.lang.String, java.util.Set, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.search.bd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.search.bc r9, h.c.e r10) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.bl.a(com.waze.search.bc, h.c.e):java.lang.Object");
    }

    @Override // com.waze.search.bd
    public final Object b(List list, h.c.e eVar) {
        Boolean boolB = ConfigValues.CONFIG_VALUE_NAVIGATION_USE_ESTIMATE_WAYPOINT_DETOURS_API.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue() ? p(list, eVar) : o(list, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.search.bd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.waze.ad.c.b r10, java.util.Set r11, h.c.e r12) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.bl.g(com.waze.ad.c.b, java.util.Set, h.c.e):java.lang.Object");
    }
}
