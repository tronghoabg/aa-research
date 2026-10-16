package com.waze.ac.b;

import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f13829a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f13830b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f13831c;

    public a() {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("EncouragementController");
        x.e(eVarD, "create(...)");
        this.f13829a = eVarD;
        bn bnVarB = ck.b(null);
        this.f13830b = bnVarB;
        this.f13831c = ai.U(bnVarB);
    }

    public final ch a() {
        return this.f13831c;
    }

    public final void b(com.waze.ac.a.a aVar) {
        bn bnVar;
        Object objD;
        com.waze.ac.a.a aVar2;
        x.f(aVar, "request");
        do {
            bnVar = this.f13830b;
            objD = bnVar.d();
            aVar2 = (com.waze.ac.a.a) objD;
            if (true == x.n(aVar2 != null ? aVar2.a().D : null, aVar.a().D)) {
                aVar2 = null;
            }
        } while (!bnVar.f(objD, aVar2));
    }

    public final void c(com.waze.ac.a.a aVar) {
        x.f(aVar, "request");
        this.f13829a.a("showEncouragement");
        this.f13830b.e(aVar);
    }
}
