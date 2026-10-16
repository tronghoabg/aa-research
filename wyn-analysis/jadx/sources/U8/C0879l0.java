package U8;

/* renamed from: U8.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0879l0 extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12628a;

    public C0879l0(String str) {
        this.f12628a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        return this.f12628a.equals(((C0879l0) ((N0) obj)).f12628a);
    }

    public final int hashCode() {
        return this.f12628a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return wg.b.c(new StringBuilder("User{identifier="), this.f12628a, "}");
    }
}
