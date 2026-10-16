package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aahm implements java.lang.Comparable {
    public final java.lang.String a;
    public final int b;
    public final int c;
    public final int d;

    public aahm(java.lang.String str, int i, int i2, int i3) {
        defpackage.zlv.n(str, "panoId");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean a() {
        return this.b == 0 && this.c == 0 && this.d == 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.aahm aahmVar = (defpackage.aahm) obj;
        int iCompareTo = this.a.compareTo(aahmVar.a);
        int i = this.d - aahmVar.d;
        int i2 = this.b - aahmVar.b;
        int i3 = this.c - aahmVar.c;
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (i != 0) {
            return i;
        }
        return i2 != 0 ? i2 : i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.aahm)) {
            return false;
        }
        defpackage.aahm aahmVar = (defpackage.aahm) obj;
        return defpackage.a.B(this.a, aahmVar.a) && this.b == aahmVar.b && this.c == aahmVar.c && this.d == aahmVar.d;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)});
    }

    public java.lang.String toString() {
        return java.lang.String.format("TileKey[%s@x%s,y%s,z%s]", this.a, java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d));
    }
}
