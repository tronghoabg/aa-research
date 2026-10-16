package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ujt implements java.io.Serializable {
    public static final defpackage.uju a = new defpackage.uju(0, 0, 0, 0);
    public final java.lang.String b;
    public final byte[] c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final defpackage.uju h;

    public ujt(java.lang.String str, byte[] bArr, int i, int i2, int i3, int i4, defpackage.uju ujuVar) {
        this.b = str;
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = ujuVar;
    }

    public static defpackage.ujs a() {
        defpackage.ujs ujsVar = new defpackage.ujs();
        ujsVar.f("");
        ujsVar.a = null;
        ujsVar.g(0);
        ujsVar.d(-16777216);
        ujsVar.c(0);
        ujsVar.b(0);
        ujsVar.e(a);
        return ujsVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ujt) {
            defpackage.ujt ujtVar = (defpackage.ujt) obj;
            if (this.b.equals(ujtVar.b)) {
                if (java.util.Arrays.equals(this.c, ujtVar instanceof defpackage.ujt ? ujtVar.c : ujtVar.c) && this.d == ujtVar.d && this.e == ujtVar.e && this.f == ujtVar.f && this.g == ujtVar.g && this.h.equals(ujtVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.c);
        defpackage.uju ujuVar = this.h;
        return ((this.g ^ (((((((iHashCode * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003)) * 1000003) ^ ujuVar.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.uju ujuVar = this.h;
        return "{" + this.b + ", " + java.util.Arrays.toString(this.c) + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", " + java.lang.String.valueOf(ujuVar) + "}";
    }

    public ujt() {
        throw null;
    }
}
