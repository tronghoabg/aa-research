package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class nwq {
    public final yzz a;
    public final String b;
    public final nuo c;
    public final long d;
    public final boolean e;

    public nwq(nwp nwpVar) {
        this.a = nwpVar.a;
        this.b = nwpVar.b;
        this.c = nwpVar.c;
        this.d = nwpVar.d;
        this.e = nwpVar.e;
    }

    public final String toString() {
        return String.format(Locale.US, "TC[context=%s, pkg=%s]", this.a.name(), this.b);
    }
}
