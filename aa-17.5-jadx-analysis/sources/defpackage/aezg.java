package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aezg implements aeze {
    final short[] a;
    private final int b;
    private final int c;
    private int d;

    public aezg(short[] sArr, int i, int i2) {
        this.a = sArr;
        this.b = i;
        this.c = i2;
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
        return this.c - this.d;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        aeys aeysVar = (aeys) obj;
        aeysVar.getClass();
        while (true) {
            int i = this.d;
            if (i >= this.c) {
                return;
            }
            aeysVar.c(this.a[this.b + i]);
            this.d++;
        }
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
        int i = this.c;
        int i2 = this.d;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        int i4 = this.b + i2;
        this.d = i2 + i3;
        return new aezg(this.a, i4, i3);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        aeys aeysVar = (aeys) obj;
        int i = this.d;
        if (i >= this.c) {
            return false;
        }
        aeysVar.getClass();
        short[] sArr = this.a;
        int i2 = this.b;
        this.d = i + 1;
        aeysVar.c(sArr[i2 + i]);
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
