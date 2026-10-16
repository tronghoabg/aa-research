package defpackage;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aegd implements aefz {
    private final aefl a;
    private long b;
    private int c = 1024;
    private aefz d = null;

    public aegd(aefl aeflVar, long j) {
        this.a = aeflVar;
        this.b = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16720;
    }

    @Override // defpackage.aefz
    public final /* synthetic */ aefb d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        aefz aefzVar = this.d;
        if (aefzVar != null) {
            return aefzVar.estimateSize();
        }
        if (!this.a.hasNext()) {
            return 0L;
        }
        long j = this.b;
        if (j >= 0) {
            return j;
        }
        return Long.MAX_VALUE;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        aefj aefjVar = (aefj) obj;
        aefz aefzVar = this.d;
        if (aefzVar != null) {
            aefzVar.forEachRemaining((aefz) aefjVar);
            this.d = null;
        }
        this.a.forEachRemaining(aefjVar);
        this.b = 0L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return adzo.F();
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
    /* renamed from: hp */
    public final aefz trySplit() {
        aefl aeflVar = this.a;
        if (!aeflVar.hasNext()) {
            return null;
        }
        long j = this.b;
        int iMin = this.c;
        if (j > 0) {
            iMin = (int) Math.min(iMin, j);
        }
        byte[] bArrCopyOf = new byte[iMin];
        int i = 0;
        while (i < iMin && aeflVar.hasNext()) {
            bArrCopyOf[i] = aeflVar.c();
            this.b--;
            i++;
        }
        if (iMin < this.c && aeflVar.hasNext()) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, this.c);
            while (aeflVar.hasNext() && i < this.c) {
                bArrCopyOf[i] = aeflVar.c();
                this.b--;
                i++;
            }
        }
        this.c = Math.min(33554432, this.c + 1024);
        aeew.a(bArrCopyOf, 0, i);
        aegb aegbVar = new aegb(bArrCopyOf, 0, i);
        if (aeflVar.hasNext()) {
            return aegbVar;
        }
        this.d = aegbVar;
        return aegbVar.trySplit();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        aefj aefjVar = (aefj) obj;
        aefz aefzVar = this.d;
        if (aefzVar != null) {
            boolean zTryAdvance = aefzVar.tryAdvance((aefz) aefjVar);
            if (zTryAdvance) {
                return zTryAdvance;
            }
            this.d = null;
            return zTryAdvance;
        }
        aefl aeflVar = this.a;
        if (!aeflVar.hasNext()) {
            return false;
        }
        this.b--;
        aefjVar.b(aeflVar.c());
        return true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adzo.D(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return adzo.E(this, consumer);
    }
}
