package od;

import java.text.MessageFormat;
import java.util.logging.Level;
import md.AbstractC3537e;

/* renamed from: od.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3708n0 extends AbstractC3537e {

    /* renamed from: d, reason: collision with root package name */
    public md.F f42019d;

    @Override // md.AbstractC3537e
    public final void g(int i5, String str) {
        md.F f10 = this.f42019d;
        Level levelT = C3698k.t(i5);
        if (C3704m.f42010c.isLoggable(levelT)) {
            C3704m.a(f10, levelT, str);
        }
    }

    @Override // md.AbstractC3537e
    public final void h(int i5, String str, Object... objArr) {
        md.F f10 = this.f42019d;
        Level levelT = C3698k.t(i5);
        if (C3704m.f42010c.isLoggable(levelT)) {
            C3704m.a(f10, levelT, MessageFormat.format(str, objArr));
        }
    }
}
