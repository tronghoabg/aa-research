package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aevs extends aevq implements aekm {
    final /* synthetic */ aevt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aevs(aevt aevtVar) {
        super(aevtVar);
        this.a = aevtVar;
    }

    @Override // defpackage.aevq
    public final /* bridge */ /* synthetic */ aevq a(int i, int i2, boolean z) {
        return new aevs(this.a, i, i2, z);
    }

    @Override // defpackage.aevq
    public final /* bridge */ /* synthetic */ void c(Object obj, int i) {
        a$$ExternalSyntheticApiModelOutline3.m40m(obj).accept(this.a.b[i]);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f ? 256 : 320;
    }

    @Override // defpackage.aekm
    public final /* synthetic */ void d() {
        throw null;
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.O(this, consumer);
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

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return aeec.P(this, consumer);
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.e();
    }

    @Override // j$.util.Spliterator.OfInt
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        super.forEachRemaining((Object) intConsumer);
    }

    @Override // j$.util.Spliterator.OfInt
    public final /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return super.tryAdvance((Object) intConsumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aevs(aevt aevtVar, int i, int i2, boolean z) {
        super(aevtVar, i, i2, z);
        this.a = aevtVar;
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
