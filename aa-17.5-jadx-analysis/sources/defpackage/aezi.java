package defpackage;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aezi implements aeze {
    private final aeyu a;
    private long b;
    private int c = 1024;
    private aeze d = null;

    public aezi(aeyu aeyuVar, long j) {
        this.a = aeyuVar;
        this.b = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16720;
    }

    @Override // defpackage.aeze
    public final /* synthetic */ aeyk d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        aeze aezeVar = this.d;
        if (aezeVar != null) {
            return aezeVar.estimateSize();
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
        aeys aeysVar = (aeys) obj;
        aeze aezeVar = this.d;
        if (aezeVar != null) {
            aezeVar.forEachRemaining((aeze) aeysVar);
            this.d = null;
        }
        this.a.forEachRemaining(aeysVar);
        this.b = 0L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return adqs.B();
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
    /* renamed from: hu */
    public final aeze trySplit() {
        aeyu aeyuVar = this.a;
        if (!aeyuVar.hasNext()) {
            return null;
        }
        long j = this.b;
        int iMin = this.c;
        if (j > 0) {
            iMin = (int) Math.min(iMin, j);
        }
        short[] sArrCopyOf = new short[iMin];
        int i = 0;
        while (i < iMin && aeyuVar.hasNext()) {
            sArrCopyOf[i] = aeyuVar.d();
            this.b--;
            i++;
        }
        if (iMin < this.c && aeyuVar.hasNext()) {
            sArrCopyOf = Arrays.copyOf(sArrCopyOf, this.c);
            while (aeyuVar.hasNext() && i < this.c) {
                sArrCopyOf[i] = aeyuVar.d();
                this.b--;
                i++;
            }
        }
        this.c = Math.min(33554432, this.c + 1024);
        aeyf.a(sArrCopyOf, 0, i);
        aezg aezgVar = new aezg(sArrCopyOf, 0, i);
        if (aeyuVar.hasNext()) {
            return aezgVar;
        }
        this.d = aezgVar;
        return aezgVar.trySplit();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        aeys aeysVar = (aeys) obj;
        aeze aezeVar = this.d;
        if (aezeVar != null) {
            boolean zTryAdvance = aezeVar.tryAdvance((aeze) aeysVar);
            if (zTryAdvance) {
                return zTryAdvance;
            }
            this.d = null;
            return zTryAdvance;
        }
        aeyu aeyuVar = this.a;
        if (!aeyuVar.hasNext()) {
            return false;
        }
        this.b--;
        aeysVar.c(aeyuVar.d());
        return true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqs.z(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return adqs.A(this, consumer);
    }
}
