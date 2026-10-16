package com.waze.notifications.b;

import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    private final bn f32562b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f32563c;

    public g() {
        bn bnVarB = ck.b(null);
        this.f32562b = bnVarB;
        this.f32563c = ai.U(bnVarB);
    }

    public static final /* synthetic */ void c(g gVar, int i2) {
        bn bnVar;
        Object objD;
        f fVar;
        do {
            bnVar = gVar.f32562b;
            objD = bnVar.d();
            fVar = (f) objD;
            if (fVar != null && fVar.d() == i2) {
                fVar = null;
            }
        } while (!bnVar.f(objD, fVar));
    }

    @Override // com.waze.notifications.b.d
    public final void a(com.waze.notifications.c cVar, int i2) {
        bn bnVar;
        Object objD;
        f fVar;
        x.f(cVar, "data");
        do {
            bnVar = this.f32562b;
            objD = bnVar.d();
            fVar = (f) objD;
            if (fVar == null || ((com.waze.notifications.c) fVar.a().d()).f32571h < cVar.f32571h) {
                fVar = new f(this, i2, cVar);
            } else if (fVar.d() == i2) {
                fVar.e().e(cVar);
            }
        } while (!bnVar.f(objD, fVar));
    }

    @Override // com.waze.notifications.b.e
    public final ch b() {
        return this.f32563c;
    }
}
