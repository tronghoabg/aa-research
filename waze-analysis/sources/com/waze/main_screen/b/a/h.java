package com.waze.main_screen.b.a;

import h.g.b.ar;
import h.g.b.x;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    private final c f25876a;

    /* renamed from: b, reason: collision with root package name */
    private final org.a.d.k.b f25877b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.main_screen.ab.a.m f25878c;

    public h(c cVar, org.a.d.k.b bVar, com.waze.main_screen.ab.a.m mVar) {
        x.f(cVar, "config");
        x.f(bVar, "koinScope");
        x.f(mVar, "popupsStateHolder");
        this.f25876a = cVar;
        this.f25877b = bVar;
        this.f25878c = mVar;
    }

    @Override // com.waze.main_screen.b.a.d
    public final kotlinx.coroutines.b.k a() {
        return ai.y(new k(this.f25876a.a(), this, 1));
    }

    public final f b() {
        int i2 = ar.f48106a;
        f fVar = (f) this.f25877b.a(new h.g.b.m(f.class), null, null);
        m mVar = fVar instanceof m ? (m) fVar : null;
        if (mVar != null) {
            mVar.f(new com.google.firebase.messaging.l(this));
        }
        return fVar;
    }
}
