package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aerh extends defpackage.aere {
    private boolean a;
    protected int c;

    protected aerh(int i) {
        super(i);
        this.c = -1;
        this.a = false;
    }

    protected abstract int a();

    @Override // defpackage.aere
    protected final int e() {
        return this.a ? this.c : a();
    }

    @Override // defpackage.aere, defpackage.aerd
    /* JADX INFO: renamed from: gE */
    public final defpackage.aerd trySplit() {
        int iE = e();
        int i = this.b;
        int iE2 = e();
        int i2 = this.b;
        int i3 = ((iE2 - i2) / 2) + i;
        defpackage.aerd aerdVarC = null;
        if (i3 != i2 && i3 != iE) {
            if (i3 < i2 || i3 > iE) {
                throw new java.lang.IndexOutOfBoundsException(defpackage.a.bq(iE, i2, i3, "splitPoint ", " outside of range of current position ", " and range end "));
            }
            aerdVarC = c(i2, i3);
            this.b = i3;
        }
        if (!this.a && aerdVarC != null) {
            this.c = a();
            this.a = true;
        }
        return aerdVarC;
    }

    @Override // defpackage.aere, defpackage.aemn, j$.util.Spliterator.OfLong, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfLong trySplit() {
        return trySplit();
    }

    @Override // defpackage.aere, defpackage.aemn, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfPrimitive trySplit() {
        return trySplit();
    }

    @Override // defpackage.aere, defpackage.aemn, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator trySplit() {
        return trySplit();
    }

    protected aerh(int i, int i2) {
        super(i);
        this.c = i2;
        this.a = true;
    }
}
