package com.google.l.b.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae extends ab {

    /* renamed from: a, reason: collision with root package name */
    final com.google.l.d f12236a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.l.p f12237b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.l.h f12238c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.l.c.a f12239d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.l.v f12240e;

    /* renamed from: f, reason: collision with root package name */
    private final ac f12241f = new ac(this);

    /* renamed from: g, reason: collision with root package name */
    private final boolean f12242g;

    /* renamed from: h, reason: collision with root package name */
    private volatile com.google.l.u f12243h;

    public ae(com.google.l.p pVar, com.google.l.h hVar, com.google.l.d dVar, com.google.l.c.a aVar, com.google.l.v vVar, boolean z) {
        this.f12237b = pVar;
        this.f12238c = hVar;
        this.f12236a = dVar;
        this.f12239d = aVar;
        this.f12240e = vVar;
        this.f12242g = z;
    }

    public static com.google.l.v c(com.google.l.c.a aVar, Object obj) {
        return new ad(obj, aVar, aVar.d() == aVar.c());
    }

    private final com.google.l.u f() {
        com.google.l.u uVar = this.f12243h;
        if (uVar != null) {
            return uVar;
        }
        com.google.l.u uVarC = this.f12236a.c(this.f12240e, this.f12239d);
        this.f12243h = uVarC;
        return uVarC;
    }

    @Override // com.google.l.b.a.ab
    public final com.google.l.u a() {
        return this.f12237b != null ? this : f();
    }

    @Override // com.google.l.u
    public final Object b(com.google.l.d.b bVar) {
        com.google.l.h hVar = this.f12238c;
        if (hVar == null) {
            return f().b(bVar);
        }
        com.google.l.i iVarB = com.google.l.b.ac.b(bVar);
        if (this.f12242g && (iVarB instanceof com.google.l.k)) {
            return null;
        }
        this.f12239d.d();
        return hVar.a(iVarB);
    }

    @Override // com.google.l.u
    public final void d(com.google.l.d.c cVar, Object obj) throws IOException {
        com.google.l.p pVar = this.f12237b;
        if (pVar == null) {
            f().d(cVar, obj);
            return;
        }
        if (this.f12242g && obj == null) {
            cVar.g();
            return;
        }
        com.google.l.c.a aVar = this.f12239d;
        ac acVar = this.f12241f;
        aVar.d();
        com.google.l.b.ac.d(pVar.b(obj, acVar), cVar);
    }
}
