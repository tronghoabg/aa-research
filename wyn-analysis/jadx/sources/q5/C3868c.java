package q5;

/* renamed from: q5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3868c {

    /* renamed from: a, reason: collision with root package name */
    public final String f44124a;

    public C3868c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f44124a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3868c)) {
            return false;
        }
        return this.f44124a.equals(((C3868c) obj).f44124a);
    }

    public final int hashCode() {
        return this.f44124a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return wg.b.c(new StringBuilder("Encoding{name=\""), this.f44124a, "\"}");
    }
}
