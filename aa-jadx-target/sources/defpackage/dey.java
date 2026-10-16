package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dey {
    public int a;
    private final java.lang.Object b;
    private final int c;
    private final java.lang.String d;

    public dey(java.lang.Object obj, int i, int i2, java.lang.String str) {
        this.b = obj;
        this.c = i;
        this.a = i2;
        this.d = str;
    }

    public final defpackage.dfa a(int i) {
        int i2 = this.a;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (i == Integer.MIN_VALUE) {
            defpackage.dki.d("Item.end should be set first");
        }
        return new defpackage.dfa(this.b, this.c, i, this.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dey)) {
            return false;
        }
        defpackage.dey deyVar = (defpackage.dey) obj;
        return defpackage.afga.f(this.b, deyVar.b) && this.c == deyVar.c && this.a == deyVar.a && defpackage.afga.f(this.d, deyVar.d);
    }

    public final int hashCode() {
        java.lang.Object obj = this.b;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.c) * 31) + this.a) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "MutableRange(item=" + this.b + ", start=" + this.c + ", end=" + this.a + ", tag=" + this.d + ")";
    }
}
