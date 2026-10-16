package E;

import A7.AbstractC0279p0;
import A7.B0;
import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import u0.C4186m;

/* renamed from: E.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420j extends B0 implements Z.j {

    /* renamed from: b, reason: collision with root package name */
    public final Z.d f2746b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2747c;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0420j(Z.d alignment, boolean z2) {
        C4186m c4186m = C4186m.f46256l;
        AbstractC3340k.e(alignment, "alignment");
        super((tf.l) c4186m);
        this.f2746b = alignment;
        this.f2747c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0420j c0420j = obj instanceof C0420j ? (C0420j) obj : null;
        return c0420j != null && AbstractC3340k.a(this.f2746b, c0420j.f2746b) && this.f2747c == c0420j.f2747c;
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
        return (this.f2746b.hashCode() * 31) + (this.f2747c ? 1231 : 1237);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxChildData(alignment=");
        sb2.append(this.f2746b);
        sb2.append(", matchParentSize=");
        return AbstractC0279p0.p(sb2, this.f2747c, ')');
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
