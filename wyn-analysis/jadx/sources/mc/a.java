package mc;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f40519a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40520b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40521c;

    public a(String str, String str2) {
        this.f40519a = str;
        this.f40520b = null;
        this.f40521c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f40519a.equals(aVar.f40519a)) {
            return this.f40521c.equals(aVar.f40521c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40521c.hashCode() + (this.f40519a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DartEntrypoint( bundle path: ");
        sb2.append(this.f40519a);
        sb2.append(", function: ");
        return wg.b.c(sb2, this.f40521c, " )");
    }

    public a(String str, String str2, String str3) {
        this.f40519a = str;
        this.f40520b = str2;
        this.f40521c = str3;
    }
}
