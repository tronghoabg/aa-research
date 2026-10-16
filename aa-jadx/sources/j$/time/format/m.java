package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class m {
    public java.lang.String a;
    public java.lang.String b;
    public final char c;
    public j$.time.format.m d;
    public j$.time.format.m e;

    public m(java.lang.String str, java.lang.String str2, j$.time.format.m mVar) {
        this.a = str;
        this.b = str2;
        this.d = mVar;
        if (str.isEmpty()) {
            this.c = (char) 65535;
        } else {
            this.c = this.a.charAt(0);
        }
    }

    public final boolean a(java.lang.String str, java.lang.String str2) {
        int i = 0;
        while (i < str.length() && i < this.a.length() && b(str.charAt(i), this.a.charAt(i))) {
            i++;
        }
        if (i != this.a.length()) {
            j$.time.format.m mVarD = d(this.a.substring(i), this.b, this.d);
            this.a = str.substring(0, i);
            this.d = mVarD;
            if (i >= str.length()) {
                this.b = str2;
                return true;
            }
            this.d.e = d(str.substring(i), str2, null);
            this.b = null;
            return true;
        }
        if (i >= str.length()) {
            this.b = str2;
            return true;
        }
        java.lang.String strSubstring = str.substring(i);
        for (j$.time.format.m mVar = this.d; mVar != null; mVar = mVar.e) {
            if (b(mVar.c, strSubstring.charAt(0))) {
                return mVar.a(strSubstring, str2);
            }
        }
        j$.time.format.m mVarD2 = d(strSubstring, str2, null);
        mVarD2.e = this.d;
        this.d = mVarD2;
        return true;
    }

    public boolean b(char c, char c2) {
        return c == c2;
    }

    public final java.lang.String c(java.lang.CharSequence charSequence, java.text.ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.a.length() + index;
        j$.time.format.m mVar = this.d;
        if (mVar != null && length2 != length) {
            while (!b(mVar.c, charSequence.charAt(length2))) {
                mVar = mVar.e;
                if (mVar == null) {
                }
            }
            parsePosition.setIndex(length2);
            java.lang.String strC = mVar.c(charSequence, parsePosition);
            if (strC != null) {
                return strC;
            }
        }
        parsePosition.setIndex(length2);
        return this.b;
    }

    public j$.time.format.m d(java.lang.String str, java.lang.String str2, j$.time.format.m mVar) {
        return new j$.time.format.m(str, str2, mVar);
    }

    public boolean e(java.lang.CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof java.lang.String;
        java.lang.String str = this.a;
        if (z) {
            return ((java.lang.String) charSequence).startsWith(str, i);
        }
        int length = str.length();
        if (length <= i2 - i) {
            int i3 = 0;
            while (true) {
                int i4 = length - 1;
                if (length <= 0) {
                    return true;
                }
                int i5 = i3 + 1;
                int i6 = i + 1;
                if (b(this.a.charAt(i3), charSequence.charAt(i))) {
                    i = i6;
                    length = i4;
                    i3 = i5;
                }
            }
        }
        return false;
    }
}
