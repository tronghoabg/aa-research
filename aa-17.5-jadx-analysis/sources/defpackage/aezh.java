package defpackage;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
public abstract class aezh extends aezf {
    private boolean a;
    protected int c;

    protected aezh(int i) {
        super(i);
        this.c = -1;
        this.a = false;
    }

    protected abstract int a();

    @Override // defpackage.aezf
    protected final int g() {
        return this.a ? this.c : a();
    }

    @Override // defpackage.aezf, defpackage.aeze
    /* renamed from: hu */
    public final aeze trySplit() {
        int iG = g();
        int i = this.b;
        int iG2 = g();
        int i2 = this.b;
        int i3 = ((iG2 - i2) / 2) + i;
        aeze aezeVarB = null;
        if (i3 != i2 && i3 != iG) {
            if (i3 < i2 || i3 > iG) {
                throw new IndexOutOfBoundsException(a.br(iG, i2, i3, "splitPoint ", " outside of range of current position ", " and range end "));
            }
            aezeVarB = b(i2, i3);
            this.b = i3;
        }
        if (!this.a && aezeVarB != null) {
            this.c = a();
            this.a = true;
        }
        return aezeVarB;
    }

    @Override // defpackage.aezf, defpackage.aexy, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return trySplit();
    }

    @Override // defpackage.aezf, defpackage.aexy, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        return trySplit();
    }

    protected aezh(int i, int i2) {
        super(i);
        this.c = i2;
        this.a = true;
    }
}
