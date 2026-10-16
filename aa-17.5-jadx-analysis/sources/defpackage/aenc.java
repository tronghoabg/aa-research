package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aenc extends aena implements aeqd {
    final /* synthetic */ aend a;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenc(aend aendVar, int i) {
        super(aendVar);
        this.h = i;
        this.a = aendVar;
    }

    @Override // defpackage.aena
    public final /* synthetic */ aena a(int i, int i2, boolean z) {
        return this.h != 0 ? new aenc(this.a, i, i2, z, 1) : new aenc(this.a, i, i2, z, 0);
    }

    @Override // defpackage.aena
    public final /* synthetic */ void c(Object obj, int i) {
        if (this.h != 0) {
            a$$ExternalSyntheticApiModelOutline3.m42m(obj).accept(this.a.b[i]);
        } else {
            a$$ExternalSyntheticApiModelOutline3.m42m(obj).accept(this.a.c[i]);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        int i = this.h;
        boolean z = this.f;
        return i != 0 ? z ? 257 : 321 : z ? 256 : 320;
    }

    @Override // defpackage.aeqd
    public final /* synthetic */ aepf d() {
        throw null;
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        if (this.h != 0) {
            adqq.ae(this, consumer);
        } else {
            adqq.ae(this, consumer);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.h != 0 ? adqq.ag() : adqq.ag();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.h != 0 ? Spliterator.CC.$default$getExactSizeIfKnown(this) : Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.h != 0 ? Spliterator.CC.$default$hasCharacteristics(this, i) : Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // defpackage.aeqd
    /* renamed from: hs */
    public final /* synthetic */ aeqd trySplit() {
        throw null;
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.h != 0 ? adqq.af(this, consumer) : adqq.af(this, consumer);
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* synthetic */ Spliterator.OfLong trySplit() {
        return this.h != 0 ? (Spliterator.OfLong) super.e() : (Spliterator.OfLong) super.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenc(aend aendVar, int i, int i2, boolean z, int i3) {
        super(aendVar, i, i2, z);
        this.h = i3;
        this.a = aendVar;
    }

    @Override // j$.util.Spliterator.OfLong
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        if (this.h != 0) {
            super.forEachRemaining((Object) longConsumer);
        } else {
            super.forEachRemaining((Object) longConsumer);
        }
    }

    @Override // j$.util.Spliterator.OfLong
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.h != 0 ? super.tryAdvance((Object) longConsumer) : super.tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return this.h != 0 ? (Spliterator.OfPrimitive) super.e() : (Spliterator.OfPrimitive) super.e();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return this.h != 0 ? (Spliterator) super.e() : (Spliterator) super.e();
    }
}
