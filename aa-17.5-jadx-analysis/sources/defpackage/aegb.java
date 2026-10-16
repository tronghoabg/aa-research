package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aegb implements aefz {
    final byte[] a;
    private final int b;
    private final int c;
    private int d;

    public aegb(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
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
        return this.c - this.d;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        aefj aefjVar = (aefj) obj;
        aefjVar.getClass();
        while (true) {
            int i = this.d;
            if (i >= this.c) {
                return;
            }
            aefjVar.b(this.a[this.b + i]);
            this.d++;
        }
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
        int i = this.c;
        int i2 = this.d;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        int i4 = this.b + i2;
        this.d = i2 + i3;
        return new aegb(this.a, i4, i3);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        aefj aefjVar = (aefj) obj;
        int i = this.d;
        if (i >= this.c) {
            return false;
        }
        aefjVar.getClass();
        byte[] bArr = this.a;
        int i2 = this.b;
        this.d = i + 1;
        aefjVar.b(bArr[i2 + i]);
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
