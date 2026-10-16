package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uot {
    public final defpackage.abho a;
    public final defpackage.ulk b;
    public final defpackage.upp c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final java.lang.String g;
    public final boolean h;
    public final defpackage.pyd i;
    public final int j;

    public uot(defpackage.abho abhoVar, defpackage.ulk ulkVar, defpackage.upp uppVar, boolean z, boolean z2, boolean z3, java.lang.String str, boolean z4, defpackage.pyd pydVar) {
        abhoVar.getClass();
        this.a = abhoVar;
        ulkVar.getClass();
        this.b = ulkVar;
        this.c = uppVar;
        this.j = 1;
        this.d = z;
        this.e = z2;
        this.f = z3;
        str.getClass();
        this.g = str;
        this.h = z4;
        this.i = pydVar;
    }

    public static boolean a(int i) {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.upp uppVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uot) {
            defpackage.uot uotVar = (defpackage.uot) obj;
            if (this.a.equals(uotVar.a) && this.b.equals(uotVar.b) && ((uppVar = this.c) != null ? uppVar.equals(uotVar.c) : uotVar.c == null)) {
                int i = uotVar.j;
                if (this.d == uotVar.d && this.e == uotVar.e && this.f == uotVar.f && this.g.equals(uotVar.g) && this.h == uotVar.h && this.i.equals(uotVar.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        defpackage.upp uppVar = this.c;
        return this.i.hashCode() ^ ((((~(((((((((((((iHashCode * 1000003) ^ (uppVar == null ? 0 : uppVar.hashCode())) * 1000003) ^ 1) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003)) * 1000003) ^ (true == this.h ? 1231 : 1237)) * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.pyd pydVar = this.i;
        return "{" + this.a.toString() + ", " + this.b.toString() + ", " + java.lang.String.valueOf(this.c) + ", 1, " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", -1, " + this.h + ", " + pydVar.toString() + "}";
    }

    public uot() {
        throw null;
    }
}
