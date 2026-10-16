package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aemu extends aena implements aeus {
    final /* synthetic */ aend a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemu(aend aendVar) {
        super(aendVar);
        this.a = aendVar;
    }

    @Override // defpackage.aena
    public final /* bridge */ /* synthetic */ aena a(int i, int i2, boolean z) {
        return new aemu(this.a, i, i2, z);
    }

    @Override // defpackage.aeus
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ aeus trySplit() {
        throw null;
    }

    @Override // defpackage.aena
    public final /* bridge */ /* synthetic */ void c(Object obj, int i) {
        a$$ExternalSyntheticApiModelOutline3.m39m(obj).accept(new aemx(this.a, i));
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f ? 1 : 65;
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
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
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return super.tryAdvance((Object) consumer);
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        return (Spliterator) super.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemu(aend aendVar, int i, int i2, boolean z) {
        super(aendVar, i, i2, z);
        this.a = aendVar;
    }
}
