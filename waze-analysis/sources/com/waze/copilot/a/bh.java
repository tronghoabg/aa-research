package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.copilot.data.b.h f22788a;

    public bh(com.waze.copilot.data.b.h hVar) {
        h.g.b.x.f(hVar, "copilotRepository");
        this.f22788a = hVar;
    }

    static /* synthetic */ Object a(bh bhVar, com.waze.copilot.data.a.g gVar) {
        Object objG;
        h.m mVarB = gVar.b();
        if (mVarB != null) {
            Object objB = mVarB.b();
            if (true == (objB instanceof h.l)) {
                objB = null;
            }
            com.waze.copilot.data.af afVar = (com.waze.copilot.data.af) objB;
            if (afVar != null && (objG = bhVar.f22788a.g(afVar)) == h.c.a.a.f48038a) {
                return objG;
            }
        }
        return h.ab.f48028a;
    }
}
