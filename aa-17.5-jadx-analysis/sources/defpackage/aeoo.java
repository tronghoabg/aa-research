package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeoo extends aeom implements aeus {
    final /* synthetic */ aeop a;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeoo(aeop aeopVar, int i) {
        super(aeopVar);
        this.h = i;
        this.a = aeopVar;
    }

    @Override // defpackage.aeom
    public final /* synthetic */ aeom a(int i, int i2, boolean z) {
        return this.h != 0 ? new aeoo(this.a, i, i2, z, 1) : new aeoo(this.a, i, i2, z, 0);
    }

    @Override // defpackage.aeus
    /* renamed from: b */
    public final /* synthetic */ aeus trySplit() {
        throw null;
    }

    @Override // defpackage.aeom
    public final /* synthetic */ void c(Object obj, int i) {
        if (this.h != 0) {
            a$$ExternalSyntheticApiModelOutline3.m39m(obj).accept(new aeoj(this.a, i));
        } else {
            a$$ExternalSyntheticApiModelOutline3.m39m(obj).accept(this.a.b[i]);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        int i = this.h;
        boolean z = this.f;
        return i != 0 ? z ? 1 : 65 : z ? 0 : 64;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        if (this.h != 0) {
            super.forEachRemaining((Object) consumer);
        } else {
            super.forEachRemaining((Object) consumer);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.h != 0 ? Spliterator.CC.$default$getComparator(this) : Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.h != 0 ? Spliterator.CC.$default$getExactSizeIfKnown(this) : Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.h != 0 ? Spliterator.CC.$default$hasCharacteristics(this, i) : Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.h != 0 ? super.tryAdvance((Object) consumer) : super.tryAdvance((Object) consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return this.h != 0 ? (Spliterator) super.e() : (Spliterator) super.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeoo(aeop aeopVar, int i, int i2, boolean z, int i3) {
        super(aeopVar, i, i2, z);
        this.h = i3;
        this.a = aeopVar;
    }
}
