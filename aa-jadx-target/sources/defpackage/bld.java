package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bld {
    private final defpackage.bdy a;
    private final long b;
    private final boolean c;
    private final int d;

    public bld(defpackage.bdy bdyVar, long j, int i, boolean z) {
        this.a = bdyVar;
        this.b = j;
        this.d = i;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bld)) {
            return false;
        }
        defpackage.bld bldVar = (defpackage.bld) obj;
        return this.a == bldVar.a && defpackage.a.i(this.b, bldVar.b) && this.d == bldVar.d && this.c == bldVar.c;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + defpackage.a.f(this.b)) * 31) + this.d) * 31) + defpackage.a.e(this.c);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String strD = defpackage.cji.d(this.b);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(strD);
        sb.append(", anchor=");
        int i = this.d;
        if (i != 1) {
            str = i != 2 ? "Right" : "Middle";
        } else {
            str = "Left";
        }
        sb.append((java.lang.Object) str);
        sb.append(", visible=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
