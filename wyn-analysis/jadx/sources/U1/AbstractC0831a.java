package U1;

import android.util.Pair;
import k2.g0;

/* renamed from: U1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0831a extends N1.N {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f12016d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f12017b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f12018c;

    public AbstractC0831a(g0 g0Var) {
        this.f12018c = g0Var;
        this.f12017b = g0Var.f39073b.length;
    }

    @Override // N1.N
    public final int a(boolean z2) {
        if (this.f12017b != 0) {
            int iW = 0;
            if (z2) {
                int[] iArr = this.f12018c.f39073b;
                iW = iArr.length > 0 ? iArr[0] : -1;
            }
            while (y(iW).p()) {
                iW = w(iW, z2);
                if (iW == -1) {
                }
            }
            return y(iW).a(z2) + v(iW);
        }
        return -1;
    }

    @Override // N1.N
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        if (iQ == -1 || (iB = y(iQ).b(obj3)) == -1) {
            return -1;
        }
        return u(iQ) + iB;
    }

    @Override // N1.N
    public final int c(boolean z2) {
        int iX;
        int i5 = this.f12017b;
        if (i5 != 0) {
            if (z2) {
                int[] iArr = this.f12018c.f39073b;
                iX = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iX = i5 - 1;
            }
            while (y(iX).p()) {
                iX = x(iX, z2);
                if (iX == -1) {
                }
            }
            return y(iX).c(z2) + v(iX);
        }
        return -1;
    }

    @Override // N1.N
    public final int e(int i5, int i10, boolean z2) {
        int iS = s(i5);
        int iV = v(iS);
        int iE = y(iS).e(i5 - iV, i10 == 2 ? 0 : i10, z2);
        if (iE != -1) {
            return iV + iE;
        }
        int iW = w(iS, z2);
        while (iW != -1 && y(iW).p()) {
            iW = w(iW, z2);
        }
        if (iW != -1) {
            return y(iW).a(z2) + v(iW);
        }
        if (i10 == 2) {
            return a(z2);
        }
        return -1;
    }

    @Override // N1.N
    public final N1.L f(int i5, N1.L l10, boolean z2) {
        int iR = r(i5);
        int iV = v(iR);
        y(iR).f(i5 - u(iR), l10, z2);
        l10.f8050c += iV;
        if (z2) {
            Object objT = t(iR);
            Object obj = l10.f8049b;
            obj.getClass();
            l10.f8049b = Pair.create(objT, obj);
        }
        return l10;
    }

    @Override // N1.N
    public final N1.L g(Object obj, N1.L l10) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        int iV = v(iQ);
        y(iQ).g(obj3, l10);
        l10.f8050c += iV;
        l10.f8049b = obj;
        return l10;
    }

    @Override // N1.N
    public final int k(int i5, int i10, boolean z2) {
        int iS = s(i5);
        int iV = v(iS);
        int iK = y(iS).k(i5 - iV, i10 == 2 ? 0 : i10, z2);
        if (iK != -1) {
            return iV + iK;
        }
        int iX = x(iS, z2);
        while (iX != -1 && y(iX).p()) {
            iX = x(iX, z2);
        }
        if (iX != -1) {
            return y(iX).c(z2) + v(iX);
        }
        if (i10 == 2) {
            return c(z2);
        }
        return -1;
    }

    @Override // N1.N
    public final Object l(int i5) {
        int iR = r(i5);
        return Pair.create(t(iR), y(iR).l(i5 - u(iR)));
    }

    @Override // N1.N
    public final N1.M m(int i5, N1.M m10, long j8) {
        int iS = s(i5);
        int iV = v(iS);
        int iU = u(iS);
        y(iS).m(i5 - iV, m10, j8);
        Object objT = t(iS);
        if (!N1.M.f8055q.equals(m10.f8057a)) {
            objT = Pair.create(objT, m10.f8057a);
        }
        m10.f8057a = objT;
        m10.f8069n += iU;
        m10.f8070o += iU;
        return m10;
    }

    public abstract int q(Object obj);

    public abstract int r(int i5);

    public abstract int s(int i5);

    public abstract Object t(int i5);

    public abstract int u(int i5);

    public abstract int v(int i5);

    public final int w(int i5, boolean z2) {
        if (!z2) {
            if (i5 < this.f12017b - 1) {
                return i5 + 1;
            }
            return -1;
        }
        g0 g0Var = this.f12018c;
        int i10 = g0Var.f39074c[i5] + 1;
        int[] iArr = g0Var.f39073b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int x(int i5, boolean z2) {
        if (!z2) {
            if (i5 > 0) {
                return i5 - 1;
            }
            return -1;
        }
        g0 g0Var = this.f12018c;
        int i10 = g0Var.f39074c[i5] - 1;
        if (i10 >= 0) {
            return g0Var.f39073b[i10];
        }
        return -1;
    }

    public abstract N1.N y(int i5);
}
