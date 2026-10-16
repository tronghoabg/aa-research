package defpackage;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
public abstract class aeuw extends aeut {
    private boolean a;
    protected int c;

    protected aeuw(int i) {
        super(i);
        this.c = -1;
        this.a = false;
    }

    protected abstract int a();

    @Override // defpackage.aeut, defpackage.aeus
    /* renamed from: b */
    public final aeus trySplit() {
        int iE = e();
        int i = this.b;
        int iE2 = e();
        int i2 = this.b;
        int i3 = ((iE2 - i2) / 2) + i;
        aeus aeusVarC = null;
        if (i3 != i2 && i3 != iE) {
            if (i3 < i2 || i3 > iE) {
                throw new IndexOutOfBoundsException(a.br(iE, i2, i3, "splitPoint ", " outside of range of current position ", " and range end "));
            }
            aeusVarC = c(i2, i3);
            this.b = i3;
        }
        if (!this.a && aeusVarC != null) {
            this.c = a();
            this.a = true;
        }
        return aeusVarC;
    }

    @Override // defpackage.aeut
    protected final int e() {
        return this.a ? this.c : a();
    }

    @Override // defpackage.aeut, defpackage.aeqy, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        return trySplit();
    }

    protected aeuw(int i, int i2) {
        super(i);
        this.c = i2;
        this.a = true;
    }
}
