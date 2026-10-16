package defpackage;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
public abstract class aegc extends aega {
    private boolean a;
    protected int c;

    protected aegc(int i) {
        super(i);
        this.c = -1;
        this.a = false;
    }

    protected abstract int b();

    @Override // defpackage.aega
    protected final int g() {
        return this.a ? this.c : b();
    }

    @Override // defpackage.aega, defpackage.aefz
    /* renamed from: hp */
    public final aefz trySplit() {
        int iG = g();
        int i = this.b;
        int iG2 = g();
        int i2 = this.b;
        int i3 = ((iG2 - i2) / 2) + i;
        aefz aefzVarC = null;
        if (i3 != i2 && i3 != iG) {
            if (i3 < i2 || i3 > iG) {
                throw new IndexOutOfBoundsException(a.br(iG, i2, i3, "splitPoint ", " outside of range of current position ", " and range end "));
            }
            aefzVarC = c(i2, i3);
            this.b = i3;
        }
        if (!this.a && aefzVarC != null) {
            this.c = b();
            this.a = true;
        }
        return aefzVarC;
    }

    @Override // defpackage.aega, defpackage.aeep, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return trySplit();
    }

    @Override // defpackage.aega, defpackage.aeep, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        return trySplit();
    }

    protected aegc(int i, int i2) {
        super(i);
        this.c = i2;
        this.a = true;
    }
}
