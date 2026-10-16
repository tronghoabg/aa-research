package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aemb extends aemf implements aeqd {
    final /* synthetic */ aemi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemb(aemi aemiVar) {
        super(aemiVar);
        this.a = aemiVar;
    }

    @Override // defpackage.aemf
    public final /* bridge */ /* synthetic */ aemf a(int i, int i2, boolean z) {
        return new aemb(this.a, i, i2, z);
    }

    @Override // defpackage.aemf
    public final /* bridge */ /* synthetic */ void c(Object obj, int i) {
        a$$ExternalSyntheticApiModelOutline3.m42m(obj).accept(this.a.a[i]);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f ? 257 : 321;
    }

    @Override // defpackage.aeqd
    public final /* synthetic */ aepf d() {
        throw null;
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqq.ae(this, consumer);
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

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return adqq.af(this, consumer);
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) super.e();
    }

    @Override // j$.util.Spliterator.OfLong
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        super.forEachRemaining((Object) longConsumer);
    }

    @Override // j$.util.Spliterator.OfLong
    public final /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return super.tryAdvance((Object) longConsumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemb(aemi aemiVar, int i, int i2, boolean z) {
        super(aemiVar, i, i2, z);
        this.a = aemiVar;
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return (Spliterator.OfPrimitive) super.e();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        return (Spliterator) super.e();
    }
}
