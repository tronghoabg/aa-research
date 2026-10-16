package Q1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f9705c = new p(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f9706a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9707b;

    static {
        new p(0, 0);
    }

    public p(int i5, int i10) {
        k.c((i5 == -1 || i5 >= 0) && (i10 == -1 || i10 >= 0));
        this.f9706a = i5;
        this.f9707b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f9706a == pVar.f9706a && this.f9707b == pVar.f9707b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f9706a;
        return ((i5 >>> 16) | (i5 << 16)) ^ this.f9707b;
    }

    public final String toString() {
        return this.f9706a + "x" + this.f9707b;
    }
}
