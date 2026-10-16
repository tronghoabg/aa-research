package com.waze.copilot.a;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private final ac f22719a;

    /* renamed from: b, reason: collision with root package name */
    private final bg f22720b;

    /* renamed from: c, reason: collision with root package name */
    private final bh f22721c;

    /* renamed from: d, reason: collision with root package name */
    private final bj f22722d;

    /* renamed from: e, reason: collision with root package name */
    private final o f22723e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f22724f;

    public au(ac acVar, bg bgVar, bh bhVar, bj bjVar, o oVar, com.waze.shared_infra.i.b bVar) {
        h.g.b.x.f(acVar, "downloadCopilotMetadataAndAssetsUseCase");
        h.g.b.x.f(bgVar, "resetToDefaultCopilotAssetsUseCase");
        h.g.b.x.f(bhVar, "setCopilotAssetsProtoUseCase");
        h.g.b.x.f(bjVar, "setCopilotSelectionsUseCase");
        h.g.b.x.f(oVar, "statsSender");
        h.g.b.x.f(bVar, "exceptionReporter");
        this.f22719a = acVar;
        this.f22720b = bgVar;
        this.f22721c = bhVar;
        this.f22722d = bjVar;
        this.f22723e = oVar;
        this.f22724f = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0105, code lost:
    
        if (com.waze.copilot.a.bg.a(r4, r5, r6, r7, true, r9, r10) == r3) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b(com.waze.copilot.a.au r17, java.util.List r18, java.lang.String r19, h.c.e r20) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.au.b(com.waze.copilot.a.au, java.util.List, java.lang.String, h.c.e):java.lang.Object");
    }

    private static final boolean c(aa aaVar) {
        com.waze.copilot.data.a.g gVarC = aaVar.c();
        h.m mVarA = gVarC.a();
        if (mVarA != null && (mVarA.b() instanceof h.l)) {
            return true;
        }
        h.m mVarB = gVarC.b();
        if (mVarB != null && (mVarB.b() instanceof h.l)) {
            return true;
        }
        h.m mVarC = gVarC.c();
        return mVarC != null && (mVarC.b() instanceof h.l);
    }

    public final Object a(List list, String str, h.c.e eVar) {
        return b(this, list, str, eVar);
    }
}
