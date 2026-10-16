package defpackage;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aeqi implements aeqd {
    final int a;
    private final aepm b;
    private long c;
    private int d = 1024;
    private aeqd e = null;

    public aeqi(aepm aepmVar, long j, int i) {
        this.b = aepmVar;
        this.c = j;
        this.a = ((i & 4096) != 0 ? 256 : 16704) | i;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a;
    }

    @Override // defpackage.aeqd
    public final /* synthetic */ aepf d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        aeqd aeqdVar = this.e;
        if (aeqdVar != null) {
            return aeqdVar.estimateSize();
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

    @Override // j$.util.Spliterator.OfLong
    public final void forEachRemaining(LongConsumer longConsumer) {
        aeqd aeqdVar = this.e;
        if (aeqdVar != null) {
            aeqdVar.forEachRemaining(longConsumer);
            this.e = null;
        }
        this.b.forEachRemaining(longConsumer);
        this.c = 0L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return adqq.ag();
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
    /* renamed from: hs */
    public final aeqd trySplit() {
        aepm aepmVar = this.b;
        if (!aepmVar.hasNext()) {
            return null;
        }
        long j = this.c;
        int iMin = this.d;
        if (j > 0) {
            iMin = (int) Math.min(iMin, j);
        }
        long[] jArrCopyOf = new long[iMin];
        int i = 0;
        while (i < iMin && aepmVar.hasNext()) {
            jArrCopyOf[i] = aepmVar.nextLong();
            this.c--;
            i++;
        }
        if (iMin < this.d && aepmVar.hasNext()) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, this.d);
            while (aepmVar.hasNext() && i < this.d) {
                jArrCopyOf[i] = aepmVar.nextLong();
                this.c--;
                i++;
            }
        }
        this.d = Math.min(33554432, this.d + 1024);
        int i2 = this.a;
        aeoy.a(jArrCopyOf, 0, i);
        aeqf aeqfVar = new aeqf(jArrCopyOf, 0, i, i2);
        if (aepmVar.hasNext()) {
            return aeqfVar;
        }
        this.e = aeqfVar;
        return aeqfVar.trySplit();
    }

    @Override // j$.util.Spliterator.OfLong
    public final boolean tryAdvance(LongConsumer longConsumer) {
        aeqd aeqdVar = this.e;
        if (aeqdVar != null) {
            boolean zTryAdvance = aeqdVar.tryAdvance(longConsumer);
            if (!zTryAdvance) {
                this.e = null;
            }
            return zTryAdvance;
        }
        aepm aepmVar = this.b;
        if (!aepmVar.hasNext()) {
            return false;
        }
        this.c--;
        longConsumer.accept(aepmVar.nextLong());
        return true;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqq.ae(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return adqq.af(this, consumer);
    }
}
