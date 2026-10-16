package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aepv implements aeqd {
    int a;
    final int b;
    int c;
    boolean d;
    boolean e;
    final /* synthetic */ aepw f;

    public aepv(aepw aepwVar) {
        this.f = aepwVar;
        this.a = 0;
        this.b = aepwVar.d;
        this.c = 0;
        this.d = aepwVar.c;
        this.e = false;
    }

    @Override // j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aepv trySplit() {
        int i;
        int i2 = this.b;
        int i3 = this.a;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        aepv aepvVar = new aepv(this.f, i3, i4, this.d);
        this.a = i4;
        this.d = false;
        this.e = true;
        return aepvVar;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.e ? 257 : 321;
    }

    @Override // defpackage.aeqd
    public final /* synthetic */ aepf d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        boolean z = this.e;
        aepw aepwVar = this.f;
        if (!z) {
            return aepwVar.g - this.c;
        }
        return Math.min(aepwVar.g - this.c, ((long) ((aepwVar.m() / aepwVar.d) * (this.b - this.a))) + (this.d ? 1L : 0L));
    }

    @Override // j$.util.Spliterator.OfLong
    public final void forEachRemaining(LongConsumer longConsumer) {
        aepw aepwVar = this.f;
        long[] jArr = aepwVar.a;
        if (this.d) {
            this.d = false;
            longConsumer.accept(jArr[aepwVar.d]);
            this.c++;
        }
        while (true) {
            int i = this.a;
            if (i >= this.b) {
                return;
            }
            long j = jArr[i];
            if (j != 0) {
                longConsumer.accept(j);
                this.c++;
            }
            this.a++;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return adqq.ag();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // defpackage.aeqd
    /* renamed from: hs */
    public final /* bridge */ /* synthetic */ aeqd trySplit() {
        throw null;
    }

    @Override // j$.util.Spliterator.OfLong
    public final boolean tryAdvance(LongConsumer longConsumer) {
        if (this.d) {
            this.d = false;
            this.c++;
            aepw aepwVar = this.f;
            longConsumer.accept(aepwVar.a[aepwVar.d]);
            return true;
        }
        long[] jArr = this.f.a;
        while (true) {
            int i = this.a;
            if (i >= this.b) {
                return false;
            }
            int i2 = i + 1;
            long j = jArr[i];
            if (j != 0) {
                this.c++;
                this.a = i2;
                longConsumer.accept(j);
                return true;
            }
            this.a = i2;
        }
    }

    public aepv(aepw aepwVar, int i, int i2, boolean z) {
        this.f = aepwVar;
        this.c = 0;
        this.a = i;
        this.b = i2;
        this.d = z;
        this.e = true;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqq.ae(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return adqq.af(this, consumer);
    }
}
