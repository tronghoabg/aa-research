package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1462a {

    /* renamed from: a, reason: collision with root package name */
    public int f18816a;

    /* renamed from: b, reason: collision with root package name */
    public int f18817b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18818c;

    /* renamed from: d, reason: collision with root package name */
    public int f18819d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1462a)) {
                return false;
            }
            C1462a c1462a = (C1462a) obj;
            int i5 = this.f18816a;
            if (i5 != c1462a.f18816a) {
                return false;
            }
            if (i5 != 8 || Math.abs(this.f18819d - this.f18817b) != 1 || this.f18819d != c1462a.f18817b || this.f18817b != c1462a.f18819d) {
                if (this.f18819d != c1462a.f18819d || this.f18817b != c1462a.f18817b) {
                    return false;
                }
                Object obj2 = this.f18818c;
                if (obj2 != null) {
                    if (!obj2.equals(c1462a.f18818c)) {
                        return false;
                    }
                } else if (c1462a.f18818c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f18816a * 31) + this.f18817b) * 31) + this.f18819d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i5 = this.f18816a;
        sb2.append(i5 != 1 ? i5 != 2 ? i5 != 4 ? i5 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.f18817b);
        sb2.append("c:");
        sb2.append(this.f18819d);
        sb2.append(",p:");
        sb2.append(this.f18818c);
        sb2.append("]");
        return sb2.toString();
    }
}
