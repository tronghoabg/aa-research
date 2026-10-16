package yc;

import j$.util.Objects;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public Double f48195a;

    /* renamed from: b, reason: collision with root package name */
    public Double f48196b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f48195a.equals(zVar.f48195a) && this.f48196b.equals(zVar.f48196b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f48195a, this.f48196b);
    }
}
