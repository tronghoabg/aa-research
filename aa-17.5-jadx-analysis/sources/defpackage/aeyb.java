package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class aeyb extends aeyw {
    final /* synthetic */ aeyd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeyb(aeyd aeydVar, int i) {
        super(i);
        this.a = aeydVar;
    }

    @Override // defpackage.aeyv, defpackage.aexr, defpackage.aeyu
    /* renamed from: b */
    public final void forEachRemaining(aeys aeysVar) {
        aeyd aeydVar = this.a;
        short[] sArr = aeydVar.d.a;
        int i = aeydVar.c;
        int i2 = aeydVar.b;
        int i3 = i - i2;
        while (true) {
            int i4 = this.b;
            if (i4 >= i3) {
                return;
            }
            this.b = i4 + 1;
            this.c = i4;
            aeysVar.c(sArr[i4 + i2]);
        }
    }

    @Override // defpackage.aeyv, defpackage.aeyu
    public final short d() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        aeyd aeydVar = this.a;
        short[] sArr = aeydVar.d.a;
        int i = this.b;
        this.b = i + 1;
        this.c = i;
        return sArr[aeydVar.b + i];
    }

    @Override // defpackage.aeyw, defpackage.aeyg
    public final short e() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        aeyd aeydVar = this.a;
        short[] sArr = aeydVar.d.a;
        int i = this.b - 1;
        this.b = i;
        this.c = i;
        return sArr[aeydVar.b + i];
    }

    @Override // defpackage.aeyv, defpackage.aexr, j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((aeys) obj);
    }

    @Override // defpackage.aeyv
    protected final int j() {
        aeyd aeydVar = this.a;
        return aeydVar.c - aeydVar.b;
    }

    @Override // defpackage.aeyv
    protected final short k(int i) {
        aeyd aeydVar = this.a;
        return aeydVar.d.a[aeydVar.b + i];
    }

    @Override // defpackage.aeyw
    protected final void l(int i, short s) {
        this.a.o(i, s);
    }

    @Override // defpackage.aeyv
    protected final void m(int i) {
        this.a.m(i);
    }

    @Override // defpackage.aeyw
    protected final void n(int i, short s) {
        this.a.n(i, s);
    }
}
