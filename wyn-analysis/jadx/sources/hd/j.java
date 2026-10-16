package hd;

import j$.util.Objects;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Long f36411a;

    /* renamed from: b, reason: collision with root package name */
    public Long f36412b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f36411a.equals(jVar.f36411a) && this.f36412b.equals(jVar.f36412b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36411a, this.f36412b);
    }
}
