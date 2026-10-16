package yc;

import j$.util.Objects;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public C4572B f48167a;

    /* renamed from: b, reason: collision with root package name */
    public u f48168b;

    /* renamed from: c, reason: collision with root package name */
    public w f48169c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f48170d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f48171e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f48167a.equals(sVar.f48167a) && this.f48168b.equals(sVar.f48168b) && this.f48169c.equals(sVar.f48169c) && this.f48170d.equals(sVar.f48170d) && this.f48171e.equals(sVar.f48171e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f48167a, this.f48168b, this.f48169c, this.f48170d, this.f48171e);
    }
}
