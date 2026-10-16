package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aevw extends defpackage.aevt {
    private boolean a;
    protected int c;

    protected aevw(int i) {
        super(i);
        this.c = -1;
        this.a = false;
    }

    protected abstract int a();

    @Override // defpackage.aevt, defpackage.aevs
    /* JADX INFO: renamed from: b */
    public final defpackage.aevs trySplit() {
        int iE = e();
        int i = this.b;
        int iE2 = e();
        int i2 = this.b;
        int i3 = ((iE2 - i2) / 2) + i;
        defpackage.aevs aevsVarC = null;
        if (i3 != i2 && i3 != iE) {
            if (i3 < i2 || i3 > iE) {
                throw new java.lang.IndexOutOfBoundsException(defpackage.a.bq(iE, i2, i3, "splitPoint ", " outside of range of current position ", " and range end "));
            }
            aevsVarC = c(i2, i3);
            this.b = i3;
        }
        if (!this.a && aevsVarC != null) {
            this.c = a();
            this.a = true;
        }
        return aevsVarC;
    }

    @Override // defpackage.aevt
    protected final int e() {
        return this.a ? this.c : a();
    }

    @Override // defpackage.aevt, defpackage.aery, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator trySplit() {
        return trySplit();
    }

    protected aevw(int i, int i2) {
        super(i);
        this.c = i2;
        this.a = true;
    }
}
