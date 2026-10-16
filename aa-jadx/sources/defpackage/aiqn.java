package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aiqn {
    public static final java.lang.String a(defpackage.ajob ajobVar, defpackage.ajob[] ajobVarArr, int i) {
        int i2;
        int i3;
        int i4;
        int iC = ajobVar.c();
        int i5 = 0;
        while (i5 < iC) {
            int i6 = (i5 + iC) / 2;
            while (i6 >= 0 && ajobVar.a(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (ajobVar.a(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z) {
                    i3 = 46;
                } else {
                    byte bA = ajobVarArr[i10].a(i11);
                    int i13 = defpackage.ajjq.a;
                    i3 = bA & 255;
                }
                byte bA2 = ajobVar.a(i7 + i12);
                int i14 = defpackage.ajjq.a;
                i4 = i3 - (bA2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 != i9) {
                    if (ajobVarArr[i10].c() != i11) {
                        z = false;
                    } else if (i10 != ajobVarArr.length - 1) {
                        i10++;
                        z = true;
                        i11 = -1;
                    }
                }
                i4 = 0;
                break;
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i15 = i9 - i12;
                    int iC2 = ajobVarArr[i10].c() - i11;
                    int length = ajobVarArr.length;
                    for (int i16 = i10 + 1; i16 < length; i16++) {
                        iC2 += ajobVarArr[i16].c();
                    }
                    if (iC2 >= i15) {
                        if (iC2 <= i15) {
                            return ajobVar.j(i7, i9 + i7).h(defpackage.aitd.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iC = i6;
        }
        return null;
    }
}
