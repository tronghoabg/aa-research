package defpackage;

/* loaded from: classes.dex */
public final class der {
    public int a;
    private final Object b;
    private final int c;
    private final String d;

    public der(Object obj, int i, int i2, String str) {
        this.b = obj;
        this.c = i;
        this.a = i2;
        this.d = str;
    }

    public final det a(int i) {
        int i2 = this.a;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (i == Integer.MIN_VALUE) {
            dka.d("Item.end should be set first");
        }
        return new det(this.b, this.c, i, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof der)) {
            return false;
        }
        der derVar = (der) obj;
        return affa.f(this.b, derVar.b) && this.c == derVar.c && this.a == derVar.a && affa.f(this.d, derVar.d);
    }

    public final int hashCode() {
        Object obj = this.b;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.c) * 31) + this.a) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "MutableRange(item=" + this.b + ", start=" + this.c + ", end=" + this.a + ", tag=" + this.d + ")";
    }
}
