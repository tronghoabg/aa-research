package od;

import A.AbstractC0213f;
import java.text.MessageFormat;
import java.util.logging.Level;
import md.AbstractC3537e;
import md.C3530B;
import md.EnumC3529A;

/* renamed from: od.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3698k extends AbstractC3537e {

    /* renamed from: d, reason: collision with root package name */
    public final C3704m f41998d;

    /* renamed from: e, reason: collision with root package name */
    public final Y1 f41999e;

    public C3698k(C3704m c3704m, Y1 y12) {
        this.f41998d = c3704m;
        Fe.e.t(y12, "time");
        this.f41999e = y12;
    }

    public static Level t(int i5) {
        int iF = AbstractC0213f.f(i5);
        return iF != 1 ? (iF == 2 || iF == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    @Override // md.AbstractC3537e
    public final void g(int i5, String str) {
        C3704m c3704m = this.f41998d;
        md.F f10 = c3704m.f42012b;
        Level levelT = t(i5);
        if (C3704m.f42010c.isLoggable(levelT)) {
            C3704m.a(f10, levelT, str);
        }
        if (!s(i5) || i5 == 1) {
            return;
        }
        int iF = AbstractC0213f.f(i5);
        EnumC3529A enumC3529A = iF != 2 ? iF != 3 ? EnumC3529A.f40558a : EnumC3529A.f40560c : EnumC3529A.f40559b;
        long jD = this.f41999e.d();
        Fe.e.t(str, "description");
        new C3530B(str, enumC3529A, jD, null);
        synchronized (c3704m.f42011a) {
        }
    }

    @Override // md.AbstractC3537e
    public final void h(int i5, String str, Object... objArr) {
        g(i5, (s(i5) || C3704m.f42010c.isLoggable(t(i5))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean s(int i5) {
        if (i5 != 1) {
            synchronized (this.f41998d.f42011a) {
            }
        }
        return false;
    }
}
