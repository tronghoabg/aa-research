package defpackage;

import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aeos extends aeqh {
    final /* synthetic */ aeot a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeos(aeot aeotVar) {
        super(aeotVar.b);
        this.a = aeotVar;
    }

    @Override // defpackage.aeqh
    protected final int a() {
        return this.a.c;
    }

    @Override // defpackage.aeqe
    protected final long b(int i) {
        return this.a.d.a[i];
    }

    @Override // defpackage.aeqe
    protected final /* bridge */ /* synthetic */ aeqd c(int i, int i2) {
        return new aeos(this.a, i, i2);
    }

    @Override // defpackage.aeqe, defpackage.aeln, j$.util.Spliterator.OfLong
    public final void forEachRemaining(LongConsumer longConsumer) {
        long[] jArr = this.a.d.a;
        int iE = e();
        while (true) {
            int i = this.b;
            if (i >= iE) {
                return;
            }
            this.b = i + 1;
            longConsumer.accept(jArr[i]);
        }
    }

    @Override // defpackage.aeqe, j$.util.Spliterator.OfLong
    public final boolean tryAdvance(LongConsumer longConsumer) {
        if (this.b >= e()) {
            return false;
        }
        long[] jArr = this.a.d.a;
        int i = this.b;
        this.b = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private aeos(aeot aeotVar, int i, int i2) {
        super(i, i2);
        this.a = aeotVar;
    }

    @Override // defpackage.aeqe, defpackage.aeln, j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }

    @Override // defpackage.aeqe, defpackage.aeln, j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }
}
