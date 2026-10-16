package U8;

/* renamed from: U8.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0877k0 extends M0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12619a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12620b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12621c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12622d;

    public C0877k0(int i5, String str, boolean z2, String str2) {
        this.f12619a = i5;
        this.f12620b = str;
        this.f12621c = str2;
        this.f12622d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof M0) {
            M0 m02 = (M0) obj;
            if (this.f12619a == ((C0877k0) m02).f12619a) {
                C0877k0 c0877k0 = (C0877k0) m02;
                if (this.f12620b.equals(c0877k0.f12620b) && this.f12621c.equals(c0877k0.f12621c) && this.f12622d == c0877k0.f12622d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f12619a ^ 1000003) * 1000003) ^ this.f12620b.hashCode()) * 1000003) ^ this.f12621c.hashCode()) * 1000003) ^ (this.f12622d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f12619a + ", version=" + this.f12620b + ", buildVersion=" + this.f12621c + ", jailbroken=" + this.f12622d + "}";
    }
}
