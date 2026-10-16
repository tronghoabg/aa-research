package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aeko implements aekm {
    final int[] a;
    final int b;
    private final int c;
    private final int d;
    private int e;

    public aeko(int[] iArr, int i, int i2, int i3) {
        this.a = iArr;
        this.c = i;
        this.d = i2;
        this.b = i3 | 16720;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.b;
    }

    @Override // defpackage.aekm
    public final /* synthetic */ void d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.d - this.e;
    }

    @Override // j$.util.Spliterator.OfInt
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        while (true) {
            int i = this.e;
            if (i >= this.d) {
                return;
            }
            intConsumer.accept(this.a[this.c + i]);
            this.e++;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        aeec.Q();
        return null;
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
    /* renamed from: hq */
    public final aekm trySplit() {
        int i = this.d;
        int i2 = this.e;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        int i4 = this.c + i2;
        this.e = i2 + i3;
        return new aeko(this.a, i4, i3, this.b);
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.e;
        if (i >= this.d) {
            return false;
        }
        intConsumer.getClass();
        int[] iArr = this.a;
        int i2 = this.c;
        this.e = i + 1;
        intConsumer.accept(iArr[i2 + i]);
        return true;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.O(this, consumer);
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return aeec.P(this, consumer);
    }
}
