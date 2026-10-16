package s5;

/* loaded from: classes3.dex */
public final class o extends z {

    /* renamed from: a, reason: collision with root package name */
    public final m f45027a;

    public o(m mVar) {
        this.f45027a = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        Object obj2 = y.f45051a;
        ((o) zVar).getClass();
        return obj2.equals(obj2) && this.f45027a.equals(((o) zVar).f45027a);
    }

    public final int hashCode() {
        return ((y.f45051a.hashCode() ^ 1000003) * 1000003) ^ this.f45027a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + y.f45051a + ", androidClientInfo=" + this.f45027a + "}";
    }
}
