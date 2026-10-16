package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class atd implements defpackage.atc {
    private final /* synthetic */ int a;

    public atd(int i) {
        this.a = i;
    }

    @Override // defpackage.atb
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.atb
    public final void b(defpackage.dlo dloVar, int i, int[] iArr, defpackage.dlz dlzVar, int[] iArr2) {
        int i2 = this.a;
        if (i2 == 0) {
            if (dlzVar == defpackage.dlz.a) {
                defpackage.ati.d(i, iArr, iArr2, false);
                return;
            } else {
                defpackage.ati.d(i, iArr, iArr2, true);
                return;
            }
        }
        if (i2 == 1) {
            if (dlzVar == defpackage.dlz.a) {
                defpackage.ati.a(i, iArr, iArr2, false);
                return;
            } else {
                defpackage.ati.a(i, iArr, iArr2, true);
                return;
            }
        }
        if (i2 != 2) {
            if (dlzVar == defpackage.dlz.a) {
                defpackage.ati.f(i, iArr, iArr2, false);
                return;
            } else {
                defpackage.ati.f(i, iArr, iArr2, true);
                return;
            }
        }
        if (dlzVar == defpackage.dlz.a) {
            defpackage.ati.e(i, iArr, iArr2, false);
        } else {
            defpackage.ati.e(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.ath
    public final void c(defpackage.dlo dloVar, int i, int[] iArr, int[] iArr2) {
        int i2 = this.a;
        if (i2 == 0) {
            defpackage.ati.d(i, iArr, iArr2, false);
            return;
        }
        if (i2 == 1) {
            defpackage.ati.a(i, iArr, iArr2, false);
        } else if (i2 != 2) {
            defpackage.ati.f(i, iArr, iArr2, false);
        } else {
            defpackage.ati.e(i, iArr, iArr2, false);
        }
    }

    public final java.lang.String toString() {
        int i = this.a;
        if (i == 0) {
            return "Arrangement#SpaceAround";
        }
        if (i != 1) {
            return i != 2 ? "Arrangement#SpaceEvenly" : "Arrangement#SpaceBetween";
        }
        return "Arrangement#Center";
    }
}
