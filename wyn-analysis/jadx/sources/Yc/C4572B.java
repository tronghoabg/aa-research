package yc;

import j$.util.Objects;

/* renamed from: yc.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4572B {

    /* renamed from: a, reason: collision with root package name */
    public Double f48075a;

    /* renamed from: b, reason: collision with root package name */
    public Double f48076b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4572B.class == obj.getClass()) {
            C4572B c4572b = (C4572B) obj;
            if (this.f48075a.equals(c4572b.f48075a) && this.f48076b.equals(c4572b.f48076b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f48075a, this.f48076b);
    }
}
