package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class bzc implements Iterator, afgc {
    private final bzg a;
    private final int b;
    private int c;
    private final int d;

    public bzc(bzg bzgVar, int i, int i2) {
        this.a = bzgVar;
        this.b = i2;
        this.c = i;
        this.d = bzgVar.g;
        if (bzgVar.f) {
            bzi.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        bzg bzgVar = this.a;
        int i = bzgVar.g;
        int i2 = this.d;
        if (i != i2) {
            bzi.f();
        }
        int i3 = this.c;
        this.c = bzgVar.a[(i3 * 5) + 3] + i3;
        return new bzh(bzgVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
