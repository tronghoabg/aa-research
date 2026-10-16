package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeuk implements aeus {
    int a;
    final int b;
    int c;
    boolean d;
    boolean e;
    final /* synthetic */ aeul f;

    public aeuk(aeul aeulVar) {
        this.f = aeulVar;
        this.a = 0;
        this.b = aeulVar.d;
        this.c = 0;
        this.d = aeulVar.c;
        this.e = false;
    }

    @Override // defpackage.aeus
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ aeus trySplit() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.e ? 1 : 65;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        boolean z = this.e;
        aeul aeulVar = this.f;
        if (!z) {
            return aeulVar.g - this.c;
        }
        return Math.min(aeulVar.g - this.c, ((long) ((aeulVar.c() / aeulVar.d) * (this.b - this.a))) + (this.d ? 1L : 0L));
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        aeul aeulVar = this.f;
        Object[] objArr = aeulVar.a;
        if (this.d) {
            this.d = false;
            consumer.accept(objArr[aeulVar.d]);
            this.c++;
        }
        while (true) {
            int i = this.a;
            if (i >= this.b) {
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                consumer.accept(obj);
                this.c++;
            }
            this.a++;
        }
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
    public final boolean tryAdvance(Consumer consumer) {
        if (this.d) {
            this.d = false;
            this.c++;
            aeul aeulVar = this.f;
            consumer.accept(aeulVar.a[aeulVar.d]);
            return true;
        }
        Object[] objArr = this.f.a;
        while (true) {
            int i = this.a;
            if (i >= this.b) {
                return false;
            }
            int i2 = i + 1;
            Object obj = objArr[i];
            if (obj != null) {
                this.c++;
                this.a = i2;
                consumer.accept(obj);
                return true;
            }
            this.a = i2;
        }
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        int i;
        int i2 = this.b;
        int i3 = this.a;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        aeuk aeukVar = new aeuk(this.f, i3, i4, this.d);
        this.a = i4;
        this.d = false;
        this.e = true;
        return aeukVar;
    }

    public aeuk(aeul aeulVar, int i, int i2, boolean z) {
        this.f = aeulVar;
        this.c = 0;
        this.a = i;
        this.b = i2;
        this.d = z;
        this.e = true;
    }
}
