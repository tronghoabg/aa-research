package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ana {
    public final defpackage.bys b;
    public final defpackage.bwx c;
    public final defpackage.amz d;
    public final defpackage.byh e;
    public final defpackage.byh f;
    private final defpackage.bwx h;
    private final defpackage.bwx i;
    private final defpackage.bys j;
    private final defpackage.bwx k;
    public final defpackage.affc a = new defpackage.ajg(11);
    public final defpackage.bil g = new defpackage.bil((byte[]) null, (char[]) null);

    public ana(java.lang.Object obj) {
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, bxvVar);
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, bxvVar);
        defpackage.aln alnVar = new defpackage.aln(this, 3);
        defpackage.lam lamVar = defpackage.byp.a;
        this.j = new defpackage.bvr(alnVar, null);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(Float.NaN);
        this.b = new defpackage.bvr(new defpackage.aln(this, 4), bxvVar);
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        this.k = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, bxvVar);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.ank(defpackage.afce.a, new float[0]), bxvVar);
        this.d = new defpackage.amz(this);
    }

    public final float a() {
        return this.f.e();
    }

    public final float b() {
        return this.e.e();
    }

    public final float c(float f) {
        float fMin;
        float fB = (java.lang.Float.isNaN(b()) ? 0.0f : b()) + f;
        float[] fArr = n().a;
        float fMax = Float.NaN;
        int i = 1;
        if (fArr.length != 0) {
            fMin = fArr[0];
            int iBE = defpackage.afga.bE(fArr);
            if (iBE > 0) {
                int i2 = 1;
                while (true) {
                    fMin = java.lang.Math.min(fMin, fArr[i2]);
                    if (i2 == iBE) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            fMin = Float.NaN;
        }
        float[] fArr2 = n().a;
        if (fArr2.length != 0) {
            fMax = fArr2[0];
            int iBE2 = defpackage.afga.bE(fArr2);
            if (iBE2 > 0) {
                while (true) {
                    fMax = java.lang.Math.max(fMax, fArr2[i]);
                    if (i == iBE2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return defpackage.afqt.d(fB, fMin, fMax);
    }

    public final float d() {
        if (java.lang.Float.isNaN(b())) {
            defpackage.asq.d("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return b();
    }

    public final java.lang.Object e(defpackage.akv akvVar, defpackage.affh affhVar, defpackage.afdk afdkVar) {
        java.lang.Object objR = this.g.r(akvVar, new defpackage.bgj(this, affhVar, (defpackage.afdk) null, 1), afdkVar);
        return objR == defpackage.afdr.a ? objR : defpackage.afbk.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(java.lang.Object obj, defpackage.akv akvVar, defpackage.affi affiVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.amw amwVar;
        if (afdkVar instanceof defpackage.amw) {
            amwVar = (defpackage.amw) afdkVar;
            int i = amwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                amwVar.c = i - Integer.MIN_VALUE;
            } else {
                amwVar = new defpackage.amw(this, afdkVar);
            }
        } else {
            amwVar = new defpackage.amw(this, afdkVar);
        }
        java.lang.Object obj2 = amwVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = amwVar.c;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(obj2);
                if (n().d(obj)) {
                    defpackage.bil bilVar = this.g;
                    defpackage.amy amyVar = new defpackage.amy(this, obj, affiVar, null);
                    amwVar.c = 1;
                    if (bilVar.r(akvVar, amyVar, amwVar) == afdrVar) {
                        return afdrVar;
                    }
                } else {
                    java.lang.Boolean.TRUE.booleanValue();
                    m(obj);
                    k(obj);
                }
                return defpackage.afbk.a;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj2);
            l(null);
            return defpackage.afbk.a;
        } catch (java.lang.Throwable th) {
            l(null);
            throw th;
        }
    }

    public final java.lang.Object g() {
        return this.h.a();
    }

    public final java.lang.Object h() {
        return this.k.a();
    }

    public final java.lang.Object i() {
        return this.i.a();
    }

    public final java.lang.Object j() {
        return this.j.a();
    }

    public final void k(java.lang.Object obj) {
        this.h.b(obj);
    }

    public final void l(java.lang.Object obj) {
        this.k.b(obj);
    }

    public final void m(java.lang.Object obj) {
        this.i.b(obj);
    }

    public final defpackage.ank n() {
        return (defpackage.ank) this.c.a();
    }
}
