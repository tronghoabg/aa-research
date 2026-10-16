package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aelx extends aemf implements aeus {
    final /* synthetic */ aemi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aelx(aemi aemiVar) {
        super(aemiVar);
        this.a = aemiVar;
    }

    @Override // defpackage.aemf
    public final /* bridge */ /* synthetic */ aemf a(int i, int i2, boolean z) {
        return new aelx(this.a, i, i2, z);
    }

    @Override // defpackage.aeus
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ aeus trySplit() {
        throw null;
    }

    @Override // defpackage.aemf
    public final /* bridge */ /* synthetic */ void c(Object obj, int i) {
        a$$ExternalSyntheticApiModelOutline3.m39m(obj).accept(new aemc(this.a, i));
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
    public aelx(aemi aemiVar, int i, int i2, boolean z) {
        super(aemiVar, i, i2, z);
        this.a = aemiVar;
    }
}
