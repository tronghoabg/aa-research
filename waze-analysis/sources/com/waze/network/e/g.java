package com.waze.network.e;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.ar;
import h.g.b.x;
import okhttp3.ac;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    private final org.a.d.k.b f32246a;

    public g(org.a.d.k.b bVar) {
        x.f(bVar, "scope");
        this.f32246a = bVar;
    }

    @Override // com.waze.network.e.d
    public final ac a(e eVar) {
        x.f(eVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        org.a.d.i.a aVarE = com.waze.ch.a.a.f.e(eVar);
        int i2 = ar.f48106a;
        return (ac) this.f32246a.a(new h.g.b.m(ac.class), aVarE, null);
    }
}
