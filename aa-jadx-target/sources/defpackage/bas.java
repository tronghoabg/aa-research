package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bas implements defpackage.and {
    private final defpackage.bby a;
    private final defpackage.and b;
    private final defpackage.dlz c;

    public bas(defpackage.bby bbyVar, defpackage.and andVar, defpackage.dlz dlzVar) {
        this.a = bbyVar;
        this.b = andVar;
        this.c = dlzVar;
    }

    private final boolean d(defpackage.bby bbyVar) {
        return this.c == defpackage.dlz.b && bbyVar.w().e == defpackage.apn.b;
    }

    @Override // defpackage.and
    public final float a(float f, float f2, float f3) {
        int iL;
        float f4 = f + f2;
        float fA = this.b.a(f, f2, f3);
        boolean z = true;
        if (f <= 0.0f ? f4 > 1.0f : f4 <= f3) {
            z = false;
        }
        if (java.lang.Math.abs(fA) != 0.0f && z) {
            defpackage.bby bbyVar = this.a;
            float fL = -c(bbyVar);
            while (fA > 0.0f && fL < fA) {
                fL += bbyVar.l();
            }
            while (fA < 0.0f && fL > fA) {
                fL -= bbyVar.l();
            }
            return fL;
        }
        defpackage.bby bbyVar2 = this.a;
        if (java.lang.Math.abs(bbyVar2.g) < 1.0E-6d) {
            return 0.0f;
        }
        float f5 = -c(bbyVar2);
        if (d(bbyVar2)) {
            if (!bbyVar2.u()) {
                iL = bbyVar2.l();
                f5 += iL;
            }
        } else if (bbyVar2.u()) {
            iL = bbyVar2.l();
            f5 += iL;
        }
        return defpackage.afqt.d(f5, -f3, f3);
    }

    @Override // defpackage.and
    public final /* synthetic */ defpackage.aej b() {
        return defpackage.anc.a;
    }

    public final int c(defpackage.bby bbyVar) {
        return d(bbyVar) ? (-bbyVar.g) + bbyVar.l() : bbyVar.g;
    }
}
