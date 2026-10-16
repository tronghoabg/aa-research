package cd;

import j$.util.Objects;

/* renamed from: cd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1596b {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f19827a;

    /* renamed from: b, reason: collision with root package name */
    public final C1595a f19828b;

    public C1596b(Boolean bool, C1595a c1595a) {
        this.f19827a = bool;
        this.f19828b = c1595a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1596b)) {
            return false;
        }
        C1596b c1596b = (C1596b) obj;
        return Objects.equals(this.f19827a, c1596b.f19827a) && Objects.equals(this.f19828b, c1596b.f19828b);
    }

    public final int hashCode() {
        return Objects.hash(this.f19827a, this.f19828b);
    }
}
