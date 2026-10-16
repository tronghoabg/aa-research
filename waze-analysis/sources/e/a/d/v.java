package e.a.d;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends e.a.j {

    /* renamed from: a, reason: collision with root package name */
    private final w f47304a;

    v(w wVar, jy jyVar) {
        com.google.d.b.an.C(wVar, "tracer");
        this.f47304a = wVar;
        com.google.d.b.an.C(jyVar, "time");
    }

    static void c(e.a.az azVar, int i2, String str) {
        Level levelE = e(i2);
        if (w.f47305a.isLoggable(levelE)) {
            w.b(azVar, levelE, str);
        }
    }

    static void d(e.a.az azVar, String str, Object... objArr) {
        Level levelE = e(2);
        if (w.f47305a.isLoggable(levelE)) {
            w.b(azVar, levelE, MessageFormat.format(str, objArr));
        }
    }

    private static Level e(int i2) {
        int i3 = i2 - 1;
        return i3 != 1 ? (i3 == 2 || i3 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    private final void f(int i2) {
        if (i2 != 1) {
            this.f47304a.d();
        }
    }

    @Override // e.a.j
    public final void a(int i2, String str) {
        c(this.f47304a.a(), i2, str);
        f(i2);
    }

    @Override // e.a.j
    public final void b(int i2, String str, Object... objArr) {
        Level levelE = e(i2);
        f(i2);
        a(i2, w.f47305a.isLoggable(levelE) ? MessageFormat.format(str, objArr) : null);
    }
}
