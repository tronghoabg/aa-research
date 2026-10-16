package defpackage;

/* loaded from: classes.dex */
public abstract class xwp implements xxj {
    protected xwp() {
    }

    public static xwp h(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new xwe(charSequence) : new xwj(charSequence.charAt(0), charSequence.charAt(1)) : new xwi(charSequence.charAt(0)) : xwm.a;
    }

    public static String i(char c) {
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
        return String.copyValueOf(cArr);
    }

    @Override // defpackage.xxj
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);

    public xwp c(xwp xwpVar) {
        return new xwn(this, xwpVar);
    }

    public String d(CharSequence charSequence) {
        String string = charSequence.toString();
        int iE = e(string);
        if (iE == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iE] = '.';
        while (true) {
            iE++;
            if (iE >= charArray.length) {
                return new String(charArray);
            }
            if (b(charArray[iE])) {
                charArray[iE] = '.';
            }
        }
    }

    public int e(CharSequence charSequence) {
        return f(charSequence, 0);
    }

    public int f(CharSequence charSequence, int i) {
        int length = charSequence.length();
        woy.aj(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int g(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (b(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public final boolean j(CharSequence charSequence) {
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
