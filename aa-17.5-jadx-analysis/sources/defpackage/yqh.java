package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class yqh<T> implements Iterator<T> {
    final /* synthetic */ yqi a;
    private final yos b;
    private int c;
    private int d;

    public yqh(yqi yqiVar, yos yosVar, int i) {
        this.a = yqiVar;
        this.b = yosVar;
        int i2 = i & 31;
        this.c = i2;
        this.d = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = (T) this.b.c(this.a.f(this.c));
        int i = this.d;
        if (i == 0) {
            this.c = -1;
            return t;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
        this.d >>>= iNumberOfTrailingZeros;
        this.c += iNumberOfTrailingZeros;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
