package defpackage;

import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aeiw extends aekq {
    final /* synthetic */ aeix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeiw(aeix aeixVar) {
        super(aeixVar.b);
        this.a = aeixVar;
    }

    @Override // defpackage.aekn
    protected final int a(int i) {
        return this.a.d.a[i];
    }

    @Override // defpackage.aekq
    protected final int b() {
        return this.a.c;
    }

    @Override // defpackage.aekn
    protected final /* bridge */ /* synthetic */ aekm c(int i, int i2) {
        return new aeiw(this.a, i, i2);
    }

    @Override // defpackage.aekn, defpackage.aegt, j$.util.Spliterator.OfInt
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.a.d.a;
        int iE = e();
        while (true) {
            int i = this.b;
            if (i >= iE) {
                return;
            }
            this.b = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }

    @Override // defpackage.aekn, j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.b >= e()) {
            return false;
        }
        int[] iArr = this.a.d.a;
        int i = this.b;
        this.b = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private aeiw(aeix aeixVar, int i, int i2) {
        super(i, i2);
        this.a = aeixVar;
    }

    @Override // defpackage.aekn, defpackage.aegt, j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // defpackage.aekn, defpackage.aegt, j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }
}
