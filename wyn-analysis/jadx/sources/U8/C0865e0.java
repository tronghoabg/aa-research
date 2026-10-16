package U8;

/* renamed from: U8.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0865e0 extends H0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12559a;

    public C0865e0(String str) {
        this.f12559a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        return this.f12559a.equals(((C0865e0) ((H0) obj)).f12559a);
    }

    public final int hashCode() {
        return this.f12559a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return wg.b.c(new StringBuilder("Log{content="), this.f12559a, "}");
    }
}
