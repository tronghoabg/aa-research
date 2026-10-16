package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aeqn extends defpackage.aeme {
    protected int b;
    protected int c;

    protected aeqn(int i) {
        this.b = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.aeme, j$.util.PrimitiveIterator.OfLong
    public void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        while (true) {
            int i = this.b;
            if (i >= g()) {
                return;
            }
            this.b = i + 1;
            this.c = i;
            longConsumer.accept(h(i));
        }
    }

    protected abstract int g();

    protected abstract long h(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < g();
    }

    protected abstract void j(int i);

    public long nextLong() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        this.c = i;
        return h(i);
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

    @Override // defpackage.aeme, j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        forEachRemaining2(defpackage.a$$ExternalSyntheticApiModelOutline2.m41m((java.lang.Object) longConsumer));
    }
}
