package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends j$.util.concurrent.o implements j$.util.Spliterator {
    public final /* synthetic */ byte i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j$.util.concurrent.k[] kVarArr, int i, int i2, int i3, long j, byte b) {
        super(kVarArr, i, i2, i3);
        this.i = b;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.i) {
            case 0:
                break;
        }
        return this.j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    j$.util.concurrent.k kVarA = a();
                    if (kVarA != null) {
                        consumer.accept(kVarA.b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    j$.util.concurrent.k kVarA2 = a();
                    if (kVarA2 != null) {
                        consumer.accept(kVarA2.c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        switch (this.i) {
            case 0:
                break;
        }
        return j$.util.Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
            case 0:
                break;
        }
        return j$.util.Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.i) {
            case 0:
                break;
        }
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                j$.util.concurrent.k kVarA = a();
                if (kVarA == null) {
                    return false;
                }
                consumer.accept(kVarA.b);
                return true;
            default:
                consumer.getClass();
                j$.util.concurrent.k kVarA2 = a();
                if (kVarA2 == null) {
                    return false;
                }
                consumer.accept(kVarA2.c);
                return true;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        switch (this.i) {
            case 0:
                int i = this.f;
                int i2 = this.g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                j$.util.concurrent.k[] kVarArr = this.a;
                this.g = i3;
                long j = this.j >>> 1;
                this.j = j;
                return new j$.util.concurrent.i(kVarArr, this.h, i3, i2, j, (byte) 0);
            default:
                int i4 = this.f;
                int i5 = this.g;
                int i6 = (i4 + i5) >>> 1;
                if (i6 <= i4) {
                    return null;
                }
                j$.util.concurrent.k[] kVarArr2 = this.a;
                this.g = i6;
                long j2 = this.j >>> 1;
                this.j = j2;
                return new j$.util.concurrent.i(kVarArr2, this.h, i6, i5, j2, (byte) 1);
        }
    }
}
