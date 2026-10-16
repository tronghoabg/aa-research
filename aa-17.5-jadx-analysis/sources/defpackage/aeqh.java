package defpackage;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
public abstract class aeqh extends aeqe {
    private boolean a;
    protected int c;

    protected aeqh(int i) {
        super(i);
        this.c = -1;
        this.a = false;
    }

    protected abstract int a();

    @Override // defpackage.aeqe
    protected final int e() {
        return this.a ? this.c : a();
    }

    @Override // defpackage.aeqe, defpackage.aeqd
    /* renamed from: hs */
    public final aeqd trySplit() {
        int iE = e();
        int i = this.b;
        int iE2 = e();
        int i2 = this.b;
        int i3 = ((iE2 - i2) / 2) + i;
        aeqd aeqdVarC = null;
        if (i3 != i2 && i3 != iE) {
            if (i3 < i2 || i3 > iE) {
                throw new IndexOutOfBoundsException(a.br(iE, i2, i3, "splitPoint ", " outside of range of current position ", " and range end "));
            }
            aeqdVarC = c(i2, i3);
            this.b = i3;
        }
        if (!this.a && aeqdVarC != null) {
            this.c = a();
            this.a = true;
        }
        return aeqdVarC;
    }

    @Override // defpackage.aeqe, defpackage.aeln, j$.util.Spliterator.OfLong, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return trySplit();
    }

    @Override // defpackage.aeqe, defpackage.aeln, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return trySplit();
    }

    @Override // defpackage.aeqe, defpackage.aeln, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        return trySplit();
    }

    protected aeqh(int i, int i2) {
        super(i);
        this.c = i2;
        this.a = true;
    }
}
