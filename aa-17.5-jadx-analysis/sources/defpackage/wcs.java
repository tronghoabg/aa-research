package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class wcs {
    private final xwx b;
    private ygr c = yly.a;
    private boolean d = false;
    public boolean a = false;

    public wcs(xwx xwxVar) {
        this.b = xwxVar;
    }

    public final wcr a() {
        return new wcr(new wcl(this.b, this.d, this.a, this.c));
    }

    public final void b() {
        this.d = true;
    }

    public final void c(Set set) {
        this.c = ygr.n(set);
    }
}
