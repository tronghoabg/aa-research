package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class xxv implements defpackage.xyp {
    protected xxv() {
    }

    public static defpackage.xxv h(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return defpackage.xxs.a;
        }
        if (length != 1) {
            return length != 2 ? new defpackage.xxk(charSequence) : new xxp(charSequence.charAt(0), charSequence.charAt(1));
        }
        return new defpackage.xxo(charSequence.charAt(0));
    }

    public static java.lang.String i(char c) {
        char[] cArr = new char[6];
        int i = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return java.lang.String.copyValueOf(cArr);
    }

    @Override // defpackage.xyp
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return b(((java.lang.Character) obj).charValue());
    }

    public abstract boolean b(char c);

    public defpackage.xxv c(defpackage.xxv xxvVar) {
        return new defpackage.xxt(this, xxvVar);
    }

    public java.lang.String d(java.lang.CharSequence charSequence) {
        java.lang.String string = charSequence.toString();
        int iE = e(string);
        if (iE == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iE] = '.';
        while (true) {
            iE++;
            if (iE >= charArray.length) {
                return new java.lang.String(charArray);
            }
            if (b(charArray[iE])) {
                charArray[iE] = '.';
            }
        }
    }

    public int e(java.lang.CharSequence charSequence) {
        return f(charSequence, 0);
    }

    public int f(java.lang.CharSequence charSequence, int i) {
        int length = charSequence.length();
        defpackage.ysr.bt(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int g(java.lang.CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (b(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public final boolean j(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (b(charSequence.charAt(length)));
        return false;
    }
}
