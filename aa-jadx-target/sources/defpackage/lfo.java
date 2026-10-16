package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lfo {
    public int a;
    public float b;
    public final java.lang.Object c;

    public lfo(int i, java.lang.String str) {
        this.a = i;
        this.b = 0.0f;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2 = 1;
        if (z) {
            defpackage.dgp dgpVar = (defpackage.dgp) this.c;
            int iE = defpackage.dax.e(dgpVar.d, i);
            int iL = dgpVar.l(iE);
            int iJ = dgpVar.j(iE);
            if (i == iL || i == iJ) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        java.lang.Object obj = this.c;
        float fE = z3 ? ((defpackage.dgp) obj).e(i, z) : ((defpackage.dgp) obj).f(i, z);
        if (z2) {
            this.a = i4;
            this.b = fE;
        }
        return fE;
    }

    public lfo(defpackage.dgp dgpVar) {
        this.c = dgpVar;
        this.a = -1;
    }
}
