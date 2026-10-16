package defpackage;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aexf extends aeuw {
    final /* synthetic */ aexg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aexf(aexg aexgVar) {
        super(aexgVar.b);
        this.a = aexgVar;
    }

    @Override // defpackage.aeuw
    protected final int a() {
        return this.a.c;
    }

    @Override // defpackage.aeut
    protected final /* bridge */ /* synthetic */ aeus c(int i, int i2) {
        return new aexf(this.a, i, i2);
    }

    @Override // defpackage.aeut
    protected final Object d(int i) {
        return this.a.d.a[i];
    }

    @Override // defpackage.aeut, defpackage.aeqy, j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Object[] objArr = this.a.d.a;
        int iE = e();
        while (true) {
            int i = this.b;
            if (i >= iE) {
                return;
            }
            this.b = i + 1;
            consumer.accept(objArr[i]);
        }
    }

    @Override // defpackage.aeut, j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        if (this.b >= e()) {
            return false;
        }
        Object[] objArr = this.a.d.a;
        int i = this.b;
        this.b = i + 1;
        consumer.accept(objArr[i]);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private aexf(aexg aexgVar, int i, int i2) {
        super(i, i2);
        this.a = aexgVar;
    }
}
