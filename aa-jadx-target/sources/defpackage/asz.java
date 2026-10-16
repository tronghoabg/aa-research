package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class asz implements defpackage.atb {
    private final /* synthetic */ int a;

    public asz(int i) {
        this.a = i;
    }

    @Override // defpackage.atb
    public final /* synthetic */ float a() {
        return 0.0f;
    }

    @Override // defpackage.atb
    public final void b(defpackage.dlo dloVar, int i, int[] iArr, defpackage.dlz dlzVar, int[] iArr2) {
        int i2 = this.a;
        if (i2 == 0) {
            defpackage.ati.c(i, iArr, iArr2, false);
            return;
        }
        if (i2 == 1) {
            defpackage.ati.b(iArr, iArr2, false);
            return;
        }
        if (i2 != 2) {
            if (dlzVar == defpackage.dlz.a) {
                defpackage.ati.b(iArr, iArr2, false);
                return;
            } else {
                defpackage.ati.c(i, iArr, iArr2, true);
                return;
            }
        }
        if (dlzVar == defpackage.dlz.a) {
            defpackage.ati.c(i, iArr, iArr2, false);
        } else {
            defpackage.ati.b(iArr, iArr2, true);
        }
    }

    public final java.lang.String toString() {
        int i = this.a;
        if (i == 0) {
            return "AbsoluteArrangement#Right";
        }
        if (i != 1) {
            return i != 2 ? "Arrangement#Start" : "Arrangement#End";
        }
        return "AbsoluteArrangement#Left";
    }
}
