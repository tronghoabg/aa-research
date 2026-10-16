package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class yqf implements Iterator {
    final /* synthetic */ yqg a;
    private int b = 0;

    public yqf(yqg yqgVar) {
        this.a = yqgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        yqi yqiVar = this.a.a;
        return yqiVar.e(yqiVar.a[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
