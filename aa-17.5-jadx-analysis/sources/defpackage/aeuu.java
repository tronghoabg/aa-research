package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeuu implements aeus {
    final Object[] a;
    final int b;
    private final int c;
    private final int d;
    private int e;

    public aeuu(Object[] objArr, int i, int i2, int i3) {
        this.a = objArr;
        this.c = i;
        this.d = i2;
        this.b = i3 | 16464;
    }

    @Override // j$.util.Spliterator
    /* renamed from: b */
    public final aeus trySplit() {
        int i = this.d;
        int i2 = this.e;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        int i4 = this.c + i2;
        this.e = i2 + i3;
        return new aeuu(this.a, i4, i3, this.b);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.d - this.e;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            int i = this.e;
            if (i >= this.d) {
                return;
            }
            consumer.accept(this.a[this.c + i]);
            this.e++;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        int i = this.e;
        if (i >= this.d) {
            return false;
        }
        consumer.getClass();
        Object[] objArr = this.a;
        int i2 = this.c;
        this.e = i + 1;
        consumer.accept(objArr[i2 + i]);
        return true;
    }
}
