package com.google.firebase.components;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac implements com.google.firebase.g.c, com.google.firebase.g.b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.g.a f8915a = new z();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.g.c f8916b = new aa(0);

    /* renamed from: c, reason: collision with root package name */
    private com.google.firebase.g.a f8917c;

    /* renamed from: d, reason: collision with root package name */
    private volatile com.google.firebase.g.c f8918d;

    private ac(com.google.firebase.g.a aVar, com.google.firebase.g.c cVar) {
        this.f8917c = aVar;
        this.f8918d = cVar;
    }

    static ac b() {
        return new ac(f8915a, f8916b);
    }

    static ac c(com.google.firebase.g.c cVar) {
        return new ac(null, cVar);
    }

    @Override // com.google.firebase.g.c
    public final Object a() {
        return this.f8918d.a();
    }

    final void d(com.google.firebase.g.c cVar) {
        com.google.firebase.g.a aVar;
        if (this.f8918d != f8916b) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f8917c;
            this.f8917c = null;
            this.f8918d = cVar;
        }
        aVar.a(cVar);
    }

    @Override // com.google.firebase.g.b
    public final void e(final com.google.firebase.g.a aVar) {
        com.google.firebase.g.c cVar;
        com.google.firebase.g.c cVar2;
        com.google.firebase.g.c cVar3 = this.f8918d;
        com.google.firebase.g.c cVar4 = f8916b;
        if (cVar3 != cVar4) {
            aVar.a(cVar3);
            return;
        }
        synchronized (this) {
            cVar = this.f8918d;
            if (cVar != cVar4) {
                cVar2 = cVar;
            } else {
                final com.google.firebase.g.a aVar2 = this.f8917c;
                this.f8917c = new com.google.firebase.g.a() { // from class: com.google.firebase.components.ab
                    @Override // com.google.firebase.g.a
                    public final void a(com.google.firebase.g.c cVar5) {
                        aVar2.a(cVar5);
                        aVar.a(cVar5);
                    }
                };
                cVar2 = null;
            }
        }
        if (cVar2 != null) {
            aVar.a(cVar);
        }
    }
}
