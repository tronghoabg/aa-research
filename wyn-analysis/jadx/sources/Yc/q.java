package yc;

import j$.util.Objects;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public String f48159a;

    /* renamed from: b, reason: collision with root package name */
    public r f48160b;

    /* renamed from: c, reason: collision with root package name */
    public Long f48161c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f48159a.equals(qVar.f48159a) && this.f48160b.equals(qVar.f48160b) && this.f48161c.equals(qVar.f48161c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f48159a, this.f48160b, this.f48161c);
    }
}
