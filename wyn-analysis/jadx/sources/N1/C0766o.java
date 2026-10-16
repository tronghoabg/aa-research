package N1;

import j$.util.Objects;

/* renamed from: N1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766o {

    /* renamed from: a, reason: collision with root package name */
    public final String f8245a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8246b;

    static {
        Q1.x.E(0);
        Q1.x.E(1);
    }

    public C0766o(String str, String str2) {
        this.f8245a = Q1.x.L(str);
        this.f8246b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0766o.class == obj.getClass()) {
            C0766o c0766o = (C0766o) obj;
            if (Objects.equals(this.f8245a, c0766o.f8245a) && Objects.equals(this.f8246b, c0766o.f8246b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f8246b.hashCode() * 31;
        String str = this.f8245a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
