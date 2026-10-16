package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class djw {
    public java.lang.String a;
    public defpackage.djj b;
    public int c = -1;
    public int d = -1;

    public djw(java.lang.String str) {
        this.a = str;
    }

    public final int a() {
        defpackage.djj djjVar = this.b;
        java.lang.String str = this.a;
        return djjVar == null ? str.length() : (str.length() - (this.d - this.c)) + djjVar.b();
    }

    public final void b(int i, int i2, java.lang.String str) {
        if (i > i2) {
            defpackage.dki.c(defpackage.a.bn(i2, i, "start index must be less than or equal to end index: ", " > "));
        }
        if (i < 0) {
            defpackage.dki.c(defpackage.a.bo(i, "start must be non-negative, but was "));
        }
        defpackage.djj djjVar = this.b;
        if (djjVar == null) {
            int iMax = java.lang.Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = java.lang.Math.min(i, 64);
            int iMin2 = java.lang.Math.min(this.a.length() - i2, 64);
            int i3 = i - iMin;
            defpackage.day.n(this.a, cArr, 0, i3, i);
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            defpackage.day.n(this.a, cArr, i4, i2, i5);
            defpackage.day.o(str, cArr, iMin);
            this.b = new defpackage.djj(cArr, iMin + str.length(), i4);
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > djjVar.b()) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            b(i, i2, str);
            return;
        }
        int length = str.length() - (i8 - i7);
        if (length > djjVar.a()) {
            int iA = length - djjVar.a();
            int i9 = djjVar.a;
            do {
                i9 += i9;
            } while (i9 - djjVar.a < iA);
            char[] cArr2 = new char[i9];
            defpackage.afga.ci(djjVar.b, cArr2, 0, 0, djjVar.c);
            int i10 = djjVar.a;
            int i11 = djjVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            defpackage.afga.ci(djjVar.b, cArr2, i13, i11, i12 + i11);
            djjVar.b = cArr2;
            djjVar.a = i9;
            djjVar.d = i13;
        }
        int i14 = djjVar.c;
        if (i7 < i14 && i8 <= i14) {
            char[] cArr3 = djjVar.b;
            int i15 = i14 - i8;
            defpackage.afga.ci(cArr3, cArr3, djjVar.d - i15, i8, i14);
            djjVar.c = i7;
            djjVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = i7 + djjVar.a();
            int iA3 = i8 + djjVar.a();
            int i16 = djjVar.d;
            char[] cArr4 = djjVar.b;
            defpackage.afga.ci(cArr4, cArr4, i14, i16, iA2);
            i7 = djjVar.c + (iA2 - i16);
            djjVar.c = i7;
            djjVar.d = iA3;
        } else {
            djjVar.d = i8 + djjVar.a();
            djjVar.c = i7;
        }
        defpackage.day.o(str, djjVar.b, i7);
        djjVar.c += str.length();
    }

    public final java.lang.String toString() {
        defpackage.djj djjVar = this.b;
        java.lang.String str = this.a;
        if (djjVar == null) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) str, 0, this.c);
        sb.append(djjVar.b, 0, djjVar.c);
        char[] cArr = djjVar.b;
        int i = djjVar.d;
        sb.append(cArr, i, djjVar.a - i);
        java.lang.String str2 = this.a;
        sb.append((java.lang.CharSequence) str2, this.d, str2.length());
        return sb.toString();
    }
}
