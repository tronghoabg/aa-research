package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeww extends aexa implements aeus {
    final /* synthetic */ aexc a;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeww(aexc aexcVar, int i) {
        super(aexcVar);
        this.h = i;
        this.a = aexcVar;
    }

    @Override // defpackage.aexa
    public final /* synthetic */ aexa a(int i, int i2, boolean z) {
        int i3 = this.h;
        return i3 != 0 ? i3 != 1 ? new aeww(this.a, i, i2, z, 2) : new aeww(this.a, i, i2, z, 1) : new aeww(this.a, i, i2, z, 0);
    }

    @Override // defpackage.aeus
    /* renamed from: b */
    public final /* synthetic */ aeus trySplit() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aexa
    public final /* synthetic */ void c(Object obj, int i) {
        int i2 = this.h;
        if (i2 == 0) {
            obj.accept(this.a.a[i]);
        } else if (i2 != 1) {
            obj.accept(this.a.b[i]);
        } else {
            obj.accept(new aewx(this.a, i, 0));
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        int i = this.h;
        boolean z = this.f;
        return i != 0 ? i != 1 ? z ? 0 : 64 : z ? 1 : 65 : z ? 1 : 65;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        int i = this.h;
        if (i == 0) {
            super.e(consumer);
        } else if (i != 1) {
            super.e(consumer);
        } else {
            super.e(consumer);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        int i = this.h;
        return i != 0 ? i != 1 ? Spliterator.CC.$default$getComparator(this) : Spliterator.CC.$default$getComparator(this) : Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        int i = this.h;
        return i != 0 ? i != 1 ? Spliterator.CC.$default$getExactSizeIfKnown(this) : Spliterator.CC.$default$getExactSizeIfKnown(this) : Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        int i2 = this.h;
        return i2 != 0 ? i2 != 1 ? Spliterator.CC.$default$hasCharacteristics(this, i) : Spliterator.CC.$default$hasCharacteristics(this, i) : Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        int i = this.h;
        return i != 0 ? i != 1 ? super.f(consumer) : super.f(consumer) : super.f(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        int i = this.h;
        return i != 0 ? i != 1 ? (Spliterator) super.d() : (Spliterator) super.d() : (Spliterator) super.d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeww(aexc aexcVar, int i, int i2, boolean z, int i3) {
        super(aexcVar, i, i2, z);
        this.h = i3;
        this.a = aexcVar;
    }
}
