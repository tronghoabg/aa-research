package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yrm<T> implements java.util.Iterator<T> {
    final /* synthetic */ defpackage.yrn a;
    private final defpackage.ypx b;
    private int c;
    private int d;

    public yrm(defpackage.yrn yrnVar, defpackage.ypx ypxVar, int i) {
        this.a = yrnVar;
        this.b = ypxVar;
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
        int iNumberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(i) + 1;
        this.d >>>= iNumberOfTrailingZeros;
        this.c += iNumberOfTrailingZeros;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
