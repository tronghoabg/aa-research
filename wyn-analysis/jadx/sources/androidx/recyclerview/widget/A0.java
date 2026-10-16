package androidx.recyclerview.widget;

import x.AbstractC4416i;
import x.C4415h;
import x.C4429v;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final C4429v f18754a = new C4429v(0);

    /* renamed from: b, reason: collision with root package name */
    public final C4415h f18755b = new C4415h();

    public final void a(m0 m0Var, O o7) {
        C4429v c4429v = this.f18754a;
        y0 y0VarA = (y0) c4429v.get(m0Var);
        if (y0VarA == null) {
            y0VarA = y0.a();
            c4429v.put(m0Var, y0VarA);
        }
        y0VarA.f19043c = o7;
        y0VarA.f19041a |= 8;
    }

    public final O b(m0 m0Var, int i5) {
        y0 y0Var;
        O o7;
        C4429v c4429v = this.f18754a;
        int iE = c4429v.e(m0Var);
        if (iE >= 0 && (y0Var = (y0) c4429v.k(iE)) != null) {
            int i10 = y0Var.f19041a;
            if ((i10 & i5) != 0) {
                int i11 = i10 & (~i5);
                y0Var.f19041a = i11;
                if (i5 == 4) {
                    o7 = y0Var.f19042b;
                } else {
                    if (i5 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    o7 = y0Var.f19043c;
                }
                if ((i11 & 12) == 0) {
                    c4429v.i(iE);
                    y0Var.f19041a = 0;
                    y0Var.f19042b = null;
                    y0Var.f19043c = null;
                    y0.f19040d.c(y0Var);
                }
                return o7;
            }
        }
        return null;
    }

    public final void c(m0 m0Var) {
        y0 y0Var = (y0) this.f18754a.get(m0Var);
        if (y0Var == null) {
            return;
        }
        y0Var.f19041a &= -2;
    }

    public final void d(m0 m0Var) {
        C4415h c4415h = this.f18755b;
        int iH = c4415h.h() - 1;
        while (true) {
            if (iH < 0) {
                break;
            }
            if (m0Var == c4415h.j(iH)) {
                Object[] objArr = c4415h.f47510c;
                Object obj = objArr[iH];
                Object obj2 = AbstractC4416i.f47512a;
                if (obj != obj2) {
                    objArr[iH] = obj2;
                    c4415h.f47508a = true;
                }
            } else {
                iH--;
            }
        }
        y0 y0Var = (y0) this.f18754a.remove(m0Var);
        if (y0Var != null) {
            y0Var.f19041a = 0;
            y0Var.f19042b = null;
            y0Var.f19043c = null;
            y0.f19040d.c(y0Var);
        }
    }
}
