package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class yrt {
    public static final Comparator a = new azl(11);
    public static final yrt b = new yrt(new yrr(Collections.EMPTY_LIST));
    public final yrr c;

    public yrt(yrr yrrVar) {
        this.c = yrrVar;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yrt) && ((yrt) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }
}
