package defpackage;

import j$.util.Spliterator;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aetr implements aeus {
    boolean a;
    int b;
    int c;
    final /* synthetic */ AbstractCollection d;
    private final /* synthetic */ int e;

    private aetr(AbstractCollection abstractCollection, int i, int i2, boolean z, int i3) {
        this.e = i3;
        this.d = abstractCollection;
        this.b = i;
        this.c = i2;
        this.a = z;
    }

    private final int a() {
        return this.a ? this.c : ((aets) this.d).b;
    }

    private final int c() {
        return this.a ? this.c : ((aetq) this.d).b;
    }

    private final int d() {
        return this.a ? this.c : ((aexh) this.d).b;
    }

    private final int e() {
        return this.a ? this.c : ((aexj) this.d).b;
    }

    @Override // defpackage.aeus
    /* renamed from: b */
    public final aeus trySplit() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        int i = this.e;
        return (i == 1 || i == 2) ? 16464 : 16465;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.e;
        return (i != 0 ? i != 1 ? i != 2 ? e() : d() : c() : a()) - this.b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i = this.e;
        if (i == 0) {
            Object[] objArr = ((aets) this.d).a;
            int iA = a();
            while (true) {
                int i2 = this.b;
                if (i2 >= iA) {
                    return;
                }
                consumer.accept(objArr[i2]);
                this.b++;
            }
        } else if (i != 1) {
            AbstractCollection abstractCollection = this.d;
            if (i != 2) {
                Object[] objArr2 = ((aexj) abstractCollection).a;
                int iE = e();
                while (true) {
                    int i3 = this.b;
                    if (i3 >= iE) {
                        return;
                    }
                    consumer.accept(objArr2[i3]);
                    this.b++;
                }
            } else {
                Object[] objArr3 = ((aexh) abstractCollection).a;
                int iD = d();
                while (true) {
                    int i4 = this.b;
                    if (i4 >= iD) {
                        return;
                    }
                    consumer.accept(objArr3[i4]);
                    this.b++;
                }
            }
        } else {
            Object[] objArr4 = ((aetq) this.d).a;
            int iC = c();
            while (true) {
                int i5 = this.b;
                if (i5 >= iC) {
                    return;
                }
                consumer.accept(objArr4[i5]);
                this.b++;
            }
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        int i = this.e;
        return i != 0 ? i != 1 ? i != 2 ? Spliterator.CC.$default$getComparator(this) : Spliterator.CC.$default$getComparator(this) : Spliterator.CC.$default$getComparator(this) : Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        int i = this.e;
        return i != 0 ? i != 1 ? i != 2 ? Spliterator.CC.$default$getExactSizeIfKnown(this) : Spliterator.CC.$default$getExactSizeIfKnown(this) : Spliterator.CC.$default$getExactSizeIfKnown(this) : Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        int i2 = this.e;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? Spliterator.CC.$default$hasCharacteristics(this, i) : Spliterator.CC.$default$hasCharacteristics(this, i) : Spliterator.CC.$default$hasCharacteristics(this, i) : Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        int i = this.e;
        if (i == 0) {
            int i2 = this.b;
            if (i2 >= a()) {
                return false;
            }
            Object[] objArr = ((aets) this.d).a;
            this.b = i2 + 1;
            consumer.accept(objArr[i2]);
            return true;
        }
        if (i == 1) {
            int i3 = this.b;
            if (i3 >= c()) {
                return false;
            }
            Object[] objArr2 = ((aetq) this.d).a;
            this.b = i3 + 1;
            consumer.accept(objArr2[i3]);
            return true;
        }
        int i4 = this.b;
        if (i != 2) {
            if (i4 >= e()) {
                return false;
            }
            Object[] objArr3 = ((aexj) this.d).a;
            this.b = i4 + 1;
            consumer.accept(objArr3[i4]);
            return true;
        }
        if (i4 >= d()) {
            return false;
        }
        Object[] objArr4 = ((aexh) this.d).a;
        this.b = i4 + 1;
        consumer.accept(objArr4[i4]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        int i = this.e;
        if (i == 0) {
            int iA = a();
            int i2 = this.b;
            int i3 = (iA - i2) >> 1;
            if (i3 <= 1) {
                return null;
            }
            this.c = iA;
            int i4 = i2 + i3;
            this.b = i4;
            this.a = true;
            return new aetr(this.d, i2, i4, true, 0);
        }
        if (i == 1) {
            int iC = c();
            int i5 = this.b;
            int i6 = (iC - i5) >> 1;
            if (i6 <= 1) {
                return null;
            }
            this.c = iC;
            int i7 = i5 + i6;
            this.b = i7;
            this.a = true;
            return new aetr(this.d, i5, i7, true, 1);
        }
        if (i != 2) {
            int iE = e();
            int i8 = this.b;
            int i9 = (iE - i8) >> 1;
            if (i9 <= 1) {
                return null;
            }
            this.c = iE;
            int i10 = i8 + i9;
            this.b = i10;
            this.a = true;
            return new aetr(this.d, i8, i10, true, 3);
        }
        int iD = d();
        int i11 = this.b;
        int i12 = (iD - i11) >> 1;
        if (i12 <= 1) {
            return null;
        }
        this.c = iD;
        int i13 = i11 + i12;
        this.b = i13;
        this.a = true;
        return new aetr(this.d, i11, i13, true, 2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aetr(aetq aetqVar, int i) {
        this(aetqVar, 0, aetqVar.b, false, 1);
        this.e = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aetr(aets aetsVar, int i) {
        this(aetsVar, 0, aetsVar.b, false, 0);
        this.e = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aetr(aexh aexhVar, int i) {
        this(aexhVar, 0, aexhVar.b, false, 2);
        this.e = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aetr(aexj aexjVar, int i) {
        this(aexjVar, 0, aexjVar.b, false, 3);
        this.e = i;
    }
}
