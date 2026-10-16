package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class akfh {
    public final akcd a;
    public final Locale b;
    public akcl c;
    public Integer d;
    public akff[] e;
    public int f;
    public boolean g;
    private final akcl h;
    private Object i;

    public akfh(akcd akcdVar) {
        akcd akcdVarB = akci.b(akcdVar);
        akcl akclVarZ = akcdVarB.z();
        this.h = akclVarZ;
        this.a = akcdVarB.a();
        this.b = Locale.getDefault();
        this.c = akclVarZ;
        this.e = new akff[8];
    }

    static int a(akcm akcmVar, akcm akcmVar2) {
        if (akcmVar == null || !akcmVar.f()) {
            return (akcmVar2 == null || !akcmVar2.f()) ? 0 : -1;
        }
        if (akcmVar2 == null || !akcmVar2.f()) {
            return 1;
        }
        return -akcmVar.compareTo(akcmVar2);
    }

    public final Object b() {
        if (this.i == null) {
            this.i = new akfg(this);
        }
        return this.i;
    }

    public final akff c() {
        akff[] akffVarArr = this.e;
        int i = this.f;
        int length = akffVarArr.length;
        if (i == length || this.g) {
            if (i == length) {
                length = i + i;
            }
            akff[] akffVarArr2 = new akff[length];
            System.arraycopy(akffVarArr, 0, akffVarArr2, 0, i);
            this.e = akffVarArr2;
            this.g = false;
            akffVarArr = akffVarArr2;
        }
        this.i = null;
        akff akffVar = akffVarArr[i];
        if (akffVar == null) {
            akffVar = new akff();
            akffVarArr[i] = akffVar;
        }
        this.f = i + 1;
        return akffVar;
    }

    public final void d(akch akchVar, int i) {
        c().c(akchVar.a(this.a), i);
    }

    public final void e(Integer num) {
        this.i = null;
        this.d = num;
    }

    public final void f(akcl akclVar) {
        this.i = null;
        this.c = akclVar;
    }

    public final long g(CharSequence charSequence) {
        akff[] akffVarArr = this.e;
        int i = this.f;
        if (this.g) {
            akffVarArr = (akff[]) akffVarArr.clone();
            this.e = akffVarArr;
            this.g = false;
        }
        if (i > 10) {
            Arrays.sort(akffVarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (akffVarArr[i4].compareTo(akffVarArr[i3]) > 0) {
                        akff akffVar = akffVarArr[i3];
                        akffVarArr[i3] = akffVarArr[i4];
                        akffVarArr[i4] = akffVar;
                        i3 = i4;
                    }
                }
            }
        }
        long jB = 0;
        if (i > 0) {
            akcd akcdVar = this.a;
            akcm akcmVarA = akco.e.a(akcdVar);
            akcm akcmVarA2 = akco.g.a(akcdVar);
            akcm akcmVarQ = akffVarArr[0].a.q();
            if (a(akcmVarQ, akcmVarA) >= 0 && a(akcmVarQ, akcmVarA2) <= 0) {
                d(akch.f, 2000);
                return g(charSequence);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            try {
                jB = akffVarArr[i5].b(jB, true);
            } catch (akcp e) {
                if (charSequence != null) {
                    String strBq = a.bq((String) charSequence, "Cannot parse \"", "\"");
                    String str = e.a;
                    if (str == null) {
                        e.a = strBq;
                    } else {
                        e.a = a.bJ(str, strBq, ": ");
                    }
                }
                throw e;
            }
        }
        int i6 = 0;
        while (i6 < i) {
            akffVarArr[i6].a.v();
            jB = akffVarArr[i6].b(jB, i6 == i + (-1));
            i6++;
        }
        if (this.d != null) {
            return jB - r0.intValue();
        }
        akcl akclVar = this.c;
        if (akclVar != null) {
            int iB = akclVar.b(jB);
            jB -= iB;
            if (iB != this.c.a(jB)) {
                String strBM = "Illegal instant due to time zone offset transition (" + String.valueOf(this.c) + ")";
                if (charSequence != null) {
                    strBM = a.bM(strBM, (String) charSequence, "Cannot parse \"", "\": ");
                }
                throw new akcq(strBM);
            }
        }
        return jB;
    }

    public final void h(Object obj) {
        if (obj instanceof akfg) {
            akfg akfgVar = (akfg) obj;
            if (this != akfgVar.e) {
                return;
            }
            this.c = akfgVar.a;
            this.d = akfgVar.b;
            this.e = akfgVar.c;
            int i = akfgVar.d;
            if (i < this.f) {
                this.g = true;
            }
            this.f = i;
            this.i = obj;
        }
    }
}
