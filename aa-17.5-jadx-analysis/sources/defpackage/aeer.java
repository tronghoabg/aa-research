package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeer implements aefz {
    boolean a;
    int b;
    int c;
    final /* synthetic */ aeev d;

    private aeer(aeev aeevVar, int i, int i2, boolean z) {
        this.d = aeevVar;
        this.b = i;
        this.c = i2;
        this.a = z;
    }

    private final int b() {
        return this.a ? this.c : this.d.b;
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
        return b() - this.b;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        aefj aefjVar = (aefj) obj;
        byte[] bArr = this.d.a;
        int iB = b();
        while (true) {
            int i = this.b;
            if (i >= iB) {
                return;
            }
            aefjVar.b(bArr[i]);
            this.b++;
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
        int iB = b();
        int i = this.b;
        int i2 = (iB - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        this.c = iB;
        int i3 = i2 + i;
        this.b = i3;
        this.a = true;
        return new aeer(this.d, i, i3, true);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        aefj aefjVar = (aefj) obj;
        int i = this.b;
        if (i >= b()) {
            return false;
        }
        byte[] bArr = this.d.a;
        this.b = i + 1;
        aefjVar.b(bArr[i]);
        return true;
    }

    public aeer(aeev aeevVar) {
        this(aeevVar, 0, aeevVar.b, false);
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
