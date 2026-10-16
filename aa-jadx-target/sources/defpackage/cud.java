package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cud implements defpackage.ctx {
    private final defpackage.csy a;
    private final int b;
    private final int c;
    private final /* synthetic */ int d;

    public cud(defpackage.csy csyVar, int i, int i2, int i3) {
        this.d = i3;
        this.a = csyVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.csy
    public final int c(int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return this.a.c(i);
        }
        defpackage.csy csyVar = this.a;
        return i2 != 1 ? csyVar.c(i) : csyVar.c(i);
    }

    @Override // defpackage.csy
    public final int d(int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return this.a.d(i);
        }
        defpackage.csy csyVar = this.a;
        return i2 != 1 ? csyVar.d(i) : csyVar.d(i);
    }

    @Override // defpackage.csy
    public final int e(int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return this.a.e(i);
        }
        defpackage.csy csyVar = this.a;
        return i2 != 1 ? csyVar.e(i) : csyVar.e(i);
    }

    @Override // defpackage.csy
    public final int f(int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return this.a.f(i);
        }
        defpackage.csy csyVar = this.a;
        return i2 != 1 ? csyVar.f(i) : csyVar.f(i);
    }

    @Override // defpackage.csy
    public final java.lang.Object g() {
        int i = this.d;
        if (i == 0) {
            return this.a.g();
        }
        defpackage.csy csyVar = this.a;
        return i != 1 ? csyVar.g() : csyVar.g();
    }

    @Override // defpackage.ctx
    public final defpackage.cux v(long j) {
        int i = this.d;
        if (i == 0) {
            int i2 = this.c;
            int i3 = this.b;
            if (i2 == 1) {
                defpackage.csy csyVar = this.a;
                return new defpackage.cue(i3 == 2 ? csyVar.d(defpackage.dlm.a(j)) : csyVar.f(defpackage.dlm.a(j)), defpackage.dlm.g(j) ? defpackage.dlm.a(j) : 32767);
            }
            defpackage.csy csyVar2 = this.a;
            return new defpackage.cue(defpackage.dlm.h(j) ? defpackage.dlm.b(j) : 32767, i3 == 2 ? csyVar2.c(defpackage.dlm.b(j)) : csyVar2.e(defpackage.dlm.b(j)));
        }
        int i4 = this.c;
        if (i != 1) {
            int i5 = this.b;
            if (i4 == 1) {
                defpackage.csy csyVar3 = this.a;
                return new defpackage.cyn(i5 == 2 ? csyVar3.d(defpackage.dlm.a(j)) : csyVar3.f(defpackage.dlm.a(j)), defpackage.dlm.g(j) ? defpackage.dlm.a(j) : 32767);
            }
            defpackage.csy csyVar4 = this.a;
            return new defpackage.cyn(defpackage.dlm.h(j) ? defpackage.dlm.b(j) : 32767, i5 == 2 ? csyVar4.c(defpackage.dlm.b(j)) : csyVar4.e(defpackage.dlm.b(j)));
        }
        int i6 = this.b;
        if (i4 == 1) {
            defpackage.csy csyVar5 = this.a;
            return new defpackage.cst(i6 == 2 ? csyVar5.d(defpackage.dlm.a(j)) : csyVar5.f(defpackage.dlm.a(j)), defpackage.dlm.g(j) ? defpackage.dlm.a(j) : 32767);
        }
        defpackage.csy csyVar6 = this.a;
        return new defpackage.cst(defpackage.dlm.h(j) ? defpackage.dlm.b(j) : 32767, i6 == 2 ? csyVar6.c(defpackage.dlm.b(j)) : csyVar6.e(defpackage.dlm.b(j)));
    }
}
