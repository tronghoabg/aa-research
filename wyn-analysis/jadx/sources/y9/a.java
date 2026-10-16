package Y9;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f16732a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16733b;

    public a(String str, String str2) {
        this.f16732a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f16733b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f16732a.equals(aVar.f16732a) && this.f16733b.equals(aVar.f16733b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16732a.hashCode() ^ 1000003) * 1000003) ^ this.f16733b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f16732a);
        sb2.append(", version=");
        return wg.b.c(sb2, this.f16733b, "}");
    }
}
