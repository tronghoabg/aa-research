package com.waze.cg.a;

import com.waze.ap.a.b.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final c f22260a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22261b;

    public e(c cVar) {
        x.f(cVar, "wazeToGoalApi");
        this.f22260a = cVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeToGoalRepository");
        x.e(eVarD, "create(...)");
        this.f22261b = eVarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.waze.cg.a.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b(com.waze.cg.a.e r19, h.c.e r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.cg.a.e.b(com.waze.cg.a.e, h.c.e):java.lang.Object");
    }

    private static final k c(w wVar) {
        String id = wVar.getId();
        x.e(id, "getId(...)");
        String shortName = wVar.getShortName();
        x.e(shortName, "getShortName(...)");
        String longName = wVar.getLongName();
        x.e(longName, "getLongName(...)");
        String iconEmoji = wVar.getIconEmoji();
        x.e(iconEmoji, "getIconEmoji(...)");
        return new k(id, shortName, longName, iconEmoji);
    }

    public final Object a(h.c.e eVar) {
        return b(this, eVar);
    }
}
