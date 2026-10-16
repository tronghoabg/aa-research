package defpackage;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aeiv extends aejt {
    final /* synthetic */ aeix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeiv(aeix aeixVar, int i) {
        super(i);
        this.a = aeixVar;
    }

    @Override // defpackage.aejt, defpackage.aejd
    public final int a() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        aeix aeixVar = this.a;
        int[] iArr = aeixVar.d.a;
        int i = this.b - 1;
        this.b = i;
        this.c = i;
        return iArr[aeixVar.b + i];
    }

    @Override // defpackage.aejs, defpackage.aegk, j$.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(IntConsumer intConsumer) {
        aeix aeixVar = this.a;
        int[] iArr = aeixVar.d.a;
        int i = aeixVar.c;
        int i2 = aeixVar.b;
        int i3 = i - i2;
        while (true) {
            int i4 = this.b;
            if (i4 >= i3) {
                return;
            }
            this.b = i4 + 1;
            this.c = i4;
            intConsumer.accept(iArr[i4 + i2]);
        }
    }

    @Override // defpackage.aejs
    protected final int g(int i) {
        aeix aeixVar = this.a;
        return aeixVar.d.a[aeixVar.b + i];
    }

    @Override // defpackage.aejs
    protected final int h() {
        aeix aeixVar = this.a;
        return aeixVar.c - aeixVar.b;
    }

    @Override // defpackage.aejt
    protected final void i(int i, int i2) {
        this.a.q(i, i2);
    }

    @Override // defpackage.aejs
    protected final void j(int i) {
        this.a.n(i);
    }

    @Override // defpackage.aejt
    protected final void k(int i, int i2) {
        this.a.o(i, i2);
    }

    @Override // defpackage.aejs, defpackage.aejr, j$.util.PrimitiveIterator.OfInt
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        aeix aeixVar = this.a;
        int[] iArr = aeixVar.d.a;
        int i = this.b;
        this.b = i + 1;
        this.c = i;
        return iArr[aeixVar.b + i];
    }

    @Override // defpackage.aejs, defpackage.aegk, j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining2(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }
}
