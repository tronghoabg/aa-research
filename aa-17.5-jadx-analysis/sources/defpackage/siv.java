package defpackage;

import java.util.EnumSet;

/* loaded from: classes.dex */
public final class siv {
    public static final siv a = new siv(yrm.n(EnumSet.allOf(siw.class)));
    public static final siv b = new siv(yly.a);
    public static final siv c = new siv(yrm.o(siw.ZWIEBACK, new siw[0]));
    public final ygr d;

    public siv(ygr ygrVar) {
        this.d = ygrVar;
    }

    public final boolean a(siw siwVar) {
        return this.d.contains(siwVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof siv) && this.d.equals(((siv) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
