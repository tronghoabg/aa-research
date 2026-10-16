package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aeja implements aekm {
    boolean a;
    int b;
    int c;
    final /* synthetic */ aegj d;
    private final /* synthetic */ int e;

    private aeja(aegj aegjVar, int i, int i2, boolean z, int i3) {
        this.e = i3;
        this.d = aegjVar;
        this.b = i;
        this.c = i2;
        this.a = z;
    }

    private final int a() {
        return this.a ? this.c : ((aejb) this.d).b;
    }

    private final int c() {
        return this.a ? this.c : ((aeiy) this.d).b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.e != 0 ? 16720 : 16721;
    }

    @Override // defpackage.aekm
    public final /* synthetic */ void d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return (this.e != 0 ? c() : a()) - this.b;
    }

    @Override // j$.util.Spliterator.OfInt
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i = this.e;
        aegj aegjVar = this.d;
        if (i != 0) {
            int[] iArr = ((aeiy) aegjVar).a;
            int iC = c();
            while (true) {
                int i2 = this.b;
                if (i2 >= iC) {
                    return;
                }
                intConsumer.accept(iArr[i2]);
                this.b++;
            }
        } else {
            int[] iArr2 = ((aejb) aegjVar).a;
            int iA = a();
            while (true) {
                int i3 = this.b;
                if (i3 >= iA) {
                    return;
                }
                intConsumer.accept(iArr2[i3]);
                this.b++;
            }
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        if (this.e != 0) {
            aeec.Q();
            return null;
        }
        aeec.Q();
        return null;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.e != 0 ? Spliterator.CC.$default$getExactSizeIfKnown(this) : Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.e != 0 ? Spliterator.CC.$default$hasCharacteristics(this, i) : Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // defpackage.aekm
    /* renamed from: hq */
    public final aekm trySplit() {
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
            return new aeja(this.d, i, i3, true, 1);
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
        return new aeja(this.d, i4, i6, true, 0);
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.e;
        int i2 = this.b;
        if (i != 0) {
            if (i2 >= c()) {
                return false;
            }
            int[] iArr = ((aeiy) this.d).a;
            this.b = i2 + 1;
            intConsumer.accept(iArr[i2]);
            return true;
        }
        if (i2 >= a()) {
            return false;
        }
        int[] iArr2 = ((aejb) this.d).a;
        this.b = i2 + 1;
        intConsumer.accept(iArr2[i2]);
        return true;
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* synthetic */ Spliterator.OfInt trySplit() {
        return this.e != 0 ? trySplit() : trySplit();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aeja(aeiy aeiyVar, int i) {
        this(aeiyVar, 0, aeiyVar.b, false, 1);
        this.e = i;
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return this.e != 0 ? trySplit() : trySplit();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aeja(aejb aejbVar, int i) {
        this(aejbVar, 0, aejbVar.b, false, 0);
        this.e = i;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return this.e != 0 ? trySplit() : trySplit();
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.e != 0 ? aeec.P(this, consumer) : aeec.P(this, consumer);
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        if (this.e != 0) {
            aeec.O(this, consumer);
        } else {
            aeec.O(this, consumer);
        }
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.e != 0 ? tryAdvance(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer)) : tryAdvance(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        if (this.e != 0) {
            forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
        } else {
            forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
        }
    }
}
