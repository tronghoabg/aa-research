package I4;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f5342a;

    public i(String str) {
        this.f5342a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f5342a.equals(((i) obj).f5342a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5342a.hashCode();
    }

    public final String toString() {
        return wg.b.c(new StringBuilder("StringHeaderFactory{value='"), this.f5342a, "'}");
    }
}
