package x0;

import Va.M6;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: x0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4440j implements InterfaceC4439i {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f47596c = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f47597a;

    /* renamed from: b, reason: collision with root package name */
    public final C4437g f47598b;

    public C4440j(int i5, boolean z2, tf.l properties) {
        AbstractC3340k.e(properties, "properties");
        this.f47597a = i5;
        C4437g c4437g = new C4437g();
        c4437g.f47594b = z2;
        c4437g.f47595c = false;
        properties.invoke(c4437g);
        this.f47598b = c4437g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4440j)) {
            return false;
        }
        C4440j c4440j = (C4440j) obj;
        if (this.f47597a != c4440j.f47597a) {
            return false;
        }
        return AbstractC3340k.a(this.f47598b, c4440j.f47598b);
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    public final int hashCode() {
        return (this.f47598b.hashCode() * 31) + this.f47597a;
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
