package defpackage;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public abstract class aejs extends aegk {
    protected int b;
    protected int c;

    protected aejs(int i) {
        this.b = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.aegk, j$.util.PrimitiveIterator.OfInt
    public void forEachRemaining(IntConsumer intConsumer) {
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
            throw new NoSuchElementException();
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
            throw new IllegalStateException();
        }
        j(i);
        int i2 = this.c;
        int i3 = this.b;
        if (i2 < i3) {
            this.b = i3 - 1;
        }
        this.c = -1;
    }

    @Override // defpackage.aegk, j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining2(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }
}
