package com.waze.modules.d;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.stats.as;
import com.waze.stats.at;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e implements at {

    /* renamed from: a, reason: collision with root package name */
    private final org.a.d.k.b f30216a;

    public e(org.a.d.k.b bVar) {
        h.g.b.x.f(bVar, "scope");
        this.f30216a = bVar;
    }

    @Override // com.waze.stats.at
    public final com.waze.stats.v a(as asVar) {
        h.g.b.x.f(asVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        org.a.d.i.a aVarE = com.waze.ch.a.a.f.e(asVar);
        int i2 = ar.f48106a;
        Object objA = this.f30216a.a(new h.g.b.m(com.waze.stats.v.class), aVarE, null);
        com.waze.stats.v vVar = objA instanceof com.waze.stats.v ? (com.waze.stats.v) objA : null;
        if (vVar != null) {
            vVar.d();
        }
        return vVar;
    }
}
