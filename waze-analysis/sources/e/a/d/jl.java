package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jl {

    /* renamed from: a, reason: collision with root package name */
    final e.a.bv f47233a;

    /* renamed from: b, reason: collision with root package name */
    final Object f47234b;

    public jl(e.a.bv bvVar, Object obj) {
        this.f47233a = bvVar;
        this.f47234b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jl jlVar = (jl) obj;
            if (Objects.equals(this.f47233a, jlVar.f47233a) && Objects.equals(this.f47234b, jlVar.f47234b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f47233a, this.f47234b);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("provider", this.f47233a);
        zVarH.d("config", this.f47234b);
        return zVarH.toString();
    }
}
