package defpackage;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aeks implements aekm {
    final int a;
    private final aejr b;
    private long c;
    private int d = 1024;
    private aekm e = null;

    public aeks(aejr aejrVar, long j, int i) {
        this.b = aejrVar;
        this.c = j;
        this.a = ((i & 4096) != 0 ? 256 : 16704) | i;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a;
    }

    @Override // defpackage.aekm
    public final /* synthetic */ void d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        aekm aekmVar = this.e;
        if (aekmVar != null) {
            return aekmVar.estimateSize();
        }
        if (!this.b.hasNext()) {
            return 0L;
        }
        long j = this.c;
        if (j >= 0) {
            return j;
        }
        return Long.MAX_VALUE;
    }

    @Override // j$.util.Spliterator.OfInt
    public final void forEachRemaining(IntConsumer intConsumer) {
        aekm aekmVar = this.e;
        if (aekmVar != null) {
            aekmVar.forEachRemaining(intConsumer);
            this.e = null;
        }
        this.b.forEachRemaining(intConsumer);
        this.c = 0L;
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
        aejr aejrVar = this.b;
        if (!aejrVar.hasNext()) {
            return null;
        }
        long j = this.c;
        int iMin = this.d;
        if (j > 0) {
            iMin = (int) Math.min(iMin, j);
        }
        int[] iArrCopyOf = new int[iMin];
        int i = 0;
        while (i < iMin && aejrVar.hasNext()) {
            iArrCopyOf[i] = aejrVar.nextInt();
            this.c--;
            i++;
        }
        if (iMin < this.d && aejrVar.hasNext()) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, this.d);
            while (aejrVar.hasNext() && i < this.d) {
                iArrCopyOf[i] = aejrVar.nextInt();
                this.c--;
                i++;
            }
        }
        this.d = Math.min(33554432, this.d + 1024);
        int i2 = this.a;
        aejc.a(iArrCopyOf, 0, i);
        aeko aekoVar = new aeko(iArrCopyOf, 0, i, i2);
        if (aejrVar.hasNext()) {
            return aekoVar;
        }
        this.e = aekoVar;
        return aekoVar.trySplit();
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        aekm aekmVar = this.e;
        if (aekmVar != null) {
            boolean zTryAdvance = aekmVar.tryAdvance(intConsumer);
            if (!zTryAdvance) {
                this.e = null;
            }
            return zTryAdvance;
        }
        aejr aejrVar = this.b;
        if (!aejrVar.hasNext()) {
            return false;
        }
        this.c--;
        intConsumer.accept(aejrVar.nextInt());
        return true;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.O(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return aeec.P(this, consumer);
    }
}
