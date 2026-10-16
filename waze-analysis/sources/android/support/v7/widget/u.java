package android.support.v7.widget;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    int f1616a;

    /* renamed from: b, reason: collision with root package name */
    int f1617b;

    /* renamed from: c, reason: collision with root package name */
    Object f1618c;

    /* renamed from: d, reason: collision with root package name */
    int f1619d;

    u(int i2, int i3, int i4, Object obj) {
        this.f1616a = i2;
        this.f1617b = i3;
        this.f1619d = i4;
        this.f1618c = obj;
    }

    static /* synthetic */ View a(en enVar, dv dvVar) {
        int iAs = enVar.as();
        View view = null;
        if (iAs == 0) {
            return null;
        }
        int iJ = dvVar.j() + (dvVar.k() / 2);
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        while (i2 < iAs) {
            View viewAI = enVar.aI(i2);
            int iAbs = Math.abs((dvVar.d(viewAI) + (dvVar.b(viewAI) / 2)) - iJ);
            int i4 = iAbs < i3 ? iAbs : i3;
            if (iAbs < i3) {
                view = viewAI;
            }
            i2++;
            i3 = i4;
        }
        return view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        int i2 = this.f1616a;
        if (i2 != uVar.f1616a) {
            return false;
        }
        if (i2 == 8 && Math.abs(this.f1619d - this.f1617b) == 1 && this.f1619d == uVar.f1617b && this.f1617b == uVar.f1619d) {
            return true;
        }
        if (this.f1619d != uVar.f1619d || this.f1617b != uVar.f1617b) {
            return false;
        }
        Object obj2 = this.f1618c;
        if (obj2 != null) {
            if (!obj2.equals(uVar.f1618c)) {
                return false;
            }
        } else if (uVar.f1618c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f1616a * 31) + this.f1617b) * 31) + this.f1619d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i2 = this.f1616a;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f1617b);
        sb.append("c:");
        sb.append(this.f1619d);
        sb.append(",p:");
        sb.append(this.f1618c);
        sb.append("]");
        return sb.toString();
    }
}
