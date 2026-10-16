package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aeow implements aeqd {
    boolean a;
    int b;
    int c;
    final /* synthetic */ aeld d;
    private final /* synthetic */ int e;

    private aeow(aeld aeldVar, int i, int i2, boolean z, int i3) {
        this.e = i3;
        this.d = aeldVar;
        this.b = i;
        this.c = i2;
        this.a = z;
    }

    private final int a() {
        return this.a ? this.c : ((aeox) this.d).b;
    }

    private final int c() {
        return this.a ? this.c : ((aeou) this.d).b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.e != 0 ? 16720 : 16721;
    }

    @Override // defpackage.aeqd
    public final /* synthetic */ aepf d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return (this.e != 0 ? c() : a()) - this.b;
    }

    @Override // j$.util.Spliterator.OfLong
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i = this.e;
        aeld aeldVar = this.d;
        if (i != 0) {
            long[] jArr = ((aeou) aeldVar).a;
            int iC = c();
            while (true) {
                int i2 = this.b;
                if (i2 >= iC) {
                    return;
                }
                longConsumer.accept(jArr[i2]);
                this.b++;
            }
        } else {
            long[] jArr2 = ((aeox) aeldVar).a;
            int iA = a();
            while (true) {
                int i3 = this.b;
                if (i3 >= iA) {
                    return;
                }
                longConsumer.accept(jArr2[i3]);
                this.b++;
            }
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.e != 0 ? adqq.ag() : adqq.ag();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.e != 0 ? Spliterator.CC.$default$getExactSizeIfKnown(this) : Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.e != 0 ? Spliterator.CC.$default$hasCharacteristics(this, i) : Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // defpackage.aeqd
    /* renamed from: hs */
    public final aeqd trySplit() {
        if (this.e != 0) {
            int iC = c();
            int i = this.b;
            int i2 = (iC - i) >> 1;
            if (i2 <= 1) {
                return null;
            }
            this.c = iC;
            int i3 = i + i2;
            this.b = i3;
            this.a = true;
            return new aeow(this.d, i, i3, true, 1);
        }
        int iA = a();
        int i4 = this.b;
        int i5 = (iA - i4) >> 1;
        if (i5 <= 1) {
            return null;
        }
        this.c = iA;
        int i6 = i4 + i5;
        this.b = i6;
        this.a = true;
        return new aeow(this.d, i4, i6, true, 0);
    }

    @Override // j$.util.Spliterator.OfLong
    public final boolean tryAdvance(LongConsumer longConsumer) {
        int i = this.e;
        int i2 = this.b;
        if (i != 0) {
            if (i2 >= c()) {
                return false;
            }
            long[] jArr = ((aeou) this.d).a;
            this.b = i2 + 1;
            longConsumer.accept(jArr[i2]);
            return true;
        }
        if (i2 >= a()) {
            return false;
        }
        long[] jArr2 = ((aeox) this.d).a;
        this.b = i2 + 1;
        longConsumer.accept(jArr2[i2]);
        return true;
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* synthetic */ Spliterator.OfLong trySplit() {
        return this.e != 0 ? trySplit() : trySplit();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aeow(aeou aeouVar, int i) {
        this(aeouVar, 0, aeouVar.b, false, 1);
        this.e = i;
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return this.e != 0 ? trySplit() : trySplit();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aeow(aeox aeoxVar, int i) {
        this(aeoxVar, 0, aeoxVar.b, false, 0);
        this.e = i;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return this.e != 0 ? trySplit() : trySplit();
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.e != 0 ? adqq.af(this, consumer) : adqq.af(this, consumer);
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        if (this.e != 0) {
            adqq.ae(this, consumer);
        } else {
            adqq.ae(this, consumer);
        }
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.e != 0 ? tryAdvance(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer)) : tryAdvance(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        if (this.e != 0) {
            forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
        } else {
            forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
        }
    }
}
