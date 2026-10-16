package com.waze.bp;

import com.waze.av.a.p;
import com.waze.modules.c.ce;
import com.waze.modules.c.cf;
import com.waze.modules.c.cg;
import com.waze.modules.c.ch;
import com.waze.modules.navigation.ak;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements a {

    /* renamed from: a, reason: collision with root package name */
    private final ch f17218a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f17219b;

    public j(ch chVar, int i2) {
        this.f17219b = i2;
        x.f(chVar, "routeCalculator");
        this.f17218a = chVar;
    }

    @Override // com.waze.bp.a
    public final Object a(com.waze.sharedui.e.c cVar, ak akVar, boolean z, h.c.e eVar) {
        com.waze.sharedui.e.b bVarC;
        com.waze.sharedui.e.b bVarC2;
        if (this.f17219b == 0) {
            return this.f17218a.a(new ce(cVar, akVar.a().e(), cg.f29948a, 0, z, 504), eVar);
        }
        p pVarE = akVar.a().e();
        x.f(cVar, "originLocation");
        x.f(pVarE, "destination");
        com.waze.shared_infra.h.c cVarF = cVar.f();
        com.waze.sharedui.e.a aVarG = cVar.g();
        Long lValueOf = null;
        Long lValueOf2 = (aVarG == null || (bVarC2 = aVarG.c()) == null) ? null : Long.valueOf(bVarC2.a());
        com.waze.sharedui.e.a aVarG2 = cVar.g();
        if (aVarG2 != null && (bVarC = aVarG2.c()) != null) {
            lValueOf = Long.valueOf(bVarC.b());
        }
        return this.f17218a.b(new cf(cVarF, lValueOf2, lValueOf, pVarE, 3, null, true, false, z), eVar);
    }

    public j(ch chVar, int i2, byte[] bArr) {
        this.f17219b = i2;
        x.f(chVar, "routeCalculator");
        this.f17218a = chVar;
    }
}
