package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aelq extends defpackage.aeln {
    private boolean a;
    protected int c;

    protected aelq(int i) {
        super(i);
        this.c = -1;
        this.a = false;
    }

    protected abstract int b();

    @Override // defpackage.aeln
    protected final int e() {
        return this.a ? this.c : b();
    }

    @Override // defpackage.aeln, defpackage.aelm
    /* JADX INFO: renamed from: gC */
    public final defpackage.aelm trySplit() {
        int iE = e();
        int i = this.b;
        int iE2 = e();
        int i2 = this.b;
        int i3 = ((iE2 - i2) / 2) + i;
        defpackage.aelm aelmVarC = null;
        if (i3 != i2 && i3 != iE) {
            if (i3 < i2 || i3 > iE) {
                throw new java.lang.IndexOutOfBoundsException(defpackage.a.bq(iE, i2, i3, "splitPoint ", " outside of range of current position ", " and range end "));
            }
            aelmVarC = c(i2, i3);
            this.b = i3;
        }
        if (!this.a && aelmVarC != null) {
            this.c = b();
            this.a = true;
        }
        return aelmVarC;
    }

    @Override // defpackage.aeln, defpackage.aeht, j$.util.Spliterator.OfInt, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfInt trySplit() {
        return trySplit();
    }

    @Override // defpackage.aeln, defpackage.aeht, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfPrimitive trySplit() {
        return trySplit();
    }

    @Override // defpackage.aeln, defpackage.aeht, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator trySplit() {
        return trySplit();
    }

    protected aelq(int i, int i2) {
        super(i);
        this.c = i2;
        this.a = true;
    }
}
