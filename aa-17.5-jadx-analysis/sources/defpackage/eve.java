package defpackage;

/* loaded from: classes.dex */
public final class eve {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public eve(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof eve)) {
            eve eveVar = (eve) obj;
            if (this.a == eveVar.a && this.b == eveVar.b && this.c == eveVar.c && affa.f(null, null) && affa.f(null, null) && affa.f(null, null) && this.d == eveVar.d && this.e == eveVar.e && this.f == eveVar.f && this.g == eveVar.g && this.h == eveVar.h && this.i == eveVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 923521) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
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
            sb.append(Integer.toHexString(i));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(this.g));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(this.h));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(this.i));
            sb.append(")");
        } else if (this.g != -1 || this.h != -1 || this.i != -1) {
            i = -1;
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(this.g));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(this.h));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(this.i));
            sb.append(")");
        }
        return sb.toString();
    }
}
