package defpackage;

import j$.util.Iterator;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aeuy implements aeus {
    final int a;
    private final aety b;
    private long c;
    private int d = 1024;
    private aeus e = null;

    public aeuy(aety aetyVar, long j, int i) {
        this.b = aetyVar;
        this.c = j;
        if ((i & 4096) != 0) {
            this.a = i;
        } else {
            this.a = i | 16448;
        }
    }

    @Override // defpackage.aeus
    /* renamed from: b */
    public final aeus trySplit() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        aeus aeusVar = this.e;
        if (aeusVar != null) {
            return aeusVar.estimateSize();
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

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        aeus aeusVar = this.e;
        if (aeusVar != null) {
            aeusVar.forEachRemaining(consumer);
            this.e = null;
        }
        Iterator.EL.forEachRemaining(this.b, consumer);
        this.c = 0L;
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
        aeus aeusVar = this.e;
        if (aeusVar != null) {
            boolean zTryAdvance = aeusVar.tryAdvance(consumer);
            if (!zTryAdvance) {
                this.e = null;
            }
            return zTryAdvance;
        }
        aety aetyVar = this.b;
        if (!aetyVar.hasNext()) {
            return false;
        }
        this.c--;
        consumer.accept(aetyVar.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        aety aetyVar = this.b;
        if (!aetyVar.hasNext()) {
            return null;
        }
        long j = this.c;
        int iMin = this.d;
        if (j > 0) {
            iMin = (int) Math.min(iMin, j);
        }
        Object[] objArrCopyOf = new Object[iMin];
        int i = 0;
        while (i < iMin && aetyVar.hasNext()) {
            objArrCopyOf[i] = aetyVar.next();
            this.c--;
            i++;
        }
        if (iMin < this.d && aetyVar.hasNext()) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, this.d);
            while (aetyVar.hasNext() && i < this.d) {
                objArrCopyOf[i] = aetyVar.next();
                this.c--;
                i++;
            }
        }
        this.d = Math.min(33554432, this.d + 1024);
        int i2 = this.a;
        aett.a(objArrCopyOf, 0, i);
        aeuu aeuuVar = new aeuu(objArrCopyOf, 0, i, i2);
        if (aetyVar.hasNext()) {
            return aeuuVar;
        }
        this.e = aeuuVar;
        return aeuuVar.trySplit();
    }
}
