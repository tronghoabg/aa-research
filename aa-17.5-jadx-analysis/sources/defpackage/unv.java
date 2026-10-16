package defpackage;

/* loaded from: classes3.dex */
public final class unv {
    public final abgl a;
    public final ukp b;
    public final uoq c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final pxj i;
    public final int j;

    public unv(abgl abglVar, ukp ukpVar, uoq uoqVar, boolean z, boolean z2, boolean z3, String str, boolean z4, pxj pxjVar) {
        abglVar.getClass();
        this.a = abglVar;
        ukpVar.getClass();
        this.b = ukpVar;
        this.c = uoqVar;
        this.j = 1;
        this.d = z;
        this.e = z2;
        this.f = z3;
        str.getClass();
        this.g = str;
        this.h = z4;
        this.i = pxjVar;
    }

    public static boolean a(int i) {
        return false;
    }

    public final boolean equals(Object obj) {
        uoq uoqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof unv) {
            unv unvVar = (unv) obj;
            if (this.a.equals(unvVar.a) && this.b.equals(unvVar.b) && ((uoqVar = this.c) != null ? uoqVar.equals(unvVar.c) : unvVar.c == null)) {
                int i = unvVar.j;
                if (this.d == unvVar.d && this.e == unvVar.e && this.f == unvVar.f && this.g.equals(unvVar.g) && this.h == unvVar.h && this.i.equals(unvVar.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        uoq uoqVar = this.c;
        return this.i.hashCode() ^ ((((~(((((((((((((iHashCode * 1000003) ^ (uoqVar == null ? 0 : uoqVar.hashCode())) * 1000003) ^ 1) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003)) * 1000003) ^ (true == this.h ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        pxj pxjVar = this.i;
        return "{" + this.a.toString() + ", " + this.b.toString() + ", " + String.valueOf(this.c) + ", " + Integer.toString(1) + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", -1, " + this.h + ", " + pxjVar.toString() + "}";
    }

    public unv() {
        throw null;
    }
}
