package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;

/* loaded from: classes2.dex */
public final class it {
    public int a;
    public int b;
    public Object c;
    public int d;

    public it(int i, int i2, int i3, Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    static /* synthetic */ View a(lz lzVar, lq lqVar) {
        int iAv = lzVar.av();
        View view = null;
        if (iAv == 0) {
            return null;
        }
        int iJ = lqVar.j() + (lqVar.k() / 2);
        int i = 0;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        while (i < iAv) {
            View viewAD = lzVar.aD(i);
            int iAbs = Math.abs((lqVar.d(viewAD) + (lqVar.b(viewAD) / 2)) - iJ);
            int i3 = iAbs < i2 ? iAbs : i2;
            if (iAbs < i2) {
                view = viewAD;
            }
            i++;
            i2 = i3;
        }
        return view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it)) {
            return false;
        }
        it itVar = (it) obj;
        int i = this.a;
        if (i != itVar.a) {
            return false;
        }
        if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == itVar.b && this.b == itVar.d) {
            return true;
        }
        if (this.d != itVar.d || this.b != itVar.b) {
            return false;
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            if (!obj2.equals(itVar.c)) {
                return false;
            }
        } else if (itVar.c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
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
