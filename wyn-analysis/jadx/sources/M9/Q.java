package m9;

/* loaded from: classes4.dex */
public final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    public S f40453a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q.class != obj.getClass()) {
            return false;
        }
        return this.f40453a.equals(((Q) obj).f40453a);
    }

    public final int hashCode() {
        return this.f40453a.hashCode();
    }

    public final String toString() {
        return "MemoryCacheSettings{gcSettings=" + this.f40453a + "}";
    }
}
