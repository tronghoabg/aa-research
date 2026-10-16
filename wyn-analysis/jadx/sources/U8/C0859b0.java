package U8;

/* renamed from: U8.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0859b0 extends E0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12524a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12525b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12526c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12527d;

    public C0859b0(String str, int i5, int i10, boolean z2) {
        this.f12524a = str;
        this.f12525b = i5;
        this.f12526c = i10;
        this.f12527d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof E0) {
            E0 e02 = (E0) obj;
            if (this.f12524a.equals(((C0859b0) e02).f12524a)) {
                C0859b0 c0859b0 = (C0859b0) e02;
                if (this.f12525b == c0859b0.f12525b && this.f12526c == c0859b0.f12526c && this.f12527d == c0859b0.f12527d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f12524a.hashCode() ^ 1000003) * 1000003) ^ this.f12525b) * 1000003) ^ this.f12526c) * 1000003) ^ (this.f12527d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f12524a + ", pid=" + this.f12525b + ", importance=" + this.f12526c + ", defaultProcess=" + this.f12527d + "}";
    }
}
