package com.b.b.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class p implements com.b.b.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f2603a;

    p(q qVar) {
        Objects.requireNonNull(qVar);
        this.f2603a = qVar;
    }

    @Override // com.b.b.b
    public final void a(com.b.b.c.c cVar, String str) {
        q qVar = this.f2603a;
        y yVarA = qVar.f2606c.a(qVar.f2604a);
        if (yVarA != null) {
            qVar.f2606c.g(qVar.f2604a);
            yVarA.f2616b.e(q.j(cVar, str));
        }
    }

    @Override // com.b.b.b
    public final void b(com.b.b.d.v vVar, com.b.b.c.c cVar, String str) {
        q qVar = this.f2603a;
        y yVarA = qVar.f2606c.a(vVar);
        if (yVarA != null) {
            qVar.f2606c.g(vVar);
            yVarA.f2616b.e(q.j(cVar, str));
        }
    }

    @Override // com.b.b.b
    public final void c(com.b.b.d.v vVar, com.b.b.c.c cVar, String str) {
        q qVar = this.f2603a;
        x xVar = qVar.f2606c.d(vVar).f2619b;
        qVar.f2606c.h(vVar);
        xVar.e(q.j(cVar, str));
    }

    @Override // com.b.b.b
    public final void d(com.b.b.d.v vVar, com.b.b.d.w wVar) {
        q qVar = this.f2603a;
        qVar.f2606c.f(vVar, wVar);
        qVar.f2606c.c(wVar).f2619b.a();
    }

    @Override // com.b.b.b
    public final void e(com.b.b.d.w wVar, com.b.b.c.c cVar) {
        z zVarC = this.f2603a.f2606c.c(wVar);
        if (zVarC != null) {
            try {
                zVarC.f2619b.f(new t(cVar.a(zVarC.f2620c), 0));
            } catch (Exception e2) {
                zVarC.f2619b.e(e2);
            }
        }
    }

    @Override // com.b.b.b
    public final void f(String str) {
        if ("wamp.error.system_shutdown".equals(str)) {
            q qVar = this.f2603a;
            if (qVar.f2605b != null) {
                qVar.f2605b.a();
            }
        }
    }

    @Override // com.b.b.b
    public final void g(com.b.b.d.v vVar, com.b.b.c.c cVar) {
        q qVar = this.f2603a;
        y yVarA = qVar.f2606c.a(vVar);
        if (yVarA != null) {
            qVar.f2606c.g(vVar);
            yVarA.a(cVar);
        }
    }

    @Override // com.b.b.b
    public final void h() {
    }

    @Override // com.b.b.b
    public final void i(com.b.b.c.c cVar) {
        q qVar = this.f2603a;
        y yVarA = qVar.f2606c.a(qVar.f2604a);
        if (yVarA != null) {
            qVar.f2606c.g(qVar.f2604a);
            yVarA.a(cVar);
        }
    }
}
