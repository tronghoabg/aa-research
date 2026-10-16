package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iu {
    public int a;
    public int b;
    public java.lang.Object c;
    public int d;

    public iu(int i, int i2, int i3, java.lang.Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    static /* synthetic */ android.view.View a(defpackage.mc mcVar, defpackage.lr lrVar) {
        int iAv = mcVar.av();
        android.view.View view = null;
        if (iAv == 0) {
            return null;
        }
        int iJ = lrVar.j() + (lrVar.k() / 2);
        int i = 0;
        int i2 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        while (i < iAv) {
            android.view.View viewAD = mcVar.aD(i);
            int iAbs = java.lang.Math.abs((lrVar.d(viewAD) + (lrVar.b(viewAD) / 2)) - iJ);
            int i3 = iAbs < i2 ? iAbs : i2;
            if (iAbs < i2) {
                view = viewAD;
            }
            i++;
            i2 = i3;
        }
        return view;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.iu)) {
            return false;
        }
        defpackage.iu iuVar = (defpackage.iu) obj;
        int i = this.a;
        if (i != iuVar.a) {
            return false;
        }
        if (i == 8 && java.lang.Math.abs(this.d - this.b) == 1 && this.d == iuVar.b && this.b == iuVar.d) {
            return true;
        }
        if (this.d != iuVar.d || this.b != iuVar.b) {
            return false;
        }
        java.lang.Object obj2 = this.c;
        if (obj2 != null) {
            if (!obj2.equals(iuVar.c)) {
                return false;
            }
        } else if (iuVar.c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
