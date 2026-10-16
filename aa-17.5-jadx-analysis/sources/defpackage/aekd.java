package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aekd implements aekm {
    int a;
    final int b;
    int c;
    boolean d;
    boolean e;
    final /* synthetic */ aeke f;

    public aekd(aeke aekeVar) {
        this.f = aekeVar;
        this.a = 0;
        this.b = aekeVar.d;
        this.c = 0;
        this.d = aekeVar.c;
        this.e = false;
    }

    @Override // j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aekd trySplit() {
        int i;
        int i2 = this.b;
        int i3 = this.a;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        aekd aekdVar = new aekd(this.f, i3, i4, this.d);
        this.a = i4;
        this.d = false;
        this.e = true;
        return aekdVar;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.e ? 257 : 321;
    }

    @Override // defpackage.aekm
    public final /* synthetic */ void d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        boolean z = this.e;
        aeke aekeVar = this.f;
        if (!z) {
            return aekeVar.g - this.c;
        }
        return Math.min(aekeVar.g - this.c, ((long) ((aekeVar.m() / aekeVar.d) * (this.b - this.a))) + (this.d ? 1L : 0L));
    }

    @Override // j$.util.Spliterator.OfInt
    public final void forEachRemaining(IntConsumer intConsumer) {
        aeke aekeVar = this.f;
        int[] iArr = aekeVar.a;
        if (this.d) {
            this.d = false;
            intConsumer.accept(iArr[aekeVar.d]);
            this.c++;
        }
        while (true) {
            int i = this.a;
            if (i >= this.b) {
                return;
            }
            int i2 = iArr[i];
            if (i2 != 0) {
                intConsumer.accept(i2);
                this.c++;
            }
            this.a++;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        aeec.Q();
        return null;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // defpackage.aekm
    /* renamed from: hq */
    public final /* bridge */ /* synthetic */ aekm trySplit() {
        throw null;
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.d) {
            this.d = false;
            this.c++;
            aeke aekeVar = this.f;
            intConsumer.accept(aekeVar.a[aekeVar.d]);
            return true;
        }
        int[] iArr = this.f.a;
        while (true) {
            int i = this.a;
            if (i >= this.b) {
                return false;
            }
            int i2 = i + 1;
            int i3 = iArr[i];
            if (i3 != 0) {
                this.c++;
                this.a = i2;
                intConsumer.accept(i3);
                return true;
            }
            this.a = i2;
        }
    }

    public aekd(aeke aekeVar, int i, int i2, boolean z) {
        this.f = aekeVar;
        this.c = 0;
        this.a = i;
        this.b = i2;
        this.d = z;
        this.e = true;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.O(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return aeec.P(this, consumer);
    }
}
