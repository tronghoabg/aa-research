package defpackage;

import java.util.NoSuchElementException;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aeor extends aepo {
    final /* synthetic */ aeot a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeor(aeot aeotVar, int i) {
        super(i);
        this.a = aeotVar;
    }

    @Override // defpackage.aepo, defpackage.aeoz
    public final long a() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        aeot aeotVar = this.a;
        long[] jArr = aeotVar.d.a;
        int i = this.b - 1;
        this.b = i;
        this.c = i;
        return jArr[aeotVar.b + i];
    }

    @Override // defpackage.aepn, defpackage.aele, j$.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(LongConsumer longConsumer) {
        aeot aeotVar = this.a;
        long[] jArr = aeotVar.d.a;
        int i = aeotVar.c;
        int i2 = aeotVar.b;
        int i3 = i - i2;
        while (true) {
            int i4 = this.b;
            if (i4 >= i3) {
                return;
            }
            this.b = i4 + 1;
            this.c = i4;
            longConsumer.accept(jArr[i4 + i2]);
        }
    }

    @Override // defpackage.aepn
    protected final int g() {
        aeot aeotVar = this.a;
        return aeotVar.c - aeotVar.b;
    }

    @Override // defpackage.aepn
    protected final long h(int i) {
        aeot aeotVar = this.a;
        return aeotVar.d.a[aeotVar.b + i];
    }

    @Override // defpackage.aepo
    protected final void i(int i, long j) {
        this.a.q(i, j);
    }

    @Override // defpackage.aepn
    protected final void j(int i) {
        this.a.n(i);
    }

    @Override // defpackage.aepo
    protected final void k(int i, long j) {
        this.a.o(i, j);
    }

    @Override // defpackage.aepn, defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        aeot aeotVar = this.a;
        long[] jArr = aeotVar.d.a;
        int i = this.b;
        this.b = i + 1;
        this.c = i;
        return jArr[aeotVar.b + i];
    }

    @Override // defpackage.aepn, defpackage.aele, j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining2(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }
}
