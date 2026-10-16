package com.waze.navigate.a;

import com.waze.z;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f30932a;

    e(f fVar) {
        this.f30932a = fVar;
    }

    @Override // com.waze.navigate.a.j
    public final void a(d dVar) {
        x.f(dVar, "action");
        if (b()) {
            f.e(this.f30932a, dVar);
        }
    }

    @Override // com.waze.navigate.a.j
    public final boolean b() {
        f fVar = this.f30932a;
        boolean z = true;
        if (fVar.f30935c != z.f45554b && !fVar.f30936d.e()) {
            z = false;
        }
        fVar.f30937e.a("canHandle - isInCar: " + z);
        return z;
    }
}
