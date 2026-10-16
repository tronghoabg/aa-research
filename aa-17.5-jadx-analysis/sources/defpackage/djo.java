package defpackage;

/* loaded from: classes.dex */
public final class djo {
    public String a;
    public djc b;
    public int c = -1;
    public int d = -1;

    public djo(String str) {
        this.a = str;
    }

    public final int a() {
        djc djcVar = this.b;
        String str = this.a;
        return djcVar == null ? str.length() : (str.length() - (this.d - this.c)) + djcVar.b();
    }

    public final void b(int i, int i2, String str) {
        if (i > i2) {
            dka.c(a.bo(i2, i, "start index must be less than or equal to end index: ", " > "));
        }
        if (i < 0) {
            dka.c(a.bp(i, "start must be non-negative, but was "));
        }
        djc djcVar = this.b;
        if (djcVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.a.length() - i2, 64);
            int i3 = i - iMin;
            dap.p(this.a, cArr, 0, i3, i);
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            dap.p(this.a, cArr, i4, i2, i5);
            dap.q(str, cArr, iMin);
            this.b = new djc(cArr, iMin + str.length(), i4);
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > djcVar.b()) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            b(i, i2, str);
            return;
        }
        int length = str.length() - (i8 - i7);
        if (length > djcVar.a()) {
            int iA = length - djcVar.a();
            int i9 = djcVar.a;
            do {
                i9 += i9;
            } while (i9 - djcVar.a < iA);
            char[] cArr2 = new char[i9];
            woy.m421do(djcVar.b, cArr2, 0, 0, djcVar.c);
            int i10 = djcVar.a;
            int i11 = djcVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            woy.m421do(djcVar.b, cArr2, i13, i11, i12 + i11);
            djcVar.b = cArr2;
            djcVar.a = i9;
            djcVar.d = i13;
        }
        int i14 = djcVar.c;
        if (i7 < i14 && i8 <= i14) {
            char[] cArr3 = djcVar.b;
            int i15 = i14 - i8;
            woy.m421do(cArr3, cArr3, djcVar.d - i15, i8, i14);
            djcVar.c = i7;
            djcVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = i7 + djcVar.a();
            int iA3 = i8 + djcVar.a();
            int i16 = djcVar.d;
            char[] cArr4 = djcVar.b;
            woy.m421do(cArr4, cArr4, i14, i16, iA2);
            i7 = djcVar.c + (iA2 - i16);
            djcVar.c = i7;
            djcVar.d = iA3;
        } else {
            djcVar.d = i8 + djcVar.a();
            djcVar.c = i7;
        }
        dap.q(str, djcVar.b, i7);
        djcVar.c += str.length();
    }

    public final String toString() {
        djc djcVar = this.b;
        String str = this.a;
        if (djcVar == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, this.c);
        sb.append(djcVar.b, 0, djcVar.c);
        char[] cArr = djcVar.b;
        int i = djcVar.d;
        sb.append(cArr, i, djcVar.a - i);
        String str2 = this.a;
        sb.append((CharSequence) str2, this.d, str2.length());
        return sb.toString();
    }
}
