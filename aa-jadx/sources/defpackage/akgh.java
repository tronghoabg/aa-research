package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akgh {
    public final defpackage.akdd a;
    public final java.util.Locale b;
    public defpackage.akdl c;
    public java.lang.Integer d;
    public defpackage.akgf[] e;
    public int f;
    public boolean g;
    private final defpackage.akdl h;
    private java.lang.Object i;

    public akgh(defpackage.akdd akddVar) {
        defpackage.akdd akddVarB = defpackage.akdi.b(akddVar);
        defpackage.akdl akdlVarZ = akddVarB.z();
        this.h = akdlVarZ;
        this.a = akddVarB.a();
        this.b = java.util.Locale.getDefault();
        this.c = akdlVarZ;
        this.e = new defpackage.akgf[8];
    }

    static int a(defpackage.akdm akdmVar, defpackage.akdm akdmVar2) {
        if (akdmVar == null || !akdmVar.f()) {
            return (akdmVar2 == null || !akdmVar2.f()) ? 0 : -1;
        }
        if (akdmVar2 == null || !akdmVar2.f()) {
            return 1;
        }
        return -akdmVar.compareTo(akdmVar2);
    }

    public final java.lang.Object b() {
        if (this.i == null) {
            this.i = new defpackage.akgg(this);
        }
        return this.i;
    }

    public final defpackage.akgf c() {
        defpackage.akgf[] akgfVarArr = this.e;
        int i = this.f;
        int length = akgfVarArr.length;
        if (i == length || this.g) {
            if (i == length) {
                length = i + i;
            }
            defpackage.akgf[] akgfVarArr2 = new defpackage.akgf[length];
            java.lang.System.arraycopy(akgfVarArr, 0, akgfVarArr2, 0, i);
            this.e = akgfVarArr2;
            this.g = false;
            akgfVarArr = akgfVarArr2;
        }
        this.i = null;
        defpackage.akgf akgfVar = akgfVarArr[i];
        if (akgfVar == null) {
            akgfVar = new defpackage.akgf();
            akgfVarArr[i] = akgfVar;
        }
        this.f = i + 1;
        return akgfVar;
    }

    public final void d(defpackage.akdh akdhVar, int i) {
        c().c(akdhVar.a(this.a), i);
    }

    public final void e(java.lang.Integer num) {
        this.i = null;
        this.d = num;
    }

    public final void f(defpackage.akdl akdlVar) {
        this.i = null;
        this.c = akdlVar;
    }

    public final long g(java.lang.CharSequence charSequence) {
        defpackage.akgf[] akgfVarArr = this.e;
        int i = this.f;
        if (this.g) {
            akgfVarArr = (defpackage.akgf[]) akgfVarArr.clone();
            this.e = akgfVarArr;
            this.g = false;
        }
        if (i > 10) {
            java.util.Arrays.sort(akgfVarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (akgfVarArr[i4].compareTo(akgfVarArr[i3]) <= 0) {
                        break;
                    }
                    defpackage.akgf akgfVar = akgfVarArr[i3];
                    akgfVarArr[i3] = akgfVarArr[i4];
                    akgfVarArr[i4] = akgfVar;
                    i3 = i4;
                }
            }
        }
        long jB = 0;
        if (i > 0) {
            defpackage.akdd akddVar = this.a;
            defpackage.akdm akdmVarA = defpackage.akdo.e.a(akddVar);
            defpackage.akdm akdmVarA2 = defpackage.akdo.g.a(akddVar);
            defpackage.akdm akdmVarQ = akgfVarArr[0].a.q();
            if (a(akdmVarQ, akdmVarA) >= 0 && a(akdmVarQ, akdmVarA2) <= 0) {
                d(defpackage.akdh.f, 2000);
                return g(charSequence);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            try {
                jB = akgfVarArr[i5].b(jB, true);
            } catch (defpackage.akdp e) {
                if (charSequence != null) {
                    java.lang.String strBp = defpackage.a.bp((java.lang.String) charSequence, "Cannot parse \"", "\"");
                    java.lang.String str = e.a;
                    if (str == null) {
                        e.a = strBp;
                    } else {
                        e.a = defpackage.a.bI(str, strBp, ": ");
                    }
                }
                throw e;
            }
        }
        int i6 = 0;
        while (i6 < i) {
            akgfVarArr[i6].a.v();
            jB = akgfVarArr[i6].b(jB, i6 == i + (-1));
            i6++;
        }
        java.lang.Integer num = this.d;
        if (num != null) {
            return jB - ((long) num.intValue());
        }
        defpackage.akdl akdlVar = this.c;
        if (akdlVar != null) {
            int iB = akdlVar.b(jB);
            jB -= (long) iB;
            if (iB != this.c.a(jB)) {
                java.lang.String strBL = "Illegal instant due to time zone offset transition (" + java.lang.String.valueOf(this.c) + ")";
                if (charSequence != null) {
                    strBL = defpackage.a.bL(strBL, (java.lang.String) charSequence, "Cannot parse \"", "\": ");
                }
                throw new defpackage.akdq(strBL);
            }
        }
        return jB;
    }

    public final void h(java.lang.Object obj) {
        if (obj instanceof defpackage.akgg) {
            defpackage.akgg akggVar = (defpackage.akgg) obj;
            if (this != akggVar.e) {
                return;
            }
            this.c = akggVar.a;
            this.d = akggVar.b;
            this.e = akggVar.c;
            int i = akggVar.d;
            if (i < this.f) {
                this.g = true;
            }
            this.f = i;
            this.i = obj;
        }
    }
}
