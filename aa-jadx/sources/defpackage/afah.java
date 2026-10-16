package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afah extends defpackage.afaf {
    private boolean a;
    protected int c;

    protected afah(int i) {
        super(i);
        this.c = -1;
        this.a = false;
    }

    protected abstract int a();

    @Override // defpackage.afaf
    protected final int g() {
        return this.a ? this.c : a();
    }

    @Override // defpackage.afaf, defpackage.afae
    /* JADX INFO: renamed from: gG */
    public final defpackage.afae trySplit() {
        int iG = g();
        int i = this.b;
        int iG2 = g();
        int i2 = this.b;
        int i3 = ((iG2 - i2) / 2) + i;
        defpackage.afae afaeVarB = null;
        if (i3 != i2 && i3 != iG) {
            if (i3 < i2 || i3 > iG) {
                throw new java.lang.IndexOutOfBoundsException(defpackage.a.bq(iG, i2, i3, "splitPoint ", " outside of range of current position ", " and range end "));
            }
            afaeVarB = b(i2, i3);
            this.b = i3;
        }
        if (!this.a && afaeVarB != null) {
            this.c = a();
            this.a = true;
        }
        return afaeVarB;
    }

    @Override // defpackage.afaf, defpackage.aeyy, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfPrimitive trySplit() {
        return trySplit();
    }

    @Override // defpackage.afaf, defpackage.aeyy, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator trySplit() {
        return trySplit();
    }

    protected afah(int i, int i2) {
        super(i);
        this.c = i2;
        this.a = true;
    }
}
