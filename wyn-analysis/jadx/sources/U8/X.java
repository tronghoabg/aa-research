package U8;

import java.util.List;

/* loaded from: classes4.dex */
public final class X extends C0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12491a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12492b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12493c;

    public X(int i5, List list, String str) {
        this.f12491a = str;
        this.f12492b = i5;
        this.f12493c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0) {
            C0 c02 = (C0) obj;
            if (this.f12491a.equals(((X) c02).f12491a)) {
                X x5 = (X) c02;
                if (this.f12492b == x5.f12492b && this.f12493c.equals(x5.f12493c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f12491a.hashCode() ^ 1000003) * 1000003) ^ this.f12492b) * 1000003) ^ this.f12493c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f12491a + ", importance=" + this.f12492b + ", frames=" + this.f12493c + "}";
    }
}
