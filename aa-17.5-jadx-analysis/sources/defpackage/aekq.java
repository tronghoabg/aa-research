package defpackage;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
public abstract class aekq extends aekn {
    private boolean a;
    protected int c;

    protected aekq(int i) {
        super(i);
        this.c = -1;
        this.a = false;
    }

    protected abstract int b();

    @Override // defpackage.aekn
    protected final int e() {
        return this.a ? this.c : b();
    }

    @Override // defpackage.aekn, defpackage.aekm
    /* renamed from: hq */
    public final aekm trySplit() {
        int iE = e();
        int i = this.b;
        int iE2 = e();
        int i2 = this.b;
        int i3 = ((iE2 - i2) / 2) + i;
        aekm aekmVarC = null;
        if (i3 != i2 && i3 != iE) {
            if (i3 < i2 || i3 > iE) {
                throw new IndexOutOfBoundsException(a.br(iE, i2, i3, "splitPoint ", " outside of range of current position ", " and range end "));
            }
            aekmVarC = c(i2, i3);
            this.b = i3;
        }
        if (!this.a && aekmVarC != null) {
            this.c = b();
            this.a = true;
        }
        return aekmVarC;
    }

    @Override // defpackage.aekn, defpackage.aegt, j$.util.Spliterator.OfInt, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return trySplit();
    }

    @Override // defpackage.aekn, defpackage.aegt, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return trySplit();
    }

    @Override // defpackage.aekn, defpackage.aegt, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        return trySplit();
    }

    protected aekq(int i, int i2) {
        super(i);
        this.c = i2;
        this.a = true;
    }
}
