package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aehc extends defpackage.aeha {
    private boolean a;
    protected int c;

    protected aehc(int i) {
        super(i);
        this.c = -1;
        this.a = false;
    }

    protected abstract int b();

    @Override // defpackage.aeha
    protected final int g() {
        return this.a ? this.c : b();
    }

    @Override // defpackage.aeha, defpackage.aegz
    /* JADX INFO: renamed from: gB */
    public final defpackage.aegz trySplit() {
        int iG = g();
        int i = this.b;
        int iG2 = g();
        int i2 = this.b;
        int i3 = ((iG2 - i2) / 2) + i;
        defpackage.aegz aegzVarC = null;
        if (i3 != i2 && i3 != iG) {
            if (i3 < i2 || i3 > iG) {
                throw new java.lang.IndexOutOfBoundsException(defpackage.a.bq(iG, i2, i3, "splitPoint ", " outside of range of current position ", " and range end "));
            }
            aegzVarC = c(i2, i3);
            this.b = i3;
        }
        if (!this.a && aegzVarC != null) {
            this.c = b();
            this.a = true;
        }
        return aegzVarC;
    }

    @Override // defpackage.aeha, defpackage.aefp, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfPrimitive trySplit() {
        return trySplit();
    }

    @Override // defpackage.aeha, defpackage.aefp, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator trySplit() {
        return trySplit();
    }

    protected aehc(int i, int i2) {
        super(i);
        this.c = i2;
        this.a = true;
    }
}
