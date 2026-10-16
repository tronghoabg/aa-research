package J3;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public final h f5581a;

    public o(h hVar) {
        this.f5581a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        return this.f5581a.equals(((o) obj).f5581a);
    }

    public final int hashCode() {
        return this.f5581a.hashCode() + (o.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f5581a + '}';
    }
}
