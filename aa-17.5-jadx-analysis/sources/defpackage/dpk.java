package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class dpk implements Iterator {
    final dpl a;
    int b = 0;

    public dpk(dpl dplVar) {
        this.a = dplVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.d();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dpi dpiVar = (dpi) this.a.a.get(this.b);
        this.b++;
        return dpiVar;
    }
}
