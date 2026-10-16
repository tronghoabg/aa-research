package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aafr {
    public static final defpackage.aafr a = new defpackage.aafr(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public aafr(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aafr)) {
            return false;
        }
        defpackage.aafr aafrVar = (defpackage.aafr) obj;
        return this.b == aafrVar.b && this.c == aafrVar.c && this.d == aafrVar.d && this.e == aafrVar.e;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e)});
    }

    public final java.lang.String toString() {
        defpackage.zte zteVarA = defpackage.zte.a(this);
        zteVarA.e("left", this.b);
        zteVarA.e("top", this.c);
        zteVarA.e("right", this.d);
        zteVarA.e("bottom", this.e);
        return zteVarA.toString();
    }
}
