package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class StringJoiner {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public java.lang.String[] d;
    public int e;
    public int f;

    public StringJoiner(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3) {
        j$.util.Objects.a(charSequence2, "The prefix must not be null");
        j$.util.Objects.a(charSequence, "The delimiter must not be null");
        j$.util.Objects.a(charSequence3, "The suffix must not be null");
        this.a = charSequence2.toString();
        this.b = charSequence.toString();
        this.c = charSequence3.toString();
    }

    public static int b(java.lang.String str, char[] cArr, int i) {
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return length;
    }

    public final void a() {
        java.lang.String[] strArr;
        if (this.e > 1) {
            char[] cArr = new char[this.f];
            int iB = b(this.d[0], cArr, 0);
            int i = 1;
            do {
                int iB2 = b(this.b, cArr, iB) + iB;
                iB = b(this.d[i], cArr, iB2) + iB2;
                strArr = this.d;
                strArr[i] = null;
                i++;
            } while (i < this.e);
            this.e = 1;
            strArr[0] = new java.lang.String(cArr);
        }
    }

    public j$.util.StringJoiner add(java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        java.lang.String[] strArr = this.d;
        if (strArr == null) {
            this.d = new java.lang.String[8];
        } else {
            int i = this.e;
            if (i == strArr.length) {
                this.d = (java.lang.String[]) java.util.Arrays.copyOf(strArr, i * 2);
            }
            this.f = this.b.length() + this.f;
        }
        this.f = strValueOf.length() + this.f;
        java.lang.String[] strArr2 = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        strArr2[i2] = strValueOf;
        return this;
    }

    public java.lang.String toString() {
        java.lang.String[] strArr = this.d;
        int i = this.e;
        java.lang.String str = this.a;
        int length = str.length();
        java.lang.String str2 = this.c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            a();
            return i == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f + length2];
        int iB = b(str, cArr, 0);
        if (i > 0) {
            int iB2 = b(strArr[0], cArr, iB) + iB;
            for (int i2 = 1; i2 < i; i2++) {
                int iB3 = b(this.b, cArr, iB2) + iB2;
                iB2 = b(strArr[i2], cArr, iB3) + iB3;
            }
            iB = iB2;
        }
        b(str2, cArr, iB);
        return new java.lang.String(cArr);
    }

    public StringJoiner(java.lang.CharSequence charSequence) {
        this(charSequence, "", "");
    }
}
