package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aefr implements aefz {
    int a;
    final int b;
    int c;
    boolean d;
    boolean e;
    final /* synthetic */ aefs f;

    public aefr(aefs aefsVar) {
        this.f = aefsVar;
        this.a = 0;
        this.b = aefsVar.d;
        this.c = 0;
        this.d = aefsVar.c;
        this.e = false;
    }

    @Override // j$.util.Spliterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aefr trySplit() {
        int i;
        int i2 = this.b;
        int i3 = this.a;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        aefr aefrVar = new aefr(this.f, i3, i4, this.d);
        this.a = i4;
        this.d = false;
        this.e = true;
        return aefrVar;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.e ? 257 : 321;
    }

    @Override // defpackage.aefz
    public final /* synthetic */ aefb d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        boolean z = this.e;
        aefs aefsVar = this.f;
        if (!z) {
            return aefsVar.g - this.c;
        }
        return Math.min(aefsVar.g - this.c, ((long) ((aefsVar.l() / aefsVar.d) * (this.b - this.a))) + (this.d ? 1L : 0L));
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        aefs aefsVar = this.f;
        aefj aefjVar = (aefj) obj;
        byte[] bArr = aefsVar.a;
        if (this.d) {
            this.d = false;
            aefjVar.b(bArr[aefsVar.d]);
            this.c++;
        }
        while (true) {
            int i = this.a;
            if (i >= this.b) {
                return;
            }
            byte b = bArr[i];
            if (b != 0) {
                aefjVar.b(b);
                this.c++;
            }
            this.a++;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return adzo.F();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // defpackage.aefz
    /* renamed from: hp */
    public final /* bridge */ /* synthetic */ aefz trySplit() {
        throw null;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        aefj aefjVar = (aefj) obj;
        if (this.d) {
            this.d = false;
            this.c++;
            aefs aefsVar = this.f;
            aefjVar.b(aefsVar.a[aefsVar.d]);
            return true;
        }
        byte[] bArr = this.f.a;
        while (true) {
            int i = this.a;
            if (i >= this.b) {
                return false;
            }
            int i2 = i + 1;
            byte b = bArr[i];
            if (b != 0) {
                this.c++;
                this.a = i2;
                aefjVar.b(b);
                return true;
            }
            this.a = i2;
        }
    }

    public aefr(aefs aefsVar, int i, int i2, boolean z) {
        this.f = aefsVar;
        this.c = 0;
        this.a = i;
        this.b = i2;
        this.d = z;
        this.e = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adzo.D(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return adzo.E(this, consumer);
    }
}
