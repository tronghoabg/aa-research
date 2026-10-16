package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class aees extends aefn {
    final /* synthetic */ aeeu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aees(aeeu aeeuVar, int i) {
        super(i);
        this.a = aeeuVar;
    }

    @Override // defpackage.aefm, defpackage.aeeh, defpackage.aefl
    /* renamed from: b */
    public final void forEachRemaining(aefj aefjVar) {
        aeeu aeeuVar = this.a;
        byte[] bArr = aeeuVar.d.a;
        int i = aeeuVar.c;
        int i2 = aeeuVar.b;
        int i3 = i - i2;
        while (true) {
            int i4 = this.b;
            if (i4 >= i3) {
                return;
            }
            this.b = i4 + 1;
            this.c = i4;
            aefjVar.b(bArr[i4 + i2]);
        }
    }

    @Override // defpackage.aefm, defpackage.aefl
    public final byte c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        aeeu aeeuVar = this.a;
        byte[] bArr = aeeuVar.d.a;
        int i = this.b;
        this.b = i + 1;
        this.c = i;
        return bArr[aeeuVar.b + i];
    }

    @Override // defpackage.aefn, defpackage.aeex
    public final byte d() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        aeeu aeeuVar = this.a;
        byte[] bArr = aeeuVar.d.a;
        int i = this.b - 1;
        this.b = i;
        this.c = i;
        return bArr[aeeuVar.b + i];
    }

    @Override // defpackage.aefm, defpackage.aeeh, j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((aefj) obj);
    }

    @Override // defpackage.aefm
    protected final byte j(int i) {
        aeeu aeeuVar = this.a;
        return aeeuVar.d.a[aeeuVar.b + i];
    }

    @Override // defpackage.aefm
    protected final int k() {
        aeeu aeeuVar = this.a;
        return aeeuVar.c - aeeuVar.b;
    }

    @Override // defpackage.aefn
    protected final void l(int i, byte b) {
        this.a.p(i, b);
    }

    @Override // defpackage.aefm
    protected final void m(int i) {
        this.a.m(i);
    }

    @Override // defpackage.aefn
    protected final void n(int i, byte b) {
        this.a.n(i, b);
    }
}
