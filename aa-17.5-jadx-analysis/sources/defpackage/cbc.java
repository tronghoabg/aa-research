package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class cbc extends czz {
    public cax[] a;
    public int b;
    public int[] c;
    public int d;
    public Object[] e;
    public int f;

    public cbc() {
        super(null);
        this.a = new cax[16];
        this.c = new int[16];
        this.e = new Object[16];
    }

    private static final int f(int i, int i2) {
        int i3 = i + (i <= 1024 ? i : 1024);
        return i3 < i2 ? i2 : i3;
    }

    public final void a() {
        this.b = 0;
        this.d = 0;
        Object[] objArr = this.e;
        int i = this.f;
        objArr.getClass();
        Arrays.fill(objArr, 0, i, (Object) null);
        this.f = 0;
    }

    public final void b(cax caxVar) {
        int i = this.b;
        cax[] caxVarArr = this.a;
        if (i == caxVarArr.length) {
            cax[] caxVarArr2 = new cax[(i <= 1024 ? i : 1024) + i];
            System.arraycopy(caxVarArr, 0, caxVarArr2, 0, i);
            this.a = caxVarArr2;
        }
        int i2 = this.d;
        int i3 = caxVar.b;
        int i4 = i2 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i4 > length) {
            int[] iArr2 = new int[f(length, i4)];
            iArr.getClass();
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.c = iArr2;
        }
        int i5 = this.f;
        int i6 = caxVar.c;
        int i7 = i5 + i6;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i7 > length2) {
            Object[] objArr2 = new Object[f(length2, i7)];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        cax[] caxVarArr3 = this.a;
        int i8 = this.b;
        this.b = i8 + 1;
        caxVarArr3[i8] = caxVar;
        this.d += i3;
        this.f += i6;
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final boolean d() {
        return this.b != 0;
    }

    public final void e(buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        if (d()) {
            cba cbaVar = new cba(this);
            while (true) {
                cax caxVarB = cbaVar.b();
                bzb bzbVarB = caxVarB.b(cbaVar);
                buj bujVar2 = bujVar;
                bzj bzjVar2 = bzjVar;
                cda cdaVar2 = cdaVar;
                cay cayVar2 = cayVar;
                try {
                    caxVarB.a(cbaVar, bujVar2, bzjVar2, cdaVar2, cayVar2);
                    int i = cbaVar.a;
                    cbc cbcVar = cbaVar.d;
                    if (i < cbcVar.b) {
                        cax caxVarB2 = cbaVar.b();
                        cbaVar.b += caxVarB2.b;
                        cbaVar.c += caxVarB2.c;
                        int i2 = cbaVar.a + 1;
                        cbaVar.a = i2;
                        if (i2 >= cbcVar.b) {
                            break;
                        }
                        bujVar = bujVar2;
                        bzjVar = bzjVar2;
                        cdaVar = cdaVar2;
                        cayVar = cayVar2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        a();
    }
}
