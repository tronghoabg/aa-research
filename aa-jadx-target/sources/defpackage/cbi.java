package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cbi extends defpackage.dai {
    public defpackage.cbd[] a;
    public int b;
    public int[] c;
    public int d;
    public java.lang.Object[] e;
    public int f;

    public cbi() {
        super(null);
        this.a = new defpackage.cbd[16];
        this.c = new int[16];
        this.e = new java.lang.Object[16];
    }

    private static final int f(int i, int i2) {
        int i3 = i + (i <= 1024 ? i : 1024);
        return i3 < i2 ? i2 : i3;
    }

    public final void a() {
        this.b = 0;
        this.d = 0;
        java.lang.Object[] objArr = this.e;
        int i = this.f;
        objArr.getClass();
        java.util.Arrays.fill(objArr, 0, i, (java.lang.Object) null);
        this.f = 0;
    }

    public final void b(defpackage.cbd cbdVar) {
        int i = this.b;
        defpackage.cbd[] cbdVarArr = this.a;
        if (i == cbdVarArr.length) {
            defpackage.cbd[] cbdVarArr2 = new defpackage.cbd[(i <= 1024 ? i : 1024) + i];
            java.lang.System.arraycopy(cbdVarArr, 0, cbdVarArr2, 0, i);
            this.a = cbdVarArr2;
        }
        int i2 = this.d;
        int i3 = cbdVar.b;
        int i4 = i2 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i4 > length) {
            int[] iArr2 = new int[f(length, i4)];
            iArr.getClass();
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, length);
            this.c = iArr2;
        }
        int i5 = this.f;
        int i6 = cbdVar.c;
        int i7 = i5 + i6;
        java.lang.Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i7 > length2) {
            java.lang.Object[] objArr2 = new java.lang.Object[f(length2, i7)];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        defpackage.cbd[] cbdVarArr3 = this.a;
        int i8 = this.b;
        this.b = i8 + 1;
        cbdVarArr3[i8] = cbdVar;
        this.d += i3;
        this.f += i6;
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final boolean d() {
        return this.b != 0;
    }

    public final void e(defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        if (d()) {
            defpackage.cbg cbgVar = new defpackage.cbg(this);
            while (true) {
                defpackage.cbd cbdVarB = cbgVar.b();
                defpackage.bzh bzhVarB = cbdVarB.b(cbgVar);
                defpackage.buq buqVar2 = buqVar;
                defpackage.bzp bzpVar2 = bzpVar;
                defpackage.cdg cdgVar2 = cdgVar;
                defpackage.cbe cbeVar2 = cbeVar;
                try {
                    cbdVarB.a(cbgVar, buqVar2, bzpVar2, cdgVar2, cbeVar2);
                    int i = cbgVar.a;
                    defpackage.cbi cbiVar = cbgVar.d;
                    if (i < cbiVar.b) {
                        defpackage.cbd cbdVarB2 = cbgVar.b();
                        cbgVar.b += cbdVarB2.b;
                        cbgVar.c += cbdVarB2.c;
                        int i2 = cbgVar.a + 1;
                        cbgVar.a = i2;
                        if (i2 >= cbiVar.b) {
                            break;
                        }
                        buqVar = buqVar2;
                        bzpVar = bzpVar2;
                        cdgVar = cdgVar2;
                        cbeVar = cbeVar2;
                    } else {
                        break;
                    }
                } catch (java.lang.Throwable th) {
                    if (cbeVar2 == null) {
                        throw th;
                    }
                    defpackage.vm.a(th, new defpackage.ah(bzhVarB, bzpVar2, cbeVar2, 2));
                    throw th;
                }
            }
        }
        a();
    }
}
