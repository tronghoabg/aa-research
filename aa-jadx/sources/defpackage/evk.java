package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class evk {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public evk(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.evk)) {
            defpackage.evk evkVar = (defpackage.evk) obj;
            if (this.a == evkVar.a && this.b == evkVar.b && this.c == evkVar.c && defpackage.afga.f(null, null) && defpackage.afga.f(null, null) && defpackage.afga.f(null, null) && this.d == evkVar.d && this.e == evkVar.e && this.f == evkVar.f && this.g == evkVar.g && this.h == evkVar.h && this.i == evkVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 923521) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        int i = this.f;
        if (i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(java.lang.Integer.toHexString(i));
            sb.append(" exitAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.g));
            sb.append(" popEnterAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.h));
            sb.append(" popExitAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.i));
            sb.append(")");
        } else if (this.g != -1 || this.h != -1 || this.i != -1) {
            i = -1;
            sb.append("anim(enterAnim=0x");
            sb.append(java.lang.Integer.toHexString(i));
            sb.append(" exitAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.g));
            sb.append(" popEnterAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.h));
            sb.append(" popExitAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.i));
            sb.append(")");
        }
        return sb.toString();
    }
}
