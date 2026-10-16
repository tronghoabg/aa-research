package Jd;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final u f6072d = new u("HTTP", 1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final String f6073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6074b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6075c;

    public u(String str, int i5, int i10) {
        this.f6073a = str;
        this.f6074b = i5;
        this.f6075c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f6073a.equals(uVar.f6073a) && this.f6074b == uVar.f6074b && this.f6075c == uVar.f6075c;
    }

    public final int hashCode() {
        return (((this.f6073a.hashCode() * 31) + this.f6074b) * 31) + this.f6075c;
    }

    public final String toString() {
        return this.f6073a + '/' + this.f6074b + '.' + this.f6075c;
    }
}
