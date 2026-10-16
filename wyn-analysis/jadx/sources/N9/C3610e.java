package n9;

/* renamed from: n9.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3610e {

    /* renamed from: b, reason: collision with root package name */
    public static final C3610e f40954b = new C3610e(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f40955a;

    public C3610e(String str) {
        this.f40955a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3610e.class == obj.getClass()) {
            String str = ((C3610e) obj).f40955a;
            String str2 = this.f40955a;
            if (str2 != null) {
                return str2.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f40955a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return wg.b.c(new StringBuilder("User(uid:"), this.f40955a, ")");
    }
}
