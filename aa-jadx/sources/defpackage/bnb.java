package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class bnb implements defpackage.atb {
    private final float a;
    private final float b;
    private final float c;

    public bnb(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = (f + f2) / 2.0f;
    }

    @Override // defpackage.atb
    public final float a() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    @Override // defpackage.atb
    public final void b(defpackage.dlo dloVar, int i, int[] iArr, defpackage.dlz dlzVar, int[] iArr2) {
        int i2;
        int length = iArr.length;
        if (length == 0) {
            return;
        }
        int iDN = dloVar.dN(this.a);
        int iDN2 = dloVar.dN(this.b);
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            int i6 = i4 + 1;
            if (i4 == 0) {
                i2 = 0;
            } else if (i4 == 1) {
                int i7 = iArr[0];
                i2 = i7 + (i7 > 0 ? iDN : iDN2);
            } else if (i4 != 2) {
                i2 = 0;
            } else {
                i2 = i - i5;
            }
            if (dlzVar != defpackage.dlz.a) {
                i2 = (i - i2) - i5;
            }
            iArr2[i4] = i2;
            i3++;
            i4 = i6;
        }
    }
}
