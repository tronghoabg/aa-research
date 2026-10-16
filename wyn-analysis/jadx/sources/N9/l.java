package N9;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f8630a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8631b;

    public l(String str, String str2) {
        this.f8630a = str;
        this.f8631b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (hashCode() != lVar.hashCode()) {
            return false;
        }
        String str = lVar.f8630a;
        String str2 = this.f8630a;
        return (str2 != null || str == null) && (str2 == null || str2.equals(str)) && this.f8631b.equals(lVar.f8631b);
    }

    public final int hashCode() {
        String str = this.f8631b;
        String str2 = this.f8630a;
        if (str2 == null) {
            return str.hashCode();
        }
        return str.hashCode() + str2.hashCode();
    }
}
