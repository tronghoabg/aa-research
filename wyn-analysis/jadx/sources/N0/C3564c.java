package n0;

import Va.M6;
import Z.h;
import Z.k;
import a2.v;
import android.view.KeyEvent;
import c0.C1542g;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import r0.q;
import s0.InterfaceC3987a;
import t0.t;
import t0.y;
import tf.l;
import tf.p;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3564c implements InterfaceC3987a, s0.b, q {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3343n f40752a;

    /* renamed from: b, reason: collision with root package name */
    public C1542g f40753b;

    /* renamed from: c, reason: collision with root package name */
    public C3564c f40754c;

    /* renamed from: d, reason: collision with root package name */
    public t f40755d;

    /* JADX WARN: Multi-variable type inference failed */
    public C3564c(l lVar) {
        this.f40752a = (AbstractC3343n) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.n, tf.l] */
    public final boolean a(KeyEvent keyEvent) {
        Boolean bool = (Boolean) this.f40752a.invoke(new C3563b(keyEvent));
        if (AbstractC3340k.a(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        C3564c c3564c = this.f40754c;
        if (c3564c != null) {
            return c3564c.a(keyEvent);
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent) {
        C3564c c3564c = this.f40754c;
        Boolean boolValueOf = c3564c != null ? Boolean.valueOf(c3564c.b(keyEvent)) : null;
        if (AbstractC3340k.a(boolValueOf, Boolean.TRUE)) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // Z.k
    public final /* synthetic */ k g(k kVar) {
        return M6.f(this, kVar);
    }

    @Override // s0.b
    public final v getKey() {
        return AbstractC3566e.f40757a;
    }

    @Override // Z.k
    public final Object h(Object obj, p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // s0.InterfaceC3987a
    public final void o(s0.c scope) {
        P.d dVar;
        P.d dVar2;
        AbstractC3340k.e(scope, "scope");
        C1542g c1542g = this.f40753b;
        if (c1542g != null && (dVar2 = c1542g.f19509n) != null) {
            dVar2.k(this);
        }
        C1542g c1542g2 = (C1542g) scope.a(c0.k.f19514a);
        this.f40753b = c1542g2;
        if (c1542g2 != null && (dVar = c1542g2.f19509n) != null) {
            dVar.b(this);
        }
        this.f40754c = (C3564c) scope.a(AbstractC3566e.f40757a);
    }

    @Override // Z.k
    public final Object p(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.q
    public final void r(y coordinates) {
        AbstractC3340k.e(coordinates, "coordinates");
        this.f40755d = coordinates.f45561e;
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, h.f16921i);
    }

    @Override // s0.b
    public final Object getValue() {
        return this;
    }
}
