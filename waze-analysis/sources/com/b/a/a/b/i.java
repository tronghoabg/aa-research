package com.b.a.a.b;

import com.b.b.a.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2569a;

    public i(n nVar) {
        this.f2569a = nVar;
    }

    public final boolean a() {
        return ((com.b.a.a.a.k) this.f2569a).d();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.b.b.a.n, java.lang.Object] */
    public final com.b.b.a.b b(com.b.b.d.i iVar) {
        com.b.b.a.b bVarB = this.f2569a.b("com.spotify.get_image", new com.b.b.d.h(iVar.f2642a), com.b.b.d.g.class);
        com.b.b.a.b bVar = new com.b.b.a.b();
        bVarB.c(new b(this, bVar));
        bVarB.g(new c(this, bVar));
        return bVar;
    }

    public i(com.b.a.a.a.k kVar) {
        this.f2569a = kVar;
    }
}
