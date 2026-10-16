package hd;

import j$.util.Objects;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Long f36408a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.f36408a.equals(((h) obj).f36408a);
    }

    public final int hashCode() {
        return Objects.hash(this.f36408a);
    }
}
