package hd;

import j$.util.Objects;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Long f36409a;

    /* renamed from: b, reason: collision with root package name */
    public Long f36410b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f36409a.equals(iVar.f36409a) && this.f36410b.equals(iVar.f36410b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36409a, this.f36410b);
    }
}
