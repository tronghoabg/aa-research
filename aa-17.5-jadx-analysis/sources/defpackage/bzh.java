package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class bzh implements Iterable, cfd, afgc {
    private final bzg a;
    private final int b;
    private final int c;

    public bzh(bzg bzgVar, int i, int i2) {
        this.a = bzgVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bzh)) {
            return false;
        }
        bzh bzhVar = (bzh) obj;
        return bzhVar.b == this.b && bzhVar.c == this.c && affa.f(bzhVar.a, this.a);
    }

    public final int hashCode() {
        return this.b + (this.a.hashCode() * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        bzg bzgVar = this.a;
        if (bzgVar.g != this.c) {
            bzi.f();
        }
        int i = this.b;
        return bzgVar.j(i) != null ? new bzk() : new bzc(bzgVar, i + 1, i + bzgVar.a[(i * 5) + 3]);
    }
}
