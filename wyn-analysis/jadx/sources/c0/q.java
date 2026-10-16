package c0;

import Va.M6;
import a2.v;
import kotlin.jvm.internal.AbstractC3340k;
import s0.InterfaceC3987a;

/* loaded from: classes.dex */
public final class q implements InterfaceC3987a, s0.b {

    /* renamed from: a, reason: collision with root package name */
    public q f19532a;

    /* renamed from: b, reason: collision with root package name */
    public final P.d f19533b;

    public q(o focusRequester) {
        AbstractC3340k.e(focusRequester, "focusRequester");
        this.f19533b = new P.d(new C1542g[16]);
        focusRequester.f19530a.b(this);
    }

    public final void a(C1542g focusModifier) {
        AbstractC3340k.e(focusModifier, "focusModifier");
        this.f19533b.b(focusModifier);
        q qVar = this.f19532a;
        if (qVar != null) {
            qVar.a(focusModifier);
        }
    }

    public final void b(P.d dVar) {
        P.d dVar2 = this.f19533b;
        dVar2.c(dVar2.f8972c, dVar);
        q qVar = this.f19532a;
        if (qVar != null) {
            qVar.b(dVar);
        }
    }

    public final void c(C1542g focusModifier) {
        AbstractC3340k.e(focusModifier, "focusModifier");
        this.f19533b.k(focusModifier);
        q qVar = this.f19532a;
        if (qVar != null) {
            qVar.c(focusModifier);
        }
    }

    public final void d(P.d dVar) {
        this.f19533b.l(dVar);
        q qVar = this.f19532a;
        if (qVar != null) {
            qVar.d(dVar);
        }
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // s0.b
    public final v getKey() {
        return p.f19531a;
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // s0.InterfaceC3987a
    public final void o(s0.c scope) {
        AbstractC3340k.e(scope, "scope");
        q qVar = (q) scope.a(p.f19531a);
        if (AbstractC3340k.a(qVar, this.f19532a)) {
            return;
        }
        q qVar2 = this.f19532a;
        P.d dVar = this.f19533b;
        if (qVar2 != null) {
            qVar2.d(dVar);
        }
        if (qVar != null) {
            qVar.b(dVar);
        }
        this.f19532a = qVar;
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }

    @Override // s0.b
    public final Object getValue() {
        return this;
    }
}
