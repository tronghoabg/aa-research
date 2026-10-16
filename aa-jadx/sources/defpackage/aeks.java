package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aeks extends defpackage.aehk {
    protected int b;
    protected int c;

    protected aeks(int i) {
        this.b = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.aehk, j$.util.PrimitiveIterator.OfInt
    public void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        while (true) {
            int i = this.b;
            if (i >= h()) {
                return;
            }
            this.b = i + 1;
            this.c = i;
            intConsumer.accept(g(i));
        }
    }

    protected abstract int g(int i);

    protected abstract int h();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < h();
    }

    protected abstract void j(int i);

    public int nextInt() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        this.c = i;
        return g(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.c;
        if (i == -1) {
            throw new java.lang.IllegalStateException();
        }
        j(i);
        int i2 = this.c;
        int i3 = this.b;
        if (i2 < i3) {
            this.b = i3 - 1;
        }
        this.c = -1;
    }

    @Override // defpackage.aehk, j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        forEachRemaining2(defpackage.a$$ExternalSyntheticApiModelOutline2.m39m((java.lang.Object) intConsumer));
    }
}
