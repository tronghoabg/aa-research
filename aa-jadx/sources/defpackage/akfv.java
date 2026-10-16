package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class akfv implements defpackage.akgn, defpackage.akgl {
    protected final defpackage.akdh a;
    protected final int b;
    protected final boolean c;

    public akfv(defpackage.akdh akdhVar, int i, boolean z) {
        this.a = akdhVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.akgl
    public final int a() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:62:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x002e A[SYNTHETIC] */
    public int c(defpackage.akgh akghVar, java.lang.CharSequence charSequence, int i) {
        int i2;
        int i3;
        char cCharAt;
        int iMin = java.lang.Math.min(this.b, charSequence.length() - i);
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (i5 < iMin) {
                char cCharAt2 = charSequence.charAt(i + i5);
                if (i5 == 0) {
                    if (cCharAt2 != '-') {
                        if (cCharAt2 == '+') {
                            cCharAt2 = '+';
                            if (this.c) {
                                if (cCharAt2 == '-') {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (cCharAt2 == '+') {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (iMin <= 1) {
                                    break;
                                }
                                break;
                            }
                        }
                        i5 = 0;
                    } else if (this.c) {
                        if (cCharAt2 == '-') {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cCharAt2 == '+') {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (iMin <= 1 || (cCharAt = charSequence.charAt(i + 1)) < '0' || cCharAt > '9') {
                            break;
                        }
                        iMin = java.lang.Math.min(iMin + 1, charSequence.length() - i);
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                    i5++;
                }
            }
            i4 = i5;
            break;
        }
        if (i4 != 0) {
            if (i4 >= 9) {
                i2 = i4 + i;
                i3 = z2 ? java.lang.Integer.parseInt(charSequence.subSequence(i + 1, i2).toString()) : java.lang.Integer.parseInt(charSequence.subSequence(i, i2).toString());
            } else {
                int i6 = (z || z2) ? i + 1 : i;
                try {
                    int iCharAt = charSequence.charAt(i6) - '0';
                    i2 = i4 + i;
                    for (int i7 = i6 + 1; i7 < i2; i7++) {
                        iCharAt = (((iCharAt << 3) + (iCharAt + iCharAt)) + charSequence.charAt(i7)) - 48;
                    }
                    i3 = z ? -iCharAt : iCharAt;
                } catch (java.lang.StringIndexOutOfBoundsException unused) {
                }
            }
            akghVar.d(this.a, i3);
            return i2;
        }
        return ~i;
    }
}
